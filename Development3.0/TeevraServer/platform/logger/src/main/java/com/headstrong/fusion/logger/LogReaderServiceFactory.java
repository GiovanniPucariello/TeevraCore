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
 * $Id: LogReaderServiceFactory.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */
package com.headstrong.fusion.logger;

import java.util.Enumeration;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.log.LogListener;
import org.osgi.service.log.LogReaderService;

/**
 * The <code>LogReaderServiceFactory</code> TODO
 * <p>
 * <blockquote> When a bundle which registers a LogListener object is stopped or
 * otherwise releases the Log Reader Service, the Log Reader Service must remove
 * all of the bundle's listeners.</blockquote>
 */
public class LogReaderServiceFactory implements ServiceFactory {

	private LogSupport logSupport;

	/* package */LogReaderServiceFactory(LogSupport logSupport) {
		this.logSupport = logSupport;
	}

	// ---------- ServiceFactory interface ------------------------------------

	public Object getService(Bundle bundle, ServiceRegistration registration) {
		return new LogReaderServiceImpl(bundle);
	}

	public void ungetService(Bundle bundle, ServiceRegistration registration,
			Object service) {
		((LogReaderServiceImpl) service).shutdown();
	}

	// --------- internal LogReaderService implementation ----------------------

	private class LogReaderServiceImpl implements LogReaderService {

		private Bundle bundle;

		/* package */LogReaderServiceImpl(Bundle bundle) {
			this.bundle = bundle;
		}

		/* package */void shutdown() {
			LogReaderServiceFactory.this.logSupport
					.removeLogListeners(this.bundle);
		}

		// ---------- LogReaderService interface
		// -----------------------------------

		public void addLogListener(LogListener listener) {
			LogReaderServiceFactory.this.logSupport.addLogListener(this.bundle,
					listener);
		}

		public void removeLogListener(LogListener listener) {
			LogReaderServiceFactory.this.logSupport.removeLogListener(listener);
		}

		@SuppressWarnings("unchecked")
		public Enumeration getLog() {
			return LogReaderServiceFactory.this.logSupport.getLog();
		}
	}

}
