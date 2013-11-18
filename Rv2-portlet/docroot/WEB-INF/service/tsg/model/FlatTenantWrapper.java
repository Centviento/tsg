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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FlatTenant}.
 * </p>
 *
 * @author    Whitemonk
 * @see       FlatTenant
 * @generated
 */
public class FlatTenantWrapper implements FlatTenant, ModelWrapper<FlatTenant> {
	public FlatTenantWrapper(FlatTenant flatTenant) {
		_flatTenant = flatTenant;
	}

	public Class<?> getModelClass() {
		return FlatTenant.class;
	}

	public String getModelClassName() {
		return FlatTenant.class.getName();
	}

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

	/**
	* Returns the primary key of this flat tenant.
	*
	* @return the primary key of this flat tenant
	*/
	public long getPrimaryKey() {
		return _flatTenant.getPrimaryKey();
	}

	/**
	* Sets the primary key of this flat tenant.
	*
	* @param primaryKey the primary key of this flat tenant
	*/
	public void setPrimaryKey(long primaryKey) {
		_flatTenant.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this flat tenant.
	*
	* @return the ID of this flat tenant
	*/
	public long getId() {
		return _flatTenant.getId();
	}

	/**
	* Sets the ID of this flat tenant.
	*
	* @param id the ID of this flat tenant
	*/
	public void setId(long id) {
		_flatTenant.setId(id);
	}

	/**
	* Returns the company ID of this flat tenant.
	*
	* @return the company ID of this flat tenant
	*/
	public long getCompanyId() {
		return _flatTenant.getCompanyId();
	}

	/**
	* Sets the company ID of this flat tenant.
	*
	* @param companyId the company ID of this flat tenant
	*/
	public void setCompanyId(long companyId) {
		_flatTenant.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this flat tenant.
	*
	* @return the user ID of this flat tenant
	*/
	public long getUserId() {
		return _flatTenant.getUserId();
	}

	/**
	* Sets the user ID of this flat tenant.
	*
	* @param userId the user ID of this flat tenant
	*/
	public void setUserId(long userId) {
		_flatTenant.setUserId(userId);
	}

	/**
	* Returns the user uuid of this flat tenant.
	*
	* @return the user uuid of this flat tenant
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenant.getUserUuid();
	}

	/**
	* Sets the user uuid of this flat tenant.
	*
	* @param userUuid the user uuid of this flat tenant
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_flatTenant.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this flat tenant.
	*
	* @return the create date of this flat tenant
	*/
	public java.util.Date getCreateDate() {
		return _flatTenant.getCreateDate();
	}

	/**
	* Sets the create date of this flat tenant.
	*
	* @param createDate the create date of this flat tenant
	*/
	public void setCreateDate(java.util.Date createDate) {
		_flatTenant.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this flat tenant.
	*
	* @return the modified date of this flat tenant
	*/
	public java.util.Date getModifiedDate() {
		return _flatTenant.getModifiedDate();
	}

	/**
	* Sets the modified date of this flat tenant.
	*
	* @param modifiedDate the modified date of this flat tenant
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_flatTenant.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the tenant ID of this flat tenant.
	*
	* @return the tenant ID of this flat tenant
	*/
	public long getTenantId() {
		return _flatTenant.getTenantId();
	}

	/**
	* Sets the tenant ID of this flat tenant.
	*
	* @param tenantId the tenant ID of this flat tenant
	*/
	public void setTenantId(long tenantId) {
		_flatTenant.setTenantId(tenantId);
	}

	/**
	* Returns the flat ID of this flat tenant.
	*
	* @return the flat ID of this flat tenant
	*/
	public long getFlatId() {
		return _flatTenant.getFlatId();
	}

	/**
	* Sets the flat ID of this flat tenant.
	*
	* @param flatId the flat ID of this flat tenant
	*/
	public void setFlatId(long flatId) {
		_flatTenant.setFlatId(flatId);
	}

	/**
	* Returns the tsg ID of this flat tenant.
	*
	* @return the tsg ID of this flat tenant
	*/
	public long getTsgId() {
		return _flatTenant.getTsgId();
	}

	/**
	* Sets the tsg ID of this flat tenant.
	*
	* @param tsgId the tsg ID of this flat tenant
	*/
	public void setTsgId(long tsgId) {
		_flatTenant.setTsgId(tsgId);
	}

	/**
	* Returns the from date of this flat tenant.
	*
	* @return the from date of this flat tenant
	*/
	public java.util.Date getFromDate() {
		return _flatTenant.getFromDate();
	}

	/**
	* Sets the from date of this flat tenant.
	*
	* @param fromDate the from date of this flat tenant
	*/
	public void setFromDate(java.util.Date fromDate) {
		_flatTenant.setFromDate(fromDate);
	}

	/**
	* Returns the to date of this flat tenant.
	*
	* @return the to date of this flat tenant
	*/
	public java.util.Date getToDate() {
		return _flatTenant.getToDate();
	}

	/**
	* Sets the to date of this flat tenant.
	*
	* @param toDate the to date of this flat tenant
	*/
	public void setToDate(java.util.Date toDate) {
		_flatTenant.setToDate(toDate);
	}

	public boolean isNew() {
		return _flatTenant.isNew();
	}

	public void setNew(boolean n) {
		_flatTenant.setNew(n);
	}

	public boolean isCachedModel() {
		return _flatTenant.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_flatTenant.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _flatTenant.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _flatTenant.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_flatTenant.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _flatTenant.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_flatTenant.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FlatTenantWrapper((FlatTenant)_flatTenant.clone());
	}

	public int compareTo(tsg.model.FlatTenant flatTenant) {
		return _flatTenant.compareTo(flatTenant);
	}

	@Override
	public int hashCode() {
		return _flatTenant.hashCode();
	}

	public com.liferay.portal.model.CacheModel<tsg.model.FlatTenant> toCacheModel() {
		return _flatTenant.toCacheModel();
	}

	public tsg.model.FlatTenant toEscapedModel() {
		return new FlatTenantWrapper(_flatTenant.toEscapedModel());
	}

	public tsg.model.FlatTenant toUnescapedModel() {
		return new FlatTenantWrapper(_flatTenant.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _flatTenant.toString();
	}

	public java.lang.String toXmlString() {
		return _flatTenant.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_flatTenant.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FlatTenantWrapper)) {
			return false;
		}

		FlatTenantWrapper flatTenantWrapper = (FlatTenantWrapper)obj;

		if (Validator.equals(_flatTenant, flatTenantWrapper._flatTenant)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FlatTenant getWrappedFlatTenant() {
		return _flatTenant;
	}

	public FlatTenant getWrappedModel() {
		return _flatTenant;
	}

	public void resetOriginalValues() {
		_flatTenant.resetOriginalValues();
	}

	private FlatTenant _flatTenant;
}