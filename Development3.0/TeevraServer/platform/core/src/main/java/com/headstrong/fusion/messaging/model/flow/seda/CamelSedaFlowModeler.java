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

package com.headstrong.fusion.messaging.model.flow.seda;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.config.MultiCastRouterConfig;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessMetaData;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.flow.FusionCamelRouteBuilder;
import com.headstrong.fusion.messaging.model.flow.ProcessFlowModeler;
import com.headstrong.fusion.config.Process;

/**
 * This class creates a SEDA flow based on the {@link ProcessConfigurationModel} .
 * 
 */

public class CamelSedaFlowModeler extends ProcessFlowModeler<RouteBuilder> {

	/**
	 * Camel Seda Flow...
	 */
	private final CamelSedaFlow camelSedaFlow;
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
	 * @param camelSedaFlow
	 *            {@link CamelSedaFlow}
	 */
	public CamelSedaFlowModeler(CamelProcessContext processContext,
			Map<String, EndPointModeler> endPointModelers) {
		this.processContext = processContext;
		this.routeBuilder = new FusionCamelRouteBuilder(this);
		// Initialize the flow
		this.camelSedaFlow = new CamelSedaFlow(this.routeBuilder,
				endPointModelers, processContext);
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
		
		String processId = this.getProcessContext().getProcessId();
		// adding exception handler
		this.getCamelSedaFlow().addExceptionHandler(processId);
		
		this.getCamelSedaFlow().addErrorEventLoggingRoute();
		boolean recoveryOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess().isToRecover();
		boolean msgEvntlogOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess().isToLogMsgEvents();
		boolean compEvntlogOn = this.getProcessContext()
				.getProcessConfigurationModel().getProcess()
				.isToLogCompEvents();
		
		// Inform process context if the process has a multicast component.
		// This info is required only during recovery.
		if (recoveryOn) {
			for (RouterConfig route : this.getProcessContext()
					.getProcessConfigurationModel().getRouters()) {

				if (route instanceof MultiCastRouterConfig) {
					this.getProcessContext().setMulticastProcess(true);
					break;
				}
			}
		}

		for (Route route : this.getProcessContext()
				.getProcessConfigurationModel().getProcess().getRoutes()) {
			ProcessorDefinition processorType = null;
			for (SequenceType sequenceType : route.getSequence()) {

				if (sequenceType instanceof SourceSequence) {
					SourceSequence sourceSequence = (SourceSequence) sequenceType;
					/**
					 * if the message event logging is required, then only add
					 * the message received flow
					 */
					/*
					 * // set headers processorType = this.getCamelSedaFlow()
					 * .addMessageHeaderSetFlow(sequenceType, processorType);
					 */
					processorType = this.getCamelSedaFlow().addFrom(
							sourceSequence, processId);
					// If route is start add default start savePoint.
					if (route.isStart()) {

						if (msgEvntlogOn) {
							processorType = this.getCamelSedaFlow()
									.addMessageReceivedFlow(sequenceType,
											processorType);
						}
						if (recoveryOn) {
							/**
							 * If recovery is enabled then only store message
							 * for recovery.
							 */
							processorType = this.getCamelSedaFlow()
									.addSourceRecoveryFlow(processorType,
											sourceSequence);
						}
					}
				} else {
					processorType = this.getCamelSedaFlow().addTo(
							processorType, sequenceType, processId);
					// If Route is End add default end savePoint
					if (route.isEnd()) {
						/**
						 * if the message event logging is required, then only
						 * add the message delivered flow
						 */
						if (msgEvntlogOn) {
							processorType = this.getCamelSedaFlow()
									.addMessageDeliveredFlow(sequenceType,
											processorType);

						}
						if (recoveryOn) {
							/**
							 * If recovery is enabled then only add the flow to
							 * mark message for deletion.
							 */
							// Processed table will store the processed
							// endpoints
							if (this.getProcessContext().isMulticastProcess()) {
								processorType = this.getCamelSedaFlow()
										.addMarkMessageForDeletionFlow(
												processorType,
												getPrevMulticastComponentForRoute(route),
												sequenceType.getEndPointId());
							} else {
								processorType = this.getCamelSedaFlow()
									.addMarkMessageForDeletionFlow(
											processorType);
							}
						}
					}

				}
			}
		}
		/**
		 * Add Error Routes if defined.
		 */
		this.createErrorRoutes();
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
				this.getCamelSedaFlow().createErrorRoute(errorReporterConfig,
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
	 * @return the camelSedaFlow
	 */
	public CamelSedaFlow getCamelSedaFlow() {
		return camelSedaFlow;
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
	
	/**
	 * Fetch the multicast component the route is generating from.
	 * 
	 * @param currentRoute
	 *            Current route
	 * @return The component Id of the multicast component.
	 */
	private String getPrevMulticastComponentForRoute(Route currentRoute) {

		Iterator<SequenceType> actualRouteItr = currentRoute.getSequence()
				.iterator();
		SequenceType actualSeqType = actualRouteItr.next();
		SequenceType currentSrcSeqType = (actualSeqType instanceof SourceSequence) ? actualSeqType
				: actualRouteItr.next();

		// Check if the source sequence is a multicast target. If so, then fetch
		// the multicast Id.
		String multiId = getMulticastId(currentSrcSeqType.getEndPointId());
		if (multiId != null) {
			return multiId;
		} else {
			Process process = this.processContext
					.getProcessConfigurationModel().getProcess();
			for (Route route : process.getRoutes()) {
				Iterator<SequenceType> routeSeqItr = route.getSequence()
						.iterator();
				SequenceType seqType = routeSeqItr.next();
				SequenceType endSeqType = (seqType instanceof EndPointSequence) ? seqType
						: routeSeqItr.next();

				// If this is the end route, return the end sequence.
				if (endSeqType.getEndPointId().equals(
						currentSrcSeqType.getEndPointId())) {
					return getPrevMulticastComponentForRoute(route);
				}
			}
		}
		return null;
	}

	/**
	 * Get the multicast component for the passed target.
	 * 
	 * @param compoId
	 *            The target.
	 * @return Null if the component is not a multicast target.
	 */
	private String getMulticastId(String compoId) {
		List<RouterConfig> routerList = processContext
				.getProcessConfigurationModel().getRouters();

		for (RouterConfig routerConfig : routerList) {
			if (routerConfig instanceof MultiCastRouterConfig) {
				List<EndPointSequence> endPointSeqList = ((MultiCastRouterConfig) routerConfig)
						.getTargets();
				for (EndPointSequence multicastTarget : endPointSeqList) {
					if (multicastTarget.getEndPointId().equals(compoId)) {
						return routerConfig.getId();
					}
				}

			}
		}
		return null;
	}
	
}
