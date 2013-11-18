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

import tsg.model.FlatTenant;

import java.util.List;

/**
 * The persistence utility for the flat tenant service. This utility wraps {@link FlatTenantPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatTenantPersistence
 * @see FlatTenantPersistenceImpl
 * @generated
 */
public class FlatTenantUtil {
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
	public static void clearCache(FlatTenant flatTenant) {
		getPersistence().clearCache(flatTenant);
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
	public static List<FlatTenant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FlatTenant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FlatTenant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static FlatTenant update(FlatTenant flatTenant, boolean merge)
		throws SystemException {
		return getPersistence().update(flatTenant, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static FlatTenant update(FlatTenant flatTenant, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(flatTenant, merge, serviceContext);
	}

	/**
	* Caches the flat tenant in the entity cache if it is enabled.
	*
	* @param flatTenant the flat tenant
	*/
	public static void cacheResult(tsg.model.FlatTenant flatTenant) {
		getPersistence().cacheResult(flatTenant);
	}

	/**
	* Caches the flat tenants in the entity cache if it is enabled.
	*
	* @param flatTenants the flat tenants
	*/
	public static void cacheResult(
		java.util.List<tsg.model.FlatTenant> flatTenants) {
		getPersistence().cacheResult(flatTenants);
	}

	/**
	* Creates a new flat tenant with the primary key. Does not add the flat tenant to the database.
	*
	* @param id the primary key for the new flat tenant
	* @return the new flat tenant
	*/
	public static tsg.model.FlatTenant create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the flat tenant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant that was removed
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().remove(id);
	}

	public static tsg.model.FlatTenant updateImpl(
		tsg.model.FlatTenant flatTenant, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(flatTenant, merge);
	}

	/**
	* Returns the flat tenant with the primary key or throws a {@link tsg.NoSuchFlatTenantException} if it could not be found.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant
	* @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the flat tenant with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant, or <code>null</code> if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the flat tenants where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.FlatTenant> findByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByflatId(flatId);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findByflatId(
		long flatId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByflatId(flatId, start, end);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findByflatId(
		long flatId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByflatId(flatId, start, end, orderByComparator);
	}

	/**
	* Returns the first flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant findByflatId_First(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().findByflatId_First(flatId, orderByComparator);
	}

	/**
	* Returns the first flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchByflatId_First(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByflatId_First(flatId, orderByComparator);
	}

	/**
	* Returns the last flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant findByflatId_Last(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().findByflatId_Last(flatId, orderByComparator);
	}

	/**
	* Returns the last flat tenant in the ordered set where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchByflatId_Last(long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByflatId_Last(flatId, orderByComparator);
	}

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
	public static tsg.model.FlatTenant[] findByflatId_PrevAndNext(long id,
		long flatId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence()
				   .findByflatId_PrevAndNext(id, flatId, orderByComparator);
	}

	/**
	* Returns all the flat tenants where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.FlatTenant> findBytenant(
		long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytenant(tenantId);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findBytenant(
		long tenantId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytenant(tenantId, start, end);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findBytenant(
		long tenantId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytenant(tenantId, start, end, orderByComparator);
	}

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant findBytenant_First(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().findBytenant_First(tenantId, orderByComparator);
	}

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchBytenant_First(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBytenant_First(tenantId, orderByComparator);
	}

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant
	* @throws tsg.NoSuchFlatTenantException if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant findBytenant_Last(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence().findBytenant_Last(tenantId, orderByComparator);
	}

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchBytenant_Last(long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBytenant_Last(tenantId, orderByComparator);
	}

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
	public static tsg.model.FlatTenant[] findBytenant_PrevAndNext(long id,
		long tenantId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence()
				   .findBytenant_PrevAndNext(id, tenantId, orderByComparator);
	}

	/**
	* Returns all the flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @return the matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.FlatTenant> findBytenantTsg(
		long tenantId, long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytenantTsg(tenantId, tsgId);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findBytenantTsg(
		long tenantId, long tsgId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBytenantTsg(tenantId, tsgId, start, end);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findBytenantTsg(
		long tenantId, long tsgId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBytenantTsg(tenantId, tsgId, start, end,
			orderByComparator);
	}

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
	public static tsg.model.FlatTenant findBytenantTsg_First(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence()
				   .findBytenantTsg_First(tenantId, tsgId, orderByComparator);
	}

	/**
	* Returns the first flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchBytenantTsg_First(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBytenantTsg_First(tenantId, tsgId, orderByComparator);
	}

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
	public static tsg.model.FlatTenant findBytenantTsg_Last(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence()
				   .findBytenantTsg_Last(tenantId, tsgId, orderByComparator);
	}

	/**
	* Returns the last flat tenant in the ordered set where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.FlatTenant fetchBytenantTsg_Last(long tenantId,
		long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchBytenantTsg_Last(tenantId, tsgId, orderByComparator);
	}

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
	public static tsg.model.FlatTenant[] findBytenantTsg_PrevAndNext(long id,
		long tenantId, long tsgId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			tsg.NoSuchFlatTenantException {
		return getPersistence()
				   .findBytenantTsg_PrevAndNext(id, tenantId, tsgId,
			orderByComparator);
	}

	/**
	* Returns all the flat tenants.
	*
	* @return the flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<tsg.model.FlatTenant> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<tsg.model.FlatTenant> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<tsg.model.FlatTenant> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the flat tenants where flatId = &#63; from the database.
	*
	* @param flatId the flat ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByflatId(flatId);
	}

	/**
	* Removes all the flat tenants where tenantId = &#63; from the database.
	*
	* @param tenantId the tenant ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBytenant(long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBytenant(tenantId);
	}

	/**
	* Removes all the flat tenants where tenantId = &#63; and tsgId = &#63; from the database.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBytenantTsg(long tenantId, long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBytenantTsg(tenantId, tsgId);
	}

	/**
	* Removes all the flat tenants from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of flat tenants where flatId = &#63;.
	*
	* @param flatId the flat ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static int countByflatId(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByflatId(flatId);
	}

	/**
	* Returns the number of flat tenants where tenantId = &#63;.
	*
	* @param tenantId the tenant ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static int countBytenant(long tenantId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBytenant(tenantId);
	}

	/**
	* Returns the number of flat tenants where tenantId = &#63; and tsgId = &#63;.
	*
	* @param tenantId the tenant ID
	* @param tsgId the tsg ID
	* @return the number of matching flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static int countBytenantTsg(long tenantId, long tsgId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBytenantTsg(tenantId, tsgId);
	}

	/**
	* Returns the number of flat tenants.
	*
	* @return the number of flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static FlatTenantPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FlatTenantPersistence)PortletBeanLocatorUtil.locate(tsg.service.ClpSerializer.getServletContextName(),
					FlatTenantPersistence.class.getName());

			ReferenceRegistry.registerReference(FlatTenantUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(FlatTenantPersistence persistence) {
	}

	private static FlatTenantPersistence _persistence;
}