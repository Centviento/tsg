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

import tsg.NoSuchFlatException;

import tsg.model.Flat;

import tsg.model.impl.FlatImpl;
import tsg.model.impl.FlatModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the flat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Whitemonk
 * @see FlatPersistence
 * @see FlatUtil
 * @generated
 */
public class FlatPersistenceImpl extends BasePersistenceImpl<Flat>
	implements FlatPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link FlatUtil} to access the flat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = FlatImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TSGID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBytsgId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TSGID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBytsgId",
			new String[] { Long.class.getName() },
			FlatModelImpl.TSGID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TSGID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBytsgId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HOUSEID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByhouseid",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSEID =
		new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByhouseid",
			new String[] { Long.class.getName() },
			FlatModelImpl.HOUSEID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HOUSEID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByhouseid",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ADDRESSID =
		new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByaddressId",
			new String[] {
				Long.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSID =
		new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByaddressId",
			new String[] { Long.class.getName() },
			FlatModelImpl.ADDRESSID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ADDRESSID = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByaddressId",
			new String[] { Long.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ROOMCNT = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByroomCnt",
			new String[] {
				Integer.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROOMCNT =
		new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByroomCnt",
			new String[] { Integer.class.getName() },
			FlatModelImpl.ROOMCNT_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ROOMCNT = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByroomCnt",
			new String[] { Integer.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, FlatImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the flat in the entity cache if it is enabled.
	 *
	 * @param flat the flat
	 */
	public void cacheResult(Flat flat) {
		EntityCacheUtil.putResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatImpl.class, flat.getPrimaryKey(), flat);

		flat.resetOriginalValues();
	}

	/**
	 * Caches the flats in the entity cache if it is enabled.
	 *
	 * @param flats the flats
	 */
	public void cacheResult(List<Flat> flats) {
		for (Flat flat : flats) {
			if (EntityCacheUtil.getResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
						FlatImpl.class, flat.getPrimaryKey()) == null) {
				cacheResult(flat);
			}
			else {
				flat.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all flats.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(FlatImpl.class.getName());
		}

		EntityCacheUtil.clearCache(FlatImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the flat.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Flat flat) {
		EntityCacheUtil.removeResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatImpl.class, flat.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Flat> flats) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Flat flat : flats) {
			EntityCacheUtil.removeResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
				FlatImpl.class, flat.getPrimaryKey());
		}
	}

	/**
	 * Creates a new flat with the primary key. Does not add the flat to the database.
	 *
	 * @param flatId the primary key for the new flat
	 * @return the new flat
	 */
	public Flat create(long flatId) {
		Flat flat = new FlatImpl();

		flat.setNew(true);
		flat.setPrimaryKey(flatId);

		return flat;
	}

	/**
	 * Removes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param flatId the primary key of the flat
	 * @return the flat that was removed
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat remove(long flatId) throws NoSuchFlatException, SystemException {
		return remove(Long.valueOf(flatId));
	}

	/**
	 * Removes the flat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the flat
	 * @return the flat that was removed
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Flat remove(Serializable primaryKey)
		throws NoSuchFlatException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Flat flat = (Flat)session.get(FlatImpl.class, primaryKey);

			if (flat == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFlatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(flat);
		}
		catch (NoSuchFlatException nsee) {
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
	protected Flat removeImpl(Flat flat) throws SystemException {
		flat = toUnwrappedModel(flat);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, flat);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(flat);

		return flat;
	}

	@Override
	public Flat updateImpl(tsg.model.Flat flat, boolean merge)
		throws SystemException {
		flat = toUnwrappedModel(flat);

		boolean isNew = flat.isNew();

		FlatModelImpl flatModelImpl = (FlatModelImpl)flat;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, flat, merge);

			flat.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !FlatModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((flatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TSGID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatModelImpl.getOriginalTsgId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TSGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TSGID,
					args);

				args = new Object[] { Long.valueOf(flatModelImpl.getTsgId()) };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TSGID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TSGID,
					args);
			}

			if ((flatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSEID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatModelImpl.getOriginalHouseId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOUSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSEID,
					args);

				args = new Object[] { Long.valueOf(flatModelImpl.getHouseId()) };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_HOUSEID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSEID,
					args);
			}

			if ((flatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Long.valueOf(flatModelImpl.getOriginalAddressId())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSID,
					args);

				args = new Object[] { Long.valueOf(flatModelImpl.getAddressId()) };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ADDRESSID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSID,
					args);
			}

			if ((flatModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROOMCNT.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						Integer.valueOf(flatModelImpl.getOriginalRoomCnt())
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROOMCNT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROOMCNT,
					args);

				args = new Object[] { Integer.valueOf(flatModelImpl.getRoomCnt()) };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ROOMCNT, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROOMCNT,
					args);
			}
		}

		EntityCacheUtil.putResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
			FlatImpl.class, flat.getPrimaryKey(), flat);

		return flat;
	}

	protected Flat toUnwrappedModel(Flat flat) {
		if (flat instanceof FlatImpl) {
			return flat;
		}

		FlatImpl flatImpl = new FlatImpl();

		flatImpl.setNew(flat.isNew());
		flatImpl.setPrimaryKey(flat.getPrimaryKey());

		flatImpl.setFlatId(flat.getFlatId());
		flatImpl.setTsgId(flat.getTsgId());
		flatImpl.setCompanyId(flat.getCompanyId());
		flatImpl.setUserId(flat.getUserId());
		flatImpl.setCreateDate(flat.getCreateDate());
		flatImpl.setModifiedDate(flat.getModifiedDate());
		flatImpl.setHouseId(flat.getHouseId());
		flatImpl.setOwnersCnt(flat.getOwnersCnt());
		flatImpl.setTenantsCnt(flat.getTenantsCnt());
		flatImpl.setSpaceCommon(flat.getSpaceCommon());
		flatImpl.setSpaceLiving(flat.getSpaceLiving());
		flatImpl.setRoomCnt(flat.getRoomCnt());
		flatImpl.setFloor(flat.getFloor());
		flatImpl.setNumber(flat.getNumber());
		flatImpl.setAddressId(flat.getAddressId());

		return flatImpl;
	}

	/**
	 * Returns the flat with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat
	 * @return the flat
	 * @throws com.liferay.portal.NoSuchModelException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Flat findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat with the primary key or throws a {@link tsg.NoSuchFlatException} if it could not be found.
	 *
	 * @param flatId the primary key of the flat
	 * @return the flat
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByPrimaryKey(long flatId)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByPrimaryKey(flatId);

		if (flat == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + flatId);
			}

			throw new NoSuchFlatException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				flatId);
		}

		return flat;
	}

	/**
	 * Returns the flat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the flat
	 * @return the flat, or <code>null</code> if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Flat fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the flat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param flatId the primary key of the flat
	 * @return the flat, or <code>null</code> if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByPrimaryKey(long flatId) throws SystemException {
		Flat flat = (Flat)EntityCacheUtil.getResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
				FlatImpl.class, flatId);

		if (flat == _nullFlat) {
			return null;
		}

		if (flat == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				flat = (Flat)session.get(FlatImpl.class, Long.valueOf(flatId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (flat != null) {
					cacheResult(flat);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(FlatModelImpl.ENTITY_CACHE_ENABLED,
						FlatImpl.class, flatId, _nullFlat);
				}

				closeSession(session);
			}
		}

		return flat;
	}

	/**
	 * Returns all the flats where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @return the matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findBytsgId(long tsgId) throws SystemException {
		return findBytsgId(tsgId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the flats where tsgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tsgId the tsg ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @return the range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findBytsgId(long tsgId, int start, int end)
		throws SystemException {
		return findBytsgId(tsgId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the flats where tsgId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param tsgId the tsg ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findBytsgId(long tsgId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TSGID;
			finderArgs = new Object[] { tsgId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TSGID;
			finderArgs = new Object[] { tsgId, start, end, orderByComparator };
		}

		List<Flat> list = (List<Flat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Flat flat : list) {
				if ((tsgId != flat.getTsgId())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_TSGID_TSGID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FlatModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(tsgId);

				list = (List<Flat>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first flat in the ordered set where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findBytsgId_First(long tsgId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchBytsgId_First(tsgId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tsgId=");
		msg.append(tsgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the first flat in the ordered set where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchBytsgId_First(long tsgId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Flat> list = findBytsgId(tsgId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last flat in the ordered set where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findBytsgId_Last(long tsgId, OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchBytsgId_Last(tsgId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("tsgId=");
		msg.append(tsgId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the last flat in the ordered set where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchBytsgId_Last(long tsgId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBytsgId(tsgId);

		List<Flat> list = findBytsgId(tsgId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the flats before and after the current flat in the ordered set where tsgId = &#63;.
	 *
	 * @param flatId the primary key of the current flat
	 * @param tsgId the tsg ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next flat
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat[] findBytsgId_PrevAndNext(long flatId, long tsgId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = findByPrimaryKey(flatId);

		Session session = null;

		try {
			session = openSession();

			Flat[] array = new FlatImpl[3];

			array[0] = getBytsgId_PrevAndNext(session, flat, tsgId,
					orderByComparator, true);

			array[1] = flat;

			array[2] = getBytsgId_PrevAndNext(session, flat, tsgId,
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

	protected Flat getBytsgId_PrevAndNext(Session session, Flat flat,
		long tsgId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLAT_WHERE);

		query.append(_FINDER_COLUMN_TSGID_TSGID_2);

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

		else {
			query.append(FlatModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(tsgId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Flat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flats where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @return the matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByhouseid(long houseId) throws SystemException {
		return findByhouseid(houseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the flats where houseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param houseId the house ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @return the range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByhouseid(long houseId, int start, int end)
		throws SystemException {
		return findByhouseid(houseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the flats where houseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param houseId the house ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByhouseid(long houseId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HOUSEID;
			finderArgs = new Object[] { houseId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HOUSEID;
			finderArgs = new Object[] { houseId, start, end, orderByComparator };
		}

		List<Flat> list = (List<Flat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Flat flat : list) {
				if ((houseId != flat.getHouseId())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_HOUSEID_HOUSEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FlatModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(houseId);

				list = (List<Flat>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first flat in the ordered set where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByhouseid_First(long houseId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByhouseid_First(houseId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("houseId=");
		msg.append(houseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the first flat in the ordered set where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByhouseid_First(long houseId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Flat> list = findByhouseid(houseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last flat in the ordered set where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByhouseid_Last(long houseId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByhouseid_Last(houseId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("houseId=");
		msg.append(houseId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the last flat in the ordered set where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByhouseid_Last(long houseId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByhouseid(houseId);

		List<Flat> list = findByhouseid(houseId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the flats before and after the current flat in the ordered set where houseId = &#63;.
	 *
	 * @param flatId the primary key of the current flat
	 * @param houseId the house ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next flat
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat[] findByhouseid_PrevAndNext(long flatId, long houseId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = findByPrimaryKey(flatId);

		Session session = null;

		try {
			session = openSession();

			Flat[] array = new FlatImpl[3];

			array[0] = getByhouseid_PrevAndNext(session, flat, houseId,
					orderByComparator, true);

			array[1] = flat;

			array[2] = getByhouseid_PrevAndNext(session, flat, houseId,
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

	protected Flat getByhouseid_PrevAndNext(Session session, Flat flat,
		long houseId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLAT_WHERE);

		query.append(_FINDER_COLUMN_HOUSEID_HOUSEID_2);

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

		else {
			query.append(FlatModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(houseId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Flat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flats where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @return the matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByaddressId(long addressId) throws SystemException {
		return findByaddressId(addressId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the flats where addressId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param addressId the address ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @return the range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByaddressId(long addressId, int start, int end)
		throws SystemException {
		return findByaddressId(addressId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the flats where addressId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param addressId the address ID
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByaddressId(long addressId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ADDRESSID;
			finderArgs = new Object[] { addressId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ADDRESSID;
			finderArgs = new Object[] { addressId, start, end, orderByComparator };
		}

		List<Flat> list = (List<Flat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Flat flat : list) {
				if ((addressId != flat.getAddressId())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_ADDRESSID_ADDRESSID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FlatModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(addressId);

				list = (List<Flat>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first flat in the ordered set where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByaddressId_First(long addressId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByaddressId_First(addressId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("addressId=");
		msg.append(addressId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the first flat in the ordered set where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByaddressId_First(long addressId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Flat> list = findByaddressId(addressId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last flat in the ordered set where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByaddressId_Last(long addressId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByaddressId_Last(addressId, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("addressId=");
		msg.append(addressId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the last flat in the ordered set where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByaddressId_Last(long addressId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByaddressId(addressId);

		List<Flat> list = findByaddressId(addressId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the flats before and after the current flat in the ordered set where addressId = &#63;.
	 *
	 * @param flatId the primary key of the current flat
	 * @param addressId the address ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next flat
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat[] findByaddressId_PrevAndNext(long flatId, long addressId,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = findByPrimaryKey(flatId);

		Session session = null;

		try {
			session = openSession();

			Flat[] array = new FlatImpl[3];

			array[0] = getByaddressId_PrevAndNext(session, flat, addressId,
					orderByComparator, true);

			array[1] = flat;

			array[2] = getByaddressId_PrevAndNext(session, flat, addressId,
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

	protected Flat getByaddressId_PrevAndNext(Session session, Flat flat,
		long addressId, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLAT_WHERE);

		query.append(_FINDER_COLUMN_ADDRESSID_ADDRESSID_2);

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

		else {
			query.append(FlatModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(addressId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Flat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flats where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @return the matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByroomCnt(int roomCnt) throws SystemException {
		return findByroomCnt(roomCnt, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the flats where roomCnt = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param roomCnt the room cnt
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @return the range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByroomCnt(int roomCnt, int start, int end)
		throws SystemException {
		return findByroomCnt(roomCnt, start, end, null);
	}

	/**
	 * Returns an ordered range of all the flats where roomCnt = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param roomCnt the room cnt
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findByroomCnt(int roomCnt, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ROOMCNT;
			finderArgs = new Object[] { roomCnt };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ROOMCNT;
			finderArgs = new Object[] { roomCnt, start, end, orderByComparator };
		}

		List<Flat> list = (List<Flat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Flat flat : list) {
				if ((roomCnt != flat.getRoomCnt())) {
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
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_ROOMCNT_ROOMCNT_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(FlatModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roomCnt);

				list = (List<Flat>)QueryUtil.list(q, getDialect(), start, end);
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
	 * Returns the first flat in the ordered set where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByroomCnt_First(int roomCnt,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByroomCnt_First(roomCnt, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roomCnt=");
		msg.append(roomCnt);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the first flat in the ordered set where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByroomCnt_First(int roomCnt,
		OrderByComparator orderByComparator) throws SystemException {
		List<Flat> list = findByroomCnt(roomCnt, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last flat in the ordered set where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat
	 * @throws tsg.NoSuchFlatException if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat findByroomCnt_Last(int roomCnt,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = fetchByroomCnt_Last(roomCnt, orderByComparator);

		if (flat != null) {
			return flat;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("roomCnt=");
		msg.append(roomCnt);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchFlatException(msg.toString());
	}

	/**
	 * Returns the last flat in the ordered set where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching flat, or <code>null</code> if a matching flat could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat fetchByroomCnt_Last(int roomCnt,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByroomCnt(roomCnt);

		List<Flat> list = findByroomCnt(roomCnt, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the flats before and after the current flat in the ordered set where roomCnt = &#63;.
	 *
	 * @param flatId the primary key of the current flat
	 * @param roomCnt the room cnt
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next flat
	 * @throws tsg.NoSuchFlatException if a flat with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Flat[] findByroomCnt_PrevAndNext(long flatId, int roomCnt,
		OrderByComparator orderByComparator)
		throws NoSuchFlatException, SystemException {
		Flat flat = findByPrimaryKey(flatId);

		Session session = null;

		try {
			session = openSession();

			Flat[] array = new FlatImpl[3];

			array[0] = getByroomCnt_PrevAndNext(session, flat, roomCnt,
					orderByComparator, true);

			array[1] = flat;

			array[2] = getByroomCnt_PrevAndNext(session, flat, roomCnt,
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

	protected Flat getByroomCnt_PrevAndNext(Session session, Flat flat,
		int roomCnt, OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_FLAT_WHERE);

		query.append(_FINDER_COLUMN_ROOMCNT_ROOMCNT_2);

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

		else {
			query.append(FlatModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(roomCnt);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(flat);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Flat> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the flats.
	 *
	 * @return the flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Flat> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the flats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of flats
	 * @param end the upper bound of the range of flats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of flats
	 * @throws SystemException if a system exception occurred
	 */
	public List<Flat> findAll(int start, int end,
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

		List<Flat> list = (List<Flat>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_FLAT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_FLAT.concat(FlatModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Flat>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Flat>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the flats where tsgId = &#63; from the database.
	 *
	 * @param tsgId the tsg ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeBytsgId(long tsgId) throws SystemException {
		for (Flat flat : findBytsgId(tsgId)) {
			remove(flat);
		}
	}

	/**
	 * Removes all the flats where houseId = &#63; from the database.
	 *
	 * @param houseId the house ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByhouseid(long houseId) throws SystemException {
		for (Flat flat : findByhouseid(houseId)) {
			remove(flat);
		}
	}

	/**
	 * Removes all the flats where addressId = &#63; from the database.
	 *
	 * @param addressId the address ID
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByaddressId(long addressId) throws SystemException {
		for (Flat flat : findByaddressId(addressId)) {
			remove(flat);
		}
	}

	/**
	 * Removes all the flats where roomCnt = &#63; from the database.
	 *
	 * @param roomCnt the room cnt
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByroomCnt(int roomCnt) throws SystemException {
		for (Flat flat : findByroomCnt(roomCnt)) {
			remove(flat);
		}
	}

	/**
	 * Removes all the flats from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Flat flat : findAll()) {
			remove(flat);
		}
	}

	/**
	 * Returns the number of flats where tsgId = &#63;.
	 *
	 * @param tsgId the tsg ID
	 * @return the number of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public int countBytsgId(long tsgId) throws SystemException {
		Object[] finderArgs = new Object[] { tsgId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_TSGID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_TSGID_TSGID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

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

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_TSGID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flats where houseId = &#63;.
	 *
	 * @param houseId the house ID
	 * @return the number of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public int countByhouseid(long houseId) throws SystemException {
		Object[] finderArgs = new Object[] { houseId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_HOUSEID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_HOUSEID_HOUSEID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(houseId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_HOUSEID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flats where addressId = &#63;.
	 *
	 * @param addressId the address ID
	 * @return the number of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public int countByaddressId(long addressId) throws SystemException {
		Object[] finderArgs = new Object[] { addressId };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ADDRESSID,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_ADDRESSID_ADDRESSID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(addressId);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ADDRESSID,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flats where roomCnt = &#63;.
	 *
	 * @param roomCnt the room cnt
	 * @return the number of matching flats
	 * @throws SystemException if a system exception occurred
	 */
	public int countByroomCnt(int roomCnt) throws SystemException {
		Object[] finderArgs = new Object[] { roomCnt };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ROOMCNT,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_FLAT_WHERE);

			query.append(_FINDER_COLUMN_ROOMCNT_ROOMCNT_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(roomCnt);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ROOMCNT,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of flats.
	 *
	 * @return the number of flats
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_FLAT);

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
	 * Initializes the flat persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.tsg.model.Flat")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Flat>> listenersList = new ArrayList<ModelListener<Flat>>();

				for (String listenerClassName : listenerClassNames) {
					Class<?> clazz = getClass();

					listenersList.add((ModelListener<Flat>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(FlatImpl.class.getName());
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
	private static final String _SQL_SELECT_FLAT = "SELECT flat FROM Flat flat";
	private static final String _SQL_SELECT_FLAT_WHERE = "SELECT flat FROM Flat flat WHERE ";
	private static final String _SQL_COUNT_FLAT = "SELECT COUNT(flat) FROM Flat flat";
	private static final String _SQL_COUNT_FLAT_WHERE = "SELECT COUNT(flat) FROM Flat flat WHERE ";
	private static final String _FINDER_COLUMN_TSGID_TSGID_2 = "flat.tsgId = ?";
	private static final String _FINDER_COLUMN_HOUSEID_HOUSEID_2 = "flat.houseId = ?";
	private static final String _FINDER_COLUMN_ADDRESSID_ADDRESSID_2 = "flat.addressId = ?";
	private static final String _FINDER_COLUMN_ROOMCNT_ROOMCNT_2 = "flat.roomCnt = ?";
	private static final String _ORDER_BY_ENTITY_ALIAS = "flat.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Flat exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Flat exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(FlatPersistenceImpl.class);
	private static Flat _nullFlat = new FlatImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Flat> toCacheModel() {
				return _nullFlatCacheModel;
			}
		};

	private static CacheModel<Flat> _nullFlatCacheModel = new CacheModel<Flat>() {
			public Flat toEntityModel() {
				return _nullFlat;
			}
		};
}