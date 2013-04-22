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
 * $Id: ProcessFlowModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.messaging.model.flow;

import org.apache.camel.builder.RouteBuilder;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.messaging.model.process.ProcessModeler;

/**
 * Flow Types supported
 * <p>
 * <li>SEDA</li>
 * <li>JMS</li>
 * <li>ST</li>
 * <li>ST-SYNC</li>
 * 
 */
public abstract class ProcessFlowModeler<T> {
	
	/**
	 * This abstract method would only be invoked inside
	 * {@link FusionCamelRouteBuilder#configure()} method.
	 * <p> method is made protected so that {@link ProcessModeler}
	 * doesn't have access to this method.
	 * 
	 * @precondition <code>invoker</code> instanceof {@link RouteBuilder}
	 * @throws ProcessModellingException
	 * @throws InitializationException
	 */
	protected abstract void configure() throws ProcessModellingException , InitializationException;
	
	/**
	 * Models the flow based on the {@link ProcessConfigurationModel}.
	 * 
	 * @throws ProcessModellingException
	 * @throws InitializationException
	 */
	public abstract T model() throws ProcessModellingException , InitializationException;
}
