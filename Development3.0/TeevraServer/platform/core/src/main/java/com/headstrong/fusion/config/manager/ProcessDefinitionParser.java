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
 * $Id: ProcessConfigurationParser.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 15, 2008 
 */

package com.headstrong.fusion.config.manager;

import java.io.File;

import com.headstrong.fusion.commons.exception.ConfigurationException;
import com.headstrong.fusion.config.ProcessConfigurationModel;

/**
 * Parses the Process Definition File and Generates Process
 * Configuration Model.
 * 
 */
public interface ProcessDefinitionParser {

	public ProcessConfigurationModel parseProcessDefinition(
			File processDefinition) throws ConfigurationException;

}
