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
 * $Id: ObjectDescriptorCache.java
 * $Revision: 
 * $Author: Akrishnamoorthy
 * $DateTime: Oct 9, 2008 
 */

package com.headstrong.teevra.services.schema.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.headstrong.teevra.services.schema.eo.MessageSchemaEO;

/**
 * Cache to hold object descriptors (schemas) that are loaded.
 */
public class ObjectDescriptorCache implements Serializable {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = -6269001808314613185L;

	/** Singleton instance */
	private static ObjectDescriptorCache instance = new ObjectDescriptorCache();

	/** Map of schema name to the corresponding object descriptor */
	private Map<String, MessageSchemaEO> schemaCache;

	/** Private Constructor */
	private ObjectDescriptorCache() {
		schemaCache = new HashMap<String, MessageSchemaEO>();
	}

	/**
	 * Fetch singleton instance
	 * 
	 * @return singleton instance
	 */
	public static ObjectDescriptorCache getInstance() {
		return instance;
	}

	/**
	 * Adds the given <code>ObjectDescriptor</code> to the cache. Replaces, if
	 * it already exists
	 * 
	 * @param schemaName
	 *            name that uniquely identifies the schema
	 * @param descriptor
	 *            schema's descriptor
	 */
	public void addDescriptor(String schemaName, MessageSchemaEO descriptor) {
		schemaCache.put(schemaName, descriptor);
	}

	/**
	 * Fetches descriptor for the given schema
	 * 
	 * @param schemaName name of the schema
	 * @return <code>ObjectDescriptor</code> corresponding to the given
	 *         schema, null if that is not in cache
	 */
	public MessageSchemaEO getDescriptor(String schemaName) {
		return schemaCache.get(schemaName);
	}
}
