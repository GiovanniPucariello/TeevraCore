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
 * $Id: FileManagerTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 11, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.connector.filesplitter.config.FileSplitterConfiguration;

/**
 * 
 */
public class FileManagerTest {

	private static String TEMP_DIR = "src/test/resources/temp";

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void renameFile() throws Exception {
//		File directory = new File(TEMP_DIR);
//		File tempFile = null;
//		try {
//			tempFile = File.createTempFile("MyFile", ".txt", directory);
//			System.out.print("Created temporary file with name ");
//			System.out.println(tempFile.getAbsolutePath());
//
//		} catch (IOException ex) {
//			System.err.println("Cannot create temp file: " + ex.getMessage());
//		}
//
//		Map<String, String> properties = new HashMap<String, String>();
//
//		properties.put("inputDirectory", TEMP_DIR);
//
//		FileSplitterConfiguration config = new FileSplitterConfiguration(
//				properties);
//
//		FileManager.renameFile(tempFile, config);

	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

}
