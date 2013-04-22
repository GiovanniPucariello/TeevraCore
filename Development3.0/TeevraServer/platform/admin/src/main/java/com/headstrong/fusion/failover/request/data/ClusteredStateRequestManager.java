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
 * $Id: ClusteredStateRequestManager.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 2, 2009 
 */

package com.headstrong.fusion.failover.request.data;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.osgi.framework.BundleContext;

/**
 * Manages request information locally. Keeps all the instances in-sync.
 * 
 */
public class ClusteredStateRequestManager {
	private BundleContext bundleContext;
	private int requestId = 1;

	public ClusteredStateRequestManager(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/**
	 * Generates a new request id for each request.
	 * 
	 * @return Request Id
	 */
	private synchronized int getRequestId() {
		return requestId++;
	}

	public void persist(ClusteredStateRequest request) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(request
				.getBuffer().length);
		DataOutputStream daos = new DataOutputStream(baos);
		// Add handler Name
		daos.writeUTF(request.getHandlerName());
		// buffer size
		daos.writeInt(request.getBuffer().length);
		daos.write(request.getBuffer());
		daos.flush();
		
	}

}
