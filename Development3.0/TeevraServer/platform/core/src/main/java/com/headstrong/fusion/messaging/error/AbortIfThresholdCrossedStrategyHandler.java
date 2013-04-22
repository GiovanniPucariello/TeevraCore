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
 * $Id: AbortIfThresholdCrossedStrategyHandler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 28, 2009 
 */

package com.headstrong.fusion.messaging.error;

import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Report the error and abort the job if threshold crossed.
 */
public class AbortIfThresholdCrossedStrategyHandler implements
		ErrorStrategyHandler {

	@Override
	public boolean isToContinue(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		if (((Integer) errorContextData).intValue() <= (Integer
				.parseInt(errorHandlingStrategyConfig.getProperties().get(
						"threshold")))) {
			return true;
		}
		return false;
	}

	@Override
	public Object updateContext(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		int errorThrown = 0;
		if (errorContextData != null) {
			errorThrown = ((Integer) errorContextData).intValue();
		}
		errorThrown++;
		return errorThrown;
	}

}
