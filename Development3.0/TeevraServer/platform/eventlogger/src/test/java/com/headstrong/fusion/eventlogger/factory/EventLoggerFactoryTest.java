package com.headstrong.fusion.eventlogger.factory;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import junit.framework.TestCase;

import org.junit.Before;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;


public class EventLoggerFactoryTest  extends TestCase{
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
		EventLoggerFactory.createEventLoggerFactory(contextMock);
		
		
	}

	public void testDefaultEventLogger() throws Exception {
		assertNotNull(EventLoggerFactory.getEventLogger(EventLoggerFactory.EVENT_LOGGERS.DEFAULT));
		
	}
	
	public void testGetBundleContext() {
		assertNotNull(EventLoggerFactory.getBundleContext());
	}
	

}
