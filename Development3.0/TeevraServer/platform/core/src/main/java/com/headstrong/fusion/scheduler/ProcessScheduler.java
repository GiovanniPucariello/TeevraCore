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
 * $Id: ProcessScheduler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.scheduler;

import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public interface ProcessScheduler extends Scheduler {

	public static final String START = "_start";
	public static final String STOP = "_stop";
	public static final String PROCESS = "PROCESS";
	public static final String STOP_JOB = "STOP_JOB";

	/**
	 * Schedules a process.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 */
	public void scheduleProcess(ProcessContext processContext,
			ProcessSchedule schedule) throws Exception;

	/**
	 * Updates the schedule.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 */
	public void updateProcessSchedule(ProcessContext processContext,
			ProcessSchedule schedule) throws Exception;

	/**
	 * Remove scheduling.
	 * 
	 * @precondition
	 * @postcondition
	 * @param schedule
	 * @throws Exception
	 */
	public void unscheduleProcessJob(ProcessSchedule schedule) throws Exception;

}
