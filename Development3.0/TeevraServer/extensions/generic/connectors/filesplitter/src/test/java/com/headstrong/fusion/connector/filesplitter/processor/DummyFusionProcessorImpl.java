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
 * $Id: DummyFusionProcessorImpl.java
 * $Revision: 
 * $Author: viswanathp
 * $DateTime: May 10, 2010 
 */

package com.headstrong.fusion.connector.filesplitter.processor;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProcessor;

/**
 * 
 */
public class DummyFusionProcessorImpl implements FusionProcessor {

	private MessageExchange messageExchange;

	/**
	 * @return the messageExchange
	 */
	public MessageExchange getMessageExchange() {
		return messageExchange;
	}

	/**
	 * @param messageExchange
	 *            the messageExchange to set
	 */
	public void setMessageExchange(MessageExchange messageExchange) {
		this.messageExchange = messageExchange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProcessor#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	@Override
	public void process(MessageExchange messageExchange) throws Exception {
		setMessageExchange(messageExchange);
		// TODO Auto-generated method stub
		System.out
				.println("Process method of Fusion processor is called which will create an exchange process the mesagage to camel");

	}

}
