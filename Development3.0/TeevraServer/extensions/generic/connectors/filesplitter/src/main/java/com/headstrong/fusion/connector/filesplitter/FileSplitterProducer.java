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
 * $Id: FileSplitterProducer.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Mar 2, 2010 
 */

package com.headstrong.fusion.connector.filesplitter;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * FIle Splitter Producer
 */
public class FileSplitterProducer implements FusionProducer<MessageExchange> {

	/**
	 * Fusion Service supoort
	 */
	FusionServiceSupport serviceSupport;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#process(com.headstrong.fusion.commons.MessageExchange)
	 */
	@Override
	public void process(MessageExchange exchange) throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	@Override
	public void start() throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionProducer#setServiceSupport(com.headstrong.fusion.commons.component.FusionServiceSupport)
	 */
	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {

		this.serviceSupport = serviceSupport;

	}

	/**
	 * @return the serviceSupport
	 */
	public FusionServiceSupport getServiceSupport() {
		return serviceSupport;
	}
}
