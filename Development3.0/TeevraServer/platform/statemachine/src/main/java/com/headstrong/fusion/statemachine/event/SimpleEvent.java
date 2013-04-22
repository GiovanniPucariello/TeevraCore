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
 * $Id: SimpleEvent.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.event;

/**
 * 
 */
public class SimpleEvent implements Event {
	/**
	 * Event Name;
	 */
	private String name;
    /**
     * The event payload.
     *
     */
    private Object payload;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the payload
	 */
	public Object getPayload() {
		return payload;
	}
	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	
}
