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
 * $Id: SchemaRemoteAccess.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Nov 13, 2009 
 */

package com.headstrong.fusion.services.message.schema.remoting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.services.message.schema.FusionSchemaService;

/**
 * Implements schema related methods accessed remotely
 */
public class SchemaRemoteAccess implements SchemaRemoteAccessMBean {

	private static Logger logger = LoggerFactory
			.getLogger(SchemaRemoteAccess.class);

	private FusionSchemaService schemaService;

	public SchemaRemoteAccess(FusionSchemaService schemaService) {
		this.schemaService = schemaService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.services.message.schema.remoting.SchemaRemoteAccessMBean#reloadSchemaCache()
	 */
	@Override
	public synchronized void reloadSchemaCache() throws Exception {
		logger.info("Reload Schema Cache Request received");
		schemaService.reloadCache();

	}
}
