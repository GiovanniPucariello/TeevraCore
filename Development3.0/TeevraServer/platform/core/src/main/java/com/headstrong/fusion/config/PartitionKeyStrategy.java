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
 * $Id: PartitionKeyStrategy.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Apr 27, 2009 
 */

package com.headstrong.fusion.config;

import java.util.List;

/**
 * A list of partition keys are defined.
 * distinct values of these attributes is used to aggregate the records.
 * 
 */
public class PartitionKeyStrategy implements SplitterStrategy {

	/**
	 * Serial version id.
	 */
	private static final long serialVersionUID = 113948959082709947L;
	
	/**
	 * List of attributes to be used for 
	 * aggregation. Distinct values of
	 * these will be used for aggregation.
	 * 
	 */
	private List<String> partitionKeys;

	/**
	 * @return the partitionKeys
	 */
	public List<String> getPartitionKeys() {
		return partitionKeys;
	}

	/**
	 * @param partitionKeys the partitionKeys to set
	 */
	public void setPartitionKeys(List<String> partitionKeys) {
		this.partitionKeys = partitionKeys;
	}
}
