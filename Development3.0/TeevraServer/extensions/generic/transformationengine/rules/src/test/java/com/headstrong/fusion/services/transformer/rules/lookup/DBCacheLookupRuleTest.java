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
 * $Id: DBCacheLookupRuleTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.transformer.rules.lookup;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class DBCacheLookupRuleTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
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
		
		DbPool dbPool = DatabaseManager.setupDBPool(props1);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);

		executeStatement(dbPool,
				"create table IsinCusipMapping (cusip varchar(50),isin varchar(50))");
		executeStatement(dbPool,
				"insert into IsinCusipMapping values ('459200101','US4592001014')");
		executeStatement(dbPool,
				"insert into IsinCusipMapping values ('594918104','US5949181045')");
		executeStatement(dbPool,
				"insert into IsinCusipMapping values ('100','12345')");

		executeStatement(dbPool,
				"create table NameIdMapping (id varchar(50),name varchar(50))");
		executeStatement(dbPool,
				"insert into NameIdMapping values ('12','abcd')");
		executeStatement(dbPool, "insert into NameIdMapping values ('34','ce')");
		executeStatement(dbPool, "insert into NameIdMapping values ('98','ui')");

		executeStatement(dbPool,
				"CREATE TABLE datasource_config ( datasource_id bigint, "
						+ "datasource_name varchar(64), "
						+ " db_url varchar(256) NOT NULL, "
						+ "db_username varchar(64) NOT NULL,"
						+ "db_password varchar(64) NOT NULL, "
						+ "db_type varchar(64) NOT NULL)");
		executeStatement(
				dbPool,
				"insert into datasource_config values (1,'ds1',"
						+ "'jdbc:hsqldb:mem:fusion_dbpool','sa','','org.hsqldb.jdbcDriver')");

		executeStatement(dbPool, "CREATE TABLE refdata_config "
				+ "( refdata_name varchar(64), " + " datasource_id bigint,"
				+ "  refdata_query varchar(64) NOT NULL)");

		executeStatement(dbPool,
				"insert into refdata_config values ('isinloader',1,"
						+ "'select cusip,isin from IsinCusipMapping ')");

		executeStatement(dbPool,
				"insert into refdata_config values ('nameloader',1,"
						+ "'select id,name from NameIdMapping ')");
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DbPool dbPool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		executeStatement(dbPool, "drop table IsinCusipMapping");
		executeStatement(dbPool, "drop table NameIdMapping");
		executeStatement(dbPool, "drop table refdata_config");
		executeStatement(dbPool, "drop table datasource_config");
		

		DatabaseManager.shutdownDBPools();
	}

	/**
	 * Test method for
	 * {@link com.headstrong.fusion.services.transformer.rules.lookup.DBCacheLookupRule#operate(java.util.Map)}.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testOperate() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("cachename", "isinloader");
		data.put("operand", "459200101");

		DBCacheLookupRule rule = new DBCacheLookupRule();
		Object output = rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String, Object> outputMap = (Map<String, Object>) output;
		assertNotNull(outputMap.get("result"));
		assertEquals("US4592001014", (String) outputMap.get("result"));

		data.put("operand", "594918104");
		output = rule.operate(data);
		assertTrue(output instanceof Map);
		outputMap = (Map<String, Object>) output;
		assertNotNull(outputMap.get("result"));
		assertEquals("US5949181045", (String) outputMap.get("result"));

		Map<String, Object> data1 = new HashMap<String, Object>();
		data1.put("cachename", "nameloader");
		data1.put("operand", "34");
		output = rule.operate(data1);
		assertTrue(output instanceof Map);
		outputMap = (Map<String, Object>) output;
		assertNotNull(outputMap.get("result"));
		assertEquals("ce", (String) outputMap.get("result"));

	}

	@SuppressWarnings("unchecked")
	public void testOperateInteger() throws Exception {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("cachename", "isinloader");
		data.put("dbpoolname", FusionConstants.FUSIONDB);
		data.put("operand", 100);

		DBCacheLookupRule rule = new DBCacheLookupRule();
		Object output = rule.operate(data);
		assertTrue(output instanceof Map);
		Map<String, Object> outputMap = (Map<String, Object>) output;
		assertNotNull(outputMap.get("result"));
		assertEquals("12345", (String) outputMap.get("result"));
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
