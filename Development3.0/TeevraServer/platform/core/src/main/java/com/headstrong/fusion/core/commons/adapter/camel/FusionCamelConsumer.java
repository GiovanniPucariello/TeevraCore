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
 * $Id: FusionCamelConsumer.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Mar 11, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.support.ServiceSupport;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * <code>FusionCamelConsumer</code> is the camel fusionConsumer.
 */
public class FusionCamelConsumer extends ServiceSupport implements
		Consumer {

	FusionConsumer<MessageExchange> fusionConsumer;
	
	/**
	 * Constructor for FusionCamelConsumer
	 * 
	 * @param endpoint
	 */
	public FusionCamelConsumer(FusionConsumer<MessageExchange> fusionConsumer) {
		super();
		this.fusionConsumer = fusionConsumer;
		fusionConsumer.setServiceSupport(new FusionServiceSupportImpl(this));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.impl.ServiceSupport#doStart()
	 */
	protected void doStart() throws Exception {
		this.fusionConsumer.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.impl.ServiceSupport#doStop()
	 */
	protected void doStop() throws Exception {
		this.fusionConsumer.stop();
	}
	
	/**
	 * Default implementation always calls-back the 
	 * Service Support implementation of util methods. 
	 * Injects dependency from Camel to Fusion.
	 *  
	 * @author raghavendrar
	 */
	private class FusionServiceSupportImpl implements FusionServiceSupport{
		FusionCamelConsumer consumer;
		
		public FusionServiceSupportImpl(FusionCamelConsumer consumer) {
			super();
			this.consumer = consumer;
		}

		@Override
		public boolean isRunAllowed() {
			return consumer.isRunAllowed();
		}
		
	}

	@Override
	public Endpoint getEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
