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
 * $Id: EventLogRemoteAccessMBean.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 24, 2010 
 */

package com.headstrong.fusion.eventlogger.remoting;

/**
 * An interface required for JMX registration purpose
 */
public interface EventLogRemoteAccessMBean {

	/**
	 * Persists the process eventlogs from intermediate storage to database
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public void persistProcessEventLogs() throws Exception;

	/**
	 * Persists the message eventlogs from intermediate storage to database
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public void persistMessageEventLogs() throws Exception;

/**
	 * Persists the component eventlogs from intermediate storage to database
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	public void persistComponentEventLogs() throws Exception;

//	/**
//	 * Stops persisting the process eventlogs from intermediate storage to database
//	 * 
//	 * @precondition
//	 * @postcondition
//	 * @throws Exception
//	 */
//	public void stopProcessEventLogPersist() throws Exception;
//
//	/**
//	 * Stops persisting the message eventlogs from intermediate storage to database
//	 * 
//	 * @precondition
//	 * @postcondition
//	 * @throws Exception
//	 */
//	public void stopMessageEventLogPersist() throws Exception;
//
//	*//**
//	 * Stops persisting the component eventlogs from intermediate storage to database
//	 * 
//	 * @precondition
//	 * @postcondition
//	 * @throws Exception
//	 *//*
//	public void stopComponentEventLogPersist() throws Exception;*/

}
