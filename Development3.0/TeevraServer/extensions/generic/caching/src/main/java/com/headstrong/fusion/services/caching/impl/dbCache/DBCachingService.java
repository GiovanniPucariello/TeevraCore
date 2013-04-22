/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2010 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: DBCache.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 15, 2010 
 */

package com.headstrong.fusion.services.caching.impl.dbCache;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.caching.CachingService;
import com.headstrong.fusion.services.caching.exception.CacheException;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * Cache provides the rule engine provision to cache the data. It can load the
 * data from the database and keep a cache of it.
 */
public class DBCachingService implements CachingService<DBCache> {

	/**
	 * Query to get reference data information from database.
	 */
	private static String getRefDataConfig = "select datasource_name, "
			+ "refdata_query from refdata_config , datasource_config where "
			+ "datasource_config.datasource_id = refdata_config.datasource_id and refdata_name=?";

	private static Map<String, DBCache> dbCacheMap = new ConcurrentHashMap<String, DBCache>();
	private static DBCachingService dBCacheManager = new DBCachingService();

	//TODO - Add logger
	private DBCachingService() {

	}

	public static DBCachingService getInstance() {
		return dBCacheManager;
	}

	@Override
	public DBCache getCache(String cacheName) {
		if (!dbCacheMap.containsKey(cacheName)) {
			reloadCache(cacheName);
		}
		return dbCacheMap.get(cacheName);
	}

	@Override
	public void reloadCache(String cacheName) {

		DBCache cache = null;
		try {
			cache = getRefDataConfig(cacheName);
		} catch (CacheException e) {
			e.printStackTrace();
		}
		if (cache != null) {
			try {
				loadCache(cache);
			} catch (CacheException e) {
				e.printStackTrace();
			}
			dbCacheMap.put(cacheName, cache);
		}
	}

	/**
	 * Get the Cache information from database using query 'getRefDataConfig'
	 * 
	 * @precondition
	 * @postcondition
	 * @param cacheName
	 * @return
	 * @throws CacheException
	 */
	private DBCache getRefDataConfig(String cacheName) throws CacheException {
		DBCache cache = null;

		DbPool fusionDB = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		if (fusionDB == null) {
			throw new CacheException("Fusion db not yet configured");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {
			conn = fusionDB.getConnection();
			pStmt = conn.prepareStatement(getRefDataConfig);
			pStmt.setString(1, cacheName);
			rs = pStmt.executeQuery();
			if (rs != null) {
				if (rs.next()) {
					cache = new DBCache();
					cache.setDataSource(rs.getString("datasource_name").trim());
					cache.setSqlStmnt(rs.getString("refdata_query").trim());
				}
			}
		} catch (Exception e) {
			//logger.error("Error while getting ref data config", e);
			throw new CacheException("Error while getting ref data config", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, rs);
		}
		return cache;
	}

	/**
	 * This will reload the cache from db.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws CacheException
	 */
	private void loadCache(DBCache dbCache) throws CacheException {

		String dbQuery = ((DBCache) dbCache).getSqlStmnt();

		//logger.info("Reloading cache with query result :" + dbQuery);

		DbPool pool = DatabaseManager.getInstance(((DBCache) dbCache)
				.getDataSource());
		if (pool == null) {
			throw new CacheException("Pool not found");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		try {
			conn = pool.getConnection();
			pStmt = conn.prepareStatement(dbQuery);
			rs = pStmt.executeQuery();
			Map<String, Object> dbData = ((DBCache) dbCache).getData();

			if (rs != null) {
				dbData.clear();
				while (rs.next()) {
					dbData.put(rs.getString(1).trim(), rs.getString(2).trim());
				}

			}
		} catch (Exception e) {
			//logger.error("Error while reloading cache ", e);
			throw new CacheException("Error while reloading cache", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, rs);
		}
	}

}
