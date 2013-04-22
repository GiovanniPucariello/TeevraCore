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
 * $Id: StateMachineModelCache.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 17, 2009 
 */

package com.headstrong.fusion.services.statemachine.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * This Singleton class contains the state machine id/state 
 * model.
 * 
 */
public class StateMachineModelCache {

	private Map<String, String> stateModelMap;
	private static StateMachineModelCache stateMachineModelCache;

	/**
	 * Private constructor required to make 
	 * it singleton.
	 */
	private StateMachineModelCache() {
		this.stateModelMap = new HashMap<String, String>();
	}

	/**
	 * Returns the singleton instance if already created.
	 * or creates a new instance and returns the same.
	 * 
	 * @return {@link StateMachineModelCache}
	 */
	public static StateMachineModelCache getInstance() {
		synchronized (StateMachineModelCache.class) {
			if (stateMachineModelCache == null) {
				stateMachineModelCache = new StateMachineModelCache();
			}
		}
		return stateMachineModelCache;
	}

	/**
	 * Returns the state machine model.
	 * 
	 * @param stateMachineModelId
	 * @return state machine model.
	 */
	public String getStateMachineModel(String stateMachineModelId) {
		return this.stateModelMap.get(stateMachineModelId);
	}

	/**
	 * adds the state machine model.
	 * 
	 * @param stateMachineModelId
	 * @param stateMachineModel
	 */
	public void addStateMachineModel(String stateMachineModelId,
			String stateMachineModel) {
		this.stateModelMap.put(stateMachineModelId, stateMachineModel);
	}
}
