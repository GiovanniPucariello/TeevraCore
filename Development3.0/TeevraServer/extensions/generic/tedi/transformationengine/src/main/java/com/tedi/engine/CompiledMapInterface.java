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
 * $Id: CompiledMapInterface.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.util.Vector;
import objTedi.MapFile;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public interface CompiledMapInterface {

	/**
	 * Set the transformation engine.
	 * 
	 * @param engine
	 *            The TransformationEngine.
	 */
	public void setEngine(TransformationEngine engine);

	/**
	 * Get the map file.
	 * 
	 * @return Returns the map.
	 */
	public MapFile getMapFile();

	/**
	 * Get the output type.
	 * 
	 * @return Returns the output type.
	 */
	public String getOutputType();

	/**
	 * Get the map description.
	 * 
	 * @return Returns the map description.
	 */
	public String getMapDesc();

	/**
	 * Get the source.
	 * 
	 * @return Returns the source.
	 */
	public String getSource();

	/**
	 * Process the message.
	 * 
	 * @return Process the message.
	 * @throws Exception
	 */
	public Vector[] processUnitOfWork() throws Exception;

}
