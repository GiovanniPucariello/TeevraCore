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
 * $Id: StateChangeObserver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover;

/**
 * Any bundle can implement this interface and register an observer with bundle
 * context.
 * <p>
 * On state change event all the observer's would be notified of the state
 * change event.
 * 
 */
public interface StateChangeObserverService {
	public void update(State state);
}
