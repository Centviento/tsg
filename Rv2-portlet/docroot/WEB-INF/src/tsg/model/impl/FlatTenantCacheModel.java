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

import tsg.model.FlatTenant;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing FlatTenant in entity cache.
 *
 * @author Whitemonk
 * @see FlatTenant
 * @generated
 */
public class FlatTenantCacheModel implements CacheModel<FlatTenant>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", tenantId=");
		sb.append(tenantId);
		sb.append(", flatId=");
		sb.append(flatId);
		sb.append(", tsgId=");
		sb.append(tsgId);
		sb.append(", fromDate=");
		sb.append(fromDate);
		sb.append(", toDate=");
		sb.append(toDate);
		sb.append("}");

		return sb.toString();
	}

	public FlatTenant toEntityModel() {
		FlatTenantImpl flatTenantImpl = new FlatTenantImpl();

		flatTenantImpl.setId(id);
		flatTenantImpl.setCompanyId(companyId);
		flatTenantImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			flatTenantImpl.setCreateDate(null);
		}
		else {
			flatTenantImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			flatTenantImpl.setModifiedDate(null);
		}
		else {
			flatTenantImpl.setModifiedDate(new Date(modifiedDate));
		}

		flatTenantImpl.setTenantId(tenantId);
		flatTenantImpl.setFlatId(flatId);
		flatTenantImpl.setTsgId(tsgId);

		if (fromDate == Long.MIN_VALUE) {
			flatTenantImpl.setFromDate(null);
		}
		else {
			flatTenantImpl.setFromDate(new Date(fromDate));
		}

		if (toDate == Long.MIN_VALUE) {
			flatTenantImpl.setToDate(null);
		}
		else {
			flatTenantImpl.setToDate(new Date(toDate));
		}

		flatTenantImpl.resetOriginalValues();

		return flatTenantImpl;
	}

	public long id;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public long tenantId;
	public long flatId;
	public long tsgId;
	public long fromDate;
	public long toDate;
}