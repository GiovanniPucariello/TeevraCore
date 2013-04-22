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
 * $Id: SCXMLGenerator.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.teevra.services.statemachine;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.headstrong.teevra.services.component.ComponentsCache;
import com.headstrong.teevra.services.process.ProcessModelGenerator;
import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;
import com.headstrong.teevra.services.statemachine.eo.StateMachineEO;
import com.headstrong.teevra.services.statemachine.exception.StateMachineModelGenerationException;
import com.headstrong.teevra.services.statemachine.vo.StateMachineActionVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphLinkVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphNodeVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineGraphVO;
import com.headstrong.teevra.services.statemachine.vo.StateMachineLinkVO;
import com.headstrong.teevra.services.statemachine.vo.StateVO;

/**
 * Generate SCXML from state machine graph
 */
public class StateMachineModelGenerator {

	/**
	 * Logger for StateMachineModelGenerator
	 */
	private static Logger logger = LoggerFactory
			.getLogger(StateMachineModelGenerator.class);
	/**
	 * SCXML and Custom NameSpace.
	 */
	private static String NAMSPACE_URI = "http://www.w3.org/2000/xmlns/";
	private static String SCXML_NAMESPACE = "http://www.w3.org/2005/07/scxml";
	private static String CUSTOM_NAMESPACE = "http://www.headstrong.com/teevra/action";

	private static String SCXML = "scxml";
	private static String XML_VERSION = "1.0";
	private static String INITIAL_STATE = "initialstate";
	private static String STATE_ELEMENT = "state";
	private static String ON_ENTRY_ELEMENT = "onentry";
	private static String ON_EXIT_ELEMENT = "onexit";
	private static String TRANSITION_ELEMENT = "transition";
	private static String SERVICE_ELEMENT = "custom:service";
	private static String PROPERTIES_ELEMENT = "properties";
	private static String PROPERTY_ELEMENT = "property";

	/**
	 * Generate State Machine configuration model from the stateMachineGraphVO
	 * present in the given StateMachineEO
	 * 
	 * @precondition stateMachine != null
	 * @precondition stateMachine.getGraph() != null
	 * @param stateMachine
	 *            state machine containing object model of state machine graph
	 * @return SCXML string corresponding to the state machine
	 * @throws StateMachineModelGenerationException
	 */
	public static String generateStateMachineModel(StateMachineEO stateMachine)
			throws StateMachineModelGenerationException {
		assert (stateMachine != null);
		assert (stateMachine.getGraph() != null);

		String stateMachineModel = null;
		Document stateMachineModelDoc = null;
		StateMachineGraphVO stateMachineGraph = stateMachine.getGraph();

		try {
			stateMachineModelDoc = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().newDocument();

			if (stateMachineModelDoc != null) {
				// ROOT element.
				Element scxml = stateMachineModelDoc.createElement(SCXML);
				scxml.setAttributeNS(NAMSPACE_URI, "xmlns:custom",
						CUSTOM_NAMESPACE);
				scxml.setAttributeNS(NAMSPACE_URI, "xmlns", SCXML_NAMESPACE);
				// set xml version
				scxml.setAttribute("version", XML_VERSION);
				// set initial state
				String initStateName = getStateName(stateMachineGraph,
						StateVO.INIT);
				// set initial state name if there is one
				if (initStateName != null) {
					scxml.setAttribute(INITIAL_STATE, initStateName);
				}
				stateMachineModelDoc.appendChild(scxml);
				// append all the states
				appendStates(stateMachineModelDoc, scxml, stateMachineGraph);
				try {
					stateMachineModel = ProcessModelGenerator
							.DOMToString(stateMachineModelDoc);
				} catch (IOException e) {
					logger
							.error(
									"Error while generation serialized XML of SCXML",
									e);
					throw new StateMachineModelGenerationException(e
							.getMessage());
				}
			}
		} catch (ParserConfigurationException e) {
			logger.error("Error while generating state machine model", e);
			throw new StateMachineModelGenerationException(e.getMessage());
		}

		return stateMachineModel;
	}

	/**
	 * Appends all state elements to state machine model doc
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineModelDoc
	 * @param scxml
	 * @param stateMachineGraph
	 * @throws StateMachineModelGenerationException
	 */
	@SuppressWarnings("unchecked")
	private static void appendStates(Document stateMachineModelDoc,
			Element scxml, StateMachineGraphVO stateMachineGraph)
			throws StateMachineModelGenerationException {
		Map<String, StateMachineGraphNodeVO> nodesMap = stateMachineGraph
				.getNodes();
		Map<String, Map<String, StateMachineGraphLinkVO>> nodeToNodeLinkMap = stateMachineGraph
				.getLinks();
		for (Entry<String, StateMachineGraphNodeVO> entry : nodesMap.entrySet()) {
			String stateName = entry.getKey();
			// state as an element
			Element stateElement = stateMachineModelDoc
					.createElement(STATE_ELEMENT);

			// add id(name) of the state as an attribute
			stateElement.setAttribute("id", stateName);

			// Map<String, StateMachineGraphNodeVO> nodesMap = stateMachineGraph
			// .getNodes();
			StateVO state = entry.getValue().getStateDetails();
			// add entry action element if exits
			StateMachineActionVO entryAction = state.getEntryAction();
			if (entryAction != null) {
				Element onEntryElement = stateMachineModelDoc
						.createElement(ON_ENTRY_ELEMENT);
				// append all the entry action configuration details to state
				appenedActionConfigurations(stateMachineModelDoc,
						onEntryElement, entryAction);
				stateElement.appendChild(onEntryElement);
			}
			// add transition details
			appendTransitionConfigurations(stateMachineModelDoc, stateElement,
					stateName, nodeToNodeLinkMap);

			// add exit action element if exits
			StateMachineActionVO exitAction = state.getExitAction();
			if (exitAction != null) {
				Element onExitElement = stateMachineModelDoc
						.createElement(ON_EXIT_ELEMENT);
				// append all the exit action configuration details to state
				appenedActionConfigurations(stateMachineModelDoc,
						onExitElement, exitAction);
				stateElement.appendChild(onExitElement);
			}
			scxml.appendChild(stateElement);
		}
	}

	/**
	 * Appends transition configurations to the state element
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineModelDoc
	 * @param stateElement
	 * @param stateName
	 * @param nodeToNodeLinkMap
	 * @throws StateMachineModelGenerationException
	 */
	private static void appendTransitionConfigurations(
			Document stateMachineModelDoc, Element stateElement,
			String stateName,
			Map<String, Map<String, StateMachineGraphLinkVO>> nodeToNodeLinkMap)
			throws StateMachineModelGenerationException {
		Map<String, StateMachineGraphLinkVO> stateLinks = nodeToNodeLinkMap
				.get(stateName);
		if (stateLinks != null) {
			for (StateMachineGraphLinkVO linkGraph : stateLinks.values()) {
				Element transitionElement = stateMachineModelDoc
						.createElement(TRANSITION_ELEMENT);
				StateMachineLinkVO linkDetails = linkGraph.getLinkDetails();
				// set event name for the transition
				transitionElement.setAttribute("event", linkDetails
						.getEventName());
				// set target of the transition
				transitionElement.setAttribute("target", linkDetails
						.getTargetStateName());
				// get transition Action
				StateMachineActionVO transitionAction = linkDetails
						.getTransitionAction();
				// If transition Action is not null append its configurations to
				// the transition element
				if (transitionAction != null) {
					appenedActionConfigurations(stateMachineModelDoc,
							transitionElement, linkDetails
									.getTransitionAction());

				}
				stateElement.appendChild(transitionElement);
			}
		}
	}

	/**
	 * Appends action configuration to the action element
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineModelDoc
	 * @param transitionElement
	 * @param action
	 * @throws StateMachineModelGenerationException
	 */
	private static void appenedActionConfigurations(
			Document stateMachineModelDoc, Element transitionElement,
			StateMachineActionVO action)
			throws StateMachineModelGenerationException {
		List<ProcessServiceConfigurationEO> configurations = action
				.getConfigurations();
		// create a service element which stores action name and
		// properties(action configurations)
		Element serviceElement = stateMachineModelDoc
				.createElement(SERVICE_ELEMENT);

		serviceElement.setAttribute("name", ComponentsCache.getInstance()
				.getFromCache(action.getCompId()).getCompName());
		// create a properties element which stores all the properties
		Element propertiesElement = stateMachineModelDoc
				.createElement(PROPERTIES_ELEMENT);
		// append all the configuration properties for the action as elements
		for (ProcessServiceConfigurationEO config : configurations) {
			Element propertyElement = stateMachineModelDoc
					.createElement(PROPERTY_ELEMENT);
			propertyElement.setAttribute("name", config.getConfigKey());
			propertyElement.setAttribute("value", config.getSimpleValue());
			// append each property element to properties element
			propertiesElement.appendChild(propertyElement);
		}
		// append properties element to service element
		serviceElement.appendChild(propertiesElement);
		// append service element to the action element
		transitionElement.appendChild(serviceElement);
	}

	/**
	 * Gets the state name based on the type of state
	 * 
	 * @precondition
	 * @postcondition
	 * @param stateMachineGraph
	 * @param stateType
	 * @return
	 * @throws StateMachineModelGenerationException
	 */
	private static String getStateName(StateMachineGraphVO stateMachineGraph,
			String stateType) throws StateMachineModelGenerationException {
		Map<String, StateMachineGraphNodeVO> nodesMap = stateMachineGraph
				.getNodes();
		for (StateMachineGraphNodeVO node : nodesMap.values()) {
			assert (node.getStateDetails().getStateName() != null);
			if (node.getStateDetails().getStateType().equals(stateType)) {
				return node.getStateDetails().getStateName();
			}
		}
		return null;
	}
}
