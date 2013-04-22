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
 * $Id: SchemaServiceStateObserver.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 20, 2009 
 */

package com.headstrong.fusion.services.message.schema;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.State;
import com.headstrong.fusion.failover.StateChangeObserverService;

/**
 * State change observer for schema service
 */
public class SchemaServiceStateObserver implements StateChangeObserverService {

	private FusionSchemaService schemaService;

	private static final Logger logger = LoggerFactory
			.getLogger(SchemaServiceStateObserver.class);

	/**
	 * @param bootstrapManager
	 */
	public SchemaServiceStateObserver(FusionSchemaService schemaService) {
		this.schemaService = schemaService;
	}

	@Override
	public void update(State state) {
		if (State.ACTIVE.equals(state)) {
			try {
				schemaService.reloadCache();
			} catch (Exception e) {

				logger.error("Error while reloading schema cache.", e);
				IllegalStateException e2 = new IllegalStateException(e
						.getMessage());
				e2.setStackTrace(e.getStackTrace());
				throw e2;
			}
		}

	}

}
