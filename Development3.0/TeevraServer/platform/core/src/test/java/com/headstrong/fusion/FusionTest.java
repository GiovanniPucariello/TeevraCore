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
 * $Id: FusionTest.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 3, 2008 
 */

package com.headstrong.fusion;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.headstrong.fusion.core.ApplicationContext;

/**
 * 
 */
public abstract class FusionTest extends TestCase {

	public BundleContext bundleContextMock;
	public Bundle bundleMock;
	public ApplicationContext applicationContextMock;
	List<String> propertiesToExcule = new ArrayList<String>();
	boolean replayed = false;

	/**
	 * 
	 * @precondition
	 * @postcondition 	
	 */

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		bundleContextMock = createMock(BundleContext.class);
		bundleMock = createMock(Bundle.class);
		applicationContextMock = createMock(ApplicationContext.class);

		this.initializeCommonBehavior();
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 */
	private void initializeCommonBehavior() {
		expect(bundleContextMock.getBundle()).andReturn(bundleMock).anyTimes();
		expect(applicationContextMock.getBundleContext()).andReturn(
				bundleContextMock).anyTimes();
		this.addProperties();
		this.addCommonServiceReferences();
	}

	/**
	 * Should be called from inside the actual test before assertions.
	 * @precondition
	 * @postcondition 	
	 */
	public void replayCommonBehavior() {
		replay(bundleContextMock);
		replay(bundleMock);
		replay(applicationContextMock);
		this.replayed = true;
	}

	/**
	 * Add some common properties that might be required by 
	 * the test cases.
	 *
	 * @precondition
	 * @postcondition
	 */
	private void addProperties() {

		/**
		 * Add fusion.conf = src/test/resource
		 */
		if (isPropertyRequired("fusion.conf.dir")) {
			expect(bundleContextMock.getProperty("fusion.conf.dir")).andReturn(
					"src/test/resources/").anyTimes();
		}
		/**
		 * set fusion.process.dir
		 */
		if (isPropertyRequired("fusion.process.dir")) {
			expect(bundleContextMock.getProperty("fusion.process.dir"))
					.andReturn("src/test/resources/").anyTimes();
		}

		/**
		 * set fusion.process.temp
		 */
		if (isPropertyRequired("fusion.process.temp.dir")) {
			expect(bundleContextMock.getProperty("fusion.process.temp.dir"))
					.andReturn("src/test/resources/").anyTimes();
		}

		/**
		 * set fusion.home
		 */
		if (isPropertyRequired("fusion.home")) {
			expect(bundleContextMock.getProperty("fusion.home")).andReturn(
					"src/test/resources/").anyTimes();
		}
	}

	private void addCommonServiceReferences() {

	}

	/**
	 *
	 * @precondition
	 * @postcondition 	
	 * @param propertyName
	 * @return
	 */
	private boolean isPropertyRequired(String propertyName) {
		boolean isRequired = true;

		if (this.getPropertiesToExcule().contains(propertyName)) {
			isRequired = false;
		}
		return isRequired;
	}

	/**
	 * @return the propertiesToExcule
	 */
	public List<String> getPropertiesToExcule() {
		return propertiesToExcule;
	}

	/**
	 * @param propertiesToExcule the propertiesToExcule to set
	 */
	public void setPropertiesToExcule(List<String> propertiesToExcule) {
		this.propertiesToExcule = propertiesToExcule;
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (!this.replayed) {
			this.replayCommonBehavior();
		}
		verify(bundleContextMock);
		verify(bundleMock);
		verify(applicationContextMock);
		this.replayed = false;
	}
}
