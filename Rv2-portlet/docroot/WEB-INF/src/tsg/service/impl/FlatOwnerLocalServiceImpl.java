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

package tsg.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;



import tsg.model.FlatOwner;
import tsg.service.FlatOwnerLocalServiceUtil;
import tsg.service.base.FlatOwnerLocalServiceBaseImpl;

/**
 * The implementation of the flat owner local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tsg.service.FlatOwnerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Whitemonk
 * @see tsg.service.base.FlatOwnerLocalServiceBaseImpl
 * @see tsg.service.FlatOwnerLocalServiceUtil
 */
public class FlatOwnerLocalServiceImpl extends FlatOwnerLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link tsg.service.FlatOwnerLocalServiceUtil} to access the flat owner local service.
	 */
	public FlatOwner addFlatOwnerSingle (long userId, long flatId, long ownerId, long tsgId, int area,  
			Date fromDate, Date toDate)
			throws SystemException
	{
		long id = counterLocalService.increment();
		FlatOwner flo = FlatOwnerLocalServiceUtil.createFlatOwner(id);
		
		flo.setFlatId(flatId);
		flo.setFromDate(fromDate);
		flo.setToDate(toDate);
		flo.setOwnerId(ownerId);
		flo.setTsgId(tsgId);
		flo.setArea(area);
		flo.setPercent(100);
		flo.setShared(false);
		
		Date now = new Date();
		flo.setCreateDate(now);
		flo.setModifiedDate(now);
		
		FlatOwnerLocalServiceUtil.addFlatOwner(flo);
		
		return flo;
		
	}
	
	public FlatOwner addFlatOwnerShared (long userId, long flatId, long ownerId, long tsgId, int area, 
			int percent, 
			Date fromDate, Date toDate)
			throws SystemException
	{
		long id = counterLocalService.increment();
		FlatOwner flo = FlatOwnerLocalServiceUtil.createFlatOwner(id);
		
		flo.setFlatId(flatId);
		flo.setFromDate(fromDate);
		flo.setToDate(toDate);
		flo.setOwnerId(ownerId);
		flo.setTsgId(tsgId);
		flo.setArea(area);
		flo.setPercent(percent);
		flo.setShared(true);
		
		Date now = new Date();
		flo.setCreateDate(now);
		flo.setModifiedDate(now);
		
		FlatOwnerLocalServiceUtil.addFlatOwner(flo);
		//TODO Сделать проверку, чтобы общая сумма процентов не превышала 100
		return flo;
		
	}
	
	public List<FlatOwner> getByOwner(long ownerId) throws SystemException
	{
		return flatOwnerPersistence.findByowner(ownerId);
	}
	
	public List<FlatOwner> getByOwnerTsg (long ownerId, long tsgId) throws SystemException
	{
		return flatOwnerPersistence.findByownerTsg(tsgId, ownerId);
		
	}
	
}