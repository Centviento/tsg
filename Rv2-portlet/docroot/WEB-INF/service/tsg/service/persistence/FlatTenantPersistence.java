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

import tsg.model.FlatTenant;

/**
 * The persistence interface for the flat tenant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatTenantPersistenceImpl
 * @see FlatTenantUtil
 * @generated
 */
public interface FlatTenantPersistence extends BasePersistence<FlatTenant> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FlatTenantUtil} to access the flat tenant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the flat tenant in the entity cache if it is enabled.
	*
	* @param flatTenant the flat tenant
	*/
	public void cacheResult(tsg.model.FlatTenant flatTenant);

	/**
	* Caches the flat tenants in the entity cache if it is enabled.
	*
	* @param flatTenants the flat tenants
	*/
	public void cacheResult(java.util.List<tsg.model.FlatTenant> flatTenants);

	/**
	* Creates a new flat tenant with the primary key. Does not add the flat tenant to the database.
	*
	* @param id the primary key for the new flat tenant
	* @return the new flat tenant
	*/
	public tsg.model.FlatTenant create(long id);

	/**
	* Removes the flat tenant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant that was removed
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	public tsg.model.FlatTenant updateImpl(tsg.model.FlatTenant flatTenant,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat tenant with the primary key or throws a {@link tsg.NoSuchFlatTenantException} if it could not be found.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the flat tenant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant, or <code>null</code> if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the flat tenants where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat tenants where flatId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param flatId the flat ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @return the range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findByflatId(long flatId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat tenants where flatId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param flatId the flat ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findByflatId(long flatId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findByflatId_First(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the first flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchByflatId_First(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findByflatId_Last(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the last flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchByflatId_Last(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat tenants before and after the current flat tenant in the ordered set where flatId = &#63;.
	*
	* @param id the primary key of the current flat tenant
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat tenant
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant[] findByflatId_PrevAndNext(long id,
		long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns all the flat tenants where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenant(long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat tenants where tenantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tenantId the tenant ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @return the range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenant(long tenantId,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat tenants where tenantId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tenantId the tenant ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenant(long tenantId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findBytenant_First(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchBytenant_First(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findBytenant_Last(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchBytenant_Last(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat tenants before and after the current flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param id the primary key of the current flat tenant
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat tenant
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant[] findBytenant_PrevAndNext(long id,
		long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns all the flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenantTsg(long tenantId,
		long tsgId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @return the range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenantTsg(long tenantId,
		long tsgId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findBytenantTsg(long tenantId,
		long tsgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findBytenantTsg_First(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchBytenantTsg_First(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant findBytenantTsg_Last(long tenantId, long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant fetchBytenantTsg_Last(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the flat tenants before and after the current flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param id the primary key of the current flat tenant
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next flat tenant
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant[] findBytenantTsg_PrevAndNext(long id,
		long tenantId, long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException;

	/**
	* Returns all the flat tenants.
	*
	* @return the flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the flat tenants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @return the range of flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the flat tenants.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of flat tenants
	* @param end the upper bound of the range of flat tenants (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<tsg.model.FlatTenant> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat tenants where flatId = &#63; from the database.
	*
	* @param flatId the flat ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat tenants where tenantId = &#63; from the database.
	*
	* @param tenantId the tenant ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBytenant(long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat tenants where tenantId = &#63; and tsgId = &#63; from the database.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeBytenantTsg(long tenantId, long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the flat tenants from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat tenants where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public int countByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat tenants where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public int countBytenant(long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public int countBytenantTsg(long tenantId, long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of flat tenants.
	*
	* @return the number of flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}