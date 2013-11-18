/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package tsg.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import tsg.model.Flat;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Flat in entity cache.
 *
 * @author Whitemonk
 * @see Flat
 * @generated
 */
public class FlatCacheModel implements CacheModel<Flat>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{flatId=");
		sb.append(flatId);
		sb.append(", tsgId=");
		sb.append(tsgId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", houseId=");
		sb.append(houseId);
		sb.append(", ownersCnt=");
		sb.append(ownersCnt);
		sb.append(", tenantsCnt=");
		sb.append(tenantsCnt);
		sb.append(", spaceCommon=");
		sb.append(spaceCommon);
		sb.append(", spaceLiving=");
		sb.append(spaceLiving);
		sb.append(", roomCnt=");
		sb.append(roomCnt);
		sb.append(", floor=");
		sb.append(floor);
		sb.append(", number=");
		sb.append(number);
		sb.append(", addressId=");
		sb.append(addressId);
		sb.append("}");

		return sb.toString();
	}

	public Flat toEntityModel() {
		FlatImpl flatImpl = new FlatImpl();

		flatImpl.setFlatId(flatId);
		flatImpl.setTsgId(tsgId);
		flatImpl.setCompanyId(companyId);
		flatImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			flatImpl.setCreateDate(null);
		}
		else {
			flatImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			flatImpl.setModifiedDate(null);
		}
		else {
			flatImpl.setModifiedDate(new Date(modifiedDate));
		}

		flatImpl.setHouseId(houseId);
		flatImpl.setOwnersCnt(ownersCnt);
		flatImpl.setTenantsCnt(tenantsCnt);
		flatImpl.setSpaceCommon(spaceCommon);
		flatImpl.setSpaceLiving(spaceLiving);
		flatImpl.setRoomCnt(roomCnt);
		flatImpl.setFloor(floor);

		if (number == null) {
			flatImpl.setNumber(StringPool.BLANK);
		}
		else {
			flatImpl.setNumber(number);
		}

		flatImpl.setAddressId(addressId);

		flatImpl.resetOriginalValues();

		return flatImpl;
	}

	public long flatId;
	public long tsgId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long houseId;
	public long ownersCnt;
	public long tenantsCnt;
	public int spaceCommon;
	public int spaceLiving;
	public int roomCnt;
	public int floor;
	public String number;
	public long addressId;
}