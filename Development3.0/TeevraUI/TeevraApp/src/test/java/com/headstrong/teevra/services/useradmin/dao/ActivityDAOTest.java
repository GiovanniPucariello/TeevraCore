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
 * $Id: ActivityDAOTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 21, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

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
import com.headstrong.teevra.services.useradmin.dao.ActivityDAO;
import com.headstrong.teevra.services.useradmin.eo.ActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * 
 */
public class ActivityDAOTest extends AbstractDAOTestCase {

	public ActivityDAO activityDAO;

	public void onSetUp() {
		activityDAO = (ActivityDAO) getBean("activityDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_activity_Table);
	}

	public void testGetActivities() {
		System.out.println("TESTING GET Activities");

		List<Object> activity1Params = InsertParamsGenerator.setActivityParams(
				new Long(1), "View Processes",
				"View all the processes present in the system",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity2Params = InsertParamsGenerator.setActivityParams(
				new Long(2), "Create/Update/Delete Process",
				"Create or Update or Delete a process",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity1Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity2Params);

		List<ActivityEO> activityList = new ArrayList<ActivityEO>();

		try {
			activityList = activityDAO.getActivities();
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, activityList.size());

	}

	public void testGetMethodActivities() {
		System.out.println("TESTING MethodActivities");
		// insert 3 records of activities
		List<Object> activity1Params = InsertParamsGenerator.setActivityParams(
				new Long(1), "View Processes",
				"View all the processes present in the system",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity2Params = InsertParamsGenerator.setActivityParams(
				new Long(2), "Create/Update/Delete Process",
				"Create or Update or Delete a process",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity3Params = InsertParamsGenerator.setActivityParams(
				new Long(3), "Publish Process",
				"Publish an already created process", ActivityEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity1Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity2Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity3Params);

		// create table method and insert 2 records
		HibernateUtil.createTable(CreateQueries.create_method_Table);
		List<Object> method1Params = InsertParamsGenerator.setMethodParams(
				new Long(1), "getProcesses",
				"Fetches list of all processes present in the system", System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null, "ProcessService");

		List<Object> method2Params = InsertParamsGenerator
				.setMethodParams(
						new Long(2),
						"saveProcess",
						"Persists process details and returns the same process that is saved",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"ProcessService");

		HibernateUtil.insertData(InsertQueries.insert_method, method1Params);
		HibernateUtil.insertData(InsertQueries.insert_method, method2Params);

		// 3 records of activity_method mapping
		HibernateUtil.createTable(CreateQueries.create_activity_method_Table);
		List<Object> activityMethodParams1 = InsertParamsGenerator
				.setActivityMethodParams(new Long(1), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> activityMethodParams2 = InsertParamsGenerator
				.setActivityMethodParams(new Long(2), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> activityMethodParams3 = InsertParamsGenerator
				.setActivityMethodParams(new Long(3), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_activity_method,
				activityMethodParams1);
		HibernateUtil.insertData(InsertQueries.insert_activity_method,
				activityMethodParams2);
		HibernateUtil.insertData(InsertQueries.insert_activity_method,
				activityMethodParams3);

		List<ActivityEO> activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getActivities("getProcesses");
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, activityList.size());

		activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getActivities("saveProcess");
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, activityList.size());
	}

	public void testGetUserActivities() {
		System.out.println("TESTING userActivities");

		// insert 3 records of activities
		List<Object> activity1Params = InsertParamsGenerator.setActivityParams(
				new Long(1), "View Processes",
				"View all the processes present in the system",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity2Params = InsertParamsGenerator.setActivityParams(
				new Long(2), "Create/Update/Delete Process",
				"Create or Update or Delete a process",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity3Params = InsertParamsGenerator.setActivityParams(
				new Long(3), "Publish Process",
				"Publish an already created process", ActivityEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity1Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity2Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity3Params);

		// insert 4 records of user_role
		HibernateUtil.createTable(CreateQueries.create_user_role_Table);

		List<Object> userRoleParams1 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams2 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams3 = InsertParamsGenerator.setUserRoleParams(
				new Long(2), new Long(3), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams4 = InsertParamsGenerator.setUserRoleParams(
				new Long(2), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams1);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams2);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams3);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams4);

		// insert 4 records of role_activity
		HibernateUtil.createTable(CreateQueries.create_role_activity_Table);

		List<Object> roleActivityParams1 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams2 = InsertParamsGenerator
				.setRoleActivityParams(new Long(2), new Long(3), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams3 = InsertParamsGenerator
				.setRoleActivityParams(new Long(2), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams4 = InsertParamsGenerator
				.setRoleActivityParams(new Long(3), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams1);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams2);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams3);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams4);

		List<ActivityEO> activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getActivities(new Long(1));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, activityList.size());

		activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getActivities(new Long(2));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(3, activityList.size());
	}

	public void testGetRoleActivities() {
		System.out.println("TESTING getRoleActivities");

		// insert 3 records of activities
		List<Object> activity1Params = InsertParamsGenerator.setActivityParams(
				new Long(1), "View Processes",
				"View all the processes present in the system",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity2Params = InsertParamsGenerator.setActivityParams(
				new Long(2), "Create/Update/Delete Process",
				"Create or Update or Delete a process",
				ActivityEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> activity3Params = InsertParamsGenerator.setActivityParams(
				new Long(3), "Publish Process",
				"Publish an already created process", ActivityEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity1Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity2Params);
		HibernateUtil
				.insertData(InsertQueries.insert_activity, activity3Params);

		// insert 6 records of role_activity
		HibernateUtil.createTable(CreateQueries.create_role_activity_Table);

		List<Object> roleActivityParams1 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams2 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams3 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(3), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams4 = InsertParamsGenerator
				.setRoleActivityParams(new Long(2), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams5 = InsertParamsGenerator
				.setRoleActivityParams(new Long(2), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams6 = InsertParamsGenerator
				.setRoleActivityParams(new Long(3), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams1);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams2);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams3);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams4);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams5);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams6);

		List<ActivityEO> activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getRoleActivities(new Long(1));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(3, activityList.size());

		activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getRoleActivities(new Long(2));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, activityList.size());

		activityList = new ArrayList<ActivityEO>();
		try {
			activityList = activityDAO.getRoleActivities(new Long(3));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, activityList.size());
	}

	/**
	 * @return the activityDAO
	 */
	public ActivityDAO getActivityDAO() {
		return activityDAO;
	}

	/**
	 * @param activityDAO
	 *            the activityDAO to set
	 */
	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_user_role_Table);
		HibernateUtil.executeQuery(DropQueries.drop_role_activity_Table);
		HibernateUtil.executeQuery(DropQueries.drop_activity_method_Table);
		HibernateUtil.executeQuery(DropQueries.drop_method_Table);
		HibernateUtil.executeQuery(DropQueries.drop_activity_Table);
		HibernateUtil.shutDown();
	}
}
