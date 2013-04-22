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
 * $Id: ErrorCompEventLogger.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jul 5, 2010 
 */

package com.headstrong.fusion.messaging.service;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLoggerFactory;

/**
 * 
 */
public class ErrorCompEventLogger implements Processor {

	/**
	 * Logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(ErrorCompEventLogger.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("Logging error message at comp level");
		if (logger.isDebugEnabled()) {
			logger.debug("Message content is :" + exchange.getIn());
		}
		
		Message message = exchange.getIn();
		
		try{
			if (logger.isDebugEnabled()) {
				logger.debug("Tagging Process Run Id :" + message.getHeader(FusionConstants.SESSION_ID) +"and   Message Id :" + message.getHeader(FusionConstants.MESSAGE_ID)+" with the FIXML");
			}
		}catch (Exception e) {
			logger.error("Error while generating message header", e);
			throw new FusionException(e);
		}
		EventLogger eventMsgLogger = EventLoggerFactory
				.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.COMPONENT_LOGGER);

		eventMsgLogger.log(createEventLogBean(exchange.getIn().getHeaders()));

	}

	private EventLogBean createEventLogBean(Map<String, Object> headers) {
		ComponentEventLogBean logBean = new ComponentEventLogBean();
		logBean.setSessionId((String) headers.get(FusionConstants.SESSION_ID));
		logBean.setMessageId((String) headers.get(FusionConstants.MESSAGE_ID));
		logBean.setSavepointName((String) headers
				.get(FusionConstants.SAVEPOINT_NAME));
		logBean.setSavepointTime((String) headers
				.get(FusionConstants.SAVEPOINT_TIME));

		logBean
				.setLogMessage(headers.containsKey(FusionConstants.LOG_MESSAGE) ? headers
						.get(FusionConstants.LOG_MESSAGE).toString()
						: new String());

		return logBean;

	}
}
