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
 * $Id: HttpReceiverEndpoint.java
 * $Revision: 
 * $Author: mali
 * 
 */

package com.headstrong.fusion.connector.http.receiver;

import java.util.Map;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 *  
 * @author mali
 *
 */
public class HttpReceiverEndpoint implements FusionEndpoint<MessageExchange> {

	private static final String HTTP_STR = "HttpReceiver";
	
	private BundleContext context;
	
	private HttpReceiverConfiguration httpConfiguration;
	
	public HttpReceiverEndpoint(HttpReceiverConfiguration amqBinding) {
		this.httpConfiguration = amqBinding;
	}
	
	public HttpReceiverEndpoint(Map<String, String> properties, BundleContext context) {
		this.httpConfiguration = new HttpReceiverConfiguration(properties);
		this.context = context;
	}
	
	public HttpReceiverEndpoint(Map<String, String> properties) {
		this.httpConfiguration = new HttpReceiverConfiguration(properties);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		HttpConsumer consumer = new HttpConsumer(this,fusionProcessor);
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
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	public String getEndpointUri() {
		return HTTP_STR;
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
	 * @return the httpReceiverBinding
	 */
	public HttpReceiverConfiguration gethttpReceiverBinding() {
		return httpConfiguration;
	}

	/**
	 * @param httpReceiverBinding the httpReceiverBinding to set
	 */
	public void sethttpReceiverBinding(HttpReceiverConfiguration httpReceiverBinding) {
		this.httpConfiguration = httpReceiverBinding;
	}

	@Override
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
	return null;
	}

	public BundleContext getContext() {
		return context;
	}

	public void setContext(BundleContext context) {
		this.context = context;
	}
}
