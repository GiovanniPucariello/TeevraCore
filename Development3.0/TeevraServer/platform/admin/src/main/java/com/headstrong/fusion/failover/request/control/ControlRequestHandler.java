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
 * $Id: ControlRequestHandler.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jan 21, 2009 
 */

package com.headstrong.fusion.failover.request.control;

import org.jgroups.Message;
import org.jgroups.blocks.RequestHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.failover.MemberContext;

/**
 * Handles control request received by this Node.
 *  
 */
public class ControlRequestHandler implements RequestHandler {

	private static final Logger logger = LoggerFactory
			.getLogger(ControlRequestHandler.class);

	private MemberContext memberContext;
	
	public ControlRequestHandler(MemberContext memberContext) {
		this.memberContext = memberContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.jgroups.blocks.RequestHandler#handle(org.jgroups.Message)
	 */
	public Object handle(Message message) {
		if (logger.isInfoEnabled()) {
			logger.info(this + ".RequestHandler received " + message
					+ " on the control channel");
		}
		try {
			ControlRequest request = readRequest(message);
			return request.handle(this.memberContext);
		} catch (Throwable e) {
			logger.error("Caught Exception in RequestHandler", e);
			IllegalStateException e2 = new IllegalStateException(e.getMessage());
			e2.setStackTrace(e.getStackTrace());
			throw e2;
		}
	}

	private ControlRequest readRequest(Message message) throws Exception {
		ControlRequest request = ControlRequest.getReqest(message);
		return request;
	}

}
