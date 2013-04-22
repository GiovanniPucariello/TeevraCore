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
 * $Id: AbortStrategyHandler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 28, 2009 
 */

package com.headstrong.fusion.messaging.error;

import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public class AbortStrategyHandler implements ErrorStrategyHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.error.ErrorStrategyHandler#toContinue(java.lang.Object)
	 */
	@Override
	public boolean isToContinue(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		/**
		 * If even a single error is reported return false.
		 */
		if (Boolean.TRUE.equals(errorContextData)) {
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
	public Object updateContext(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		return Boolean.TRUE;
	}

}
