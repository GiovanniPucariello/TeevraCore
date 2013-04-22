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
 * $Id: ProcessRuntimeDAOTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 17, 2008 
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeDAO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * 
 */
public class ProcessRuntimeDAOTest extends AbstractDAOTestCase {

	private ProcessRuntimeDAO processRuntimeDAO;

	public void onSetUp() {
		processRuntimeDAO = (ProcessRuntimeDAO) getBean("processRuntimeDAO");
		HibernateUtil.setUp();

		// create process_runtime table
		HibernateUtil.createTable(CreateQueries.create_process_runtime_Table);

	}

	public void testGetProcessStatus() {
		System.out.println("TESTING GET PRCSTATUS");
		// List<ProcessStatusVO> processStatusList = new
		// ArrayList<ProcessStatusVO>();
		// try {
		// processStatusList = processRuntimeDAO.getProcessStatus();
		// } catch (ProcessAdminServiceException e) {
		// e.printStackTrace();
		// }
		// System.out.println("PROCESS STATUS LIST SIZE: "
		// + processStatusList.size());
		// System.out.println("PROCESS STATUS LIST AS STRING: "
		// + processStatusList.toString());
	}

	public void testGetProcessRunStatus() {
		System.out.println("TESTING GetProcessRunStatus");
		// insert 3 records
		List<Object> processRuntimeParamList1 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(1), new Long(1), new Long(1),
						1, "STOPPED",
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> processRuntimeParamList2 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(2), new Long(1), new Long(1),
						2, "RUNNING",
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> processRuntimeParamList3 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(3), new Long(1), new Long(1),
						3, "ERROR", new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList2);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList3);
		String runStatus = null;
		try {
			runStatus = processRuntimeDAO.getProcessRunStatus(new Long(1));
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving the run status of the process");
			e.printStackTrace();
		}
		Assert.assertEquals("ERROR", runStatus);

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_message_eventlog_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_runtime_Table);
		HibernateUtil.shutDown();
	}

}
