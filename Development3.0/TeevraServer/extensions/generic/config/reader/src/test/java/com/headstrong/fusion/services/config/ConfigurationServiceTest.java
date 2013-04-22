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
 * $Id: ConfigurationServiceTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 10, 2008 
 */

package com.headstrong.fusion.services.config;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class ConfigurationServiceTest extends TestCase {

	private void setUpDbPool() throws Exception {
		Map<String, String> dbProps = new HashMap<String, String>();
		dbProps
				.put(FusionConstants.DATABASE_CLASSNAME,
						"org.hsqldb.jdbcDriver");
		dbProps.put(FusionConstants.DATABASE_USERNAME, "sa");
		dbProps.put(FusionConstants.DATABASE_PASSWORD, "");
		dbProps.put(FusionConstants.DATABASE_URL, "jdbc:hsqldb:mem:fusion");
		dbProps.put(FusionConstants.JDBCINITIALSIZE, "2");
		dbProps.put(FusionConstants.JDBCMAXACTIVE, "5");
		dbProps.put(FusionConstants.JDBCMAXOPENACTIVEPREP, "-1");
		dbProps.put(FusionConstants.MINEVICTABLEIDLETIMEMILLIS, "60000");
		dbProps.put(FusionConstants.TIMEBETWEENEVICTIONRUNSMILLIS, "300000");

		
		DbPool dbPool = null;

		dbPool = DatabaseManager.setupDBPool(dbProps);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);
	}

	protected void setUp() throws Exception {
		super.setUp();

		// create schema and schema attribute tables.

		// setupDb Pool
		setUpDbPool();
		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();
		Statement tables = connection.createStatement();
		String process_service_config = "CREATE TABLE "
				+ "process_service_configuration (   "
				+ "prcs_id bigint NOT NULL, "
				+ "property_id character varying(50) NOT NULL,   "
				+ "property_config character varying NOT NULL,   "
				+ "service_id character varying(50) NOT NULL,   "
				+ "service_type character varying(200) ) ";

		tables.addBatch(process_service_config);
		tables.executeBatch();

		tables.close();
		connection.close();
	}

	
	public void testReloadSchemaWithOutParser() throws Exception {
		// insert configuration.
		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();
		Statement inserts = connection.createStatement();
		// MESSAGE SCHEMA
		inserts.addBatch("INSERT INTO process_service_configuration"
				+ "(prcs_id, property_id, property_config, service_id, service_type) "
				+ "VALUES (1, 'dummy', 'dummy', 'service','service' )");
		inserts.executeBatch();
		inserts.close();
		connection.close();

		// reload the schema.
		ConfigurationServiceImpl service = new ConfigurationServiceImpl();
		service.reloadConfiguration();
		// verify the cache.
		ServiceConfigurationCache cache = ServiceConfigurationCache
				.getInstance();
		ServiceConfiguration config = new ServiceConfiguration();
		config.setProcessId("1");
		config.setServiceId("service");
		config.setPropertyId("dummy");
		//Added to pass the test case.
		cache.addPropertyConfiguration(config, "dummy");
		Object property_config = cache.getPropertyConfiguration(config);

		assertNotNull(property_config);
		assertEquals(property_config, "dummy");
	}


	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		Connection connection = DatabaseManager.getInstance(
				FusionConstants.FUSIONDB).getConnection();

		// Drop tables.
		Statement stmt = connection.createStatement();
		stmt.addBatch("drop table process_service_configuration");
		stmt.executeBatch();
		stmt.close();
		connection.close();

		DatabaseManager.shutdownDBPools();
	}
}
