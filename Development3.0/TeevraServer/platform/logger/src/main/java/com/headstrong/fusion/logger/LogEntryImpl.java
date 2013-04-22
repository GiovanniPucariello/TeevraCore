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
 * $Id: LogEntryImpl.java
 * $Revision: 
 * $Author: Mbafna
 * $DateTime: Sep 2, 2008 
 */

package com.headstrong.fusion.logger;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogEntry;

public class LogEntryImpl implements LogEntry {

	private final Bundle bundle;

	private final ServiceReference serviceReference;

	private final int level;

	private final String message;

	private final Throwable exception;

	private final long time;

	/* package */LogEntryImpl(Bundle bundle,
			ServiceReference serviceReference, int level, String message,
			Throwable exception) {
		this.bundle = bundle;
		this.serviceReference = serviceReference;
		this.level = level;
		this.message = message;
		this.exception = exception;
		this.time = System.currentTimeMillis();
	}

	public Bundle getBundle() {
		return this.bundle;
	}

	public ServiceReference getServiceReference() {
		return this.serviceReference;
	}

	public int getLevel() {
		return this.level;
	}

	public String getMessage() {
		return this.message;
	}

	public Throwable getException() {
		return this.exception;
	}

	public long getTime() {
		return this.time;
	}
}
