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
public class FlatOwnerSoap implements Serializable {
	public static FlatOwnerSoap toSoapModel(FlatOwner model) {
		FlatOwnerSoap soapModel = new FlatOwnerSoap();

		soapModel.setId(model.getId());
		soapModel.setOwnerId(model.getOwnerId());
		soapModel.setTsgId(model.getTsgId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFlatId(model.getFlatId());
		soapModel.setFromDate(model.getFromDate());
		soapModel.setToDate(model.getToDate());
		soapModel.setPercent(model.getPercent());
		soapModel.setArea(model.getArea());
		soapModel.setShared(model.getShared());

		return soapModel;
	}

	public static FlatOwnerSoap[] toSoapModels(FlatOwner[] models) {
		FlatOwnerSoap[] soapModels = new FlatOwnerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FlatOwnerSoap[][] toSoapModels(FlatOwner[][] models) {
		FlatOwnerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FlatOwnerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FlatOwnerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FlatOwnerSoap[] toSoapModels(List<FlatOwner> models) {
		List<FlatOwnerSoap> soapModels = new ArrayList<FlatOwnerSoap>(models.size());

		for (FlatOwner model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FlatOwnerSoap[soapModels.size()]);
	}

	public FlatOwnerSoap() {
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

	public long getOwnerId() {
		return _ownerId;
	}

	public void setOwnerId(long ownerId) {
		_ownerId = ownerId;
	}

	public long getTsgId() {
		return _tsgId;
	}

	public void setTsgId(long tsgId) {
		_tsgId = tsgId;
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

	public long getFlatId() {
		return _flatId;
	}

	public void setFlatId(long flatId) {
		_flatId = flatId;
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

	public int getPercent() {
		return _percent;
	}

	public void setPercent(int percent) {
		_percent = percent;
	}

	public int getArea() {
		return _area;
	}

	public void setArea(int area) {
		_area = area;
	}

	public boolean getShared() {
		return _shared;
	}

	public boolean isShared() {
		return _shared;
	}

	public void setShared(boolean shared) {
		_shared = shared;
	}

	private long _id;
	private long _ownerId;
	private long _tsgId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _flatId;
	private Date _fromDate;
	private Date _toDate;
	private int _percent;
	private int _area;
	private boolean _shared;
}