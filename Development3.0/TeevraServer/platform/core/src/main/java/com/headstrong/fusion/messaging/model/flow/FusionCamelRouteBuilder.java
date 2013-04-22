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
 * $Id: CamelEventFlowRouteBuilder.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 18, 2008 
 */

package com.headstrong.fusion.messaging.model.flow;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * {@link FusionCamelRouteBuilder} extends {@link RouteBuilder}.
 * configure method delegates the call to 
 */
public class FusionCamelRouteBuilder extends RouteBuilder {

	private ProcessFlowModeler<RouteBuilder> modeler;

	/**
	 * As the {@link RouteBuilder} configure method is invoked by the 
	 * {@link DefaultCamelContext} class. {@link ProcessFlowModeler} 
	 * is injected and {@link ProcessFlowModeler#configure()} 
	 * is called on {@link #configure()} of {@link RouteBuilder}.
	 * 
	 * @param modeler
	 */
	public FusionCamelRouteBuilder(ProcessFlowModeler<RouteBuilder> modeler) {
		this.modeler = modeler;
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.builder.RouteBuilder#configure()
	 */
	@Override
	public void configure() throws Exception {
		this.modeler.configure();
	}

}
