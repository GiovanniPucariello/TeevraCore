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
 * $Id: ApplicationContextHelper.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Dec 12, 2008 
 */

package com.headstrong.fusion.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import com.headstrong.fusion.commons.exception.InitializationException;

/**
 * 
 */
public class ApplicationContextHelper {

	/**
	 * A utility method that copies the byte array to ${fusion.process.temp.dir}
	 * directory.
	 * 
	 * @param file
	 * @throws Exception
	 */
	public static File persistDefinitionToTemp(byte[] file, String processTemp)
			throws Exception {
		File tempProcessFile = createTempProcessFile(processTemp);
		FileOutputStream out = new FileOutputStream(tempProcessFile);
		try {
			out.write(file);
		} finally {
			out.close();
		}
		return tempProcessFile;
	}

	/**
	 * A utility method that copies the byte array to ${fusion.process.temp.dir}
	 * directory.
	 * 
	 * @param definition
	 * @throws Exception
	 */
	public static File persistDefinitionToTemp(String definition,
			String processTemp) throws Exception {
		File tempProcessFile = createTempProcessFile(processTemp);
		PrintWriter writer = new PrintWriter(tempProcessFile);
		writer.append(definition);
		writer.close();
		return tempProcessFile;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @return
	 * @throws Exception
	 */
	public static File createTempProcessFile(String processTemp)
			throws Exception { // 1: write the byte

		// TC : if ${fusion.process.temp.dir} property is not set throw Exception.
		// This check should be part of Bootstrap.
		if (processTemp == null) {
			throw new InitializationException(
					"Error while registering the process. Unable to locate Process.Temp directory.");
		}

		// If the directory is not present , create the directory.
		// TC: Check if process temp directory exists , If not create the
		// directory.
		// If create fails throw InitializationException.
		File tempProcessDir = new File(processTemp);
		if (!tempProcessDir.exists()) {
			boolean success = tempProcessDir.mkdirs();
			if (!success) {
				throw new InitializationException(
						"Unable to create process.temp directory.");
			}
		}

		// File name is Fusion_${System.currentTimeMillis()}
		File tempProcessFile = new File(processTemp + "/" + "Fusion_"
				+ System.currentTimeMillis());

		return tempProcessFile;
	}
}
