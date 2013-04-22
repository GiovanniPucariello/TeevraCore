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
 * $Id: DefaultErrorHandlerTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 29, 2009 
 */

package com.headstrong.fusion.messaging.error;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.seda.SedaEndpoint;
import org.apache.camel.impl.DefaultExchange;
import org.apache.camel.impl.DefaultMessage;
import org.apache.camel.impl.DefaultProducerTemplate;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.ErrorHandler;
import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.commons.resolver.ServiceResolver;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.config.EndPointSequence;
import com.headstrong.fusion.config.ErrorHandlingStrategyConfig;
import com.headstrong.fusion.config.ErrorReporterConfig;
import com.headstrong.fusion.config.ErrorReportingConfig;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.config.OnErrorConfig;
import com.headstrong.fusion.config.Process;
import com.headstrong.fusion.config.ProcessConfigurationModel;
import com.headstrong.fusion.config.Route;
import com.headstrong.fusion.config.SequenceType;
import com.headstrong.fusion.config.SourceSequence;
import com.headstrong.fusion.config.manager.XmlProcessDefinitionParser;
import com.headstrong.fusion.core.ApplicationContext;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.DefaultApplicationContext;
import com.headstrong.fusion.core.commons.DefaultServiceConfig;
import com.headstrong.fusion.core.commons.GenericProcessor;

/**
 * Default handler unit test class.
 */
public class DefaultErrorHandlerTest extends TestCase {
	public void testContinueJobStrategy() throws Exception {
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		OnErrorConfig businessErrorHandler = new OnErrorConfig();
		businessErrorHandler.setExceptionType("Business");
		ErrorHandlingStrategyConfig businessErrStrategy = new ErrorHandlingStrategyConfig();
		businessErrStrategy.setStrategy("ReportAndContinueJob");
		businessErrorHandler.setErrorHandlingStrategy(businessErrStrategy);
		onErrorConfigList.add(businessErrorHandler);

		GenericProcessor genericProcessor = this
				.getMockGenericProcessor(onErrorConfigList);
		Exchange exchange = createMock(Exchange.class);
		Message message = createMock(Message.class);
		Map<String, String> inputMessage = new HashMap<String, String>();
		inputMessage.put("1", "Not Processed");
		expect(exchange.getIn()).andReturn(message).anyTimes();
		expect(message.getBody()).andReturn(inputMessage).anyTimes();
		replay(exchange);
		replay(message);
		genericProcessor.process(exchange);
		// check the input list ..
		assertEquals("Processed", inputMessage.get("1"));
	}

	public void testAbortJobStrategy() throws Exception {
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		OnErrorConfig businessErrorHandler = new OnErrorConfig();
		businessErrorHandler.setExceptionType("Business");
		ErrorHandlingStrategyConfig businessErrStrategy = new ErrorHandlingStrategyConfig();
		businessErrStrategy.setStrategy("ReportAndAbortJob");
		businessErrorHandler.setErrorHandlingStrategy(businessErrStrategy);
		onErrorConfigList.add(businessErrorHandler);

		GenericProcessor genericProcessor = this
				.getMockGenericProcessor(onErrorConfigList);
		Exchange exchange = createMock(Exchange.class);
		Message message = createMock(Message.class);
		Map<String, String> inputMessage = new HashMap<String, String>();
		inputMessage.put("1", "Not Processed");
		expect(exchange.getIn()).andReturn(message).anyTimes();
		expect(message.getBody()).andReturn(inputMessage).anyTimes();
		replay(exchange);
		replay(message);
		try {
			genericProcessor.process(exchange);
		} catch (Exception e) {
			// ignore.
		}
		assertEquals("Not Processed", inputMessage.get("1"));
	}

	public void testAbortIfThresholdCrossedJobStrategy() throws Exception {
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		OnErrorConfig businessErrorHandler = new OnErrorConfig();
		businessErrorHandler.setExceptionType("Business");
		ErrorHandlingStrategyConfig businessErrStrategy = new ErrorHandlingStrategyConfig();
		businessErrStrategy.setStrategy("ReportAndAbortJobIfThresholdCrossed");
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("threshold", "2");
		businessErrStrategy.setProperties(properties);

		businessErrorHandler.setErrorHandlingStrategy(businessErrStrategy);
		onErrorConfigList.add(businessErrorHandler);

		GenericProcessor genericProcessor = this
				.getMockGenericProcessor(onErrorConfigList);
		Exchange exchange = createMock(Exchange.class);
		Message message = createMock(Message.class);
		Map<String, String> inputMessage = new LinkedHashMap<String, String>();
		inputMessage.put("1", "Not Processed");
		inputMessage.put("2", "Not Processed");
		inputMessage.put("3", "Not Processed");
		expect(exchange.getIn()).andReturn(message).anyTimes();
		expect(message.getBody()).andReturn(inputMessage).anyTimes();
		replay(exchange);
		replay(message);
		try {
			genericProcessor.process(exchange);
		} catch (Exception e) {
			// ignored.
		}
		assertEquals("Processed", inputMessage.get("1"));
		assertEquals("Processed", inputMessage.get("2"));
		assertEquals("Not Processed", inputMessage.get("3"));
	}

	public void testIfBusinessErrorNotConfigured() throws Exception {
		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		OnErrorConfig businessErrorHandler = new OnErrorConfig();
		businessErrorHandler.setExceptionType("System");
		ErrorHandlingStrategyConfig businessErrStrategy = new ErrorHandlingStrategyConfig();
		businessErrStrategy.setStrategy("ReportAndAbortJobIfThresholdCrossed");
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("threshold", "2");
		businessErrStrategy.setProperties(properties);

		businessErrorHandler.setErrorHandlingStrategy(businessErrStrategy);
		onErrorConfigList.add(businessErrorHandler);

		GenericProcessor genericProcessor = this
				.getMockGenericProcessor(onErrorConfigList);
		Exchange exchange = createMock(Exchange.class);
		Message message = createMock(Message.class);
		Map<String, String> inputMessage = new LinkedHashMap<String, String>();
		inputMessage.put("1", "Not Processed");
		inputMessage.put("2", "Not Processed");
		inputMessage.put("3", "Not Processed");
		expect(exchange.getIn()).andReturn(message).anyTimes();
		expect(message.getBody()).andReturn(inputMessage).anyTimes();
		replay(exchange);
		replay(message);
		try {
			genericProcessor.process(exchange);
		} catch (Exception ex) {
			assertEquals(FusionException.class, ex.getClass());
			assertEquals("Dummy Exception Thrown.", ex.getMessage());
		}
	}

	public void testWhenNoStrategySpecified() throws Exception {
		GenericProcessor genericProcessor = this.getMockGenericProcessor(null);
		Exchange exchange = createMock(Exchange.class);
		Message message = createMock(Message.class);
		Map<String, String> inputMessage = new LinkedHashMap<String, String>();
		inputMessage.put("1", "Not Processed");
		expect(exchange.getIn()).andReturn(message).anyTimes();
		expect(message.getBody()).andReturn(inputMessage).anyTimes();
		replay(exchange);
		replay(message);
		try {
			genericProcessor.process(exchange);
		} catch (Exception ex) {
			assertEquals(FusionException.class, ex.getClass());
			assertTrue(ex.getMessage().contains("Dummy Exception Thrown."));
		}
	}

	private ProcessConfigurationModel createSimpleRoute() {
		ProcessConfigurationModel model = new ProcessConfigurationModel();
		ConnectorConfig sourceSedaEndpoint = new ConnectorConfig();
		sourceSedaEndpoint.setId("source");
		sourceSedaEndpoint.setType("SEDA");
		HashMap<String, String> sourceProp = new HashMap<String, String>();
		sourceProp.put("sedaEndPointName", "source");
		sourceSedaEndpoint.setProperties(sourceProp);

		ConnectorConfig destMockEndPoinConfig = new ConnectorConfig();
		destMockEndPoinConfig.setId("dest");
		destMockEndPoinConfig.setType("MOCK");
		HashMap<String, String> destProp = new HashMap<String, String>();
		destProp.put("mockEndPointName", "dest");
		destMockEndPoinConfig.setProperties(destProp);

		List<ConnectorConfig> connectors = new ArrayList<ConnectorConfig>();
		connectors.add(sourceSedaEndpoint);
		connectors.add(destMockEndPoinConfig);

		model.setConnectors(connectors);

		ErrorReporterConfig errorMockEndpoint = new ErrorReporterConfig();
		errorMockEndpoint.setId("error");
		errorMockEndpoint.setType("MOCK");
		HashMap<String, String> errorEpProps = new HashMap<String, String>();
		errorEpProps.put("mockEndPointName", "error");
		errorMockEndpoint.setProperties(errorEpProps);

		List<ErrorReporterConfig> errorReporterConfigList = new ArrayList<ErrorReporterConfig>();
		errorReporterConfigList.add(errorMockEndpoint);

		model.setErrorReporters(errorReporterConfigList);

		MediatorConfig mediatorConfig = new MediatorConfig();
		mediatorConfig.setId("processor");
		mediatorConfig.setType("ErrorTestService");

		OnErrorConfig onErrorConfig = new OnErrorConfig();
		onErrorConfig.setExceptionType("Business");

		ErrorHandlingStrategyConfig errorHandlingStrategyConfig = new ErrorHandlingStrategyConfig();
		errorHandlingStrategyConfig.setStrategy("ReportAndContinueJob");
		onErrorConfig.setErrorHandlingStrategy(errorHandlingStrategyConfig);

		ErrorReportingConfig errorReportingConfig = new ErrorReportingConfig();
		errorReportingConfig.setErrorReporterId("error");
		errorReportingConfig.setFormatter("xml");

		List<ErrorReportingConfig> errorReporters = new ArrayList<ErrorReportingConfig>();
		errorReporters.add(errorReportingConfig);

		onErrorConfig.setErrorReporters(errorReporters);

		List<OnErrorConfig> onErrorConfigList = new ArrayList<OnErrorConfig>();
		onErrorConfigList.add(onErrorConfig);

		mediatorConfig.setErrorConfigList(onErrorConfigList);

		List<MediatorConfig> mediators = new ArrayList<MediatorConfig>();
		mediators.add(mediatorConfig);
		model.setMediators(mediators);

		Process process = new Process();
		process.setId("1");
		process.setName("error");

		/**
		 * Route 1 - from SEDA -> processor
		 */
		Route route1 = new Route();
		route1.setId("route1");
		List<SequenceType> sequences1 = new ArrayList<SequenceType>();

		SourceSequence fromSeq1 = new SourceSequence();
		fromSeq1.setEndPointId("source");

		EndPointSequence destSequence1 = new EndPointSequence();
		destSequence1.setEndPointId("processor");

		sequences1.add(fromSeq1);
		sequences1.add(destSequence1);

		route1.setSequence(sequences1);
		/**
		 * Route 2 - from Processor -- > Mock endpoint
		 */
		Route route2 = new Route();
		route2.setId("route2");
		List<SequenceType> sequences2 = new ArrayList<SequenceType>();

		SourceSequence fromSeq2 = new SourceSequence();
		fromSeq2.setEndPointId("processor");

		EndPointSequence destSequence2 = new EndPointSequence();
		destSequence2.setEndPointId("dest");

		sequences2.add(fromSeq2);
		sequences2.add(destSequence2);

		route2.setSequence(sequences2);

		List<Route> routes = new ArrayList<Route>();
		routes.add(route1);
		routes.add(route2);

		process.setRoutes(routes);

		model.setProcess(process);
		return model;
	}

	public void atestComponentSimpleErrorRoute() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		ServiceResolver<MediationService> serviceResolver = createMock(ServiceResolver.class);
		expect(serviceResolver.getService("ErrorTestService", 0)).andReturn(
				new ErrorTestService()).anyTimes();

		replay(bundleContext);
		replay(serviceResolver);

		// 1: create ApplicationContext.
		DefaultApplicationContext applicationContext = DefaultApplicationContext.getInstance(
				bundleContext);
		// Set default Process Definition handler ( generates PCM from XML )
		applicationContext
				.setProcessDefinitionHandler(new XmlProcessDefinitionParser(
						bundleContext));
		applicationContext.setMediationServiceResolver(serviceResolver);

		ProcessConfigurationModel model = this.createSimpleRoute();
		CamelProcessContext processContext = (CamelProcessContext) ((DefaultApplicationContext) applicationContext)
				.registerProcess(model);
		// just start the camel process
		processContext.getCamelContext().start();

		SedaEndpoint sourceEp = (SedaEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "source");
		MockEndpoint destEp = (MockEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "dest");

		MockEndpoint errorEp = (MockEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "error");

		CamelContext camelContext = ((CamelProcessContext) processContext)
				.getCamelContext();
		ProducerTemplate producerTemplate = new DefaultProducerTemplate(
				camelContext);

		// separate messages required as formatting might be
		// different
		// for different service.
		List<String> body = new ArrayList<String>();
		body.add("test");
		body.add("error");
		body.add("test");
		Message message1 = new DefaultMessage();
		message1.setBody(body);
		// create an exchange.
		Exchange exchange1 = new DefaultExchange(camelContext);
		exchange1.setIn(message1);

		// send the message
		producerTemplate.send(sourceEp, exchange1);
		destEp.expectedMessageCount(1);
		errorEp.expectedMessageCount(1);
		destEp.assertIsSatisfied();
		errorEp.assertIsSatisfied();
	}

	public void atestComponentSimpleErrorRouteNoError() throws Exception {
		BundleContext bundleContext = createMock(BundleContext.class);
		ServiceResolver<MediationService> serviceResolver = createMock(ServiceResolver.class);
		expect(serviceResolver.getService("ErrorTestService", 0)).andReturn(
				new ErrorTestService()).anyTimes();

		replay(bundleContext);
		replay(serviceResolver);

		// 1: create ApplicationContext.
		DefaultApplicationContext applicationContext = DefaultApplicationContext.getInstance(
				bundleContext);
		// Set default Process Definition handler ( generates PCM from XML )
		applicationContext
				.setProcessDefinitionHandler(new XmlProcessDefinitionParser(
						bundleContext));
		applicationContext.setMediationServiceResolver(serviceResolver);

		ProcessConfigurationModel model = this.createSimpleRoute();
		CamelProcessContext processContext = (CamelProcessContext) ((DefaultApplicationContext) applicationContext)
				.registerProcess(model);
		// just start the camel process
		processContext.getCamelContext().start();

		SedaEndpoint sourceEp = (SedaEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "source");
		MockEndpoint destEp = (MockEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "dest");

		MockEndpoint errorEp = (MockEndpoint) processContext
				.getProcessMetaData().getEndpoint("1", "error");

		CamelContext camelContext = ((CamelProcessContext) processContext)
				.getCamelContext();
		ProducerTemplate producerTemplate = new DefaultProducerTemplate(
				camelContext);

		// separate messages required as formatting might be
		// different
		// for different service.
		List<String> body = new ArrayList<String>();
		body.add("test");
		body.add("test");
		body.add("test");
		Message message1 = new DefaultMessage();
		message1.setBody(body);
		// create an exchange.
		Exchange exchange1 = new DefaultExchange(camelContext);
		exchange1.setIn(message1);

		// send the message
		producerTemplate.send(sourceEp, exchange1);
		destEp.expectedMessageCount(1);
		errorEp.expectedMessageCount(0);
		destEp.assertIsSatisfied();
		errorEp.assertIsSatisfied();
	}

	private GenericProcessor getMockGenericProcessor(
			List<OnErrorConfig> onErrorConfigList) throws Exception {
		CamelContext camelContextMock = createMock(CamelContext.class);
		ApplicationContext applicationContextMock = createMock(ApplicationContext.class);
		expect(
				applicationContextMock.getMediationService("TestService",
						new Long(0))).andReturn(new TestService()).anyTimes();
		replay(camelContextMock);
		replay(applicationContextMock);
		CamelProcessContext processContext = new CamelProcessContext(
				applicationContextMock, null);
		processContext.setCamelContext(camelContextMock);

		String serviceType = "TestService";
		String serviceId = "test";
		String processId = "test";
		Map<String, Object> properties = new HashMap<String, Object>();
		ServiceConfig serviceConfig = new DefaultServiceConfig(processContext,
				serviceType, serviceId, processId, properties,
				onErrorConfigList);
		GenericProcessor genericProcessor = new GenericProcessor(
				processContext, serviceConfig);
		return genericProcessor;
	}

	private class TestService implements MediationService {
		public void init() {
			// N/A
		}

		@SuppressWarnings("unchecked")
		public void process(MessageExchange exchange, ServiceConfig config)
				throws FusionException {
			Map<String, String> inputMessage = (Map<String, String>) exchange
					.getIn().getBody();
			ErrorHandler errorHandler = config.getErrorHandler();
			for (Entry<String, String> inputRecord : inputMessage.entrySet()) {
				ErrorContext errorContext = new ErrorContext();
				errorContext.setCause(new FusionException(
						"Dummy Exception Thrown."));
				errorContext.setResource("TEST");
				errorContext.setType("Business");
				if (errorHandler != null) {
					errorHandler.reportError(errorContext);
				} else {
					throw new FusionException("Dummy Exception Thrown.");
				}
				if (errorHandler != null && errorHandler.isToContinue()) {
					inputMessage.put(inputRecord.getKey(), "Processed");
				}
			}
		}
	}

	/**
	 * A Dummy service. Just throws the exception if the body content is error .
	 * 
	 */
	private class ErrorTestService implements MediationService {

		public void init() {
		}

		public void process(MessageExchange exchange, ServiceConfig config)
				throws FusionException {
			ErrorHandler errorHandler = config.getErrorHandler();
			Object inputMessage = exchange.getIn().getBody();
			if (inputMessage instanceof List) {
				List<String> inputList = (List<String>) inputMessage;
				List<String> outputList = new ArrayList<String>();
				for (String inputRec : inputList) {
					if (errorHandler == null
							|| (errorHandler != null && errorHandler
									.isToContinue())) {
						if (inputRec.equals("error")) {
							try {
								throw new FusionException(
										"Dummy Exception Thrown.");
							} catch (FusionException e) {
								ErrorContext errorContext = new ErrorContext();
								errorContext.setCause(new FusionException(
										"Dummy Exception Thrown."));
								errorContext.setResource("TEST");
								errorContext.setType("Business");
								if (errorHandler != null) {
									errorHandler.reportError(errorContext);
								} else {
									throw e;
								}
							}
						}
						outputList.add(inputRec);
					}
				}
				exchange.getIn().setBody(outputList);
			} else {
				if (inputMessage.equals("error")) {
					ErrorContext errorContext = new ErrorContext();
					errorContext.setCause(new FusionException(
							"Dummy Exception Thrown."));
					errorContext.setResource("TEST");
					errorContext.setType("Business");
					if (errorHandler != null) {
						errorHandler.reportError(errorContext);
					} else {
						throw new FusionException("Dummy Exception Thrown.");
					}
				}
			}
		}

	}
}
