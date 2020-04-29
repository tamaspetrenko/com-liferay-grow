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

package com.grow.favourites.service;

import aQute.bnd.annotation.ProviderType;

import com.grow.favourites.model.Favourite;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Collection;
import java.util.List;

/**
 * Provides the local service interface for Favourite. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author NorbertNemeth
 * @see FavouriteLocalServiceUtil
 * @see com.grow.favourites.service.base.FavouriteLocalServiceBaseImpl
 * @see com.grow.favourites.service.impl.FavouriteLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface FavouriteLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FavouriteLocalServiceUtil} to access the favourite local service. Add custom service methods to {@link com.grow.favourites.service.impl.FavouriteLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the favourite to the database. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Favourite addFavourite(Favourite favourite);

	public Favourite addFavourite(long groupId, long assetEntryId, long userId)
		throws PortalException;

	/**
	* Creates a new favourite with the primary key. Does not add the favourite to the database.
	*
	* @param favouriteId the primary key for the new favourite
	* @return the new favourite
	*/
	@Transactional(enabled = false)
	public Favourite createFavourite(long favouriteId);

	/**
	* Deletes the favourite from the database. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public Favourite deleteFavourite(Favourite favourite);

	/**
	* Deletes the favourite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite that was removed
	* @throws PortalException if a favourite with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public Favourite deleteFavourite(long favouriteId)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.grow.favourites.model.impl.FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.grow.favourites.model.impl.FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite fetchFavourite(long favouriteId);

	/**
	* Returns the favourite matching the UUID and group.
	*
	* @param uuid the favourite's UUID
	* @param groupId the primary key of the group
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite fetchFavouriteByUuidAndGroupId(String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the favourite with the primary key.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite
	* @throws PortalException if a favourite with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite getFavourite(long favouriteId) throws PortalException;

	/**
	* Returns the favourite matching the UUID and group.
	*
	* @param uuid the favourite's UUID
	* @param groupId the primary key of the group
	* @return the matching favourite
	* @throws PortalException if a matching favourite could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite getFavouriteByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the favourites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.grow.favourites.model.impl.FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of favourites
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Favourite> getFavourites(int start, int end);

	/**
	* Returns all the favourites matching the UUID and company.
	*
	* @param uuid the UUID of the favourites
	* @param companyId the primary key of the company
	* @return the matching favourites, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Favourite> getFavouritesByUuidAndCompanyId(String uuid,
		long companyId);

	/**
	* Returns a range of favourites matching the UUID and company.
	*
	* @param uuid the UUID of the favourites
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching favourites, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Favourite> getFavouritesByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the number of favourites.
	*
	* @return the number of favourites
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getFavouritesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite getLeastFavourites(long groupId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Favourite getMostFavourites(long groupId) throws PortalException;

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Collection<Favourite> getUserFavourites(long groupId, long userId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<User> getUsers(long assetEntryId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean isFavourite(long groupId, long userId, long assetEntryId);

	public void removeFavourite(long favouriteId) throws PortalException;

	public void removeFavourite(long groupId, long assetEntryId, long userId)
		throws PortalException;

	/**
	* Updates the favourite in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public Favourite updateFavourite(Favourite favourite);
}