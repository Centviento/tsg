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

package tsg.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import tsg.model.Flat;

import java.util.List;

/**
 * The persistence utility for the flat service. This utility wraps {@link FlatPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatPersistence
 * @see FlatPersistenceImpl
 * @generated
 */
public class FlatUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Flat flat) {
		getPersistence().clearCache(flat);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Flat> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Flat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Flat> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Flat update(Flat flat, boolean merge)
		throws SystemException {
		return getPersistence().update(flat, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Flat update(Flat flat, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(flat, merge, serviceContext);
	}

	/**
	* Caches the flat in the entity cache if it is enabled.
	*
	* @param flat the flat
	*/
	public static void cacheResult(tsg.model.Flat flat) {
		getPersistence().cacheResult(flat);
	}

	/**
	* Caches the flats in the entity cache if it is enabled.
	*
	* @param flats the flats
	*/
	public static void cacheResult(java.util.List<tsg.model.Flat> flats) {
		getPersistence().cacheResult(flats);
	}

	/**
	* Creates a new flat with the primary key. Does not add the flat to the database.
	*
	* @param flatId the primary key for the new flat
	* @return the new flat
	*/
	public static tsg.model.Flat create(long flatId) {
		return getPersistence().create(flatId);
	}

	/**
	* Removes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param flatId the primary key of the flat
	* @return the flat that was removed
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat remove(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().remove(flatId);
	}

	public static tsg.model.Flat updateImpl(tsg.model.Flat flat, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(flat, merge);
	}

	/**
	* Returns the flat with the primary key or throws a {@link tsg.NoSuchFlatException} if it could not be found.
	*
	* @param flatId the primary key of the flat
	* @return the flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByPrimaryKey(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findByPrimaryKey(flatId);
	}

	/**
	* Returns the flat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param flatId the primary key of the flat
	* @return the flat, or <code>null</code> if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByPrimaryKey(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(flatId);
	}

	/**
	* Returns all the flats where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytsgId(tsgId);
	}

	/**
	* Returns a range of all the flats where tsgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tsgId the tsg ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @return the range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findBytsgId(long tsgId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytsgId(tsgId, start, end);
	}

	/**
	* Returns an ordered range of all the flats where tsgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tsgId the tsg ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findBytsgId(long tsgId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytsgId(tsgId, start, end, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findBytsgId_First(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findBytsgId_First(tsgId, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchBytsgId_First(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBytsgId_First(tsgId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findBytsgId_Last(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findBytsgId_Last(tsgId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchBytsgId_Last(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBytsgId_Last(tsgId, orderByComparator);
	}

	/**
	* Returns the flats before and after the current flat in the ordered set where tsgId = &#63;.
	*
	* @param flatId the primary key of the current flat
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat[] findBytsgId_PrevAndNext(long flatId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findBytsgId_PrevAndNext(flatId, tsgId, orderByComparator);
	}

	/**
	* Returns all the flats where houseId = &#63;.
	*
	* @param houseId the house ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByhouseid(houseId);
	}

	/**
	* Returns a range of all the flats where houseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param houseId the house ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @return the range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByhouseid(long houseId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByhouseid(houseId, start, end);
	}

	/**
	* Returns an ordered range of all the flats where houseId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param houseId the house ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByhouseid(long houseId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByhouseid(houseId, start, end, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByhouseid_First(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findByhouseid_First(houseId, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByhouseid_First(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByhouseid_First(houseId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByhouseid_Last(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findByhouseid_Last(houseId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByhouseid_Last(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByhouseid_Last(houseId, orderByComparator);
	}

	/**
	* Returns the flats before and after the current flat in the ordered set where houseId = &#63;.
	*
	* @param flatId the primary key of the current flat
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat[] findByhouseid_PrevAndNext(long flatId,
		long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findByhouseid_PrevAndNext(flatId, houseId, orderByComparator);
	}

	/**
	* Returns all the flats where addressId = &#63;.
	*
	* @param addressId the address ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByaddressId(addressId);
	}

	/**
	* Returns a range of all the flats where addressId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param addressId the address ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @return the range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByaddressId(
		long addressId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByaddressId(addressId, start, end);
	}

	/**
	* Returns an ordered range of all the flats where addressId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param addressId the address ID
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByaddressId(
		long addressId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByaddressId(addressId, start, end, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByaddressId_First(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findByaddressId_First(addressId, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByaddressId_First(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByaddressId_First(addressId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByaddressId_Last(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findByaddressId_Last(addressId, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByaddressId_Last(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByaddressId_Last(addressId, orderByComparator);
	}

	/**
	* Returns the flats before and after the current flat in the ordered set where addressId = &#63;.
	*
	* @param flatId the primary key of the current flat
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat[] findByaddressId_PrevAndNext(long flatId,
		long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findByaddressId_PrevAndNext(flatId, addressId,
			orderByComparator);
	}

	/**
	* Returns all the flats where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByroomCnt(roomCnt);
	}

	/**
	* Returns a range of all the flats where roomCnt = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param roomCnt the room cnt
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @return the range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByroomCnt(roomCnt, start, end);
	}

	/**
	* Returns an ordered range of all the flats where roomCnt = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param roomCnt the room cnt
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByroomCnt(roomCnt, start, end, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByroomCnt_First(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findByroomCnt_First(roomCnt, orderByComparator);
	}

	/**
	* Returns the first flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByroomCnt_First(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByroomCnt_First(roomCnt, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat findByroomCnt_Last(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence().findByroomCnt_Last(roomCnt, orderByComparator);
	}

	/**
	* Returns the last flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat fetchByroomCnt_Last(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByroomCnt_Last(roomCnt, orderByComparator);
	}

	/**
	* Returns the flats before and after the current flat in the ordered set where roomCnt = &#63;.
	*
	* @param flatId the primary key of the current flat
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat[] findByroomCnt_PrevAndNext(long flatId,
		int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException {
		return getPersistence()
				   .findByroomCnt_PrevAndNext(flatId, roomCnt, orderByComparator);
	}

	/**
	* Returns all the flats.
	*
	* @return the flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the flats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @return the range of flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the flats.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flats
	* @param end the upper bound of the range of flats (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of flats
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.Flat> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the flats where tsgId = &#63; from the database.
	*
	* @param tsgId the tsg ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBytsgId(tsgId);
	}

	/**
	* Removes all the flats where houseId = &#63; from the database.
	*
	* @param houseId the house ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByhouseid(houseId);
	}

	/**
	* Removes all the flats where addressId = &#63; from the database.
	*
	* @param addressId the address ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByaddressId(addressId);
	}

	/**
	* Removes all the flats where roomCnt = &#63; from the database.
	*
	* @param roomCnt the room cnt
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByroomCnt(roomCnt);
	}

	/**
	* Removes all the flats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of flats where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static int countBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBytsgId(tsgId);
	}

	/**
	* Returns the number of flats where houseId = &#63;.
	*
	* @param houseId the house ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static int countByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByhouseid(houseId);
	}

	/**
	* Returns the number of flats where addressId = &#63;.
	*
	* @param addressId the address ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static int countByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByaddressId(addressId);
	}

	/**
	* Returns the number of flats where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public static int countByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByroomCnt(roomCnt);
	}

	/**
	* Returns the number of flats.
	*
	* @return the number of flats
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FlatPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FlatPersistence)PortletBeanLocatorUtil.locate(tsg.service.ClpSerializer.getServletContextName(),
					FlatPersistence.class.getName());

			ReferenceRegistry.registerReference(FlatUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FlatPersistence persistence) {
	}

	private static FlatPersistence _persistence;
}