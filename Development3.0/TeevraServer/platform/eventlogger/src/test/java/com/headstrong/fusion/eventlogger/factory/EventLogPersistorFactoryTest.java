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
 * $Id: EventLogPersistorFactoryTest.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 18, 2010 
 */

package com.headstrong.fusion.eventlogger.factory;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import org.junit.Before;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import junit.framework.TestCase;

/**
 * 
 */
public class EventLogPersistorFactoryTest extends TestCase {
	private BundleContext contextMock;
	private Bundle bundleMock;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		// create collaborator
		contextMock = createMock(BundleContext.class);
		bundleMock = createMock(Bundle.class);
		expect(contextMock.getBundle()).andReturn(bundleMock);
		replay(contextMock);
		replay(bundleMock);

		EventLogPersistorFactory.createEventLogPersistorFactory(contextMock);

	}

	public void testGetEventLogWriter() throws Exception {
		assertNotNull(EventLogPersistorFactory
				.getEventLogPersistor(EventLogPersistorFactory.EVENT_LOG_PERSISTORS.MQ));
	}

	public void testStringGetEventLogWriter() throws Exception {
		assertNotNull(EventLogPersistorFactory.getEventLogPersistor("MQ"));
	}

	public void testGetBundleContext() {
		assertNotNull(EventLogPersistorFactory.getBundleContext());
	}

}
