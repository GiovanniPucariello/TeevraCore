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
 * $Id: FileSplitterComponentTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.connector.filesplitter;

import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.DefaultApplicationContext;
import com.headstrong.fusion.core.commons.DefaultBindingConfig;

/**
 * 
 */
public class FileSplitterComponentTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void createEndPoint() throws Exception {
		FileSplitterComponent component = new FileSplitterComponent();

		BundleContext contextMock = createMock(BundleContext.class);
		ApplicationContext applicationContext = DefaultApplicationContext.getInstance(
				contextMock);

		ProcessConfigurationModel processConfigurationModel = new ProcessConfigurationModel();
		CamelProcessContext processContext = new CamelProcessContext(
				applicationContext, processConfigurationModel);

		Map<String, String> properties = new HashMap<String, String>();
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		DefaultBindingConfig bindingConfig = new DefaultBindingConfig(
				processContext, "1", "1", properties, onErrorConfigList);

		FusionEndpoint<MessageExchange> endPoint = component
				.createEndpoint(bindingConfig);
		assertNotNull(endPoint);
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
