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
 * $Id: MQLogMessageFormatter.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 21, 2010 
 */

package com.headstrong.fusion.eventlogger.logformatters;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;

/**
 * Converts the bean into the format used to log into MQ
 */
public class MQLogMessageFormatter {

	/**
	 * Converts the log details in the bean to the format
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventlogBean
	 * @return
	 * @throws FusionException
	 */
	public static String formatLogMessage(EventLogBean eventlogBean)
			throws FusionException {
		// serialize event log bean and create a string
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		XMLEncoder encoder = new XMLEncoder(os);
		encoder.writeObject(eventlogBean);
		encoder.close();
		return os.toString();
	}

}
