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

import com.grow.favourites.exception.NoSuchFavouriteException;
import com.grow.favourites.model.Favourite;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the favourite service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author NorbertNemeth
 * @see com.grow.favourites.service.persistence.impl.FavouritePersistenceImpl
 * @see FavouriteUtil
 * @generated
 */
@ProviderType
public interface FavouritePersistence extends BasePersistence<Favourite> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FavouriteUtil} to access the favourite persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the favourites where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByUuid(String uuid);

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
	public java.util.List<Favourite> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Favourite> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByUuid(String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the favourites before and after the current favourite in the ordered set where uuid = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite[] findByUuid_PrevAndNext(long favouriteId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of favourites where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching favourites
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByUUID_G(String uuid, long groupId)
		throws NoSuchFavouriteException;

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the favourite where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the favourite where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the favourite that was removed
	*/
	public Favourite removeByUUID_G(String uuid, long groupId)
		throws NoSuchFavouriteException;

	/**
	* Returns the number of favourites where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching favourites
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the favourites where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public Favourite[] findByUuid_C_PrevAndNext(long favouriteId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of favourites where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching favourites
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the favourites where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByA(long assetEntryId);

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
	public java.util.List<Favourite> findByA(long assetEntryId, int start,
		int end);

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
	public java.util.List<Favourite> findByA(long assetEntryId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByA(long assetEntryId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByA_First(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByA_First(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByA_Last(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByA_Last(long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the favourites before and after the current favourite in the ordered set where assetEntryId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param assetEntryId the asset entry ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite[] findByA_PrevAndNext(long favouriteId, long assetEntryId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where assetEntryId = &#63; from the database.
	*
	* @param assetEntryId the asset entry ID
	*/
	public void removeByA(long assetEntryId);

	/**
	* Returns the number of favourites where assetEntryId = &#63;.
	*
	* @param assetEntryId the asset entry ID
	* @return the number of matching favourites
	*/
	public int countByA(long assetEntryId);

	/**
	* Returns all the favourites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByU(long userId);

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
	public java.util.List<Favourite> findByU(long userId, int start, int end);

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
	public java.util.List<Favourite> findByU(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByU(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByU_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByU_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the favourites before and after the current favourite in the ordered set where userId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite[] findByU_PrevAndNext(long favouriteId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByU(long userId);

	/**
	* Returns the number of favourites where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public int countByU(long userId);

	/**
	* Returns all the favourites where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByG_U(long groupId, long userId);

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
	public java.util.List<Favourite> findByG_U(long groupId, long userId,
		int start, int end);

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
	public java.util.List<Favourite> findByG_U(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByG_U(long groupId, long userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByG_U_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_U_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByG_U_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_U_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public Favourite[] findByG_U_PrevAndNext(long favouriteId, long groupId,
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByG_U(long groupId, long userId);

	/**
	* Returns the number of favourites where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public int countByG_U(long groupId, long userId);

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByG_A_U(long groupId, long assetEntryId, long userId)
		throws NoSuchFavouriteException;

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_A_U(long groupId, long assetEntryId, long userId);

	/**
	* Returns the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_A_U(long groupId, long assetEntryId, long userId,
		boolean retrieveFromCache);

	/**
	* Removes the favourite where groupId = &#63; and assetEntryId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the favourite that was removed
	*/
	public Favourite removeByG_A_U(long groupId, long assetEntryId, long userId)
		throws NoSuchFavouriteException;

	/**
	* Returns the number of favourites where groupId = &#63; and assetEntryId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param assetEntryId the asset entry ID
	* @param userId the user ID
	* @return the number of matching favourites
	*/
	public int countByG_A_U(long groupId, long assetEntryId, long userId);

	/**
	* Returns all the favourites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching favourites
	*/
	public java.util.List<Favourite> findByG(long groupId);

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
	public java.util.List<Favourite> findByG(long groupId, int start, int end);

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
	public java.util.List<Favourite> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findByG(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the first favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the last favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite
	* @throws NoSuchFavouriteException if a matching favourite could not be found
	*/
	public Favourite findByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Returns the last favourite in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching favourite, or <code>null</code> if a matching favourite could not be found
	*/
	public Favourite fetchByG_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

	/**
	* Returns the favourites before and after the current favourite in the ordered set where groupId = &#63;.
	*
	* @param favouriteId the primary key of the current favourite
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite[] findByG_PrevAndNext(long favouriteId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator)
		throws NoSuchFavouriteException;

	/**
	* Removes all the favourites where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByG(long groupId);

	/**
	* Returns the number of favourites where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching favourites
	*/
	public int countByG(long groupId);

	/**
	* Caches the favourite in the entity cache if it is enabled.
	*
	* @param favourite the favourite
	*/
	public void cacheResult(Favourite favourite);

	/**
	* Caches the favourites in the entity cache if it is enabled.
	*
	* @param favourites the favourites
	*/
	public void cacheResult(java.util.List<Favourite> favourites);

	/**
	* Creates a new favourite with the primary key. Does not add the favourite to the database.
	*
	* @param favouriteId the primary key for the new favourite
	* @return the new favourite
	*/
	public Favourite create(long favouriteId);

	/**
	* Removes the favourite with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite that was removed
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite remove(long favouriteId) throws NoSuchFavouriteException;

	public Favourite updateImpl(Favourite favourite);

	/**
	* Returns the favourite with the primary key or throws a {@link NoSuchFavouriteException} if it could not be found.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite
	* @throws NoSuchFavouriteException if a favourite with the primary key could not be found
	*/
	public Favourite findByPrimaryKey(long favouriteId)
		throws NoSuchFavouriteException;

	/**
	* Returns the favourite with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param favouriteId the primary key of the favourite
	* @return the favourite, or <code>null</code> if a favourite with the primary key could not be found
	*/
	public Favourite fetchByPrimaryKey(long favouriteId);

	@Override
	public java.util.Map<java.io.Serializable, Favourite> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the favourites.
	*
	* @return the favourites
	*/
	public java.util.List<Favourite> findAll();

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
	public java.util.List<Favourite> findAll(int start, int end);

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
	public java.util.List<Favourite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator);

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
	public java.util.List<Favourite> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Favourite> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the favourites from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of favourites.
	*
	* @return the number of favourites
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}