/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright � 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: ProcessModelGenerator.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Nov 26, 2008 
 */

package com.headstrong.teevra.services.process;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.headstrong.teevra.common.exception.EncryptionException;
import com.headstrong.teevra.common.utils.MessageEncryptor;
import com.headstrong.teevra.services.component.ComponentsCache;
import com.headstrong.teevra.services.component.eo.ComponentConfigEO;
import com.headstrong.teevra.services.component.eo.ComponentEO;
import com.headstrong.teevra.services.process.eo.ProcessEO;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.process.eo.ProcessServiceEO;
import com.headstrong.teevra.services.process.exception.ProcessModelGenerationException;
import com.headstrong.teevra.services.process.vo.ProcessGraphLinkVO;
import com.headstrong.teevra.services.process.vo.ProcessGraphNodeVO;
import com.headstrong.teevra.services.process.vo.ProcessGraphVO;

/**
 * Generate Process Configuration Model (PCM) from a process graph
 */
public class ProcessModelGenerator {
	/**
	 * Logger for ProcessModelGenerator
	 */

	private static Logger logger = LoggerFactory
			.getLogger(ProcessModelGenerator.class);

	private static String FUSION = "fusion";
	private static String MEDIATORS = "mediators";
	private static String MEDIATOR = "mediator";
	private static String PROPERTY = "property";
	private static String ROUTERS = "routers";
	private static String ERROR_REPORTERS = "errorReporters";
	private static String ERROR_REPORTER = "errorReporter";
	private static String CBR = "CBR";
	private static String MULTICAST = "MultiCast";
	private static String SAVEPOINT = "Savepoint";
	private static String SPLITTER = "Splitter";
	private static String SAVEPOINT_ELEMENT = "savepoint";
	private static String CONNECTORS = "connectors";
	private static String CONNECTOR = "connector";
	private static String PROCESS = "process";
	private static String ON_ERROR = "onError";
	private static String ERROR_REPORTER_ID = "errorReporter";
	private static String ERROR_HANDLING_STRATEGY = "errorHandlingStrategy";
	private static String BUSINESS_EXCEPTION = "Business";
	private static String SYSTEM_EXCEPTION = "System";

	// Error Handling Strategies
	private static String CONTINUE_STRATEGY = "ReportAndContinueJob";
	private static String ABORT_STRATEGY = "ReportAndAbortJob";
	private static String STOP_STRATEGY = "ReportAndStopProcess";
	private static String THRESHOLD_STRATEGY = "ReportAndAbortJobIfThresholdCrossed";
	private static String DATABASE_ERROR_REPORTER = "DB ErrReporter";
	private static String DATABASEFORMATTER = "database";
	private static String FIXMLFormatter = "fixml";

	// Process Attributes
	private static String PRCS_ID_ATTR = "id";
	private static String PRCS_NAME_ATTR = "name";
	private static String PRCS_RECOVERY_ATTR = "toRecover";
	private static String PASSWORD = "PASSWORD";

	private static String PRCS_EVNTLOG_ATTR = "toLogPrcsEvents";
	private static String MSG_EVNTLOG_ATTR = "toLogMsgEvents";
	private static String COMP_EVNTLOG_ATTR = "toLogCompEvents";
	private static String THROTTLE_TIME = "throttleTime";
	private static String THROTTLE_MSG_COUNT = "throttleMsgCount";

	/**
	 * Extracts complex component configurations present in process graph. These
	 * configurations are stored separately in database. They are not inlined in
	 * the process configuration model.
	 * 
	 * @precondition processGraph != null
	 * @param processGraph
	 *            object model of process graph
	 * @return list of all complex configurations present in the graph
	 */
	public static List<ProcessServiceConfigurationEO> getComplexConfigurations(
			ProcessGraphVO processGraph) {
		List<ProcessServiceConfigurationEO> complexConfigurations = new ArrayList<ProcessServiceConfigurationEO>();
		ComponentsCache compCache = ComponentsCache.getInstance();

		Map<String, ProcessGraphNodeVO> nodesMap = processGraph.getNodes();
		for (ProcessGraphNodeVO node : nodesMap.values()) {
			ComponentEO comp = compCache.getFromCache(node.getComponentId());
			ProcessServiceEO serviceDetails = node.getServiceDetails();
			if (ComponentEO.ROUTER.equals(comp.getCompType())
					&& (CBR.equals(comp.getCompName()) || SPLITTER.equals(comp
							.getCompName()) || MULTICAST.equals(comp.getCompName()))) {
				continue;
			}
			if (serviceDetails != null) {
				List<ProcessServiceConfigurationEO> configurations = serviceDetails
						.getConfigurations();
				if (configurations != null) {
					for (ProcessServiceConfigurationEO config : configurations) {
						if ((config.getComplexValue() != null)
								&& (!"".equals(config.getComplexValue()))) {
							config.setServiceType(comp.getCompServiceName());
							complexConfigurations.add(config);
						}
					}
				}
			}
		}
		return complexConfigurations;
	}

	/**
	 * Generate Process configuration model from the process graph present in
	 * the given processEO
	 * 
	 * @precondition processEO != null
	 * @precondition processEO.getGraph() != null
	 * @param processEO
	 *            process containing object model of process graph
	 * @return XML string corresponding to PCM
	 * @throws ProcessModelGenerationException
	 */
	public static String generateProcessModel(ProcessEO processEO)
			throws ProcessModelGenerationException {
		assert (processEO != null);
		assert (processEO.getGraph() != null);
		assert (processEO.getPrcsId() != null);
		assert (processEO.getPrcsName() != null);

		ProcessGraphVO processGraph = processEO.getGraph();
		Document processModelDoc = null;
		try {
			processModelDoc = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().newDocument();

			Map<String, ProcessGraphNodeVO> nodeIdToNodeDetailsMap = new TreeMap<String, ProcessGraphNodeVO>();
			Map<String, List<ProcessGraphNodeVO>> modelElements = seggregateElements(
					processGraph, nodeIdToNodeDetailsMap);

			// root node
			Element fusion = processModelDoc.createElement(FUSION);
			processModelDoc.appendChild(fusion);

			// mediators
			Element mediators = processModelDoc.createElement(MEDIATORS);
			fusion.appendChild(mediators);
			appendMediators(processModelDoc, mediators, modelElements
					.get(MEDIATORS), processGraph);

			// routers
			Element routers = processModelDoc.createElement(ROUTERS);
			fusion.appendChild(routers);
			appendRouters(processModelDoc, routers, modelElements.get(ROUTERS),
					nodeIdToNodeDetailsMap);

			// connectors
			Element connectors = processModelDoc.createElement(CONNECTORS);
			fusion.appendChild(connectors);
			appendConnectors(processModelDoc, connectors, modelElements
					.get(CONNECTORS));

			// error reporters
			Element errorReporters = processModelDoc
					.createElement(ERROR_REPORTERS);
			fusion.appendChild(errorReporters);
			appendErrorReporters(processModelDoc, errorReporters, modelElements
					.get(ERROR_REPORTERS), processGraph);

			// process
			Element process = processModelDoc.createElement(PROCESS);
			fusion.appendChild(process);
			appendProcess(processModelDoc, process, nodeIdToNodeDetailsMap,
					processGraph);

			// set process Id and process name, Recovery
			process
					.setAttribute(PRCS_ID_ATTR, processEO.getPrcsId()
							.toString());
			process.setAttribute(PRCS_NAME_ATTR, processEO.getPrcsName());
			process.setAttribute(PRCS_RECOVERY_ATTR, processEO
					.getPrcsRecoveryEnabled().toString());
			process.setAttribute(PRCS_EVNTLOG_ATTR, processEO
					.getPrcsEventLogReqd().toString());
			process.setAttribute(MSG_EVNTLOG_ATTR, processEO
					.getMsgEventLogReqd().toString());
			process.setAttribute(COMP_EVNTLOG_ATTR, processEO
					.getCompEventLogReqd().toString());
			if (processEO.getThrottleTime() != null)
				process.setAttribute(THROTTLE_TIME, processEO.getThrottleTime()
						.toString());
			if (processEO.getThrottleMsgCount() != null)
				process.setAttribute(THROTTLE_MSG_COUNT, processEO
						.getThrottleMsgCount().toString());
		} catch (ParserConfigurationException e) {
			logger.error("Error while generating process model", e);
			throw new ProcessModelGenerationException(e.getMessage());
		} catch (FactoryConfigurationError e) {
			logger.error("Error while generating process model", e);
			throw new ProcessModelGenerationException(e.getMessage());
		}
		if (processModelDoc != null) {
			try {
				return DOMToString(processModelDoc);
			} catch (IOException e) {
				logger
						.error("Error while generation serialized XML of PCM ",
								e);
				throw new ProcessModelGenerationException(e.getMessage());
			}
		} else {
			return null;
		}
	}

	/**
	 * Splits node into various categories based on the component type
	 * 
	 * @precondition (graphVO != null)
	 * @precondition ((graphVO.getNodes() != null) && (graphVO.getNodes().size() >
	 *               0))
	 * @postcondition
	 * @param graphVO
	 *            object model of process graph
	 * @param nodeIdToNodeDetailsMap
	 *            Maps node id to node details
	 * @return TreeMap with MEDIATORS, ROUTERS and CONNECTORS nodes populated
	 * @throws ProcessModelGenerationException
	 */
	private static TreeMap<String, List<ProcessGraphNodeVO>> seggregateElements(
			ProcessGraphVO graphVO,
			Map<String, ProcessGraphNodeVO> nodeIdToNodeDetailsMap)
			throws ProcessModelGenerationException {
		assert (graphVO != null);
		assert ((graphVO.getNodes() != null) && (graphVO.getNodes().size() > 0));

		ComponentsCache compCache = ComponentsCache.getInstance();

		TreeMap<String, List<ProcessGraphNodeVO>> elements = new TreeMap<String, List<ProcessGraphNodeVO>>();
		elements.put(MEDIATORS, new ArrayList<ProcessGraphNodeVO>());
		elements.put(ROUTERS, new ArrayList<ProcessGraphNodeVO>());
		elements.put(CONNECTORS, new ArrayList<ProcessGraphNodeVO>());
		elements.put(ERROR_REPORTERS, new ArrayList<ProcessGraphNodeVO>());

		Map<String, ProcessGraphNodeVO> nodesMap = graphVO.getNodes();
		for (ProcessGraphNodeVO node : nodesMap.values()) {
			nodeIdToNodeDetailsMap.put(node.getNodeId(), node);
			ComponentEO comp = compCache.getFromCache(node.getComponentId());
			if (ComponentEO.ENDPOINT.equals(comp.getCompType())) {
				elements.get(CONNECTORS).add(node);
			} else if (ComponentEO.ROUTER.equals(comp.getCompType())) {
				elements.get(ROUTERS).add(node);
			} else if (ComponentEO.ERROR_REPORTER.equals(comp.getCompType())) {
				elements.get(ERROR_REPORTERS).add(node);
			} else {
				elements.get(MEDIATORS).add(node);
			}
		}
		return elements;
	}

	/**
	 * Appends mediator element to process model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param mediatorsRoot
	 * @param mediators
	 * @param graph
	 * @throws ProcessModelGenerationException
	 */
	private static void appendMediators(Document processModelDoc,
			Element mediatorsRoot, List<ProcessGraphNodeVO> mediators,
			ProcessGraphVO graph) throws ProcessModelGenerationException {
		ComponentsCache cache = ComponentsCache.getInstance();
		for (ProcessGraphNodeVO node : mediators) {
			if ((node.getServiceDetails() != null)
					&& (node.getServiceDetails().getConfigurations() != null)) {

				Element mediatorElement = processModelDoc
						.createElement(MEDIATOR);
				mediatorElement.setAttribute("type", cache.getFromCache(
						node.getComponentId()).getCompServiceName());
				mediatorElement.setAttribute("id", node.getNodeId());

				for (ProcessServiceConfigurationEO config : node
						.getServiceDetails().getConfigurations()) {
					Element propertyElement = processModelDoc
							.createElement(PROPERTY);
					propertyElement.setAttribute("name", config.getConfigKey());
					if ((config.getComplexValue() == null)
							|| "".equals(config.getComplexValue())) {
						// the current configuration is simple. Hence value
						// needs to be inlined.
						propertyElement.setAttribute("value", config
								.getSimpleValue());
					} else {
						propertyElement.setAttribute("value", "");
					}
					mediatorElement.appendChild(propertyElement);
				}
				// append on error configurations
				ComponentsCache compCache = ComponentsCache.getInstance();
				Map<String, ProcessGraphLinkVO> nodeLinks = graph.getLinks()
						.get(node.getNodeId());
				Set<String> targetNodeIds = nodeLinks.keySet();
				for (String targetNodeId : targetNodeIds) {
					ProcessGraphNodeVO targetNode = graph.getNodes().get(
							targetNodeId);
					ComponentEO comp = compCache.getFromCache(targetNode
							.getComponentId());
					if (ComponentEO.ERROR_REPORTER.equals(comp.getCompType())) {
						String errorReporterId = targetNode.getNodeId();
						if (node.getServiceDetails().getBusinessErrorStrategy() != null) {
							String strategy = node.getServiceDetails()
									.getBusinessErrorStrategy();
							String exceptionType = BUSINESS_EXCEPTION;
							String errorReporterType = cache.getFromCache(
									targetNode.getComponentId()).getCompName();
							appendErrorHandling(processModelDoc,
									mediatorElement, strategy, errorReporterId,
									exceptionType, errorReporterType);

						}
						if (node.getServiceDetails().getSystemErrorStrategy() != null) {
							String strategy = node.getServiceDetails()
									.getSystemErrorStrategy();
							String exceptionType = SYSTEM_EXCEPTION;
							String errorReporterType = cache.getFromCache(
									targetNode.getComponentId()).getCompName();
							appendErrorHandling(processModelDoc,
									mediatorElement, strategy, errorReporterId,
									exceptionType, errorReporterType);
						}

					}

				}

				mediatorsRoot.appendChild(mediatorElement);
			}
		}
	}

	/**
	 * Appends router elements to process model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param routersRoot
	 * @param routers
	 * @throws ProcessModelGenerationException
	 */
	private static void appendRouters(Document processModelDoc,
			Element routersRoot, List<ProcessGraphNodeVO> routers, Map<String, ProcessGraphNodeVO> nodeIdToNodeDetailsMap)
			throws ProcessModelGenerationException {
		ComponentsCache compCache = ComponentsCache.getInstance();
		for (ProcessGraphNodeVO node : routers) {
			if (node.getServiceDetails() == null)
				continue;
			if (node.getServiceDetails().getConfigurations() == null)
				;

			// handle savepoints differently as they dont have configuration
			ComponentEO comp = compCache.getFromCache(node.getComponentId());
			if (SAVEPOINT.equals(comp.getCompName())) {
				Element savepoint = processModelDoc
						.createElement(SAVEPOINT_ELEMENT);
				savepoint.setAttribute("id", node.getNodeId());
				routersRoot.appendChild(savepoint);
			}

			// inline CBR, SPLITTER configuration which is present in the one &
			// only
			// complex config
			for (ProcessServiceConfigurationEO config : node
					.getServiceDetails().getConfigurations()) {
				String cbrConfig = config.getComplexValue();
				if (cbrConfig == null)
					continue;
				try {
					Document routersDoc = DocumentBuilderFactory
							.newInstance()
							.newDocumentBuilder()
							.parse(new InputSource(new StringReader(cbrConfig)));
					Node routersConfigNode = processModelDoc.importNode(
							routersDoc.getDocumentElement(), true);
					((Element) routersConfigNode).setAttribute("id", node
							.getNodeId());
					
					// For CBR, during recovery the end route has to be marked to handle the processed messages.	
					
					NodeList cbrChildrenList = routersConfigNode.getChildNodes();

					if (cbrChildrenList != null) {
						int cbrChildrenCount = cbrChildrenList.getLength();
						for (int i = 0; i < cbrChildrenCount; i++) {
							Node cbrChild = cbrChildrenList.item(i);
							if (cbrChild != null && cbrChild.getNodeName() != null) {
								
								// For CBR OR Multicast router. 
								if (cbrChild.getNodeName().trim().equals("when") || cbrChild.getNodeName().trim().equals("otherwise")) {
									NodeList whenChildList = cbrChild.getChildNodes();
									if (whenChildList != null) {
										int ccount = whenChildList.getLength();
										for (int j = 0; j < ccount; j++) {
											Node whenChild = whenChildList.item(j);
											if (whenChild != null && whenChild.getNodeName() != null) {
												if (whenChild.getNodeName().trim().equals("to")) {
													
													ProcessGraphNodeVO endNode = nodeIdToNodeDetailsMap.get(((Element)whenChild).getAttribute("id"));
													if (endNode == null) {
														continue;
													}
													ComponentEO endComp = compCache.getFromCache(endNode.getComponentId());
													// Marking the route as dead end, when CBR is routed to an endpoint.
													if (ComponentEO.ENDPOINT.equals(endComp.getCompType())) {
														((Element) whenChild).setAttribute("deadend", "true");
													}
												}
											}
										}
									}
								} else if (cbrChild.getNodeName().trim().equals("to")) {
									
									ProcessGraphNodeVO endNode = nodeIdToNodeDetailsMap
											.get(((Element) cbrChild)
													.getAttribute("id"));
									if (endNode == null) {
										continue;
									}
									ComponentEO endComp = compCache
											.getFromCache(endNode
													.getComponentId());

									// Marking the route as dead end, when
									// Multicast is routed to an endpoint.
									if (ComponentEO.ENDPOINT.equals(endComp
											.getCompType())) {

										((Element) cbrChild).setAttribute(
												"deadend", "true");
									}
								}
							}
						}
					}
					
					routersRoot.appendChild(routersConfigNode);
					break;
				} catch (SAXException e) {
					logger.error("Error while generating process model", e);
					throw new ProcessModelGenerationException(e.getMessage());
				} catch (IOException e) {
					logger.error("Error while generating process model", e);
					throw new ProcessModelGenerationException(e.getMessage());
				} catch (ParserConfigurationException e) {
					logger.error("Error while generating process model", e);
					throw new ProcessModelGenerationException(e.getMessage());
				} catch (FactoryConfigurationError e) {
					logger.error("Error while generating process model", e);
					throw new ProcessModelGenerationException(e.getMessage());
				}
			}
		}
	}

	/**
	 * Append connector elements to process model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param connectorsRoot
	 * @param connectors
	 * @throws ProcessModelGenerationException
	 */
	private static void appendConnectors(Document processModelDoc,
			Element connectorsRoot, List<ProcessGraphNodeVO> connectors)
			throws ProcessModelGenerationException {
		ComponentsCache cache = ComponentsCache.getInstance();
		MessageEncryptor encryptor = new MessageEncryptor();
		
		for (ProcessGraphNodeVO node : connectors) {
			if ((node.getServiceDetails() != null)
					&& (node.getServiceDetails().getConfigurations() != null)) {
				Element connectorElement = processModelDoc
						.createElement(CONNECTOR);
				connectorElement.setAttribute("type", cache.getFromCache(
						node.getComponentId()).getCompServiceName());
				connectorElement.setAttribute("id", node.getNodeId());

				ComponentEO comp = cache.getFromCache(node.getComponentId());
				
				for (ProcessServiceConfigurationEO config : node
						.getServiceDetails().getConfigurations()) {
					
					Element propertyElement = processModelDoc
							.createElement(PROPERTY);
					propertyElement.setAttribute("name", config.getConfigKey());
					if ((config.getSimpleValue() != null)
							&& !"".equals(config.getSimpleValue())) {
						
						boolean isPasswordVal = false;
						for(ComponentConfigEO compConfig: comp.getCompConfigList()){
							if(config.getConfigKey().equals(compConfig.getConfigKey())){
								if(compConfig.getConfigType().equals(PASSWORD)){
									
									try {
										String passwordVal = config.getSimpleValue();
										if (passwordVal != null && passwordVal.trim().length() > 0) {
											isPasswordVal = true;
											//config.setSimpleValue(encryptor.encrypt(passwordVal));
											propertyElement.setAttribute("value", encryptor.encrypt(passwordVal));
										}
									} catch (EncryptionException exp) {
										logger
												.error(
														"Error while encrypting password",
														exp);
									}
								}
							}
						}
						
						if (!isPasswordVal)
							propertyElement.setAttribute("value", config.getSimpleValue());
					} else {
						propertyElement.setAttribute("value", "");
					}
					connectorElement.appendChild(propertyElement);
				}

				connectorsRoot.appendChild(connectorElement);
			}
		}
	}

	/**
	 * Appends error reporters to process model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param errorReportersRoot
	 * @param errorReporters
	 * @param graph
	 * @throws ProcessModelGenerationException
	 */
	private static void appendErrorReporters(Document processModelDoc,
			Element errorReportersRoot,
			List<ProcessGraphNodeVO> errorReporters, ProcessGraphVO graph)
			throws ProcessModelGenerationException {
		ComponentsCache cache = ComponentsCache.getInstance();
		
		MessageEncryptor encryptor = new MessageEncryptor();
		
		for (ProcessGraphNodeVO node : errorReporters) {
			if ((node.getServiceDetails() != null)
					&& (node.getServiceDetails().getConfigurations() != null)) {
				Element errorReporterElement = processModelDoc
						.createElement(ERROR_REPORTER);
				errorReporterElement.setAttribute("type", cache.getFromCache(
						node.getComponentId()).getCompServiceName());
				errorReporterElement.setAttribute("id", node.getNodeId());

				for (ProcessServiceConfigurationEO config : node
						.getServiceDetails().getConfigurations()) {
					Element propertyElement = processModelDoc
							.createElement(PROPERTY);
					propertyElement.setAttribute("name", config.getConfigKey());
					if ((config.getSimpleValue() != null)
							&& !"".equals(config.getSimpleValue())) {
						propertyElement.setAttribute("value", config
								.getSimpleValue());					
					ComponentEO comp = cache.getFromCache(node.getComponentId());
						boolean isPasswordVal = false;
						for(ComponentConfigEO compConfig: comp.getCompConfigList()){							
							
							if(config.getConfigKey().equals(compConfig.getConfigKey())){								
								
								if(compConfig.getConfigType().equals(PASSWORD)){
									
									try {
										String passwordVal = config.getSimpleValue();
										if (passwordVal != null && passwordVal.trim().length() > 0) {
											isPasswordVal = true;							
											propertyElement.setAttribute("value", encryptor.encrypt(passwordVal));
										}
									} catch (EncryptionException exp) {
										logger
												.error(
														"Error while encrypting password",
														exp);
									}
								}
							}
						}
						
						if (!isPasswordVal)
							propertyElement.setAttribute("value", config.getSimpleValue());
						
						
					} else {
						propertyElement.setAttribute("value", "");
					}
					errorReporterElement.appendChild(propertyElement);
				}
				errorReportersRoot.appendChild(errorReporterElement);
			}
		}
		// process level error reporter configuration
		if (graph.getErrorReportNHandlingConfigs() != null
				&& graph.getErrorReportNHandlingConfigs().getCompId() != 0) {
			Element processLevelErrorReporterElement = processModelDoc
					.createElement(ERROR_REPORTER);
			processLevelErrorReporterElement.setAttribute("type", cache
					.getFromCache(
							graph.getErrorReportNHandlingConfigs().getCompId())
					.getCompServiceName());
			processLevelErrorReporterElement.setAttribute("id", graph
					.getErrorReportNHandlingConfigs().getServiceId());

			for (ProcessServiceConfigurationEO config : graph
					.getErrorReportNHandlingConfigs().getConfigurations()) {
				Element propertyElement = processModelDoc
						.createElement(PROPERTY);
				propertyElement.setAttribute("name", config.getConfigKey());
				if ((config.getSimpleValue() != null)
						&& !"".equals(config.getSimpleValue())) { 
					boolean isPasswordVal = false;
					if (config.getConfigKey().equals("password")) {
						try {
							String passwordVal = config.getSimpleValue();
							if (passwordVal != null	&& passwordVal.trim().length() > 0) {
								isPasswordVal = true;
								propertyElement.setAttribute("value", encryptor.encrypt(passwordVal));
							}
						} catch (EncryptionException exp) {
							logger.error("Error while encrypting password",	exp);
						}
					}
					if (!isPasswordVal)
						propertyElement.setAttribute("value", config
								.getSimpleValue());

				} else {
					propertyElement.setAttribute("value", "");
				}
				processLevelErrorReporterElement.appendChild(propertyElement);
			}
			errorReportersRoot.appendChild(processLevelErrorReporterElement);
		}
	}

	/**
	 * Append routes to the process element in model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param processRoot
	 * @param links
	 * @param nodeIdToNodeDetailsMap
	 * @param graph
	 *            TODO
	 * @throws ProcessModelGenerationException
	 */
	private static void appendProcess(Document processModelDoc,
			Element processRoot,
			Map<String, ProcessGraphNodeVO> nodeIdToNodeDetailsMap,
			ProcessGraphVO graph) throws ProcessModelGenerationException {
		Map<String, Map<String, ProcessGraphLinkVO>> links = graph.getLinks();
		assert (links != null);

		// Map<String, Integer> nodeTraverseTrails = new HashMap<String,
		// Integer>();
		// Map<String, List<Element>> nodeId2Elements = new HashMap<String,
		// List<Element>>();
		ComponentsCache compCache = ComponentsCache.getInstance();
		int seqNum = 1;
		for (Map<String, ProcessGraphLinkVO> outwardLinks : links.values()) {
			for (ProcessGraphLinkVO currentLink : outwardLinks.values()) {
				String startId = currentLink.getStartNodeId();
				String endId = currentLink.getEndNodeId();

				// don't create routes that originate from CBR
				ProcessGraphNodeVO startNode = nodeIdToNodeDetailsMap
						.get(startId);
				ProcessGraphNodeVO endNode = nodeIdToNodeDetailsMap.get(endId);
				if (startNode == null || endNode == null)
					continue;

				ComponentEO startComp = compCache.getFromCache(startNode
						.getComponentId());
				ComponentEO endComp = compCache.getFromCache(endNode
						.getComponentId());
				// don't create routes that originate from Content-based or a MultiCast Router    
				if (ComponentEO.ROUTER.equals(startComp.getCompType())
						&& (CBR.equals(startComp.getCompName())|| MULTICAST.equals(startComp.getCompName()))) {
					continue;
				}
				// don't create routes if the link ends at error reporter
				if (ComponentEO.ERROR_REPORTER.equals(endComp.getCompType())) {
					continue;
				}

				Element route = processModelDoc.createElement("route");
				route.setAttribute("id", "sequence" + seqNum);
				seqNum++;
				Element fromNode = processModelDoc.createElement("from");
				fromNode.setAttribute("id", startId);
				if (ComponentEO.ENDPOINT.equals(startComp.getCompType())) {
					route.setAttribute("start", "true");
				}
				route.appendChild(fromNode);

				Element toNode = processModelDoc.createElement("to");
				toNode.setAttribute("id", endId);
				if (ComponentEO.ENDPOINT.equals(endComp.getCompType())) {
					route.setAttribute("end", "true");
				}
				route.appendChild(toNode);
				processRoot.appendChild(route);

			}
		}
		// append error configurations
		if (graph.getErrorReportNHandlingConfigs() != null) {
			String errorReporterId = graph.getErrorReportNHandlingConfigs()
					.getServiceId();
			// append business exception strategy
			if (graph.getErrorReportNHandlingConfigs()
					.getBusinessErrorStrategy() != null) {
				String strategy = graph.getErrorReportNHandlingConfigs()
						.getBusinessErrorStrategy();
				String exceptionType = BUSINESS_EXCEPTION;
				String errorReporterType = null;
				if (graph.getErrorReportNHandlingConfigs().getConfigurations() != null) {
					errorReporterType = compCache.getFromCache(
							graph.getErrorReportNHandlingConfigs().getCompId())
							.getCompName();

				}
				appendErrorHandling(processModelDoc, processRoot, strategy,
						errorReporterId, exceptionType, errorReporterType);
			}
			// append system exception strategy
			if (graph.getErrorReportNHandlingConfigs()
					.getBusinessErrorStrategy() != null) {
				String strategy = graph.getErrorReportNHandlingConfigs()
						.getSystemErrorStrategy();
				String exceptionType = SYSTEM_EXCEPTION;
				String errorReporterType = null;
				if (graph.getErrorReportNHandlingConfigs().getConfigurations() != null) {
					errorReporterType = compCache.getFromCache(
							graph.getErrorReportNHandlingConfigs().getCompId())
							.getCompName();

				}
				appendErrorHandling(processModelDoc, processRoot, strategy,
						errorReporterId, exceptionType, errorReporterType);
			}
		}
	}

	/**
	 * Appends error handling at component and process level
	 * 
	 * @precondition
	 * @postcondition
	 * @param processModelDoc
	 * @param parentElement
	 * @param strategy
	 * @param errorReporterId
	 * @param exceptionType
	 */
	private static void appendErrorHandling(Document processModelDoc,
			Element parentElement, String strategy, String errorReporterId,
			String exceptionType, String errorReporterType) {
		Element onError = processModelDoc.createElement(ON_ERROR);
		onError.setAttribute("exceptionType", exceptionType);

		if ((errorReporterId != null) && (errorReporterId != "")) {
			Element errorReporterIdElement = processModelDoc
					.createElement(ERROR_REPORTER_ID);
			errorReporterIdElement.setAttribute("id", errorReporterId);
			if (errorReporterType.equals(DATABASE_ERROR_REPORTER)) {
				errorReporterIdElement.setAttribute("formatter",
						DATABASEFORMATTER);
			} else {
				errorReporterIdElement
						.setAttribute("formatter", FIXMLFormatter);
			}

			onError.appendChild(errorReporterIdElement);
		}
		Element errorHandlingStrategy = processModelDoc
				.createElement(ERROR_HANDLING_STRATEGY);

		if (strategy.equals(CONTINUE_STRATEGY)
				|| strategy.equals(ABORT_STRATEGY)
				|| strategy.equals(STOP_STRATEGY)) {
			errorHandlingStrategy.setAttribute("type", strategy);

		} else {
			errorHandlingStrategy.setAttribute("type", THRESHOLD_STRATEGY);

			Element propertyElement = processModelDoc.createElement(PROPERTY);
			propertyElement.setAttribute("name", "threshold");
			propertyElement.setAttribute("value", strategy);
			errorHandlingStrategy.appendChild(propertyElement);
		}
		onError.appendChild(errorHandlingStrategy);
		parentElement.appendChild(onError);
	}

	/**
	 * Generates serialized XML string of DOM
	 * 
	 * @precondition
	 * @postcondition
	 * @param doc
	 * @return
	 * @throws IOException
	 */
	public static String DOMToString(Document doc) throws IOException {
		OutputFormat format = new OutputFormat(doc);
		StringWriter stringOut = new StringWriter();
		XMLSerializer serial = new XMLSerializer(stringOut, format);
		try {
			serial.asDOMSerializer();
			serial.serialize(doc.getDocumentElement());
		} catch (IOException e) {
			logger.error(
					"Error while generating serialized XML string of DOM ", e);
			throw e;
		}
		return stringOut.toString();
	}

	public static void main(String[] args) {
		ProcessEO processEO = new ProcessEO();
		processEO.setGraph(testGraph());
		try {
			System.out.println(generateProcessModel(processEO));
		} catch (ProcessModelGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ProcessGraphVO testGraph() {
		List<ComponentEO> compList = new ArrayList<ComponentEO>();
		ComponentEO compEO = new ComponentEO();
		compEO.setCompId(new Long(1));
		compEO.setCompName("DBEndpoint");
		compEO.setCompType(ComponentEO.ENDPOINT);
		compList.add(compEO);

		compEO = new ComponentEO();
		compEO.setCompId(new Long(2));
		compEO.setCompName("Transformer");
		compEO.setCompType(ComponentEO.SERVICE);
		compList.add(compEO);

		compEO = new ComponentEO();
		compEO.setCompId(new Long(3));
		compEO.setCompName("MQEndpoint");
		compEO.setCompType(ComponentEO.ENDPOINT);
		compList.add(compEO);

		compEO = new ComponentEO();
		compEO.setCompId(new Long(4));
		compEO.setCompName("JMSErrorEndpoint");
		compEO.setCompType(ComponentEO.ERROR_REPORTER);
		compList.add(compEO);

		compEO = new ComponentEO();
		compEO.setCompId(new Long(5));
		compEO.setCompName("FILEErrorEndpoint");
		compEO.setCompType(ComponentEO.ERROR_REPORTER);
		compList.add(compEO);

		ComponentsCache.getInstance().addToCache(compList);

		ProcessGraphVO graph = new ProcessGraphVO();

		ProcessGraphNodeVO node1 = new ProcessGraphNodeVO();
		node1.setComponentId(Long.valueOf(1));
		node1.setNodeId("CompInst1");
		node1.setX(Long.valueOf(50));
		node1.setY(Long.valueOf(100));

		ProcessGraphNodeVO node2 = new ProcessGraphNodeVO();
		node2.setComponentId(Long.valueOf(2));
		node2.setNodeId("CompInst2");
		node2.setX(Long.valueOf(100));
		node2.setY(Long.valueOf(100));

		ProcessGraphNodeVO node3 = new ProcessGraphNodeVO();
		node3.setComponentId(Long.valueOf(3));
		node3.setNodeId("CompInst3");
		node3.setX(Long.valueOf(150));
		node3.setY(Long.valueOf(100));

		ProcessGraphNodeVO node4 = new ProcessGraphNodeVO();
		node4.setComponentId(Long.valueOf(4));
		node4.setNodeId("CompInst4");
		node4.setX(Long.valueOf(100));
		node4.setY(Long.valueOf(150));

		ProcessServiceEO serviceDetails = new ProcessServiceEO();
		serviceDetails.setCompId(Long.valueOf(1));
		List<ProcessServiceConfigurationEO> configList = new ArrayList<ProcessServiceConfigurationEO>();
		ProcessServiceConfigurationEO config = new ProcessServiceConfigurationEO();
		config.setServiceId("CompInst1");
		config.setConfigKey("URL");
		config.setSimpleValue("Test URL");
		configList.add(config);
		serviceDetails.setConfigurations(configList);
		node1.setServiceDetails(serviceDetails);

		serviceDetails = new ProcessServiceEO();
		serviceDetails.setCompId(Long.valueOf(2));
		configList = new ArrayList<ProcessServiceConfigurationEO>();
		config = new ProcessServiceConfigurationEO();
		config.setServiceId("CompInst2");
		config.setConfigKey("schemaMapping");
		config.setSimpleValue("schema mappingvalue");
		configList.add(config);
		serviceDetails.setConfigurations(configList);
		node2.setServiceDetails(serviceDetails);

		serviceDetails = new ProcessServiceEO();
		serviceDetails.setCompId(Long.valueOf(3));
		configList = new ArrayList<ProcessServiceConfigurationEO>();
		config = new ProcessServiceConfigurationEO();
		config.setServiceId("CompInst3");
		config
				.setComplexValue("<?xml><binding name=\"something\"><xpath value=\"something\" /></binding>");
		configList.add(config);
		serviceDetails.setConfigurations(configList);
		node3.setServiceDetails(serviceDetails);

		ProcessGraphLinkVO link1 = new ProcessGraphLinkVO();
		link1.setStartNodeId("CompInst4");
		link1.setEndNodeId("CompInst2");
		link1.setStartX(Long.valueOf(50));
		link1.setStartY(Long.valueOf(100));
		link1.setEndX(Long.valueOf(100));
		link1.setEndY(Long.valueOf(50));

		ProcessGraphLinkVO link2 = new ProcessGraphLinkVO();
		link2.setStartNodeId("CompInst2");
		link2.setEndNodeId("CompInst3");
		link2.setStartX(Long.valueOf(100));
		link2.setStartY(Long.valueOf(100));
		link2.setEndX(Long.valueOf(150));
		link2.setEndY(Long.valueOf(100));

		Map<String, ProcessGraphNodeVO> nodesMap = new HashMap<String, ProcessGraphNodeVO>();
		nodesMap.put("CompInst1", node1);
		nodesMap.put("CompInst2", node2);
		nodesMap.put("CompInst3", node3);

		Map<String, Map<String, ProcessGraphLinkVO>> nodesToLinksMap = new HashMap<String, Map<String, ProcessGraphLinkVO>>();

		Map<String, ProcessGraphLinkVO> linksMap = new HashMap<String, ProcessGraphLinkVO>();
		linksMap.put("CompInst2", link1);
		nodesToLinksMap.put("CompInst1", linksMap);

		linksMap = new HashMap<String, ProcessGraphLinkVO>();
		linksMap.put("CompInst3", link2);
		nodesToLinksMap.put("CompInst2", linksMap);

		graph = new ProcessGraphVO();
		graph.setProcessId(Long.valueOf(1));
		graph.setNodes(nodesMap);
		graph.setLinks(nodesToLinksMap);

		return graph;
	}
}
