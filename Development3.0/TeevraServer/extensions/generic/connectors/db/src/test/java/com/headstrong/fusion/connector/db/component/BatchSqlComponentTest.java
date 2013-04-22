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
 * $Id: BatchSqlComponentTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 26, 2010 
 */

package com.headstrong.fusion.connector.db.component;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.camel.Endpoint;
import org.junit.Test;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class BatchSqlComponentTest {

	@SuppressWarnings("unchecked")
	@Test
	public void createEndPoint() throws Exception {
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

		DataSource ds = dbPool.getDataSource();

		BatchSqlComponent component = new BatchSqlComponent();
		component.setDataSource(ds);

		String uri = "BatchSql";
		String remaining = "#@@#";
		Map parameters = new HashMap();
		Endpoint endPoint = component
				.createEndpoint(uri, remaining, parameters);
		assertNotNull(endPoint);
	}
}
