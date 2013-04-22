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
 * $Id: ProcessConfiguration.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 12, 2009 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;


/**
 * Represents process configuration.
 * 
 */
public class ProcessConfiguration implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Process Identifier <mandatory>
	 */
	private String id;
	
	private boolean running;
	
	
	private ProcessSchedule schedule;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the schedule
	 */
	public ProcessSchedule getSchedule() {
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(ProcessSchedule schedule) {
		this.schedule = schedule;
	}

	/**
	 * @return the running
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * @param running the running to set
	 */
	public void setRunning(boolean running) {
		this.running = running;
	}

}
