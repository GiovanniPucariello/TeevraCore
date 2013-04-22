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
 * $Id: SavePointService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 7, 2008 
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
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.ProcessContext;

/**
 * SavePoint Service would be added as part of the Default initial SavePoint. It
 * sets the header of the message received.
 * 
 */
public class SavePointProcessor implements Processor {

	private static Logger logger = LoggerFactory
			.getLogger(SavePointProcessor.class);
	private ApplicationContext appCtx;
	private String processId;
	private String savePointName;

	/**
	 * @param applicationContext
	 * @param processId
	 * @param savePointName
	 */
	public SavePointProcessor(ApplicationContext applicationContext,
			String processId, String savePointName) {
		this.appCtx = applicationContext;
		this.processId = processId;
		this.savePointName = savePointName;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	public void process(Exchange exchange) throws Exception {

		Message msg = exchange.getIn();

		if (savePointName != null) {

			// If this is default start savepoint.
			if (FusionConstants.DEFAULT_RECEIVED_SP_NAME.equals(savePointName)) {
				setMessageHeaders(msg);
				msg.setHeader(FusionConstants.LOG_MESSAGE, "Received Message ");

			} else if (FusionConstants.DEFAULT_END_SP_NAME
					.equals(savePointName)) {
				msg.setHeader(FusionConstants.LOG_MESSAGE,
						"Message sent successfully ");
			} else {
				// For Named savepoint
				msg.setHeader(FusionConstants.LOG_MESSAGE, "Message Processed");
			}
		}
		msg.setHeader(FusionConstants.SAVEPOINT_TIME, FusionUtil.getCurrentSystemDate());
		msg.setHeader(FusionConstants.SAVEPOINT_NAME, savePointName);

	}

	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @param msg
	 * @throws FusionException
	 */
	private void setMessageHeaders(Message msg) throws FusionException {
		ServiceResolver<MessageIDGenerator> msgIdGenSerRsl = null;
		msgIdGenSerRsl = new ServiceResolverImpl<MessageIDGenerator>(appCtx
				.getBundleContext());
		MessageIDGenerator msgIdGen = null;
		msgIdGen = msgIdGenSerRsl.getService(
				MessageIDGenerator.class.getName(), 0);
		String msgId = null;

		if (msgIdGen != null) {
			ProcessContext prcsCtx;
			try {
				prcsCtx = appCtx.getProcessContext(processId);
				msgId = msgIdGen.getMessageID(prcsCtx.getProcessRunId());
				msg.setHeader(FusionConstants.PROCESS_ID, processId);
				msg.setHeader(FusionConstants.SESSION_ID, prcsCtx
						.getProcessRunId());
				msg.setHeader(FusionConstants.MESSAGE_ID, msgId);
				msg.setHeader(FusionConstants.SAVEPOINT_NAME, savePointName);
			} catch (Exception e) {
				logger.error("Error while generating message header", e);
				throw new FusionException(e);
			}

		}
	}

	
}
