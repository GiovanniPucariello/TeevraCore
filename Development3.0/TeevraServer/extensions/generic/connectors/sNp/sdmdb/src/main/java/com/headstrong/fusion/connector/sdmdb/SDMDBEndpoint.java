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
 * $Id: SDMDBEndpoint.java
 * $Revision:
 * $Author:
 * $DateTime:
 */

package com.headstrong.fusion.connector.sdmdb;

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
public class SDMDBEndpoint implements FusionEndpoint<MessageExchange> {

	private SDMDBConfiguration sdmDBBinding;
	private String insertQuery;
	private String delQuery;
	private String delPkStr;
	private JdbcTemplate jdbcTemplate;


	public SDMDBEndpoint(SDMDBConfiguration sdmDBBinding) {
		this.sdmDBBinding = sdmDBBinding;


	}

	public SDMDBEndpoint(Map<String, String> properties) {
		this.sdmDBBinding = new SDMDBConfiguration(properties);
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		SDMDBConsumer sdbconsumer = new SDMDBConsumer(this);
		return sdbconsumer;
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
		return "sdmdb";
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
		SDMDBProducer producer = new SDMDBProducer(this);
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
	 * @return the sdmDBBinding
	 */
	public SDMDBConfiguration getSDMDBBinding() {
		return sdmDBBinding;
	}

	/**
	 * @param condDBBinding the sdmDBBinding to set
	 */
	public void setSDMBinding(SDMDBConfiguration sdmDBBinding) {
		this.sdmDBBinding = sdmDBBinding;
	}
}
