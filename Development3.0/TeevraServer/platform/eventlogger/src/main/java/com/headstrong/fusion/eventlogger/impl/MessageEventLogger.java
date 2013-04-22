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
 * $Id: MessageEventLogger.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.eventlogger.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.logmanager.EventLogManager;

/**
 * <cod>MessageEventLogger</code is a <code>EventLogger</code> which logs the
 * events with respect to messages processed by fusion framework.
 */
public class MessageEventLogger implements EventLogger {

	private static final Logger logger = LoggerFactory
			.getLogger(MessageEventLogger.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.EventLogger#log(com.headstrong.fusion.eventlogger.beans.EventLogBean)
	 */
	public void log(EventLogBean eventLogBean) throws FusionException {
		if (!(eventLogBean instanceof MessageEventLogBean)) {
			logger.error("Eventlogbean not an instance of MessageEventLogBean");
			throw new FusionException(
					"Eventlogbean not an instance of MessageEventLogBean");
		}

		MessageEventLogBean msgEventBean = (MessageEventLogBean) eventLogBean;
		// check mandatory fields
		if (!checkMandatoryFields(msgEventBean)) {
			logger
					.error("Mandatory fields are not present or not in correct format ");
			throw new FusionException(
					"Mandatory fields are not present or not in correct format ");
		}

		// write the log beans to in memory queues
		EventLogManager.writeToQueue(eventLogBean);
	}

	/**
	 * checkMandatoryFields checks the mandatory fields before logging the event
	 * in the database.
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * 
	 * @return True- if check is successful False - if any of the checks fails.
	 */
	public boolean checkMandatoryFields(MessageEventLogBean eventLogBean) {
		/*
		 * checking mandatory fields
		 */
		if (eventLogBean.getMessageId() == null) {
			logger.error("No message id found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getSessionId() == null) {
			logger.error("No session id found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getSavepointName() == null) {
			logger.error("No savepoint name found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getSavepointTime() == null) {
			logger.error("No savepoint time id found in  bean " + eventLogBean);
			logger.info("Setting to default");
			eventLogBean.setSavepointTime(Long.toString(System
					.currentTimeMillis()));
		}

		/**
		 * Checking the format of the data passed
		 */
		try {
			Integer.parseInt(eventLogBean.getSessionId());
		} catch (Exception e) {
			logger.error("session id not a integer ");
			return false;
		}
		try {
			Integer.parseInt(eventLogBean.getMessageId());
		} catch (Exception e) {
			logger.error("message id not a integer ");
			return false;
		}
		try {
			Long.parseLong(eventLogBean.getSavepointTime());
		} catch (Exception e) {
			logger.error("savepoint time not a long value ");
			logger.info("Setting to default");
			eventLogBean.setSavepointTime(Long.toString(System
					.currentTimeMillis()));
		}

		/**
		 * Now comes complex situations. if received savepoint then sequenceid
		 * and totalsequence not required. If not, they are required if not
		 * splitted, then too sequence id not present
		 */

		if (!FusionConstants.DEFAULT_RECEIVED_SP_NAME.equals(eventLogBean
				.getSavepointName())) {
			if (eventLogBean.getSequenceId() == null) {
				logger.info("No sequence id found in  bean " + eventLogBean);
				eventLogBean.setSequenceId("0");
			}
			if (eventLogBean.getTotalSequences() == null) {
				logger
						.info("No total sequences found in  bean "
								+ eventLogBean);
				eventLogBean.setTotalSequences("0");
			}
			try {
				Integer.parseInt(eventLogBean.getSequenceId());
			} catch (Exception e) {
				logger.error("sequence id not a integer ");
				return false;
			}
			try {
				Integer.parseInt(eventLogBean.getTotalSequences());
			} catch (Exception e) {
				logger.error("total sequence  not a integer ");
				return false;
			}

		} else {
			eventLogBean.setSequenceId("0");
			eventLogBean.setTotalSequences("0");

		}
		return true;

	}

}
