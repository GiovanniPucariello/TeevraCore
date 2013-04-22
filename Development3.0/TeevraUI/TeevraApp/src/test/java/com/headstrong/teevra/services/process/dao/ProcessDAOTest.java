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
 * $Id: AbstractDAOTestCase.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Oct 15, 2008 
 */
package com.headstrong.teevra.services.process.dao;

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
import com.headstrong.teevra.services.process.dao.ProcessDAO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;

public class ProcessDAOTest extends AbstractDAOTestCase {

	private ProcessDAO processDAO;

	public void onSetUp() {
		processDAO = (ProcessDAO) getBean("processDAO");
		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_process_Table);
	}

	public void testGetProcesses() {
		System.out.println("TESTING GET PROCESSES ");

		// insert 2 records of process
		List<Object> processParamList1 = InsertParamsGenerator
				.setProcessParams(new Long(1), "test_process1",
						"process for unit testing",
						ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0),
						false, true, null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		List<Object> processParamList2 = InsertParamsGenerator
				.setProcessParams(new Long(2), "test_process2",
						"process for unit testing",
						ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0),
						false, false, null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList2);

		List<ProcessEO> processList = new ArrayList<ProcessEO>();
		try {
			processList = processDAO.getProcesses();
		} catch (ProcessServiceException e) {
			fail("Failed while retrieving processes");
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(2, processList.size());
	}

	public void testSaveProcess() {
		// Save one record first and then update the same.save one more record
		// and check the size of the list the method returns, which should be 2
		System.out.println("TESTING SAVE OR UPDATE PROCESS");
		// saving first record
		ProcessEO process = new ProcessEO();
		process.setPrcsName("process1");
		process.setPrcsDesc("Save and edit the process");
		process.setPrcsStatus(ProcessEO.STATUS_UNPUBLISHED);
		process.setPrcsGrpId(new Long(0));
		process.setPrcsLatestVersionId(new Long(0));
		process.setPrcsIsTemplate(false);
		process.setCreatedBy(System.getProperty("user.name"));
		process.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			processDAO.saveProcess(process);
		} catch (ProcessServiceException e) {
			fail("failed while saving process");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_process_data);

		List<Object> data = new ArrayList<Object>();
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					data.add(rs.getObject(4));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(1, recordCount);
		// check process id, name and description
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("process1", data.get(1));
		Assert.assertEquals("Save and edit the process", data.get(2));
		Assert.assertEquals(ProcessEO.STATUS_UNPUBLISHED, data.get(3));

		// edit the first record
		process = new ProcessEO();
		process.setPrcsId(new Long(1));
		process.setPrcsName("process1");
		process.setPrcsDesc("Edited the process");
		process.setPrcsStatus(ProcessEO.STATUS_PUBLISHED);
		process.setPrcsGrpId(new Long(0));
		process.setPrcsLatestVersionId(new Long(0));
		process.setPrcsIsTemplate(false);
		process.setCreatedBy(System.getProperty("user.name"));
		process.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			processDAO.saveProcess(process);
		} catch (ProcessServiceException e) {
			fail("failed while editing process");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_process_data);

		data = new ArrayList<Object>();
		recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					data.add(rs.getObject(4));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(1, recordCount);
		// check process id, name and description
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("process1", data.get(1));
		Assert.assertEquals("Edited the process", data.get(2));
		Assert.assertEquals(ProcessEO.STATUS_PUBLISHED, data.get(3));

		// save second record
		// saving first record
		process = new ProcessEO();
		process.setPrcsName("process2");
		process.setPrcsDesc("Save the process");
		process.setPrcsStatus(ProcessEO.STATUS_UNPUBLISHED);
		process.setPrcsGrpId(new Long(0));
		process.setPrcsLatestVersionId(new Long(0));
		process.setPrcsIsTemplate(false);
		process.setCreatedBy(System.getProperty("user.name"));
		process.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			processDAO.saveProcess(process);
		} catch (ProcessServiceException e) {
			fail("failed while saving process");
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_data));

	}

	public void testGetProcessesByCriteria() {
		System.out.println("TESTING GET PROCESS BY CRITERIA ");
		// insert 2 records of process
		List<Object> processParamList1 = InsertParamsGenerator
				.setProcessParams(new Long(1), "test_process1",
						"process for unit testing",
						ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0),
						false, true, null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		List<Object> processParamList2 = InsertParamsGenerator
				.setProcessParams(new Long(2), "test_process2",
						"process for unit testing",
						ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0),
						false, false, null, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null, 0, 0);

		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process,
				processParamList2);

		ProcessEO criteria = new ProcessEO();
		criteria.setPrcsId(new Long(1));

		ProcessEO process = new ProcessEO();
		try {
			process = processDAO.getProcesses(criteria).get(0);
		} catch (ProcessServiceException e) {
			fail("Failed while retrieving process based on criteria");
			e.printStackTrace();
		}

		Assert.assertEquals(new Long(1), process.getPrcsId());
		Assert.assertEquals("test_process1", process.getPrcsName());
		Assert.assertEquals("process for unit testing", process.getPrcsDesc());
		Assert.assertEquals(ProcessEO.STATUS_UNPUBLISHED, process
				.getPrcsStatus());
	}

	public void testDeleteProcess() {

		System.out.println("TESTING DELETE PROCESS");
		// insert one process record
		insertDataIntoProcessTable();
		// check size
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_process_data));

		// insert 2 records of process_runtime
		HibernateUtil.createTable(CreateQueries.create_process_runtime_Table);
		
		List<String> processStatusList = new ArrayList<String>();
		processStatusList.add("STOPPED");
		processStatusList.add("STOPPED");
		insertDataIntoProcessRuntimeTable(processStatusList);
		// check size
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_process_runtime_data));

		// insert 2 records of message_eventlog
		HibernateUtil.createTable(CreateQueries.create_message_eventlog_Table);
		insertDataIntoMsgEventLogTable();
		// check size
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_message_eventlog_data));

		// insert one record of process_server
		HibernateUtil.createTable(CreateQueries.create_process_server_Table);
		insertDataIntoProcessServerTable();
		// check size
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_process_server_data));

		// insert 2 records of process_service_configuration
		HibernateUtil
				.createTable(CreateQueries.create_process_service_configuration);
		insertDataIntoProcessServiceConfTable();

		// check size
		Assert
				.assertEquals(
						2,
						HibernateUtil
								.getRecordCount(SelectQueries.check_process_service_configuration_data));

		// insert 1 record of process_schedule
		HibernateUtil.createTable(CreateQueries.create_process_schedule_Table);
		insertDataIntoProcessScheduleTable();
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_process_schedule_data));

		try {
			processDAO.deleteProcess(new Long(1));
		} catch (ProcessServiceException e) {
			fail("Failed to delete the process and its dependencies");
			e.printStackTrace();

		}
		// check the record counts of all the above tables. All should be 0
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_process_data));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_process_runtime_data));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_message_eventlog_data));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_process_server_data));
		Assert
				.assertEquals(
						0,
						HibernateUtil
								.getRecordCount(SelectQueries.check_process_service_configuration_data));

		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_process_schedule_data));
	}

	public void testDeleteProcessWithException() {
		System.out.println("TESTING DELETE PROCESS WITH EXCEPTION");

		insertDataIntoProcessTable();

		// insert 2 records of process_runtime
		HibernateUtil.createTable(CreateQueries.create_process_runtime_Table);
		List<String> processStatusList = new ArrayList<String>();
		processStatusList.add("STOPPED");
		processStatusList.add("RUNNING");
		insertDataIntoProcessRuntimeTable(processStatusList);

		// insert 2 records of message_eventlog
		HibernateUtil.createTable(CreateQueries.create_message_eventlog_Table);
		insertDataIntoMsgEventLogTable();
		
		// insert one record of process_server
		HibernateUtil.createTable(CreateQueries.create_process_server_Table);
		insertDataIntoProcessServerTable();
		
		// insert 2 records of process_service_configuration
		HibernateUtil
				.createTable(CreateQueries.create_process_service_configuration);
		insertDataIntoProcessServiceConfTable();
		
		// insert 1 record of process_schedule
		HibernateUtil.createTable(CreateQueries.create_process_schedule_Table);
		insertDataIntoProcessScheduleTable();
		
		try {
			processDAO.deleteProcess(new Long(1));
		} catch (ProcessServiceException e) {
			assertTrue(true);
		}
	}

	private void insertDataIntoProcessRuntimeTable(List<String> processStatusList) {
		List<Object> processRuntimeParamList1 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(1), new Long(1), new Long(1),
						1, processStatusList.get(0),
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> processRuntimeParamList2 = InsertParamsGenerator
				.setProcessRuntimeParams(new Long(2), new Long(1), new Long(1),
						2, processStatusList.get(1),
						new Timestamp(System.currentTimeMillis()),
						new Timestamp(System.currentTimeMillis()), new Long(5),
						new Long(1), new Long(4), System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList1);
		HibernateUtil.insertData(InsertQueries.insert_process_runtime,
				processRuntimeParamList2);
	}

	private void insertDataIntoProcessServiceConfTable() {
		List<Object> processServiceConfigurationParamList1 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(1), "schemamapping",
						"<binding></binding>", "formatter",
						"TdFormatterService", null);
		List<Object> processServiceConfigurationParamList2 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(1), "schemamapping",
						"<binding></binding>", "dbParser", "DBParserService",
						null);

		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList1);
		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList2);
	}

	private void insertDataIntoProcessTable() {
		List<Object> processParamList = InsertParamsGenerator.setProcessParams(
				new Long(1), "test_process1", "process for unit testing",
				ProcessEO.STATUS_UNPUBLISHED, new Long(0), new Long(0), false,
				true, null, null, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null, 0, 0);

		HibernateUtil
				.insertData(InsertQueries.insert_process, processParamList);
	}
	
	private void insertDataIntoMsgEventLogTable() {
		List<Object> messageEventLongParamList1 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(1), new Long(1),
						new Long(1), new Long(0), new Long(0), "ERROR",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA");

		List<Object> messageEventLongParamList2 = InsertParamsGenerator
				.setMessageEventlogParams(new Long(2), new Long(1),
						new Long(2), new Long(0), new Long(0), "FINISHED",
						new Timestamp(System.currentTimeMillis()),
						"LOG MESSAGE", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null,
						"MESSAGE DATA");

		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList1);
		HibernateUtil.insertData(InsertQueries.insert_message_eventlog,
				messageEventLongParamList2);
	}
	

	private void insertDataIntoProcessScheduleTable() {
		List<Object> prcsScheduleParamList = InsertParamsGenerator
				.setProcessScheduleParams(new Long(1),
						ProcessScheduleEO.RECURRENCE_TYPE_DAILY, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_schedule,
				prcsScheduleParamList);
	}

	private void insertDataIntoProcessServerTable() {
		List<Object> processServerParamList = InsertParamsGenerator
				.setProcessServerParams(new Long(1), new Long(1), new Long(1),
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_server,
				processServerParamList);
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_message_eventlog_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_runtime_Table);
		HibernateUtil
				.executeQuery(DropQueries.drop_process_service_configuration);
		HibernateUtil.executeQuery(DropQueries.drop_process_server_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_schedule_Table);
		HibernateUtil.executeQuery(DropQueries.drop_process_Table);
		HibernateUtil.shutDown();
	}
}
