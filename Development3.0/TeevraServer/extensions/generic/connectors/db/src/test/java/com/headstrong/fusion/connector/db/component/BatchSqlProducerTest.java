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
 * $Id: BatchSqlProducerTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 26, 2010 
 */

package com.headstrong.fusion.connector.db.component;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.DefaultExchange;
import org.junit.After;
import org.springframework.jdbc.core.JdbcTemplate;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class BatchSqlProducerTest extends TestCase {

	private static String create_employee_table = "CREATE TABLE employee(emp_id varchar(20), emp_name varchar(20))";
	private static String drop_employee_table = "DROP TABLE employee";

	private static String select_employee = "SELECT * FROM employee";

	private static String insert_query = "INSERT INTO employee(emp_id,emp_name) VALUES (?,?)";

	private DbPool dbPool;

	@Override
	public void setUp() throws Exception {
		super.setUp();

		// create a table to insert data
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
		dbPool = DatabaseManager.setupDBPool(props1);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);

		dbPool.getConnection().prepareStatement(create_employee_table)
				.execute();

	}

	@SuppressWarnings("unchecked")
	public void testProcessSingleRecord() throws Exception {
		DefaultCamelContext camelContext = new DefaultCamelContext();
		Exchange exchange = new DefaultExchange(camelContext);

		List body = new ArrayList();

		body.add("1");
		body.add("teevra");

		exchange.getIn().setBody(body);

		BatchSqlEndpoint endpoint = createBatchSqlEndpoint();

		JdbcTemplate template = new JdbcTemplate(dbPool.getDataSource());
		BatchSqlProducer producer = new BatchSqlProducer(endpoint,
				insert_query, template);

		producer.process(exchange);

		ResultSet rs = dbPool.getConnection().prepareStatement(select_employee)
				.executeQuery();

		assertNotNull(rs);

		if (rs.next()) {
			assertEquals("1", rs.getString(1));
			assertEquals("teevra", rs.getString(2));
		}

		assertEquals(1, exchange.getIn().getHeader(
				"org.apache.camel.sql.update-count"));
	}

	@SuppressWarnings("unchecked")
	public void testProcessMultipleRecords() throws Exception {
		DefaultCamelContext camelContext = new DefaultCamelContext();
		Exchange exchange = new DefaultExchange(camelContext);

		List list1 = new ArrayList();

		list1.add("1");
		list1.add("teevra");

		List list2 = new ArrayList();

		list2.add("2");
		list2.add("fusion");

		List body = new ArrayList();

		body.add(list1);
		body.add(list2);

		exchange.getIn().setBody(body);

		BatchSqlEndpoint endpoint = createBatchSqlEndpoint();

		JdbcTemplate template = new JdbcTemplate(dbPool.getDataSource());
		BatchSqlProducer producer = new BatchSqlProducer(endpoint,
				insert_query, template);

		producer.process(exchange);

		ResultSet rs = dbPool.getConnection().prepareStatement(select_employee)
				.executeQuery();

		assertNotNull(rs);

		assertEquals(2, exchange.getIn().getHeader(
				"org.apache.camel.sql.update-count"));

	}

	@SuppressWarnings("unchecked")
	private BatchSqlEndpoint createBatchSqlEndpoint() throws Exception {

		BatchSqlComponent component = new BatchSqlComponent();
		String uri = "BatchSql";
		Map parameters = new HashMap();
		return new BatchSqlEndpoint(uri, insert_query, component, dbPool
				.getDataSource(), parameters);
	}

	@After
	public void tearDown() throws Exception {
		DatabaseManager.getInstance(FusionConstants.FUSIONDB).getConnection()
				.prepareStatement(drop_employee_table).execute();
		DatabaseManager.shutdownDBPools();

	}
}
