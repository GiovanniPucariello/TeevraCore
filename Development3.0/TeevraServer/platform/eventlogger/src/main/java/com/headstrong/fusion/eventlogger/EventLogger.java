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
 * $Id: EventLogger.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.fusion.eventlogger;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;

/**
 * <code>EventLogger</code> is the interface that needs to be implemented by
 * the specific event loggers to log events. 
 */
public interface EventLogger {
	/**
	 *	log method will log the message in the required device. 
	 * @precondition
	 * @postcondition 	
	 * @param eventLogBean
	 * 		{@link EventLogBean)
	 * @throws FusionException
	 * 		if any exception occurs during logging of the message. 
	 */

	void log(EventLogBean eventLogBean) throws FusionException;

}
