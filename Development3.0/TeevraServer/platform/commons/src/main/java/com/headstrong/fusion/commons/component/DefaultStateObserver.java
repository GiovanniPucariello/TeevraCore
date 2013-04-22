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
 * $Id: DefaultStateObserver.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons.component;

import java.util.Observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.StateObserver;

/**
 * State observer.
 */
public class DefaultStateObserver implements StateObserver {
	private static final Logger logger = LoggerFactory
			.getLogger(DefaultStateObserver.class);
	private SyncService service;

	public DefaultStateObserver(SyncService service) {
		this.service = service;
	}

	@Override
	public void update(Observable o, Object arg) {
		logger.debug("Invoking proceed on Observable instance of class "
				+ o.getClass().getName());
		this.service.proceed();
	}

	@Override
	public SyncService getService() {
		return service;
	}
}
