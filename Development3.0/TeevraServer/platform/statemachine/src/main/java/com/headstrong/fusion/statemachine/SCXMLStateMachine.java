/*
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: SCXMLStateMachine.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.digester.Digester;
import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.Evaluator;
import org.apache.commons.scxml.EventDispatcher;
import org.apache.commons.scxml.SCXMLExecutor;
import org.apache.commons.scxml.TriggerEvent;
import org.apache.commons.scxml.env.SimpleErrorHandler;
import org.apache.commons.scxml.env.SimpleSCXMLListener;
import org.apache.commons.scxml.env.SimpleScheduler;
import org.apache.commons.scxml.env.URLResolver;
import org.apache.commons.scxml.env.jexl.JexlEvaluator;
import org.apache.commons.scxml.invoke.SimpleSCXMLInvoker;
import org.apache.commons.scxml.io.SCXMLParser;
import org.apache.commons.scxml.model.CustomAction;
import org.apache.commons.scxml.model.ModelException;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.State;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.statemachine.action.SCXMLCustomAction;
import com.headstrong.fusion.statemachine.event.Event;
import com.headstrong.fusion.statemachine.exception.StateEventException;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * This state machine is the implementation is based on Apache SCXML.
 * 
 */
public class SCXMLStateMachine implements StateMachine {

	/**
	 * Default serial version Id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(SCXMLStateMachine.class);
	/**
	 * Custom Action NameSpace.
	 */
	private static final String NAMESPACE = "http://www.headstrong.com/teevra/action";

	/**
	 * Default service custom action.
	 */
	private static final String CUSTOM_ACTION_SERVICE = "service";

	/**
	 * Underlying Apache SCXML executor.
	 */
	private SCXMLExecutor scxmlExecutor;

	/**
	 * Unique state machine Id.
	 */
	private String id;

	/**
	 * Made transient as same should not be serialized while serializing the
	 * state machine.
	 */
	private transient final BundleContext bundleContext;

	/**
	 * State Machine XML definition. made transient as not required to be
	 * serialized.
	 */
	private transient String definition;

	/**
	 * Constructor creates and starts the state machine.
	 */
	public SCXMLStateMachine(String id, BundleContext bundleContext,
			String scxmlDoc) {
		this.id = id;
		this.bundleContext = bundleContext;
		this.definition = scxmlDoc;
	}

	/**
	 * Initializes the state machine.
	 * 
	 * @throws StateMachineException
	 */
	public void init() throws StateMachineException {
		// Create a list of custom actions, add as many as are needed
		// currently only one custom action is exposed which internally would
		// execute action service registered by the component.
		// Need to take care of the parsing part.
		SCXML scxml = null;
		URL url = null;
		File tempConfigFile = null;
		try {
			tempConfigFile = this.persistConfiguration(this.definition);
			url = tempConfigFile.toURI().toURL();
		} catch (MalformedURLException e) {
			logger.error(
					"Error persisting the configuration in temp file for state machine id "
							+ this.getId() + ".", e);
			throw new StateMachineException(
					"Error creating the state machine for state machine id "
							+ this.getId() + ".", e);
		} catch (IOException e) {
			logger.error(
					"Error persisting the configuration in temp file for state machine id "
							+ this.getId() + ".", e);
			throw new StateMachineException(
					"Error creating the state machine for state machine id "
							+ this.getId() + ".", e);
		}
		try {
			Digester scxmlParser = SCXMLParser.newInstance(null,
					new URLResolver(url), getCustomActions());
			scxmlParser.addObjectCreate("*/" + CUSTOM_ACTION_SERVICE
					+ "/properties", HashMap.class);
			scxmlParser.addSetNext(
					"*/" + CUSTOM_ACTION_SERVICE + "/properties",
					"setProperties");

			// call the put method on the top object on the digester stack
			// passing the key attribute as the 0th parameter
			// and the element body text as the 1th parameter..
			scxmlParser.addCallMethod("*/" + CUSTOM_ACTION_SERVICE
					+ "/properties/property", "put", 2);
			scxmlParser.addCallParam("*/" + CUSTOM_ACTION_SERVICE
					+ "/properties/property", 0, "name");
			scxmlParser.addCallParam("*/" + CUSTOM_ACTION_SERVICE
					+ "/properties/property", 1, "value");

			scxmlParser.setErrorHandler(new SimpleErrorHandler());

			scxml = (SCXML) scxmlParser.parse(url.toString());
			SCXMLParser.updateSCXML(scxml);
		} catch (IOException e) {
			logger
					.error("Error persisting the configuration in temp file for state machine id "
							+ this.getId() + ".");
			throw new StateMachineException(
					"Error creating the state machine for state machine id "
							+ this.getId() + ".", e);
		} catch (SAXException e) {
			logger
					.error("Error parsing the configuration for state machine id "
							+ this.getId() + ".");
			throw new StateMachineException(
					"Error creating the state machine for state machine id "
							+ this.getId() + ".", e);
		} catch (ModelException e) {
			logger
					.error("Error persisting the configuration for state machine id "
							+ this.getId() + ".");
			throw new StateMachineException(
					"Error creating the state machine for state machine id "
							+ this.getId() + ".", e);
		}
		// Once done remove the file.
		tempConfigFile.delete();
		// initialize the executor.
		scxmlExecutor = new SCXMLExecutor();
		scxmlExecutor.setStateMachine(scxml);
		scxmlExecutor.setEvaluator(this.getEvaluator());
		scxmlExecutor.setErrorReporter(this.getErrorReporter());
		scxmlExecutor
				.setEventdispatcher(this.getEventDispatcher(scxmlExecutor));
		scxmlExecutor.addListener(scxml, new SimpleSCXMLListener());
		scxmlExecutor.registerInvokerClass("scxml", SimpleSCXMLInvoker.class);
		scxmlExecutor.setRootContext(scxmlExecutor.getEvaluator().newContext(
				null));
	}

	/**
	 * Private utility method that saves the configuration in the fusion temp
	 * directory.
	 * 
	 * @param configuration
	 *            scxml configuration.
	 * @return File handler.
	 * @throws IOException
	 */
	private File persistConfiguration(String configuration) throws IOException {
		String fusion_temp = this.bundleContext
				.getProperty(Properties.FUSION_TEMP);
		File directory = new File(fusion_temp);
		if (!directory.exists()) {
			directory.mkdir();
		}
		File file = new File(fusion_temp + "/" + "/"
				+ "Fusion_State_Machine_" + System.currentTimeMillis() + ".xml");
		// TODO put a check on if the file already exists.
		file.createNewFile();
		PrintWriter writer = new PrintWriter(file);
		writer.append(configuration);
		writer.close();
		return file;
	}

	/**
	 * Returns list of custom actions.
	 * 
	 * @return {@link List} of {@link CustomAction}
	 */
	private static List<CustomAction> getCustomActions() {
		// (1) Create a list of custom actions, add as many as are needed
		// currently only one custom action is exposed which internally would
		// execute action service registered by the component.
		List<CustomAction> customActions = new ArrayList<CustomAction>();
		CustomAction customAction = new CustomAction(NAMESPACE,
				CUSTOM_ACTION_SERVICE, SCXMLCustomAction.class);
		customActions.add(customAction);
		return customActions;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.StateMachine#triggerEvent(com.headstrong.fusion.statemachine.event.Event)
	 */
	public void triggerEvent(Event event) throws StateEventException {
		TriggerEvent triggerEvent = new TriggerEvent(event.getName(),
				TriggerEvent.SIGNAL_EVENT);
		// send the event
		try {
			scxmlExecutor.triggerEvent(triggerEvent);
		} catch (ModelException e) {
			logger.error("Error sending trigger Event" + triggerEvent.getName()
					+ " to state machine " + this.getId());
			throw new StateEventException(
					"Error sending trigger Event to the state machine", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.StateMachine#getCurrentState()
	 */
	public String getCurrentState() {
		// Assumption currently the way state machine is desined
		// state machine would be in single state. Nested / Parallel
		// states aren't handled.
		String state = null;
		Set<State> states = (Set<State>) this.scxmlExecutor.getCurrentStatus()
				.getStates();
		for (State scxmlState : states) {
			state = scxmlState.getId();
		}
		return state;
	}

	private Evaluator getEvaluator() {
		return new JexlEvaluator();
	}

	private ErrorReporter getErrorReporter() {
		return new StateMachineErrorReporter();
	}

	private EventDispatcher getEventDispatcher(SCXMLExecutor scxmlExecutor) {
		return new SimpleScheduler(scxmlExecutor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.StateMachine#getId()
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void start() throws StateMachineException {
		try {
			this.scxmlExecutor.go();
		} catch (ModelException e) {
			logger.error("Error starting state machine " + this.getId(), e);
			throw new StateMachineException(e);
		}
	}
}