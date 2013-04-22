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
 * $Id: ProcessorEndPointModeler.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.messaging.model.endpoint.processor;

import org.apache.camel.Processor;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;

/**
 * @author som krishan
 *
 */
public interface ProcessorEndPointModeler extends EndPointModeler {

	/**
	 * Returns the {@link Processor}
	 * 
	 * @return Processor 
	 * @throws InitializationException
	 */
	public Processor getProcessor() throws InitializationException;
}
