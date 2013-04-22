package com.headstrong.fusion.connector.http.receiver;

import java.util.ArrayList;
import java.util.UUID;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.server.http.HTTPStandardListener;
import com.headstrong.fusion.server.http.WebObjectImpl;



/**
 * 
 * 
 * @author mali
 *
 */
public class HttpConsumer implements FusionConsumer<MessageExchange> {

	private static Logger logger = LoggerFactory.getLogger(HttpConsumer.class);
	
	/**
	 * Fusion Service Support
	 */
	FusionServiceSupport serviceSupport;
	
	BundleContext context;
	
	private HTTPConsumerService httpService;

	/**
	 * HTTP receiver Endpoint
	 */
	private HttpReceiverEndpoint httpEndpoint;

	/**
	 * Fusion Processor
	 */
	private FusionProcessor processor;
	
	private HttpReceiverConfiguration config;
	
	private String body;
	
	private boolean run = false;
	
	public HttpConsumer(HttpReceiverEndpoint httpEndpoint,	FusionProcessor fusionProcessor) {
		this.httpEndpoint = httpEndpoint;
		this.config = httpEndpoint.gethttpReceiverBinding();
		this.context = httpEndpoint.getContext();
		this.processor = fusionProcessor;
		httpService = new HTTPConsumerService(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */	
	@SuppressWarnings("unchecked")
	public void start() throws Exception {	
		this.run=true;
		httpService.start();
		ArrayList list = new ArrayList();
		list.add(this);
		list.add(config);
		HTTPReceiverUtil.getConsumerPool().put(config.getUrlHandler(),this );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {
		this.run = false;
		HTTPReceiverUtil.getConsumerPool().remove(config.getUrlHandler());
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;

	}

	/**
	 * Service for consuming request
	 */
	private class HTTPConsumerService extends Thread {
		
		private HttpConsumer consumer;

		public HTTPConsumerService(HttpConsumer consumer) {
			this.consumer = consumer;
		}

		@Override
		public void run() {
			while (consumer.run) {
				if(body != null){
					MessageExchange messageExchange = httpEndpoint.createExchange();
					NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
					normalizedMessage.setBody(body);
					normalizedMessage.setMessageId(UUID.randomUUID().toString().toUpperCase());
					messageExchange.setIn(normalizedMessage);
					messageExchange.getIn().setHeader("Test", true);					
					try {
						if(config.getTransmitType().equalsIgnoreCase("synchronous")){
							synchronized (processor) {
								processor.process(messageExchange);
								Thread.sleep(500);
								long endTimeMillis = System.currentTimeMillis() + config.getResponseTimeout();		
								while(messageExchange.getIn().getHeader("processComplete") == null){
									if (System.currentTimeMillis() > endTimeMillis) {
							           WebObjectImpl.setTimeout(true);
							           WebObjectImpl.setProcessingMessage(false);
							           break;
							        }
								}
								WebObjectImpl.setProcessingMessage(false);								
							}
						}else{
							processor.process(messageExchange);
						}
						body = null;
					} catch (Exception e) {
						logger.error("Error while processing the message " + e);
						body=null;
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						logger.error("Error while processing the message " + e);
					}
				}
				
			}
		}


	}

	
	
	
	public HTTPConsumerService getHttpService() {
		return httpService;
	}

	public void setHttpService(HTTPConsumerService httpService) {
		this.httpService = httpService;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;		
	}

	public HttpReceiverConfiguration getConfig() {
		return config;
	}

	public void setConfig(HttpReceiverConfiguration config) {
		this.config = config;
	}
	
}
