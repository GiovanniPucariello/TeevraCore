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
 * $Id: ProcessManager.java
 */
package com.tfp.interfaces;

import com.tfp.event.Event;
/**
 * This file is provided by MCH team for TFP integration.
 */
public interface ProcessManager {
	
	/**
	 * Get the process object.
	 * @return The process object.
	 */
	public ProcessObject getInputProcessObject();
	/**
	 * set the process object.
	 * @param inputProcessObject The process object.
	 * @throws Exception
	 */
	public void setInputProcessObject(ProcessObject inputProcessObject) throws Exception;
	
	/**
	 * Post the passed event.
	 * @param event The event.
	 * @throws Exception
	 */
	public void postEvent(Event event) throws Exception;
}
