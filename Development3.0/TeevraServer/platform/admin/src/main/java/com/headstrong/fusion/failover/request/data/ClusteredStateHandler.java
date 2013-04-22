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
 * $Id: ClusteredConfigurationHandler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jan 29, 2009 
 */

package com.headstrong.fusion.failover.request.data;

import java.util.List;

/**
 * Handles data requests.
 * 
 */
public abstract class ClusteredStateHandler {

	/**
	 * On receiving a data request on the data channel this method handles the
	 * request. primarily all the handlers would persist the data.
	 * 
	 * @precondition {@link ClusteredStateRequest} != null
	 * @param clusteredStateRequest
	 *            state to be handled.
	 * @throws Exception
	 */
	public abstract void execute(ClusteredStateRequest clusteredStateRequest)
			throws Exception;

	/**
	 * Generates data request to send to the new joined instance 
	 * to synchronize the state.
	 * 
	 * @throws Exception
	 */
	public abstract List<ClusteredStateRequest> synchronize() throws Exception;
}
