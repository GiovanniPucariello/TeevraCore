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
 * $Id: StateMachineLinkVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 12, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;

/**
 * Represents transition between states and hold its details
 */
public class StateMachineLinkVO implements Serializable {

	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = -5034350816224932053L;
	/**
	 * Identifier for the event the link represents
	 */
	private String eventName;
	/**
	 * Identifier of the state from where the link originates
	 */
	private String sourceStateName;
	/**
	 * Identifier of the target state of the link
	 */
	private String targetStateName;
	/**
	 * Action that needs to be performed during the transition
	 */
	private StateMachineActionVO transitionAction;

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the sourceStateName
	 */
	public String getSourceStateName() {
		return sourceStateName;
	}

	/**
	 * @param sourceStateName
	 *            the sourceStateName to set
	 */
	public void setSourceStateName(String sourceStateName) {
		this.sourceStateName = sourceStateName;
	}

	/**
	 * @return the targetStateName
	 */
	public String getTargetStateName() {
		return targetStateName;
	}

	/**
	 * @param targetStateName
	 *            the targetStateName to set
	 */
	public void setTargetStateName(String targetStateName) {
		this.targetStateName = targetStateName;
	}

	/**
	 * @return the transitionAction
	 */
	public StateMachineActionVO getTransitionAction() {
		return transitionAction;
	}

	/**
	 * @param transitionAction
	 *            the transitionAction to set
	 */
	public void setTransitionAction(StateMachineActionVO transitionAction) {
		this.transitionAction = transitionAction;
	}

}
