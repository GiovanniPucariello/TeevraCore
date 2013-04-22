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
 * $Id: DefaultProcessEnricherTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 12, 2010 
 */

package com.headstrong.fusion.config.manager;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.config.ErrorReportingConfig;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.ProcessConfigurationModel;

/**
 * 
 */
public class DefaultProcessDefinitionEnricherTest extends TestCase {

	public void testEnrichConnectorConfig() throws Exception {
		/**
		 * Error Configuration
		 */
		OnErrorConfig onErrorConfig = new OnErrorConfig();
		onErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig eConfig = new ErrorHandlingStrategyConfig();
		eConfig.setBatch(false);
		eConfig.setStrategy("Abort");
		onErrorConfig.setErrorHandlingStrategy(eConfig);
		ErrorReportingConfig errorReportingConfig = new ErrorReportingConfig();
		errorReportingConfig.setErrorReporterId("A");
		errorReportingConfig.setFormatter("XML");
		List<ErrorReportingConfig> errorReporterList = new ArrayList<ErrorReportingConfig>();
		errorReporterList.add(errorReportingConfig);
		onErrorConfig.setErrorReporters(errorReporterList);

		/**
		 * Connector Configuration
		 */
		ConnectorConfig connectorConfig = new ConnectorConfig();
		connectorConfig.setId("1");
		connectorConfig.setMode("IN");
		connectorConfig.setType("Type");

		/**
		 * Process definition
		 */
		com.headstrong.fusion.config.Process process = new Process();
		List<OnErrorConfig> list = new ArrayList<OnErrorConfig>();
		list.add(onErrorConfig);
		process.setOnErrorConfigList(list);
		/**
		 * Process Configuration Model
		 */
		ProcessConfigurationModel model = new ProcessConfigurationModel();
		model.setProcess(process);
		// list of connectors.
		List<ConnectorConfig> connectorList = new ArrayList<ConnectorConfig>();
		connectorList.add(connectorConfig);
		model.setConnectors(connectorList);

		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(model);

		// verify the connector config.

		OnErrorConfig connErrorConfig = model.getConnectors().get(0)
				.getErrorConfigList().get(0);
		assertNotNull(connErrorConfig);
		assertEquals("Business", connErrorConfig.getExceptionType());
		assertEquals("Abort", connErrorConfig.getErrorHandlingStrategy()
				.getStrategy());
		assertEquals("XML", connErrorConfig.getErrorReporters().get(0)
				.getFormatter());
	}

	public void testEnrichMediatorrConfig() throws Exception {
		/**
		 * Error Configuration
		 */
		OnErrorConfig onErrorConfig = new OnErrorConfig();
		onErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig eConfig = new ErrorHandlingStrategyConfig();
		eConfig.setBatch(false);
		eConfig.setStrategy("Abort");
		onErrorConfig.setErrorHandlingStrategy(eConfig);
		ErrorReportingConfig errorReportingConfig = new ErrorReportingConfig();
		errorReportingConfig.setErrorReporterId("A");
		errorReportingConfig.setFormatter("XML");
		List<ErrorReportingConfig> errorReporterList = new ArrayList<ErrorReportingConfig>();
		errorReporterList.add(errorReportingConfig);
		onErrorConfig.setErrorReporters(errorReporterList);

		/**
		 * Connector Configuration
		 */
		MediatorConfig mediatorConfig = new MediatorConfig();
		mediatorConfig.setId("1");
		mediatorConfig.setType("Type");

		/**
		 * Process definition
		 */
		com.headstrong.fusion.config.Process process = new Process();
		List<OnErrorConfig> list = new ArrayList<OnErrorConfig>();
		list.add(onErrorConfig);
		process.setOnErrorConfigList(list);
		/**
		 * Process Configuration Model
		 */
		ProcessConfigurationModel model = new ProcessConfigurationModel();
		model.setProcess(process);
		// list of connectors.
		List<MediatorConfig> mediators = new ArrayList<MediatorConfig>();
		mediators.add(mediatorConfig);
		model.setMediators(mediators);

		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(model);

		// verify the connector config.

		OnErrorConfig mediatorErrorConfig = model.getMediators().get(0)
				.getErrorConfigList().get(0);
		assertNotNull(mediatorErrorConfig);
		assertEquals("Business", mediatorErrorConfig.getExceptionType());
		assertEquals("Abort", mediatorErrorConfig.getErrorHandlingStrategy()
				.getStrategy());
		assertEquals("XML", mediatorErrorConfig.getErrorReporters().get(0)
				.getFormatter());
	}
}
