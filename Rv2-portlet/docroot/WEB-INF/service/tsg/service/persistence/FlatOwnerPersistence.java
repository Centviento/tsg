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

import tsg.model.FlatOwner;

/**
 * The persistence interface for the flat owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatOwnerPersistenceImpl
 * @see FlatOwnerUtil
 * @generated
 */
public interface FlatOwnerPersistence extends BasePersistence<FlatOwner> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FlatOwnerUtil} to access the flat owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the flat owner in the entity cache if it is enabled.
	*
	* @param flatOwner the flat owner
	*/
	public void cacheResult(tsg.model.FlatOwner flatOwner);

	/**
	* Caches the flat owners in the entity cache if it is enabled.
	*
	* @param flatOwners the flat owners
	*/
	public void cacheResult(java.util.List<tsg.model.FlatOwner> flatOwners);

	/**
	* Creates a new flat owner with the primary key. Does not add the flat owner to the database.
	*
	* @param id the primary key for the new flat owner
	* @return the new flat owner
	*/
	public tsg.model.FlatOwner create(long id);

	/**
	* Removes the flat owner with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the flat owner
	* @return the flat owner that was removed
	* @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	public tsg.model.FlatOwner updateImpl(tsg.model.FlatOwner flatOwner,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat owner with the primary key or throws a {@link tsg.NoSuchFlatOwnerException} if it could not be found.
	*
	* @param id the primary key of the flat owner
	* @return the flat owner
	* @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns the flat owner with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the flat owner
	* @return the flat owner, or <code>null</code> if a flat owner with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the flat owners where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @return the matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByowner(long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat owners where ownerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ownerId the owner ID
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @return the range of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByowner(long ownerId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat owners where ownerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param ownerId the owner ID
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByowner(long ownerId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat owner in the ordered set where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat owner
	* @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner findByowner_First(long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns the first flat owner in the ordered set where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat owner, or <code>null</code> if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner fetchByowner_First(long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat owner in the ordered set where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat owner
	* @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner findByowner_Last(long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns the last flat owner in the ordered set where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat owner, or <code>null</code> if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner fetchByowner_Last(long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat owners before and after the current flat owner in the ordered set where ownerId = &#63;.
	*
	* @param id the primary key of the current flat owner
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat owner
	* @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner[] findByowner_PrevAndNext(long id, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns all the flat owners where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @return the matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByownerTsg(long tsgId,
		long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat owners where tsgId = &#63; and ownerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @return the range of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByownerTsg(long tsgId,
		long ownerId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat owners where tsgId = &#63; and ownerId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findByownerTsg(long tsgId,
		long ownerId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat owner
	* @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner findByownerTsg_First(long tsgId, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns the first flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat owner, or <code>null</code> if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner fetchByownerTsg_First(long tsgId, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat owner
	* @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner findByownerTsg_Last(long tsgId, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns the last flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat owner, or <code>null</code> if a matching flat owner could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner fetchByownerTsg_Last(long tsgId, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat owners before and after the current flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	*
	* @param id the primary key of the current flat owner
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat owner
	* @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatOwner[] findByownerTsg_PrevAndNext(long id,
		long tsgId, long ownerId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatOwnerException;

	/**
	* Returns all the flat owners.
	*
	* @return the flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat owners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @return the range of flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat owners.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flat owners
	* @param end the upper bound of the range of flat owners (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of flat owners
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatOwner> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat owners where ownerId = &#63; from the database.
	*
	* @param ownerId the owner ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByowner(long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat owners where tsgId = &#63; and ownerId = &#63; from the database.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByownerTsg(long tsgId, long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat owners from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat owners where ownerId = &#63;.
	*
	* @param ownerId the owner ID
	* @return the number of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public int countByowner(long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat owners where tsgId = &#63; and ownerId = &#63;.
	*
	* @param tsgId the tsg ID
	* @param ownerId the owner ID
	* @return the number of matching flat owners
	* @throws SystemException if a system exception occurred
	*/
	public int countByownerTsg(long tsgId, long ownerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat owners.
	*
	* @return the number of flat owners
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}