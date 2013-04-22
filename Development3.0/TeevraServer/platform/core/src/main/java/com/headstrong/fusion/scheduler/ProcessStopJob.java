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
 * $Id: ProcessStopJob.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.scheduler;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import com.headstrong.fusion.core.DefaultApplicationContext;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public class ProcessStopJob implements Job {
	private static final Logger logger = LoggerFactory
			.getLogger(ProcessStopJob.class);
	public static final String PROCESS = "PROCESS";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		// stop the process
		if(DefaultApplicationContext.getInstance(null) != null)
		{
			String processId = (String) context.getJobDetail()
					.getJobDataMap().get(PROCESS);
			try {
				DefaultApplicationContext.getInstance(null).stopProcess(processId);
				if (logger.isInfoEnabled()) {
					logger.info("Process "
							+ processId
							+ " stopped by the scheduler");
				}
	
			} catch (Exception e) {
				logger.info("Error while stopping the process "
						+ processId);
			}
		}
	
		else
		{
			logger.error("Application Context not initialized");
		}
	}

}
