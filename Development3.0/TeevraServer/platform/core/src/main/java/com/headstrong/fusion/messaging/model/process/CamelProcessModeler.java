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
 * $Id: CamelProcessModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 15, 2008 
 */

package com.headstrong.fusion.messaging.model.process;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.naming.Context;
import javax.naming.NamingException;

import org.apache.camel.CamelContext;
import org.apache.camel.Route;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.util.jndi.CamelInitialContextFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionConstants;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.RouterConfig;
import com.headstrong.fusion.config.SavepointConfig;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.ProcessContext;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.EndPointModelerFactory;
import com.headstrong.fusion.messaging.model.endpoint.binding.BindingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.error.ErrorRouteModeler;
import com.headstrong.fusion.messaging.model.endpoint.processor.MediationEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.RoutingEndPointModeler;
import com.headstrong.fusion.messaging.model.endpoint.routing.SavePointEndPointModeler;
import com.headstrong.fusion.messaging.model.flow.CamelFlow;
import com.headstrong.fusion.messaging.model.flow.ProcessFlowModeler;
import com.headstrong.fusion.messaging.model.flow.seda.CamelSedaFlowModeler;
import com.headstrong.fusion.messaging.model.flow.st.CamelSTFlowModeler;

/**
 * This class models the process based on the {@link ProcessConfigurationModel}.
 * {@link ProcessConfigurationModel} contains the configuration details of
 * EndPoints and message mediation and routing sequence.
 * <p>
 * {@link CamelProcessModeler} initializes all the EndPoints (
 * <code>Binding EndPoints, 
 * Mediation EndPoints and Routing EndPoints).
 * Based on the Flow type initializes {@link ProcessFlowModeler}.
 * <p> {@link ProcessFlowModeler} creates message mediation and routing 
 * sequence based on the configuration provided.
 *
 */
public class CamelProcessModeler implements ProcessModeler {

	/**
	 * Logger.
	 */
	private static Logger logger = LoggerFactory
			.getLogger(CamelProcessModeler.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.ProcessModeler#createProcess(com
	 *      .headstrong.fusion.config.ProcessConfigurationModel)
	 */
	/**
	 * Default implementation <code> {@link CamelProcessModeler} </code> creates
	 * a {@link CamelContext} and adds {@link Route} based on the message
	 * mediation and routing sequence specified in the
	 * {@link ProcessConfigurationModel}.
	 * 
	 */
	public ProcessContext createProcess(ApplicationContext applicationContext,
			ProcessConfigurationModel model) throws InitializationException,
			ProcessModellingException {

		CamelProcessContext processContext = this.createProcessContext(
				applicationContext, model);

		Map<String, EndPointModeler> endPointModelers = this
				.initializeEndPoints(processContext);
		/*
		 * // 3: Initialize Recovery Manager
		 * this.registerRecoveryManager(processContext);
		 */// 4: Initialize Process Flow Modeler.
		ProcessFlowModeler<RouteBuilder> processFlowModeler = this
				.createProcessFlowModeler(processContext, endPointModelers);
		// configures the camel context.
		try {
			processContext.getCamelContext().addRoutes(
					processFlowModeler.model());
		} catch (Exception e) {
			logger.error("Error creating the flow", e);
			throw new ProcessModellingException("Error creating the flow", e);
		}
		((DefaultCamelContext) processContext.getCamelContext()).setName(model
				.getProcess().getName());
		processContext.setCamelContext(processContext.getCamelContext());
		return processContext;
	}

	/**
	 * Creates a {@link CamelContext} object.
	 * 
	 * @return Camel process context.
	 * @throws InitializationException
	 *             If the initialization of the process context fails.
	 */
	private CamelProcessContext createProcessContext(
			ApplicationContext applicationContext,
			ProcessConfigurationModel model) throws InitializationException {
		CamelContext camelContext;
		// steps
		// 1: Initialize Default Camel Context with default JNDI Registry
		// Set the JNDI Registry too
		CamelInitialContextFactory contextFactory = new CamelInitialContextFactory();
		Context jndiContext = null;
		try {
			jndiContext = contextFactory
					.getInitialContext(new Hashtable<Object, Object>());
		} catch (NamingException e) {
			logger.error("Error while getting the initial context", e);
			throw new InitializationException(
					"Error while getting the initial context", e);
		}
		camelContext = new DefaultCamelContext(jndiContext);
		CamelProcessContext processContext = new CamelProcessContext(
				applicationContext, model);
		processContext.setCamelContext(camelContext);
		return processContext;
	}

	/**
	 * Initializes all the mediation and binding EndPoints.
	 * 
	 * @throws InitializationException
	 */
	private Map<String, EndPointModeler> initializeEndPoints(
			CamelProcessContext processContext) throws InitializationException {
		Map<String, EndPointModeler> endPointModelers = new HashMap<String, EndPointModeler>();
		ProcessConfigurationModel model = processContext
				.getProcessConfigurationModel();
		// 1: Initialize Mediation EndPoints
		for (MediatorConfig mediatorConfig : model.getMediators()) {
			// Get the EndPointModeler from the factory.
			MediationEndPointModeler endPoint = (MediationEndPointModeler) EndPointModelerFactory
					.getEndPoint(EndPointModelerFactory.ENDPOINT.MEDIATION
							.toString());
			// Initialize the EndPointModeler with the configuration.
			endPoint.init(processContext, mediatorConfig, model.getProcess()
					.getId());
			endPointModelers.put(mediatorConfig.getId(), endPoint);
		}
		// 2: Initialize Connectors
		for (ConnectorConfig connector : model.getConnectors()) {
			// Get the EndPointModeler from the factory.
			logger.debug("Getting endpoint of type :" + connector.getType());
			BindingEndPointModeler endPoint = (BindingEndPointModeler) EndPointModelerFactory
					.getEndPoint(connector.getType());
			if (connector.getProperties() == null) {
				connector.setProperties(new HashMap<String, String>());
			} else {
				connector.getProperties().put(FusionConstants.PROCESS_ID,
					model.getProcess().getId());
			}
			// Initialize the EndPointModeler with the configuration.
			endPoint.init(processContext, connector);
			endPointModelers.put(connector.getId(), endPoint);
		}
		// Initialize Routing EndPoints
		for (RouterConfig router : model.getRouters()) {
			// Get the EndPointModeler from the factory.

			RoutingEndPointModeler endPoint = (RoutingEndPointModeler) EndPointModelerFactory
					.getEndPoint(router.getClass().getName());
			// Initialize the EndPointModeler with the configuration.
			endPoint.init(processContext, router);
			endPointModelers.put(router.getId(), endPoint);
		}
		// Initialize Routing EndPoints
		for (ErrorReporterConfig errorReporterConfig : model
				.getErrorReporters()) {
			// Get the EndPointModeler from the factory.
			ErrorRouteModeler errorRouteModeler = (ErrorRouteModeler) EndPointModelerFactory
					.getEndPoint(EndPointModelerFactory.ENDPOINT.ERROR
							.toString());
			// Initialize the EndPointModeler with the configuration.
			errorRouteModeler.init(processContext, errorReporterConfig);
			endPointModelers
					.put(errorReporterConfig.getId(), errorRouteModeler);
		}
		// Add Default start savePoint.
		endPointModelers.put(FusionConstants.DEFAULT_RECEIVED_SP_NAME, this
				.initializeSavePoint(processContext,
						FusionConstants.DEFAULT_RECEIVED_SP_NAME));
		// Add Default End savePoint.
		endPointModelers.put(FusionConstants.DEFAULT_END_SP_NAME, this
				.initializeSavePoint(processContext,
						FusionConstants.DEFAULT_END_SP_NAME));
		return endPointModelers;
	}

	/**
	 * Based on the Flow type creates the {@link ProcessFlowModeler}.
	 * 
	 * @param model
	 *            {@link ProcessConfigurationModel}
	 * @param camelContext
	 *            {@link CamelContext}
	 * @param flow
	 *            {@link CamelFlow}
	 * @return {@link ProcessFlowModeler}
	 */
	private ProcessFlowModeler<RouteBuilder> createProcessFlowModeler(
			CamelProcessContext processContext,
			Map<String, EndPointModeler> endPointModelers) {
		ProcessFlowModeler<RouteBuilder> processFlowModeler = null;
		if (processContext.getProcessConfigurationModel().getProcess()
				.getFlow()
				.equalsIgnoreCase(CamelFlow.FLOW_TYPE.SEDA.toString())) {
			processFlowModeler = new CamelSedaFlowModeler(processContext,
					endPointModelers);
		} else if (processContext.getProcessConfigurationModel().getProcess()
				.getFlow().equalsIgnoreCase(CamelFlow.FLOW_TYPE.ST.toString())) {
			processFlowModeler = new CamelSTFlowModeler(processContext,
					endPointModelers);
		}
		return processFlowModeler;
	}

	/**
	 * Initializes Default start SavePoint.
	 * 
	 * @throws InitializationException
	 * @precondition
	 * @postcondition
	 */
	private EndPointModeler initializeSavePoint(ProcessContext processContext,
			String savepointName) throws InitializationException {
		SavePointEndPointModeler endpoint = (SavePointEndPointModeler) EndPointModelerFactory
				.getEndPoint(EndPointModelerFactory.ENDPOINT.SAVEPOINT
						.toString());
		SavepointConfig config = new SavepointConfig();
		config.setId(savepointName);
		endpoint.init(processContext, config);
		return endpoint;
	}
}
