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
 * $Id: ServiceResolver.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 17, 2008 
 */

package com.headstrong.fusion.commons.resolver;


/**
 * A Service Resolver resolves a service.
 * 
 */
public interface ServiceResolver<T> {

	public T getService(String type, long timeToWait);
	public boolean isServiceAvailable(String type, long timeToWait);
}
