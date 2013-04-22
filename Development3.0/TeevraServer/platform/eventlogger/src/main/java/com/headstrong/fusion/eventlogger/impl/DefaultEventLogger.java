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
 * $Id: DefaultEventLogger.java
 * $Revision: 
 * $Author: mbafna
 * $DateTime: Oct 7, 2008 
 */

package com.headstrong.fusion.eventlogger.impl;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.EventLogger;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;

/**
 * Default implementation of the EventLogger. 
 * It will append the message in system.in console. 
 */
public class DefaultEventLogger implements EventLogger {

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.eventlogger.EventLogger#log(com.headstrong.fusion.eventlogger.beans.EventLogBean)
	 */
	public void log(EventLogBean eventLogBean) throws FusionException {
		System.out.println("Event message :" + eventLogBean.toString());

	}

}
