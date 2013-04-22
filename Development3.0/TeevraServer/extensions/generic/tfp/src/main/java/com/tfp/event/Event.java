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
 * $Id: Event.java
 */

package com.tfp.event;

/**
 * This file is provided by MCH team for TFP integration.
 */
public class Event {

	/**
	 * Event Manager.
	 */
	private String eventMessage;
	/**
	 * Event level.
	 */
	private EventLevel eventLevel;

	/**
	 * Create an event.
	 * @param eventMessage The event message.
	 * @param eventLevel The event level.
	 */
	public Event(String eventMessage, EventLevel eventLevel) {
		this.eventMessage = eventMessage;
		this.eventLevel = eventLevel;
	}

	/**
	 * Fetch event message.
	 * @return The Event message.
	 */
	public String getEventMessage() {
		return eventMessage;
	}

	/**
	 * Set the event message.
	 * @param eventMessage The Event message.
	 */
	public void setEventMessage(String eventMessage) {
		this.eventMessage = eventMessage;
	}

	/**
	 * Fetches the event level.
	 * @return The event level.
	 */
	public EventLevel getEventLevel() {
		return eventLevel;
	}

	/**
	 * Set the event level.
	 * @param eventLevel The event level.
	 */
	public void setEventLevel(EventLevel eventLevel) {
		this.eventLevel = eventLevel;
	}
}
