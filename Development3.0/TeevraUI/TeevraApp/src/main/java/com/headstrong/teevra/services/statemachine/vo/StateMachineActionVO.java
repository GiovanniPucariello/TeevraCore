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
 * $Id: StateMachineActionVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 12, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;
import java.util.List;

import com.headstrong.teevra.services.process.eo.ProcessServiceConfigurationEO;

/**
 * Represents the state machine action
 */
public class StateMachineActionVO implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 6788465351111114783L;

	/**
	 * Name of the action(component)
	 */
	private long compId;
	/**
	 * @return the compId
	 */
	public long getCompId() {
		return compId;
	}

	/**
	 * @param compId the compId to set
	 */
	public void setCompId(long compId) {
		this.compId = compId;
	}

	/**
	 * configurations of the action
	 */
	private List<ProcessServiceConfigurationEO> configurations;

	

	/**
	 * @return the configurations
	 */
	public List<ProcessServiceConfigurationEO> getConfigurations() {
		return configurations;
	}

	/**
	 * @param configurations the configurations to set
	 */
	public void setConfigurations(
			List<ProcessServiceConfigurationEO> configurations) {
		this.configurations = configurations;
	}

}
