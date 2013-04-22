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

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.model.ProcessorDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.core.recovery.RecoveryManager;
import com.headstrong.fusion.core.recovery.RecoveryProcessor;
import com.headstrong.fusion.messaging.model.flow.AbstractFlow;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;

/**
 * <b>SavePoint<b> sends data to recovery queue as provided by the
 * {@link RecoveryManager}.
 * <p>
 * Every Process has by default two <code>SavePoints</code>.
 * <li>At the Start of the {@link Route}.
 * <li>At the End of the {@link Route}.
 * <p>
 * Apart from this user can also specify intermediate SavePoints. On encounter
 * of every SavePoint the message would be send to the Recovery Queue.
 * 
 */
public class SavePointEndPointModeler implements RoutingEndPointModeler {

	private static Logger logger = LoggerFactory
			.getLogger(SavePointEndPointModeler.class);

	/**
	 * Configuration details.
	 */
	private RouterConfig config;
	private boolean isActive = false;
	private ProcessContext processContext;

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.messaging.endpoint.model.routing.RoutingEndPointModeler
	 * #getConfig()
	 */
	public RouterConfig getConfig() {
		return config;
	}

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
		this.processContext = processContext;
		this.config = config;
		this.isActive = true;
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
		ProcessorDefinition newProcessorType = null;
		final String savepointName = sequence.getEndPointId() + "_"
				+ this.getConfig().getId();
		if (logger.isDebugEnabled()) {
			logger.debug("Creating a savepoint model for savepoint "
					+ savepointName);
		}
		Endpoint sedaEndpoint = ((AbstractFlow) flow)
				.getSourceSedaEndpoint(processId, savepointName);
		Processor recoveryProcessor = new RecoveryProcessor(
				this.processContext, savepointName);
		processorType.process(recoveryProcessor).to(sedaEndpoint);
		// from is required to create a new route to take data forward.
		newProcessorType = flow.getRouteBuilder().from(sedaEndpoint).process(
				new PostRecoveryQueueProcessor());
		return newProcessorType;
	}

	private static class PostRecoveryQueueProcessor implements Processor {
		@Override
		public void process(Exchange arg0) throws Exception {
			// 

		}

	}
}
