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
 * $Id: ProcessJob.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.scheduler;

import static com.headstrong.fusion.scheduler.ProcessScheduler.GROUP;
import static com.headstrong.fusion.scheduler.ProcessScheduler.PROCESS;
import static com.headstrong.fusion.scheduler.ProcessScheduler.SCHEDULE;
import static com.headstrong.fusion.scheduler.ProcessScheduler.STOP;
import static com.headstrong.fusion.scheduler.ProcessScheduler.STOP_JOB;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.TreeSet;

import org.quartz.CronExpression;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.config.ProcessSchedule;
import com.headstrong.fusion.core.DefaultApplicationContext;
import com.headstrong.fusion.core.ProcessContext;

/**
 * 
 */
public class ProcessStartJob implements Job {
	private static final Logger logger = LoggerFactory
			.getLogger(ProcessStartJob.class);

	private boolean isDebug = logger.isDebugEnabled();
	private boolean isInfo = logger.isInfoEnabled();

	/**
	 * FusionCronExpression class enables us to retrieve the values in terms of
	 * hours and minutes for the process start time present in the Cron
	 * Expression
	 */
	private class FusionCronExpression extends CronExpression {

		private static final long serialVersionUID = 7466764570068546326L;

		public FusionCronExpression(String cronExp) throws ParseException {
			super(cronExp); // constructor
		}

		@SuppressWarnings("unchecked")
		// getMinutes() method is required as the getSet() is a protected method
		// and directly inaccessible
		public TreeSet<Integer> getMinutes() {
			// returns the Minutes value for start time in the CronExp
			return getSet(MINUTE);

		}

		@SuppressWarnings("unchecked")
		// getMinutes() method is required as the getSet() is a protected method
		// and directly inaccessible
		public TreeSet<Integer> getHours() {
			// returns the Hour value in the CronExp for startTime
			return getSet(HOUR);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@SuppressWarnings( { "deprecation" })
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		if (DefaultApplicationContext.getInstance(null) != null) {
			String processId = (String) context.getJobDetail().getJobDataMap()
					.get(PROCESS);
			// Values for startDate,stopDate,startTime,stopTime required to perform the
			// range check for a particular time (currentTime)when the Fusion Server goes up
			Date startDate;
			Date stopDate;
			TreeSet<Integer> startHour;
			TreeSet<Integer> startMinute;
			long startTime;
			long stopTime;
			long currentTime;

			ProcessSchedule schedule = (ProcessSchedule) context.getJobDetail()
					.getJobDataMap().get(SCHEDULE);
			startDate = schedule.getScheduleStartTime();
			stopDate = schedule.getScheduleStopTime();
			stopTime = schedule.getProcessStopTime();

			// Object created to retrieve values for a particular CronExpression
			FusionCronExpression cronExpIns = null;
			try {
				cronExpIns = new FusionCronExpression(schedule
						.getCronExpression());
			} catch (ParseException e2) {
				// TODO Auto-generated catch block
				logger
						.error("Unable to parse the Cron Expression for processId : "
								+ processId);
			}
			// Calculating the start time in minutes
			startHour = cronExpIns.getHours();
			Iterator<Integer> itr_hour = startHour.iterator();
			int startHour_int = 0;
			while (itr_hour.hasNext())
				startHour_int = itr_hour.next().intValue(); // Unboxed to primitive type int
			startMinute = cronExpIns.getMinutes();
			Iterator<Integer> itr_min = startMinute.iterator();
			int startMinute_int = 0;
			while (itr_min.hasNext())
				startMinute_int = ((Integer) itr_min.next()).intValue(); // Unboxed to primitive type int
			startTime = startHour_int * 60 + startMinute_int;
			// Calculating the current time in minutes
			java.util.Date currentDate = new java.util.Date();
			int currentTime_Hour = currentDate.getHours();
			int currentTime_Minute = currentDate.getMinutes();
			currentTime = currentTime_Hour * 60 + currentTime_Minute;
			// Date and time range check performed for current time, when fusion
			// server is up.This check is mandatorily included for the case
			// where fusion is up again after a crash scenario inbetween the
			// scheduled run time for a process.
			if (((currentDate.compareTo(startDate)) == 1)
					&& ((currentDate.compareTo(stopDate)) == -1)) {
				// Stop Trigger created only if the current time falls within the
				// scheduled time range for the process
				if ((stopTime < startTime && (currentTime >= startTime || currentTime < stopTime))
						|| (stopTime > startTime && (currentTime >= startTime && currentTime < stopTime))) {

					boolean stopTriggerCreated = false;
					try {
						stopTriggerCreated = this.createStopTrigger(context);
					} catch (SchedulerException e1) {
						logger.error("Error creating stop trigger for "
								+ processId
								+ ", schedule start of the process suspended.");
					}

					if (isDebug) {
						logger
								.debug("Process start job trigger invoked for process "
										+ processId);
					}

					if (stopTriggerCreated) {
						try {
							DefaultApplicationContext.getInstance(null)
									.startProcess(processId);
							if (isInfo) {
								logger.info("Process " + processId
										+ " started by the scheduler");
							}
						} catch (Exception e) {
							logger.error("Error while starting the process "
									+ processId + " : " + e.getMessage());
							// FIXME
						}
					} else {
						logger
								.error("Stop trigger was not created for the process  "
										+ processId
										+ " as the stop time is before the current time ,"
										+ " schedule start of the process suspended.");
					}

				} else {
					logger
							.error("Current time not falling within the scheduled time range for processId : "
									+ processId);
				}
			} else {
				logger
						.error("Current date not falling within the scheduled date range for processId : "
								+ processId);
			}
		} else {
			logger.error("Application Context not initialized");
		}
	}

	/**
	 * Creates a simple stop trigger for the Process.
	 * 
	 * @param context
	 * @throws SchedulerException
	 */
	private boolean createStopTrigger(JobExecutionContext context)
			throws SchedulerException {
		// For every execution create a Stop trigger.
		JobDetail processStopJob = (JobDetail) context.getJobDetail()
				.getJobDataMap().get(STOP_JOB);
		// create a simple trigger.
		ProcessSchedule schedule = (ProcessSchedule) context.getJobDetail()
				.getJobDataMap().get(SCHEDULE);

		Long stopTime = schedule.getProcessStopTime();

		Calendar stopTriggerStartDate = new GregorianCalendar();
		int currentHour = stopTriggerStartDate.getTime().getHours();
		int currentMinute = stopTriggerStartDate.getTime().getMinutes();
		int currentTime = currentHour * 60 + currentMinute;
		// check if the time is in the current date's range or next day
		if (schedule.getProcessStopTime() < (currentTime)) {
			stopTriggerStartDate.add(Calendar.DATE, 1);
		}

		int stopHour = new Long(stopTime / 60).intValue();
		int stopMin = new Long(stopTime % 60).intValue();

		stopTriggerStartDate.set(Calendar.HOUR_OF_DAY, stopHour);
		stopTriggerStartDate.set(Calendar.MINUTE, stopMin);

		if (logger.isDebugEnabled()) {
			logger.debug("creating stop job for process "
					+ schedule.getProcessId()
					+ ". schedule information [stop trigger time :"
					+ stopTriggerStartDate.getTime() + "]");
		}
		if (stopTriggerStartDate.before(new GregorianCalendar())) {
			return false;
		} else {
			Trigger stopTrigger = new SimpleTrigger(schedule.getProcessId()
					+ STOP, GROUP, stopTriggerStartDate.getTime());
			context.getScheduler().scheduleJob(processStopJob, stopTrigger);
			return true;
		}
	}
}
