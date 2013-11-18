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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Flat service. Represents a row in the &quot;tsg_Flat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tsg.model.impl.FlatModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tsg.model.impl.FlatImpl}.
 * </p>
 *
 * @author Whitemonk
 * @see Flat
 * @see tsg.model.impl.FlatImpl
 * @see tsg.model.impl.FlatModelImpl
 * @generated
 */
public interface FlatModel extends BaseModel<Flat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a flat model instance should use the {@link Flat} interface instead.
	 */

	/**
	 * Returns the primary key of this flat.
	 *
	 * @return the primary key of this flat
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this flat.
	 *
	 * @param primaryKey the primary key of this flat
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the flat ID of this flat.
	 *
	 * @return the flat ID of this flat
	 */
	public long getFlatId();

	/**
	 * Sets the flat ID of this flat.
	 *
	 * @param flatId the flat ID of this flat
	 */
	public void setFlatId(long flatId);

	/**
	 * Returns the tsg ID of this flat.
	 *
	 * @return the tsg ID of this flat
	 */
	public long getTsgId();

	/**
	 * Sets the tsg ID of this flat.
	 *
	 * @param tsgId the tsg ID of this flat
	 */
	public void setTsgId(long tsgId);

	/**
	 * Returns the company ID of this flat.
	 *
	 * @return the company ID of this flat
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this flat.
	 *
	 * @param companyId the company ID of this flat
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this flat.
	 *
	 * @return the user ID of this flat
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this flat.
	 *
	 * @param userId the user ID of this flat
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this flat.
	 *
	 * @return the user uuid of this flat
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this flat.
	 *
	 * @param userUuid the user uuid of this flat
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this flat.
	 *
	 * @return the create date of this flat
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this flat.
	 *
	 * @param createDate the create date of this flat
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this flat.
	 *
	 * @return the modified date of this flat
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this flat.
	 *
	 * @param modifiedDate the modified date of this flat
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the house ID of this flat.
	 *
	 * @return the house ID of this flat
	 */
	public long getHouseId();

	/**
	 * Sets the house ID of this flat.
	 *
	 * @param houseId the house ID of this flat
	 */
	public void setHouseId(long houseId);

	/**
	 * Returns the owners cnt of this flat.
	 *
	 * @return the owners cnt of this flat
	 */
	public long getOwnersCnt();

	/**
	 * Sets the owners cnt of this flat.
	 *
	 * @param ownersCnt the owners cnt of this flat
	 */
	public void setOwnersCnt(long ownersCnt);

	/**
	 * Returns the tenants cnt of this flat.
	 *
	 * @return the tenants cnt of this flat
	 */
	public long getTenantsCnt();

	/**
	 * Sets the tenants cnt of this flat.
	 *
	 * @param tenantsCnt the tenants cnt of this flat
	 */
	public void setTenantsCnt(long tenantsCnt);

	/**
	 * Returns the space common of this flat.
	 *
	 * @return the space common of this flat
	 */
	public int getSpaceCommon();

	/**
	 * Sets the space common of this flat.
	 *
	 * @param spaceCommon the space common of this flat
	 */
	public void setSpaceCommon(int spaceCommon);

	/**
	 * Returns the space living of this flat.
	 *
	 * @return the space living of this flat
	 */
	public int getSpaceLiving();

	/**
	 * Sets the space living of this flat.
	 *
	 * @param spaceLiving the space living of this flat
	 */
	public void setSpaceLiving(int spaceLiving);

	/**
	 * Returns the room cnt of this flat.
	 *
	 * @return the room cnt of this flat
	 */
	public int getRoomCnt();

	/**
	 * Sets the room cnt of this flat.
	 *
	 * @param roomCnt the room cnt of this flat
	 */
	public void setRoomCnt(int roomCnt);

	/**
	 * Returns the floor of this flat.
	 *
	 * @return the floor of this flat
	 */
	public int getFloor();

	/**
	 * Sets the floor of this flat.
	 *
	 * @param floor the floor of this flat
	 */
	public void setFloor(int floor);

	/**
	 * Returns the number of this flat.
	 *
	 * @return the number of this flat
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this flat.
	 *
	 * @param number the number of this flat
	 */
	public void setNumber(String number);

	/**
	 * Returns the address ID of this flat.
	 *
	 * @return the address ID of this flat
	 */
	public long getAddressId();

	/**
	 * Sets the address ID of this flat.
	 *
	 * @param addressId the address ID of this flat
	 */
	public void setAddressId(long addressId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Flat flat);

	public int hashCode();

	public CacheModel<Flat> toCacheModel();

	public Flat toEscapedModel();

	public Flat toUnescapedModel();

	public String toString();

	public String toXmlString();
}