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
 * $Id: EventLogPersistor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.persistor;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * An interface that needs to be implemented by specific log persistors to log
 * events from temporary storage to a relational database which would be a
 * permanent storage
 */
public interface EventLogPersistor {

	/**
	 * Starts persisting message event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void persistMessageEventLogs() throws FusionException;

	/**
	 * Stops persisting message event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void stopPersistMessageEventLogs() throws FusionException;

	/**
	 * Starts persisting process event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void persistProcessEventLogs() throws FusionException;

	/**
	 * Stops persisting message event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void stopPersistProcessEventLogs() throws FusionException;

	/**
	 * Starts persisting component event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void persistComponentEventLogs() throws FusionException;

	/**
	 * Stops persisting component event logs
	 * 
	 * @precondition
	 * @postcondition
	 * @throws FusionException
	 */
	public void stopPersistComponentEventLogs() throws FusionException;

}
