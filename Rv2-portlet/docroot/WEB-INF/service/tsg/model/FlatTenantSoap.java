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

package tsg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    Whitemonk
 * @generated
 */
public class FlatTenantSoap implements Serializable {
	public static FlatTenantSoap toSoapModel(FlatTenant model) {
		FlatTenantSoap soapModel = new FlatTenantSoap();

		soapModel.setId(model.getId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTenantId(model.getTenantId());
		soapModel.setFlatId(model.getFlatId());
		soapModel.setTsgId(model.getTsgId());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());

		return soapModel;
	}

	public static FlatTenantSoap[] toSoapModels(FlatTenant[] models) {
		FlatTenantSoap[] soapModels = new FlatTenantSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FlatTenantSoap[][] toSoapModels(FlatTenant[][] models) {
		FlatTenantSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FlatTenantSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FlatTenantSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FlatTenantSoap[] toSoapModels(List<FlatTenant> models) {
		List<FlatTenantSoap> soapModels = new ArrayList<FlatTenantSoap>(models.size());

		for (FlatTenant model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FlatTenantSoap[soapModels.size()]);
	}

	public FlatTenantSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getTenantId() {
		return _tenantId;
	}

	public void setTenantId(long tenantId) {
		_tenantId = tenantId;
	}

	public long getFlatId() {
		return _flatId;
	}

	public void setFlatId(long flatId) {
		_flatId = flatId;
	}

	public long getTsgId() {
		return _tsgId;
	}

	public void setTsgId(long tsgId) {
		_tsgId = tsgId;
	}

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;
	}

	private long _id;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _tenantId;
	private long _flatId;
	private long _tsgId;
	private Date _fromDate;
	private Date _toDate;
}