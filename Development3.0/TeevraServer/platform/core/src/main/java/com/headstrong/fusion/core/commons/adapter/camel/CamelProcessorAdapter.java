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
 * $Id: CamelProcessorAdapter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 27, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProcessor;

/**
 * 
 */
public class CamelProcessorAdapter implements FusionProcessor {
	/**
	 * underlying camel processor.
	 */
	private Processor processor;
	/**
	 * Camel Context.
	 */
	private CamelContext context;

	/**
	 * @param processor
	 * @param context
	 */
	public CamelProcessorAdapter(Processor processor, CamelContext context) {
		this.processor = processor;
		this.context = context;
	}

	@Override
	public void process(MessageExchange messageExchange) throws Exception {
		// create camel exchange
		Exchange exchange = new CamelExchangeAdapter(messageExchange,
				this.context);
		this.processor.process(exchange);
	}
}
