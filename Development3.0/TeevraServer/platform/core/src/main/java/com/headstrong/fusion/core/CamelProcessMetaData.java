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
 * $Id: CamelProcessMetaData.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: May 27, 2009 
 */

package com.headstrong.fusion.core;

import java.util.HashMap;

import org.apache.camel.Endpoint;

/**
 * Stores Camel Process Related Metadata.
 */
public class CamelProcessMetaData implements ProcessMetaData {
	private static final String SEPARATOR = ".";
	private static final String SEDA = "SEDA";
	/**
	 * List of input SEDA queue for the endpoints. Key is the unique endpoint id
	 * in the process.
	 * 
	 */
	private HashMap<String, Endpoint> endpoints = new HashMap<String, Endpoint>();

	/**
	 * @return the endpoints
	 */
	public HashMap<String, Endpoint> getSourceEndpoints() {
		return endpoints;
	}

	/**
	 * @param endpoints
	 *            the endpoints to set
	 */
	public void setSourceEndpoints(
			HashMap<String, Endpoint> sedaEndpoints) {
		this.endpoints = sedaEndpoints;
	}

	/**
	 * Adds a new SedaEndPoint in the Map.
	 * 
	 * @param processId
	 *            Unique process identifier. ( Not required as of now )
	 * @param serviceId
	 *            Unique service identifier.
	 * @param endpoint
	 *            SedaEndpoint.
	 */
	public void addEndpoint(String processId, String serviceId,
			Endpoint endpoint) {
		String key = processId + SEPARATOR + serviceId;
		this.endpoints.put(key, endpoint);
	}

	public Endpoint getEndpoint(String processId, String endPointId) {
		String key = processId + SEPARATOR + endPointId;
		return this.endpoints.get(key);
	}

	/**
	 * Adds a new SedaEndPoint in the Map.
	 * 
	 * @param processId
	 *            Unique process identifier. ( Not required as of now )
	 * @param serviceId
	 *            Unique service identifier.
	 * @param endpoint
	 *            SedaEndpoint.
	 */
	public void addSourceSedaEndpoint(String processId, String serviceId,
			Endpoint endpoint) {
		String key = processId + SEPARATOR + SEDA + SEPARATOR + serviceId;
		this.endpoints.put(key, endpoint);
	}

	/**
	 * Returns the SEDA input queue for the endpoint.
	 * 
	 * @param processId
	 * @param endPointId
	 * @return
	 */
	public Endpoint getSourceSedaEndpoint(String processId,
			String endPointId) {
		String key = processId + SEPARATOR + SEDA + SEPARATOR + endPointId;
		return this.endpoints.get(key);
	}
}
