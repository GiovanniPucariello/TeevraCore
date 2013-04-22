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
 * $Id: QuartzScheduler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.scheduler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.osgi.framework.BundleContext;
import org.quartz.CronExpression;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.config.CacheReloadSchedule;
import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Default Quartz scheduler.
 * 
 */
public class QuartzScheduler implements ProcessScheduler, CacheReloadScheduler {

	private static Logger logger = LoggerFactory
			.getLogger(QuartzScheduler.class);
	private BundleContext bundleContext;
	private Scheduler scheduler;
	private boolean active = true;
	private String propertyFile = "scheduler.properties";

	/**
	 * @param bundleContext
	 */
	public QuartzScheduler(BundleContext bundleContext) {
		this.bundleContext = bundleContext;

		Properties properties = new Properties();
		try {
			URL propertyFile = bundleContext.getBundle().getEntry(
					this.propertyFile);
			if (propertyFile == null) {
				throw new FileNotFoundException(this.propertyFile);
			}
			properties.load(propertyFile.openStream());
			SchedulerFactory schedFact = new StdSchedulerFactory(properties);
			try {
				this.scheduler = schedFact.getScheduler();
			} catch (SchedulerException e) {
				logger
						.error("Error while initializing the Fusion scheduler",
								e);
				this.setActive(false);
			}
			try {
				if (this.isActive()) {
					scheduler.start();
				}
			} catch (SchedulerException e) {
				logger
						.error("Error while initializing the Fusion scheduler",
								e);
				this.setActive(false);
			}
			// On successful creation log a info message
			logger.info("Fusion Scheduler started.");
		} catch (IOException e) {
			logger.error("Error reading Quartz property file.", e);
			this.setActive(false);
		} catch (SchedulerException e) {
			logger.error("Error creating the Fusion scheduler.", e);
			this.setActive(false);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#setActive()
	 */
	public boolean setActive(boolean active) {
		return this.active = active;
	}

	public void start() throws FusionException {
		try {
			this.scheduler.start();
		} catch (SchedulerException e) {
			throw new FusionException("Error while starting the scheduler", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#isActive()
	 */
	public boolean isActive() {
		return this.active;
	}

	/**
	 * @return the bundleContext
	 */
	public BundleContext getBundleContext() {
		return bundleContext;
	}

	/**
	 * @param bundleContext
	 *            the bundleContext to set
	 */
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	public void shutDown() throws FusionException {
		try {
			this.scheduler.shutdown();
		} catch (SchedulerException e) {
			throw new FusionException(
					"Error while shutting down the scheduler", e);
		}
	}

	// === Process Scheduling
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#scheduleProcess(com.headstrong.fusion.core.ProcessContext,
	 *      com.headstrong.fusion.config.ProcessSchedule)
	 */
	/**
	 * @precondition schedule.getStopTime() != null && schedule.getCron() !=
	 *               null
	 * 
	 */
	/**
	 * Currently works as updateSchedule need relook.
	 */
	public void scheduleProcess(ProcessContext processContext,
			ProcessSchedule schedule) throws Exception {
		// First try removing any schedule if exists.

		try {
			this.unscheduleProcessJob(schedule);
		} catch (SchedulerException e) {
			logger.error("Error removing the job.", e);
			// ignore.
		}

		if (logger.isDebugEnabled()) {
			logger.debug("Process "
					+ processContext.getProcessConfigurationModel()
							.getProcess().getId()
					+ ","
					+ processContext.getProcessConfigurationModel()
							.getProcess().getName()
					+ " scheduling. schedule information [cron expression :"
					+ schedule.getCronExpression() + ", start date:"
					+ schedule.getScheduleStartTime() + ", stop date:"
					+ schedule.getScheduleStopTime() + ", process stop time:"
					+ schedule.getProcessStopTime() + "]");
		}
		// 1: Create Process Stop Job
		JobDetail stopJob = new JobDetail(schedule.getProcessId() + STOP,
				GROUP, ProcessStopJob.class);
		stopJob.getJobDataMap().put(PROCESS, processContext.getProcessId());

		// 2: Create Process Start Job
		JobDetail startJob = new JobDetail(schedule.getProcessId() + START,
				GROUP, ProcessStartJob.class);
		startJob.getJobDataMap().put(PROCESS, processContext.getProcessId());
		startJob.getJobDataMap().put(STOP_JOB, stopJob);
		startJob.getJobDataMap().put(SCHEDULE, schedule);

		// 2: Create Start Trigger
		CronTrigger startTrigger = new CronTrigger(schedule.getProcessId()
				+ START, GROUP);
		startTrigger.setCronExpression(new CronExpression(schedule
				.getCronExpression()));
		startTrigger.setStartTime(schedule.getScheduleStartTime());
		startTrigger.setEndTime(schedule.getScheduleStopTime());

		// 3: Schedule the Job as per the Trigger.
		this.scheduler.scheduleJob(startJob, startTrigger);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#updateSchedule(com.headstrong.fusion.core.ProcessContext,
	 *      com.headstrong.fusion.config.ProcessSchedule)
	 */
	// TODO :: Need to check updateSchedule method of Scheduler.
	public void updateProcessSchedule(ProcessContext processContext,
			ProcessSchedule schedule) throws Exception {
		this.unscheduleProcessJob(schedule);
		this.scheduleProcess(processContext, schedule);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#unscheduleJob(com.headstrong.fusion.config.ProcessSchedule)
	 */
	/**
	 * Removes the Start Job and any associated trigger associated with It.
	 * 
	 */
	public void unscheduleProcessJob(ProcessSchedule schedule) throws Exception {
		this.scheduler.deleteJob(schedule.getProcessId() + START, GROUP);
		this.scheduler.deleteJob(schedule.getProcessId() + STOP, GROUP);
	}

	// === Cache Reloading Scheduling

	/**
	 * @precondition schedule.getStopTime() != null && schedule.getCron() !=
	 *               null
	 * 
	 */
	public void scheduleCacheReload(CacheReloadSchedule schedule)
			throws Exception {
		
		// First try removing any schedule if exists.
		try {
			this.unscheduleCacheReloadJob(schedule);
		} catch (SchedulerException e) {
			logger.error("Error removing the job.", e);
		}

		if (logger.isDebugEnabled()) {
			/*
			 * logger.debug("Process " +
			 * processContext.getProcessConfigurationModel()
			 * .getProcess().getId() + "," +
			 * processContext.getProcessConfigurationModel()
			 * .getProcess().getName() + " scheduling. schedule information
			 * [cron expression :" + schedule.getCronExpression() + ", start
			 * date:" + schedule.getScheduleStartTime() + ", stop date:" +
			 * schedule.getScheduleStopTime() + ", process stop time:" +
			 * schedule.getProcessStopTime() + "]");
			 */
		}
		JobDetail cacheReloadJob = new JobDetail(schedule.getCacheName()
				+ RELOAD_SCHEDULE, GROUP, CacheReloadJob.class);
		cacheReloadJob.getJobDataMap().put(SCHEDULE, schedule);

		// 2: Create Start Trigger
		CronTrigger cacheReloadTrigger = new CronTrigger(schedule
				.getCacheName()
				+ RELOAD_SCHEDULE, GROUP);
		cacheReloadTrigger.setCronExpression(new CronExpression(schedule
				.getCronExpression()));
		cacheReloadTrigger.setStartTime(schedule.getScheduleStartTime());
		cacheReloadTrigger.setEndTime(schedule.getScheduleStopTime());

		// 3: Schedule the Job as per the Trigger.
		this.scheduler.scheduleJob(cacheReloadJob, cacheReloadTrigger);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#updateSchedule(com.headstrong.fusion.core.ProcessContext,
	 *      com.headstrong.fusion.config.ProcessSchedule)
	 */
	// TODO :: Need to check updateSchedule method of Scheduler.
	public void updateCacheReloadSchedule(CacheReloadSchedule schedule)
			throws Exception {
		this.unscheduleCacheReloadJob(schedule);
		this.scheduleCacheReload(schedule);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.scheduler.ProcessScheduler#unscheduleJob(com.headstrong.fusion.config.ProcessSchedule)
	 */
	/**
	 * Removes the Start Job and any associated trigger associated with It.
	 * 
	 */
	public void unscheduleCacheReloadJob(CacheReloadSchedule schedule) throws Exception {
		this.scheduler.deleteJob(schedule.getCacheName() + RELOAD_SCHEDULE,
				GROUP);
		this.scheduler.deleteJob(schedule.getCacheName() + RELOAD_SCHEDULE,
				GROUP);
	}

}
