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

package com.grow.favourites.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Favourite}.
 * </p>
 *
 * @author NorbertNemeth
 * @see Favourite
 * @generated
 */
@ProviderType
public class FavouriteWrapper implements Favourite, ModelWrapper<Favourite> {
	public FavouriteWrapper(Favourite favourite) {
		_favourite = favourite;
	}

	@Override
	public Class<?> getModelClass() {
		return Favourite.class;
	}

	@Override
	public String getModelClassName() {
		return Favourite.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("favouriteId", getFavouriteId());
		attributes.put("assetEntryId", getAssetEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("addedDate", getAddedDate());
		attributes.put("userId", getUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long favouriteId = (Long)attributes.get("favouriteId");

		if (favouriteId != null) {
			setFavouriteId(favouriteId);
		}

		Long assetEntryId = (Long)attributes.get("assetEntryId");

		if (assetEntryId != null) {
			setAssetEntryId(assetEntryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date addedDate = (Date)attributes.get("addedDate");

		if (addedDate != null) {
			setAddedDate(addedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}
	}

	@Override
	public Object clone() {
		return new FavouriteWrapper((Favourite)_favourite.clone());
	}

	@Override
	public int compareTo(Favourite favourite) {
		return _favourite.compareTo(favourite);
	}

	/**
	* Returns the added date of this favourite.
	*
	* @return the added date of this favourite
	*/
	@Override
	public Date getAddedDate() {
		return _favourite.getAddedDate();
	}

	/**
	* Returns the asset entry ID of this favourite.
	*
	* @return the asset entry ID of this favourite
	*/
	@Override
	public long getAssetEntryId() {
		return _favourite.getAssetEntryId();
	}

	/**
	* Returns the company ID of this favourite.
	*
	* @return the company ID of this favourite
	*/
	@Override
	public long getCompanyId() {
		return _favourite.getCompanyId();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _favourite.getExpandoBridge();
	}

	/**
	* Returns the favourite ID of this favourite.
	*
	* @return the favourite ID of this favourite
	*/
	@Override
	public long getFavouriteId() {
		return _favourite.getFavouriteId();
	}

	/**
	* Returns the group ID of this favourite.
	*
	* @return the group ID of this favourite
	*/
	@Override
	public long getGroupId() {
		return _favourite.getGroupId();
	}

	/**
	* Returns the primary key of this favourite.
	*
	* @return the primary key of this favourite
	*/
	@Override
	public long getPrimaryKey() {
		return _favourite.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _favourite.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this favourite.
	*
	* @return the user ID of this favourite
	*/
	@Override
	public long getUserId() {
		return _favourite.getUserId();
	}

	/**
	* Returns the user uuid of this favourite.
	*
	* @return the user uuid of this favourite
	*/
	@Override
	public String getUserUuid() {
		return _favourite.getUserUuid();
	}

	/**
	* Returns the uuid of this favourite.
	*
	* @return the uuid of this favourite
	*/
	@Override
	public String getUuid() {
		return _favourite.getUuid();
	}

	@Override
	public int hashCode() {
		return _favourite.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _favourite.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _favourite.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _favourite.isNew();
	}

	@Override
	public void persist() {
		_favourite.persist();
	}

	/**
	* Sets the added date of this favourite.
	*
	* @param addedDate the added date of this favourite
	*/
	@Override
	public void setAddedDate(Date addedDate) {
		_favourite.setAddedDate(addedDate);
	}

	/**
	* Sets the asset entry ID of this favourite.
	*
	* @param assetEntryId the asset entry ID of this favourite
	*/
	@Override
	public void setAssetEntryId(long assetEntryId) {
		_favourite.setAssetEntryId(assetEntryId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_favourite.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this favourite.
	*
	* @param companyId the company ID of this favourite
	*/
	@Override
	public void setCompanyId(long companyId) {
		_favourite.setCompanyId(companyId);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_favourite.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_favourite.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_favourite.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the favourite ID of this favourite.
	*
	* @param favouriteId the favourite ID of this favourite
	*/
	@Override
	public void setFavouriteId(long favouriteId) {
		_favourite.setFavouriteId(favouriteId);
	}

	/**
	* Sets the group ID of this favourite.
	*
	* @param groupId the group ID of this favourite
	*/
	@Override
	public void setGroupId(long groupId) {
		_favourite.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_favourite.setNew(n);
	}

	/**
	* Sets the primary key of this favourite.
	*
	* @param primaryKey the primary key of this favourite
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_favourite.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_favourite.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this favourite.
	*
	* @param userId the user ID of this favourite
	*/
	@Override
	public void setUserId(long userId) {
		_favourite.setUserId(userId);
	}

	/**
	* Sets the user uuid of this favourite.
	*
	* @param userUuid the user uuid of this favourite
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_favourite.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this favourite.
	*
	* @param uuid the uuid of this favourite
	*/
	@Override
	public void setUuid(String uuid) {
		_favourite.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Favourite> toCacheModel() {
		return _favourite.toCacheModel();
	}

	@Override
	public Favourite toEscapedModel() {
		return new FavouriteWrapper(_favourite.toEscapedModel());
	}

	@Override
	public String toString() {
		return _favourite.toString();
	}

	@Override
	public Favourite toUnescapedModel() {
		return new FavouriteWrapper(_favourite.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _favourite.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavouriteWrapper)) {
			return false;
		}

		FavouriteWrapper favouriteWrapper = (FavouriteWrapper)obj;

		if (Objects.equals(_favourite, favouriteWrapper._favourite)) {
			return true;
		}

		return false;
	}

	@Override
	public Favourite getWrappedModel() {
		return _favourite;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _favourite.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _favourite.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_favourite.resetOriginalValues();
	}

	private final Favourite _favourite;
}