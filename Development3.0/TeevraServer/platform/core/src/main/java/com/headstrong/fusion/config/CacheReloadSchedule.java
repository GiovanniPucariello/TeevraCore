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
 * $Id: ProcessSchedule.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Oct 13, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.Date;

/**
 * Represents Process scheduling information.
 * 
 */
public class CacheReloadSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8236690502546274124L;
	
	/**
	 * Process Identifier <mandatory>
	 */
	private String cacheName;
	/**
	 * Process start time <optional> Default <current time>
	 */
	private Date scheduleStartTime;

	/**
	 * process start cronExpression
	 */
	private String cronExpression;

	/**
	 * Process stop time <optional>
	 */
	private Date scheduleStopTime;

	/**
	 * @return the processId
	 */
	public String getCacheName() {
		return cacheName;
	}

	/**
	 * @param processId
	 *            the processId to set
	 */
	public void setCacheName(String dataName) {
		this.cacheName = dataName;
	}

	/**
	 * @return the startTime
	 */
	public Date getScheduleStartTime() {
		return scheduleStartTime;
	}

	/**
	 * @param scheduleStartTime
	 *            the scheduleStartTime to set
	 */
	public void setScheduleStartTime(Date scheduleStartTime) {
		this.scheduleStartTime = scheduleStartTime;
	}

	/**
	 * @return the stopTime
	 */
	public Date getScheduleStopTime() {
		return scheduleStopTime;
	}

	/**
	 * @param scheduleStopTime
	 *            the scheduleStopTime to set
	 */
	public void setScheduleStopTime(Date scheduleStopTime) {
		this.scheduleStopTime = scheduleStopTime;
	}

	/**
	 * @return the cron
	 */
	public String getCronExpression() {
		return cronExpression;
	}

	/**
	 * @param cronExpression
	 *            the cron to set
	 */
	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}
}
