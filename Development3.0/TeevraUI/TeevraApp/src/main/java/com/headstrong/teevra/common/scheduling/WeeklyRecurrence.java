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
package com.headstrong.teevra.common.scheduling;

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
			switch (dayOfWeek) {
			case WeeklyRecurrence.SUNDAY:
				cronExpression.append("SUN");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.MONDAY:
				cronExpression.append("MON");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.TUESDAY:
				cronExpression.append("TUE");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.WEDNESDAY:
				cronExpression.append("WED");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.THURSDAY:
				cronExpression.append("THU");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.FRIDAY:
				cronExpression.append("FRI");
				cronExpression.append(",");
				break;
			case WeeklyRecurrence.SATURDAY:
				cronExpression.append("SAT");
				cronExpression.append(",");
				break;
			}
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
