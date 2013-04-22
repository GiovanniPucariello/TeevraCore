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
 * $Id: FileLogWriter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.ComponentEventLogBean;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;
import com.headstrong.fusion.eventlogger.beans.MessageEventLogBean;
import com.headstrong.fusion.eventlogger.beans.ProcessEventLogBean;
import com.headstrong.fusion.eventlogger.logformatters.FileLogMessageFormatter;

/**
 * An implementation of EventLogWriter. It logs the events logged by EventLogger
 * to a file system
 */
public class FileLogWriter implements EventLogWriter {

	private static final Logger logger = LoggerFactory
			.getLogger(FileLogWriter.class);

	private static final String message_eventlog_file = "message_eventlog.txt";
	private static final String process_eventlog_file = "process_runtime_eventlog.txt";
	private static final String component_eventlog_file = "component_eventlog.txt";
	private static final String default_eventlog_file = "default_eventlog.txt";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.writer.EventLogWriter#log(com.headstrong.fusion.eventlogger.beans.MessageEventLogBean)
	 */
	@Override
	public void write(EventLogBean eventLogBean, BundleContext context)
			throws FusionException {
		// create the message
		String logMessage = FileLogMessageFormatter
				.formatLogMessage(eventLogBean);

		String eventlogDirName = context
				.getProperty(Properties.DIRECTORY_LOCATION);
		// get the file name for logging
		String fileName = eventlogDirName + getFileName(eventLogBean);

		// connect and write to the file
		try {
			File f = new File(fileName);
			FileOutputStream fop = new FileOutputStream(f);

			fop.write(logMessage.getBytes());

			logger.debug("Successfully logged events to file");

			fop.flush();
			fop.close();
		} catch (FileNotFoundException e) {
			logger.error("Error while writing event lgos to the file", e);
			throw new FusionException(
					"Error while writing event lgos to the file", e);
		} catch (IOException e) {
			logger.error("Error while writing event lgos to the file", e);
			throw new FusionException(
					"Error while writing event lgos to the file", e);
		}
	}

	/**
	 * Gets the name of the file to log the events based on the event log bean
	 * provided to the event log writer
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * @return
	 */
	private String getFileName(EventLogBean eventLogBean) {
		if (eventLogBean instanceof MessageEventLogBean) {
			return message_eventlog_file;
		} else if (eventLogBean instanceof ProcessEventLogBean) {
			return process_eventlog_file;
		} else if (eventLogBean instanceof ComponentEventLogBean) {
			return component_eventlog_file;
		} else {
			return default_eventlog_file;
		}
	}

}
