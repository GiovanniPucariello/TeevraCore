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
 * $Id: FusionLogger.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger.slf4j;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Marker;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.LocationAwareLogger;

class FusionLogger implements LocationAwareLogger {

	private final String name;

	private FusionLoggerConfig config;

	FusionLogger(String name) {
		this.name = name;
	}

	void setLoggerConfig(FusionLoggerConfig config) {
		this.config = config;
	}

	// ---------- Actual Loger Entry writing -----------------------------------

	private void log(Marker marker, FusionLoggerLevel level, String msg,
			Throwable t) {
		log(marker, null, level, msg, t);
	}

	private void log(Marker marker, String fqcn, FusionLoggerLevel level,
			String msg, Throwable t) {
		StringWriter writer = null;
		
		// Generating UUID to append to log. This ID is to be shared between fusion.log and error.log
		UUID uuid = UUID.randomUUID();
		String uuidString = uuid.toString(); 		
		uuidString = uuidString.substring(0, uuidString.indexOf("-"))
		+ uuidString.substring(uuidString.lastIndexOf("-")+1, uuidString.length());
		
		// marker indicating whether a line terminator is to be written after
		// the message: If a throwable is given, the stacktrace generator
		// writes a final line terminator and hence we do need to do it
		// ourselves
		boolean needsEOL = true;
		if (level == FusionLoggerLevel.ERROR) {
			writer = new StringWriter();
			// create the formatted log line; use a local copy because the field
			// may be exchanged while we are trying to use it
			config.formatMessage(writer.getBuffer(), marker, getName(), level, msg,
					fqcn, uuidString);
			
			// append stacktrace if throwable is not null
			if (t != null) {
				writer.write(' ');
				PrintWriter pw = new PrintWriter(writer);
				t.printStackTrace(pw);
				pw.flush();
				// just flush the output, no EOL needed
				needsEOL = false;
			}
			config.printMessage(writer.toString(), needsEOL, true);
			needsEOL = true;
		}
		// Case: If the stack trace is appended to the msg and sent (Refer ErrorExchangeProcess), then
		// take off the stack trace while writing to system log as it would've got written to error log
		int stackTraceStart = msg.indexOf("java.");
		if (stackTraceStart != -1) {
			msg = msg.substring(0, stackTraceStart);
		}
		writer = new StringWriter();
		config.formatMessage(writer.getBuffer(), marker, getName(), level, msg,
				fqcn, uuidString);
		// use a local copy because the field may be exchanged while we are
		// trying to use it
		config.printMessage(writer.toString(), needsEOL, false);
	}

	// ---------- Logger interface ---------------------------------------------

	public String getName() {
		return name;
	}

	public void trace(String msg) {
		if (isTraceEnabled()) {
			log(null, FusionLoggerLevel.TRACE, msg, null);
		}
	}

	public void trace(String format, Object arg) {
		if (isTraceEnabled()) {
			log(null, FusionLoggerLevel.TRACE, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void trace(String format, Object[] argArray) {
		if (isTraceEnabled()) {
			log(null, FusionLoggerLevel.TRACE, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void trace(String msg, Throwable t) {
		if (isTraceEnabled()) {
			log(null, FusionLoggerLevel.TRACE, msg, t);
		}
	}

	public void trace(String format, Object arg1, Object arg2) {
		if (isTraceEnabled()) {
			log(null, FusionLoggerLevel.TRACE, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void trace(Marker marker, String msg) {
		if (isTraceEnabled(marker)) {
			log(marker, FusionLoggerLevel.TRACE, msg, null);
		}
	}

	public void trace(Marker marker, String format, Object arg) {
		if (isTraceEnabled(marker)) {
			log(marker, FusionLoggerLevel.TRACE, MessageFormatter.format(
					format, arg).getMessage(), null);
		}
	}

	public void trace(Marker marker, String format, Object[] argArray) {
		if (isTraceEnabled(marker)) {
			log(marker, FusionLoggerLevel.TRACE, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void trace(Marker marker, String msg, Throwable t) {
		if (isTraceEnabled(marker)) {
			log(marker, FusionLoggerLevel.TRACE, msg, t);
		}
	}

	public void trace(Marker marker, String format, Object arg1, Object arg2) {
		if (isTraceEnabled(marker)) {
			log(marker, FusionLoggerLevel.TRACE, MessageFormatter.format(
					format, arg1, arg2).getMessage(), null);
		}
	}

	public void debug(String msg) {
		if (isDebugEnabled()) {
			log(null, FusionLoggerLevel.DEBUG, msg, null);
		}
	}

	public void debug(String format, Object arg) {
		if (isDebugEnabled()) {
			log(null, FusionLoggerLevel.DEBUG, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void debug(String format, Object[] argArray) {
		if (isDebugEnabled()) {
			log(null, FusionLoggerLevel.DEBUG, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void debug(String msg, Throwable t) {
		if (isDebugEnabled()) {
			log(null, FusionLoggerLevel.DEBUG, msg, t);
		}
	}

	public void debug(String format, Object arg1, Object arg2) {
		if (isDebugEnabled()) {
			log(null, FusionLoggerLevel.DEBUG, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void debug(Marker marker, String msg) {
		if (isDebugEnabled(marker)) {
			log(marker, FusionLoggerLevel.DEBUG, msg, null);
		}
	}

	public void debug(Marker marker, String format, Object arg) {
		if (isDebugEnabled(marker)) {
			log(marker, FusionLoggerLevel.DEBUG, MessageFormatter.format(
					format, arg).getMessage(), null);
		}
	}

	public void debug(Marker marker, String format, Object[] argArray) {
		if (isDebugEnabled(marker)) {
			log(marker, FusionLoggerLevel.DEBUG, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void debug(Marker marker, String msg, Throwable t) {
		if (isDebugEnabled(marker)) {
			log(marker, FusionLoggerLevel.DEBUG, msg, t);
		}
	}

	public void debug(Marker marker, String format, Object arg1, Object arg2) {
		if (isDebugEnabled(marker)) {
			log(marker, FusionLoggerLevel.DEBUG, MessageFormatter.format(
					format, arg1, arg2).getMessage(), null);
		}
	}

	public void info(String msg) {
		if (isInfoEnabled()) {
			log(null, FusionLoggerLevel.INFO, msg, null);
		}
	}

	public void info(String format, Object arg) {
		if (isInfoEnabled()) {
			log(null, FusionLoggerLevel.INFO, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void info(String format, Object[] argArray) {
		if (isInfoEnabled()) {
			log(null, FusionLoggerLevel.INFO, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void info(String msg, Throwable t) {
		if (isInfoEnabled()) {
			log(null, FusionLoggerLevel.INFO, msg, t);
		}
	}

	public void info(String format, Object arg1, Object arg2) {
		if (isInfoEnabled()) {
			log(null, FusionLoggerLevel.INFO, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void info(Marker marker, String msg) {
		if (isInfoEnabled(marker)) {
			log(marker, FusionLoggerLevel.INFO, msg, null);
		}
	}

	public void info(Marker marker, String format, Object arg) {
		if (isInfoEnabled(marker)) {
			log(marker, FusionLoggerLevel.INFO, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void info(Marker marker, String format, Object[] argArray) {
		if (isInfoEnabled(marker)) {
			log(marker, FusionLoggerLevel.INFO, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void info(Marker marker, String msg, Throwable t) {
		if (isInfoEnabled(marker)) {
			log(marker, FusionLoggerLevel.INFO, msg, t);
		}
	}

	public void info(Marker marker, String format, Object arg1, Object arg2) {
		if (isInfoEnabled(marker)) {
			log(marker, FusionLoggerLevel.INFO, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void warn(String msg) {
		if (isWarnEnabled()) {
			log(null, FusionLoggerLevel.WARN, msg, null);
		}
	}

	public void warn(String format, Object arg) {
		if (isWarnEnabled()) {
			log(null, FusionLoggerLevel.WARN, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void warn(String format, Object[] argArray) {
		if (isWarnEnabled()) {
			log(null, FusionLoggerLevel.WARN, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void warn(String msg, Throwable t) {
		if (isWarnEnabled()) {
			log(null, FusionLoggerLevel.WARN, msg, t);
		}
	}

	public void warn(String format, Object arg1, Object arg2) {
		if (isWarnEnabled()) {
			log(null, FusionLoggerLevel.WARN, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void warn(Marker marker, String msg) {
		if (isWarnEnabled(marker)) {
			log(marker, FusionLoggerLevel.WARN, msg, null);
		}
	}

	public void warn(Marker marker, String format, Object arg) {
		if (isWarnEnabled(marker)) {
			log(marker, FusionLoggerLevel.WARN, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void warn(Marker marker, String format, Object[] argArray) {
		if (isWarnEnabled(marker)) {
			log(marker, FusionLoggerLevel.WARN, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void warn(Marker marker, String msg, Throwable t) {
		if (isWarnEnabled(marker)) {
			log(marker, FusionLoggerLevel.WARN, msg, t);
		}
	}

	public void warn(Marker marker, String format, Object arg1, Object arg2) {
		if (isWarnEnabled(marker)) {
			log(marker, FusionLoggerLevel.WARN, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void error(String msg) {
		if (isErrorEnabled()) {
			log(null, FusionLoggerLevel.ERROR, msg, null);
		}
	}

	public void error(String format, Object arg) {
		if (isErrorEnabled()) {
			log(null, FusionLoggerLevel.ERROR, MessageFormatter.format(format,
					arg).getMessage(), null);
		}
	}

	public void error(String format, Object[] argArray) {
		if (isErrorEnabled()) {
			log(null, FusionLoggerLevel.ERROR, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void error(String msg, Throwable t) {
		if (isErrorEnabled()) {
			log(null, FusionLoggerLevel.ERROR, msg, t);
		}
	}

	public void error(String format, Object arg1, Object arg2) {
		if (isErrorEnabled()) {
			log(null, FusionLoggerLevel.ERROR, MessageFormatter.format(format,
					arg1, arg2).getMessage(), null);
		}
	}

	public void error(Marker marker, String msg) {
		if (isErrorEnabled(marker)) {
			log(marker, FusionLoggerLevel.ERROR, msg, null);
		}
	}

	public void error(Marker marker, String format, Object arg) {
		if (isErrorEnabled(marker)) {
			log(marker, FusionLoggerLevel.ERROR, MessageFormatter.format(
					format, arg).getMessage(), null);
		}
	}

	public void error(Marker marker, String format, Object[] argArray) {
		if (isErrorEnabled(marker)) {
			log(marker, FusionLoggerLevel.ERROR, MessageFormatter.arrayFormat(
					format, argArray).getMessage(), null);
		}
	}

	public void error(Marker marker, String msg, Throwable t) {
		if (isErrorEnabled(marker)) {
			log(marker, FusionLoggerLevel.ERROR, msg, t);
		}
	}

	public void error(Marker marker, String format, Object arg1, Object arg2) {
		if (isErrorEnabled(marker)) {
			log(marker, FusionLoggerLevel.ERROR, MessageFormatter.format(
					format, arg1, arg2).getMessage(), null);
		}
	}

	public boolean isTraceEnabled() {
		return config.isLevel(FusionLoggerLevel.TRACE);
	}

	public boolean isTraceEnabled(Marker marker) {
		return config.isLevel(FusionLoggerLevel.TRACE);
	}

	public boolean isDebugEnabled() {
		return config.isLevel(FusionLoggerLevel.DEBUG);
	}

	public boolean isDebugEnabled(Marker marker) {
		return config.isLevel(FusionLoggerLevel.DEBUG);
	}

	public boolean isInfoEnabled() {
		return config.isLevel(FusionLoggerLevel.INFO);
	}

	public boolean isInfoEnabled(Marker marker) {
		return config.isLevel(FusionLoggerLevel.INFO);
	}

	public boolean isWarnEnabled() {
		return config.isLevel(FusionLoggerLevel.WARN);
	}

	public boolean isWarnEnabled(Marker marker) {
		return config.isLevel(FusionLoggerLevel.WARN);
	}

	public boolean isErrorEnabled() {
		return config.isLevel(FusionLoggerLevel.ERROR);
	}

	public boolean isErrorEnabled(Marker marker) {
		return config.isLevel(FusionLoggerLevel.ERROR);
	}

	@Override
	public void log(Marker marker, String fqcn, int level, String message, Object[] arg4,
			Throwable t) {
		FusionLoggerLevel fusionLevel = FusionLoggerLevel.fromSlf4jLevel(level);
		if (config.isLevel(fusionLevel)) {
			log(marker, fqcn, fusionLevel, message, t);
		}
	}
}
