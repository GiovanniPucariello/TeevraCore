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
 * $Id: CacheManagerTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.caching.impl.dbCache;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class DBCachingServiceTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		DbPool poolCreated = DatabaseManager.setupDBPool(setFields());
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, poolCreated);

		/*
		poolCreated.getConnection().prepareStatement(
				"CREATE TABLE refdata_config " + "( refdata_name varchar(64), "
						+ " datasource_id bigint,"
						+ "  refdata_query varchar(64) NOT NULL)").execute();
		*/
		executeStatement(poolCreated, "CREATE TABLE refdata_config " + "( refdata_name varchar(64), "
				+ " datasource_id bigint,"
				+ "  refdata_query varchar(64) NOT NULL)");

		/*
		poolCreated.getConnection().prepareStatement(
				"CREATE TABLE datasource_config ( datasource_id bigint, "
						+ "datasource_name varchar(64), "
						+ "db_url varchar(256) NOT NULL, "
						+ "db_username varchar(64) NOT NULL,"
						+ "db_password varchar(64) NOT NULL, "
						+ "db_type varchar(64) NOT NULL)").execute();*/
		executeStatement(poolCreated, "CREATE TABLE datasource_config ( datasource_id bigint, "
				+ "datasource_name varchar(64), "
				+ "db_url varchar(256) NOT NULL, "
				+ "db_username varchar(64) NOT NULL,"
				+ "db_password varchar(64) NOT NULL, "
				+ "db_type varchar(64) NOT NULL)" );

	/*	poolCreated.getConnection().prepareStatement(
				"CREATE TABLE myTable_product_details ( product_id bigint NOT NULL, "
						+ "exerciseprice_multiplier bigint)").execute();*/
		
		executeStatement(poolCreated,"CREATE TABLE myTable_product_details ( product_id bigint NOT NULL, "
				+ "exerciseprice_multiplier bigint)");
	}

	private Map<String, String> setFields() {
		Map<String, String> props1 = new HashMap<String, String>();
		props1.put("database.driver.classname", "org.hsqldb.jdbcDriver");
		props1.put("database.username", "sa");
		props1.put("database.password", "");
		props1.put("database.url", "jdbc:hsqldb:mem:fusion_dbpool");
		props1.put("database.initialSize", "2");
		props1.put("database.maxActive", "5");
		props1.put("database.maxOpenActivePrep", "-1");
		props1.put("database.minEvictableIdleTimemillis", "60000");
		props1.put("database.timeBetweenEvictionRunsMillis", "300000");
		return props1;
	}

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.lookup.CachingService#getCache(java.lang.String)}.
	 */
	@Test
	public void testGetCache() throws Exception {

		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		executeStatement(
				dbPool,
				"insert into refdata_config values ('cache1','1', 'select * from myTable_product_details')");
		executeStatement(
				dbPool,
				"insert into datasource_config values ('1','test','jdbc:hsqldb:mem:fusion_dbpool','sa','','org.hsqldb.jdbcDriver')");
		executeStatement(dbPool,
				"insert into myTable_product_details values ('32','3')");

		DBCachingService cachingService = DBCachingService.getInstance();
		DBCache dbCache = cachingService.getCache("cache1");
		
	}

	@After
	protected void tearDown() throws Exception {

		super.tearDown();
		DbPool pool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);

		executeStatement(pool, "drop table  refdata_config ");
		/*pool.getConnection().prepareStatement("drop table  refdata_config ")
				.execute();*/
		executeStatement(pool, "drop table  datasource_config ");
		/*pool.getConnection().prepareStatement("drop table  datasource_config ")
				.execute();*/
		executeStatement(pool, "drop table  myTable_product_details ");
		/*pool.getConnection().prepareStatement(
				"drop table  myTable_product_details ").execute();*/
	}

	private void executeStatement(DbPool pool, String statement)
			throws Exception {
		Connection conn = pool.getConnection();
		Statement stmt = conn.createStatement();
		stmt.execute(statement);
		stmt.close();
		conn.close();
	}

}
