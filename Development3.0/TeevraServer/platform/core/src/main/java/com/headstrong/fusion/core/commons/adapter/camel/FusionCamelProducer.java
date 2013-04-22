package com.headstrong.fusion.core.commons.adapter.camel;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.core.commons.CamelMessageExchange;


/**
 * Wrapper on Fusion FusionProducer.
 */
public class FusionCamelProducer extends DefaultProducer {

	private static Logger logger = LoggerFactory
			.getLogger(FusionCamelProducer.class);

	/**
	 * Producer conforms to Fusion interfaces.
	 */
	private FusionProducer<MessageExchange> fusionProducer;

	/**
	 * @param endpoint
	 */
	public FusionCamelProducer(Endpoint endpoint) {
		super(endpoint);
	}

	/**
	 * @param endPoint
	 * @param producer
	 */
	public FusionCamelProducer(Endpoint endPoint,
			FusionProducer<MessageExchange> producer) {
		super(endPoint);
		this.fusionProducer = producer;
		this.fusionProducer.setServiceSupport(new FusionServiceSupportImpl(this));
	}

	/* (non-Javadoc)
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	public void process(Exchange exchange) throws Exception {
		MessageExchange camelExchange = new CamelMessageExchange(exchange);
		try {
			this.fusionProducer.process(camelExchange);
		} catch (Exception ex) {
			logger.error("Error sending the message.", ex);
			throw ex;
		}
	}

	@Override
	public void start() throws Exception {
		try {
			super.start();
			this.fusionProducer.start();
		} catch (Exception ex) {
			logger.error("Error starting the producer.", ex);
			throw ex;
		}
	}

	@Override
	public void stop() throws Exception {
		try {
			super.stop();
			this.fusionProducer.stop();
		} catch (Exception ex) {
			logger.error("Error stopping the producer.", ex);
			throw ex;
		}
	}
	/**
	 * Default implementation always calls-back the 
	 * Service Support implementation of util methods. 
	 * Injects dependency from Camel to Fusion.
	 *  
	 * @author raghavendrar
	 */
	private class FusionServiceSupportImpl implements FusionServiceSupport{
		FusionCamelProducer producer;
		
		public FusionServiceSupportImpl(FusionCamelProducer producer) {
			super();
			this.producer = producer;
		}

		@Override
		public boolean isRunAllowed() {
			return producer.isRunAllowed();
		}
		
	}
}
