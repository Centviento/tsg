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
 * This class is a wrapper for {@link FlatLocalService}.
 * </p>
 *
 * @author    Whitemonk
 * @see       FlatLocalService
 * @generated
 */
public class FlatLocalServiceWrapper implements FlatLocalService,
	ServiceWrapper<FlatLocalService> {
	public FlatLocalServiceWrapper(FlatLocalService flatLocalService) {
		_flatLocalService = flatLocalService;
	}

	/**
	* Adds the flat to the database. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was added
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat addFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.addFlat(flat);
	}

	/**
	* Creates a new flat with the primary key. Does not add the flat to the database.
	*
	* @param flatId the primary key for the new flat
	* @return the new flat
	*/
	public tsg.model.Flat createFlat(long flatId) {
		return _flatLocalService.createFlat(flatId);
	}

	/**
	* Deletes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param flatId the primary key of the flat
	* @return the flat that was removed
	* @throws PortalException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat deleteFlat(long flatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.deleteFlat(flatId);
	}

	/**
	* Deletes the flat from the database. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was removed
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat deleteFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.deleteFlat(flat);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _flatLocalService.dynamicQuery();
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
		return _flatLocalService.dynamicQuery(dynamicQuery);
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
		return _flatLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _flatLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _flatLocalService.dynamicQueryCount(dynamicQuery);
	}

	public tsg.model.Flat fetchFlat(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.fetchFlat(flatId);
	}

	/**
	* Returns the flat with the primary key.
	*
	* @param flatId the primary key of the flat
	* @return the flat
	* @throws PortalException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat getFlat(long flatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.getFlat(flatId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<tsg.model.Flat> getFlats(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.getFlats(start, end);
	}

	/**
	* Returns the number of flats.
	*
	* @return the number of flats
	* @throws SystemException if a system exception occurred
	*/
	public int getFlatsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.getFlatsCount();
	}

	/**
	* Updates the flat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was updated
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat updateFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.updateFlat(flat);
	}

	/**
	* Updates the flat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @param merge whether to merge the flat with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the flat that was updated
	* @throws SystemException if a system exception occurred
	*/
	public tsg.model.Flat updateFlat(tsg.model.Flat flat, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.updateFlat(flat, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _flatLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_flatLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _flatLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public tsg.model.Flat createFlat()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.createFlat();
	}

	public java.util.List<tsg.model.Flat> getFlatByOwner(long ownerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _flatLocalService.getFlatByOwner(ownerId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public FlatLocalService getWrappedFlatLocalService() {
		return _flatLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedFlatLocalService(FlatLocalService flatLocalService) {
		_flatLocalService = flatLocalService;
	}

	public FlatLocalService getWrappedService() {
		return _flatLocalService;
	}

	public void setWrappedService(FlatLocalService flatLocalService) {
		_flatLocalService = flatLocalService;
	}

	private FlatLocalService _flatLocalService;
}