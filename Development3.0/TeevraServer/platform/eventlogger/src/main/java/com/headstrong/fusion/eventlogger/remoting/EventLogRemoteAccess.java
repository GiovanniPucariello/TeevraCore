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
 * $Id: EventLogRemoteAccess.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: Jun 25, 2010 
 */

package com.headstrong.fusion.eventlogger.remoting;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.Properties;
import com.headstrong.fusion.eventlogger.factory.EventLogPersistorFactory;
import com.headstrong.fusion.eventlogger.persistor.EventLogPersistor;

/**
 * Performs the commands through remote access
 */
public class EventLogRemoteAccess implements EventLogRemoteAccessMBean {

	private BundleContext context;

	private EventLogPersistor persistor;

	/**
	 * Constructor
	 */
	public EventLogRemoteAccess(BundleContext bundleContext) {

		this.context = bundleContext;
		// get the Event logging storage type
		String eventLogStorageType = this.context
				.getProperty(Properties.EVENT_LOG_STORAGE);
		// get the event log persistor
		persistor = EventLogPersistorFactory
				.getEventLogPersistor(eventLogStorageType);

	}

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#persistComponentEventLogs()
	 */
	@Override
	public void persistComponentEventLogs() throws Exception {
		persistor.persistComponentEventLogs();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#persistMessageEventLogs()
	 */
	@Override
	public void persistMessageEventLogs() throws Exception {
		persistor.persistMessageEventLogs();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#persistProcessEventLogs()
	 */
	@Override
	public void persistProcessEventLogs() throws Exception {
		persistor.persistProcessEventLogs();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#stopMComponentEventLogPersist()
	 
	@Override
	public void stopComponentEventLogPersist() throws Exception {
		persistor.stopPersistComponentEventLogs();

	}

	
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#stopMessageEventLogPersist()
	 
	@Override
	public void stopMessageEventLogPersist() throws Exception {
		persistor.stopPersistMessageEventLogs();

	}

	
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.remoting.EventLogRemoteAccessMBean#stopProcessEventLogPersist()
	 
	@Override
	public void stopProcessEventLogPersist() throws Exception {
		persistor.stopPersistProcessEventLogs();

	}*/

}
