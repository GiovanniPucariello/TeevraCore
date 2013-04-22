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
 * $Id: CacheReloadScheduleDAOTest.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Sept 27, 2010 
 */ 

package com.headstrong.teevra.services.refdata.dao;

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
import com.headstrong.teevra.common.scheduling.exception.SchedulingException;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.refdata.dao.CacheReloadScheduleDAO;
import com.headstrong.teevra.services.refdata.eo.CacheReloadScheduleEO;


/**
 * 
 */
public class CacheReloadScheduleDAOTest extends AbstractDAOTestCase {

	private CacheReloadScheduleDAO cacheReloadScheduleDAO;

	public void onSetUp() {
		cacheReloadScheduleDAO = (CacheReloadScheduleDAO) getBean("cacheReloadScheduleDAO");
		HibernateUtil.setUp();
		
		// Creating Cache Reload Table
		HibernateUtil.createTable(CreateQueries.create_cache_reload_schedule_Table);
		
		/*List<Object> paramList = InsertParamsGenerator.setCacheReloadScheduleParams("EurexDecimalRefdata",
				ProcessScheduleEO.RECURRENCE_TYPE_DAILY, null, System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_cache_reload_schedule,
				paramList);*/

	}

	/**
	 * Tests saveCacheReloadSchedule of CacheReloadScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testSaveCacheReloadSchedule() {
		// Save one record, check the size, should be 1 and then update the same again the size should be 1
		System.out.println("TESTING saveCacheReloadSchedule");
		// Save schedule details of a process
		CacheReloadScheduleEO schedule = new CacheReloadScheduleEO();
		// set the cacheName
		schedule.setCacheName("cache1");
		// Type of Recurrence
		schedule.setRecurrenceType(CacheReloadScheduleEO.RECURRENCE_TYPE_DAILY);
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
		recurrence.setRunOnWeekDay(true);
		schedule.setRecurrence(recurrence);

		try {
			cacheReloadScheduleDAO.saveCacheReloadSchedule(schedule);
		} catch (SchedulingException e) {
			fail("Failed while saving Cache Reload schedule");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil.executeQuery(SelectQueries.check_cache_reload_schedule);

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

		// check cache name, and recurrence type
		Assert.assertEquals("cache1", data.get(0));
		Assert.assertEquals(CacheReloadScheduleEO.RECURRENCE_TYPE_DAILY, data
				.get(1));

		// Edit the recurrence Type and check
		schedule.setRecurrenceType(CacheReloadScheduleEO.RECURRENCE_TYPE_WEEKLY);

		try {
			cacheReloadScheduleDAO.saveCacheReloadSchedule(schedule);
		} catch (SchedulingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_cache_reload_schedule);

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

		// check cache name, and recurrence type again
		Assert.assertEquals("cache1", data.get(0));
		Assert.assertEquals(CacheReloadScheduleEO.RECURRENCE_TYPE_WEEKLY, data
				.get(1));
	}

	/**
	 * Tests getCacheReloadSchedule of CacheReloadScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetCacheReloadSchedule() {
		// Insert one record and compare the data that is inserted with the data
		// obtained executing the method
		System.out.println("TESTING getCacheReloadSchedule");

		// insert 1 record
		List<Object> scheduleParamList = InsertParamsGenerator.setCacheReloadScheduleParams("cache1",
						CacheReloadScheduleEO.RECURRENCE_TYPE_DAILY, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_cache_reload_schedule,
				scheduleParamList);

		CacheReloadScheduleEO schedule = null;
		try {
			schedule = cacheReloadScheduleDAO.getCacheReloadSchedule("cache1");
		} catch (SchedulingException e) {
			fail("Failed while retrieving Cache Reload Schedule");
			e.printStackTrace();
		}

		Assert.assertEquals("cache1", schedule.getCacheName());
		Assert.assertEquals(CacheReloadScheduleEO.RECURRENCE_TYPE_DAILY, schedule
				.getRecurrenceType());
	}

	/**
	 * Tests deleteCacheReloadSchedule of CacheReloadScheduleDAO
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testDeleteCacheReloadSchedule() {

		// Insert one record.check the size,which should be 1. Run the DAO
		// method. check the size again,which should be 0
		System.out.println("TESTING DeleteCacheReloadSchedule");

		// insert 1 record
		List<Object> scheduleParamList = InsertParamsGenerator
				.setCacheReloadScheduleParams("cache1",
						CacheReloadScheduleEO.RECURRENCE_TYPE_DAILY, null, System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_cache_reload_schedule, scheduleParamList);

		ResultSet rs = HibernateUtil.executeQuery(SelectQueries.check_cache_reload_schedule);
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
		Assert.assertEquals(1, HibernateUtil.getRecordCount(SelectQueries.check_cache_reload_schedule));

		try {
			cacheReloadScheduleDAO.deleteCacheReloadSchedule("cache1");
		} catch (SchedulingException e) {
			e.printStackTrace();
		}
		
		// check size.should be 1
		Assert.assertEquals(0, HibernateUtil.getRecordCount(SelectQueries.check_cache_reload_schedule));

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_cache_reload_schedule_Table);
		HibernateUtil.shutDown();
	}

}
