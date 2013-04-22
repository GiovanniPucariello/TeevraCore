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
 * $Id: QpidComponent.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 * Connects to Qpid clients.
 */
public class QpidComponent implements FusionComponent {

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		QpidEndpoint qpidEndpoint = new QpidEndpoint(bindingConfig
				.getProperties());
		return qpidEndpoint;
	}

}
