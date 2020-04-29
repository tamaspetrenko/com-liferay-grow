/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.grow.favourites.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ArrayList;
import com.grow.favourites.model.Favourite;
import com.grow.favourites.service.persistence.FavouritePersistence;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;

import com.liferay.portal.kernel.model.User;
import com.grow.favourites.service.FavouriteLocalService;
import com.grow.favourites.service.base.FavouriteLocalServiceBaseImpl;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

/**
 * The implementation of the favourite local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.grow.favourites.service.FavouriteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author NorbertNemeth
 * @see FavouriteLocalServiceBaseImpl
 * @see com.grow.favourites.service.FavouriteLocalServiceUtil
 */
@Component(service=FavouriteLocalService.class)
public class FavouriteLocalServiceImpl extends FavouriteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.grow.favourites.service.FavouriteLocalServiceUtil} to access the favourite local service.
	 */
	public Favourite addFavourite(
        long groupId, long assetEntryId, long userId)
    throws PortalException {

		long id = counterLocalService.increment();

		User user = userLocalService.getUser(userId);
	
		Favourite favourite = favouritePersistence.create(id);
	
		favourite.setGroupId(groupId);
		favourite.setCompanyId(user.getCompanyId());
		favourite.setUserId(userId);
		favourite.setAddedDate(new Date());
		favourite.setAssetEntryId(assetEntryId);
	
		favouritePersistence.update(favourite);

		return favourite;
	}

	public void removeFavourite(
        long groupId, long assetEntryId, long userId)
    throws PortalException {

	   Favourite favourite = favouritePersistence.findByG_A_U(groupId, assetEntryId, userId);

	   favouritePersistence.remove(favourite);
	}

	public void removeFavourite(
        long favouriteId)
    throws PortalException {

	   Favourite favourite = favouritePersistence.findByPrimaryKey(favouriteId);

	   favouritePersistence.remove(favourite);
	}

	public Collection<Favourite> getUserFavourites(
        long groupId, long userId)
    throws PortalException {

	   User user = userLocalService.getUserById(userId);

	   Collection<Favourite> favourites = favouritePersistence.findByG_U(groupId, userId);

	   return favourites;
	}

	public List<User> getUsers(
        long assetEntryId)
    throws PortalException {

	   List<Favourite> favourites = favouritePersistence.findByA(assetEntryId);

	   List<User> users = new ArrayList<User>(favourites.size());

	   for (Favourite favourite : favourites) {
		   users.add(userLocalService.getUserById(favourite.getUserId()));
	   }

	   return users;
	}

	public Favourite getMostFavourites(
        long groupId)
    throws PortalException {
	   //TODO
	   return null;
	}

	public Favourite getLeastFavourites(
        long groupId)
    throws PortalException {
	   //TODO
	   return null;
	}

	public boolean isFavourite(long groupId, long userId, long assetEntryId) {
		return favouritePersistence.fetchByG_A_U(groupId, assetEntryId, userId) != null;
	}
	
}