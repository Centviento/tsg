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

package tsg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FlatTenantLocalService}.
 * </p>
 *
 * @author    Whitemonk
 * @see       FlatTenantLocalService
 * @generated
 */
public class FlatTenantLocalServiceWrapper implements FlatTenantLocalService,
	ServiceWrapper<FlatTenantLocalService> {
	public FlatTenantLocalServiceWrapper(
		FlatTenantLocalService flatTenantLocalService) {
		_flatTenantLocalService = flatTenantLocalService;
	}

	/**
	* Adds the flat tenant to the database. Also notifies the appropriate model listeners.
	*
	* @param flatTenant the flat tenant
	* @return the flat tenant that was added
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant addFlatTenant(tsg.model.FlatTenant flatTenant)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.addFlatTenant(flatTenant);
	}

	/**
	* Creates a new flat tenant with the primary key. Does not add the flat tenant to the database.
	*
	* @param id the primary key for the new flat tenant
	* @return the new flat tenant
	*/
	public tsg.model.FlatTenant createFlatTenant(long id) {
		return _flatTenantLocalService.createFlatTenant(id);
	}

	/**
	* Deletes the flat tenant with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant that was removed
	* @throws PortalException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant deleteFlatTenant(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.deleteFlatTenant(id);
	}

	/**
	* Deletes the flat tenant from the database. Also notifies the appropriate model listeners.
	*
	* @param flatTenant the flat tenant
	* @return the flat tenant that was removed
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant deleteFlatTenant(
		tsg.model.FlatTenant flatTenant)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.deleteFlatTenant(flatTenant);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _flatTenantLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.dynamicQueryCount(dynamicQuery);
	}

	public tsg.model.FlatTenant fetchFlatTenant(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.fetchFlatTenant(id);
	}

	/**
	* Returns the flat tenant with the primary key.
	*
	* @param id the primary key of the flat tenant
	* @return the flat tenant
	* @throws PortalException if a flat tenant with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant getFlatTenant(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.getFlatTenant(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<tsg.model.FlatTenant> getFlatTenants(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.getFlatTenants(start, end);
	}

	/**
	* Returns the number of flat tenants.
	*
	* @return the number of flat tenants
	* @throws SystemException if a system exception occurred
	*/
	public int getFlatTenantsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.getFlatTenantsCount();
	}

	/**
	* Updates the flat tenant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flatTenant the flat tenant
	* @return the flat tenant that was updated
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant updateFlatTenant(
		tsg.model.FlatTenant flatTenant)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.updateFlatTenant(flatTenant);
	}

	/**
	* Updates the flat tenant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flatTenant the flat tenant
	* @param merge whether to merge the flat tenant with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the flat tenant that was updated
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.FlatTenant updateFlatTenant(
		tsg.model.FlatTenant flatTenant, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatTenantLocalService.updateFlatTenant(flatTenant, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _flatTenantLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_flatTenantLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _flatTenantLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FlatTenantLocalService getWrappedFlatTenantLocalService() {
		return _flatTenantLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFlatTenantLocalService(
		FlatTenantLocalService flatTenantLocalService) {
		_flatTenantLocalService = flatTenantLocalService;
	}

	public FlatTenantLocalService getWrappedService() {
		return _flatTenantLocalService;
	}

	public void setWrappedService(FlatTenantLocalService flatTenantLocalService) {
		_flatTenantLocalService = flatTenantLocalService;
	}

	private FlatTenantLocalService _flatTenantLocalService;
}