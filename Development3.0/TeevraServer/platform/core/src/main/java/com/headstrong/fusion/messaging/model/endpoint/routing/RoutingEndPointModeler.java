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
 * $Id: RoutingEndPointModeler.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.messaging.model.endpoint.routing;

import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;

/**
 *
 */
public interface RoutingEndPointModeler extends EndPointModeler {
	@SuppressWarnings("unchecked")
	public ProcessorDefinition model(CamelFlow flow, ProcessorDefinition processorType,
			SequenceType sequence, String processId)
			throws ProcessModellingException, InitializationException;

	/**
	 * initialize the modeler.
	 * 
	 * @param processContext
	 *            process context.
	 * @param config
	 *            endpoint configuration.
	 * @throws InitializationException
	 */
	public void init(ProcessContext processContext, RouterConfig config)
			throws InitializationException;

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.messaging.model.endpoint.EndPointModeler#getConfig()
	 */
	public RouterConfig getConfig();

}
