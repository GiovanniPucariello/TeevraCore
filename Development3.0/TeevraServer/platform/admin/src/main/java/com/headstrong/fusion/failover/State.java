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
 * $Id: State.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 20, 2009 
 */

package com.headstrong.fusion.failover;

/**
 * Represents the state of the Fusion server. By default the server is in
 * standby mode unless it's marked as a master.
 * 
 */
public enum State {
	NEW, // New application
 
	STARTING, // Currently not in use. 

	ACTIVE, // Application Active
	// Admin sets the status to ACTIVE which should be changed
	// to RUNNING by core module on successful initialization only.
	
	RUNNING,
	// Application started.
	
	STANDBY
	// Application in stand-by mode.
}
