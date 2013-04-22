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
 * $Id: EventManager.java
 */
package com.tfp.event;

/**
 * This file is provided by MCH team for TFP integration.
 */
public interface EventManager {
	
	/**
	 * Post the event passed.
	 * @param event The event.
	 */
	public void postEvent(Event event);
	
	/**
	 * Post the event with the passed event message and event level.
	 * @param eventMessage The event message.
	 * @param eventLevel the event level.
	 */
	public void postEvent(String eventMessage, EventLevel eventLevel);
}
