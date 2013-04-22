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
 * $Id: Route.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 4, 2008 
 */

package com.headstrong.fusion.config;

import java.io.Serializable;
import java.util.List;

public class Route implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8803869386557063700L;

	// process identifier
	private String id;
	
//	// Default flow type is seda.
//	private String flow = "SEDA";
	// A collection of routes ( indicates the message flow )
	private List<SequenceType> sequence;

	private boolean start = false;
	private boolean end = false;
	private String savepoint ;
	private boolean split = false;
	
	/**
	 * @return the start
	 */
	public boolean isStart() {
		return start;
	}

	/**
	 * @param start the start to set
	 */
	public void setStart(boolean start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public boolean isEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(boolean end) {
		this.end = end;
	}

	

	/**
	 * @return the savepoint
	 */
	public String getSavepoint() {
		return savepoint;
	}

	/**
	 * @param savepoint the savepoint to set
	 */
	public void setSavepoint(String savepoint) {
		this.savepoint = savepoint;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	/**
//	 * @return the flow
//	 */
//	public String getFlow() {
//		return flow;
//	}
//
//	/**
//	 * @param flow the flow to set
//	 */
//	public void setFlow(String flow) {
//		this.flow = flow;
//	}

	/**
	 * @return the sequence
	 */
	public List<SequenceType> getSequence() {
		return sequence;
	}

	/**
	 * @param sequence the sequence to set
	 */
	public void setSequence(List<SequenceType> sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the split
	 */
	public boolean isSplit() {
		return split;
	}

	/**
	 * @param split the split to set
	 */
	public void setSplit(boolean split) {
		this.split = split;
	}

}
