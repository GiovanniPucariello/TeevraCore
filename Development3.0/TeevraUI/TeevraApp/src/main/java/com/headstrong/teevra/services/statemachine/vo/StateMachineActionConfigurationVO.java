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
 * $Id: StateMachineActionConfigurationVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;

/**
 * StateMachineActionConfigurationVO holds the configuration details of the actions 
 */
public class StateMachineActionConfigurationVO implements Serializable {

	/**
	 * add generated serial version UID
	 */
	private static final long serialVersionUID = -1330154868404156630L;

	/**
	 * Name of the state to which the action belongs to
	 */
	private String stateName;

	/**
	 * Identifier for the configuration
	 */
	private String configKey;

	/**
	 * Simple config value that needs to be inlined in SCXML
	 */
	private String simpleValue;

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the configKey
	 */
	public String getConfigKey() {
		return configKey;
	}

	/**
	 * @param configKey the configKey to set
	 */
	public void setConfigKey(String configKey) {
		this.configKey = configKey;
	}

	/**
	 * @return the simpleValue
	 */
	public String getSimpleValue() {
		return simpleValue;
	}

	/**
	 * @param simpleValue the simpleValue to set
	 */
	public void setSimpleValue(String simpleValue) {
		this.simpleValue = simpleValue;
	}
}
