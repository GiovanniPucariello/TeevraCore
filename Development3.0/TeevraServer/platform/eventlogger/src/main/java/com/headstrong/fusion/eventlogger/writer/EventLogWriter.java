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
 * $Id: EventLogWriter.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 21, 2010 
 */

package com.headstrong.fusion.eventlogger.writer;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.eventlogger.beans.EventLogBean;

/**
 * Interface to be implemented by all the event log writers.
 */
public interface EventLogWriter {

	/**
	 * Logs the events generated to the corresponding event log storages
	 * 
	 * @precondition
	 * @postcondition
	 * @param eventLogBean
	 * @param context
	 * @throws FusionException
	 */
	public void write(EventLogBean eventLogBean, BundleContext context)
			throws FusionException;
}
