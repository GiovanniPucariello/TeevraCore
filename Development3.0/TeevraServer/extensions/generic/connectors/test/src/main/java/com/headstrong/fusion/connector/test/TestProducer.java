/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: TestProducer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.connector.test;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * 
 */
public class TestProducer implements FusionProducer<MessageExchange> {

	private TestEndPoint testEndPoint;
	FusionServiceSupport serviceSupport;

	public TestProducer(FusionEndpoint<MessageExchange> endpoint) {
		this.testEndPoint = (TestEndPoint) endpoint;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	@Override
	public void process(MessageExchange exchange) throws Exception {
		String message = null;
		// get the message
		if (exchange.getIn() != null) {
			if (!(exchange.getIn().getBody() instanceof String)) {
				throw new Exception("invalid message type "
						+ exchange.getIn().getBody().getClass());
			}
			message = (String) exchange.getIn().getBody();
		}

//		QueueManager.getInstance().getQueue(
//				testEndPoint.getBindingConfig().getProcessId(),
//				testEndPoint.getBindingConfig().getServiceId()).put(message);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	@Override
	public void start() throws Exception {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	@Override
	public void stop() throws Exception {
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport=serviceSupport;
		
	}

}
