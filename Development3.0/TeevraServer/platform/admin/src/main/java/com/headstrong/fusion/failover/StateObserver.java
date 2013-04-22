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
 * $Id: StateObserver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover;

import java.util.Observable;
import java.util.Observer;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * State Observer waits on the state change on the Member Info.
 */
public class StateObserver implements Observer {

	/**
	 * Bundle Context.
	 */
	BundleContext bundleContext;

	private static Logger logger = LoggerFactory.getLogger(StateObserver.class);

	public StateObserver(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(Observable observable, Object arg) {
		MemberInfo info = (MemberInfo) observable;

		// Notify all the observers.
		// check how it works.
		ServiceReference[] references = null;
		try {
			references = bundleContext.getAllServiceReferences(
					StateChangeObserverService.class.getName(), null);
		} catch (InvalidSyntaxException e) {
			logger.error("Error sending notification", e);
			// change the state.
//			info.setState(State.STANDBY);
			// FIXME : check how to handle this.
			// Send a signal to other instances of self-deactivation
			// so that other one can take over.
		}

		// Send a state change notification.
		if ( references != null ) {
			for (ServiceReference reference : references) {
				StateChangeObserverService observer = (StateChangeObserverService) bundleContext
						.getService(reference);
				observer.update(info.getState());
			}
		}
	}
}
