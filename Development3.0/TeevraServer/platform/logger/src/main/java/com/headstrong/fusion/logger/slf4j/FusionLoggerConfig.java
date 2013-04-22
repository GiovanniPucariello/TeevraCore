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
 * $Id: FusionLoggerConfig.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger.slf4j;

import java.io.IOException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.slf4j.Marker;

/**
 * The <code>FusionLoggerConfig</code> conveys the logger configuration in
 * terms of writer used and log level set. The respective instances of this
 * class are also used for the actual message formatting and writing.
 */
class FusionLoggerConfig {

	private String configPid;

	private Set<String> categories;

	private FusionLoggerLevel level;

	private MessageFormat format;

	private FusionLoggerWriter writer;
	
	private FusionLoggerWriter errorWriter;

	FusionLoggerConfig(String pid, String pattern, Set<String> categories,
			FusionLoggerLevel level, FusionLoggerWriter writer, FusionLoggerWriter errorWriter){
		this.configPid = pid;
		// Included writer for error logging.
		configure(pattern, categories, level, writer, errorWriter);
	}
	
	void configure(String pattern, Set<String> categories,
			FusionLoggerLevel level, FusionLoggerWriter writer, FusionLoggerWriter errorWriter) {
		this.format = new MessageFormat(pattern);
		this.categories = new HashSet<String>(categories);
		this.level = level;
		this.writer = writer;
		this.errorWriter = errorWriter;
	}

	String getConfigPid() {
		return configPid;
	}

	boolean hasCategory(String category) {
		return categories.contains(category);
	}

	Set<String> getCategories() {
		return categories;
	}

	FusionLoggerWriter getLogWriter() {
		return writer;
	}

	void setLogWriter(FusionLoggerWriter writer) {
		this.writer = writer;
	}

	FusionLoggerLevel getLogLevel() {
		return level;
	}

	boolean isLevel(FusionLoggerLevel reference) {
		return level.compareTo(reference) <= 0;
	}

	void setLogLevel(FusionLoggerLevel level) {
		this.level = level;
	}

	void formatMessage(StringBuffer buffer, Marker marker, String name,
			FusionLoggerLevel level, String msg, String fqcn, String uuid) {
		// create the formatted log line; use a local copy because the field
		// may be exchanged while we are trying to use it
		MessageFormat myFormat = format;
		// Added uuid to log format.
		synchronized (myFormat) {
			myFormat.format(new Object[] { new Date(), marker,
					Thread.currentThread().getName(), name, level.toString(),
					msg, fqcn, uuid}, buffer, new FieldPosition(0));
		}
	}

	void printMessage(String message, boolean needsEOL, boolean isErrorLog) {
		// use a local copy because the field may be exchanged while we are
		// trying to use it
		FusionLoggerWriter myOutput = null;
		
		// Use Error writer to write the log depending on isErrorLog.
		if (isErrorLog) {
			myOutput = errorWriter;
		}
		else {
			myOutput = writer;
		}
		
		synchronized (myOutput) {
			try {
				myOutput.write(message);

				// write line termination or flush, whatever is needed
				if (needsEOL) {
					myOutput.writeln();
				} else {
					myOutput.flush();
				}

			} catch (IOException ioe) {
				LogConfigManager.internalFailure("Failed logging message: "
						+ message, ioe);
			}
		}
	}

}
