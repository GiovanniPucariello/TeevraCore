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
 * $Id: LogServiceFactory.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */
package com.headstrong.fusion.logger;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogEntry;
import org.osgi.service.log.LogService;

/**
 * The <code>LogServiceFactory</code> implements the OSGi Log Service
 * specification and provides the functionality for the logging system. This
 * service should be one of the first services loaded in the system.
 */
public class LogServiceFactory implements ServiceFactory {

	private LogSupport logSupport;

	/**
	 * Initializes the logging system with settings from some startup properties
	 * before the real configuration is read after ContentBus bootstrap.
	 * 
	 * @param properties
	 *            The startup properties to initialize the logging system with.
	 */
	LogServiceFactory(LogSupport logSupport) {
		this.logSupport = logSupport;

	}

	// ---------- ServiceFactory ----------------------------------------------

	public Object getService(Bundle bundle, ServiceRegistration registration) {
		return new LogServiceImpl(bundle);
	}

	public void ungetService(Bundle bundle, ServiceRegistration registration,
			Object service) {
		// nothing to do currently
	}

	private class LogServiceImpl implements LogService {

		private Bundle bundle;

		/**
		 * Initializes the logging system with settings from some startup
		 * properties before the real configuration is read after ContentBus
		 * bootstrap.
		 * 
		 * @param properties
		 *            The startup properties to initialize the logging system
		 *            with.
		 */
		/* package */LogServiceImpl(Bundle bundle) {
			this.bundle = bundle;
		}

		// ---------- LogService
		// ---------------------------------------------------

		public void log(int level, String message) {
			this.log(null, level, message, null);
		}

		public void log(int level, String message, Throwable exception) {
			this.log(null, level, message, exception);
		}

		public void log(ServiceReference sr, int level, String message) {
			this.log(sr, level, message, null);
		}

		public void log(ServiceReference sr, int level, String message,
				Throwable exception) {
			// simply fire a log event
			LogEntry entry = new LogEntryImpl(this.bundle, sr, level, message,
					exception);
			LogServiceFactory.this.logSupport.fireLogEvent(entry);
		}
	}

}
