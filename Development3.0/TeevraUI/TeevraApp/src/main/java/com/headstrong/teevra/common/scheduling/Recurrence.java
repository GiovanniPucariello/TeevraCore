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
 * $Id: Recurrence.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 13, 2008 
 */
package com.headstrong.teevra.common.scheduling;

public interface Recurrence {
	public static String SPACE = " ";

	public ExecutionTime getExecutionTime();

	public void setExecutionTime(ExecutionTime executionTime);

	public RecurrenceRange getRecurrenceRange();

	public void setRecurrenceRange(RecurrenceRange recurrenceRange);

	public String getCronExpression();

}
