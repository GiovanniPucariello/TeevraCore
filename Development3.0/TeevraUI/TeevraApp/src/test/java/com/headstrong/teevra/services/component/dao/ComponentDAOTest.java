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
 * $Id: ComponentDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.teevra.services.component.dao;

import java.sql.Timestamp;
import java.util.List;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.component.dao.ComponentDAO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * 
 */
public class ComponentDAOTest extends AbstractDAOTestCase {

	public ComponentDAO componentDAO;

	public void onSetUp() {
		componentDAO = (ComponentDAO) getBean("componentDAO");

		HibernateUtil.setUp();
		HibernateUtil.createTable(CreateQueries.create_component_Table);
		HibernateUtil
				.createTable(CreateQueries.create_component_configuration_Table);
	}

	public void testGetComponents() {

		System.out.println("Testing getComponents ");

		List<Object> componentParamList1 = InsertParamsGenerator
				.setComponentParams(new Long(1), "DB Endpoint", "1.0",
						"ACTIVE", "ENDPOINT", "DataBase Connector", null, null,
						"cDBEndpoint_icon.png", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"cDBEndpoint.png", "DATABASE");

		List<Object> componentParamList2 = InsertParamsGenerator
				.setComponentParams(new Long(2), "JMS Endpoint", "1.0",
						"ACTIVE", "ENDPOINT", "JMS Connector", null, null,
						"cMQEndpoint_icon.png", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"cMQEndpoint.png", "JMS");

		HibernateUtil.insertData(InsertQueries.insert_component_Table,
				componentParamList1);
		HibernateUtil.insertData(InsertQueries.insert_component_Table,
				componentParamList2);

		List<ComponentEO> componentList = null;
		try {
			componentList = componentDAO.getComponents();
		} catch (ComponentServiceException e) {
			fail("Failed while retrieving components");
			e.printStackTrace();
		}

		Assert.assertEquals(2, componentList.size());
	}

	public void testGetConnectors() {
		System.out.println("Testing getConnectors ");

		List<Object> componentParamList1 = InsertParamsGenerator
				.setComponentParams(new Long(1), "DB Endpoint", "1.0",
						"ACTIVE", "CONNECTOR", "DataBase Connector", null,
						null, "cDBEndpoint_icon.png", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"cDBEndpoint.png", "DATABASE");

		List<Object> componentParamList2 = InsertParamsGenerator
				.setComponentParams(new Long(2), "JMS Endpoint", "1.0",
						"ACTIVE", "ENDPOINT", "JMS Connector", null, null,
						"cMQEndpoint_icon.png", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"cMQEndpoint.png", "JMS");

		HibernateUtil.insertData(InsertQueries.insert_component_Table,
				componentParamList1);
		HibernateUtil.insertData(InsertQueries.insert_component_Table,
				componentParamList2);

		List<ComponentEO> componentList = null;
		try {
			componentList = componentDAO.getConnectors();
		} catch (ComponentServiceException e) {
			fail("Failed while retrieving components");
			e.printStackTrace();
		}

		Assert.assertEquals(1, componentList.size());
	}

	public void atestSaveComponent() {

		System.out.println("TESTING SAVE COMPONENT");
		ComponentEO componentToSave = new ComponentEO();
		componentToSave.setCompName("test component1");
		componentToSave.setCompDesc("test component Desc1");
		componentToSave.setCompType("ENDPOINT");
		componentToSave.setCompImageRef("****.png");
		componentToSave.setCompServiceName("************");

		try {
			componentDAO.saveComponent(componentToSave);
		} catch (ComponentServiceException e) {
			e.printStackTrace();
		}
		System.out.println("DONE!!");
	}

	public void testDeleteComponent() {

		System.out.println("TESTING DELETE COMPONENTS");

		List<Object> componentParamList = InsertParamsGenerator
				.setComponentParams(new Long(1), "DB Endpoint", "1.0",
						"ACTIVE", "ENDPOINT", "DataBase Connector", null, null,
						"cDBEndpoint_icon.png", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null,
						"cDBEndpoint.png", "DATABASE");

		HibernateUtil.insertData(InsertQueries.insert_component_Table,
				componentParamList);

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_components));

		try {
			componentDAO.deleteComponent(new Long(1));
		} catch (ComponentServiceException e) {
			fail("Failed while deleting the component");
			e.printStackTrace();
		}
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_components));

	}

	public void onTearDown() {
		HibernateUtil
				.executeQuery(DropQueries.drop_component_configuration_Table);
		HibernateUtil.executeQuery(DropQueries.drop_component_Table);
		HibernateUtil.shutDown();
	}
}
