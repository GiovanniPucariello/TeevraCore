/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright Â© 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: TestConsumer.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.connector.test;

import java.util.concurrent.BlockingQueue;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.NormalizedMessage;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;

/**
 * Test Consumer.
 */
public class TestConsumer implements FusionConsumer<MessageExchange> {

	private FusionEndpoint<MessageExchange> endpoint;
	private FusionProcessor processor;
	
	FusionServiceSupport serviceSupport;

	private boolean run = false;
	private QueueReader queueReader = null;

	public TestConsumer(FusionEndpoint<MessageExchange> endpoint,
			FusionProcessor processor) {
		this.endpoint = endpoint;
		this.processor = processor;
		this.queueReader = new QueueReader(this);
		this.queueReader.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#start()
	 */
	@Override
	public void start() throws Exception {
		this.run = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	@Override
	public void stop() throws Exception {
		this.run = false;
	}

	private class QueueReader extends Thread {
		private TestConsumer consumer;

		public QueueReader(TestConsumer testConsumer) {
			this.consumer = testConsumer;
		}

		@Override
		public void run() {
			String processId = ((TestEndPoint) consumer.getEndpoint())
					.getBindingConfig().getProcessId();
			String serviceId = ((TestEndPoint) consumer.getEndpoint())
					.getBindingConfig().getServiceId();
			BlockingQueue<String> queue = QueueManager.getInstance().getQueue(
					processId, serviceId);
			while (consumer.run) {
				if (queue.peek() != null) {
					String message = queue.poll();
					MessageExchange messageExchange = consumer.getEndpoint()
							.createExchange();
					NormalizedMessage normalizedMessage = new FusionNormalizedMessage();
					normalizedMessage.setBody(message);
					messageExchange.setIn(normalizedMessage);
					try {
						this.consumer.getProcessor().process(messageExchange);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// ignore.
				}
			}
		}
	}

	/**
	 * @return the endpoint
	 */
	public FusionEndpoint<MessageExchange> getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 *            the endpoint to set
	 */
	public void setEndpoint(FusionEndpoint<MessageExchange> endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * @return the processor
	 */
	public FusionProcessor getProcessor() {
		return processor;
	}

	/**
	 * @param processor
	 *            the processor to set
	 */
	public void setProcessor(FusionProcessor processor) {
		this.processor = processor;
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport=serviceSupport;
		
	}

}
