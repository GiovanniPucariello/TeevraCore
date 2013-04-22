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
 * $Id: DefaultApplicationContextMBean.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 23, 2008 
 */

package com.headstrong.fusion.core;

import java.util.Date;
import java.util.List;

/**
 * A marker interface required for JMX registration purpose.
 * 
 */
public interface FusionRemoteAccessMBean {

	/**
	 * Method registers a process using the process definition
	 * <code>byte array</code>.
	 * 
	 * @param file
	 *            process definition byte array for remote invocation.
	 * @throws Exception
	 */
	public void registerProcess(byte[] file) throws Exception;

	/**
	 * update the process with new definition provided.
	 * 
	 * @param processId
	 *            process identifier.
	 * @param file
	 *            process definition byte array.
	 */
	public void updateProcess(String processId, byte[] file) throws Exception;

	/**
	 * Process is removed from the application context.
	 * 
	 * @param processId
	 *            process identifier.
	 * @throws Exception
	 */
	public void removeProcess(String processId) throws Exception;

	/**
	 * starts the process.
	 * 
	 * @param processId
	 *            process identifier.
	 * @throws Exception
	 */
	public void startProcess(String processId) throws Exception;

	/**
	 * stops the process.
	 * 
	 * @param processId
	 *            process identifier.
	 * @throws Exception
	 */
	public void stopProcess(String processId) throws Exception;

	/**
	 * Returns a list of all the registered processes.
	 * 
	 * @return List List of process ids.
	 * @throws Exception
	 */
	public List<String> getProcesses() throws Exception;

	/**
	 * creates a process run schedule.
	 * 
	 * @param processId
	 *            Process Indentifier
	 * @param scheduleStartTime
	 *            process schedule start time
	 * @param scheduleStopTime
	 *            process schedule stop time
	 * @param processStopTime
	 *            daily process stop time.
	 * @param cronExpression
	 *            Cron Expression.
	 * @throws Exception
	 */
	public void scheduleProcess(String processId, Date scheduleStartTime,
			Date scheduleStopTime, Long processStopTime, String cronExpression)
			throws Exception;

	/**
	 * Registers a process using the process schema definition passes as string.
	 * 
	 * @precondition
	 * @postcondition
	 * @param processDefinition
	 * @throws Exception
	 */
	public void registerProcess(String processDefinition) throws Exception;

	/**
	 * install a new bundle.
	 * 
	 * @param bundle
	 *            bundle byte array.
	 * @param bundleName
	 *            bundle name
	 * @throws Exception
	 */
	public void installBundle(byte[] bundle, String bundleName)
			throws Exception;

	public String getProcessStageInfo(String processId);

	/**
	 * Gets the status of the given process
	 * 
	 * @precondition
	 * @postcondition
	 * @param processId
	 * @return
	 * @throws Exception
	 */
	public String getProcessStatus(String processId) throws Exception;

	/**
	 * Returns all the running processes as a comma separated String
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws Exception
	 */
	public List<String> getRunningProcesses() throws Exception;

	/**
	 * Schedule cache reload
	 *
	 * @precondition
	 * @postcondition 	
	 * @param cacheName
	 * @param scheduleStartDate
	 * @param scheduleEndDate
	 * @param cronExpression
	 * @throws Exception
	 */
	public void scheduleCacheReload(String cacheName, Date scheduleStartDate,
			Date scheduleEndDate, String cronExpression) throws Exception;
}
