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
 * $Id: IBMMQComponentTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 13, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq;

import static org.easymock.EasyMock.createMock;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * Unit test class for {@link IBMMQComponent}
 */
public class IBMMQComponentTest {

	@Test
	public void createEndPoint() throws Exception {
		IBMMQComponent component = new IBMMQComponent(null);
		//
		BindingConfig bindingConfig = createMock(BindingConfig.class);
		FusionEndpoint<MessageExchange> endPoint = component
				.createEndpoint(bindingConfig);
		assertNotNull(endPoint);
	}
}
