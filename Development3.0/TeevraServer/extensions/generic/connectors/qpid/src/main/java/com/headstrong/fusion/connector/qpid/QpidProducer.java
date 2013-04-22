package com.headstrong.fusion.connector.qpid;

import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionProducer;
import com.headstrong.fusion.commons.component.FusionServiceSupport;
import com.headstrong.fusion.connector.qpid.config.QpidConfiguration;


public class QpidProducer implements FusionProducer<MessageExchange>, Runnable {

	/**
	 * Logger for this consumer.
	 */
	private static final Logger producerLogger = LoggerFactory
			.getLogger(QpidProducer.class);
	/**
	 * Qpid end point.
	 */
	private QpidEndpoint qpidEndpoint;
	/**
	 * Connection instance.
	 */
	private Connection connection;
	/**
	 * Qpid context
	 */
	private Context context;
	/**
	 * Fusion service support.
	 */
	private FusionServiceSupport serviceSupport;
	/**
	 * Qpid configuration.
	 */
	private QpidConfiguration qpidConfiguration;
	/**
	 * Destination broker
	 */
	private Destination queue;
	/**
	 * Session.
	 */
	private Session session;
	/**
	 * MessageProducer
	 */
	private MessageProducer producer;
	
	/**
	 * Executor responsible for execution the threads for concurrent consumers
	 */
	private ExecutorService executor;
	
	/**
	 * Qpid Producer
	 * 
	 * @param qpidEndpoint
	 */
	public QpidProducer(QpidEndpoint qpidEndpoint) {
		this.qpidEndpoint = qpidEndpoint;
		this.qpidConfiguration = qpidEndpoint.getQpidConfiguration();
	}

	@Override
	public void process(MessageExchange exchange) throws Exception {
		Object	messageBody	=	exchange.getIn().getBody();
		
		if (messageBody == null) {
			String errStr = "Message body recevied by the Qpid producer is null.";
			producerLogger.debug(errStr);
			throw new Exception(errStr);
		} else {
			producerLogger.debug("Message body recevied by the Qpid producer is "+messageBody);
		}
		
		if (session != null && producer != null) {
			if (messageBody instanceof String
					|| messageBody instanceof TextMessage) {
				TextMessage message = session.createTextMessage(messageBody
						.toString());
				producer.send(message);
			} else if (messageBody instanceof BusinessObject ) {
				ObjectMessage objMessage = (ObjectMessage) session
						.createObjectMessage((BusinessObject) messageBody);
				producer.send(objMessage);
			}

			producerLogger.info("Message sent to queue "
					+ this.qpidConfiguration.getQueueName());
		} else {
			if (session == null) {
				producerLogger.debug("Invalid session. Session is null. Message "+messageBody+" is lost.");
			} else if (producer == null) {
				producerLogger.debug("Invalid producer. Producer is null. Message "+messageBody+" is lost.");
			}
		}
	}

	@Override
	public void setServiceSupport(FusionServiceSupport serviceSupport) {
		this.serviceSupport = serviceSupport;
	}

	@Override
	public void start() throws Exception {
		executor = Executors.newFixedThreadPool(1, new ThreadFactory() {
			public Thread newThread(Runnable runnable) {
				Thread thread = new Thread(runnable, "QpidProducer");
				thread.setDaemon(true);
				return thread;
			}
		});
		executor.execute(this);

	}

	@Override
	public void stop() throws Exception {
		close();
	}

	/**
	 * Close the context and the connection.
	 * 
	 * @throws Exception
	 */
	private void close() throws Exception {
		try {
			executor.shutdownNow();
			executor = null;
			session.close();
			connection.close();
			context.close();
			
		} catch (JMSException e) {
			producerLogger.error("Error during closing.", e);
			throw new Exception(e.getMessage());
		} catch (NamingException e) {
			producerLogger.error("Error during closing.", e);
			throw new Exception(e.getMessage());
		}
	}

	/**
	 * Establish connection.
	 * 
	 * @throws Exception
	 */
	private void connect() {

		
				
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
					producerLogger.error(
							"Error initiallizing context for Qpid queue.", e);
					throw new Exception(e.getMessage());
				}

				
						try{
				// Creates a JMS connection.
				connection = connectionFactory.createConnection();
					
				// Creates a destination for the topic exchange, so senders and
				// receivers can use it.
				queue = (Destination) context.lookup("queueName");
				// Creates a session. This session is not transactional
				// (transactions='false'), and messages are automatically
				// acknowledged.
				session = connection.createSession(false,
						Session.AUTO_ACKNOWLEDGE);
				producer = session.createProducer(queue);
					}
					catch(Exception e)
					{
						producerLogger.error("Connection could not be established. Trying after 10 Secs" + e);
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e1) {
							producerLogger.error("Error occurred while waiting for reconnecting to qpid", e1);
						}
					}
					
				

			} catch (Exception exp) {
				producerLogger.error("Error during connection establishment.",
						exp);
				
			}
		
	}
	
	@Override
	public void run()  {
		
		connect();
		do{
			try{
				Thread.currentThread().sleep(30000);
				((Connection)connection).getMetaData();
			}catch (JMSException jmsException) {
				connect();
			}catch (Exception exception) {
				connect();
			}
		}	while(true);
		
	}
}
