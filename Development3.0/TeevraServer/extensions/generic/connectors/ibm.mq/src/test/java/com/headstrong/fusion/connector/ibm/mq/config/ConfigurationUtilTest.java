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
 * $Id: ConfigurationUtilTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 14, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.config;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.connector.ibm.mq.config.ConfigurationUtil.Config;

/**
 * {@link ConfigurationUtil} unit test class.
 */
public class ConfigurationUtilTest {

	@Test
	public void getConfig() throws Exception {
		BindingConfig config = createMock(BindingConfig.class);
		expect(config.getProperty(Config.brokerUrl.toString())).andReturn(
				"brokerURL");
		replay(config);
		String borkerUrl = ConfigurationUtil
				.getConfig(config, Config.brokerUrl);
		assertEquals("brokerURL", borkerUrl);
		verify(config);
	}

	@Test
	public void getConfigNoProperty() throws Exception {
		BindingConfig config = createMock(BindingConfig.class);
		expect(config.getProperty(Config.brokerUrl.toString())).andReturn(null);
		replay(config);
		try {
			ConfigurationUtil.getConfig(config, Config.brokerUrl);
		} catch (ConfigNotFoundException e) {
			verify(config);
			return;
		}
		fail();
	}

	@Test
	public void getConfigDefaultValue() throws Exception {
		BindingConfig config = createMock(BindingConfig.class);
		expect(config.getProperty(Config.sslFipsRequired.toString()))
				.andReturn(null);
		replay(config);
		boolean value = Boolean.parseBoolean(ConfigurationUtil.getConfig(
				config, Config.sslFipsRequired, true));
		assertEquals(false, value);
	}

}
