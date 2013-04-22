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
 * $Id: QpidEndpoint.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid;

import java.util.Map;

import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.connector.qpid.config.QpidConfiguration;

/**
 * Qpid Endpoint
 */
public class QpidEndpoint implements FusionEndpoint<MessageExchange> {

	/**
	 * Qpid Configuration
	 */
	private QpidConfiguration qpidConfiguration;

	/**
	 * Constructor
	 * 
	 * @param qpidConfiguration
	 *            Configuration.
	 */
	public QpidEndpoint(QpidConfiguration qpidConfiguration) {
		this.qpidConfiguration = qpidConfiguration;
	}

	/**
	 * Constructor
	 * 
	 * @param properties
	 *            Configuration properties.
	 */
	public QpidEndpoint(Map<String, String> properties)
			throws InitializationException {
		this.qpidConfiguration = new QpidConfiguration(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		QpidConsumer consumer = new QpidConsumer(this, fusionProcessor);
		return consumer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createExchange()
	 */
	public MessageExchange createExchange() {
		return new FusionMessageExchange();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createMessageExchange(com.headstrong.fusion.commons.MessageExchange)
	 */
	public MessageExchange createMessageExchange(MessageExchange exchange) {
		return exchange.copy();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createPollingConsumer()
	 */
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		QpidProducer producer = new QpidProducer(this);
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
	 * @return the qpidConfiguration
	 */
	public QpidConfiguration getQpidConfiguration() {
		return qpidConfiguration;
	}

	/**
	 * @param qpidConfiguration
	 *            the qpidConfiguration to set
	 */
	public void setQpidBinding(QpidConfiguration qpidConfiguration) {
		this.qpidConfiguration = qpidConfiguration;
	}
}
