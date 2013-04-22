/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: DatabaseManager.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 1, 2008 
 */

package com.headstrong.fusion.services.dbpool.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;

/**
 * <code>DatabaseManager</code> provides the factory for the database pool
 * used by the fusion framework framework.
 */
public class DatabaseManager {
	private static Logger logger = LoggerFactory
			.getLogger(DatabaseManager.class);

	/**
	 * Query to get the datasources configured in database.
	 */
	private static String getDataSourcesSQL = "select db_url, db_username, db_password, "
			+ "db_type from datasource_config where datasource_name=?";
	/**
	 * Map containing the database sources being managed
	 */
	private static Map<String, DbPool> dbMap = new Hashtable<String, DbPool>();

	/**
	 * List containing all the dbpools created.
	 */
	private static List<DbPool> dbPoolList = new ArrayList<DbPool>();

	/**
	 * Returns the dbpool object for the poolName provided
	 * 
	 * @precondition
	 * @postcondition
	 * @param poolName
	 *            pool name
	 * @return {@link DbPool}
	 */
	public static DbPool getInstance(String poolName) {
		if (!dbMap.containsKey(poolName)) {
			try {
				DbPool dbPool = getDataSourceConfig(poolName);
				if (dbPool != null) {
					registerDBPool(poolName, dbPool);
				}
			} catch (FusionException e) {
				logger.error("No such pool in db", e);
			}
		}
		return dbMap.get(poolName);
	}

	/**
	 * setupDataSource function creates the Database pool instance for the pool
	 * properties provided.
	 * 
	 * @precondition
	 * @postcondition
	 * @param props
	 *            The mandatory fields used to configure the database pool.
	 * @throws FusionException
	 *             If error while creating the dbpool.
	 */
	public static DbPool setupDBPool(Map<String, String> props)
			throws FusionException {
		logger.info("Setting up database pool with properties " + props);
		DbPool dbPool = new DbPool(props);
		dbPoolList.add(dbPool);
		logger.info("Setup complete");
		return dbPool;

	}

	/**
	 * Registers the {@link DbPool} with the poolName given.
	 * 
	 * @precondition
	 * @postcondition
	 * @param poolName
	 * @param dbPool
	 */
	public static void registerDBPool(String poolName, DbPool dbPool) {
		dbMap.put(poolName, dbPool);
	}

	/**
	 * shutdownDataSource closes the all the dbpools created.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws SQLException
	 *             When there is an error while shutting down the db pool
	 */
	public static void shutdownDBPools() {
		for (Iterator<DbPool> it = dbPoolList.iterator(); it.hasNext();) {
			try {
				it.next().shutdown();
			} catch (SQLException e) {
				logger.error("Error while closing the dbpool", e);
			}
			dbMap.clear();
		}
	}

	/**
	 * Gets the configuration of the datasource for the specified poolName from
	 * the database table.
	 * 
	 * @precondition
	 * @postcondition
	 * @param poolName
	 * @return
	 * @throws FusionException
	 */
	public static DbPool getDataSourceConfig(String poolName)
			throws FusionException {
		DbPool dbPool = null;
		DbPool fusionDB = dbMap.get(FusionConstants.FUSIONDB);
		if (fusionDB == null) {
			throw new FusionException("Fusion db not yet configured");
		}

		Connection conn = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;

		try {
			conn = fusionDB.getConnection();
			pStmt = conn.prepareStatement(getDataSourcesSQL);
			pStmt.setString(1, poolName);
			rs = pStmt.executeQuery();
			if (rs != null) {
				if (rs.next()) {
					Map<String, String> config = new HashMap<String, String>();
					config.put(FusionConstants.DATABASE_CLASSNAME, rs
							.getString("db_type"));
					config.put(FusionConstants.DATABASE_URL, rs
							.getString("db_url"));
					config.put(FusionConstants.DATABASE_USERNAME, rs
							.getString("db_username"));
					// Decrypting the encrypted password.
					String password = rs.getString("db_password");
					if (password != null && !password.trim().equals("")) {
						config.put(FusionConstants.DATABASE_PASSWORD, FusionUtil.decrypt(password));
					}
					else {
						config.put(FusionConstants.DATABASE_PASSWORD, password);
					}
					dbPool = new DbPool(config);
				}
			}
		} catch (Exception e) {
			logger.error("Error while getting the datasource config", e);
			throw new FusionException("Error while getting ds config", e);
		} finally {
			DatabaseManager.releaseResources(conn, pStmt, rs);
		}

		return dbPool;

	}

	/**
	 * Release SQL resources.
	 * 
	 * @precondition
	 * @postcondition
	 * @param conn
	 * @param stmt
	 * @param rs
	 */
	public static void releaseResources(Connection conn, Statement stmt,
			ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				logger.debug("Resultset already closed");
			}
		}

		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				logger.debug("Statement already closed");
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.debug("Connection already closed");
			}

		}
	}

}
