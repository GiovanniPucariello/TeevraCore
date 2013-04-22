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
 * $Id: ErrorExchangeProcessor.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 5, 2009 
 */

package com.headstrong.fusion.messaging.service;

import java.util.Date;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.processor.DeadLetterChannel;

import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.ErrorContext;

/**
 * Converts an Error message to Error Context.
 * 
 */
public class ErrorExchangeConverter implements Processor {
	private ErrorFormatter errorFormatter;

	public ErrorExchangeConverter(ErrorFormatter errorFormatter) {
		this.errorFormatter = errorFormatter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	@Override
	public void process(Exchange exchange) throws Exception {
		/*Throwable error = (Throwable) exchange
				.getProperty(DeadLetterChannel.EXCEPTION_CAUSE_PROPERTY);*/
		
		Throwable error = (Throwable) exchange.getException();
		
		ErrorContext errorContext = new ErrorContext();
		errorContext.setCause(error);
		errorContext.setResource(exchange.getIn().getBody());
		errorContext.setTimestamp(new Date());
		exchange.getIn().setBody(this.errorFormatter.format(errorContext));

		Map<String, Object> newHeaders = exchange.getIn().getHeaders();
		Throwable t = error;
		StringBuffer sb = new StringBuffer();
		while (t != null) {
			if (t instanceof RuntimeException) {
				// FIXME Primary put here for debugging purpose.
				// need to check how to do the logging
				// of the RunTimeException.
				StackTraceElement[] trace = t.getStackTrace();
				for (int i = 0; i < trace.length; i++) {
					sb.append("\n " + trace[i]);
				}
			} else {
				sb.append(t.getMessage()).append(",");
			}
			t = t.getCause();
		}
		// log the error message in the file.
		newHeaders.put(FusionConstants.LOG_MESSAGE, sb.toString());
		newHeaders.put(FusionConstants.SAVEPOINT_NAME,
				FusionConstants.DEFAULT_ERROR_SP_NAME);
		newHeaders.put(FusionConstants.SAVEPOINT_TIME, Long.toString(System
				.currentTimeMillis()));
		exchange.getIn().setHeaders(newHeaders);
	}

}
