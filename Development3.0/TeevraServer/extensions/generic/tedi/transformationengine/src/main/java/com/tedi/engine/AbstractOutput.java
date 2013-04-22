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
 * $Id: AbstractOutput.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */

package com.tedi.engine;

import java.util.Vector;
import objTedi.MapFile;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public abstract class AbstractOutput {

	/**
	 * The map file instance.
	 */
	protected MapFile mapFile;
	/**
	 * Stores the result of the execution.
	 */
	protected ExecutionResults execResults;

	/**
	 * Process the record structure. Every output format needs to implement this
	 * method.
	 * 
	 * @param recordStructureV
	 *            Record structure.
	 * @param writeFieldsV
	 *            Fields.
	 * @return
	 */
	public abstract String process(Vector recordStructureV, Vector writeFieldsV);

	/**
	 * Initialize the map
	 * 
	 * @param map
	 */
	public void setMap(MapFile map) {
		mapFile = map;
	}

	/**
	 * Set the execution result.
	 * 
	 * @param execRes
	 *            Set the execution result.
	 */
	public void setExecutionResults(ExecutionResults execRes) {
		execResults = execRes;
	}
}
