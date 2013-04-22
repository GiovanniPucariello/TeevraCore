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
 * $Id: UserRoleDAOTest.java
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
import com.headstrong.teevra.services.useradmin.dao.UserRoleDAO;
import com.headstrong.teevra.services.useradmin.eo.UserRoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * 
 */
public class UserRoleDAOTest extends AbstractDAOTestCase {

	private UserRoleDAO userRoleDAO;

	public void onSetUp() {
		userRoleDAO = (UserRoleDAO) getBean("userRoleDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_user_role_Table);
	}

	public void testSaveUserRole() {
		System.out.println("Testing saveUserRole ");

		UserRoleEO userRole = new UserRoleEO();
		userRole.setUserId(new Long(3));
		userRole.setRoleId(new Long(2));
		userRole.setCreatedBy(System.getProperty("user.name"));
		userRole.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			userRoleDAO.saveUserRole(userRole);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving user-role mapping");
			e.printStackTrace();
		}
		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_user_role);
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
		// check user id and role id
		Assert.assertEquals(new Long(3), data.get(0));
		Assert.assertEquals(new Long(2), data.get(1));
	}

	public void testDeleteUserRole() {
		System.out.println("Testing deleteUserRole ");

		List<Object> userRoleParams1 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams2 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams3 = InsertParamsGenerator.setUserRoleParams(
				new Long(2), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams1);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams2);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams3);

		Assert.assertEquals(3, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));

		try {
			userRoleDAO.deleteUserRole(new Long(1));
		} catch (UserAdminServiceException e) {
			fail("Failed while deleting user-role mapping");
			e.printStackTrace();
		}

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_user_role_Table);
		HibernateUtil.shutDown();
	}
}
