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
 * $Id: AbstractEventFlowModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.messaging.model.flow;



/**
 * 
 * TODO Not in use right now!
 * 
 */
public abstract class AbstractEventFlowModeler extends ProcessFlowModeler {/*

	private static Logger logger = LoggerFactory
			.getLogger(AbstractEventFlowModeler.class);

	private CamelContext context;
	private ProcessConfigurationModel model;
	*//**
	 * 
	 *//*
	RouteBuilder routeBuilder;

	public AbstractEventFlowModeler(CamelContext context,
			ProcessConfigurationModel model) {
		this.context = context;
		this.model = model;
		routeBuilder = new FusionRouteBuilder(this);
	}

	*//**
	 * @return the model
	 *//*
	public ProcessConfigurationModel getModel() {
		return model;
	}

	*//**
	 * 
	 * @throws ProcessModellingException
	 * @throws InitializationException
	 *//*
	public final void configure() throws ProcessModellingException,
			InitializationException {

		for (SequenceType sequenceType : this.model.getProcessSequence()
				.getSequence()) {
			this.addRoute(routeBuilder, sequenceType);
		}
		try {
			this.context.addRoutes(routeBuilder);
		} catch (Exception e) {
			logger.error("Error creating the flow", e);
			throw new ProcessModellingException("Error creating the flow", e);
		}
	}

	public abstract void addRoute(RouteBuilder routeBuilder,
			SequenceType sequence) throws InitializationException, ProcessModellingException;

*/}
