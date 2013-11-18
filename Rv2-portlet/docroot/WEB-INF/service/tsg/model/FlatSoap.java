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
public class FlatSoap implements Serializable {
	public static FlatSoap toSoapModel(Flat model) {
		FlatSoap soapModel = new FlatSoap();

		soapModel.setFlatId(model.getFlatId());
		soapModel.setTsgId(model.getTsgId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setHouseId(model.getHouseId());
		soapModel.setOwnersCnt(model.getOwnersCnt());
		soapModel.setTenantsCnt(model.getTenantsCnt());
		soapModel.setSpaceCommon(model.getSpaceCommon());
		soapModel.setSpaceLiving(model.getSpaceLiving());
		soapModel.setRoomCnt(model.getRoomCnt());
		soapModel.setFloor(model.getFloor());
		soapModel.setNumber(model.getNumber());
		soapModel.setAddressId(model.getAddressId());

		return soapModel;
	}

	public static FlatSoap[] toSoapModels(Flat[] models) {
		FlatSoap[] soapModels = new FlatSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FlatSoap[][] toSoapModels(Flat[][] models) {
		FlatSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new FlatSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FlatSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FlatSoap[] toSoapModels(List<Flat> models) {
		List<FlatSoap> soapModels = new ArrayList<FlatSoap>(models.size());

		for (Flat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FlatSoap[soapModels.size()]);
	}

	public FlatSoap() {
	}

	public long getPrimaryKey() {
		return _flatId;
	}

	public void setPrimaryKey(long pk) {
		setFlatId(pk);
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

	public long getHouseId() {
		return _houseId;
	}

	public void setHouseId(long houseId) {
		_houseId = houseId;
	}

	public long getOwnersCnt() {
		return _ownersCnt;
	}

	public void setOwnersCnt(long ownersCnt) {
		_ownersCnt = ownersCnt;
	}

	public long getTenantsCnt() {
		return _tenantsCnt;
	}

	public void setTenantsCnt(long tenantsCnt) {
		_tenantsCnt = tenantsCnt;
	}

	public int getSpaceCommon() {
		return _spaceCommon;
	}

	public void setSpaceCommon(int spaceCommon) {
		_spaceCommon = spaceCommon;
	}

	public int getSpaceLiving() {
		return _spaceLiving;
	}

	public void setSpaceLiving(int spaceLiving) {
		_spaceLiving = spaceLiving;
	}

	public int getRoomCnt() {
		return _roomCnt;
	}

	public void setRoomCnt(int roomCnt) {
		_roomCnt = roomCnt;
	}

	public int getFloor() {
		return _floor;
	}

	public void setFloor(int floor) {
		_floor = floor;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;
	}

	public long getAddressId() {
		return _addressId;
	}

	public void setAddressId(long addressId) {
		_addressId = addressId;
	}

	private long _flatId;
	private long _tsgId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _houseId;
	private long _ownersCnt;
	private long _tenantsCnt;
	private int _spaceCommon;
	private int _spaceLiving;
	private int _roomCnt;
	private int _floor;
	private String _number;
	private long _addressId;
}