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
 * $Id: ErrorHandlingStrategyFactory.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 28, 2009 
 */

package com.headstrong.fusion.messaging.error;

import java.util.HashMap;
import java.util.Map;

/**
 * Error handling strategy factory class.
 */
public class ErrorHandlingStrategyFactory {

	// map of strategy handlers.
	private static Map<String, ErrorStrategyHandler> errorStrategyHandlerMap = new HashMap<String, ErrorStrategyHandler>();

	static {
		errorStrategyHandlerMap.put("ReportAndContinueJob",
				new ContinueStrategyHandler());
		errorStrategyHandlerMap.put("ReportAndAbortJob",
				new AbortStrategyHandler());
		errorStrategyHandlerMap.put("ReportAndAbortJobIfThresholdCrossed",
				new AbortIfThresholdCrossedStrategyHandler());
		errorStrategyHandlerMap.put("ReportAndStopProcess",
				new StopProcessStrategyHandler());
	}

	/**
	 * Returns the Error Strategy Handler based on the Strategy Name.
	 * 
	 * @param strategyName
	 * @return Error Strategy Handler.
	 */
	public static ErrorStrategyHandler getErrorStrategyHandler(
			String strategyName) {
		return errorStrategyHandlerMap.get(strategyName);
	}
}
