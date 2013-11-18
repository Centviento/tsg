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
 * This class is a wrapper for {@link Flat}.
 * </p>
 *
 * @author    Whitemonk
 * @see       Flat
 * @generated
 */
public class FlatWrapper implements Flat, ModelWrapper<Flat> {
	public FlatWrapper(Flat flat) {
		_flat = flat;
	}

	public Class<?> getModelClass() {
		return Flat.class;
	}

	public String getModelClassName() {
		return Flat.class.getName();
	}

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

	/**
	* Returns the primary key of this flat.
	*
	* @return the primary key of this flat
	*/
	public long getPrimaryKey() {
		return _flat.getPrimaryKey();
	}

	/**
	* Sets the primary key of this flat.
	*
	* @param primaryKey the primary key of this flat
	*/
	public void setPrimaryKey(long primaryKey) {
		_flat.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the flat ID of this flat.
	*
	* @return the flat ID of this flat
	*/
	public long getFlatId() {
		return _flat.getFlatId();
	}

	/**
	* Sets the flat ID of this flat.
	*
	* @param flatId the flat ID of this flat
	*/
	public void setFlatId(long flatId) {
		_flat.setFlatId(flatId);
	}

	/**
	* Returns the tsg ID of this flat.
	*
	* @return the tsg ID of this flat
	*/
	public long getTsgId() {
		return _flat.getTsgId();
	}

	/**
	* Sets the tsg ID of this flat.
	*
	* @param tsgId the tsg ID of this flat
	*/
	public void setTsgId(long tsgId) {
		_flat.setTsgId(tsgId);
	}

	/**
	* Returns the company ID of this flat.
	*
	* @return the company ID of this flat
	*/
	public long getCompanyId() {
		return _flat.getCompanyId();
	}

	/**
	* Sets the company ID of this flat.
	*
	* @param companyId the company ID of this flat
	*/
	public void setCompanyId(long companyId) {
		_flat.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this flat.
	*
	* @return the user ID of this flat
	*/
	public long getUserId() {
		return _flat.getUserId();
	}

	/**
	* Sets the user ID of this flat.
	*
	* @param userId the user ID of this flat
	*/
	public void setUserId(long userId) {
		_flat.setUserId(userId);
	}

	/**
	* Returns the user uuid of this flat.
	*
	* @return the user uuid of this flat
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flat.getUserUuid();
	}

	/**
	* Sets the user uuid of this flat.
	*
	* @param userUuid the user uuid of this flat
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_flat.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this flat.
	*
	* @return the create date of this flat
	*/
	public java.util.Date getCreateDate() {
		return _flat.getCreateDate();
	}

	/**
	* Sets the create date of this flat.
	*
	* @param createDate the create date of this flat
	*/
	public void setCreateDate(java.util.Date createDate) {
		_flat.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this flat.
	*
	* @return the modified date of this flat
	*/
	public java.util.Date getModifiedDate() {
		return _flat.getModifiedDate();
	}

	/**
	* Sets the modified date of this flat.
	*
	* @param modifiedDate the modified date of this flat
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_flat.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the house ID of this flat.
	*
	* @return the house ID of this flat
	*/
	public long getHouseId() {
		return _flat.getHouseId();
	}

	/**
	* Sets the house ID of this flat.
	*
	* @param houseId the house ID of this flat
	*/
	public void setHouseId(long houseId) {
		_flat.setHouseId(houseId);
	}

	/**
	* Returns the owners cnt of this flat.
	*
	* @return the owners cnt of this flat
	*/
	public long getOwnersCnt() {
		return _flat.getOwnersCnt();
	}

	/**
	* Sets the owners cnt of this flat.
	*
	* @param ownersCnt the owners cnt of this flat
	*/
	public void setOwnersCnt(long ownersCnt) {
		_flat.setOwnersCnt(ownersCnt);
	}

	/**
	* Returns the tenants cnt of this flat.
	*
	* @return the tenants cnt of this flat
	*/
	public long getTenantsCnt() {
		return _flat.getTenantsCnt();
	}

	/**
	* Sets the tenants cnt of this flat.
	*
	* @param tenantsCnt the tenants cnt of this flat
	*/
	public void setTenantsCnt(long tenantsCnt) {
		_flat.setTenantsCnt(tenantsCnt);
	}

	/**
	* Returns the space common of this flat.
	*
	* @return the space common of this flat
	*/
	public int getSpaceCommon() {
		return _flat.getSpaceCommon();
	}

	/**
	* Sets the space common of this flat.
	*
	* @param spaceCommon the space common of this flat
	*/
	public void setSpaceCommon(int spaceCommon) {
		_flat.setSpaceCommon(spaceCommon);
	}

	/**
	* Returns the space living of this flat.
	*
	* @return the space living of this flat
	*/
	public int getSpaceLiving() {
		return _flat.getSpaceLiving();
	}

	/**
	* Sets the space living of this flat.
	*
	* @param spaceLiving the space living of this flat
	*/
	public void setSpaceLiving(int spaceLiving) {
		_flat.setSpaceLiving(spaceLiving);
	}

	/**
	* Returns the room cnt of this flat.
	*
	* @return the room cnt of this flat
	*/
	public int getRoomCnt() {
		return _flat.getRoomCnt();
	}

	/**
	* Sets the room cnt of this flat.
	*
	* @param roomCnt the room cnt of this flat
	*/
	public void setRoomCnt(int roomCnt) {
		_flat.setRoomCnt(roomCnt);
	}

	/**
	* Returns the floor of this flat.
	*
	* @return the floor of this flat
	*/
	public int getFloor() {
		return _flat.getFloor();
	}

	/**
	* Sets the floor of this flat.
	*
	* @param floor the floor of this flat
	*/
	public void setFloor(int floor) {
		_flat.setFloor(floor);
	}

	/**
	* Returns the number of this flat.
	*
	* @return the number of this flat
	*/
	public java.lang.String getNumber() {
		return _flat.getNumber();
	}

	/**
	* Sets the number of this flat.
	*
	* @param number the number of this flat
	*/
	public void setNumber(java.lang.String number) {
		_flat.setNumber(number);
	}

	/**
	* Returns the address ID of this flat.
	*
	* @return the address ID of this flat
	*/
	public long getAddressId() {
		return _flat.getAddressId();
	}

	/**
	* Sets the address ID of this flat.
	*
	* @param addressId the address ID of this flat
	*/
	public void setAddressId(long addressId) {
		_flat.setAddressId(addressId);
	}

	public boolean isNew() {
		return _flat.isNew();
	}

	public void setNew(boolean n) {
		_flat.setNew(n);
	}

	public boolean isCachedModel() {
		return _flat.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_flat.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _flat.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _flat.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_flat.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _flat.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_flat.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new FlatWrapper((Flat)_flat.clone());
	}

	public int compareTo(tsg.model.Flat flat) {
		return _flat.compareTo(flat);
	}

	@Override
	public int hashCode() {
		return _flat.hashCode();
	}

	public com.liferay.portal.model.CacheModel<tsg.model.Flat> toCacheModel() {
		return _flat.toCacheModel();
	}

	public tsg.model.Flat toEscapedModel() {
		return new FlatWrapper(_flat.toEscapedModel());
	}

	public tsg.model.Flat toUnescapedModel() {
		return new FlatWrapper(_flat.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _flat.toString();
	}

	public java.lang.String toXmlString() {
		return _flat.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_flat.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof FlatWrapper)) {
			return false;
		}

		FlatWrapper flatWrapper = (FlatWrapper)obj;

		if (Validator.equals(_flat, flatWrapper._flat)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Flat getWrappedFlat() {
		return _flat;
	}

	public Flat getWrappedModel() {
		return _flat;
	}

	public void resetOriginalValues() {
		_flat.resetOriginalValues();
	}

	private Flat _flat;
}