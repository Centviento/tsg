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
import tsg.service.FlatTenantLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Whitemonk
 */
public class FlatTenantClp extends BaseModelImpl<FlatTenant>
	implements FlatTenant {
	public FlatTenantClp() {
	}

	public Class<?> getModelClass() {
		return FlatTenant.class;
	}

	public String getModelClassName() {
		return FlatTenant.class.getName();
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
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tenantId", getTenantId());
		attributes.put("flatId", getFlatId());
		attributes.put("tsgId", getTsgId());
		attributes.put("fromDate", getFromDate());
		attributes.put("toDate", getToDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
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

		Long tenantId = (Long)attributes.get("tenantId");

		if (tenantId != null) {
			setTenantId(tenantId);
		}

		Long flatId = (Long)attributes.get("flatId");

		if (flatId != null) {
			setFlatId(flatId);
		}

		Long tsgId = (Long)attributes.get("tsgId");

		if (tsgId != null) {
			setTsgId(tsgId);
		}

		Date fromDate = (Date)attributes.get("fromDate");

		if (fromDate != null) {
			setFromDate(fromDate);
		}

		Date toDate = (Date)attributes.get("toDate");

		if (toDate != null) {
			setToDate(toDate);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_flatTenantRemoteModel, id);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_flatTenantRemoteModel, companyId);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_flatTenantRemoteModel, userId);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_flatTenantRemoteModel, createDate);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_flatTenantRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public long getTenantId() {
		return _tenantId;
	}

	public void setTenantId(long tenantId) {
		_tenantId = tenantId;

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setTenantId", long.class);

				method.invoke(_flatTenantRemoteModel, tenantId);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setFlatId", long.class);

				method.invoke(_flatTenantRemoteModel, flatId);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setTsgId", long.class);

				method.invoke(_flatTenantRemoteModel, tsgId);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setFromDate", Date.class);

				method.invoke(_flatTenantRemoteModel, fromDate);
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

		if (_flatTenantRemoteModel != null) {
			try {
				Class<?> clazz = _flatTenantRemoteModel.getClass();

				Method method = clazz.getMethod("setToDate", Date.class);

				method.invoke(_flatTenantRemoteModel, toDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getFlatTenantRemoteModel() {
		return _flatTenantRemoteModel;
	}

	public void setFlatTenantRemoteModel(BaseModel<?> flatTenantRemoteModel) {
		_flatTenantRemoteModel = flatTenantRemoteModel;
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

		Class<?> remoteModelClass = _flatTenantRemoteModel.getClass();

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

		Object returnValue = method.invoke(_flatTenantRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			FlatTenantLocalServiceUtil.addFlatTenant(this);
		}
		else {
			FlatTenantLocalServiceUtil.updateFlatTenant(this);
		}
	}

	@Override
	public FlatTenant toEscapedModel() {
		return (FlatTenant)ProxyUtil.newProxyInstance(FlatTenant.class.getClassLoader(),
			new Class[] { FlatTenant.class }, new AutoEscapeBeanHandler(this));
	}

	public FlatTenant toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		FlatTenantClp clone = new FlatTenantClp();

		clone.setId(getId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setTenantId(getTenantId());
		clone.setFlatId(getFlatId());
		clone.setTsgId(getTsgId());
		clone.setFromDate(getFromDate());
		clone.setToDate(getToDate());

		return clone;
	}

	public int compareTo(FlatTenant flatTenant) {
		long primaryKey = flatTenant.getPrimaryKey();

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

		if (!(obj instanceof FlatTenantClp)) {
			return false;
		}

		FlatTenantClp flatTenant = (FlatTenantClp)obj;

		long primaryKey = flatTenant.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", tenantId=");
		sb.append(getTenantId());
		sb.append(", flatId=");
		sb.append(getFlatId());
		sb.append(", tsgId=");
		sb.append(getTsgId());
		sb.append(", fromDate=");
		sb.append(getFromDate());
		sb.append(", toDate=");
		sb.append(getToDate());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("tsg.model.FlatTenant");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
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
			"<column><column-name>tenantId</column-name><column-value><![CDATA[");
		sb.append(getTenantId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flatId</column-name><column-value><![CDATA[");
		sb.append(getFlatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tsgId</column-name><column-value><![CDATA[");
		sb.append(getTsgId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromDate</column-name><column-value><![CDATA[");
		sb.append(getFromDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toDate</column-name><column-value><![CDATA[");
		sb.append(getToDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _tenantId;
	private long _flatId;
	private long _tsgId;
	private Date _fromDate;
	private Date _toDate;
	private BaseModel<?> _flatTenantRemoteModel;
}