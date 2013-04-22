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
 * $Id: FileIteratorTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.iterator;

import java.io.File;
import java.util.Iterator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class FileIteratorTest {

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
	public void iterator() throws Exception {
		String filePath = "src/test/resources/temp.txt";

		File file = new File(filePath);

		FileIterator fileIterator = new FileIterator(file);

		Iterator<String> iterator = fileIterator.iterator();

		Assert.assertNotNull(iterator);

		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		Assert.assertEquals(3, count);
	}

	@Test
	public void Close() throws Exception {
		String filePath = "src/test/resources/temp.txt";

		File file = new File(filePath);

		FileIterator fileIterator = new FileIterator(file);

		Iterator<String> iterator = fileIterator.iterator();

		fileIterator.Close();

		try {
			iterator.hasNext();
		} catch (Exception e) {
			// If we get Exception message as 'Stream closed' , the test case is
			// passed
			return;
		}

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
