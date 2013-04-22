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
 * $Id: SDMDBComponent.java
 * $Revision:
 * $Author:
 * $DateTime:
 */

package com.headstrong.fusion.connector.sdmdb;

import com.headstrong.fusion.commons.BindingConfig;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionComponent;
import com.headstrong.fusion.commons.component.FusionEndpoint;

/**
 *
 */
public class SDMDBComponent implements FusionComponent {

	@Override
	public FusionEndpoint<MessageExchange> createEndpoint(
			BindingConfig bindingConfig) throws Exception {
		SDMDBEndpoint sdmDBEndpoint = new SDMDBEndpoint(bindingConfig
				.getProperties());
		return sdmDBEndpoint;
	}

}
