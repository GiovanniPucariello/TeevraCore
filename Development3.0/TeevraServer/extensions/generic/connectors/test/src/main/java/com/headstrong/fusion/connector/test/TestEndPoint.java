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
 * $Id: TestEndPoint.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.connector.test;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 * 
 */
public class TestEndPoint implements FusionEndpoint<MessageExchange> {

	private BindingConfig bindingConfig;

	public TestEndPoint(BindingConfig bindingConfig) {
		this.bindingConfig = bindingConfig;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	@Override
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		TestConsumer testConsumer = new TestConsumer(this, fusionProcessor);
		return testConsumer;
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
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	@Override
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		return new TestProducer(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	@Override
	public String getEndpointUri() {
		return "test";
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
	 * @return the bindingConfig
	 */
	public BindingConfig getBindingConfig() {
		return bindingConfig;
	}

	/**
	 * @param bindingConfig the bindingConfig to set
	 */
	public void setBindingConfig(BindingConfig bindingConfig) {
		this.bindingConfig = bindingConfig;
	}

}
