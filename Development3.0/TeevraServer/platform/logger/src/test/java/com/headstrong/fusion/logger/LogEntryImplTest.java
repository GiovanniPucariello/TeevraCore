package com.headstrong.fusion.logger;

import org.easymock.internal.ReplayState;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import junit.framework.TestCase;
import com.headstrong.fusion.logger.LogEntryImpl;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.replay;

public class LogEntryImplTest extends TestCase {

	private LogEntryImpl logEntryImpl = null;

	public void testGetBundle() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertEquals(bundle, logEntryImpl.getBundle());
	}

	public void testGetServiceReference() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertEquals(reference, logEntryImpl.getServiceReference());
	}

	public void testGetLevel() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertEquals(0, logEntryImpl.getLevel());
	}

	public void testGetMessage() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertEquals("test", logEntryImpl.getMessage());
	}

	public void testGetException() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertEquals("test", logEntryImpl.getException().getMessage());
	}

	public void testGetTime() throws Exception {
		Bundle bundle = createMock(Bundle.class);
		ServiceReference reference = createMock(ServiceReference.class);
		replay(bundle);
		replay(reference);
		logEntryImpl = new LogEntryImpl(bundle, reference, 0, "test",
				new Exception("test"));
		assertNotNull(logEntryImpl.getTime());
	}

}