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
 * $Id: StateController.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons;

/**
 * Controls state of the process.
 * 
 */
public interface ProcessStateController {

	/**
	 * Component can register the events
	 * 
	 * @param event
	 */
	void registerEvent(ComponentEvent event);

	/**
	 * Component can register state observers.
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateObserver
	 */
	void registerStateObserver(StateObserver stateObserver);

	/**
	 * Clears all the events registered.
	 * 
	 */
	void clear();
	
	/**
	 * Registers producer / consumer by their respective service Id
	 * @param serviceId
	 */
	void registerByServiceId(String serviceId);
}
