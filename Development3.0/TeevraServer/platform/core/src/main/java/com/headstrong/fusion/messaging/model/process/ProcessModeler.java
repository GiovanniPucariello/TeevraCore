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
 * $Id: ProcessModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.messaging.model.process;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.ProcessContext;

/**
 * Process modeler takes Process Configuration model as input and creates the
 * fusion process based on the process model.
 * 
 */
public interface ProcessModeler {

	/**
	 * Process modeler takes Process Configuration model as input and creates
	 * the fusion process based on the process model. *
	 * 
	 * @param model
	 *            Process Configuration model.
	 * @return Process Context ( process handler )
	 * @throws InitializationException
	 * @throws ProcessModellingException
	 */
	public ProcessContext createProcess(ApplicationContext applicationContext,
			ProcessConfigurationModel model) throws InitializationException,
			ProcessModellingException;
}
