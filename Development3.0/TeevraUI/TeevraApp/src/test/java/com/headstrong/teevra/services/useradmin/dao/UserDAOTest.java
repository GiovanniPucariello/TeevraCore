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
 * $Id: UserDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 22, 2009 
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
import com.headstrong.teevra.services.useradmin.dao.UserDAO;
import com.headstrong.teevra.services.useradmin.eo.UserEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * 
 */
public class UserDAOTest extends AbstractDAOTestCase {

	private UserDAO userDAO;

	public void onSetUp() {
		userDAO = (UserDAO) getBean("userDAO");

		HibernateUtil.setUp();

		HibernateUtil.createTable(CreateQueries.create_users_Table);
	}

	public void testGetUsers() {
		System.out.println("TESTING getUsers");

		List<Object> user1Params = InsertParamsGenerator.setUserParams(
				new Long(1), "visu", "VISWANATH", "P",
				"viswanath.p@headstrong.com", "visu", UserEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		List<Object> user2Params = InsertParamsGenerator.setUserParams(
				new Long(2), "teevra", "TEEVRA", null,
				"teevra@headstrong.com", "teevra", UserEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user, user1Params);
		HibernateUtil.insertData(InsertQueries.insert_user, user2Params);

		List<UserEO> userList = new ArrayList<UserEO>();
		try {
			userList = userDAO.getUsers();
		} catch (UserAdminServiceException e) {
			fail("Failed while retrieving users");
			e.printStackTrace();
		}

		Assert.assertEquals(2, userList.size());
	}

	public void testSaveUser() {
		System.out.println("TESTING registerUser");

		UserEO user = new UserEO();
		user.setUserName("visu");
		user.setUserFirstName("VISWANATH");
		user.setUserLastName("P");
		user.setEmailId("viswanath.p@headstrong.com");
		user.setPassword("visu");
		user.setUserStatus(UserEO.STATUS_ACTIVE);
		user.setCreatedBy(System.getProperty("user.name"));
		user.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			userDAO.saveUser(user);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving user");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil.executeQuery(SelectQueries.check_users);
		int recordCount = 0;
		List<Object> data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(6));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check user id, user name and password
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("visu", data.get(1));
		Assert.assertEquals("visu", data.get(2));

		user = new UserEO();
		user.setUserId(new Long(1));
		user.setUserName("visu");
		user.setUserFirstName("VISWANATH");
		user.setUserLastName("P");
		user.setEmailId("viswanath.p@headstrong.com");
		user.setPassword("visu!@#");
		user.setUserStatus(UserEO.STATUS_ACTIVE);
		user.setCreatedBy(System.getProperty("user.name"));
		user.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			userDAO.saveUser(user);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving user");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_users);
		recordCount = 0;
		data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(6));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check user id, user name and password
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("visu", data.get(1));
		Assert.assertEquals("visu!@#", data.get(2));

		user = new UserEO();
		user.setUserName("teevra");
		user.setUserFirstName("TEEVRA");
		user.setEmailId("teevra@headstrong.com");
		user.setPassword("Headstrong!@#");
		user.setUserStatus(UserEO.STATUS_ACTIVE);
		user.setCreatedBy(System.getProperty("user.name"));
		user.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			userDAO.saveUser(user);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving user");
			e.printStackTrace();
		}

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_users));
	}

	public void testDeleterUser() {
		System.out.println("Testing deleteUser");

		List<Object> userParams = InsertParamsGenerator.setUserParams(new Long(
				1), "visu", "VISWANATH", "P", "viswanath.p@headstrong.com",
				"visu", UserEO.STATUS_ACTIVE, System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user, userParams);
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_users));

		HibernateUtil.createTable(CreateQueries.create_user_role_Table);

		List<Object> userRoleParams1 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams2 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams1);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));

		try {
			userDAO.deleteUser(new Long(1));
		} catch (UserAdminServiceException e) {
			fail("Failed while deleting user and its dependencies from user-role mapping");
			e.printStackTrace();
		}
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_users));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_user_role_Table);
		HibernateUtil.executeQuery(DropQueries.drop_users_Table);
		HibernateUtil.shutDown();
	}
}
