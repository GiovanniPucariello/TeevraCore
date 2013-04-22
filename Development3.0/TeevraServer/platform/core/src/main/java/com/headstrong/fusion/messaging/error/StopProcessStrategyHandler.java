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
 * $Id: StopProcessStrategyHandler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 28, 2009 
 */

package com.headstrong.fusion.messaging.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Reports the Error and Stops the Process.
 */
public class StopProcessStrategyHandler implements ErrorStrategyHandler {

	private static final Logger logger = LoggerFactory
			.getLogger(StopProcessStrategyHandler.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.error.ErrorStrategyHandler#toContinue(java.lang.Object)
	 */
	@Override
	public boolean isToContinue(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		if (Boolean.TRUE.equals(errorContextData)) {
			// Stop the process.
			// stop the process and return true.
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.error.ErrorStrategyHandler#updateContext(java.lang.Object)
	 */
	@Override
	public Object updateContext(final ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) throws Exception {
		new Thread() {
			@Override
			public void run() {
				try {
					processContext.stop(true);
				} catch (Exception e) {
					logger.error("error stopping process "
							+ processContext.getProcessConfigurationModel()
									.getProcess().getId(), e);
				}
			}
		}.start();
		return Boolean.TRUE;
	}
}
