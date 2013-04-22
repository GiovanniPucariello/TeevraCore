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
 * $Id: OnCompMessageDeliveryProcessor.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 29, 2010 
 */

package com.headstrong.fusion.messaging.service;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.util.FusionUtil;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;

/**
 * on exit of the message from a teevra component this processor is invoked.
 */
public class OnCompMessageDeliveryProcessor implements Processor {

	/**
	 * logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(OnCompMessageDeliveryProcessor.class);

	/**
	 * Process context.
	 */
	private ProcessContext processContext;

	/**
	 * Component
	 */
	private String endpointId;

	/**
	 * Default constructor.
	 * 
	 * @param processContext
	 */
	public OnCompMessageDeliveryProcessor(ProcessContext processContext,
			String endpointId) {
		this.processContext = processContext;
		this.endpointId = endpointId;
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

		ComponentEventLogBean logBean = new ComponentEventLogBean();
		
		String processRunId=null;
		String messageId=null;

		try {
			// set message id.
			messageId = message.getHeader(FusionConstants.MESSAGE_ID)
			.toString();
			logBean.setMessageId(messageId);

			// set session id
			processRunId = message.getHeader(FusionConstants.SESSION_ID)
			.toString();
			logBean.setSessionId(processRunId);
			
			//Added Process Run Id and Message Id to Log
			if (logger.isDebugEnabled()) {
				logger.debug("Tagging Process Run Id :" + processRunId +" and   Message Id :" + messageId+" with the FIXML");
			}
			
			// set comp id
			logBean.setCompId(endpointId);

			// set savePoint. time.
			logBean.setSavepointTime(FusionUtil.getCurrentSystemDate());

			// set savePoint name
			logBean.setSavepointName(FusionConstants.DEFAULT_END_SP_NAME);

		} catch (Exception e) {
			logger.error("Error while generating message header", e);
			throw new FusionException(e);
		}
		logBean.setLogMessage("Message Processed ");
		EventLogger eventMsgLogger = EventLoggerFactory
				.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.COMPONENT_LOGGER);
		eventMsgLogger.log(logBean);
	}

}
