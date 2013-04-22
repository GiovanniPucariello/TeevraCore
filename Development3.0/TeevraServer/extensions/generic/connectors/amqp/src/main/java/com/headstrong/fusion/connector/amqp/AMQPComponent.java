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
 * $Id: AMQPComponent.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 16, 2009 
 */

package com.headstrong.fusion.connector.amqp;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * Connects to AMQP clients. Currently only supports Rabbit MQ client.
 */
public class AMQPComponent implements FusionComponent {

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		AMQPEndpoint amqpEndpoint = new AMQPEndpoint(bindingConfig
				.getProperties());
		return amqpEndpoint;
	}

}
