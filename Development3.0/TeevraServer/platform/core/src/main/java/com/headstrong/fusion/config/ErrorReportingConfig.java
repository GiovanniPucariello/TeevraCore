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
 * $Id: ErrorReportingConfig.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 27, 2009 
 */

package com.headstrong.fusion.config;

/**
 * Represents Error Reporter Id and Formatter information. 
 */
public class ErrorReportingConfig {
	/**
	 * Error Reporter unique identifier.
	 */
	private String errorReporterId;
	/**
	 * Formatter service.
	 */
	private String formatter;
	/**
	 * @return the errorReporterId
	 */
	public String getErrorReporterId() {
		return errorReporterId;
	}
	/**
	 * @param errorReporterId the errorReporterId to set
	 */
	public void setErrorReporterId(String errorReporterId) {
		this.errorReporterId = errorReporterId;
	}
	/**
	 * @return the formatter
	 */
	public String getFormatter() {
		return formatter;
	}
	/**
	 * @param formatter the formatter to set
	 */
	public void setFormatter(String formatter) {
		this.formatter = formatter;
	}
	
 
}
