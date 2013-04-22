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
 * $Id: IBMMQComponentActivatorTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 14, 2010 
 */

package com.headstrong.fusion.connector.ibm.mq.config.activator;

import org.junit.Test;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.connector.ibm.mq.IBMMQComponent;
import com.headstrong.fusion.connector.ibm.mq.activator.IBMMQComponentActivator;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * {@link IBMMQComponentActivator} unit test class.
 */
public class IBMMQComponentActivatorTest {

	@Test
	public void start() throws Exception {
		IBMMQComponentActivator activator = new IBMMQComponentActivator();
		activator.start(null);
		assertNotNull(FusionComponentFactory.getComponent(IBMMQComponent.class
				.getSimpleName()));
	}

	@Test
	public void stop() throws Exception {
		IBMMQComponentActivator activator = new IBMMQComponentActivator();
		activator.stop(null);
		assertNull(FusionComponentFactory.getComponent(IBMMQComponent.class
				.getSimpleName()));
	}
}
