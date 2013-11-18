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

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import tsg.model.Flat;
import tsg.model.FlatOwner;
import tsg.service.FlatLocalServiceUtil;
import tsg.service.FlatOwnerLocalServiceUtil;
import tsg.service.base.FlatLocalServiceBaseImpl;

/**
 * The implementation of the flat local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tsg.service.FlatLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Whitemonk
 * @see tsg.service.base.FlatLocalServiceBaseImpl
 * @see tsg.service.FlatLocalServiceUtil
 */
public class FlatLocalServiceImpl extends FlatLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link tsg.service.FlatLocalServiceUtil} to access the flat local service.
	 */
	
	public Flat createFlat() throws SystemException
	{
		long id = counterLocalService.increment();
		return FlatLocalServiceUtil.createFlat(id);
	}
	
	public List<Flat> getFlatByOwner(long ownerId)throws SystemException, PortalException
	{
		List<FlatOwner> owners = FlatOwnerLocalServiceUtil.getByOwner(ownerId);
		
		List<Flat> fls = new ArrayList<Flat>();
		for (FlatOwner flo:owners)
		{
			fls.add(FlatLocalServiceUtil.getFlat(flo.getFlatId()));
		}
		return fls;
		
	}
}