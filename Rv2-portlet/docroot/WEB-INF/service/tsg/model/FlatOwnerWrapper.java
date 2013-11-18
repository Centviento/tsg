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
 * This class is a wrapper for {@link FlatOwner}.
 * </p>
 *
 * @author    Whitemonk
 * @see       FlatOwner
 * @generated
 */
public class FlatOwnerWrapper implements FlatOwner, ModelWrapper<FlatOwner> {
	public FlatOwnerWrapper(FlatOwner flatOwner) {
		_flatOwner = flatOwner;
	}

	public Class<?> getModelClass() {
		return FlatOwner.class;
	}

	public String getModelClassName() {
		return FlatOwner.class.getName();
	}

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

	/**
	* Returns the primary key of this flat owner.
	*
	* @return the primary key of this flat owner
	*/
	public long getPrimaryKey() {
		return _flatOwner.getPrimaryKey();
	}

	/**
	* Sets the primary key of this flat owner.
	*
	* @param primaryKey the primary key of this flat owner
	*/
	public void setPrimaryKey(long primaryKey) {
		_flatOwner.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this flat owner.
	*
	* @return the ID of this flat owner
	*/
	public long getId() {
		return _flatOwner.getId();
	}

	/**
	* Sets the ID of this flat owner.
	*
	* @param id the ID of this flat owner
	*/
	public void setId(long id) {
		_flatOwner.setId(id);
	}

	/**
	* Returns the owner ID of this flat owner.
	*
	* @return the owner ID of this flat owner
	*/
	public long getOwnerId() {
		return _flatOwner.getOwnerId();
	}

	/**
	* Sets the owner ID of this flat owner.
	*
	* @param ownerId the owner ID of this flat owner
	*/
	public void setOwnerId(long ownerId) {
		_flatOwner.setOwnerId(ownerId);
	}

	/**
	* Returns the tsg ID of this flat owner.
	*
	* @return the tsg ID of this flat owner
	*/
	public long getTsgId() {
		return _flatOwner.getTsgId();
	}

	/**
	* Sets the tsg ID of this flat owner.
	*
	* @param tsgId the tsg ID of this flat owner
	*/
	public void setTsgId(long tsgId) {
		_flatOwner.setTsgId(tsgId);
	}

	/**
	* Returns the company ID of this flat owner.
	*
	* @return the company ID of this flat owner
	*/
	public long getCompanyId() {
		return _flatOwner.getCompanyId();
	}

	/**
	* Sets the company ID of this flat owner.
	*
	* @param companyId the company ID of this flat owner
	*/
	public void setCompanyId(long companyId) {
		_flatOwner.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this flat owner.
	*
	* @return the user ID of this flat owner
	*/
	public long getUserId() {
		return _flatOwner.getUserId();
	}

	/**
	* Sets the user ID of this flat owner.
	*
	* @param userId the user ID of this flat owner
	*/
	public void setUserId(long userId) {
		_flatOwner.setUserId(userId);
	}

	/**
	* Returns the user uuid of this flat owner.
	*
	* @return the user uuid of this flat owner
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatOwner.getUserUuid();
	}

	/**
	* Sets the user uuid of this flat owner.
	*
	* @param userUuid the user uuid of this flat owner
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_flatOwner.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this flat owner.
	*
	* @return the create date of this flat owner
	*/
	public java.util.Date getCreateDate() {
		return _flatOwner.getCreateDate();
	}

	/**
	* Sets the create date of this flat owner.
	*
	* @param createDate the create date of this flat owner
	*/
	public void setCreateDate(java.util.Date createDate) {
		_flatOwner.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this flat owner.
	*
	* @return the modified date of this flat owner
	*/
	public java.util.Date getModifiedDate() {
		return _flatOwner.getModifiedDate();
	}

	/**
	* Sets the modified date of this flat owner.
	*
	* @param modifiedDate the modified date of this flat owner
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_flatOwner.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the flat ID of this flat owner.
	*
	* @return the flat ID of this flat owner
	*/
	public long getFlatId() {
		return _flatOwner.getFlatId();
	}

	/**
	* Sets the flat ID of this flat owner.
	*
	* @param flatId the flat ID of this flat owner
	*/
	public void setFlatId(long flatId) {
		_flatOwner.setFlatId(flatId);
	}

	/**
	* Returns the from date of this flat owner.
	*
	* @return the from date of this flat owner
	*/
	public java.util.Date getFromDate() {
		return _flatOwner.getFromDate();
	}

	/**
	* Sets the from date of this flat owner.
	*
	* @param fromDate the from date of this flat owner
	*/
	public void setFromDate(java.util.Date fromDate) {
		_flatOwner.setFromDate(fromDate);
	}

	/**
	* Returns the to date of this flat owner.
	*
	* @return the to date of this flat owner
	*/
	public java.util.Date getToDate() {
		return _flatOwner.getToDate();
	}

	/**
	* Sets the to date of this flat owner.
	*
	* @param toDate the to date of this flat owner
	*/
	public void setToDate(java.util.Date toDate) {
		_flatOwner.setToDate(toDate);
	}

	/**
	* Returns the percent of this flat owner.
	*
	* @return the percent of this flat owner
	*/
	public int getPercent() {
		return _flatOwner.getPercent();
	}

	/**
	* Sets the percent of this flat owner.
	*
	* @param percent the percent of this flat owner
	*/
	public void setPercent(int percent) {
		_flatOwner.setPercent(percent);
	}

	/**
	* Returns the area of this flat owner.
	*
	* @return the area of this flat owner
	*/
	public int getArea() {
		return _flatOwner.getArea();
	}

	/**
	* Sets the area of this flat owner.
	*
	* @param area the area of this flat owner
	*/
	public void setArea(int area) {
		_flatOwner.setArea(area);
	}

	/**
	* Returns the shared of this flat owner.
	*
	* @return the shared of this flat owner
	*/
	public boolean getShared() {
		return _flatOwner.getShared();
	}

	/**
	* Returns <code>true</code> if this flat owner is shared.
	*
	* @return <code>true</code> if this flat owner is shared; <code>false</code> otherwise
	*/
	public boolean isShared() {
		return _flatOwner.isShared();
	}

	/**
	* Sets whether this flat owner is shared.
	*
	* @param shared the shared of this flat owner
	*/
	public void setShared(boolean shared) {
		_flatOwner.setShared(shared);
	}

	public boolean isNew() {
		return _flatOwner.isNew();
	}

	public void setNew(boolean n) {
		_flatOwner.setNew(n);
	}

	public boolean isCachedModel() {
		return _flatOwner.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_flatOwner.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _flatOwner.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _flatOwner.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_flatOwner.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _flatOwner.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_flatOwner.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FlatOwnerWrapper((FlatOwner)_flatOwner.clone());
	}

	public int compareTo(tsg.model.FlatOwner flatOwner) {
		return _flatOwner.compareTo(flatOwner);
	}

	@Override
	public int hashCode() {
		return _flatOwner.hashCode();
	}

	public com.liferay.portal.model.CacheModel<tsg.model.FlatOwner> toCacheModel() {
		return _flatOwner.toCacheModel();
	}

	public tsg.model.FlatOwner toEscapedModel() {
		return new FlatOwnerWrapper(_flatOwner.toEscapedModel());
	}

	public tsg.model.FlatOwner toUnescapedModel() {
		return new FlatOwnerWrapper(_flatOwner.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _flatOwner.toString();
	}

	public java.lang.String toXmlString() {
		return _flatOwner.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_flatOwner.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FlatOwnerWrapper)) {
			return false;
		}

		FlatOwnerWrapper flatOwnerWrapper = (FlatOwnerWrapper)obj;

		if (Validator.equals(_flatOwner, flatOwnerWrapper._flatOwner)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public FlatOwner getWrappedFlatOwner() {
		return _flatOwner;
	}

	public FlatOwner getWrappedModel() {
		return _flatOwner;
	}

	public void resetOriginalValues() {
		_flatOwner.resetOriginalValues();
	}

	private FlatOwner _flatOwner;
}