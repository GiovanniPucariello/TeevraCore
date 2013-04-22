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
 * $Id: MediationEndPointModeler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Sep 16, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.processor;

import com.headstrong.fusion.commons.MediationService;
import com.headstrong.fusion.commons.ServiceConfig;
import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.config.MediatorConfig;
import com.headstrong.fusion.core.CamelProcessContext;
import com.headstrong.fusion.core.commons.DefaultServiceConfig;
import com.headstrong.fusion.core.commons.GenericProcessor;

/**
 * {@link MediationEndPointModeler} represents a {@link MediationService}.
 * 
 */
public class MediationEndPointModeler implements ProcessorEndPointModeler {

	/**
	 * Underlying generic processor. Invokes the actual service.
	 */
	private GenericProcessor processor;
	/**
	 * Configuration.
	 */
	private MediatorConfig config;

	/**
	 * 
	 * @throws InitializationException
	 */
	public void init(CamelProcessContext processContext,
			MediatorConfig mediatorConfig, String processId)
			throws InitializationException {
		this.setConfig(mediatorConfig);
		// Create a Generic Processor.
		ServiceConfig serviceConfig = new DefaultServiceConfig(processContext,
				mediatorConfig.getType(), mediatorConfig.getId(), processId,
				mediatorConfig.getProperties(), mediatorConfig
						.getErrorConfigList());
		this.processor = new GenericProcessor(processContext, serviceConfig);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.messaging.model.endpoint.processor.ProcessorEndPointModeler#getProcessor()
	 */
	public GenericProcessor getProcessor() throws InitializationException {
		if (this.processor == null) {
			throw new InitializationException("MediationEndpoint not ready.");
		} else {
			return processor;
		}
	}

	/**
	 * @return the config
	 */
	public MediatorConfig getConfig() {
		return config;
	}

	/**
	 * @param config
	 *            the config to set
	 */
	public void setConfig(MediatorConfig config) {
		this.config = config;
	}

}
