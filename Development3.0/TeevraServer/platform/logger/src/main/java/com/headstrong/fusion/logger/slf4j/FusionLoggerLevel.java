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
 * $Id: FusionLoggerLevel.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */
package com.headstrong.fusion.logger.slf4j;

import org.slf4j.spi.LocationAwareLogger;

public enum FusionLoggerLevel {

	TRACE, DEBUG, INFO, WARN, ERROR;

	/**
	 * Translates SLF4J logging levels into {@link FusionLoggerLevel}
	 * 
	 * @param level
	 *            The SLF4J logging level
	 * @return The matching {@link FusionLoggerLevel}
	 */
	public static FusionLoggerLevel fromSlf4jLevel(int level) {
		FusionLoggerLevel fusionLevel;

		if (level < LocationAwareLogger.DEBUG_INT) {
			fusionLevel = FusionLoggerLevel.TRACE;
		} else if (level < LocationAwareLogger.INFO_INT) {
			fusionLevel = FusionLoggerLevel.DEBUG;
		} else if (level < LocationAwareLogger.WARN_INT) {
			fusionLevel = FusionLoggerLevel.INFO;
		} else if (level < LocationAwareLogger.ERROR_INT) {
			fusionLevel = FusionLoggerLevel.WARN;
		} else {
			fusionLevel = FusionLoggerLevel.ERROR;
		}

		return fusionLevel;
	}

}
