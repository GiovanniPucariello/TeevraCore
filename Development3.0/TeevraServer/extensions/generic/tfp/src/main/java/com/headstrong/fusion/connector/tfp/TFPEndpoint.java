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
 * $Id: TFPEndpoint.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.tfp;

import java.util.Map;

import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.connector.tfp.config.TFPConfiguration;

/**
 * TFP Endpoint.
 */
public class TFPEndpoint implements FusionEndpoint<MessageExchange> {

	/**
	 * The TFP string.
	 */
	private static final String TFP_STR = "tfp";

	/**
	 * TFP Endpoint configuration.
	 */
	private TFPConfiguration tfpConfiguration;

	/**
	 * @param configuration TFP Endpoint configuration.
	 */
	public TFPEndpoint(TFPConfiguration configuration) {
		this.tfpConfiguration = configuration;
	}

	/**
	 * Constructs TFP Endpoint. with the given configurations
	 * @param properties 
	 */
	public TFPEndpoint(Map<String, String> properties) throws Exception {
		this.tfpConfiguration = new TFPConfiguration(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	@Override
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		TFPConsumer consumer = new TFPConsumer(this, fusionProcessor);
		return consumer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createExchange()
	 */
	@Override
	public MessageExchange createExchange() {
		return new FusionMessageExchange();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createMessageExchange(com.headstrong.fusion.commons.MessageExchange)
	 */
	@Override
	public MessageExchange createMessageExchange(MessageExchange exchange) {
		return exchange.copy();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createPollingConsumer()
	 */
	@Override
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	@Override
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	@Override
	public String getEndpointUri() {
		return TFP_STR ;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		return false;
	}

	/**
	 * @return the tfpConfiguration
	 */
	public TFPConfiguration getTfpConfiguration() {
		return tfpConfiguration;
	}

	/**
	 * @param tfpConfiguration
	 *            the tfpConfiguration to set
	 */
	public void setTfpConfiguration(TFPConfiguration tfpConfiguration) {
		this.tfpConfiguration = tfpConfiguration;
	}

}
