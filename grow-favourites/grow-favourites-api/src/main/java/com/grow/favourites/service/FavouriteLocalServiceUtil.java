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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Favourite. This utility wraps
 * {@link com.grow.favourites.service.impl.FavouriteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author NorbertNemeth
 * @see FavouriteLocalService
 * @see com.grow.favourites.service.base.FavouriteLocalServiceBaseImpl
 * @see com.grow.favourites.service.impl.FavouriteLocalServiceImpl
 * @generated
 */
@ProviderType
public class FavouriteLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.grow.favourites.service.impl.FavouriteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the favourite to the database. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was added
	*/
	public static com.grow.favourites.model.Favourite addFavourite(
		com.grow.favourites.model.Favourite favourite) {
		return getService().addFavourite(favourite);
	}

	public static com.grow.favourites.model.Favourite addFavourite(
		long groupId, long assetEntryId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addFavourite(groupId, assetEntryId, userId);
	}

	/**
	* Creates a new favourite with the primary key. Does not add the favourite to the database.
	*
	* @param favouriteId the primary key for the new favourite
	* @return the new favourite
	*/
	public static com.grow.favourites.model.Favourite createFavourite(
		long favouriteId) {
		return getService().createFavourite(favouriteId);
	}

	/**
	* Deletes the favourite from the database. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was removed
	*/
	public static com.grow.favourites.model.Favourite deleteFavourite(
		com.grow.favourites.model.Favourite favourite) {
		return getService().deleteFavourite(favourite);
	}

	/**
	* Deletes the favourite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite that was removed
	* @throws PortalException if a favourite with the primary key could not be found
	*/
	public static com.grow.favourites.model.Favourite deleteFavourite(
		long favouriteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteFavourite(favouriteId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.grow.favourites.model.Favourite fetchFavourite(
		long favouriteId) {
		return getService().fetchFavourite(favouriteId);
	}

	/**
	* Returns the favourite matching the UUID and group.
	*
	* @param uuid the favourite's UUID
	* @param groupId the primary key of the group
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static com.grow.favourites.model.Favourite fetchFavouriteByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchFavouriteByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the favourite with the primary key.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite
	* @throws PortalException if a favourite with the primary key could not be found
	*/
	public static com.grow.favourites.model.Favourite getFavourite(
		long favouriteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFavourite(favouriteId);
	}

	/**
	* Returns the favourite matching the UUID and group.
	*
	* @param uuid the favourite's UUID
	* @param groupId the primary key of the group
	* @return the matching favourite
	* @throws PortalException if a matching favourite could not be found
	*/
	public static com.grow.favourites.model.Favourite getFavouriteByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getFavouriteByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<com.grow.favourites.model.Favourite> getFavourites(
		int start, int end) {
		return getService().getFavourites(start, end);
	}

	/**
	* Returns all the favourites matching the UUID and company.
	*
	* @param uuid the UUID of the favourites
	* @param companyId the primary key of the company
	* @return the matching favourites, or an empty list if no matches were found
	*/
	public static java.util.List<com.grow.favourites.model.Favourite> getFavouritesByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getFavouritesByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<com.grow.favourites.model.Favourite> getFavouritesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.grow.favourites.model.Favourite> orderByComparator) {
		return getService()
				   .getFavouritesByUuidAndCompanyId(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of favourites.
	*
	* @return the number of favourites
	*/
	public static int getFavouritesCount() {
		return getService().getFavouritesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static com.grow.favourites.model.Favourite getLeastFavourites(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getLeastFavourites(groupId);
	}

	public static com.grow.favourites.model.Favourite getMostFavourites(
		long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMostFavourites(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static java.util.Collection<com.grow.favourites.model.Favourite> getUserFavourites(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUserFavourites(groupId, userId);
	}

	public static java.util.List<com.liferay.portal.kernel.model.User> getUsers(
		long assetEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUsers(assetEntryId);
	}

	public static boolean isFavourite(long groupId, long userId,
		long assetEntryId) {
		return getService().isFavourite(groupId, userId, assetEntryId);
	}

	public static void removeFavourite(long favouriteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeFavourite(favouriteId);
	}

	public static void removeFavourite(long groupId, long assetEntryId,
		long userId) throws com.liferay.portal.kernel.exception.PortalException {
		getService().removeFavourite(groupId, assetEntryId, userId);
	}

	/**
	* Updates the favourite in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param favourite the favourite
	* @return the favourite that was updated
	*/
	public static com.grow.favourites.model.Favourite updateFavourite(
		com.grow.favourites.model.Favourite favourite) {
		return getService().updateFavourite(favourite);
	}

	public static FavouriteLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FavouriteLocalService, FavouriteLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FavouriteLocalService.class);

		ServiceTracker<FavouriteLocalService, FavouriteLocalService> serviceTracker =
			new ServiceTracker<FavouriteLocalService, FavouriteLocalService>(bundle.getBundleContext(),
				FavouriteLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}