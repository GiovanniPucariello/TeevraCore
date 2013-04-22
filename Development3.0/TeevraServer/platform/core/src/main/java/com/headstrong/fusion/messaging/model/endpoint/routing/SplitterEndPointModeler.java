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
 * $Id: SavePointEndPointModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 26, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.routing;

import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SplitterConfig;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;
import com.headstrong.fusion.messaging.service.SplitterService;

/**
 * Configures a camel route with splitting of message based on the strategy.
 * Route created is.
 * <p>
 * <code>-> splitter service {splitter strategy based splitting} -> splitter {camel
 * splitter} </code>
 */
public class SplitterEndPointModeler implements RoutingEndPointModeler {

	/**
	 * Boolean variable defines the endpoint is active or not.
	 */
	private boolean isActive = false;
	/**
	 * Splitter configuration.
	 */
	private SplitterConfig config;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.routing.RoutingEndPointModeler
	 * #init(com.headstrong.fusion.core.ApplicationContext,
	 * com.headstrong.fusion.config.RouterConfig)
	 */
	public void init(ProcessContext processContext, RouterConfig config)
			throws InitializationException {
		// Application Context is redundant in this context. Since method is
		// being overridden the signature can't be changed.
		// This passed context is just being ignored.
		this.setActive(true);
		this.config = (SplitterConfig) config;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.routing.RoutingEndPointModeler
	 * #model(com.headstrong.fusion.messaging.model.flow.CamelFlow,
	 * org.apache.camel.model.ProcessorType,
	 * com.headstrong.fusion.config.SequenceType, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public ProcessorDefinition model(CamelFlow flow, ProcessorDefinition processorType,
			SequenceType sequence, String processId)
			throws ProcessModellingException, InitializationException {
		SplitterService splitterService = new SplitterService(
				(SplitterConfig) this.getConfig());
		ProcessorDefinition splitterProcessType = processorType.process(
				splitterService).split(flow.getRouteBuilder().body());
		return splitterProcessType;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.EndPointModeler#isActive()
	 */
	public boolean isActive() {
		return this.isActive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.EndPointModeler#setActive
	 * (boolean)
	 */
	public void setActive(boolean active) {
		this.isActive = active;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.routing.RoutingEndPointModeler
	 * #getConfig()
	 */
	public SplitterConfig getConfig() {
		return config;
	}
}
