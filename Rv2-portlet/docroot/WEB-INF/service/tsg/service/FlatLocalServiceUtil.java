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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the flat local service. This utility wraps {@link tsg.service.impl.FlatLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Whitemonk
 * @see FlatLocalService
 * @see tsg.service.base.FlatLocalServiceBaseImpl
 * @see tsg.service.impl.FlatLocalServiceImpl
 * @generated
 */
public class FlatLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tsg.service.impl.FlatLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the flat to the database. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was added
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat addFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addFlat(flat);
	}

	/**
	* Creates a new flat with the primary key. Does not add the flat to the database.
	*
	* @param flatId the primary key for the new flat
	* @return the new flat
	*/
	public static tsg.model.Flat createFlat(long flatId) {
		return getService().createFlat(flatId);
	}

	/**
	* Deletes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param flatId the primary key of the flat
	* @return the flat that was removed
	* @throws PortalException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat deleteFlat(long flatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFlat(flatId);
	}

	/**
	* Deletes the flat from the database. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat deleteFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteFlat(flat);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static tsg.model.Flat fetchFlat(long flatId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchFlat(flatId);
	}

	/**
	* Returns the flat with the primary key.
	*
	* @param flatId the primary key of the flat
	* @return the flat
	* @throws PortalException if a flat with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat getFlat(long flatId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFlat(flatId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<tsg.model.Flat> getFlats(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFlats(start, end);
	}

	/**
	* Returns the number of flats.
	*
	* @return the number of flats
	* @throws SystemException if a system exception occurred
	*/
	public static int getFlatsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getFlatsCount();
	}

	/**
	* Updates the flat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @return the flat that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat updateFlat(tsg.model.Flat flat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFlat(flat);
	}

	/**
	* Updates the flat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param flat the flat
	* @param merge whether to merge the flat with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the flat that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static tsg.model.Flat updateFlat(tsg.model.Flat flat, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateFlat(flat, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static tsg.model.Flat createFlat()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createFlat();
	}

	public static java.util.List<tsg.model.Flat> getFlatByOwner(long ownerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getFlatByOwner(ownerId);
	}

	public static void clearService() {
		_service = null;
	}

	public static FlatLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					FlatLocalService.class.getName());

			if (invokableLocalService instanceof FlatLocalService) {
				_service = (FlatLocalService)invokableLocalService;
			}
			else {
				_service = new FlatLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(FlatLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(FlatLocalService service) {
	}

	private static FlatLocalService _service;
}