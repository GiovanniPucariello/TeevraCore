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
 * $Id: FileSplitterProcessor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 12, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.processor;

import com.headstrong.fusion.commons.exception.FusionException;
import com.headstrong.fusion.connector.filesplitter.splitter.FileSplitter;

/**
 * 
 */
public interface FileSplitterProcessor {

	/**
	 * Processes the message. recordStartPattern is provided if the spliited
	 * message has to be routed based on it
	 * 
	 * @precondition
	 * @postcondition
	 * @param splitter
	 * @param message
	 * @param recordStartPattern
	 * @throws FusionException
	 */
	public void process(FileSplitter splitter, String message,
			String recordStartPattern) throws FusionException;
}
