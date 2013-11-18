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
import tsg.service.FlatOwnerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Whitemonk
 */
public class FlatOwnerClp extends BaseModelImpl<FlatOwner> implements FlatOwner {
	public FlatOwnerClp() {
	}

	public Class<?> getModelClass() {
		return FlatOwner.class;
	}

	public String getModelClassName() {
		return FlatOwner.class.getName();
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ownerId", getOwnerId());
		attributes.put("tsgId", getTsgId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("flatId", getFlatId());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());
		attributes.put("percent", getPercent());
		attributes.put("area", getArea());
		attributes.put("shared", getShared());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long ownerId = (Long)attributes.get("ownerId");

		if (ownerId != null) {
			setOwnerId(ownerId);
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

		Long flatId = (Long)attributes.get("flatId");

		if (flatId != null) {
			setFlatId(flatId);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}

		Integer percent = (Integer)attributes.get("percent");

		if (percent != null) {
			setPercent(percent);
		}

		Integer area = (Integer)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		Boolean shared = (Boolean)attributes.get("shared");

		if (shared != null) {
			setShared(shared);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_flatOwnerRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getOwnerId() {
		return _ownerId;
	}

	public void setOwnerId(long ownerId) {
		_ownerId = ownerId;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setOwnerId", long.class);

				method.invoke(_flatOwnerRemoteModel, ownerId);
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

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setTsgId", long.class);

				method.invoke(_flatOwnerRemoteModel, tsgId);
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

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_flatOwnerRemoteModel, companyId);
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

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_flatOwnerRemoteModel, userId);
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

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_flatOwnerRemoteModel, createDate);
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

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_flatOwnerRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getFlatId() {
		return _flatId;
	}

	public void setFlatId(long flatId) {
		_flatId = flatId;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setFlatId", long.class);

				method.invoke(_flatOwnerRemoteModel, flatId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getFromDate() {
		return _fromDate;
	}

	public void setFromDate(Date fromDate) {
		_fromDate = fromDate;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setFromDate", Date.class);

				method.invoke(_flatOwnerRemoteModel, fromDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public Date getToDate() {
		return _toDate;
	}

	public void setToDate(Date toDate) {
		_toDate = toDate;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setToDate", Date.class);

				method.invoke(_flatOwnerRemoteModel, toDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getPercent() {
		return _percent;
	}

	public void setPercent(int percent) {
		_percent = percent;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setPercent", int.class);

				method.invoke(_flatOwnerRemoteModel, percent);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public int getArea() {
		return _area;
	}

	public void setArea(int area) {
		_area = area;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setArea", int.class);

				method.invoke(_flatOwnerRemoteModel, area);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public boolean getShared() {
		return _shared;
	}

	public boolean isShared() {
		return _shared;
	}

	public void setShared(boolean shared) {
		_shared = shared;

		if (_flatOwnerRemoteModel != null) {
			try {
				Class<?> clazz = _flatOwnerRemoteModel.getClass();

				Method method = clazz.getMethod("setShared", boolean.class);

				method.invoke(_flatOwnerRemoteModel, shared);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFlatOwnerRemoteModel() {
		return _flatOwnerRemoteModel;
	}

	public void setFlatOwnerRemoteModel(BaseModel<?> flatOwnerRemoteModel) {
		_flatOwnerRemoteModel = flatOwnerRemoteModel;
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

		Class<?> remoteModelClass = _flatOwnerRemoteModel.getClass();

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

		Object returnValue = method.invoke(_flatOwnerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FlatOwnerLocalServiceUtil.addFlatOwner(this);
		}
		else {
			FlatOwnerLocalServiceUtil.updateFlatOwner(this);
		}
	}

	@Override
	public FlatOwner toEscapedModel() {
		return (FlatOwner)ProxyUtil.newProxyInstance(FlatOwner.class.getClassLoader(),
			new Class[] { FlatOwner.class }, new AutoEscapeBeanHandler(this));
	}

	public FlatOwner toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		FlatOwnerClp clone = new FlatOwnerClp();

		clone.setId(getId());
		clone.setOwnerId(getOwnerId());
		clone.setTsgId(getTsgId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setFlatId(getFlatId());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());
		clone.setPercent(getPercent());
		clone.setArea(getArea());
		clone.setShared(getShared());

		return clone;
	}

	public int compareTo(FlatOwner flatOwner) {
		long primaryKey = flatOwner.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FlatOwnerClp)) {
			return false;
		}

		FlatOwnerClp flatOwner = (FlatOwnerClp)obj;

		long primaryKey = flatOwner.getPrimaryKey();

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
		StringBundler sb = new StringBundler(27);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ownerId=");
		sb.append(getOwnerId());
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
		sb.append(", flatId=");
		sb.append(getFlatId());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append(", percent=");
		sb.append(getPercent());
		sb.append(", area=");
		sb.append(getArea());
		sb.append(", shared=");
		sb.append(getShared());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("tsg.model.FlatOwner");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ownerId</column-name><column-value><![CDATA[");
		sb.append(getOwnerId());
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
			"<column><column-name>flatId</column-name><column-value><![CDATA[");
		sb.append(getFlatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>percent</column-name><column-value><![CDATA[");
		sb.append(getPercent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>area</column-name><column-value><![CDATA[");
		sb.append(getArea());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shared</column-name><column-value><![CDATA[");
		sb.append(getShared());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _ownerId;
	private long _tsgId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _flatId;
	private Date _fromDate;
	private Date _toDate;
	private int _percent;
	private int _area;
	private boolean _shared;
	private BaseModel<?> _flatOwnerRemoteModel;
}