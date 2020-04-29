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

package com.grow.favourites.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.grow.favourites.model.Favourite;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Favourite in entity cache.
 *
 * @author NorbertNemeth
 * @see Favourite
 * @generated
 */
@ProviderType
public class FavouriteCacheModel implements CacheModel<Favourite>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FavouriteCacheModel)) {
			return false;
		}

		FavouriteCacheModel favouriteCacheModel = (FavouriteCacheModel)obj;

		if (favouriteId == favouriteCacheModel.favouriteId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, favouriteId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", favouriteId=");
		sb.append(favouriteId);
		sb.append(", assetEntryId=");
		sb.append(assetEntryId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", addedDate=");
		sb.append(addedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Favourite toEntityModel() {
		FavouriteImpl favouriteImpl = new FavouriteImpl();

		if (uuid == null) {
			favouriteImpl.setUuid("");
		}
		else {
			favouriteImpl.setUuid(uuid);
		}

		favouriteImpl.setFavouriteId(favouriteId);
		favouriteImpl.setAssetEntryId(assetEntryId);
		favouriteImpl.setCompanyId(companyId);
		favouriteImpl.setGroupId(groupId);

		if (addedDate == Long.MIN_VALUE) {
			favouriteImpl.setAddedDate(null);
		}
		else {
			favouriteImpl.setAddedDate(new Date(addedDate));
		}

		favouriteImpl.setUserId(userId);

		favouriteImpl.resetOriginalValues();

		return favouriteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		favouriteId = objectInput.readLong();

		assetEntryId = objectInput.readLong();

		companyId = objectInput.readLong();

		groupId = objectInput.readLong();
		addedDate = objectInput.readLong();

		userId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(favouriteId);

		objectOutput.writeLong(assetEntryId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(groupId);
		objectOutput.writeLong(addedDate);

		objectOutput.writeLong(userId);
	}

	public String uuid;
	public long favouriteId;
	public long assetEntryId;
	public long companyId;
	public long groupId;
	public long addedDate;
	public long userId;
}