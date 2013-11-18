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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import tsg.service.ClpSerializer;
import tsg.service.FlatLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Whitemonk
 */
public class FlatClp extends BaseModelImpl<Flat> implements Flat {
	public FlatClp() {
	}

	public Class<?> getModelClass() {
		return Flat.class;
	}

	public String getModelClassName() {
		return Flat.class.getName();
	}

	public long getPrimaryKey() {
		return _flatId;
	}

	public void setPrimaryKey(long primaryKey) {
		setFlatId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_flatId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("flatId", getFlatId());
		attributes.put("tsgId", getTsgId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("houseId", getHouseId());
		attributes.put("ownersCnt", getOwnersCnt());
		attributes.put("tenantsCnt", getTenantsCnt());
		attributes.put("spaceCommon", getSpaceCommon());
		attributes.put("spaceLiving", getSpaceLiving());
		attributes.put("roomCnt", getRoomCnt());
		attributes.put("floor", getFloor());
		attributes.put("number", getNumber());
		attributes.put("addressId", getAddressId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long flatId = (Long)attributes.get("flatId");

		if (flatId != null) {
			setFlatId(flatId);
		}

		Long tsgId = (Long)attributes.get("tsgId");

		if (tsgId != null) {
			setTsgId(tsgId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long houseId = (Long)attributes.get("houseId");

		if (houseId != null) {
			setHouseId(houseId);
		}

		Long ownersCnt = (Long)attributes.get("ownersCnt");

		if (ownersCnt != null) {
			setOwnersCnt(ownersCnt);
		}

		Long tenantsCnt = (Long)attributes.get("tenantsCnt");

		if (tenantsCnt != null) {
			setTenantsCnt(tenantsCnt);
		}

		Integer spaceCommon = (Integer)attributes.get("spaceCommon");

		if (spaceCommon != null) {
			setSpaceCommon(spaceCommon);
		}

		Integer spaceLiving = (Integer)attributes.get("spaceLiving");

		if (spaceLiving != null) {
			setSpaceLiving(spaceLiving);
		}

		Integer roomCnt = (Integer)attributes.get("roomCnt");

		if (roomCnt != null) {
			setRoomCnt(roomCnt);
		}

		Integer floor = (Integer)attributes.get("floor");

		if (floor != null) {
			setFloor(floor);
		}

		String number = (String)attributes.get("number");

		if (number != null) {
			setNumber(number);
		}

		Long addressId = (Long)attributes.get("addressId");

		if (addressId != null) {
			setAddressId(addressId);
		}
	}

	public long getFlatId() {
		return _flatId;
	}

	public void setFlatId(long flatId) {
		_flatId = flatId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setFlatId", long.class);

				method.invoke(_flatRemoteModel, flatId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getTsgId() {
		return _tsgId;
	}

	public void setTsgId(long tsgId) {
		_tsgId = tsgId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setTsgId", long.class);

				method.invoke(_flatRemoteModel, tsgId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_flatRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_flatRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_flatRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_flatRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getHouseId() {
		return _houseId;
	}

	public void setHouseId(long houseId) {
		_houseId = houseId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setHouseId", long.class);

				method.invoke(_flatRemoteModel, houseId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getOwnersCnt() {
		return _ownersCnt;
	}

	public void setOwnersCnt(long ownersCnt) {
		_ownersCnt = ownersCnt;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnersCnt", long.class);

				method.invoke(_flatRemoteModel, ownersCnt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getTenantsCnt() {
		return _tenantsCnt;
	}

	public void setTenantsCnt(long tenantsCnt) {
		_tenantsCnt = tenantsCnt;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setTenantsCnt", long.class);

				method.invoke(_flatRemoteModel, tenantsCnt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getSpaceCommon() {
		return _spaceCommon;
	}

	public void setSpaceCommon(int spaceCommon) {
		_spaceCommon = spaceCommon;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setSpaceCommon", int.class);

				method.invoke(_flatRemoteModel, spaceCommon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getSpaceLiving() {
		return _spaceLiving;
	}

	public void setSpaceLiving(int spaceLiving) {
		_spaceLiving = spaceLiving;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setSpaceLiving", int.class);

				method.invoke(_flatRemoteModel, spaceLiving);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getRoomCnt() {
		return _roomCnt;
	}

	public void setRoomCnt(int roomCnt) {
		_roomCnt = roomCnt;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setRoomCnt", int.class);

				method.invoke(_flatRemoteModel, roomCnt);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getFloor() {
		return _floor;
	}

	public void setFloor(int floor) {
		_floor = floor;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setFloor", int.class);

				method.invoke(_flatRemoteModel, floor);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String number) {
		_number = number;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setNumber", String.class);

				method.invoke(_flatRemoteModel, number);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getAddressId() {
		return _addressId;
	}

	public void setAddressId(long addressId) {
		_addressId = addressId;

		if (_flatRemoteModel != null) {
			try {
				Class<?> clazz = _flatRemoteModel.getClass();

				Method method = clazz.getMethod("setAddressId", long.class);

				method.invoke(_flatRemoteModel, addressId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFlatRemoteModel() {
		return _flatRemoteModel;
	}

	public void setFlatRemoteModel(BaseModel<?> flatRemoteModel) {
		_flatRemoteModel = flatRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _flatRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_flatRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FlatLocalServiceUtil.addFlat(this);
		}
		else {
			FlatLocalServiceUtil.updateFlat(this);
		}
	}

	@Override
	public Flat toEscapedModel() {
		return (Flat)ProxyUtil.newProxyInstance(Flat.class.getClassLoader(),
			new Class[] { Flat.class }, new AutoEscapeBeanHandler(this));
	}

	public Flat toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		FlatClp clone = new FlatClp();

		clone.setFlatId(getFlatId());
		clone.setTsgId(getTsgId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setHouseId(getHouseId());
		clone.setOwnersCnt(getOwnersCnt());
		clone.setTenantsCnt(getTenantsCnt());
		clone.setSpaceCommon(getSpaceCommon());
		clone.setSpaceLiving(getSpaceLiving());
		clone.setRoomCnt(getRoomCnt());
		clone.setFloor(getFloor());
		clone.setNumber(getNumber());
		clone.setAddressId(getAddressId());

		return clone;
	}

	public int compareTo(Flat flat) {
		int value = 0;

		if (getFlatId() < flat.getFlatId()) {
			value = -1;
		}
		else if (getFlatId() > flat.getFlatId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FlatClp)) {
			return false;
		}

		FlatClp flat = (FlatClp)obj;

		long primaryKey = flat.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{flatId=");
		sb.append(getFlatId());
		sb.append(", tsgId=");
		sb.append(getTsgId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", houseId=");
		sb.append(getHouseId());
		sb.append(", ownersCnt=");
		sb.append(getOwnersCnt());
		sb.append(", tenantsCnt=");
		sb.append(getTenantsCnt());
		sb.append(", spaceCommon=");
		sb.append(getSpaceCommon());
		sb.append(", spaceLiving=");
		sb.append(getSpaceLiving());
		sb.append(", roomCnt=");
		sb.append(getRoomCnt());
		sb.append(", floor=");
		sb.append(getFloor());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", addressId=");
		sb.append(getAddressId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("tsg.model.Flat");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>flatId</column-name><column-value><![CDATA[");
		sb.append(getFlatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tsgId</column-name><column-value><![CDATA[");
		sb.append(getTsgId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>houseId</column-name><column-value><![CDATA[");
		sb.append(getHouseId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownersCnt</column-name><column-value><![CDATA[");
		sb.append(getOwnersCnt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tenantsCnt</column-name><column-value><![CDATA[");
		sb.append(getTenantsCnt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spaceCommon</column-name><column-value><![CDATA[");
		sb.append(getSpaceCommon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>spaceLiving</column-name><column-value><![CDATA[");
		sb.append(getSpaceLiving());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roomCnt</column-name><column-value><![CDATA[");
		sb.append(getRoomCnt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>floor</column-name><column-value><![CDATA[");
		sb.append(getFloor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append(getNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>addressId</column-name><column-value><![CDATA[");
		sb.append(getAddressId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _flatId;
	private long _tsgId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _flatRemoteModel;
}