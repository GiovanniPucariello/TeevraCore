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
 * $Id: QpidConsumer.java
 * $Revision: 
 * $Author: NBagchi
 * $DateTime: Apr 12, 2011 
 */

package com.headstrong.fusion.connector.qpid;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.connector.qpid.config.QpidConfiguration;

/**
 * Qpid consumer.
 */
public class QpidConsumer implements FusionConsumer<MessageExchange>, Runnable {

	/**
	 * Logger for this consumer.
	 */
	private static final Logger consumerLogger = LoggerFactory
			.getLogger(QpidConsumer.class);
	/**
	 * Fusion service support.
	 */
	private FusionServiceSupport serviceSupport;
	/**
	 * Qpid end point.
	 */
	private QpidEndpoint qpidEndpoint;
	/**
	 * Connection instance.
	 */
	private Connection connection;
	/**
	 * Destination broker
	 */
	private Destination queue;
	/**
	 * Qpid context
	 */
	private Context context;

	private QpidConfiguration qpidConfiguration;
	/**
	 * Exception
	 */
	private Exception firstExceptionThrown;
	/**
	 * Fusion processor responsible for processing the message on receipt on the
	 * message.
	 */
	private FusionProcessor processor;
	/**
	 * Executor responsible for execution the threads for concurrent consumers
	 */
	private ExecutorService executor;
	
	/**
	 * Thread counter
	 */
	private static int threadCounter;
	
	private Thread connectionT;

	/**
	 * Constructor
	 * 
	 * @param qpidEndpoint
	 *            Qpid endpoint;
	 * @param processor
	 *            Processor.
	 */
	public QpidConsumer(QpidEndpoint qpidEndpoint, FusionProcessor processor) {
		this.qpidEndpoint = qpidEndpoint;
		this.processor = processor;
		this.qpidConfiguration = qpidEndpoint.getQpidConfiguration();
	}

	/**
	 * Establish connection, create session and initiallize the executor thread
	 * on start.
	 */
	public void start() throws Exception {
		connectionT = new ConnectionThread();
		connectionT.start();
		
	}
	
	public void consume() throws Exception
	{
		try {


			try {

					String connectionURL = qpidConfiguration.getQueueUrl();
					Properties properties = new Properties();

					properties.put(QpidConstants.JNDI_INITIAL_NAME,
							QpidConstants.JNDI_INITIAL_VALUE);

					// amqp://guest:guest@clientid/test?brokerlist='tcp://localhost:5672'
					properties.put(QpidConstants.CONNECTION_FACTORY_NAME,
							connectionURL);
					properties.put(QpidConstants.QUEUE_NAME, qpidConfiguration
							.getQueueName());

					ConnectionFactory connectionFactory = null;

					try {
						// NOTE - HACK required to avoid ClassNotFoundException
						// while
						// retrieving the
						// InitialContext.
						ClassLoader contextClassLoader = Thread.currentThread()
								.getContextClassLoader();
						try {
							Thread.currentThread().setContextClassLoader(
									getClass().getClassLoader());
							context = new InitialContext(properties);

							connectionFactory = (ConnectionFactory) context
									.lookup("local");

						} finally {
							Thread.currentThread().setContextClassLoader(
									contextClassLoader);
						}
						// HACK -- Finished
					} catch (NamingException e) {
						consumerLogger.error(
								"Error initiallizing context for Qpid queue.", e);
						throw new Exception(e.getMessage());
					}

					
							try
								{
						// Creates a JMS connection.
						connection = connectionFactory.createConnection();
						// Activates the connection.
						connection.start();
		
						// Creates a destination for the topic exchange, so senders and
						// receivers can use it.
						queue = (Destination) context.lookup("queueName");
								}
							catch(Exception e)
							{
								consumerLogger.error("Connection could not be established. Trying after 10 Secs" + e);
								try {
									Thread.sleep(10000);
								} catch (InterruptedException e1) {
									consumerLogger.error("Error occurred while waiting for reconnecting to qpid", e1);
								}
							}
					

				} catch (Exception exp) {
					consumerLogger.error("Error during connection establishment.",
							exp);
				}
			
		

			// =============For concurrent execution===================
			int concurrentConsumers = qpidConfiguration.getThreadCount();

			executor = Executors.newFixedThreadPool(concurrentConsumers,
					new ThreadFactory() {

						public Thread newThread(Runnable runnable) {
							Thread thread = new Thread(
									runnable,
									getThreadName(qpidEndpoint.getEndpointUri()));
							thread.setDaemon(true);
							return thread;
						}
					});
			for (int i = 0; i < concurrentConsumers; i++) {
				executor.execute(this);
			}
			// ======================================

			firstExceptionThrown = null;

		} catch (Exception e) {
			consumerLogger.error("Couldn't establish Connection", e);
			throw new Exception(e.getMessage());
		}
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionService#stop()
	 */
	public void stop() throws Exception {

		// Close connection and session.
		consumerLogger.info("Closing connection and session.");
		close();

		// Shutdown the executor, which in turns interrupts all the threads.
		
		executor.shutdownNow();
		executor = null;
		connectionT.stop();

		if (firstExceptionThrown != null) {
			throw firstExceptionThrown;
		}
	}

	/**
	 * Close the context and the connection.
	 * 
	 * @throws Exception
	 */
	private void close() throws Exception {
		try {
			connection.close();
			context.close();
		} catch (JMSException e) {
			consumerLogger.error("Error during closing.", e);
			throw new Exception(e.getMessage());
		} catch (NamingException e) {
			consumerLogger.error("Error during closing.", e);
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;
	}

	@Override
	public void run() {

		
			// Creates a session. This session is not transactional
			// (transactions='false'), and messages are automatically
			// acknowledged.
			Session session = null;
			MessageConsumer messageConsumer = null;
			
			
					try {
					session = connection.createSession(false,
					Session.AUTO_ACKNOWLEDGE);

			// Creates a consumer that reads messages from the topic
			// exchange.
					messageConsumer = session.createConsumer(queue);
			messageConsumer.setMessageListener(new QpidQueueMessageListener(
					qpidEndpoint, processor));
				}
				 catch (Exception e) {
					consumerLogger.error("Error in creating MessageConsumer. trying after 10 Secs", e);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						consumerLogger.error("Error occurred while waiting for reconnecting to qpid", e1);
					}
				}
				

		
	}

	/**
	 * Creates a new thread name with the given prefix.
	 */
	protected synchronized String getThreadName(String prefix) {
		return prefix + " thread:" + nextThreadCounter();
	}

	/**
	 * Returns the next thread count.
	 * 
	 * @return
	 */
	protected static synchronized int nextThreadCounter() {
		return ++threadCounter;
	}
	
	class ConnectionThread extends Thread
	{
		
		public void run()
		{
			try {
				consume();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				consumerLogger.error("Error while establishing connection 1 in QpidConsumer 1. Trying in 30 secs");
			}
			do{
				try{
					Thread.currentThread().sleep(30000);
					((Connection)connection).getMetaData();
				}catch (JMSException jmsException) {
					executor.shutdown();
					executor = null;
					try {
						consume();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						consumerLogger.error("Error while establishing connection 1 in QpidConsumer  2 . Trying in 30 secs");
					}
				}catch (Exception exception) {
					executor.shutdown();
					executor = null;
					try {
						consume();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						consumerLogger.error("Error while establishing connection 1 in QpidConsumer  3 . Trying in 30 secs");
					}
				}
			}	while(true);
		}
	}
	
	
	
}


