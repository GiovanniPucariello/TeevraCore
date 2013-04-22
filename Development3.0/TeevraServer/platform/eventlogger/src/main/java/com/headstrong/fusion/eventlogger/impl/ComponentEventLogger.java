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
 * $Id: ComponentEventLogger.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 22, 2010 
 */

package com.headstrong.fusion.eventlogger.impl;

import java.util.Map;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.factory.EventLogWriterFactory;
import com.headstrong.fusion.eventlogger.logmanager.EventLogManager;
import com.headstrong.fusion.eventlogger.writer.EventLogWriter;

/**
 * <code>ComponentEventLogger</code> is an implementation of the
 * <code>EventLogger</code>. It appends the event log generated for component
 * in a process in the database.
 */
public class ComponentEventLogger implements EventLogger {

	private static final Logger logger = LoggerFactory
			.getLogger(ComponentEventLogger.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.EventLogger#log(com.headstrong.fusion.eventlogger.beans.EventLogBean)
	 */
	@Override
	public void log(EventLogBean eventLogBean) throws FusionException {
		if (!(eventLogBean instanceof ComponentEventLogBean)) {
			logger.error("Eventlogbean not an instance of MessageEventLogBean");
			throw new FusionException(
					"Eventlogbean not an instance of MessageEventLogBean");
		}

		ComponentEventLogBean compEventBean = (ComponentEventLogBean) eventLogBean;
		// check mandatory fields
		if (!checkMandatoryFields(compEventBean)) {
			logger
					.error("Mandatory fields are not present or not in correct format ");
			throw new FusionException(
					"Mandatory fields are not present or not in correct format ");
		}

		// write the log beans to in memory queues
		EventLogManager.writeToQueue(eventLogBean);
	}

	/**
	 * checkMandatoryFields checks the mandatory fields that needs to be present
	 * in the {@link Map} that is passed.
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * @return true if all conditions are satisfied. false if any of the
	 *         condition fails.
	 */
	public boolean checkMandatoryFields(ComponentEventLogBean eventLogBean) {

		/*
		 * checking mandatory fields
		 */
		if (eventLogBean.getMessageId() == null) {
			logger.error("No message id found in  bean " + eventLogBean);
			return false;
		}
		if (eventLogBean.getCompId() == null) {
			logger.error("No component id found in  bean " + eventLogBean);
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

		return true;
	}

}
