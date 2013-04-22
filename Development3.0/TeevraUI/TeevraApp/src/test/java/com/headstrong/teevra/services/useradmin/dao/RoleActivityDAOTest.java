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
 * $Id: RoleActivityDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 10, 2009 
 */

package com.headstrong.teevra.services.useradmin.dao;

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
import com.headstrong.teevra.services.useradmin.dao.RoleActivityDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleActivityEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * 
 */
public class RoleActivityDAOTest extends AbstractDAOTestCase {

	private RoleActivityDAO roleActivityDAO;

	public void onSetUp() {
		roleActivityDAO = (RoleActivityDAO) getBean("roleActivityDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_role_activity_Table);
	}

	public void testSaveRoleActivity() {
		System.out.println("Testing saveRoleActivity ");

		RoleActivityEO roleActivity = new RoleActivityEO();
		roleActivity.setRoleId(new Long(3));
		roleActivity.setActivityId(new Long(2));
		roleActivity.setCreatedBy(System.getProperty("user.name"));
		roleActivity.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			roleActivityDAO.saveRoleActivity(roleActivity);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving role-activity mapping");
			e.printStackTrace();
		}
		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_role_activity);
		int recordCount = 0;

		List<Object> data = new ArrayList<Object>();
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
		// check role id and activity id
		Assert.assertEquals(new Long(3), data.get(0));
		Assert.assertEquals(new Long(2), data.get(1));
	}

	public void testDeleteRoleActivity() {
		System.out.println("Testing deleteRoleActivity ");

		List<Object> roleActivityParams1 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(1), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams2 = InsertParamsGenerator
				.setRoleActivityParams(new Long(1), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> roleActivityParams3 = InsertParamsGenerator
				.setRoleActivityParams(new Long(2), new Long(2), System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams1);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams2);
		HibernateUtil.insertData(InsertQueries.insert_role_activity,
				roleActivityParams3);

		Assert.assertEquals(3, HibernateUtil
				.getRecordCount(SelectQueries.check_role_activity));

		try {
			roleActivityDAO.deleteRoleActivity(new Long(1));
		} catch (UserAdminServiceException e) {
			fail("Failed while deleting role-activity mapping");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_role_activity));
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_role_activity_Table);
		HibernateUtil.shutDown();
	}
}
