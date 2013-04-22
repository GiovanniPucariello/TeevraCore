/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: FusionConfigurationBuilderTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.config.builder;

import static org.easymock.EasyMock.expect;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.headstrong.fusion.FusionTest;
import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.config.Configuration;
import com.headstrong.fusion.config.ProcessConfiguration;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.config.manager.ClusteredConfigurationManager;
import com.headstrong.fusion.config.manager.ConfigurationManager;
import com.headstrong.fusion.failover.AdminService;
import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.config.CacheReloadScheduleConfiguration;

/**
 * 
 */
public class FusionConfigurationManagerTest extends FusionTest {
	File fileMapping = new File(
			"src/main/resources/ConfigurationSchema.xml");

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test checks if the {@link ProcessConfigurationModel} is being generated.
	 * Test XML
	 * 
	 * @precondition
	 * @postcondition
	 */
	public void testMarshal() {

		// Test XML
		try {
			// setup the behavior
			expect(bundleMock.getEntry("ConfigurationSchema.xml"))
					.andReturn(fileMapping.toURL()).anyTimes();
			expect(
					bundleContextMock.getServiceReference(AdminService.class
							.getName())).andReturn(null).anyTimes();
			super.replayCommonBehavior();

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
			fail();
		}
		try {
			Configuration configuration = new Configuration();
			ProcessConfiguration process = new ProcessConfiguration();
			process.setId("process_1");
			process.setId("process_1");

			ProcessSchedule schedule = new ProcessSchedule();
			schedule.setId("schedule1");
			schedule.setProcessId("process_1");
			schedule.setScheduleStartTime(new Date());
			schedule.setScheduleStopTime(new Date());
			schedule.setCronExpression("xyz");
			process.setSchedule(schedule);
			List<ProcessConfiguration> processes = new ArrayList<ProcessConfiguration>();
			processes.add(process);
			configuration.setProcesses(processes);
			
			CacheReloadScheduleConfiguration cacheReloadScheduleConf = new CacheReloadScheduleConfiguration();
			cacheReloadScheduleConf.setCacheName("cache1");
			CacheReloadSchedule cacheSchedule = new CacheReloadSchedule();
			cacheSchedule.setCacheName("cache1");
			cacheSchedule.setScheduleStartTime(new Date());
			cacheSchedule.setScheduleStopTime(new Date());
			cacheSchedule.setCronExpression("xyz");
			
			cacheReloadScheduleConf.setSchedule(cacheSchedule);
			List<CacheReloadScheduleConfiguration> cacheReloadScheduleConfs = new ArrayList<CacheReloadScheduleConfiguration>();
			cacheReloadScheduleConfs.add(cacheReloadScheduleConf);
			configuration.setCacheReloadConfigurations(cacheReloadScheduleConfs);
			ClusteredConfigurationManager configurationManager = new ClusteredConfigurationManager(
					bundleContextMock);
			configurationManager.setConfiguration(configuration);
			configurationManager.persist();

		} catch (ConfigurationException e) {
			e.printStackTrace();
			fail();
		}
	}

	public void testGetFusionConfiguration() {

		// Test XML
		try {
			// setup the behavior
			expect(bundleMock.getEntry("ConfigurationSchema.xml"))
					.andReturn(fileMapping.toURL()).anyTimes();
			expect(
					bundleContextMock.getServiceReference(AdminService.class
							.getName())).andReturn(null).anyTimes();
			super.replayCommonBehavior();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
			fail();
		}
		try {
			ConfigurationManager configurationManager = new ClusteredConfigurationManager(
					bundleContextMock);

			configurationManager.refresh();
			Configuration configuration = configurationManager
					.getConfiguration();

		} catch (ConfigurationException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
