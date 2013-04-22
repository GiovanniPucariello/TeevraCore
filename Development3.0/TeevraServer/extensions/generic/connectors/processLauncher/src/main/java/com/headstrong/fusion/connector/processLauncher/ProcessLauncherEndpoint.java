package com.headstrong.fusion.connector.processLauncher;

import java.util.Map;

import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.commons.component.FusionEndpoint;
import com.headstrong.fusion.commons.component.FusionPollingConsumer;
import com.headstrong.fusion.commons.component.FusionProcessor;
import com.headstrong.fusion.commons.component.FusionProducer;

/**
 * ProcessLauncher Endpoint. This Enpoint behaves like a producer that receives in
 * messages from a Mediator service and launches an external application upon
 * each reception of a message either Synchronously or Asynchronously.
 * 
 * @author PBansal
 */

public class ProcessLauncherEndpoint implements FusionEndpoint<MessageExchange> {

	/**
	 * The ProcessLauncher string.
	 */
	private static final String PROCESSLAUNCHER_STR = "processLauncher";

	/**
	 * ProcessLauncher Endpoint configuration.
	 */

	private ProcessLauncherConfiguration processBinding;

	/**
	 * @param configuration
	 *            ProcessLauncher Endpoint configuration.
	 */

	public ProcessLauncherEndpoint(ProcessLauncherConfiguration processBinding) {
		this.processBinding = processBinding;
	}

	/**
	 * Constructs ProcessLauncher Endpoint with the given configurations
	 * 
	 * @param properties
	 */

	public ProcessLauncherEndpoint(Map<String, String> properties)
			throws Exception {
		this.processBinding = new ProcessLauncherConfiguration(properties);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createConsumer(com.headstrong.fusion.commons.component.FusionProcessor)
	 */
	public FusionConsumer<MessageExchange> createConsumer(
			FusionProcessor fusionProcessor) throws Exception {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createExchange()
	 */

	public MessageExchange createExchange() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createMessageExchange(com.headstrong.fusion.commons.MessageExchange)
	 */
	public MessageExchange createMessageExchange(MessageExchange exchange) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createPollingConsumer()
	 */
	public FusionPollingConsumer<MessageExchange> createPollingConsumer()
			throws Exception {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#createProducer()
	 */
	public FusionProducer<MessageExchange> createProducer() throws Exception {
		ProcessLauncherProducer producer = new ProcessLauncherProducer(this);
		return producer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#getEndpointUri()
	 */
	public String getEndpointUri() {
		return PROCESSLAUNCHER_STR;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.commons.component.FusionEndpoint#isSingleton()
	 */
	public boolean isSingleton() {
		return false;
	}

	/**
	 * @return the processBinding
	 */
	public ProcessLauncherConfiguration getProcessBinding() {
		return processBinding;
	}

	/**
	 * @param processBinding
	 *            the processBinding to set
	 */
	public void setProcessBinding(ProcessLauncherConfiguration processBinding) {
		this.processBinding = processBinding;
	}
}
