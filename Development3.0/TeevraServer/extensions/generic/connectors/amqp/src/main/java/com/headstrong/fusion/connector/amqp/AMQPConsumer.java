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
 * $Id: AMQPConsumer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 16, 2009 
 */

package com.headstrong.fusion.connector.amqp;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * 
 */
public class AMQPConsumer implements FusionConsumer<MessageExchange> {
	
	FusionServiceSupport serviceSupport;
	
	private AMQPEndpoint amEndpoint;
	public AMQPConsumer(AMQPEndpoint amqpEndpoint) {
		this.amEndpoint = amqpEndpoint;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	public void start() throws Exception {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {
	}
	
	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport=serviceSupport;
		
	}

}
