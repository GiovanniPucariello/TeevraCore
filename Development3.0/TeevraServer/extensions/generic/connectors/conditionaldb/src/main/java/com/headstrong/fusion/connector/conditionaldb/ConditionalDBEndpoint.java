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
 * $Id: ConditionalDBEndpoint.java
 * $Revision: 
 * $Author: 
 * $DateTime: 
 */

package com.headstrong.fusion.connector.conditionaldb;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 * 
 */
public class ConditionalDBEndpoint implements FusionEndpoint<MessageExchange> {

	private ConditionalDBConfiguration condDBBinding;
	private String insertQuery;
	private String delQuery;
	private String delPkStr;
	private JdbcTemplate jdbcTemplate;
	
	
	public ConditionalDBEndpoint(ConditionalDBConfiguration condDBBinding) {
		this.condDBBinding = condDBBinding;
		
		
	}
	
	public ConditionalDBEndpoint(Map<String, String> properties) {
		this.condDBBinding = new ConditionalDBConfiguration(properties);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		ConditionalDBConsumer consumer = new ConditionalDBConsumer(this);
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

	public String getEndpointUri() {
		return "conditionaldb";
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
		ConditionalDBProducer producer = new ConditionalDBProducer(this);
		return producer;
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
	 * @return the conditionalDBBinding
	 */
	public ConditionalDBConfiguration getconditionalDBBinding() {
		return condDBBinding;
	}

	/**
	 * @param condDBBinding the conditionalDBBinding to set
	 */
	public void setCondDBBinding(ConditionalDBConfiguration condDBBinding) {
		this.condDBBinding = condDBBinding;
	}
}
