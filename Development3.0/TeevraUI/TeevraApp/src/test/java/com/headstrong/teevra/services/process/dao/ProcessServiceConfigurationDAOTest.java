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
 * $Id: ProcessServiceConfigurationDAOTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 11, 2009 
 */

package com.headstrong.teevra.services.process.dao;

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
import com.headstrong.teevra.services.process.dao.ProcessServiceConfigurationDAO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.process.exception.ProcessServiceException;

/**
 * 
 */
public class ProcessServiceConfigurationDAOTest extends AbstractDAOTestCase {

	private ProcessServiceConfigurationDAO processConfigDAO;

	public void onSetUp() {
		processConfigDAO = (ProcessServiceConfigurationDAO) getBean("processConfigDAO");
		HibernateUtil.setUp();
		HibernateUtil
				.createTable(CreateQueries.create_process_service_configuration);
	}

	public void testgetProcessConfigurations() {
		// TODO - getProcessConfigurations method not yet implemented
	}

	public void testSaveAllProcessConfigurations() {

		List<ProcessServiceConfigurationEO> configList = new ArrayList<ProcessServiceConfigurationEO>();

		ProcessServiceConfigurationEO config1 = new ProcessServiceConfigurationEO();
		config1.setPrcsId(new Long(1));
		config1.setServiceId("formatter");
		config1.setConfigKey("schemamapping");
		config1.setComplexValue("<binding></binding>");
		config1.setServiceType("TdFormatterService");
		configList.add(config1);

		ProcessServiceConfigurationEO config2 = new ProcessServiceConfigurationEO();
		config2.setPrcsId(new Long(1));
		config2.setServiceId("dbParser");
		config2.setConfigKey("schemamapping");
		config2.setComplexValue("<binding></binding>");
		config2.setServiceType("DBParserService");
		configList.add(config2);

		ProcessServiceConfigurationEO config3 = new ProcessServiceConfigurationEO();
		config3.setPrcsId(new Long(1));
		config3.setServiceId("validator");
		config3.setConfigKey("schemamapping");
		config3.setComplexValue("<binding></binding>");
		config3.setServiceType("VadlidatorService");
		configList.add(config3);

		try {
			processConfigDAO.saveAllProcessConfigurations(configList);
		} catch (ProcessServiceException e) {
			fail("Failed while saving the list of saving configurations");
			e.printStackTrace();
		}
		// check size
		Assert
				.assertEquals(
						3,
						HibernateUtil
								.getRecordCount(SelectQueries.check_process_service_configuration_data));

	}

	public void testDeleteProcessConfigurations() {

		List<Object> processServiceConfigurationParamList1 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(1), "schemamapping",
						"<binding></binding>", "formatter",
						"TdFormatterService", null);
		List<Object> processServiceConfigurationParamList2 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(1), "schemamapping",
						"<binding></binding>", "dbParser", "DBParserService",
						null);
		List<Object> processServiceConfigurationParamList3 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(2), "schemamapping",
						"<binding></binding>", "validator",
						"VadlidatorService", null);
		List<Object> processServiceConfigurationParamList4 = InsertParamsGenerator
				.setProcessServiceConfigParams(new Long(2), "schemamapping",
						"<binding></binding>", "transformer",
						"TransformerService", null);

		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList1);
		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList2);
		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList3);
		HibernateUtil.insertData(
				InsertQueries.insert_process_service_configuration,
				processServiceConfigurationParamList4);

		// check size
		Assert
				.assertEquals(
						4,
						HibernateUtil
								.getRecordCount(SelectQueries.check_process_service_configuration_data));

		try {
			processConfigDAO.deleteProcessConfigurations(new Long(1));
		} catch (ProcessServiceException e) {
			fail("Failed while deleting process service configurations");
			e.printStackTrace();
		}

		// check size
		Assert
				.assertEquals(
						2,
						HibernateUtil
								.getRecordCount(SelectQueries.check_process_service_configuration_data));

	}

	public void onTearDown() {
		HibernateUtil
				.executeQuery(DropQueries.drop_process_service_configuration);
		HibernateUtil.shutDown();
	}
}
