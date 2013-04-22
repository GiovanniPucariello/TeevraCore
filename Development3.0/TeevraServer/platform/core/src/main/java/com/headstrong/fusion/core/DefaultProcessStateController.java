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
 * $Id: DefaultProcessStateController.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.StateObserver;
import com.headstrong.fusion.commons.ComponentEvent.Event;

/**
 * Controls the state of the process.
 */
public class DefaultProcessStateController extends Observable implements
		ProcessStateController {
	private ProcessContext processContext;
	private Map<String, ComponentEvent.Event> componentEventMap;
	private static final Logger logger = LoggerFactory
			.getLogger(DefaultProcessStateController.class);

	public DefaultProcessStateController(ProcessContext processContext) {
		this.processContext = processContext;
		this.componentEventMap = new HashMap<String, ComponentEvent.Event>();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ProcessStateController#registerEvent(com.headstrong.fusion.commons.ComponentEvent)
	 */
	@Override
	public void registerEvent(ComponentEvent event) {
		this.componentEventMap.put(event.getComponentId(), event.getEvent());
		try {
			this.validateAndNotify();
		} catch (Exception e) {
			logger.error("Error notifying the observers");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ProcessStateController#registerStateObserver(com.headstrong.fusion.commons.StateObserver)
	 */
	@Override
	public void registerStateObserver(StateObserver stateObserver) {
		addObserver(stateObserver);
		logger.debug("Registering the component for endpoint Synchronization "
				+ stateObserver.getService().getComponentId());
		this.componentEventMap.put(stateObserver.getService().getComponentId(),
				ComponentEvent.Event.REGISTERED);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ProcessStateController#registerByServiceId(java.lang.String)
	 */
	@Override
	public void registerByServiceId(String serviceId) {
		this.componentEventMap.put(serviceId, ComponentEvent.Event.NEW);
	}

	/**
	 * if the event is initialized then check other components if all successful
	 * notify all the observers.
	 * 
	 * @throws Exception
	 */
	private synchronized void validateAndNotify() throws Exception {
		logger.debug("Inside validateAndNotify, size of componentEventMap is "
				+ componentEventMap.size());

		boolean sendSignal = true;
		for (Entry<String, ComponentEvent.Event> compEntry : this.componentEventMap
				.entrySet()) {
			logger.debug("Checking status of component " + compEntry.getKey());
			logger.debug("Status of component " + compEntry.getValue());

			if (compEntry.getValue().equals(ComponentEvent.Event.ERROR)) {
				// stop the execution and send a error signal to process
				// context.
				this.processContext.error("Component id " + compEntry.getKey()
						+ " startup failed.");
				break;
			} else if (!compEntry.getValue().equals(
					ComponentEvent.Event.INITIALIZED)) {
				logger
						.debug("Inside validateAndNotify, component is not initialized "
								+ compEntry.getKey());
				sendSignal = false;
			}
		}
		if (sendSignal) {
			logger
					.debug("Inside validateAndNotify, all components are initialized, notifying all ");
			this.setChanged();
			this.notifyObservers();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.ProcessStateController#clear()
	 */
	public void clear() {
		logger.debug("Clearing all components registered for sync start");
		this.componentEventMap.clear();
	}

	public static void main(String[] args) {
		ComponentEvent ce = new ComponentEvent("EurexEndpoint",
				Event.INITIALIZED);
		System.out.println(Event.INITIALIZED);
		System.out.println(ce.getEvent().equals(
				ComponentEvent.Event.INITIALIZED));
	}

}