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
 * $Id: FileLogPersistor.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 15, 2010 
 */

package com.headstrong.fusion.eventlogger.persistor;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.FusionException;

/**
 * An implementation of LogPersistor. It logs the events from temporary File
 * system to a relational database
 */
public class FileLogPersistor implements EventLogPersistor {

	private static final Logger logger = LoggerFactory
			.getLogger(FileLogPersistor.class);

	private static BundleContext context;

	public FileLogPersistor(BundleContext bundleContext) throws FusionException {
		context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistComponentEventLogs()
	 */
	@Override
	public void persistComponentEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistMessageEventLogs()
	 */
	@Override
	public void persistMessageEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#persistProcessEventLogs()
	 */
	@Override
	public void persistProcessEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistComponentEventLogs()
	 */
	@Override
	public void stopPersistComponentEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistMessageEventLogs()
	 */
	@Override
	public void stopPersistMessageEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.eventlogger.persistor.EventLogPersistor#stopPersistProcessEventLogs()
	 */
	@Override
	public void stopPersistProcessEventLogs() throws FusionException {
		// TODO Auto-generated method stub

	}

}
