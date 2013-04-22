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
 * $Id: ConditionalDBComponent.java
 * $Revision: 
 * $Author: 
 * $DateTime: 
 */

package com.headstrong.fusion.connector.secdef;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * 
 */
public class SecDefComponent implements FusionComponent {

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		SecDefEndpoint secDefEndpoint = new SecDefEndpoint(bindingConfig
				.getProperties());
		return secDefEndpoint;
	}

}
