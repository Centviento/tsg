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

import tsg.NoSuchFlatOwnerException;

import tsg.model.FlatOwner;

import tsg.model.impl.FlatOwnerImpl;
import tsg.model.impl.FlatOwnerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the flat owner service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatOwnerPersistence
 * @see FlatOwnerUtil
 * @generated
 */
public class FlatOwnerPersistenceImpl extends BasePersistenceImpl<FlatOwner>
	implements FlatOwnerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FlatOwnerUtil} to access the flat owner persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FlatOwnerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OWNER = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByowner",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNER = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByowner",
			new String[] { Long.class.getName() },
			FlatOwnerModelImpl.OWNERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OWNER = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByowner",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_OWNERTSG = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByownerTsg",
			new String[] {
				Long.class.getName(), Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNERTSG =
		new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByownerTsg",
			new String[] { Long.class.getName(), Long.class.getName() },
			FlatOwnerModelImpl.TSGID_COLUMN_BITMASK |
			FlatOwnerModelImpl.OWNERID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_OWNERTSG = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByownerTsg",
			new String[] { Long.class.getName(), Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, FlatOwnerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the flat owner in the entity cache if it is enabled.
	 *
	 * @param flatOwner the flat owner
	 */
	public void cacheResult(FlatOwner flatOwner) {
		EntityCacheUtil.putResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerImpl.class, flatOwner.getPrimaryKey(), flatOwner);

		flatOwner.resetOriginalValues();
	}

	/**
	 * Caches the flat owners in the entity cache if it is enabled.
	 *
	 * @param flatOwners the flat owners
	 */
	public void cacheResult(List<FlatOwner> flatOwners) {
		for (FlatOwner flatOwner : flatOwners) {
			if (EntityCacheUtil.getResult(
						FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
						FlatOwnerImpl.class, flatOwner.getPrimaryKey()) == null) {
				cacheResult(flatOwner);
			}
			else {
				flatOwner.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all flat owners.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FlatOwnerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FlatOwnerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the flat owner.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FlatOwner flatOwner) {
		EntityCacheUtil.removeResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerImpl.class, flatOwner.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<FlatOwner> flatOwners) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (FlatOwner flatOwner : flatOwners) {
			EntityCacheUtil.removeResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
				FlatOwnerImpl.class, flatOwner.getPrimaryKey());
		}
	}

	/**
	 * Creates a new flat owner with the primary key. Does not add the flat owner to the database.
	 *
	 * @param id the primary key for the new flat owner
	 * @return the new flat owner
	 */
	public FlatOwner create(long id) {
		FlatOwner flatOwner = new FlatOwnerImpl();

		flatOwner.setNew(true);
		flatOwner.setPrimaryKey(id);

		return flatOwner;
	}

	/**
	 * Removes the flat owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the flat owner
	 * @return the flat owner that was removed
	 * @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner remove(long id)
		throws NoSuchFlatOwnerException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the flat owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the flat owner
	 * @return the flat owner that was removed
	 * @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatOwner remove(Serializable primaryKey)
		throws NoSuchFlatOwnerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			FlatOwner flatOwner = (FlatOwner)session.get(FlatOwnerImpl.class,
					primaryKey);

			if (flatOwner == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFlatOwnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(flatOwner);
		}
		catch (NoSuchFlatOwnerException nsee) {
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
	protected FlatOwner removeImpl(FlatOwner flatOwner)
		throws SystemException {
		flatOwner = toUnwrappedModel(flatOwner);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, flatOwner);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(flatOwner);

		return flatOwner;
	}

	@Override
	public FlatOwner updateImpl(tsg.model.FlatOwner flatOwner, boolean merge)
		throws SystemException {
		flatOwner = toUnwrappedModel(flatOwner);

		boolean isNew = flatOwner.isNew();

		FlatOwnerModelImpl flatOwnerModelImpl = (FlatOwnerModelImpl)flatOwner;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, flatOwner, merge);

			flatOwner.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FlatOwnerModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((flatOwnerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatOwnerModelImpl.getOriginalOwnerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OWNER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNER,
					args);

				args = new Object[] {
						Long.valueOf(flatOwnerModelImpl.getOwnerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OWNER, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNER,
					args);
			}

			if ((flatOwnerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNERTSG.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatOwnerModelImpl.getOriginalTsgId()),
						Long.valueOf(flatOwnerModelImpl.getOriginalOwnerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OWNERTSG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNERTSG,
					args);

				args = new Object[] {
						Long.valueOf(flatOwnerModelImpl.getTsgId()),
						Long.valueOf(flatOwnerModelImpl.getOwnerId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_OWNERTSG, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNERTSG,
					args);
			}
		}

		EntityCacheUtil.putResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
			FlatOwnerImpl.class, flatOwner.getPrimaryKey(), flatOwner);

		return flatOwner;
	}

	protected FlatOwner toUnwrappedModel(FlatOwner flatOwner) {
		if (flatOwner instanceof FlatOwnerImpl) {
			return flatOwner;
		}

		FlatOwnerImpl flatOwnerImpl = new FlatOwnerImpl();

		flatOwnerImpl.setNew(flatOwner.isNew());
		flatOwnerImpl.setPrimaryKey(flatOwner.getPrimaryKey());

		flatOwnerImpl.setId(flatOwner.getId());
		flatOwnerImpl.setOwnerId(flatOwner.getOwnerId());
		flatOwnerImpl.setTsgId(flatOwner.getTsgId());
		flatOwnerImpl.setCompanyId(flatOwner.getCompanyId());
		flatOwnerImpl.setUserId(flatOwner.getUserId());
		flatOwnerImpl.setCreateDate(flatOwner.getCreateDate());
		flatOwnerImpl.setModifiedDate(flatOwner.getModifiedDate());
		flatOwnerImpl.setFlatId(flatOwner.getFlatId());
		flatOwnerImpl.setFromDate(flatOwner.getFromDate());
		flatOwnerImpl.setToDate(flatOwner.getToDate());
		flatOwnerImpl.setPercent(flatOwner.getPercent());
		flatOwnerImpl.setArea(flatOwner.getArea());
		flatOwnerImpl.setShared(flatOwner.isShared());

		return flatOwnerImpl;
	}

	/**
	 * Returns the flat owner with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat owner
	 * @return the flat owner
	 * @throws com.liferay.portal.NoSuchModelException if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatOwner findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat owner with the primary key or throws a {@link tsg.NoSuchFlatOwnerException} if it could not be found.
	 *
	 * @param id the primary key of the flat owner
	 * @return the flat owner
	 * @throws tsg.NoSuchFlatOwnerException if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner findByPrimaryKey(long id)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = fetchByPrimaryKey(id);

		if (flatOwner == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchFlatOwnerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return flatOwner;
	}

	/**
	 * Returns the flat owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat owner
	 * @return the flat owner, or <code>null</code> if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public FlatOwner fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat owner with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the flat owner
	 * @return the flat owner, or <code>null</code> if a flat owner with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner fetchByPrimaryKey(long id) throws SystemException {
		FlatOwner flatOwner = (FlatOwner)EntityCacheUtil.getResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
				FlatOwnerImpl.class, id);

		if (flatOwner == _nullFlatOwner) {
			return null;
		}

		if (flatOwner == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				flatOwner = (FlatOwner)session.get(FlatOwnerImpl.class,
						Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (flatOwner != null) {
					cacheResult(flatOwner);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FlatOwnerModelImpl.ENTITY_CACHE_ENABLED,
						FlatOwnerImpl.class, id, _nullFlatOwner);
				}

				closeSession(session);
			}
		}

		return flatOwner;
	}

	/**
	 * Returns all the flat owners where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @return the matching flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatOwner> findByowner(long ownerId) throws SystemException {
		return findByowner(ownerId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	public List<FlatOwner> findByowner(long ownerId, int start, int end)
		throws SystemException {
		return findByowner(ownerId, start, end, null);
	}

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
	public List<FlatOwner> findByowner(long ownerId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNER;
			finderArgs = new Object[] { ownerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OWNER;
			finderArgs = new Object[] { ownerId, start, end, orderByComparator };
		}

		List<FlatOwner> list = (List<FlatOwner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FlatOwner flatOwner : list) {
				if ((ownerId != flatOwner.getOwnerId())) {
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

			query.append(_SQL_SELECT_FLATOWNER_WHERE);

			query.append(_FINDER_COLUMN_OWNER_OWNERID_2);

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

				qPos.add(ownerId);

				list = (List<FlatOwner>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first flat owner in the ordered set where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat owner
	 * @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner findByowner_First(long ownerId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = fetchByowner_First(ownerId, orderByComparator);

		if (flatOwner != null) {
			return flatOwner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ownerId=");
		msg.append(ownerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatOwnerException(msg.toString());
	}

	/**
	 * Returns the first flat owner in the ordered set where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat owner, or <code>null</code> if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner fetchByowner_First(long ownerId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FlatOwner> list = findByowner(ownerId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last flat owner in the ordered set where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat owner
	 * @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner findByowner_Last(long ownerId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = fetchByowner_Last(ownerId, orderByComparator);

		if (flatOwner != null) {
			return flatOwner;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("ownerId=");
		msg.append(ownerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatOwnerException(msg.toString());
	}

	/**
	 * Returns the last flat owner in the ordered set where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat owner, or <code>null</code> if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner fetchByowner_Last(long ownerId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByowner(ownerId);

		List<FlatOwner> list = findByowner(ownerId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	public FlatOwner[] findByowner_PrevAndNext(long id, long ownerId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FlatOwner[] array = new FlatOwnerImpl[3];

			array[0] = getByowner_PrevAndNext(session, flatOwner, ownerId,
					orderByComparator, true);

			array[1] = flatOwner;

			array[2] = getByowner_PrevAndNext(session, flatOwner, ownerId,
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

	protected FlatOwner getByowner_PrevAndNext(Session session,
		FlatOwner flatOwner, long ownerId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLATOWNER_WHERE);

		query.append(_FINDER_COLUMN_OWNER_OWNERID_2);

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

		qPos.add(ownerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flatOwner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FlatOwner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flat owners where tsgId = &#63; and ownerId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @return the matching flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatOwner> findByownerTsg(long tsgId, long ownerId)
		throws SystemException {
		return findByownerTsg(tsgId, ownerId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	public List<FlatOwner> findByownerTsg(long tsgId, long ownerId, int start,
		int end) throws SystemException {
		return findByownerTsg(tsgId, ownerId, start, end, null);
	}

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
	public List<FlatOwner> findByownerTsg(long tsgId, long ownerId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_OWNERTSG;
			finderArgs = new Object[] { tsgId, ownerId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_OWNERTSG;
			finderArgs = new Object[] {
					tsgId, ownerId,
					
					start, end, orderByComparator
				};
		}

		List<FlatOwner> list = (List<FlatOwner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (FlatOwner flatOwner : list) {
				if ((tsgId != flatOwner.getTsgId()) ||
						(ownerId != flatOwner.getOwnerId())) {
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

			query.append(_SQL_SELECT_FLATOWNER_WHERE);

			query.append(_FINDER_COLUMN_OWNERTSG_TSGID_2);

			query.append(_FINDER_COLUMN_OWNERTSG_OWNERID_2);

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

				qPos.add(tsgId);

				qPos.add(ownerId);

				list = (List<FlatOwner>)QueryUtil.list(q, getDialect(), start,
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
	 * Returns the first flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat owner
	 * @throws tsg.NoSuchFlatOwnerException if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner findByownerTsg_First(long tsgId, long ownerId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = fetchByownerTsg_First(tsgId, ownerId,
				orderByComparator);

		if (flatOwner != null) {
			return flatOwner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tsgId=");
		msg.append(tsgId);

		msg.append(", ownerId=");
		msg.append(ownerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatOwnerException(msg.toString());
	}

	/**
	 * Returns the first flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat owner, or <code>null</code> if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner fetchByownerTsg_First(long tsgId, long ownerId,
		OrderByComparator orderByComparator) throws SystemException {
		List<FlatOwner> list = findByownerTsg(tsgId, ownerId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	public FlatOwner findByownerTsg_Last(long tsgId, long ownerId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = fetchByownerTsg_Last(tsgId, ownerId,
				orderByComparator);

		if (flatOwner != null) {
			return flatOwner;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tsgId=");
		msg.append(tsgId);

		msg.append(", ownerId=");
		msg.append(ownerId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatOwnerException(msg.toString());
	}

	/**
	 * Returns the last flat owner in the ordered set where tsgId = &#63; and ownerId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat owner, or <code>null</code> if a matching flat owner could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public FlatOwner fetchByownerTsg_Last(long tsgId, long ownerId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByownerTsg(tsgId, ownerId);

		List<FlatOwner> list = findByownerTsg(tsgId, ownerId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	public FlatOwner[] findByownerTsg_PrevAndNext(long id, long tsgId,
		long ownerId, OrderByComparator orderByComparator)
		throws NoSuchFlatOwnerException, SystemException {
		FlatOwner flatOwner = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			FlatOwner[] array = new FlatOwnerImpl[3];

			array[0] = getByownerTsg_PrevAndNext(session, flatOwner, tsgId,
					ownerId, orderByComparator, true);

			array[1] = flatOwner;

			array[2] = getByownerTsg_PrevAndNext(session, flatOwner, tsgId,
					ownerId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected FlatOwner getByownerTsg_PrevAndNext(Session session,
		FlatOwner flatOwner, long tsgId, long ownerId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLATOWNER_WHERE);

		query.append(_FINDER_COLUMN_OWNERTSG_TSGID_2);

		query.append(_FINDER_COLUMN_OWNERTSG_OWNERID_2);

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

		qPos.add(tsgId);

		qPos.add(ownerId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flatOwner);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<FlatOwner> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flat owners.
	 *
	 * @return the flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public List<FlatOwner> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	public List<FlatOwner> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	public List<FlatOwner> findAll(int start, int end,
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

		List<FlatOwner> list = (List<FlatOwner>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FLATOWNER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FLATOWNER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<FlatOwner>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<FlatOwner>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the flat owners where ownerId = &#63; from the database.
	 *
	 * @param ownerId the owner ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByowner(long ownerId) throws SystemException {
		for (FlatOwner flatOwner : findByowner(ownerId)) {
			remove(flatOwner);
		}
	}

	/**
	 * Removes all the flat owners where tsgId = &#63; and ownerId = &#63; from the database.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByownerTsg(long tsgId, long ownerId)
		throws SystemException {
		for (FlatOwner flatOwner : findByownerTsg(tsgId, ownerId)) {
			remove(flatOwner);
		}
	}

	/**
	 * Removes all the flat owners from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (FlatOwner flatOwner : findAll()) {
			remove(flatOwner);
		}
	}

	/**
	 * Returns the number of flat owners where ownerId = &#63;.
	 *
	 * @param ownerId the owner ID
	 * @return the number of matching flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public int countByowner(long ownerId) throws SystemException {
		Object[] finderArgs = new Object[] { ownerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_OWNER,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLATOWNER_WHERE);

			query.append(_FINDER_COLUMN_OWNER_OWNERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(ownerId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OWNER,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flat owners where tsgId = &#63; and ownerId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param ownerId the owner ID
	 * @return the number of matching flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public int countByownerTsg(long tsgId, long ownerId)
		throws SystemException {
		Object[] finderArgs = new Object[] { tsgId, ownerId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_OWNERTSG,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_FLATOWNER_WHERE);

			query.append(_FINDER_COLUMN_OWNERTSG_TSGID_2);

			query.append(_FINDER_COLUMN_OWNERTSG_OWNERID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tsgId);

				qPos.add(ownerId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_OWNERTSG,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flat owners.
	 *
	 * @return the number of flat owners
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FLATOWNER);

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
	 * Initializes the flat owner persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.tsg.model.FlatOwner")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<FlatOwner>> listenersList = new ArrayList<ModelListener<FlatOwner>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<FlatOwner>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FlatOwnerImpl.class.getName());
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
	private static final String _SQL_SELECT_FLATOWNER = "SELECT flatOwner FROM FlatOwner flatOwner";
	private static final String _SQL_SELECT_FLATOWNER_WHERE = "SELECT flatOwner FROM FlatOwner flatOwner WHERE ";
	private static final String _SQL_COUNT_FLATOWNER = "SELECT COUNT(flatOwner) FROM FlatOwner flatOwner";
	private static final String _SQL_COUNT_FLATOWNER_WHERE = "SELECT COUNT(flatOwner) FROM FlatOwner flatOwner WHERE ";
	private static final String _FINDER_COLUMN_OWNER_OWNERID_2 = "flatOwner.ownerId = ?";
	private static final String _FINDER_COLUMN_OWNERTSG_TSGID_2 = "flatOwner.tsgId = ? AND ";
	private static final String _FINDER_COLUMN_OWNERTSG_OWNERID_2 = "flatOwner.ownerId = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "flatOwner.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No FlatOwner exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No FlatOwner exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FlatOwnerPersistenceImpl.class);
	private static FlatOwner _nullFlatOwner = new FlatOwnerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<FlatOwner> toCacheModel() {
				return _nullFlatOwnerCacheModel;
			}
		};

	private static CacheModel<FlatOwner> _nullFlatOwnerCacheModel = new CacheModel<FlatOwner>() {
			public FlatOwner toEntityModel() {
				return _nullFlatOwner;
			}
		};
}