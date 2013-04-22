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
 * $Id: FusionRunnable.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 8, 2008 
 */

package com.headstrong.fusion.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Any class/activity that has to use multi threading should use this class. As
 * the core framework would stop all the threads that implement this interface.
 * Thread don't need to take care of stop.
 * 
 */
public abstract class FusionRunnable extends Thread {
	private static Logger logger = LoggerFactory
			.getLogger(FusionRunnable.class);
	public static boolean STOP = false;

	/**
	 * Default wait period is 1000 ms.
	 */
	public long waitPeriod = 10000;

	public void run() {
		while (!STOP) {
			this.task();
			try {
				Thread.sleep(this.waitPeriod);
			} catch (InterruptedException e) {
				logger.error("Error while waiting",e);
				// ignoring the error.
			}
		}
	}

	public abstract void task();

	/**
	 * @return the waitPeriod
	 */
	public long getWaitPeriod() {
		return waitPeriod;
	}

	/**
	 * @param waitPeriod the waitPeriod to set
	 */
	public void setWaitPeriod(long waitPeriod) {
		this.waitPeriod = waitPeriod;
	}
}
