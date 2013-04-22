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
 * $Id: ProcessConfigurationModel.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProcessConfigurationModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8120743924885861705L;
	
	private List<ConnectorConfig> connectors = new ArrayList<ConnectorConfig>();
	private List<MediatorConfig> mediators = new ArrayList<MediatorConfig>();
	private List<ErrorReporterConfig> errorReporters = new ArrayList<ErrorReporterConfig>();
	private List<RouterConfig> routers = new ArrayList<RouterConfig>();

	private Process process;
	

	/**
	 * @return the connectors
	 */
	public List<ConnectorConfig> getConnectors() {
		return connectors;
	}

	/**
	 * @param connectors the connectors to set
	 */
	public void setConnectors(List<ConnectorConfig> connectors) {
		this.connectors = connectors;
	}

	/**
	 * @return the mediators
	 */
	public List<MediatorConfig> getMediators() {
		return mediators;
	}

	/**
	 * @param mediators the mediators to set
	 */
	public void setMediators(List<MediatorConfig> mediators) {
		this.mediators = mediators;
	}

	/**
	 * @return the process
	 */
	public Process getProcess() {
		return process;
	}

	/**
	 * @param process the process to set
	 */
	public void setProcess(Process process) {
		this.process = process;
	}

	/**
	 * @return the routers
	 */
	public List<RouterConfig> getRouters() {
		return routers;
	}

	/**
	 * @param routers the routers to set
	 */
	public void setRouters(List<RouterConfig> routers) {
		this.routers = routers;
	}

	/**
	 * @return the errorReporters
	 */
	public List<ErrorReporterConfig> getErrorReporters() {
		return errorReporters;
	}

	/**
	 * @param errorReporters the errorReporters to set
	 */
	public void setErrorReporters(List<ErrorReporterConfig> errorReporters) {
		this.errorReporters = errorReporters;
	}
}
