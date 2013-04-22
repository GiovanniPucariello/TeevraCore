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
 * $Id: DailyRecurrence.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 13, 2008 
 */
package com.headstrong.teevra.services.processadmin.scheduling;

public class DailyRecurrence extends AbstractRecurrence {

	private boolean runOnWeekDay;

	public boolean isRunOnWeekDay() {
		return runOnWeekDay;
	}

	public void setRunOnWeekDay(boolean runOnWeekDay) {
		this.runOnWeekDay = runOnWeekDay;
	}

	public String getCronExpression() {
		// AbstractRecurrence.getCronExpression() creates the start time part of
		// the cron expression.
		StringBuilder cronExpression = new StringBuilder(super
				.getCronExpression());

		// Day of Month
		if (this.isRunOnWeekDay()) {
			// Process will be run on weekdays only
			// recurrence gap will be ignored
			cronExpression.append("?");
			cronExpression.append(Recurrence.SPACE);
			// Month
			cronExpression.append("*");
			cronExpression.append(Recurrence.SPACE);

			// Day of Week
			cronExpression.append("MON-FRI");
			cronExpression.append(Recurrence.SPACE);
		} else {
			cronExpression.append("1");
			cronExpression.append("/");
			cronExpression.append(this.getRecurrenceGap());
			cronExpression.append(Recurrence.SPACE);
			// Month
			cronExpression.append("*");
			cronExpression.append(Recurrence.SPACE);

			// Day of Week
			cronExpression.append("?");
			cronExpression.append(Recurrence.SPACE);
		}

		return cronExpression.toString();
	}
}
