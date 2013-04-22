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
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine.event;

/**
 * State Machine trigger event interface.
 * 
 */
public interface Event {
	/**
	 * @return the name
	 */
	public String getName();

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name);

	/**
	 * @return the payload
	 */
	public Object getPayload();

	/**
	 * @param payload
	 *            the payload to set
	 */
	public void setPayload(Object payload);
}