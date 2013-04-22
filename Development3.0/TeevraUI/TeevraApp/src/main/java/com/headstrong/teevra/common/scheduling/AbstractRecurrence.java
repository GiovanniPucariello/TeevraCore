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
 * $Id: AbstractRecurrence.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 13, 2008 
 */
package com.headstrong.teevra.common.scheduling;

/**
 * 
 */
public abstract class AbstractRecurrence implements Recurrence {

	private ExecutionTime executionTime;
	private RecurrenceRange recurrenceRange;
	private Long recurrenceGap;

	/**
	 * @return the executionTime
	 */
	public ExecutionTime getExecutionTime() {
		return executionTime;
	}

	/**
	 * @param executionTime
	 *            the executionTime to set
	 */
	public void setExecutionTime(ExecutionTime executionTime) {
		this.executionTime = executionTime;
	}

	/**
	 * @return the recurrenceRange
	 */
	public RecurrenceRange getRecurrenceRange() {
		return recurrenceRange;
	}

	/**
	 * @param recurrenceRange
	 *            the recurrenceRange to set
	 */
	public void setRecurrenceRange(RecurrenceRange recurrenceRange) {
		this.recurrenceRange = recurrenceRange;
	}

	/**
	 * @return the recurrenceGap
	 */
	public Long getRecurrenceGap() {
		return recurrenceGap;
	}

	/**
	 * @param recurrenceGap
	 *            the recurrenceGap to set
	 */
	public void setRecurrenceGap(Long recurrenceGap) {
		this.recurrenceGap = recurrenceGap;
	}

	public String getCronExpression() {
		StringBuilder cronExpression = new StringBuilder();
		Long startTime = this.getExecutionTime().getStartTime();
		Long minutes = startTime % 60;
		Long hour = startTime / 60;

		// seconds not supported
		cronExpression.append("0");
		cronExpression.append(Recurrence.SPACE);
		// minutes as specified
		cronExpression.append(minutes);
		cronExpression.append(Recurrence.SPACE);
		// hours as specified
		cronExpression.append(hour);
		cronExpression.append(Recurrence.SPACE);
		return cronExpression.toString();
	}

}
