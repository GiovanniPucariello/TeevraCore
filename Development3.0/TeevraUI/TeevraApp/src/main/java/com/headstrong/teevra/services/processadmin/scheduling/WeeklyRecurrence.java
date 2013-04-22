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
 * $Id: WeeklyRecurrence.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 13, 2008 
 */
package com.headstrong.teevra.services.processadmin.scheduling;

import java.util.List;

/**
 * 
 */
public class WeeklyRecurrence extends AbstractRecurrence {

	public static final int SUNDAY = 1;

	public static final int MONDAY = 2;

	public static final int TUESDAY = 3;

	public static final int WEDNESDAY = 4;

	public static final int THURSDAY = 5;

	public static final int FRIDAY = 6;

	public static final int SATURDAY = 7;

	private List<Integer> daysOfWeek;

	public List<Integer> getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(List<Integer> daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public String getCronExpression() {
		// AbstractRecurrence.getCronExpression() creates the start time part of
		// the cron expression.
		StringBuilder cronExpression = new StringBuilder(super
				.getCronExpression());

		// Day of Month -- depends on Week entries
		cronExpression.append("?");
		cronExpression.append(Recurrence.SPACE);

		// Month
		cronExpression.append("*");
		cronExpression.append(Recurrence.SPACE);

		// Day of Week

		for (Integer dayOfWeek : this.getDaysOfWeek()) {
			cronExpression.append(dayOfWeek);
			cronExpression.append(",");
		}
		cronExpression = new StringBuilder(cronExpression.subSequence(0,
				cronExpression.length() - 1));
		if (this.getRecurrenceGap() != 0) {
			cronExpression.append("/");
			cronExpression.append(this.getRecurrenceGap());
		}
		cronExpression.append(Recurrence.SPACE);

		return cronExpression.toString();
	}

}
