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
 * $Id: SocketBindingEndPointModeler.java
 * $Revision: 
 * $Author: MBafna
 * $DateTime: Dec 22, 2008 
 */

package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mina.MinaComponent;
import org.apache.camel.component.mina.MinaConfiguration;
import org.apache.camel.model.ProcessorDefinition;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;

/**
 * Basic Socket implementation. only Sending is possible.
 */
public class SocketBindingEndPointModeler extends
		AbstractBindingEndPointModeler {
	// private static Logger logger =
	// LoggerFactory.getLogger(SocketBindingEndPointModeler.class);

	private String hostname;
	private String port;
	private String protocol;
	private Long timeOut;

	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		/**
		 * Initialize properties in the Super Class.
		 */
		super.init(config, SocketBindingProperty.values());
		/**
		 * Initialize the Bean.
		 */
		this.configure(config);
		/**
		 * Check if all mandatory fields are present.
		 */
	}

	/**
	 * Reads the properties from the properties map and set the bean properties.
	 * 
	 * @precondition config != null
	 * @param properties
	 * @param bean
	 * @throws InitializationException
	 */
	private void configure(ConnectorConfig config)
			throws InitializationException {
		Map<String, String> properties = config.getProperties();

		if (properties.containsKey(SocketBindingProperty.hostname.toString())) {
			this.setHostname(properties.get(SocketBindingProperty.hostname
					.toString()));
		}
		if (properties.containsKey(SocketBindingProperty.port.toString())) {
			this.setPort(properties.get(SocketBindingProperty.port.toString()));
		}

		if (properties.containsKey(SocketBindingProperty.protocol.toString())) {
			this.setProtocol(properties.get(SocketBindingProperty.protocol
					.toString()));
		}
		if (properties.containsKey(SocketBindingProperty.timeout.toString())) {
			this.setTimeOut(Long.parseLong(properties
					.get(SocketBindingProperty.timeout.toString())));
		}
	}

	public ProcessorDefinition<?> modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		MinaComponent minaComponent = new MinaComponent();
		//upgareded to Camel 1.6.4
		MinaConfiguration minaConfig = new MinaConfiguration();
		minaConfig.setTimeout(this.getTimeOut());
		minaComponent.setConfiguration(minaConfig);
		minaComponent.setCamelContext(routeBuilder.getContext());
		//minaComponent.setTimeout(this.getTimeOut());
		StringBuffer endpointUri = new StringBuffer();

		if (minaComponent != null) {
			registerComponent(routeBuilder.getContext(), "mina"
					+ this.getConfig().getId(), minaComponent);
		}
		// mina:tcp://localhost:6201?textline=true&sync=true

		endpointUri.append("mina" + this.getConfig().getId() + ":");
		if (this.getProtocol().equals(
				SocketBindingProperty.protocol_tcp.toString())) {
			endpointUri.append("tcp://");
		} else if (this.getProtocol().equals(
				SocketBindingProperty.protocol_udp.toString())) {
			endpointUri.append("udp://");
		} else {
			throw new ProcessModellingException("Unsupported protocol "
					+ this.getProtocol());
		}
		endpointUri.append(this.getHostname()).append(":").append(
				this.getPort());

		endpointUri.append("?sync=false");
		ProcessorDefinition<?> newProcessorType = null;
		try {
			newProcessorType = routeBuilder.from(minaComponent
					.createEndpoint(endpointUri.toString()));
		} catch (Exception e) {
			throw new ProcessModellingException(
					"Error creating socket endpoint ", e);
		}
		return newProcessorType;
	}

	@SuppressWarnings("unchecked")
	public ProcessorDefinition<?> modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {
		MinaComponent minaComponent = new MinaComponent();
		//upgareded to Camel 1.6.4
		MinaConfiguration minaConfig = new MinaConfiguration();
		minaConfig.setTimeout(this.getTimeOut());
		minaComponent.setConfiguration(minaConfig);
		
		minaComponent.setCamelContext(routeBuilder.getContext());
		//minaComponent.setTimeout(this.getTimeOut());
		StringBuffer endpointUri = new StringBuffer();

		if (minaComponent != null) {
			registerComponent(routeBuilder.getContext(), "mina"
					+ this.getConfig().getId(), minaComponent);
		}
		// mina:tcp://localhost:6201?textline=true&sync=true

		endpointUri.append("mina" + this.getConfig().getId() + ":");
		if (this.getProtocol().equals(
				SocketBindingProperty.protocol_tcp.toString())) {
			endpointUri.append("tcp://");
		} else if (this.getProtocol().equals(
				SocketBindingProperty.protocol_udp.toString())) {
			endpointUri.append("udp://");
		} else {
			throw new ProcessModellingException("Unsupported protocol "
					+ this.getProtocol());
		}
		endpointUri.append(this.getHostname()).append(":").append(
				this.getPort());

		endpointUri.append("?sync=false");
		ProcessorDefinition<?> newProcessorType = null;
		try {
			newProcessorType = processorType.to(minaComponent
					.createEndpoint(endpointUri.toString()));
		} catch (Exception e) {
			throw new ProcessModellingException(
					"Error creating socket endpoint ", e);
		}
		return newProcessorType;
	}

	/**
	 * Socket Configuration BindingProperty.
	 * 
	 */
	public static enum SocketBindingProperty implements BindingProperty {
		// List of properties expected by JMS EndPointModeler.
		hostname {
			public boolean isMandatory() {
				return true;
			}
		},
		port {
			public boolean isMandatory() {
				return true;
			}
		},
		timeout {
			public boolean isMandatory() {
				return true;
			}
		},
		protocol {
			public boolean isMandatory() {
				return true;
			}
		},
		protocol_tcp {
			public String toString() {
				return "TCP/IP";
			}
		},
		protocol_udp {
			public String toString() {
				return "udp";
			}
		},
		potocol_multicast {
			public String toString() {
				return "Multicast";
			}
		};
		public boolean isMandatory() {
			return false;
		}

	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol
	 *            the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @return the timeOut
	 */
	public Long getTimeOut() {
		return timeOut;
	}

	/**
	 * @param timeOut
	 *            the timeOut to set
	 */
	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}

}
