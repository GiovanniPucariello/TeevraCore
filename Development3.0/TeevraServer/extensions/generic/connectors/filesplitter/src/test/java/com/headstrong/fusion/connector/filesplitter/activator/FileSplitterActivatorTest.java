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
 * $Id: FileSplitterActivatorTest.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 4, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.activator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.commons.component.FusionComponentFactory;
import com.headstrong.fusion.connector.filesplitter.FileSplitterComponent;

/**
 * 
 */
public class FileSplitterActivatorTest {

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
	public void start() throws Exception {
		FileSplitterActivator activator = new FileSplitterActivator();
		activator.start(null);
		assertNotNull(FusionComponentFactory
				.getComponent(FileSplitterComponent.class.getSimpleName()));
	}

	@Test
	public void stop() throws Exception {
		FileSplitterActivator activator = new FileSplitterActivator();
		activator.stop(null);
		assertNull(FusionComponentFactory
				.getComponent(FileSplitterComponent.class.getSimpleName()));
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
