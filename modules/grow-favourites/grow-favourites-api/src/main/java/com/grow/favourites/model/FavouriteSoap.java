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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.grow.favourites.service.http.FavouriteServiceSoap}.
 *
 * @author NorbertNemeth
 * @see com.grow.favourites.service.http.FavouriteServiceSoap
 * @generated
 */
@ProviderType
public class FavouriteSoap implements Serializable {
	public static FavouriteSoap toSoapModel(Favourite model) {
		FavouriteSoap soapModel = new FavouriteSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFavouriteId(model.getFavouriteId());
		soapModel.setAssetEntryId(model.getAssetEntryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setAddedDate(model.getAddedDate());
		soapModel.setUserId(model.getUserId());

		return soapModel;
	}

	public static FavouriteSoap[] toSoapModels(Favourite[] models) {
		FavouriteSoap[] soapModels = new FavouriteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FavouriteSoap[][] toSoapModels(Favourite[][] models) {
		FavouriteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FavouriteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FavouriteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FavouriteSoap[] toSoapModels(List<Favourite> models) {
		List<FavouriteSoap> soapModels = new ArrayList<FavouriteSoap>(models.size());

		for (Favourite model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FavouriteSoap[soapModels.size()]);
	}

	public FavouriteSoap() {
	}

	public long getPrimaryKey() {
		return _favouriteId;
	}

	public void setPrimaryKey(long pk) {
		setFavouriteId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFavouriteId() {
		return _favouriteId;
	}

	public void setFavouriteId(long favouriteId) {
		_favouriteId = favouriteId;
	}

	public long getAssetEntryId() {
		return _assetEntryId;
	}

	public void setAssetEntryId(long assetEntryId) {
		_assetEntryId = assetEntryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getAddedDate() {
		return _addedDate;
	}

	public void setAddedDate(Date addedDate) {
		_addedDate = addedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	private String _uuid;
	private long _favouriteId;
	private long _assetEntryId;
	private long _companyId;
	private long _groupId;
	private Date _addedDate;
	private long _userId;
}