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
 * $Id: SedaFlowModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.messaging.model.flow.st;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessMetaData;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.flow.FusionCamelRouteBuilder;
import com.headstrong.fusion.messaging.model.flow.ProcessFlowModeler;
import com.headstrong.fusion.messaging.model.flow.seda.CamelSedaFlow;

/**
 * This class creates a SEDA flow based on the {@link ProcessConfigurationModel}.
 * 
 */

public class CamelSTFlowModeler extends ProcessFlowModeler<RouteBuilder> {

	/**
	 * Camel Seda Flow...
	 */
	private final CamelSTFlow camelSTFlow;
	/**
	 * Apache Camel route builder.
	 */
	private RouteBuilder routeBuilder;

	/**
	 * camel context.
	 */
	private CamelProcessContext processContext;

	/**
	 * @param model
	 *            {@link ProcessConfigurationModel}
	 * @param camelSTFlow
	 *            {@link CamelSedaFlow}
	 */
	public CamelSTFlowModeler(CamelProcessContext processContext,
			Map<String, EndPointModeler> endPointModelers) {
		this.processContext = processContext;
		this.routeBuilder = new FusionCamelRouteBuilder(this);
		// Initialize the flow
		this.camelSTFlow = new CamelSTFlow(this.routeBuilder, endPointModelers,
				processContext);
		// Recovery manager is optional.
	}

	/**
	 * Method should not be invoked directly. {@link FusionCamelRouteBuilder}
	 * invokes this method.
	 * 
	 * @throws ProcessModellingException
	 * @throws InitializationException
	 */
	@SuppressWarnings("unchecked")
	protected final void configure() throws ProcessModellingException,
			InitializationException {
		String processId = this.getProcessContext()
				.getProcessConfigurationModel().getProcess().getId();
		// TODO: If JMS is enabled, then add recovery to JMS, else to file

		// adding exception handler
		// FIXME : By default recovery is turned off.
		this.getCamelSTFlow().addExceptionHandler(processId);

		Map<SourceSequence, List<SequenceType>> routes = new HashMap<SourceSequence, List<SequenceType>>();

		// Get the root node of all the routes.
		for (Route route : this.getProcessContext()
				.getProcessConfigurationModel().getProcess().getRoutes()) {
			// for every start route create a new entry in the map.
			if (route.isStart()) {
				SourceSequence sourceSequence = getFromSequence(route);
				EndPointSequence endPointSequence = getToSequence(route);
				List<SequenceType> routePath = new ArrayList<SequenceType>();
				routePath.add(endPointSequence);
				routes.put(sourceSequence, routePath);
				// complete the route.
				if (!route.isEnd()) {
					completeRoute(routePath, endPointSequence);
				}
			}
		}

		for (Entry<SourceSequence, List<SequenceType>> routeEntry : routes
				.entrySet()) {
			ProcessorDefinition processorType = null;
			processorType = this.getCamelSTFlow().addFrom(routeEntry.getKey(),
					processId);

			// TODO:: If route is start add default start savePoint.
			// for every destination sequence add route.

			SequenceType lastSequence = null;
			for (SequenceType sequence : routeEntry.getValue()) {
				lastSequence = sequence;
				processorType = this.getCamelSTFlow().addTo(processorType,
						sequence, processId);
			}
			// TODO:: If Route is End add default end savePoint
		}

		/**
		 * Add Error Routes if defined.
		 */
		this.createErrorRoutes();
	}

	private void completeRoute(List<SequenceType> routePath,
			EndPointSequence sequence) {
		for (Route route : this.getProcessContext()
				.getProcessConfigurationModel().getProcess().getRoutes()) {
			if (!route.isStart()) {
				SourceSequence sourceSequence = getFromSequence(route);
				EndPointSequence endPointSequence = getToSequence(route);
				if (sourceSequence.getEndPointId().equals(
						sequence.getEndPointId())) {
					routePath.add(sourceSequence);
					routePath.add(endPointSequence);
					if (!route.isEnd()) {
						completeRoute(routePath, endPointSequence);
					}
				}
			}
		}
	}

	private SourceSequence getFromSequence(Route route) {
		for (SequenceType sequenceType : route.getSequence()) {
			if (sequenceType instanceof SourceSequence) {
				return (SourceSequence) sequenceType;
			}
		}
		return null;
	}

	private EndPointSequence getToSequence(Route route) {
		for (SequenceType sequenceType : route.getSequence()) {
			if (sequenceType instanceof EndPointSequence) {
				return (EndPointSequence) sequenceType;
			}
		}
		return null;
	}

	/**
	 * Adds Error Routes.
	 * 
	 * For each {@link ErrorReporterConfig} specified in the
	 * {@link ProcessConfigurationModel} it creates an Error Route.
	 * <p>
	 * Any component that wants to publish error to this error reporter will
	 * have to format the error and publish the error to the input source queue
	 * (default SEDA queue) of this reporter.
	 * <p>
	 * Input queue of any endpoint can be retrieved for the
	 * {@link ProcessMetaData}.
	 * 
	 * @throws InitializationException
	 *             Exception thrown if initialization of route failed.
	 * @throws ProcessModellingException
	 *             Exception thrown if modeling failed.
	 */
	private void createErrorRoutes() throws InitializationException,
			ProcessModellingException {
		ProcessConfigurationModel processConfigurationModel = this.processContext
				.getProcessConfigurationModel();
		if (this.getProcessContext().getProcessConfigurationModel()
				.getErrorReporters() != null
				&& !processConfigurationModel.getErrorReporters().isEmpty()) {
			for (ErrorReporterConfig errorReporterConfig : processConfigurationModel
					.getErrorReporters()) {
				// for Each reporter create Error Route.
				this.getCamelSTFlow().createErrorRoute(errorReporterConfig,
						processConfigurationModel.getProcess().getId());
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.ProcessFlowModeler#model()
	 */
	public RouteBuilder model() throws ProcessModellingException,
			InitializationException {
		return routeBuilder;
	}

	/**
	 * @return the routeBuilder
	 */
	public RouteBuilder getRouteBuilder() {
		return routeBuilder;
	}

	/**
	 * @param routeBuilder
	 *            the routeBuilder to set
	 */
	public void setRouteBuilder(RouteBuilder routeBuilder) {
		this.routeBuilder = routeBuilder;
	}

	/**
	 * @return the camelSTFlow
	 */
	public CamelSTFlow getCamelSTFlow() {
		return camelSTFlow;
	}

	/**
	 * @return the processContext
	 */
	public CamelProcessContext getProcessContext() {
		return processContext;
	}

	/**
	 * @param processContext
	 *            the processContext to set
	 */
	public void setProcessContext(CamelProcessContext processContext) {
		this.processContext = processContext;
	}
}
