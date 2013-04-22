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
 * $Id: SCXMLStateMachineManager.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 10, 2009 
 */

package com.headstrong.fusion.statemachine;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.statemachine.event.Event;
import com.headstrong.fusion.statemachine.event.SimpleEvent;
import com.headstrong.fusion.statemachine.exception.StateMachineException;

/**
 * Default state machine manager implementation.
 */
public class SCXMLStateMachineManager implements StateMachineManager {
	private static Logger logger = LoggerFactory
			.getLogger(SCXMLStateMachineManager.class);
	private BundleContext bundleContext;
	private StateMachineStore store;

	/**
	 * @param bundleContext
	 */
	public SCXMLStateMachineManager(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		this.store = new StateMachineStore();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.StateMachineManager#registerStateMachine(java.lang.String,
	 *      java.lang.String, java.lang.Object)
	 */
	public void registerStateMachine(String id, String definition,
			Object payload) throws StateMachineException {
		if ( logger.isDebugEnabled() ) {
			logger.debug("Registering state machine:" + definition);
		}
		// create the state machine.
		StateMachine stateMachine = new SCXMLStateMachine(id,
				this.bundleContext, definition);
		// FIXME - transaction handling required b/n init start and storing.
		// initialize and start the machine.
		stateMachine.init();
		stateMachine.start();
		// register the state machine with the store.
		this.getStore().addStateMachine(id, stateMachine, payload);
	}

	/**
	 * @return the store
	 */
	public StateMachineStore getStore() {
		return store;
	}

	/**
	 * @param store
	 *            the store to set
	 */
	public void setStore(StateMachineStore store) {
		this.store = store;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.statemachine.StateMachineManager#triggerEvent(java.lang.String,
	 *      java.lang.String, java.lang.Object)
	 */
	public void triggerEvent(String id, String event, Object payload)
			throws StateMachineException {
		Event simpleEvent = new SimpleEvent();
		simpleEvent.setName(event);
		StateMachine stateMachine = this.getStore().getStateMachine(id);
		stateMachine.triggerEvent(simpleEvent);
		this.getStore().updateStateMachine(id, stateMachine, payload);
	}
}
