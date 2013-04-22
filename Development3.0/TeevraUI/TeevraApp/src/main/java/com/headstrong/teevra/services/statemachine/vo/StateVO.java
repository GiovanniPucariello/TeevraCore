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
 * $Id: StateVO.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 12, 2009 
 */

package com.headstrong.teevra.services.statemachine.vo;

import java.io.Serializable;

/**
 * Represents a state of a state machine and holds its details
 */
public class StateVO implements Serializable {

	public static final String INIT = "INIT";
	public static final String END = "END";
	public static final String NORMAL = "NORMAL";
	/**
	 * Generated serial version UID
	 */
	private static final long serialVersionUID = 2990259355068918875L;

	/**
	 * Name of the state
	 */
	private String stateName;
	/**
	 * Description of the state
	 */
	private String stateDesc;
	/**
	 * Type of the state-START/END/NORMAL
	 */
	private String stateType;
	/**
	 * Action that needs to be performed on entry into the state
	 */
	private StateMachineActionVO entryAction;
	/**
	 * Action that needs to be performed on exit from the state
	 */
	private StateMachineActionVO exitAction;

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName
	 *            the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateDesc
	 */
	public String getStateDesc() {
		return stateDesc;
	}

	/**
	 * @param stateDesc
	 *            the stateDesc to set
	 */
	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	/**
	 * @return the stateType
	 */
	public String getStateType() {
		return stateType;
	}

	/**
	 * @param stateType
	 *            the stateType to set
	 */
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

	/**
	 * @return the entryAction
	 */
	public StateMachineActionVO getEntryAction() {
		return entryAction;
	}

	/**
	 * @param entryAction
	 *            the entryAction to set
	 */
	public void setEntryAction(StateMachineActionVO entryAction) {
		this.entryAction = entryAction;
	}

	/**
	 * @return the exitAction
	 */
	public StateMachineActionVO getExitAction() {
		return exitAction;
	}

	/**
	 * @param exitAction
	 *            the exitAction to set
	 */
	public void setExitAction(StateMachineActionVO exitAction) {
		this.exitAction = exitAction;
	}

}
