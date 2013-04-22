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
 * $Id: ProcessDefinitionManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 2, 2009 
 */

package com.headstrong.fusion.config.manager;

/**
 * 
 */
public interface ProcessDefinitionManager {
	public void write(String processId, byte[] processDefinition) throws Exception;
	
	public void delete(String processId) throws Exception;
}
