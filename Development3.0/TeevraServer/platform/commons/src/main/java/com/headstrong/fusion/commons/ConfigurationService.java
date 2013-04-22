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
 * $Id: ConfigurationService.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 30, 2008 
 */

package com.headstrong.fusion.commons;


/**
 * 
 */
public interface ConfigurationService {
	public void reloadConfiguration() throws Exception;

	public void reloadConfiguration(String processId)
			throws Exception;

}
