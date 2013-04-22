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
 * $Id: ServerBroadcastStateObserverTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 12, 2010 
 */

package com.headstrong.fusion.broadcast;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;

import junit.framework.TestCase;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.failover.MemberInfo;
import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.services.dbpool.impl.DatabaseManager;
import com.headstrong.fusion.services.dbpool.impl.DbPool;

/**
 * 
 */
public class ServerBroadcastStateObserverTest extends TestCase {
	DbPool pool = null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		// create collaborator
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
		pool = DatabaseManager.setupDBPool(props1);
		DatabaseManager.registerDBPool(FusionConstants.FUSIONDB, pool);
		createTable();
	}

	private void createTable() throws Exception {
		String server_config = "create table server_configuration (server_name varchar(50), server_url varchar(50), server_id integer)";
		Connection conn = pool.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(server_config);
		rs.close();
		stmt.close();
		conn.close();
	}

	public void testUpdate() throws Exception {
		MemberInfo info = new MemberInfo();
		info.setClusterId(1);
		info.setClustered(true);
		info.setClusterName("test");
		info.setConnectorUrl("post");
		// create Admin service mock
		AdminService adminService = createMock(AdminService.class);
		expect(adminService.getMemberInfo()).andReturn(info).anyTimes();
		// create service resolver mock
		ServiceResolver<AdminService> serviceResolver = createMock(ServiceResolver.class);
		expect(serviceResolver.getService(AdminService.class.getName(), 0))
				.andReturn(adminService);
		replay(adminService);
		replay(serviceResolver);
		ServerBroadcastStateObserver observer = new ServerBroadcastStateObserver(
				new ServerInfoBroadcastService(), serviceResolver);
		// insert a record in the table for updation
		String insRec = "insert into server_configuration values('test','pre',1)";
		Connection conn = pool.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(insRec);
		rs.close();
		stmt.close();
		conn.close();

		observer.update(State.RUNNING);

		// check the connector in the table.
		String sel = "select server_url from server_configuration where server_id = ?";
		conn = pool.getConnection();
		PreparedStatement ps = conn.prepareStatement(sel);
		ps.setInt(1, 1);
		rs = ps.executeQuery();

		rs.next();
		String url = rs.getString(1);
		assertEquals("post", url);
		rs.close();
		conn.close();

	}

}
