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
 * $Id: BatchSplitStrategy.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 29, 2009 
 */

package com.headstrong.fusion.config;

/**
 * Splitting is done based on the batch size.
 */
public class BatchSplitStrategy implements SplitterStrategy {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6755227908666402296L;
	private int batchSize;

	/**
	 * @return the batchSize
	 */
	public int getBatchSize() {
		return batchSize;
	}

	/**
	 * @param batchSize
	 *            the batchSize to set
	 */
	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}
}
