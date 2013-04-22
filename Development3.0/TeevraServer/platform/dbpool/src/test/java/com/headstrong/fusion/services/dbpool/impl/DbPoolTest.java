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
 * $Id: DbPoolTest.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 17, 2008 
 */


package com.headstrong.fusion.services.dbpool.impl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;

public class DbPoolTest extends TestCase {
	DbPool pool=null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		// create collaborator
		Map<String, String> props1=new HashMap<String, String>();
		props1.put("database.driver.classname", "org.hsqldb.jdbcDriver");
		props1.put("database.username", "sa");
		props1.put("database.password", "");
		props1.put("database.url", "jdbc:hsqldb:mem:fusion_dbpool");
		props1.put("database.initialSize", "2");
		props1.put("database.maxActive", "5");
		props1.put("database.maxOpenActivePrep", "-1");
		props1.put("database.minEvictableIdleTimemillis", "60000");
		props1.put("database.timeBetweenEvictionRunsMillis", "300000");
		pool = DatabaseManager.setupDBPool(props1);
	}
	
	public void testPool() throws Exception {
		assertNotNull(pool);
	}
	
	public void testGetConnection() throws Exception {
		assertNotNull(pool.getConnection());
		
	}
	
	public void testGetDataSource() throws Exception {
		assertNotNull(pool.getDataSource());
	}
	
	public void testTableCreation() throws Exception {
		executeStatement("create table customer (id varchar(15), name varchar(10))");
		executeStatement("insert into customer values ('1','2')");
		
		Connection conn=pool.getConnection();
		Statement stmt=conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from customer");
		assertNotNull(rs);
		while (rs.next()) {
			assertEquals(rs.getString(1),"1");
			assertEquals(rs.getString(2),"2");
		}
		rs.close();
		stmt.close();
		conn.close();
		executeStatement("drop table customer");
	}
	
	public void executeStatement(String statement) throws Exception {
		Connection conn=pool.getConnection();
		Statement stmt=conn.createStatement();
		stmt.execute(statement);
		stmt.close();
		conn.close();
	
	}
	
	@After
	public void tearDown() throws Exception {
		DatabaseManager.shutdownDBPools();
	}
}
