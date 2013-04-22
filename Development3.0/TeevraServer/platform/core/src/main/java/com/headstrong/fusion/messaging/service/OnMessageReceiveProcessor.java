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
 * $Id: SystemInProcessor.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 30, 2009 
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
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;

/**
 * on the entry of the message into the teevra system this processor is
 * invoked.
 * 
 * 
 */
public class OnMessageReceiveProcessor implements Processor {

	/**
	 * Process context.
	 */
	private ProcessContext processContext;

	/**
	 * Message id generator.
	 */
	// private MessageIDGenerator messageIDGenerator;
	/**
	 * logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(OnMessageReceiveProcessor.class);

	/**
	 * Default constructor.
	 * 
	 * @param processContext
	 */
	public OnMessageReceiveProcessor(ProcessContext processContext) {
		this.processContext = processContext;
		// this.messageIDGenerator = this.getMessageIdGenerator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {

		logger.info("Processing message at savepoint");
		if (logger.isDebugEnabled()) {
			logger.debug("Message content is :" + exchange.getIn());
		}

		Message message = exchange.getIn();
		String msgId = null;
		MessageEventLogBean logBean = new MessageEventLogBean();
		
		String processRunId=null;
		String messageId=null;
		//
		// if (this.messageIDGenerator == null) {
		// this.messageIDGenerator = this.getMessageIdGenerator();
		// }
		// if (this.messageIDGenerator != null) {
		try {
			// msgId = this.messageIDGenerator
			// .getMessageID(this.processContext.getProcessRunId());
			// message.setHeader(FusionConstants.PROCESS_ID,
			// this.processContext.getProcessConfigurationModel()
			// .getProcess().getId());
			// set message id.
			// message.setHeader(FusionConstants.MESSAGE_ID, msgId);
			messageId = message.getHeader(FusionConstants.MESSAGE_ID)
			.toString();
			logBean.setMessageId(messageId);

			// set session id
			// String sessionId = this.processContext.getProcessRunId();
			// message.setHeader(FusionConstants.SESSION_ID, sessionId);
			processRunId = message.getHeader(FusionConstants.SESSION_ID)
			.toString();
			logBean.setSessionId(processRunId);
			
			//Added Process Run Id and Message Id to Log
			if (logger.isDebugEnabled()) {
				logger.debug("Tagging Process Run Id :" + processRunId +" and   Message Id :" + messageId+" with the FIXML");
			}

		} catch (Exception e) {
			logger.error("Error while generating message header", e);
			throw new FusionException(e);
			// }
		}
		// set savePoint. time.
		String savepointTime = FusionUtil.getCurrentSystemDate();
		logBean.setSavepointTime(savepointTime);

		logBean.setSavepointName(FusionConstants.DEFAULT_RECEIVED_SP_NAME);
		logBean.setLogMessage("Received Message ");
		EventLogger eventMsgLogger = EventLoggerFactory
				.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.MESSAGE_LOGGER);
		eventMsgLogger.log(logBean);
	}

	// /**
	// * @return message id generator.
	// */
	// private MessageIDGenerator getMessageIdGenerator() {
	// ServiceResolver<MessageIDGenerator> msgIdGenSerRsl = null;
	// msgIdGenSerRsl = new ServiceResolverImpl<MessageIDGenerator>(
	// this.processContext.getApplicationContext().getBundleContext());
	// MessageIDGenerator msgIdGen = null;
	// msgIdGen = msgIdGenSerRsl.getService(
	// MessageIDGenerator.class.getName(), 0);
	//		return msgIdGen;
}
