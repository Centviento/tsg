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

package tsg.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import tsg.model.Flat;
import tsg.model.FlatModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Flat service. Represents a row in the &quot;tsg_Flat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link tsg.model.FlatModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FlatImpl}.
 * </p>
 *
 * @author Whitemonk
 * @see FlatImpl
 * @see tsg.model.Flat
 * @see tsg.model.FlatModel
 * @generated
 */
public class FlatModelImpl extends BaseModelImpl<Flat> implements FlatModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a flat model instance should use the {@link tsg.model.Flat} interface instead.
	 */
	public static final String TABLE_NAME = "tsg_Flat";
	public static final Object[][] TABLE_COLUMNS = {
			{ "flatId", Types.BIGINT },
			{ "tsgId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "houseId", Types.BIGINT },
			{ "ownersCnt", Types.BIGINT },
			{ "tenantsCnt", Types.BIGINT },
			{ "spaceCommon", Types.INTEGER },
			{ "spaceLiving", Types.INTEGER },
			{ "roomCnt", Types.INTEGER },
			{ "floor", Types.INTEGER },
			{ "number_", Types.VARCHAR },
			{ "addressId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table tsg_Flat (flatId LONG not null primary key,tsgId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,houseId LONG,ownersCnt LONG,tenantsCnt LONG,spaceCommon INTEGER,spaceLiving INTEGER,roomCnt INTEGER,floor INTEGER,number_ VARCHAR(75) null,addressId LONG)";
	public static final String TABLE_SQL_DROP = "drop table tsg_Flat";
	public static final String ORDER_BY_JPQL = " ORDER BY flat.flatId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY tsg_Flat.flatId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.tsg.model.Flat"), true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.tsg.model.Flat"), true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.tsg.model.Flat"), true);
	public static long ADDRESSID_COLUMN_BITMASK = 1L;
	public static long HOUSEID_COLUMN_BITMASK = 2L;
	public static long ROOMCNT_COLUMN_BITMASK = 4L;
	public static long TSGID_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.tsg.model.Flat"));

	public FlatModelImpl() {
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

	public Class<?> getModelClass() {
		return Flat.class;
	}

	public String getModelClassName() {
		return Flat.class.getName();
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
		_columnBitmask = -1L;

		_flatId = flatId;
	}

	public long getTsgId() {
		return _tsgId;
	}

	public void setTsgId(long tsgId) {
		_columnBitmask |= TSGID_COLUMN_BITMASK;

		if (!_setOriginalTsgId) {
			_setOriginalTsgId = true;

			_originalTsgId = _tsgId;
		}

		_tsgId = tsgId;
	}

	public long getOriginalTsgId() {
		return _originalTsgId;
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
		_columnBitmask |= HOUSEID_COLUMN_BITMASK;

		if (!_setOriginalHouseId) {
			_setOriginalHouseId = true;

			_originalHouseId = _houseId;
		}

		_houseId = houseId;
	}

	public long getOriginalHouseId() {
		return _originalHouseId;
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
		_columnBitmask |= ROOMCNT_COLUMN_BITMASK;

		if (!_setOriginalRoomCnt) {
			_setOriginalRoomCnt = true;

			_originalRoomCnt = _roomCnt;
		}

		_roomCnt = roomCnt;
	}

	public int getOriginalRoomCnt() {
		return _originalRoomCnt;
	}

	public int getFloor() {
		return _floor;
	}

	public void setFloor(int floor) {
		_floor = floor;
	}

	public String getNumber() {
		if (_number == null) {
			return StringPool.BLANK;
		}
		else {
			return _number;
		}
	}

	public void setNumber(String number) {
		_number = number;
	}

	public long getAddressId() {
		return _addressId;
	}

	public void setAddressId(long addressId) {
		_columnBitmask |= ADDRESSID_COLUMN_BITMASK;

		if (!_setOriginalAddressId) {
			_setOriginalAddressId = true;

			_originalAddressId = _addressId;
		}

		_addressId = addressId;
	}

	public long getOriginalAddressId() {
		return _originalAddressId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Flat.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Flat toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Flat)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	public Flat toUnescapedModel() {
		return (Flat)this;
	}

	@Override
	public Object clone() {
		FlatImpl flatImpl = new FlatImpl();

		flatImpl.setFlatId(getFlatId());
		flatImpl.setTsgId(getTsgId());
		flatImpl.setCompanyId(getCompanyId());
		flatImpl.setUserId(getUserId());
		flatImpl.setCreateDate(getCreateDate());
		flatImpl.setModifiedDate(getModifiedDate());
		flatImpl.setHouseId(getHouseId());
		flatImpl.setOwnersCnt(getOwnersCnt());
		flatImpl.setTenantsCnt(getTenantsCnt());
		flatImpl.setSpaceCommon(getSpaceCommon());
		flatImpl.setSpaceLiving(getSpaceLiving());
		flatImpl.setRoomCnt(getRoomCnt());
		flatImpl.setFloor(getFloor());
		flatImpl.setNumber(getNumber());
		flatImpl.setAddressId(getAddressId());

		flatImpl.resetOriginalValues();

		return flatImpl;
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

		if (!(obj instanceof Flat)) {
			return false;
		}

		Flat flat = (Flat)obj;

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
	public void resetOriginalValues() {
		FlatModelImpl flatModelImpl = this;

		flatModelImpl._originalTsgId = flatModelImpl._tsgId;

		flatModelImpl._setOriginalTsgId = false;

		flatModelImpl._originalHouseId = flatModelImpl._houseId;

		flatModelImpl._setOriginalHouseId = false;

		flatModelImpl._originalRoomCnt = flatModelImpl._roomCnt;

		flatModelImpl._setOriginalRoomCnt = false;

		flatModelImpl._originalAddressId = flatModelImpl._addressId;

		flatModelImpl._setOriginalAddressId = false;

		flatModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Flat> toCacheModel() {
		FlatCacheModel flatCacheModel = new FlatCacheModel();

		flatCacheModel.flatId = getFlatId();

		flatCacheModel.tsgId = getTsgId();

		flatCacheModel.companyId = getCompanyId();

		flatCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			flatCacheModel.createDate = createDate.getTime();
		}
		else {
			flatCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			flatCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			flatCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		flatCacheModel.houseId = getHouseId();

		flatCacheModel.ownersCnt = getOwnersCnt();

		flatCacheModel.tenantsCnt = getTenantsCnt();

		flatCacheModel.spaceCommon = getSpaceCommon();

		flatCacheModel.spaceLiving = getSpaceLiving();

		flatCacheModel.roomCnt = getRoomCnt();

		flatCacheModel.floor = getFloor();

		flatCacheModel.number = getNumber();

		String number = flatCacheModel.number;

		if ((number != null) && (number.length() == 0)) {
			flatCacheModel.number = null;
		}

		flatCacheModel.addressId = getAddressId();

		return flatCacheModel;
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

	private static ClassLoader _classLoader = Flat.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Flat.class };
	private long _flatId;
	private long _tsgId;
	private long _originalTsgId;
	private boolean _setOriginalTsgId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private long _houseId;
	private long _originalHouseId;
	private boolean _setOriginalHouseId;
	private long _ownersCnt;
	private long _tenantsCnt;
	private int _spaceCommon;
	private int _spaceLiving;
	private int _roomCnt;
	private int _originalRoomCnt;
	private boolean _setOriginalRoomCnt;
	private int _floor;
	private String _number;
	private long _addressId;
	private long _originalAddressId;
	private boolean _setOriginalAddressId;
	private long _columnBitmask;
	private Flat _escapedModel;
}