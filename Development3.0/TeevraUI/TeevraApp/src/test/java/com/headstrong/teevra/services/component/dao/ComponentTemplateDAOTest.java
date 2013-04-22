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
 * $Id: ComponentTemplateDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 27, 2009 
 */

package com.headstrong.teevra.services.component.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import com.headstrong.teevra.common.dao.AbstractDAOTestCase;
import com.headstrong.teevra.common.dao.hibernate.HibernateUtil;
import com.headstrong.teevra.common.util.CreateQueries;
import com.headstrong.teevra.common.util.DropQueries;
import com.headstrong.teevra.common.util.InsertParamsGenerator;
import com.headstrong.teevra.common.util.InsertQueries;
import com.headstrong.teevra.common.util.SelectQueries;
import com.headstrong.teevra.services.component.dao.ComponentTemplateDAO;
import com.headstrong.teevra.services.component.eo.ComponentTemplateEO;
import com.headstrong.teevra.services.component.exception.ComponentServiceException;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;

/**
 * 
 */
public class ComponentTemplateDAOTest extends AbstractDAOTestCase {

	public ComponentTemplateDAO componentTemplateDAO;

	public void onSetUp() {
		componentTemplateDAO = (ComponentTemplateDAO) getBean("componentTemplateDAO");

		HibernateUtil.setUp();

		// create component_template table
		HibernateUtil
				.createTable(CreateQueries.create_component_template_Table);
	}

	/**
	 * Tests saveComponentTemplate method of ComponentTemplateDAO based on
	 * component id
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testSaveComponentTemplate() {

		System.out.println("TESTING SAVE OR COMPONENT TEMPLATE ");

		ComponentTemplateEO template = new ComponentTemplateEO();
		template.setCompId(new Long(1));
		template.setTemplateName("jms_template1");

		List<ProcessServiceConfigurationEO> configList = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("host");
		config.setSimpleValue("localhost");
		configList.add(config);

		config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("port");
		config.setSimpleValue("8080");
		configList.add(config);

		template.setConfigurations(configList);

		try {
			componentTemplateDAO.saveComponentTemplate(template);
		} catch (ComponentServiceException e) {
			fail("Failed while saving template");
			e.printStackTrace();
		}

		ResultSet rs = HibernateUtil
				.executeQuery(SelectQueries.check_component_table);
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
		// check component template id, name and component id
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(new Long(1), data.get(1));
		Assert.assertEquals("jms_template1", data.get(2));

		template = new ComponentTemplateEO();
		template.setCompTemplateId(new Long(1));
		template.setCompId(new Long(1));
		template.setTemplateName("jms_template1_edit");

		configList = new ArrayList<ProcessServiceConfigurationEO>();

		config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src1");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("host");
		config.setSimpleValue("localhost");
		configList.add(config);

		config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src1");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("port");
		config.setSimpleValue("8080");
		configList.add(config);

		template.setConfigurations(configList);

		try {
			componentTemplateDAO.saveComponentTemplate(template);
		} catch (ComponentServiceException e) {
			fail("Failed while editing template");
			e.printStackTrace();
		}

		rs = HibernateUtil.executeQuery(SelectQueries.check_component_table);
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
		// check component template id, name and component id
		Assert.assertEquals(new Long(1), data.get(0));
		Assert.assertEquals(new Long(1), data.get(1));
		Assert.assertEquals("jms_template1_edit", data.get(2));

		template = new ComponentTemplateEO();
		template.setCompId(new Long(2));
		template.setTemplateName("jms_template2");

		configList = new ArrayList<ProcessServiceConfigurationEO>();

		config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src2");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("host");
		config.setSimpleValue("localhost");
		configList.add(config);

		config = new ProcessServiceConfigurationEO();
		config.setPrcsId(new Long(1));
		config.setServiceId("src2");
		config.setServiceType("JMS Endpoint");
		config.setConfigKey("port");
		config.setSimpleValue("8080");
		configList.add(config);

		template.setConfigurations(configList);

		try {
			componentTemplateDAO.saveComponentTemplate(template);
		} catch (ComponentServiceException e) {
			fail("Failed while editing template");
			e.printStackTrace();
		}
		Assert.assertEquals(2, HibernateUtil
				.getRecordCount(SelectQueries.check_component_table));

	}

	/**
	 * Tests getComponentTemplateNames method of ComponentTemplateDAO component
	 * id
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetComponentTemplateNames() {

		System.out.println("TESTING GetComponentTemplateNames ");
		// insert 3 records of component templates. 2 templates for 1 component
		// and 1 template for other

		List<Object> componentTempaltePatamList1 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(1), new Long(1),
						"jms_template1", "", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> componentTempaltePatamList2 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(2), new Long(1),
						"jms_template2", "", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> componentTempaltePatamList3 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(3), new Long(2),
						"validator_template", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList1);
		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList2);
		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList3);

		Map<Long, List<String>> comp2TemplatesMap = null;
		try {
			comp2TemplatesMap = componentTemplateDAO
					.getComponentTemplateNames();
		} catch (ComponentServiceException e) {
			e.printStackTrace();
		}
		List<String> firstComponentTemplateNames = comp2TemplatesMap
				.get(new Long(1));
		List<String> secondComponentTemplateNames = comp2TemplatesMap
				.get(new Long(2));

		Assert
				.assertEquals("jms_template1", firstComponentTemplateNames
						.get(0));
		Assert
				.assertEquals("jms_template2", firstComponentTemplateNames
						.get(1));
		Assert.assertEquals("validator_template", secondComponentTemplateNames
				.get(0));
	}

	/**
	 * Tests getComponentTemplateNames method of ComponentTemplateDAO based on
	 * component id
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testGetIdBasedComponentTemplateNames() {

		System.out.println("TESTING GetComponentTemplateNames based on compId");
		// insert 3 records of component templates. 2 templates for 1 component
		// and 1 template for other

		List<Object> componentTempaltePatamList1 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(1), new Long(1),
						"jms_template1", "", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> componentTempaltePatamList2 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(2), new Long(1),
						"jms_template2", "", System.getProperty("user.name"),
						new Timestamp(System.currentTimeMillis()), null, null);

		List<Object> componentTempaltePatamList3 = InsertParamsGenerator
				.setComponentTemplateParams(new Long(3), new Long(2),
						"validator_template", "", System
								.getProperty("user.name"), new Timestamp(System
								.currentTimeMillis()), null, null);

		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList1);
		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList2);
		HibernateUtil.insertData(InsertQueries.insert_component_template,
				componentTempaltePatamList3);

		List<String> templateNamesList = null;
		try {
			templateNamesList = componentTemplateDAO
					.getComponentTemplateNames(new Long(1));
		} catch (ComponentServiceException e) {
			e.printStackTrace();
		}

		Assert.assertEquals(2, templateNamesList.size());
		Assert.assertEquals("jms_template1", templateNamesList.get(0));
		Assert.assertEquals("jms_template2", templateNamesList.get(1));

	}

	public void onTearDown() {
		HibernateUtil.executeQuery(DropQueries.drop_component_template_Table);
		HibernateUtil.shutDown();
	}
}
