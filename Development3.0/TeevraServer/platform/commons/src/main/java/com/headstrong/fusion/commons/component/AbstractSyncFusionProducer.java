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
 * $Id: AbstractSyncFusionProducer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.ProcessStateController;

/**
 * 
 */
public abstract class AbstractSyncFusionProducer implements FusionProducer,
		SyncService {

	private static final Logger logger = LoggerFactory
			.getLogger(AbstractSyncFusionProducer.class);

	private ProcessStateController processStateController;

	public void registerObserver() {
		this.processStateController
				.registerStateObserver(new DefaultStateObserver(this));
	}

	public void initialized() {
		ComponentEvent event = new ComponentEvent(getComponentId(),
				ComponentEvent.Event.INITIALIZED);
		logger.debug("Initialized invoked by " + getComponentId()
				+ " and processStateController is " + processStateController);
		this.processStateController.registerEvent(event);
	}

	public ProcessStateController getProcessStateController() {
		return processStateController;
	}

	public void setProcessStateController(
			ProcessStateController processStateController) {
		this.processStateController = processStateController;
	}

}
