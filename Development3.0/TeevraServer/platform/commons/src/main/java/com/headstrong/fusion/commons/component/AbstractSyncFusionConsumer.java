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
 * $Id: AbstractSyncFusionConsumer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.ComponentEvent;
import com.headstrong.fusion.commons.ProcessStateController;

/**
 * Abstract Sync
 */
public abstract class AbstractSyncFusionConsumer implements FusionConsumer,
		SyncService {

	private ProcessStateController processStateController;

	public void registerObserver() {
		this.processStateController
				.registerStateObserver(new DefaultStateObserver(this));
	}

	public void initialized() {
		ComponentEvent event = new ComponentEvent(getComponentId(),
				ComponentEvent.Event.INITIALIZED);
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
