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
 * $Id: ProcessScheduleDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 2, 2009 
 */

package com.headstrong.teevra.services.processadmin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.scheduling.DailyRecurrence;
import com.headstrong.teevra.common.scheduling.ExecutionTime;
import com.headstrong.teevra.common.scheduling.RecurrenceRange;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.processadmin.dao.ProcessScheduleDAO;
import com.headstrong.teevra.services.processadmin.eo.ProcessScheduleEO;
import com.headstrong.teevra.services.processadmin.exception.ProcessAdminServiceException;


/**
 * 
 */
public class ProcessScheduleDAOTest extends AbstractDAOTestCase {

	private ProcessScheduleDAO processScheduleDAO;

	public void onSetUp() {
		processScheduleDAO = (ProcessScheduleDAO) getBean("processScheduleDAO");

		HibernateUtil.setUp();
		// create process_schedule table
		HibernateUtil.createTable(CreateQueries.create_process_schedule_Table);

	}

	/**
	 * Tests saveProcessSchedule of ProcessScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testSaveProcessSchedule() {
		// Save one record, check the size, should be 1 and then update the same
		// again the size should be 1
		System.out.println("TESTING SaveProcessSchedule");
		// Save schedule details of a process
		ProcessScheduleEO schedule = new ProcessScheduleEO();
		// process id
		schedule.setPrcsId(new Long(1));
		// Type of Recurrence
		schedule.setRecurrenceType(ProcessScheduleEO.RECURRENCE_TYPE_DAILY);
		// Recurrence
		DailyRecurrence recurrence = new DailyRecurrence();
		// Execution time
		ExecutionTime executionTime = new ExecutionTime();
		executionTime.setStartTime(new Long(1150));
		executionTime.setEndTime(new Long(1170));
		recurrence.setExecutionTime(executionTime);
		// Recurrence Gap
		recurrence.setRecurrenceGap(new Long(2));
		// Recurrence Range
		RecurrenceRange recurrenceRange = new RecurrenceRange();
		recurrenceRange.setStartDate(new Date());
		recurrenceRange.setEndDate(new Date());
		recurrence.setRecurrenceRange(recurrenceRange);
		// set true/false for RunOnWeekDay
		recurrence.setRunOnWeekDay(true);

		schedule.setRecurrence(recurrence);

		try {
			processScheduleDAO.saveProcessSchedule(schedule);
		} catch (ProcessAdminServiceException e) {
			fail("Failed while saving Process schedule");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_prcs_schedule);

		List<Object> data = new ArrayList<Object>();
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check size
		Assert.assertEquals(1, recordCount);

		// check prcs id, and recurence type
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(ProcessScheduleEO.RECURRENCE_TYPE_DAILY, data
				.get(1));

		// Edit the recurrence Type and check
		schedule.setRecurrenceType(ProcessScheduleEO.RECURRENCE_TYPE_WEEKLY);

		try {
			processScheduleDAO.saveProcessSchedule(schedule);
		} catch (ProcessAdminServiceException e) {
			fail("Failed while updating Process schedule");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_prcs_schedule);

		data = new ArrayList<Object>();
		recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// check size
		Assert.assertEquals(1, recordCount);

		// check prcs id, and recurrence type again
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(ProcessScheduleEO.RECURRENCE_TYPE_WEEKLY, data
				.get(1));
	}

	/**
	 * Tests getProcessSchedule of ProcessScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetProcessSchedule() {
		// Insert one record and compare the data that is inserted with the data
		// obtained executing the method
		System.out.println("TESTING GetProcessSchedule");

		// insert 1 record
		List<Object> prcsScheduleParamList = InsertParamsGenerator
				.setProcessScheduleParams(new Long(1),
						ProcessScheduleEO.RECURRENCE_TYPE_DAILY, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_schedule,
				prcsScheduleParamList);

		ProcessScheduleEO schedule = null;
		try {
			schedule = processScheduleDAO.getProcessSchedule(new Long(1));
		} catch (ProcessAdminServiceException e) {
			fail("Failed while retrieving Process schedule");
			e.printStackTrace();
		}

		Assert.assertEquals(new Long(1), schedule.getPrcsId());
		Assert.assertEquals(ProcessScheduleEO.RECURRENCE_TYPE_DAILY, schedule
				.getRecurrenceType());
	}

	/**
	 * Tests deleteProcessSchedule of ProcessScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testDeleteProcessSchedule() {

		// Insert one record.check the size,which should be 1. Run the DAO
		// method. check the size again,which should be 0
		System.out.println("TESTING DeleteProcessSchedule");

		// insert 1 record
		List<Object> prcsScheduleParamList = InsertParamsGenerator
				.setProcessScheduleParams(new Long(1),
						ProcessScheduleEO.RECURRENCE_TYPE_DAILY, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_process_schedule,
				prcsScheduleParamList);

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_prcs_schedule);
		int recordCount = 0;
		try {
			if (rs != null) {
				while (rs.next()) {
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// check size.should be 1
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_prcs_schedule));

		try {
			processScheduleDAO.deleteProcessSchedule(new Long(1));
		} catch (ProcessAdminServiceException e) {
			fail("Failed while deleting Process schedule");
			e.printStackTrace();
		}
		// check size.should be 1
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_prcs_schedule));

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_process_schedule_Table);
		HibernateUtil.shutDown();
	}

}
