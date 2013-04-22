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
 * $Author: ssoni
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.commons;

import java.util.Observer;

import com.headstrong.fusion.commons.component.SyncService;

/**
 * represents an state observer.
 */
public interface StateObserver extends Observer {
	public SyncService getService();
}
