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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import tsg.NoSuchFlatTenantException;

import tsg.model.FlatTenant;

import tsg.model.impl.FlatTenantImpl;
import tsg.model.impl.FlatTenantModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the flat tenant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatTenantPersistence
 * @see FlatTenantUtil
 * @generated
 */
public class FlatTenantPersistenceImpl extends BasePersistenceImpl<FlatTenant>
	implements FlatTenantPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FlatTenantUtil} to access the flat tenant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FlatTenantImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FLATID = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByflatId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLATID =
		new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByflatId",
			new String[] { Long.class.getName() },
			FlatTenantModelImpl.FLATID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FLATID = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByflatId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TENANT = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytenant",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANT =
		new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytenant",
			new String[] { Long.class.getName() },
			FlatTenantModelImpl.TENANTID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TENANT = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytenant",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TENANTTSG =
		new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytenantTsg",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANTTSG =
		new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytenantTsg",
			new String[] { Long.class.getName(), Long.class.getName() },
			FlatTenantModelImpl.TENANTID_COLUMN_BITMASK |
			FlatTenantModelImpl.TSGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TENANTTSG = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytenantTsg",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, FlatTenantImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the flat tenant in the entity cache if it is enabled.
	 *
	 * @param flatTenant the flat tenant
	 */
	public void cacheResult(FlatTenant flatTenant) {
		EntityCacheUtil.putResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantImpl.class, flatTenant.getPrimaryKey(), flatTenant);

		flatTenant.resetOriginalValues();
	}

	/**
	 * Caches the flat tenants in the entity cache if it is enabled.
	 *
	 * @param flatTenants the flat tenants
	 */
	public void cacheResult(List<FlatTenant> flatTenants) {
		for (FlatTenant flatTenant : flatTenants) {
			if (EntityCacheUtil.getResult(
						FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
						FlatTenantImpl.class, flatTenant.getPrimaryKey()) == null) {
				cacheResult(flatTenant);
			}
			else {
				flatTenant.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all flat tenants.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FlatTenantImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FlatTenantImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the flat tenant.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FlatTenant flatTenant) {
		EntityCacheUtil.removeResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantImpl.class, flatTenant.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FlatTenant> flatTenants) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FlatTenant flatTenant : flatTenants) {
			EntityCacheUtil.removeResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
				FlatTenantImpl.class, flatTenant.getPrimaryKey());
		}
	}

	/**
	 * Creates a new flat tenant with the primary key. Does not add the flat tenant to the database.
	 *
	 * @param id the primary key for the new flat tenant
	 * @return the new flat tenant
	 */
	public FlatTenant create(long id) {
		FlatTenant flatTenant = new FlatTenantImpl();

		flatTenant.setNew(true);
		flatTenant.setPrimaryKey(id);

		return flatTenant;
	}

	/**
	 * Removes the flat tenant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the flat tenant
	 * @return the flat tenant that was removed
	 * @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant remove(long id)
		throws NoSuchFlatTenantException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the flat tenant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the flat tenant
	 * @return the flat tenant that was removed
	 * @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatTenant remove(Serializable primaryKey)
		throws NoSuchFlatTenantException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FlatTenant flatTenant = (FlatTenant)session.get(FlatTenantImpl.class,
					primaryKey);

			if (flatTenant == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFlatTenantException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(flatTenant);
		}
		catch (NoSuchFlatTenantException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FlatTenant removeImpl(FlatTenant flatTenant)
		throws SystemException {
		flatTenant = toUnwrappedModel(flatTenant);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, flatTenant);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(flatTenant);

		return flatTenant;
	}

	@Override
	public FlatTenant updateImpl(tsg.model.FlatTenant flatTenant, boolean merge)
		throws SystemException {
		flatTenant = toUnwrappedModel(flatTenant);

		boolean isNew = flatTenant.isNew();

		FlatTenantModelImpl flatTenantModelImpl = (FlatTenantModelImpl)flatTenant;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, flatTenant, merge);

			flatTenant.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FlatTenantModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((flatTenantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLATID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getOriginalFlatId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FLATID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLATID,
					args);

				args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getFlatId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FLATID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLATID,
					args);
			}

			if ((flatTenantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getOriginalTenantId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TENANT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANT,
					args);

				args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getTenantId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TENANT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANT,
					args);
			}

			if ((flatTenantModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANTTSG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getOriginalTenantId()),
						Long.valueOf(flatTenantModelImpl.getOriginalTsgId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TENANTTSG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANTTSG,
					args);

				args = new Object[] {
						Long.valueOf(flatTenantModelImpl.getTenantId()),
						Long.valueOf(flatTenantModelImpl.getTsgId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TENANTTSG,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANTTSG,
					args);
			}
		}

		EntityCacheUtil.putResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
			FlatTenantImpl.class, flatTenant.getPrimaryKey(), flatTenant);

		return flatTenant;
	}

	protected FlatTenant toUnwrappedModel(FlatTenant flatTenant) {
		if (flatTenant instanceof FlatTenantImpl) {
			return flatTenant;
		}

		FlatTenantImpl flatTenantImpl = new FlatTenantImpl();

		flatTenantImpl.setNew(flatTenant.isNew());
		flatTenantImpl.setPrimaryKey(flatTenant.getPrimaryKey());

		flatTenantImpl.setId(flatTenant.getId());
		flatTenantImpl.setCompanyId(flatTenant.getCompanyId());
		flatTenantImpl.setUserId(flatTenant.getUserId());
		flatTenantImpl.setCreateDate(flatTenant.getCreateDate());
		flatTenantImpl.setModifiedDate(flatTenant.getModifiedDate());
		flatTenantImpl.setTenantId(flatTenant.getTenantId());
		flatTenantImpl.setFlatId(flatTenant.getFlatId());
		flatTenantImpl.setTsgId(flatTenant.getTsgId());
		flatTenantImpl.setFromDate(flatTenant.getFromDate());
		flatTenantImpl.setToDate(flatTenant.getToDate());

		return flatTenantImpl;
	}

	/**
	 * Returns the flat tenant with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat tenant
	 * @return the flat tenant
	 * @throws com.liferay.portal.NoSuchModelException if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatTenant findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat tenant with the primary key or throws a {@link tsg.NoSuchFlatTenantException} if it could not be found.
	 *
	 * @param id the primary key of the flat tenant
	 * @return the flat tenant
	 * @throws tsg.NoSuchFlatTenantException if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant findByPrimaryKey(long id)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchByPrimaryKey(id);

		if (flatTenant == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFlatTenantException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return flatTenant;
	}

	/**
	 * Returns the flat tenant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat tenant
	 * @return the flat tenant, or <code>null</code> if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatTenant fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat tenant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the flat tenant
	 * @return the flat tenant, or <code>null</code> if a flat tenant with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant fetchByPrimaryKey(long id) throws SystemException {
		FlatTenant flatTenant = (FlatTenant)EntityCacheUtil.getResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
				FlatTenantImpl.class, id);

		if (flatTenant == _nullFlatTenant) {
			return null;
		}

		if (flatTenant == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				flatTenant = (FlatTenant)session.get(FlatTenantImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (flatTenant != null) {
					cacheResult(flatTenant);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FlatTenantModelImpl.ENTITY_CACHE_ENABLED,
						FlatTenantImpl.class, id, _nullFlatTenant);
				}

				closeSession(session);
			}
		}

		return flatTenant;
	}

	/**
	 * Returns all the flat tenants where flatId = &#63;.
	 *
	 * @param flatId the flat ID
	 * @return the matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatTenant> findByflatId(long flatId) throws SystemException {
		return findByflatId(flatId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FlatTenant> findByflatId(long flatId, int start, int end)
		throws SystemException {
		return findByflatId(flatId, start, end, null);
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
	public List<FlatTenant> findByflatId(long flatId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FLATID;
			finderArgs = new Object[] { flatId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FLATID;
			finderArgs = new Object[] { flatId, start, end, orderByComparator };
		}

		List<FlatTenant> list = (List<FlatTenant>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FlatTenant flatTenant : list) {
				if ((flatId != flatTenant.getFlatId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_FLATID_FLATID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(flatId);

				list = (List<FlatTenant>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public FlatTenant findByflatId_First(long flatId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchByflatId_First(flatId, orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("flatId=");
		msg.append(flatId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
	}

	/**
	 * Returns the first flat tenant in the ordered set where flatId = &#63;.
	 *
	 * @param flatId the flat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant fetchByflatId_First(long flatId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FlatTenant> list = findByflatId(flatId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant findByflatId_Last(long flatId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchByflatId_Last(flatId, orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("flatId=");
		msg.append(flatId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
	}

	/**
	 * Returns the last flat tenant in the ordered set where flatId = &#63;.
	 *
	 * @param flatId the flat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant fetchByflatId_Last(long flatId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByflatId(flatId);

		List<FlatTenant> list = findByflatId(flatId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant[] findByflatId_PrevAndNext(long id, long flatId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FlatTenant[] array = new FlatTenantImpl[3];

			array[0] = getByflatId_PrevAndNext(session, flatTenant, flatId,
					orderByComparator, true);

			array[1] = flatTenant;

			array[2] = getByflatId_PrevAndNext(session, flatTenant, flatId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FlatTenant getByflatId_PrevAndNext(Session session,
		FlatTenant flatTenant, long flatId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLATTENANT_WHERE);

		query.append(_FINDER_COLUMN_FLATID_FLATID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(flatId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flatTenant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FlatTenant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flat tenants where tenantId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @return the matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatTenant> findBytenant(long tenantId)
		throws SystemException {
		return findBytenant(tenantId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FlatTenant> findBytenant(long tenantId, int start, int end)
		throws SystemException {
		return findBytenant(tenantId, start, end, null);
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
	public List<FlatTenant> findBytenant(long tenantId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANT;
			finderArgs = new Object[] { tenantId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TENANT;
			finderArgs = new Object[] { tenantId, start, end, orderByComparator };
		}

		List<FlatTenant> list = (List<FlatTenant>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FlatTenant flatTenant : list) {
				if ((tenantId != flatTenant.getTenantId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(2);
			}

			query.append(_SQL_SELECT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_TENANT_TENANTID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tenantId);

				list = (List<FlatTenant>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public FlatTenant findBytenant_First(long tenantId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchBytenant_First(tenantId, orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenantId=");
		msg.append(tenantId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
	}

	/**
	 * Returns the first flat tenant in the ordered set where tenantId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant fetchBytenant_First(long tenantId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FlatTenant> list = findBytenant(tenantId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant findBytenant_Last(long tenantId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchBytenant_Last(tenantId, orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenantId=");
		msg.append(tenantId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
	}

	/**
	 * Returns the last flat tenant in the ordered set where tenantId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat tenant, or <code>null</code> if a matching flat tenant could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatTenant fetchBytenant_Last(long tenantId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBytenant(tenantId);

		List<FlatTenant> list = findBytenant(tenantId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant[] findBytenant_PrevAndNext(long id, long tenantId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FlatTenant[] array = new FlatTenantImpl[3];

			array[0] = getBytenant_PrevAndNext(session, flatTenant, tenantId,
					orderByComparator, true);

			array[1] = flatTenant;

			array[2] = getBytenant_PrevAndNext(session, flatTenant, tenantId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FlatTenant getBytenant_PrevAndNext(Session session,
		FlatTenant flatTenant, long tenantId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLATTENANT_WHERE);

		query.append(_FINDER_COLUMN_TENANT_TENANTID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tenantId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flatTenant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FlatTenant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flat tenants where tenantId = &#63; and tsgId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @param tsgId the tsg ID
	 * @return the matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatTenant> findBytenantTsg(long tenantId, long tsgId)
		throws SystemException {
		return findBytenantTsg(tenantId, tsgId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<FlatTenant> findBytenantTsg(long tenantId, long tsgId,
		int start, int end) throws SystemException {
		return findBytenantTsg(tenantId, tsgId, start, end, null);
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
	public List<FlatTenant> findBytenantTsg(long tenantId, long tsgId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TENANTTSG;
			finderArgs = new Object[] { tenantId, tsgId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TENANTTSG;
			finderArgs = new Object[] {
					tenantId, tsgId,
					
					start, end, orderByComparator
				};
		}

		List<FlatTenant> list = (List<FlatTenant>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FlatTenant flatTenant : list) {
				if ((tenantId != flatTenant.getTenantId()) ||
						(tsgId != flatTenant.getTsgId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_TENANTTSG_TENANTID_2);

			query.append(_FINDER_COLUMN_TENANTTSG_TSGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tenantId);

				qPos.add(tsgId);

				list = (List<FlatTenant>)QueryUtil.list(q, getDialect(), start,
						end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public FlatTenant findBytenantTsg_First(long tenantId, long tsgId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchBytenantTsg_First(tenantId, tsgId,
				orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenantId=");
		msg.append(tenantId);

		msg.append(", tsgId=");
		msg.append(tsgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
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
	public FlatTenant fetchBytenantTsg_First(long tenantId, long tsgId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FlatTenant> list = findBytenantTsg(tenantId, tsgId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant findBytenantTsg_Last(long tenantId, long tsgId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = fetchBytenantTsg_Last(tenantId, tsgId,
				orderByComparator);

		if (flatTenant != null) {
			return flatTenant;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tenantId=");
		msg.append(tenantId);

		msg.append(", tsgId=");
		msg.append(tsgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatTenantException(msg.toString());
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
	public FlatTenant fetchBytenantTsg_Last(long tenantId, long tsgId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBytenantTsg(tenantId, tsgId);

		List<FlatTenant> list = findBytenantTsg(tenantId, tsgId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	public FlatTenant[] findBytenantTsg_PrevAndNext(long id, long tenantId,
		long tsgId, OrderByComparator orderByComparator)
		throws NoSuchFlatTenantException, SystemException {
		FlatTenant flatTenant = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FlatTenant[] array = new FlatTenantImpl[3];

			array[0] = getBytenantTsg_PrevAndNext(session, flatTenant,
					tenantId, tsgId, orderByComparator, true);

			array[1] = flatTenant;

			array[2] = getBytenantTsg_PrevAndNext(session, flatTenant,
					tenantId, tsgId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FlatTenant getBytenantTsg_PrevAndNext(Session session,
		FlatTenant flatTenant, long tenantId, long tsgId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLATTENANT_WHERE);

		query.append(_FINDER_COLUMN_TENANTTSG_TENANTID_2);

		query.append(_FINDER_COLUMN_TENANTTSG_TSGID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tenantId);

		qPos.add(tsgId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flatTenant);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FlatTenant> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flat tenants.
	 *
	 * @return the flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatTenant> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<FlatTenant> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<FlatTenant> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<FlatTenant> list = (List<FlatTenant>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FLATTENANT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FLATTENANT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FlatTenant>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FlatTenant>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the flat tenants where flatId = &#63; from the database.
	 *
	 * @param flatId the flat ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByflatId(long flatId) throws SystemException {
		for (FlatTenant flatTenant : findByflatId(flatId)) {
			remove(flatTenant);
		}
	}

	/**
	 * Removes all the flat tenants where tenantId = &#63; from the database.
	 *
	 * @param tenantId the tenant ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBytenant(long tenantId) throws SystemException {
		for (FlatTenant flatTenant : findBytenant(tenantId)) {
			remove(flatTenant);
		}
	}

	/**
	 * Removes all the flat tenants where tenantId = &#63; and tsgId = &#63; from the database.
	 *
	 * @param tenantId the tenant ID
	 * @param tsgId the tsg ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBytenantTsg(long tenantId, long tsgId)
		throws SystemException {
		for (FlatTenant flatTenant : findBytenantTsg(tenantId, tsgId)) {
			remove(flatTenant);
		}
	}

	/**
	 * Removes all the flat tenants from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FlatTenant flatTenant : findAll()) {
			remove(flatTenant);
		}
	}

	/**
	 * Returns the number of flat tenants where flatId = &#63;.
	 *
	 * @param flatId the flat ID
	 * @return the number of matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public int countByflatId(long flatId) throws SystemException {
		Object[] finderArgs = new Object[] { flatId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_FLATID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_FLATID_FLATID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(flatId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_FLATID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flat tenants where tenantId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @return the number of matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public int countBytenant(long tenantId) throws SystemException {
		Object[] finderArgs = new Object[] { tenantId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TENANT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_TENANT_TENANTID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tenantId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TENANT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flat tenants where tenantId = &#63; and tsgId = &#63;.
	 *
	 * @param tenantId the tenant ID
	 * @param tsgId the tsg ID
	 * @return the number of matching flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public int countBytenantTsg(long tenantId, long tsgId)
		throws SystemException {
		Object[] finderArgs = new Object[] { tenantId, tsgId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TENANTTSG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FLATTENANT_WHERE);

			query.append(_FINDER_COLUMN_TENANTTSG_TENANTID_2);

			query.append(_FINDER_COLUMN_TENANTTSG_TSGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tenantId);

				qPos.add(tsgId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TENANTTSG,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flat tenants.
	 *
	 * @return the number of flat tenants
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FLATTENANT);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the flat tenant persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.tsg.model.FlatTenant")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FlatTenant>> listenersList = new ArrayList<ModelListener<FlatTenant>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<FlatTenant>)InstanceFactory.newInstance(
							clazz.getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(FlatTenantImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = FlatPersistence.class)
	protected FlatPersistence flatPersistence;
	@BeanReference(type = FlatOwnerPersistence.class)
	protected FlatOwnerPersistence flatOwnerPersistence;
	@BeanReference(type = FlatTenantPersistence.class)
	protected FlatTenantPersistence flatTenantPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_FLATTENANT = "SELECT flatTenant FROM FlatTenant flatTenant";
	private static final String _SQL_SELECT_FLATTENANT_WHERE = "SELECT flatTenant FROM FlatTenant flatTenant WHERE ";
	private static final String _SQL_COUNT_FLATTENANT = "SELECT COUNT(flatTenant) FROM FlatTenant flatTenant";
	private static final String _SQL_COUNT_FLATTENANT_WHERE = "SELECT COUNT(flatTenant) FROM FlatTenant flatTenant WHERE ";
	private static final String _FINDER_COLUMN_FLATID_FLATID_2 = "flatTenant.flatId = ?";
	private static final String _FINDER_COLUMN_TENANT_TENANTID_2 = "flatTenant.tenantId = ?";
	private static final String _FINDER_COLUMN_TENANTTSG_TENANTID_2 = "flatTenant.tenantId = ? AND ";
	private static final String _FINDER_COLUMN_TENANTTSG_TSGID_2 = "flatTenant.tsgId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "flatTenant.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FlatTenant exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FlatTenant exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FlatTenantPersistenceImpl.class);
	private static FlatTenant _nullFlatTenant = new FlatTenantImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FlatTenant> toCacheModel() {
				return _nullFlatTenantCacheModel;
			}
		};

	private static CacheModel<FlatTenant> _nullFlatTenantCacheModel = new CacheModel<FlatTenant>() {
			public FlatTenant toEntityModel() {
				return _nullFlatTenant;
			}
		};
}