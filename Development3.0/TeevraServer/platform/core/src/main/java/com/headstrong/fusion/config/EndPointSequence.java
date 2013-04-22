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
 * $Id: EndPointSequence.java
 * $Revision: 
 * $Author: som krishan
 * $DateTime: Sep 21, 2008
 */

package com.headstrong.fusion.config;

import java.util.List;

/**
 * @author som krishan
 *
 */
public class EndPointSequence implements SequenceType {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8504710826863799598L;

	private String endPointId;

	// TODO : Not supported in this release
	private List<Aspect> aspects;
	/**
	 * Default if given to zero will remove 
	 * the clause from the process
	 * 
	 */
	private int threads = 0;
	
	private boolean deadEnd = false;

	/**
	 * @return the aspects
	 */
	public List<Aspect> getAspects() {
		return aspects;
	}

	/**
	 * @param aspects the aspects to set
	 */
	public void setAspects(List<Aspect> aspects) {
		this.aspects = aspects;
	}

	/**
	 * @return the threads
	 */
	public int getThreads() {
		return threads;
	}

	/**
	 * @param threads the threads to set
	 */
	public void setThreads(int threads) {
		this.threads = threads;
	}

	/**
	 * @return the endPointId
	 */
	public String getEndPointId() {
		return endPointId;
	}

	/**
	 * @param endPointId the endPointId to set
	 */
	public void setEndPointId(String endPointId) {
		this.endPointId = endPointId;
	}

	/**
	 * @return the deadEnd
	 */
	public boolean isDeadEnd() {
		return deadEnd;
	}

	/**
	 * @param deadEnd the deadEnd to set
	 */
	public void setDeadEnd(boolean deadEnd) {
		this.deadEnd = deadEnd;
	}
	

}
