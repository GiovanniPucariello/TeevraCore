package com.headstrong.fusion.logger.slf4j;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;

import junit.framework.TestCase;

public class FusionLoggerTest extends TestCase {

	private FusionLoggerWriter output = new FusionLoggerWriter(null) {
		public void writeln() throws IOException {
			// just flush, no end of line
			flush();
		}
	};

	private String messageOnly = "{5}";

	private FusionLoggerConfig config;

	private FusionLogger logger;

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		config = new FusionLoggerConfig(getClass().getName(), "",
				new HashSet<String>(), FusionLoggerLevel.DEBUG, output, output);

		logger = new FusionLogger("sample");
		logger.setLoggerConfig(config);
	}

	@Override
	protected void tearDown() throws Exception {
		output.close();
		super.tearDown();
	}

	public void testCheckLogLevelTrace() {
		// initial assertion
		config.setLogLevel(FusionLoggerLevel.TRACE);
		assertEquals(FusionLoggerLevel.TRACE, config.getLogLevel());

		// ensure logging disabled
		// none for trace

		// ensure logging enabled
		assertTrue(logger.isTraceEnabled());
		assertTrue(logger.isDebugEnabled());
		assertTrue(logger.isInfoEnabled());
		assertTrue(logger.isWarnEnabled());
		assertTrue(logger.isErrorEnabled());
	}

	public void testCheckLogLevelDebug() {
		// initial assertion
		config.setLogLevel(FusionLoggerLevel.DEBUG);
		assertEquals(FusionLoggerLevel.DEBUG, config.getLogLevel());

		// ensure logging disabled
		assertFalse(logger.isTraceEnabled());

		// ensure logging enabled
		assertTrue(logger.isDebugEnabled());
		assertTrue(logger.isInfoEnabled());
		assertTrue(logger.isWarnEnabled());
		assertTrue(logger.isErrorEnabled());
	}

	public void testCheckLogLevelInfo() {
		// initial assertion
		config.setLogLevel(FusionLoggerLevel.INFO);
		assertEquals(FusionLoggerLevel.INFO, config.getLogLevel());

		// ensure logging disabled
		assertFalse(logger.isTraceEnabled());
		assertFalse(logger.isDebugEnabled());

		// ensure logging enabled
		assertTrue(logger.isInfoEnabled());
		assertTrue(logger.isWarnEnabled());
		assertTrue(logger.isErrorEnabled());
	}

	public void testCheckLogLevelWarn() {
		// initial assertion
		config.setLogLevel(FusionLoggerLevel.WARN);
		assertEquals(FusionLoggerLevel.WARN, config.getLogLevel());

		// ensure logging disabled
		assertFalse(logger.isTraceEnabled());
		assertFalse(logger.isDebugEnabled());
		assertFalse(logger.isInfoEnabled());

		// ensure logging enabled
		assertTrue(logger.isWarnEnabled());
		assertTrue(logger.isErrorEnabled());
	}

	public void testCheckLogLevelError() {
		// initial assertion
		config.setLogLevel(FusionLoggerLevel.ERROR);
		assertEquals(FusionLoggerLevel.ERROR, config.getLogLevel());

		// ensure logging disabled
		assertFalse(logger.isTraceEnabled());
		assertFalse(logger.isDebugEnabled());
		assertFalse(logger.isInfoEnabled());
		assertFalse(logger.isWarnEnabled());

		// ensure logging enabled
		assertTrue(logger.isErrorEnabled());
	}

	public void testFormat() {
		StringWriter w = new StringWriter();
		output.setDelegatee(w);

		// a single message
		config.configure(messageOnly, new HashSet<String>(),
				FusionLoggerLevel.DEBUG, output, output);

		String message = "This is a message";
		logger.warn(message);
		assertEquals(message, w.toString());

		// reset output buffer and format with logger name and message
		w.getBuffer().delete(0, w.getBuffer().length());
		config.configure("{3}|{5}", new HashSet<String>(),
				FusionLoggerLevel.DEBUG, output, output);

		logger.warn(message);
		assertEquals(logger.getName() + "|" + message, w.toString());

		// reset output buffer and format with logger name, level, thread and
		// message
		w.getBuffer().delete(0, w.getBuffer().length());
		config.configure("{2}|{3}|{4}|{5}", new HashSet<String>(),
				FusionLoggerLevel.DEBUG, output, output);
		logger.warn(message);
		assertEquals(Thread.currentThread().getName() + "|" + logger.getName()
				+ "|" + FusionLoggerLevel.WARN + "|" + message, w.toString());
	}

}
