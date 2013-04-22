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
 * $Id: MessageIdGenImplTest.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.fusion.services.messageidgen.impl;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class MessageIdGenImplTest extends TestCase{

	private static String createprcsRuntimeTable="create table process_runtime (  prcs_run_id bigint NOT NULL," +
	" prcs_id bigint,  prcs_ver_id bigint,  prcs_run_sequence integer," +
	"  prcs_run_status varchar(50) , prcs_run_start_time timestamp ," +
	" prcs_run_stop_time timestamp , prcs_msgs_recd bigint, prcs_msgs_error bigint," +
	" prcs_msgs_processed bigint, created_by varchar(50), created_date timestamp," +
	" modified_by varchar(50) DEFAULT 'system_user',modified_date timestamp )";
	
	private BundleContext contextMock;
	private Bundle bundleMock;
	

	
	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
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
		
		DbPool dbPool = DatabaseManager.setupDBPool(props1);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, dbPool);
		
		contextMock = createMock(BundleContext.class);
		bundleMock = createMock(Bundle.class);
		expect(contextMock.getBundle()).andReturn(bundleMock);
		
		replay(contextMock);
		replay(bundleMock);
		
	}

	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		DatabaseManager.shutdownDBPools();
	}

	/**
	 * Test method for {@link com.headstrong.fusion.services.messageidgen.impl.MessageIdGenImpl#getMessageID(java.lang.String)}.
	 */
	@Test
	public void testGetMessageID() throws Exception {
		MessageIdGenImpl impl=new MessageIdGenImpl(contextMock);
		assertEquals("0", impl.getMessageID("1"));
		DbPool pool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		executeStatement(pool,createprcsRuntimeTable );
		String sessionId1=impl.getSessionId("1");
		assertEquals("1", impl.getMessageID(sessionId1));
		assertEquals("2", impl.getMessageID(sessionId1));
		
		String sessionId2=impl.getSessionId("2");
		assertEquals("1", impl.getMessageID(sessionId2));
		assertEquals("2", impl.getMessageID(sessionId2));
		
		assertEquals("3", impl.getMessageID(sessionId1));
		assertEquals("3", impl.getMessageID(sessionId2));
		
		sessionId1=impl.getSessionId("1");
		assertEquals("1", impl.getMessageID(sessionId1));
		assertEquals("2", impl.getMessageID(sessionId1));
		
		
		executeStatement(pool,"drop table process_runtime");
		
		
		
	}

	/**
	 * Test method for {@link com.headstrong.fusion.services.messageidgen.impl.MessageIdGenImpl#getSessionId(java.lang.String)}.
	 */
	@Test
	public void testGetSessionId() throws Exception{
		DbPool pool = DatabaseManager.getInstance(FusionConstants.FUSIONDB);
		assertNotNull(pool);
		executeStatement(pool,createprcsRuntimeTable );
		MessageIdGenImpl impl=new MessageIdGenImpl(contextMock);
		assertEquals(impl.getSessionId("1"), "1");
		assertEquals(impl.getSessionId("2"), "2");
		assertEquals(impl.getSessionId("1"), "3");
		assertEquals(impl.getSessionId("2"), "4");
		
		Connection conn=pool.getConnection();
		ResultSet rs= conn.createStatement().executeQuery("select prcs_run_id, prcs_id, prcs_run_sequence from process_runtime" );
		
	
		assertNotNull(rs);
		
		List<Object[]> actuaList=new ArrayList<Object[]>();
		if (rs!=null) {
			while (rs.next()) {
				List<Integer> data=new ArrayList<Integer>();
				data.add(rs.getInt(1));
				data.add(rs.getInt(2));
				data.add(rs.getInt(3));
				actuaList.add(data.toArray());
			}
		}
		
		assertSame(4, actuaList.size());
		
		Object[][] expectedList=new Object[4][];
		expectedList[0]=new Object[] {1,1,1};
		expectedList[1]=new Object[] {2,2,1};
		expectedList[2]=new Object[] {3,1,2};
		expectedList[3]=new Object[] {4,2,2};
		
		assertArrayEquals(expectedList, actuaList.toArray());
		
		rs.close();
		
		conn.close();
		executeStatement(pool,"drop table process_runtime");
		
		
	}
	
	private void executeStatement(DbPool pool,String statement) throws Exception {
		Connection conn=pool.getConnection();
		Statement stmt=conn.createStatement();
		stmt.execute(statement);
		stmt.close();
		conn.close();
	}

}
