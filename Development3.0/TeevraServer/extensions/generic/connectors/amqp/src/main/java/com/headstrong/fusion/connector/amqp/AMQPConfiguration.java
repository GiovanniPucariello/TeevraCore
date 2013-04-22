package com.headstrong.fusion.connector.amqp;

import java.util.Map;

/**
 * AMQP binding configuration.
 * 
 */
public class AMQPConfiguration {

	private String hostName;
	private int portNumber;
	private String routingKey;
	private String exchange;

	public AMQPConfiguration() {
	}

	public AMQPConfiguration(Map<String, String> properties) {
		// host name
		this.hostName = properties.get("hostName");
		this.routingKey = properties.get("routingKey");
		this.portNumber = Integer.parseInt(properties.get("portNumber"));
		this.exchange = properties.get("exchange");
	}

	/**
	 * @return the hostName
	 */
	public String getHostName() {
		return hostName;
	}

	/**
	 * @param hostName
	 *            the hostName to set
	 */
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	/**
	 * @return the portNumber
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * @param portNumber
	 *            the portNumber to set
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * @return the routingKey
	 */
	public String getRoutingKey() {
		return routingKey;
	}

	/**
	 * @param routingKey
	 *            the routingKey to set
	 */
	public void setRoutingKey(String routingKey) {
		this.routingKey = routingKey;
	}

	/**
	 * @return the exchange
	 */
	public String getExchange() {
		return exchange;
	}

	/**
	 * @param exchange
	 *            the exchange to set
	 */
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

}
