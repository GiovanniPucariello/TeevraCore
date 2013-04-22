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
 * $Id: FileSplitterEndpoint.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.filesplitter;

import java.util.Map;

import com.headstrong.fusion.commons.FusionMessageExchange;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.connector.filesplitter.config.FileSplitterConfiguration;

/**
 * File SPlitter Endpoint
 */
public class FileSplitterEndpoint implements FusionEndpoint<MessageExchange> {

	protected static final String FILE_SPLITTER = "FileSplitter";
	/**
	 * File Splitter Configuration
	 */
	private FileSplitterConfiguration fileSplitterBinding;

	/**
	 * Constructs FileSplitterEndpoint with the given FileSplitterConfiguration
	 * 
	 * @param configuration
	 */
	public FileSplitterEndpoint(FileSplitterConfiguration configuration) {
		this.fileSplitterBinding = configuration;
	}

	/**
	 * Constructs FileSplitterEndpoint with the given configurations
	 * 
	 * @param properties
	 */
	public FileSplitterEndpoint(Map<String, String> properties) {
		this.fileSplitterBinding = new FileSplitterConfiguration(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	@Override
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		FileSplitterConsumer consumer = new FileSplitterConsumer(this,
				fusionProcessor);
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
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	@Override
	public String getEndpointUri() {
		return FILE_SPLITTER + hashCode();
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
	 * @return the fileSplitterBinding
	 */
	public FileSplitterConfiguration getFileSplitterBinding() {
		return fileSplitterBinding;
	}

	/**
	 * @param fileSplitterBinding
	 *            the fileSplitterBinding to set
	 */
	public void setFileSplitterBinding(
			FileSplitterConfiguration fileSplitterBinding) {
		this.fileSplitterBinding = fileSplitterBinding;
	}

}
