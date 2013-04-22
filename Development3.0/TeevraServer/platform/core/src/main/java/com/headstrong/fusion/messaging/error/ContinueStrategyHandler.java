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
 * $Id: ContinueStrategyHandler.java
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
public class ContinueStrategyHandler implements ErrorStrategyHandler {

	@Override
	public boolean isToContinue(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		return true;
	}

	@Override
	public Object updateContext(ProcessContext processContext,
			ErrorHandlingStrategyConfig errorHandlingStrategyConfig,
			Object errorContextData) {
		// context need not contain anything.
		return null;
	}

}
