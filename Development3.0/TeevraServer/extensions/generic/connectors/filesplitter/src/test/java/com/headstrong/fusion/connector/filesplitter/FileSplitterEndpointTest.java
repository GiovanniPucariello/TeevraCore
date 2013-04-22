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
 * $Id: FileSplitterEndpointTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.connector.filesplitter;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class FileSplitterEndpointTest {

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test {@link FileSplitterEndpoint}{@link #getEndpointURI()} method.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	@Test
	public void getEndpointURI() throws Exception {

		Map<String, String> properties = new HashMap<String, String>();
		FileSplitterEndpoint endpoint = new FileSplitterEndpoint(properties);
		String uri = FileSplitterEndpoint.FILE_SPLITTER + endpoint.hashCode();
		assertEquals(uri, endpoint.getEndpointUri());
	}

	/**
	 * Test {@link FileSplitterEndpoint}{@link #isSingleton()} method.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws Exception
	 */
	@Test
	public void isSingleton() throws Exception {
		Map<String, String> properties = new HashMap<String, String>();
		FileSplitterEndpoint endpoint = new FileSplitterEndpoint(properties);
		assertEquals(false, endpoint.isSingleton());
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
