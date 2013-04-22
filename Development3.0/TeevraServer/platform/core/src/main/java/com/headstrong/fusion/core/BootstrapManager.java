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
 * $Id: Bootstrap.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.core;


/**
 * Fusion bootstrap API.
 */
public interface BootstrapManager {
	
	/**
	 * Initializes the core framework.
	 */
	public void bootstrap() throws Exception;
	public void pause() throws Exception;

}
