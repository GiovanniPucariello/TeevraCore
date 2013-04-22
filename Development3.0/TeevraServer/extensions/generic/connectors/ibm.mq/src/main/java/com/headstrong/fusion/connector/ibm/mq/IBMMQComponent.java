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
 * $Id: IBMMQComponent.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: July 24, 2009 
 */
package com.headstrong.fusion.connector.ibm.mq;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * IBM MQ component. 
 */
public class IBMMQComponent implements FusionComponent {

	private BundleContext context;
	
	public IBMMQComponent(BundleContext context) {
		this.context = context;
	}
	
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.commons.component.FusionComponent#createEndpoint(com.headstrong.fusion.commons.BindingConfig)
	 */
	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		return new IBMMQEndpoint(bindingConfig, this.context);
	}

}
