/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * $Author: mali
 * 
 */

package com.headstrong.fusion.connector.http.receiver;

import org.osgi.framework.BundleContext;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 *
 * @author mali
 *
 */
public class HttpReceiverComponent implements FusionComponent {
	
	private BundleContext context;
	
	public HttpReceiverComponent(BundleContext context) {
		this.context = context;
	}

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		HttpReceiverEndpoint httpEndpoint = new HttpReceiverEndpoint(bindingConfig
				.getProperties(),context);
		return httpEndpoint;
	}

}
