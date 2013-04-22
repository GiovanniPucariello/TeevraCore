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
 * $Id: OnErrorConfig.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 18, 2009 
 */

package com.headstrong.fusion.config;

import java.util.List;

/**
 * Configuration required for Mediation service on the event of Error.
 * 
 */
public class OnErrorConfig {

	/**
	 * Unique Error Reporter identifier.
	 */
	private List<ErrorReportingConfig> errorReporters;

	/**
	 * Exception Type. Only supported Exception types are
	 * Business/System
	 * 
	 */
	private String exceptionType;

	/**
	 * Error Handling Strategy.
	 */
	private ErrorHandlingStrategyConfig errorHandlingStrategy;

	/**
	 * @return the exceptionType
	 */
	public String getExceptionType() {
		return exceptionType;
	}

	/**
	 * @param exceptionType the exceptionType to set
	 */
	public void setExceptionType(String exceptionType) {
		this.exceptionType = exceptionType;
	}

	/**
	 * @return the errorHandlingStrategy
	 */
	public ErrorHandlingStrategyConfig getErrorHandlingStrategy() {
		return errorHandlingStrategy;
	}

	/**
	 * @param errorHandlingStrategy the errorHandlingStrategy to set
	 */
	public void setErrorHandlingStrategy(
			ErrorHandlingStrategyConfig errorHandlingStrategy) {
		this.errorHandlingStrategy = errorHandlingStrategy;
	}

	/**
	 * @return the errorReporters
	 */
	public List<ErrorReportingConfig> getErrorReporters() {
		return errorReporters;
	}

	/**
	 * @param errorReporters the errorReporters to set
	 */
	public void setErrorReporters(List<ErrorReportingConfig> errorReporters) {
		this.errorReporters = errorReporters;
	}
}
