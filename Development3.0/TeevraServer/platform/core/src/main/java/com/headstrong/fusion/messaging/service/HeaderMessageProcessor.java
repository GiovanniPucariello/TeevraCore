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
import com.headstrong.fusion.commons.MessageIDGenerator;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.commons.resolver.ServiceResolverImpl;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public class HeaderMessageProcessor implements Processor {

	/**
	 * logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(HeaderMessageProcessor.class);

	/**
	 * Process context.
	 */
	private ProcessContext processContext;
	/**
	 * Message id generator.
	 */
	private MessageIDGenerator messageIDGenerator;

	public HeaderMessageProcessor(ProcessContext processContext) {
		this.processContext = processContext;
		this.messageIDGenerator = this.getMessageIdGenerator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		Message message = exchange.getIn();

		String msgId = null;
		if (this.messageIDGenerator != null) {
			try {
				msgId = this.messageIDGenerator
						.getMessageID(this.processContext.getProcessRunId());
			} catch (Exception e) {
				logger.error("Error while generating message header", e);
				throw new FusionException(e);
			}
		}
		message.setHeader(FusionConstants.PROCESS_ID, this.processContext
				.getProcessConfigurationModel().getProcess().getId());
		// set message id.
		message.setHeader(FusionConstants.MESSAGE_ID, msgId);

		// set session id
		String sessionId = this.processContext.getProcessRunId();
		message.setHeader(FusionConstants.SESSION_ID, sessionId);

	}

	/**
	 * @return message id generator.
	 */
	private MessageIDGenerator getMessageIdGenerator() {
		ServiceResolver<MessageIDGenerator> msgIdGenSerRsl = null;
		msgIdGenSerRsl = new ServiceResolverImpl<MessageIDGenerator>(
				this.processContext.getApplicationContext().getBundleContext());
		MessageIDGenerator msgIdGen = null;
		msgIdGen = msgIdGenSerRsl.getService(
				MessageIDGenerator.class.getName(), 0);
		return msgIdGen;
	}

}
