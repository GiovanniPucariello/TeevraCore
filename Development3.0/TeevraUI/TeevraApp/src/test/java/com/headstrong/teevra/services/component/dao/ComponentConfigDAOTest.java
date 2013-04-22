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
 * $Id: ComponentConfigDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Oct 22, 2008 
 */

package com.headstrong.teevra.services.component.dao;

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
import com.headstrong.teevra.services.component.dao.ComponentConfigDAO;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;

/**
 * 
 */
public class ComponentConfigDAOTest extends AbstractDAOTestCase {

	public ComponentConfigDAO componentConfigDAO;

	public void onSetUp() {
		componentConfigDAO = (ComponentConfigDAO) getBean("componentConfigDAO");
		HibernateUtil.setUp();

		HibernateUtil
				.createTable(CreateQueries.create_component_configuration_Table);
	}

	/**
	 * Tests getComponentConfigList method in ComponentConfigDAO;
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetComponentConfigurations() {

		System.out.println("TESTING getComponentConfigList ");
		// insert 4 records of component configurations 2 for one component and
		// 2 for another

		List<Object> compConfigParamsList11 = InsertParamsGenerator
				.setComponentConfigParams(new Long(1), new Long(1),
						new Long(1), "url", "TEXT", "", "Server URL", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);
		List<Object> compConfigParamsList12 = InsertParamsGenerator
				.setComponentConfigParams(new Long(2), new Long(1),
						new Long(2), "userName", "TEXT", "", "User Name",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		List<Object> compConfigParamsList21 = InsertParamsGenerator
				.setComponentConfigParams(new Long(3), new Long(2),
						new Long(1), "brokerUrl", "TEXT", "", "Broker URL",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);
		List<Object> compConfigParamsList22 = InsertParamsGenerator
				.setComponentConfigParams(new Long(4), new Long(2),
						new Long(2), "destination", "TEXT", "", "Destination",
						System.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(
				InsertQueries.insert_component_configuration_Table,
				compConfigParamsList11);
		HibernateUtil.insertData(
				InsertQueries.insert_component_configuration_Table,
				compConfigParamsList12);
		HibernateUtil.insertData(
				InsertQueries.insert_component_configuration_Table,
				compConfigParamsList21);
		HibernateUtil.insertData(
				InsertQueries.insert_component_configuration_Table,
				compConfigParamsList22);

		List<ComponentConfigEO> componentConfigList = new ArrayList<ComponentConfigEO>();
		try {
			componentConfigList = componentConfigDAO
					.getComponentConfigList(new Long(1));
		} catch (ComponentServiceException e) {
			fail("Failed while retrieving the configurations for the component");
			e.printStackTrace();
		}

		Assert.assertEquals(2, componentConfigList.size());
	}

	public void testDeleteComponentConfiguration() {

		System.out.println("Testing GET deleteComponentConfig ");
		// insert one record check the size. delete it and check the size

		List<Object> compConfigParamsList = InsertParamsGenerator
				.setComponentConfigParams(new Long(1), new Long(1),
						new Long(1), "url", "TEXT", "", "Server URL", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(
				InsertQueries.insert_component_configuration_Table,
				compConfigParamsList);

		Assert.assertEquals(1, HibernateUtil
				.getRecordCount(SelectQueries.check_component_configurations));

		try {
			componentConfigDAO.deleteComponentConfig(new Long(1));
		} catch (ComponentServiceException e) {
			fail("Failed while deleting the component configuration");
			e.printStackTrace();
		}
		Assert.assertEquals(0, HibernateUtil
				.getRecordCount(SelectQueries.check_component_configurations));

	}

	public void onTearDown() {
		HibernateUtil
				.executeQuery(DropQueries.drop_component_configuration_Table);
		HibernateUtil.shutDown();
	}
}
