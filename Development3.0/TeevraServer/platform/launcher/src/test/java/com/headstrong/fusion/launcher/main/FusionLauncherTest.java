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
 * $Id: FusionLauncherTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 7, 2010 
 */

package com.headstrong.fusion.launcher.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.headstrong.fusion.launcher.Environment;

/**
 * Fusion Launcher Unit Test class.
 */
public class FusionLauncherTest {

	/**
	 * Test the default values of environment if not explicitly set.
	 */
	@Test
	public void environmentSettingDefaultValues() {
		// 
		FusionLauncher.initEnvironment();
		assertEquals(Environment.DEFAULT_CONF_DIR, Environment.CONF_DIR);
		assertEquals(Environment.DEFAULT_LIB_DIR, Environment.LIB_DIR);
		assertEquals(Environment.DEFAULT_LOG_FILE, Environment.LOG_FILE);
		assertEquals(Environment.DEFAULT_PROPERTIES_FILE,
				Environment.PROPERTIES_FILE);
	}

	/**
	 * Test the values of environment if explicitly set.
	 */
	@Test
	public void environmentSettingValues() {
		// set the properties
		System.setProperty(Environment.LIB_DIR_PROP, "/lib/test");
		System.setProperty(Environment.CONF_DIR_PROP, "/conf/test");
		System.setProperty(Environment.PROPERTIES_FILE_PROP,
				"teevra.properties");
		System.setProperty(Environment.LOG_FILE_PROP, "teevra.log");
		// 
		FusionLauncher.initEnvironment();
		assertEquals("/conf/test", Environment.CONF_DIR);
		assertEquals("/lib/test", Environment.LIB_DIR);
		assertEquals("teevra.log", Environment.LOG_FILE);
		assertEquals("teevra.properties", Environment.PROPERTIES_FILE);
	}
}
