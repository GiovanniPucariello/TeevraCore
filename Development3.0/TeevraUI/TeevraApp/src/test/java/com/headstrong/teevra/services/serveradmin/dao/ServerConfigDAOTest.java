/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ServerConfigDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 11, 2009 
 */

package com.headstrong.teevra.services.serveradmin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.serveradmin.dao.ServerConfigDAO;
import com.headstrong.teevra.services.serveradmin.eo.ServerConfigEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * 
 */
public class ServerConfigDAOTest extends AbstractDAOTestCase {

	public ServerConfigDAO serverConfigDAO;

	public void onSetUp() {
		serverConfigDAO = (ServerConfigDAO) getBean("serverConfigDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_server_config_Table);
		HibernateUtil.createTable(CreateQueries.create_process_server_Table);
	}

	public void testGetServerConfigs() {
		System.out.println("TESTING GetServerConfigs----");

		List<Object> server1ConfigParams = InsertParamsGenerator
				.setServerConfigParams(
						new Long(1),
						"visu_server",
						"service:jmx:rmi:///jndi/rmi://10.200.31.26:8004/jmxrmi",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> server2ConfigParams = InsertParamsGenerator
				.setServerConfigParams(
						new Long(2),
						"teevra_server",
						"service:jmx:rmi:///jndi/rmi://10.200.41.13:8004/jmxrmi",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_server_config,
				server1ConfigParams);
		HibernateUtil.insertData(InsertQueries.insert_server_config,
				server2ConfigParams);

		List<ServerConfigEO> serverConfigList = new ArrayList<ServerConfigEO>();

		try {
			serverConfigList = serverConfigDAO.getServerConfigs();
		} catch (ServerAdminServiceException e) {
			fail("Failed while retrieving server configurations ");
			e.printStackTrace();
		}

		Assert.assertEquals(2, serverConfigList.size());
	}

	public void testRegisterServer() {
		System.out.println("TESTING Register Server:::::::");

		// save one record
		ServerConfigEO server = new ServerConfigEO();

		server.setServerName("visu_server");
		server
				.setServerUrl("service:jmx:rmi:///jndi/rmi://10.200.31.26:8004/jmxrmi");
		server.setCreatedBy(System.getProperty("user.name"));
		server.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			serverConfigDAO.registerServer(server);
		} catch (ServerAdminServiceException e) {
			fail("Failed while saving server configuration");
			e.printStackTrace();
		}
		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_server_configs);
		int recordCount = 0;

		List<Object> data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check server id, name and url
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("visu_server", data.get(1));
		Assert.assertEquals(
				"service:jmx:rmi:///jndi/rmi://10.200.31.26:8004/jmxrmi", data
						.get(2));

		// edit the record
		server = new ServerConfigEO();
		server.setServerId(new Long(1));
		server.setServerName("visu_server1");
		server
				.setServerUrl("service:jmx:rmi:///jndi/rmi://10.200.31.26:8005/jmxrmi");
		server.setCreatedBy(System.getProperty("user.name"));
		server.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		try {
			serverConfigDAO.registerServer(server);
		} catch (ServerAdminServiceException e) {
			fail("Failed while editing server configuration");
			e.printStackTrace();
		}
		rs = HibernateUtil.executeQuery(SelectQueries.check_server_configs);
		recordCount = 0;

		data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check server id, name and url
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("visu_server1", data.get(1));
		Assert.assertEquals(
				"service:jmx:rmi:///jndi/rmi://10.200.31.26:8005/jmxrmi", data
						.get(2));

		// save second record
		server = new ServerConfigEO();

		server.setServerName("teevra_server");
		server
				.setServerUrl("service:jmx:rmi:///jndi/rmi://10.200.41.13:8004/jmxrmi");
		server.setCreatedBy(System.getProperty("user.name"));
		server.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		try {
			serverConfigDAO.registerServer(server);
		} catch (ServerAdminServiceException e) {
			fail("Failed while saving server configuration");
			e.printStackTrace();
		}

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_server_configs));

	}

	public void testUnregisterServer() {
		System.out.println("TESTING Unregister Server:::::");
		List<Object> server1ConfigParams = InsertParamsGenerator
				.setServerConfigParams(
						new Long(1),
						"visu_server",
						"service:jmx:rmi:///jndi/rmi://10.200.31.26:8004/jmxrmi",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_server_config,
				server1ConfigParams);

		List<Object> server2ConfigParams = InsertParamsGenerator
				.setServerConfigParams(
						new Long(2),
						"teevra_server",
						"service:jmx:rmi:///jndi/rmi://10.200.41.13:8004/jmxrmi",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_server_config,
				server2ConfigParams);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_server_configs));

		HibernateUtil.createTable(CreateQueries.create_process_Table);
		// insert 2 records of process
		List<Object> processParamList1 = InsertParamsGenerator
				.setProcessParams(new Long(1), "test_process1",
						"process for unit testing", ProcessEO.STATUS_LOCKED,
						new Long(0), new Long(0), false, true, null, null,
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		List<Object> processParamList2 = InsertParamsGenerator
				.setProcessParams(new Long(2), "test_process2",
						"process for unit testing", ProcessEO.STATUS_PUBLISHED,
						new Long(0), new Long(0), false, true, null, null,
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList2);

		List<Object> prcsServerParams1 = InsertParamsGenerator
				.setProcessServerParams(new Long(1), new Long(1), new Long(2),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsServerParams2 = InsertParamsGenerator
				.setProcessServerParams(new Long(2), new Long(2), new Long(2),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_server,
				prcsServerParams1);
		HibernateUtil.insertData(InsertQueries.insert_process_server,
				prcsServerParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_server_configs));

		// remove first server which has no dependencies
		try {
			serverConfigDAO.unregisterServer("visu_server");
		} catch (ServerAdminServiceException e) {
			fail("Failed while deleting the server configurations");
			e.printStackTrace();
		}
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_server_configs));
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_server_configs));

		// // remove the other server which has dependencies associated with it
		//
		// try {
		// serverConfigDAO.unregisterServer("teevra_server");
		// } catch (ServerAdminServiceException e) {
		// fail("Failed while deleting the server configurations and its
		// dependencies");
		// e.printStackTrace();
		// }
		// Assert.assertEquals(0, HibernateUtil
		// .getRecordCount(check_server_configs));
		// Assert.assertEquals(0, HibernateUtil
		// .getRecordCount(check_process_server_configs));
		//
		// ResultSet rs = HibernateUtil.executeQuery(check_process_data);
		//
		// List<Object> data = new ArrayList<Object>();
		// try {
		// if (rs != null) {
		// while (rs.next()) {
		// data.add(rs.getObject(1));
		// }
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		//
		// Assert.assertEquals(ProcessEO.STATUS_PUBLISHED, data.get(0));
		// Assert.assertEquals(ProcessEO.STATUS_PUBLISHED, data.get(1));
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_process_server_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_Table);
		HibernateUtil.executeQuery(DropQueries.drop_server_config_Table);
		HibernateUtil.shutDown();
	}
}
