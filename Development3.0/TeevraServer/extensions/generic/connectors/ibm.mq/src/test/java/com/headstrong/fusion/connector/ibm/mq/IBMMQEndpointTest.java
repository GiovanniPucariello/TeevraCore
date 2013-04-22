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
 * $Id: IBMMQEndpointTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 13, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq;

import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;

/**
 * {@link IBMMQEndpoint} unit test class.
 */
public class IBMMQEndpointTest {

	/**
	 * Test {@link IBMMQEndpoint}{@link #getEndpointURI()} method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void getEndpointURI() throws Exception {
		BindingConfig bindingConfig = createMock(BindingConfig.class);
		IBMMQEndpoint endpoint = new IBMMQEndpoint(bindingConfig, null);
		String uri = IBMMQEndpoint.IBM_MQ + endpoint.hashCode();
		assertEquals(uri, endpoint.getEndpointUri());
	}

	/**
	 * Test {@link IBMMQEndpoint}{@link #isSingleton()} method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void isSingleton() throws Exception {
		BindingConfig bindingConfig = createMock(BindingConfig.class);
		IBMMQEndpoint endpoint = new IBMMQEndpoint(bindingConfig, null);
		assertEquals(false, endpoint.isSingleton());
	}

	/**
	 * Test {@link IBMMQEndpoint}{@link #createExchange()} method.
	 * 
	 * @throws Exception
	 */
	@Test
	public void createMessageExchange() throws Exception {
		BindingConfig bindingConfig = createMock(BindingConfig.class);
		IBMMQEndpoint endpoint = new IBMMQEndpoint(bindingConfig, null);
		if (!(endpoint.createExchange() instanceof MessageExchange)) {
			fail();
		}
	}

}
