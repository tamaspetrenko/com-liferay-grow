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

package com.grow.favourites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.grow.favourites.model.Favourite;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the favourite service. This utility wraps {@link com.grow.favourites.service.persistence.impl.FavouritePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NorbertNemeth
 * @see FavouritePersistence
 * @see com.grow.favourites.service.persistence.impl.FavouritePersistenceImpl
 * @generated
 */
@ProviderType
public class FavouriteUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Favourite favourite) {
		getPersistence().clearCache(favourite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Favourite> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Favourite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Favourite> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Favourite update(Favourite favourite) {
		return getPersistence().update(favourite);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Favourite update(Favourite favourite,
		ServiceContext serviceContext) {
		return getPersistence().update(favourite, serviceContext);
	}

	/**
	* Returns all the favourites where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching favourites
	*/
	public static List<Favourite> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the favourites where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByUuid(String uuid, int start, int end,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByUuid(String uuid, int start, int end,
		OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByUuid_First(String uuid,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUuid_First(String uuid,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByUuid_Last(String uuid,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUuid_Last(String uuid,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where uuid = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByUuid_PrevAndNext(long favouriteId,
		String uuid, OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByUuid_PrevAndNext(favouriteId, uuid, orderByComparator);
	}

	/**
	* Removes all the favourites where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of favourites where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching favourites
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByUUID_G(String uuid, long groupId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the favourite where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the favourite that was removed
	*/
	public static Favourite removeByUUID_G(String uuid, long groupId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of favourites where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching favourites
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the favourites where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching favourites
	*/
	public static List<Favourite> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the favourites where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByUuid_C_PrevAndNext(long favouriteId,
		String uuid, long companyId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(favouriteId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the favourites where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of favourites where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching favourites
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the favourites where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the matching favourites
	*/
	public static List<Favourite> findByA(long assetEntryId) {
		return getPersistence().findByA(assetEntryId);
	}

	/**
	* Returns a range of all the favourites where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByA(long assetEntryId, int start, int end) {
		return getPersistence().findByA(assetEntryId, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByA(long assetEntryId, int start,
		int end, OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .findByA(assetEntryId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where assetEntryId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param assetEntryId the asset entry ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByA(long assetEntryId, int start,
		int end, OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByA(assetEntryId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByA_First(long assetEntryId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByA_First(assetEntryId, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByA_First(long assetEntryId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByA_First(assetEntryId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByA_Last(long assetEntryId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByA_Last(assetEntryId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByA_Last(long assetEntryId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByA_Last(assetEntryId, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByA_PrevAndNext(long favouriteId,
		long assetEntryId, OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByA_PrevAndNext(favouriteId, assetEntryId,
			orderByComparator);
	}

	/**
	* Removes all the favourites where assetEntryId = &#63; from the database.
	*
	* @param assetEntryId the asset entry ID
	*/
	public static void removeByA(long assetEntryId) {
		getPersistence().removeByA(assetEntryId);
	}

	/**
	* Returns the number of favourites where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the number of matching favourites
	*/
	public static int countByA(long assetEntryId) {
		return getPersistence().countByA(assetEntryId);
	}

	/**
	* Returns all the favourites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favourites
	*/
	public static List<Favourite> findByU(long userId) {
		return getPersistence().findByU(userId);
	}

	/**
	* Returns a range of all the favourites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByU(long userId, int start, int end) {
		return getPersistence().findByU(userId, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByU(long userId, int start, int end,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().findByU(userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByU(long userId, int start, int end,
		OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByU(userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByU_First(long userId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByU_First(userId, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByU_First(long userId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByU_First(userId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByU_Last(long userId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByU_Last(long userId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByU_Last(userId, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where userId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByU_PrevAndNext(long favouriteId,
		long userId, OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByU_PrevAndNext(favouriteId, userId, orderByComparator);
	}

	/**
	* Removes all the favourites where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public static void removeByU(long userId) {
		getPersistence().removeByU(userId);
	}

	/**
	* Returns the number of favourites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public static int countByU(long userId) {
		return getPersistence().countByU(userId);
	}

	/**
	* Returns all the favourites where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching favourites
	*/
	public static List<Favourite> findByG_U(long groupId, long userId) {
		return getPersistence().findByG_U(groupId, userId);
	}

	/**
	* Returns a range of all the favourites where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByG_U(long groupId, long userId,
		int start, int end) {
		return getPersistence().findByG_U(groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByG_U(long groupId, long userId,
		int start, int end, OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByG_U(long groupId, long userId,
		int start, int end, OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByG_U_First(long groupId, long userId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_U_First(long groupId, long userId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByG_U_Last(long groupId, long userId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_U_Last(long groupId, long userId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence()
				   .fetchByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByG_U_PrevAndNext(long favouriteId,
		long groupId, long userId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByG_U_PrevAndNext(favouriteId, groupId, userId,
			orderByComparator);
	}

	/**
	* Removes all the favourites where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public static void removeByG_U(long groupId, long userId) {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	* Returns the number of favourites where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public static int countByG_U(long groupId, long userId) {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByG_A_U(long groupId, long assetEntryId,
		long userId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByG_A_U(groupId, assetEntryId, userId);
	}

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_A_U(long groupId, long assetEntryId,
		long userId) {
		return getPersistence().fetchByG_A_U(groupId, assetEntryId, userId);
	}

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_A_U(long groupId, long assetEntryId,
		long userId, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByG_A_U(groupId, assetEntryId, userId,
			retrieveFromCache);
	}

	/**
	* Removes the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the favourite that was removed
	*/
	public static Favourite removeByG_A_U(long groupId, long assetEntryId,
		long userId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().removeByG_A_U(groupId, assetEntryId, userId);
	}

	/**
	* Returns the number of favourites where groupId = &#63; and assetEntryId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public static int countByG_A_U(long groupId, long assetEntryId, long userId) {
		return getPersistence().countByG_A_U(groupId, assetEntryId, userId);
	}

	/**
	* Returns all the favourites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching favourites
	*/
	public static List<Favourite> findByG(long groupId) {
		return getPersistence().findByG(groupId);
	}

	/**
	* Returns a range of all the favourites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of matching favourites
	*/
	public static List<Favourite> findByG(long groupId, int start, int end) {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the favourites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByG(long groupId, int start, int end,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching favourites
	*/
	public static List<Favourite> findByG(long groupId, int start, int end,
		OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByG_First(long groupId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the first favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_First(long groupId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public static Favourite findByG_Last(long groupId,
		OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public static Favourite fetchByG_Last(long groupId,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	* Returns the favourites before and after the current favourite in the ordered set where groupId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite[] findByG_PrevAndNext(long favouriteId,
		long groupId, OrderByComparator<Favourite> orderByComparator)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence()
				   .findByG_PrevAndNext(favouriteId, groupId, orderByComparator);
	}

	/**
	* Removes all the favourites where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByG(long groupId) {
		getPersistence().removeByG(groupId);
	}

	/**
	* Returns the number of favourites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching favourites
	*/
	public static int countByG(long groupId) {
		return getPersistence().countByG(groupId);
	}

	/**
	* Caches the favourite in the entity cache if it is enabled.
	*
	* @param favourite the favourite
	*/
	public static void cacheResult(Favourite favourite) {
		getPersistence().cacheResult(favourite);
	}

	/**
	* Caches the favourites in the entity cache if it is enabled.
	*
	* @param favourites the favourites
	*/
	public static void cacheResult(List<Favourite> favourites) {
		getPersistence().cacheResult(favourites);
	}

	/**
	* Creates a new favourite with the primary key. Does not add the favourite to the database.
	*
	* @param favouriteId the primary key for the new favourite
	* @return the new favourite
	*/
	public static Favourite create(long favouriteId) {
		return getPersistence().create(favouriteId);
	}

	/**
	* Removes the favourite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite that was removed
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite remove(long favouriteId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().remove(favouriteId);
	}

	public static Favourite updateImpl(Favourite favourite) {
		return getPersistence().updateImpl(favourite);
	}

	/**
	* Returns the favourite with the primary key or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public static Favourite findByPrimaryKey(long favouriteId)
		throws com.grow.favourites.exception.NoSuchFavouriteException {
		return getPersistence().findByPrimaryKey(favouriteId);
	}

	/**
	* Returns the favourite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite, or <code>null</code> if a favourite with the primary key could not be found
	*/
	public static Favourite fetchByPrimaryKey(long favouriteId) {
		return getPersistence().fetchByPrimaryKey(favouriteId);
	}

	public static java.util.Map<java.io.Serializable, Favourite> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the favourites.
	*
	* @return the favourites
	*/
	public static List<Favourite> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the favourites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @return the range of favourites
	*/
	public static List<Favourite> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the favourites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of favourites
	*/
	public static List<Favourite> findAll(int start, int end,
		OrderByComparator<Favourite> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the favourites.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FavouriteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of favourites
	* @param end the upper bound of the range of favourites (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of favourites
	*/
	public static List<Favourite> findAll(int start, int end,
		OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the favourites from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of favourites.
	*
	* @return the number of favourites
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FavouritePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<FavouritePersistence, FavouritePersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(FavouritePersistence.class);

		ServiceTracker<FavouritePersistence, FavouritePersistence> serviceTracker =
			new ServiceTracker<FavouritePersistence, FavouritePersistence>(bundle.getBundleContext(),
				FavouritePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}