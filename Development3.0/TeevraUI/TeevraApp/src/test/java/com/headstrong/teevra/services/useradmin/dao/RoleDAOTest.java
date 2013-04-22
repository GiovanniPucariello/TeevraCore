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
 * $Id: RoleDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Apr 28, 2009 
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
import com.headstrong.teevra.services.useradmin.dao.RoleDAO;
import com.headstrong.teevra.services.useradmin.eo.RoleEO;
import com.headstrong.teevra.services.useradmin.exception.UserAdminServiceException;

/**
 * 
 */
public class RoleDAOTest extends AbstractDAOTestCase {

	private RoleDAO roleDAO;

	public void onSetUp() {
		roleDAO = (RoleDAO) getBean("roleDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_roles_Table);

	}

	public void testGetRoles() {
		System.out.println("TESTING getRoles");

		List<Object> role1Params = InsertParamsGenerator.setRoleParams(
				new Long(1), "admin", "Administrator", RoleEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		List<Object> role2Params = InsertParamsGenerator.setRoleParams(
				new Long(2), "mod", "Moderator", RoleEO.STATUS_INACTIVE, System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role, role1Params);
		HibernateUtil.insertData(InsertQueries.insert_role, role2Params);

		List<RoleEO> roleList = new ArrayList<RoleEO>();

		try {
			roleList = roleDAO.getRoles();
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, roleList.size());
	}

	public void testSaveRole() {
		System.out.println("TESTING saveRole");

		RoleEO role = new RoleEO();
		role.setRoleName("admin");
		role.setRoleDesc("Administrator");
		role.setRoleStatus(RoleEO.STATUS_ACTIVE);
		role.setCreatedBy(System.getProperty("user.name"));
		role.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			roleDAO.saveRole(role);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving role");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil.executeQuery(SelectQueries.check_roles);
		int recordCount = 0;
		List<Object> data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check role id, role name and description
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("admin", data.get(1));
		Assert.assertEquals("Administrator", data.get(2));

		role = new RoleEO();
		role.setRoleId(new Long(1));
		role.setRoleName("administrator");
		role.setRoleDesc("Administrator");
		role.setRoleStatus(RoleEO.STATUS_ACTIVE);
		role.setCreatedBy(System.getProperty("user.name"));
		role.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			roleDAO.saveRole(role);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving role");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_roles);
		recordCount = 0;
		data = new ArrayList<Object>();
		try {
			if (rs != null) {
				while (rs.next()) {
					data.add(rs.getObject(1));
					data.add(rs.getObject(2));
					data.add(rs.getObject(3));
					recordCount++;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(1, recordCount);
		// check role id, role name and password
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals("administrator", data.get(1));
		Assert.assertEquals("Administrator", data.get(2));

		role = new RoleEO();
		role.setRoleName("mod");
		role.setRoleDesc("Moderator");
		role.setRoleStatus(RoleEO.STATUS_ACTIVE);
		role.setCreatedBy(System.getProperty("user.name"));
		role.setCreatedDate(new Timestamp(System.currentTimeMillis()));

		try {
			roleDAO.saveRole(role);
		} catch (UserAdminServiceException e) {
			fail("Failed while saving role");
			e.printStackTrace();
		}

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_roles));

	}

	public void testDeleteRole() {
		System.out.println("TESTING deleteRole");

		List<Object> roleParams = InsertParamsGenerator.setRoleParams(new Long(
				1), "admin", "Administrator", RoleEO.STATUS_ACTIVE, System
				.getProperty("user.name"), new Timestamp(System
				.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role, roleParams);
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_roles));

		HibernateUtil.createTable(CreateQueries.create_user_role_Table);

		List<Object> userRoleParams1 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams2 = InsertParamsGenerator.setUserRoleParams(
				new Long(2), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams1);
		HibernateUtil.insertData(InsertQueries.insert_user_role,
				userRoleParams2);

		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));

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
				.setRoleActivityParams(new Long(2), new Long(1), System
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
			roleDAO.deleteRole(new Long(1));
		} catch (UserAdminServiceException e) {
			fail("Failed while deleting role and its dependencies");
			e.printStackTrace();
		}

		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_roles));
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_user_role));
		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_role_activity));
	}

	public void testGetUserRoles() {
		System.out.println("TESTING GetUserRoles");
		List<Object> role1Params = InsertParamsGenerator.setRoleParams(
				new Long(1), "admin", "Administrator", RoleEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		List<Object> role2Params = InsertParamsGenerator.setRoleParams(
				new Long(2), "mod", "Moderator", RoleEO.STATUS_INACTIVE, System
						.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);
		List<Object> role3Params = InsertParamsGenerator.setRoleParams(
				new Long(3), "watcher", "view-only", RoleEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		List<Object> role4Params = InsertParamsGenerator.setRoleParams(
				new Long(4), "user", "view-modify", RoleEO.STATUS_ACTIVE,
				System.getProperty("user.name"), new Timestamp(System
						.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_role, role1Params);
		HibernateUtil.insertData(InsertQueries.insert_role, role2Params);
		HibernateUtil.insertData(InsertQueries.insert_role, role3Params);
		HibernateUtil.insertData(InsertQueries.insert_role, role4Params);

		HibernateUtil.createTable(CreateQueries.create_user_role_Table);

		List<Object> userRoleParams1 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(1), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams2 = InsertParamsGenerator.setUserRoleParams(
				new Long(1), new Long(2), System.getProperty("user.name"),
				new Timestamp(System.currentTimeMillis()), null, null);
		List<Object> userRoleParams3 = InsertParamsGenerator.setUserRoleParams(
				new Long(2), new Long(1), System.getProperty("user.name"),
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

		List<RoleEO> roleList = new ArrayList<RoleEO>();

		try {
			roleList = roleDAO.getRoles(new Long(1));
		} catch (UserAdminServiceException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(2, roleList.size());
	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_user_role_Table);
		HibernateUtil.executeQuery(DropQueries.drop_role_activity_Table);
		HibernateUtil.executeQuery(DropQueries.drop_activity_Table);
		HibernateUtil.executeQuery(DropQueries.drop_roles_Table);
		HibernateUtil.shutDown();
	}

}
