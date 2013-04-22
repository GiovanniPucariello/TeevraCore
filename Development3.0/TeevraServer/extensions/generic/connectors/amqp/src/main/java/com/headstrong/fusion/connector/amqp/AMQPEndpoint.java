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
 * $Id: AMQPEndpoint.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 16, 2009 
 */

package com.headstrong.fusion.connector.amqp;

import java.util.Map;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 * 
 */
public class AMQPEndpoint implements FusionEndpoint<MessageExchange> {

	private AMQPConfiguration amqpBinding;
	
	public AMQPEndpoint(AMQPConfiguration amqBinding) {
		this.amqpBinding = amqBinding;
	}
	
	public AMQPEndpoint(Map<String, String> properties) {
		this.amqpBinding = new AMQPConfiguration(properties);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		AMQPConsumer consumer = new AMQPConsumer(this);
		return consumer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createExchange()
	 */
	public MessageExchange createExchange() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createMessageExchange(com.headstrong.fusion.commons.MessageExchange)
	 */
	public MessageExchange createMessageExchange(MessageExchange exchange) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createPollingConsumer()
	 */
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		AMQPProducer producer = new AMQPProducer(this);
		return producer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	public String getEndpointUri() {
		return "amqp";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#isSingleton()
	 */
	public boolean isSingleton() {
		return false;
	}

	/**
	 * @return the amqpBinding
	 */
	public AMQPConfiguration getAmqpBinding() {
		return amqpBinding;
	}

	/**
	 * @param amqpBinding the amqpBinding to set
	 */
	public void setAmqpBinding(AMQPConfiguration amqpBinding) {
		this.amqpBinding = amqpBinding;
	}
}
