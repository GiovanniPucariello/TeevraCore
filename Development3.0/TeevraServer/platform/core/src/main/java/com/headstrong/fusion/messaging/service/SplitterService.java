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
 * $Id: SplitterService.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 16, 2008 
 */

package com.headstrong.fusion.messaging.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.config.SplitterConfig;

/**
 * Splits the message based on the splitting strategy specified.
 */
public class SplitterService implements Processor {

	private static final Logger logger = LoggerFactory
			.getLogger(SplitterService.class);
	/**
	 * Splitter configuration.
	 */
	private SplitterConfig splitterConfig;
	/**
	 * Splitter.
	 */
	private Splitter splitter;

	/**
	 * @param splitterConfig
	 */
	public SplitterService(SplitterConfig splitterConfig) {
		this.splitterConfig = splitterConfig;
		if (splitterConfig.getSplitterStrategy() == null) {
			logger.error("No splitter strategy specified. "
					+ "Default splitting would take place.");
		} else {
			splitter = SplitterFactory.getSplitter(splitterConfig
					.getSplitterStrategy().getClass().getName());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	public void process(Exchange exchange) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Splitting message : " + exchange.getIn().getBody());
		}
		if (splitter != null) {
			Object input = exchange.getIn().getBody();
			if (input == null) {
				// Ignoring the Error.
				logger.error("Empty message payload for splitter.");
			} else {
				exchange.getIn().setBody(
						splitter.split(exchange.getIn().getBody(),
								splitterConfig.getSplitterStrategy()));
			}
		}
	}
}
