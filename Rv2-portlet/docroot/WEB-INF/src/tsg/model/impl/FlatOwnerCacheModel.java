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
import com.liferay.portal.model.CacheModel;

import tsg.model.FlatOwner;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FlatOwner in entity cache.
 *
 * @author Whitemonk
 * @see FlatOwner
 * @generated
 */
public class FlatOwnerCacheModel implements CacheModel<FlatOwner>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ownerId=");
		sb.append(ownerId);
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
		sb.append(", flatId=");
		sb.append(flatId);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append(", percent=");
		sb.append(percent);
		sb.append(", area=");
		sb.append(area);
		sb.append(", shared=");
		sb.append(shared);
		sb.append("}");

		return sb.toString();
	}

	public FlatOwner toEntityModel() {
		FlatOwnerImpl flatOwnerImpl = new FlatOwnerImpl();

		flatOwnerImpl.setId(id);
		flatOwnerImpl.setOwnerId(ownerId);
		flatOwnerImpl.setTsgId(tsgId);
		flatOwnerImpl.setCompanyId(companyId);
		flatOwnerImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			flatOwnerImpl.setCreateDate(null);
		}
		else {
			flatOwnerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			flatOwnerImpl.setModifiedDate(null);
		}
		else {
			flatOwnerImpl.setModifiedDate(new Date(modifiedDate));
		}

		flatOwnerImpl.setFlatId(flatId);

		if (fromDate == Long.MIN_VALUE) {
			flatOwnerImpl.setFromDate(null);
		}
		else {
			flatOwnerImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			flatOwnerImpl.setToDate(null);
		}
		else {
			flatOwnerImpl.setToDate(new Date(toDate));
		}

		flatOwnerImpl.setPercent(percent);
		flatOwnerImpl.setArea(area);
		flatOwnerImpl.setShared(shared);

		flatOwnerImpl.resetOriginalValues();

		return flatOwnerImpl;
	}

	public long id;
	public long ownerId;
	public long tsgId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long flatId;
	public long fromDate;
	public long toDate;
	public int percent;
	public int area;
	public boolean shared;
}