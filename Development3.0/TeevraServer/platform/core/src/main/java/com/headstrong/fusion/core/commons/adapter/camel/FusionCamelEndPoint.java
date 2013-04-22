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
 * $Id: EuronextEndpoint.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Feb 18, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.ProcessStateController;
import com.headstrong.fusion.commons.component.AbstractSyncFusionConsumer;
import com.headstrong.fusion.commons.component.AbstractSyncFusionProducer;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 * A default camel EndPointModeler. This works as a wrapper for other
 * {@link FusionEndpoint}
 * 
 */
@SuppressWarnings("unchecked")
public class FusionCamelEndPoint extends DefaultEndpoint {
	private static final Logger logger = LoggerFactory
			.getLogger(FusionCamelEndPoint.class);
	/**
	 * Fusion endpoint.
	 */
	private FusionEndpoint<MessageExchange> endPoint;

	private ProcessStateController stateController;

	/**
	 * @param endPoint
	 */
	public FusionCamelEndPoint(FusionEndpoint<MessageExchange> endPoint,
			ProcessStateController stateController) {
		this.endPoint = endPoint;
		this.stateController = stateController;
	}

	@Override
	protected String createEndpointUri() {
		return this.endPoint.getEndpointUri();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Endpoint#createConsumer(org.apache.camel.Processor)
	 */
	public Consumer createConsumer(Processor processor) throws Exception {
		/**
		 * Fusion processor is a wrapper on underlying processor. Any consumer
		 * which conforms to fusion APIs would call process on this processor.
		 * This just converts the MessageExchange to Camel Exchange and
		 * delegates the call to processor.
		 */
		logger.debug("Inside createConsumer");

		FusionProcessor fusionProcessor = new CamelProcessorAdapter(processor,
				this.getCamelContext());
		FusionConsumer<MessageExchange> fusionConsumer = this.endPoint
				.createConsumer(fusionProcessor);
		if (fusionConsumer instanceof AbstractSyncFusionConsumer) {
			logger.debug("Setting stateController in consumer "
					+ stateController);
			((AbstractSyncFusionConsumer) fusionConsumer)
					.setProcessStateController(this.stateController);
			((AbstractSyncFusionConsumer) fusionConsumer).registerObserver();

		}
		FusionCamelConsumer consumer = new FusionCamelConsumer(fusionConsumer);
		return consumer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Endpoint#createProducer()
	 */
	public Producer createProducer() throws Exception {
		logger.debug("Inside createProducer");
		FusionProducer<MessageExchange> fusionProducer = endPoint
				.createProducer();
		if (fusionProducer instanceof AbstractSyncFusionProducer) {
			logger.debug("Setting stateController in producer "
					+ stateController);
			((AbstractSyncFusionProducer) fusionProducer)
					.setProcessStateController(this.stateController);
			((AbstractSyncFusionProducer) fusionProducer).registerObserver();
		}
		FusionCamelProducer producer = new FusionCamelProducer(this,
				fusionProducer);
		return producer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Endpoint#isSingleton()
	 */
	public boolean isSingleton() {
		return endPoint.isSingleton();
	}
}
