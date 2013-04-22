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
 * $Id: HeaderMessageProcessor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 9, 2010 
 */

package com.headstrong.fusion.messaging.service;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.core.FusionActivator;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public class FirstMessageDelayProcessor implements Processor {

	/**
	 * logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(FirstMessageDelayProcessor.class);

	/**
	 * Process context.
	 */
	private ProcessContext processContext;
	
	private int firstMsgDelay;

	public FirstMessageDelayProcessor(ProcessContext processContext) {
		this.processContext = processContext;
		this.firstMsgDelay = firstMsgDelay;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		Message message = exchange.getIn();

		String msgId = (String)message.getHeader(FusionConstants.MESSAGE_ID);
		// set message id.
		if(msgId.trim().equalsIgnoreCase("1"))
		{
			try
			{
			logger.info ("Thread waiting for "+FusionActivator.FIRST_MSG_DELAY_VAL+" seconds to delay the first message");
			Thread.sleep(FusionActivator.FIRST_MSG_DELAY_VAL);
			logger.info ("Thread wait over for first message");
			}
			 catch (InterruptedException e) {
					logger.error("Error occurred while delaying the first message.");
				}
		}

	}


}
