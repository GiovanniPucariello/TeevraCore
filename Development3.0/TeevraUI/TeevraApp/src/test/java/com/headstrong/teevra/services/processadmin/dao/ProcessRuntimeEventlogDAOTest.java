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
 * $Id: ProcessRuntimeEventlogDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 12, 2009 
 */

package com.headstrong.teevra.services.processadmin.dao;

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
import com.headstrong.teevra.services.processadmin.dao.ProcessRuntimeEventlogDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessRuntimeEventlogEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;

/**
 * 
 */
public class ProcessRuntimeEventlogDAOTest extends AbstractDAOTestCase {

	private ProcessRuntimeEventlogDAO processRuntimeEventlogDAO;

	public void onSetUp() {
		processRuntimeEventlogDAO = (ProcessRuntimeEventlogDAO) getBean("processRuntimeEventlogDAO");
		HibernateUtil.setUp();
		// create process_runtime_eventlog table
		HibernateUtil
				.createTable(CreateQueries.create_process_runtime_eventlog_Table);

	}

	public void testGetProcessEventLogs() {
		System.out.println("Testing getProcessEventLogs ");

		List<Object> prcsRuntimeEventLogParams1 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(1), new Long(1),
						"INFO", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams2 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(2), new Long(1),
						"ERROR", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams3 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(3), new Long(2),
						"INFO", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams4 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(4), new Long(2),
						"ERROR", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams2);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams3);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams4);

		Assert.assertEquals(4, HibernateUtil
				.getRecordCount(SelectQueries.check_process_runtime_eventlog));

		ProcessRuntimeEventlogEO criteria = new ProcessRuntimeEventlogEO();
		criteria.setPrcsRunId(new Long(1));

		List<ProcessRuntimeEventlogEO> runtimeEventlogList = new ArrayList<ProcessRuntimeEventlogEO>();
		try {
			runtimeEventlogList = processRuntimeEventlogDAO
					.getProcessEventLogs(criteria);
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving process runtime eventlogs");
			e.printStackTrace();
		}

		Assert.assertEquals(2, runtimeEventlogList.size());

	}

	public void testGetErrorLogs() {
		System.out.println("Testing getProcessEventLogs ");

		HibernateUtil.createTable(CreateQueries.create_process_Table);
		// insert one process record
		List<Object> processParamList = InsertParamsGenerator.setProcessParams(
				new Long(1), "test_process1", "process for unit testing",
				ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0), false,
				true, null, null, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null, 0, 0);

		HibernateUtil
				.insertData(InsertQueries.insert_process, processParamList);
		// check size
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_process_data));

		// insert 2 records of process_runtime
		HibernateUtil.createTable(CreateQueries.create_process_runtime_Table);
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

		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList2);
		// check size
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_runtime_data));

		// 4 records of process_runtime_eventlog
		List<Object> prcsRuntimeEventLogParams1 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(1), new Long(1),
						"INFO", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams2 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(2), new Long(1),
						"ERROR", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams3 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(3), new Long(1),
						"ERROR", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> prcsRuntimeEventLogParams4 = InsertParamsGenerator
				.setProcessRuntimeEventlogParams(new Long(4), new Long(2),
						"ERROR", new Timestamp(System.currentTimeMillis()),
						"Fusion core", "Process Administration",
						"Process started", "<Binary Data>", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams2);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams3);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime_eventlog,
				prcsRuntimeEventLogParams4);

		Assert.assertEquals(4, HibernateUtil
				.getRecordCount(SelectQueries.check_process_runtime_eventlog));

		List<ProcessRuntimeEventlogEO> errorLogList = new ArrayList<ProcessRuntimeEventlogEO>();

		try {
			errorLogList = processRuntimeEventlogDAO.getErrorLogs(new Long(1));
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving Error logs ");
			e.printStackTrace();
		}

		Assert.assertEquals(2, errorLogList.size());

		errorLogList = new ArrayList<ProcessRuntimeEventlogEO>();

		try {
			errorLogList = processRuntimeEventlogDAO.getErrorLogs(new Long(2));
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving Error logs ");
			e.printStackTrace();
		}

		Assert.assertEquals(1, errorLogList.size());

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_process_runtime_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_Table);
		HibernateUtil
				.executeQuery(DropQueries.drop_process_runtime_eventlog_Table);
		HibernateUtil.shutDown();
	}
}
