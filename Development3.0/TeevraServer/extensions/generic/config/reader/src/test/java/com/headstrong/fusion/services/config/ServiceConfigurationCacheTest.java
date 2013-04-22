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
 * $Id: ServiceConfigurationCacheTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 30, 2008
 */

package com.headstrong.fusion.services.config;

import com.headstrong.fusion.services.config.exception.ServiceConfigurationNotFoundException;
import com.headstrong.fusion.services.config.vo.ServiceConfiguration;

import junit.framework.TestCase;

/**
 * 
 */
public class ServiceConfigurationCacheTest extends TestCase {

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	public void testGetServiceConfigurationNullCheck() {
		ServiceConfigurationCache cache = ServiceConfigurationCache.getInstance();
		try {
			Object configuration = cache.getPropertyConfiguration(null);
		} catch (ServiceConfigurationNotFoundException e) {
			// if the exception is thrown the test case is passed.
			return;
		}
		
		// in case the exception is not thrown test case is failed.
		fail();
	}
	public void testGetServiceConfiguration() {
		ServiceConfigurationCache cache = ServiceConfigurationCache.getInstance();
		ServiceConfiguration conf = new ServiceConfiguration();
		
		cache.addPropertyConfiguration(conf, "configuration");
		try {
			String configuration = (String) cache.getPropertyConfiguration(conf);
			if ( configuration == null ) {
				fail("Configuration not found");
			}
		} catch (ServiceConfigurationNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Configuration not found");
		}
		
	}
	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
	}
}
