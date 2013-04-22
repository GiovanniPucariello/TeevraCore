package com.headstrong.fusion.commons.component;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * An <a href="http://activemq.apache.org/camel/endpoint.html">endpoint</a>
 * implements the <a
 * href="http://activemq.apache.org/camel/message-endpoint.html">Message
 * Endpoint</a> pattern and represents an endpoint that can send and receive
 * message exchanges
 * 
 */
public interface FusionEndpoint<E extends MessageExchange> {

	/**
	 * Returns if the endpoint should be a CamelContext singleton. If the
	 * endpoint is a Singleton, then a single FusionEndpoint instance will be
	 * shared by all routes with the same URI. Because the endpoint is shared,
	 * it should be treated as an immutable.
	 */
	boolean isSingleton();

	/**
	 * Returns the string representation of the endpoint URI
	 */
	String getEndpointUri();

	/**
	 * Create a new exchange for communicating with this endpoint
	 */
	E createExchange();

	/**
	 * Creates a new exchange for communicating with this exchange using the
	 * given exchange to pre-populate the values of the headers and messages
	 */
	E createMessageExchange(MessageExchange exchange);

	/**
	 * Creates a new producer which is used send messages into the endpoint
	 * 
	 * @return a newly created producer
	 */
	FusionProducer<E> createProducer() throws Exception;

	/**
	 * Creates a new <a
	 * href="http://activemq.apache.org/camel/event-driven-consumer.html">Event
	 * Driven FusionConsumer</a> which consumes messages from the endpoint
	 * using the given processor
	 * 
	 * @return a newly created consumer
	 */
	FusionConsumer<E> createConsumer(FusionProcessor fusionProcessor)
			throws Exception;

	/**
	 * Creates a new <a
	 * href="http://activemq.apache.org/camel/polling-consumer.html">Polling
	 * FusionConsumer</a> so that the caller can poll message exchanges from
	 * the consumer using {@link FusionPollingConsumer#receive()},
	 * {@link FusionPollingConsumer#receiveNoWait()} or
	 * {@link FusionPollingConsumer#receive(long)} whenever it is ready to do so
	 * rather than using the <a
	 * href="http://activemq.apache.org/camel/event-driven-consumer.html">Event
	 * Based FusionConsumer</a> returned by
	 * {@link #createConsumer(FusionProcessor)}
	 * 
	 * @return a newly created pull consumer
	 * @throws Exception
	 *             if the pull consumer could not be created
	 */
	FusionPollingConsumer<E> createPollingConsumer() throws Exception;
	
}
