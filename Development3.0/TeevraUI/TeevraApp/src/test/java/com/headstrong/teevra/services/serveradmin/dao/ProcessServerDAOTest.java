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
 * $Id: ProcessServerDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 16, 2009 
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
import com.headstrong.teevra.services.serveradmin.dao.ProcessServerDAO;
import com.headstrong.teevra.services.serveradmin.eo.ProcessServerEO;
import com.headstrong.teevra.services.serveradmin.exception.ServerAdminServiceException;

/**
 * 
 */
public class ProcessServerDAOTest extends AbstractDAOTestCase {

	private ProcessServerDAO processServerDAO;

	public void onSetUp() {
		processServerDAO = (ProcessServerDAO) getBean("processServerDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_process_server_Table);
	}

	public void testSavePrcsServerMapping() {
		System.out.println("Testing savePrcsServerMapping ");

		ProcessServerEO prcsServerMapping = new ProcessServerEO();
		prcsServerMapping.setPrcsId(new Long(1));
		prcsServerMapping.setServerId(new Long(1));
		prcsServerMapping.setCreatedBy(System.getProperty("user.name"));
		prcsServerMapping.setCreatedDate(new Timestamp(System
				.currentTimeMillis()));

		try {
			processServerDAO.savePrcsServerMapping(prcsServerMapping);
		} catch (ServerAdminServiceException e) {
			fail("Failed while saving the process server configuration");
			e.printStackTrace();
		}

		prcsServerMapping = new ProcessServerEO();
		prcsServerMapping.setPrcsId(new Long(2));
		prcsServerMapping.setServerId(new Long(1));
		prcsServerMapping.setCreatedBy(System.getProperty("user.name"));
		prcsServerMapping.setCreatedDate(new Timestamp(System
				.currentTimeMillis()));

		try {
			processServerDAO.savePrcsServerMapping(prcsServerMapping);
		} catch (ServerAdminServiceException e) {
			fail("Failed while saving the process server configuration");
			e.printStackTrace();
		}

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_server_configs));
	}

	public void testUpdatePrcsServerMapping() {
		System.out.println("Testing updatePrcsServerMapping ");

		List<Object> prcsServerParams = InsertParamsGenerator
				.setProcessServerParams(new Long(1), new Long(1), new Long(1),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_server,
				prcsServerParams);

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_process_server_configs);

		List<Object> data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check mapping id, process id and server id
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(new Long(1), data.get(1));
		Assert.assertEquals(new Long(1), data.get(2));

		try {
			processServerDAO.updatePrcsServerMapping(new Long(1), new Long(2));
		} catch (ServerAdminServiceException e) {
			fail("Failed while updating the mapping");
			e.printStackTrace();
		}

		rs = HibernateUtil
				.executeQuery(SelectQueries.check_process_server_configs);

		data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check mapping id, process id and server id
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(new Long(1), data.get(1));
		Assert.assertEquals(new Long(2), data.get(2));
	}

	public void testGetPrcsServerMapping() {
		System.out.println("Testing getPrcsServerMapping ");

		List<Object> prcsServerParams1 = InsertParamsGenerator
				.setProcessServerParams(new Long(1), new Long(1), new Long(3),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsServerParams2 = InsertParamsGenerator
				.setProcessServerParams(new Long(2), new Long(2), new Long(3),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_server,
				prcsServerParams1);
		HibernateUtil.insertData(InsertQueries.insert_process_server,
				prcsServerParams2);

		ProcessServerEO mapping1 = new ProcessServerEO();
		ProcessServerEO mapping2 = new ProcessServerEO();
		try {
			mapping1 = processServerDAO.getPrcsServerMapping(new Long(1));
			mapping2 = processServerDAO.getPrcsServerMapping(new Long(2));
		} catch (ServerAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(new Long(3), mapping1.getServerId());
		Assert.assertEquals(new Long(3), mapping2.getServerId());
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_process_server_Table);
		HibernateUtil.shutDown();
	}
}
