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
 * $Id: FusionService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 6, 2009 
 */

package com.headstrong.fusion.commons.component;

/**
 * Represents the core lifecycle API for POJOs which can be started and stopped
 * 
 */
public interface FusionService {

	/**
	 * Starts the service
	 * 
	 * @throws Exception
	 */
	void start() throws Exception;

	/**
	 * Stops the service
	 * 
	 * @throws Exception
	 */
	void stop() throws Exception;
	
	
	
	
}
