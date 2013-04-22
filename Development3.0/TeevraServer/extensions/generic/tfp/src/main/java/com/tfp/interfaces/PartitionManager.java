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
 * $Id: PartitionManager.java
 */
package com.tfp.interfaces;

/**
 * This file is provided by MCH team for TFP integration.
 */
public interface PartitionManager extends ProcessManager {
	
	/**
	 * Process the partition.
	 * @throws Exception
	 */
	public void processPartition() throws Exception;
}
