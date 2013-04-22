/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: TestComponent.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.connector.test;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * 
 */
public class TestComponent implements FusionComponent {

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		TestEndPoint testEndPoint = new TestEndPoint(bindingConfig);
		return testEndPoint;
	}
}
