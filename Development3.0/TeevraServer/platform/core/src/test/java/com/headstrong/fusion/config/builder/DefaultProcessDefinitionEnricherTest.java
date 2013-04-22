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
 * $Id: DefaultProcessDefinitionEnricherTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 22, 2009 
 */

package com.headstrong.fusion.config.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.config.ErrorReportingConfig;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.manager.DefaultProcessDefinitionEnricher;
import com.headstrong.fusion.config.manager.ProcessDefinitionEnricher;

/**
 * Process Definition Enricher Test.
 */
public class DefaultProcessDefinitionEnricherTest extends TestCase {

	private ProcessConfigurationModel setUpProcess() {
		ProcessConfigurationModel pcm = new ProcessConfigurationModel();
		MediatorConfig mediatorConfig = new MediatorConfig();
		mediatorConfig.setId("1");
		mediatorConfig.setProperties(new HashMap<String, Object>());
		List<MediatorConfig> mediators = new ArrayList<MediatorConfig>();
		mediators.add(mediatorConfig);
		pcm.setMediators(mediators);

		Process process = new Process();
		process.setId("process1");
		process.setName("Dummy");
		pcm.setProcess(process);
		return pcm;
	}
	
	public void testNoConfigurationForProcess() throws Exception {
		ProcessConfigurationModel pcm = this.setUpProcess();

		/**
		 * Component Level Business Error Configuration.
		 */
		OnErrorConfig componentLevelBusinessErrorConfig = new OnErrorConfig();
		componentLevelBusinessErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig componentLevelBusinessErrStrategy = new ErrorHandlingStrategyConfig();
		componentLevelBusinessErrStrategy.setStrategy("ReportAndContinueJob");
		componentLevelBusinessErrorConfig
				.setErrorHandlingStrategy(componentLevelBusinessErrStrategy);
		List<ErrorReportingConfig> componentLevelBusinessErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig componentLevelBusinessErrReportingConfig = new ErrorReportingConfig();
		componentLevelBusinessErrReportingConfig.setErrorReporterId("JmsHandler21");
		componentLevelBusinessErrReportingConfig.setFormatter("formatter21");
		componentLevelBusinessErrReporters.add(componentLevelBusinessErrReportingConfig);
		
		componentLevelBusinessErrorConfig
				.setErrorReporters(componentLevelBusinessErrReporters);

		List<OnErrorConfig> mediatorErrorConfigList = new ArrayList<OnErrorConfig>();
		mediatorErrorConfigList.add(componentLevelBusinessErrorConfig);
		pcm.getMediators().get(0).setErrorConfigList(mediatorErrorConfigList);

		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(pcm);

		// verify error configuration for component.
		MediatorConfig mediatorConfig = pcm.getMediators().get(0);
		assertNotNull(mediatorConfig);
		assertNotNull(mediatorConfig.getErrorConfigList());
		assertEquals(false, mediatorConfig.getErrorConfigList().isEmpty());
		OnErrorConfig onErrorConfigComp = mediatorConfig.getErrorConfigList()
				.get(0);
		assertEquals("Business", onErrorConfigComp.getExceptionType());
		assertNotNull(onErrorConfigComp.getErrorReporters());
		assertEquals(false, onErrorConfigComp.getErrorReporters().isEmpty());
		assertEquals("JmsHandler21", onErrorConfigComp.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter21", onErrorConfigComp.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndContinueJob", onErrorConfigComp
				.getErrorHandlingStrategy().getStrategy());
	}

	/**
	 * Tests if complete process error configuration is copied for the component
	 * if nothing is specified at component level.
	 * 
	 */
	public void testEnrichNoErrorConfigForComponent() {
		ProcessConfigurationModel pcm = this.setUpProcess();

		OnErrorConfig onErrorConfig = new OnErrorConfig();
		onErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig strategy = new ErrorHandlingStrategyConfig();
		strategy.setStrategy("ReportAndContinueJob");
		onErrorConfig.setErrorHandlingStrategy(strategy);
		List<ErrorReportingConfig> errorReporters = new ArrayList<ErrorReportingConfig>();
		
		ErrorReportingConfig errorReporter = new ErrorReportingConfig();
		errorReporter.setErrorReporterId("JmsHandler1");
		errorReporter.setFormatter("formatter");
		
		errorReporters.add(errorReporter);
		
		onErrorConfig.setErrorReporters(errorReporters);
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		onErrorConfigList.add(onErrorConfig);
		pcm.getProcess().setOnErrorConfigList(onErrorConfigList);

		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(pcm);

		// verify error configuration for component.
		MediatorConfig mediatorConfig = pcm.getMediators().get(0);
		assertNotNull(mediatorConfig);
		assertNotNull(mediatorConfig.getErrorConfigList());
		assertEquals(false, mediatorConfig.getErrorConfigList().isEmpty());
		OnErrorConfig onErrorConfigComp = mediatorConfig.getErrorConfigList()
				.get(0);
		assertEquals("Business", onErrorConfigComp.getExceptionType());
		assertNotNull(onErrorConfigComp.getErrorReporters());
		assertEquals(false, onErrorConfigComp.getErrorReporters().isEmpty());
		assertEquals("JmsHandler1", onErrorConfigComp.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter", onErrorConfigComp.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndContinueJob", onErrorConfigComp
				.getErrorHandlingStrategy().getStrategy());
	}

	/**
	 * Tests if error configuration is copied at component level if process
	 * level configuration contains configuration for some exception type which
	 * is not present for the component.
	 * 
	 */
	public void testEnrichForMissingExceptionType() {
		ProcessConfigurationModel pcm = this.setUpProcess();

		/**
		 * Process Level Business Error Configuration.
		 */
		OnErrorConfig processLevelBusinessErrConfig = new OnErrorConfig();
		processLevelBusinessErrConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig processLevelBusinessErrStrategy = new ErrorHandlingStrategyConfig();
		processLevelBusinessErrStrategy.setStrategy("ReportAndContinueJob");
		processLevelBusinessErrConfig
				.setErrorHandlingStrategy(processLevelBusinessErrStrategy);
		
		List<ErrorReportingConfig> processLevelBusinessErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig prcsLevelBusinessErrReportingConfig = new ErrorReportingConfig();
		prcsLevelBusinessErrReportingConfig.setErrorReporterId("JmsHandler11");
		prcsLevelBusinessErrReportingConfig.setFormatter("formatter11");
		processLevelBusinessErrReporters.add(prcsLevelBusinessErrReportingConfig);
		processLevelBusinessErrConfig
				.setErrorReporters(processLevelBusinessErrReporters);

		/**
		 * Process Level System Error Configuration.
		 */
		OnErrorConfig processLevelSystemErrConfig = new OnErrorConfig();
		processLevelSystemErrConfig.setExceptionType("System");
		ErrorHandlingStrategyConfig processLevelSystemErrStrategy = new ErrorHandlingStrategyConfig();
		processLevelSystemErrStrategy.setStrategy("ReportAndStopProcess");
		processLevelSystemErrConfig
				.setErrorHandlingStrategy(processLevelSystemErrStrategy);
		List<ErrorReportingConfig> processLevelSystemErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig processLevelSysErrReportingConfig = new ErrorReportingConfig();
		processLevelSysErrReportingConfig.setErrorReporterId("JmsHandler12");
		processLevelSysErrReportingConfig.setFormatter("formatter12");
		processLevelSystemErrReporters.add(processLevelSysErrReportingConfig);
		processLevelSystemErrConfig
				.setErrorReporters(processLevelSystemErrReporters);

		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		onErrorConfigList.add(processLevelBusinessErrConfig);
		onErrorConfigList.add(processLevelSystemErrConfig);

		pcm.getProcess().setOnErrorConfigList(onErrorConfigList);

		/**
		 * Component Level Business Error Configuration.
		 */
		OnErrorConfig componentLevelBusinessErrorConfig = new OnErrorConfig();
		componentLevelBusinessErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig componentLevelBusinessErrStrategy = new ErrorHandlingStrategyConfig();
		componentLevelBusinessErrStrategy.setStrategy("ReportAndContinueJob");
		componentLevelBusinessErrorConfig
				.setErrorHandlingStrategy(componentLevelBusinessErrStrategy);
		List<ErrorReportingConfig> componentLevelBusinessErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig componentLevelBusinessErrReportingConfig = new ErrorReportingConfig();
		componentLevelBusinessErrReportingConfig.setErrorReporterId("JmsHandler21");
		componentLevelBusinessErrReportingConfig.setFormatter("formatter21");
		componentLevelBusinessErrReporters.add(componentLevelBusinessErrReportingConfig);
		
		componentLevelBusinessErrorConfig
				.setErrorReporters(componentLevelBusinessErrReporters);

		List<OnErrorConfig> mediatorErrorConfigList = new ArrayList<OnErrorConfig>();
		mediatorErrorConfigList.add(componentLevelBusinessErrorConfig);
		pcm.getMediators().get(0).setErrorConfigList(mediatorErrorConfigList);

		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(pcm);

		// verify error configuration for component.
		MediatorConfig mediatorConfig = pcm.getMediators().get(0);
		assertNotNull(mediatorConfig);
		assertNotNull(mediatorConfig.getErrorConfigList());
		assertEquals(false, mediatorConfig.getErrorConfigList().isEmpty());
		OnErrorConfig onErrorConfigComp = mediatorConfig.getErrorConfigList()
				.get(0);
		assertEquals("Business", onErrorConfigComp.getExceptionType());
		assertNotNull(onErrorConfigComp.getErrorReporters());
		assertEquals(false, onErrorConfigComp.getErrorReporters().isEmpty());
		assertEquals("JmsHandler21", onErrorConfigComp.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter21", onErrorConfigComp.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndContinueJob", onErrorConfigComp
				.getErrorHandlingStrategy().getStrategy());

		OnErrorConfig onErrorConfigCompSystem = mediatorConfig.getErrorConfigList()
				.get(1);
		assertEquals("System", onErrorConfigCompSystem.getExceptionType());
		assertNotNull(onErrorConfigCompSystem.getErrorReporters());
		assertEquals(false, onErrorConfigCompSystem.getErrorReporters().isEmpty());
		assertEquals("JmsHandler12", onErrorConfigCompSystem.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter12", onErrorConfigCompSystem.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndStopProcess", onErrorConfigCompSystem
				.getErrorHandlingStrategy().getStrategy());
	}
	
	
	/**
	 * Tests if error configuration is copied at component level if process
	 * level configuration contains configuration for some exception type which
	 * is not present for the component.
	 * 
	 */
	public void testEnrichForMissingErrorReporter() {
		ProcessConfigurationModel pcm = this.setUpProcess();

		/**
		 * Process Level Business Error Configuration.
		 */
		OnErrorConfig processLevelBusinessErrConfig = new OnErrorConfig();
		processLevelBusinessErrConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig processLevelBusinessErrStrategy = new ErrorHandlingStrategyConfig();
		processLevelBusinessErrStrategy.setStrategy("ReportAndContinueJob");
		processLevelBusinessErrConfig
				.setErrorHandlingStrategy(processLevelBusinessErrStrategy);
		List<ErrorReportingConfig> processLevelBusinessErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig processLevelBusinessErrReportingConfig = new ErrorReportingConfig();
		processLevelBusinessErrReportingConfig.setErrorReporterId("JmsHandler11");
		processLevelBusinessErrReportingConfig.setFormatter("formatter11");
		
		processLevelBusinessErrReporters.add(processLevelBusinessErrReportingConfig);
		processLevelBusinessErrConfig
				.setErrorReporters(processLevelBusinessErrReporters);

		/**
		 * Process Level System Error Configuration.
		 */
		OnErrorConfig processLevelSystemErrConfig = new OnErrorConfig();
		processLevelSystemErrConfig.setExceptionType("System");
		ErrorHandlingStrategyConfig processLevelSystemErrStrategy = new ErrorHandlingStrategyConfig();
		processLevelSystemErrStrategy.setStrategy("ReportAndStopProcess");
		processLevelSystemErrConfig
				.setErrorHandlingStrategy(processLevelSystemErrStrategy);
		List<ErrorReportingConfig> processLevelSystemErrReporters = new ArrayList<ErrorReportingConfig>();
		ErrorReportingConfig processLevelSysErrReportingConfig = new ErrorReportingConfig();
		processLevelSysErrReportingConfig.setErrorReporterId("JmsHandler12");
		processLevelSysErrReportingConfig.setFormatter("formatter12");
		processLevelSystemErrReporters.add(processLevelSysErrReportingConfig);
		processLevelSystemErrConfig
				.setErrorReporters(processLevelSystemErrReporters);


		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		onErrorConfigList.add(processLevelBusinessErrConfig);
		onErrorConfigList.add(processLevelSystemErrConfig);

		pcm.getProcess().setOnErrorConfigList(onErrorConfigList);

		/**
		 * Component Level Business Error Configuration.
		 */
		OnErrorConfig componentLevelBusinessErrorConfig = new OnErrorConfig();
		componentLevelBusinessErrorConfig.setExceptionType("Business");
		ErrorHandlingStrategyConfig componentLevelBusinessErrStrategy = new ErrorHandlingStrategyConfig();
		componentLevelBusinessErrStrategy.setStrategy("ReportAndContinueJob");
		componentLevelBusinessErrorConfig
				.setErrorHandlingStrategy(componentLevelBusinessErrStrategy);

		List<OnErrorConfig> mediatorErrorConfigList = new ArrayList<OnErrorConfig>();
		mediatorErrorConfigList.add(componentLevelBusinessErrorConfig);
		pcm.getMediators().get(0).setErrorConfigList(mediatorErrorConfigList);

		/**
		 * Enrich the process configuration model.
		 */
		ProcessDefinitionEnricher enricher = new DefaultProcessDefinitionEnricher();
		enricher.enrich(pcm);

		
		// verify error configuration for component.
		MediatorConfig mediatorConfig = pcm.getMediators().get(0);
		assertNotNull(mediatorConfig);
		assertNotNull(mediatorConfig.getErrorConfigList());
		assertEquals(false, mediatorConfig.getErrorConfigList().isEmpty());
		
		OnErrorConfig onErrorConfigComp = mediatorConfig.getErrorConfigList()
				.get(0);
		assertEquals("Business", onErrorConfigComp.getExceptionType());
		assertNotNull(onErrorConfigComp.getErrorReporters());
		assertEquals(false, onErrorConfigComp.getErrorReporters().isEmpty());
		assertEquals("JmsHandler11", onErrorConfigComp.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter11", onErrorConfigComp.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndContinueJob", onErrorConfigComp
				.getErrorHandlingStrategy().getStrategy());

		OnErrorConfig onErrorConfigCompSystem = mediatorConfig.getErrorConfigList()
				.get(1);
		assertEquals("System", onErrorConfigCompSystem.getExceptionType());
		assertNotNull(onErrorConfigCompSystem.getErrorReporters());
		assertEquals(false, onErrorConfigCompSystem.getErrorReporters().isEmpty());
		assertEquals("JmsHandler12", onErrorConfigCompSystem.getErrorReporters()
				.get(0).getErrorReporterId());
		assertEquals("formatter12", onErrorConfigCompSystem.getErrorReporters()
				.get(0).getFormatter());
		assertEquals("ReportAndStopProcess", onErrorConfigCompSystem
				.getErrorHandlingStrategy().getStrategy());
	}

}
