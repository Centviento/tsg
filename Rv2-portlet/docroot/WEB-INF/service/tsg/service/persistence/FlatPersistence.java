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

import com.liferay.portal.service.persistence.BasePersistence;

import tsg.model.Flat;

/**
 * The persistence interface for the flat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatPersistenceImpl
 * @see FlatUtil
 * @generated
 */
public interface FlatPersistence extends BasePersistence<Flat> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FlatUtil} to access the flat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the flat in the entity cache if it is enabled.
	*
	* @param flat the flat
	*/
	public void cacheResult(tsg.model.Flat flat);

	/**
	* Caches the flats in the entity cache if it is enabled.
	*
	* @param flats the flats
	*/
	public void cacheResult(java.util.List<tsg.model.Flat> flats);

	/**
	* Creates a new flat with the primary key. Does not add the flat to the database.
	*
	* @param flatId the primary key for the new flat
	* @return the new flat
	*/
	public tsg.model.Flat create(long flatId);

	/**
	* Removes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param flatId the primary key of the flat
	* @return the flat that was removed
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat remove(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	public tsg.model.Flat updateImpl(tsg.model.Flat flat, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat with the primary key or throws a {@link tsg.NoSuchFlatException} if it could not be found.
	*
	* @param flatId the primary key of the flat
	* @return the flat
	* @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByPrimaryKey(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the flat with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param flatId the primary key of the flat
	* @return the flat, or <code>null</code> if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByPrimaryKey(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the flats where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.Flat> findBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findBytsgId(long tsgId, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findBytsgId(long tsgId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findBytsgId_First(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the first flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchBytsgId_First(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findBytsgId_Last(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the last flat in the ordered set where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchBytsgId_Last(long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public tsg.model.Flat[] findBytsgId_PrevAndNext(long flatId, long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns all the flats where houseId = &#63;.
	*
	* @param houseId the house ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.Flat> findByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByhouseid(long houseId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByhouseid(long houseId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByhouseid_First(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the first flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByhouseid_First(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByhouseid_Last(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the last flat in the ordered set where houseId = &#63;.
	*
	* @param houseId the house ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByhouseid_Last(long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public tsg.model.Flat[] findByhouseid_PrevAndNext(long flatId,
		long houseId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns all the flats where addressId = &#63;.
	*
	* @param addressId the address ID
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.Flat> findByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByaddressId(long addressId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByaddressId(long addressId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByaddressId_First(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the first flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByaddressId_First(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByaddressId_Last(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the last flat in the ordered set where addressId = &#63;.
	*
	* @param addressId the address ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByaddressId_Last(long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public tsg.model.Flat[] findByaddressId_PrevAndNext(long flatId,
		long addressId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns all the flats where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @return the matching flats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findByroomCnt(int roomCnt, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByroomCnt_First(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the first flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByroomCnt_First(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat
	* @throws tsg.NoSuchFlatException if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat findByroomCnt_Last(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns the last flat in the ordered set where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat, or <code>null</code> if a matching flat could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat fetchByroomCnt_Last(int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public tsg.model.Flat[] findByroomCnt_PrevAndNext(long flatId, int roomCnt,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatException;

	/**
	* Returns all the flats.
	*
	* @return the flats
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.Flat> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<tsg.model.Flat> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flats where tsgId = &#63; from the database.
	*
	* @param tsgId the tsg ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flats where houseId = &#63; from the database.
	*
	* @param houseId the house ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flats where addressId = &#63; from the database.
	*
	* @param addressId the address ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flats where roomCnt = &#63; from the database.
	*
	* @param roomCnt the room cnt
	* @throws SystemException if a system exception occurred
	*/
	public void removeByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flats from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flats where tsgId = &#63;.
	*
	* @param tsgId the tsg ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public int countBytsgId(long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flats where houseId = &#63;.
	*
	* @param houseId the house ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public int countByhouseid(long houseId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flats where addressId = &#63;.
	*
	* @param addressId the address ID
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public int countByaddressId(long addressId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flats where roomCnt = &#63;.
	*
	* @param roomCnt the room cnt
	* @return the number of matching flats
	* @throws SystemException if a system exception occurred
	*/
	public int countByroomCnt(int roomCnt)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flats.
	*
	* @return the number of flats
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}