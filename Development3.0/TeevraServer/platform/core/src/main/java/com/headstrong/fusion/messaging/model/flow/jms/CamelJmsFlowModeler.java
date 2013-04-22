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
 * $Id: JmsFlowModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.messaging.model.flow.jms;

import org.apache.camel.builder.RouteBuilder;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.messaging.model.flow.ProcessFlowModeler;

/**
 * 
 */
public abstract class CamelJmsFlowModeler extends ProcessFlowModeler<RouteBuilder> {

	public void configure() throws ProcessModellingException,
			InitializationException {
		// TODO Auto-generated method stub
	}

	public RouteBuilder model() throws ProcessModellingException,
			InitializationException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
