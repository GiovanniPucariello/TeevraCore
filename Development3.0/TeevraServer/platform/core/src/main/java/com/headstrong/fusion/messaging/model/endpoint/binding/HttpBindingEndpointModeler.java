package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor; 
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.http.HttpComponent;
import org.apache.camel.component.http.HttpEndpoint;
import org.apache.camel.model.ProcessorDefinition;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.headstrong.fusion.commons.exception.InitializationException;
import com.headstrong.fusion.commons.exception.ProcessModellingException;
import com.headstrong.fusion.config.ConnectorConfig;
import com.headstrong.fusion.core.CamelProcessContext;

public class HttpBindingEndpointModeler extends AbstractBindingEndPointModeler {

	private static final Logger logger = LoggerFactory
	.getLogger(HttpBindingEndpointModeler.class);
	private static long DEFAULT_DELAY = 50000;
	
	
	/**
	 * Delay.
	 */
	private long delay;
	

	/**
	 * Name of the uri
	 */
	private String uri;
	
	
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
		this.setDelay(DEFAULT_DELAY);
		if (properties.containsKey(HttpBindingProperty.delay.toString())) {
			try {
				this.setDelay(Long.parseLong(properties.get(HttpBindingProperty.delay.toString())));
			} catch (Exception e) {
				logger.error("Invalid delay specified, setting to default "
						+ DEFAULT_DELAY);
			}		
		}
		
				
		if (properties.containsKey(HttpBindingProperty.uri.toString())) {
			this.setUri(properties.get(HttpBindingProperty.uri.toString()));
		}
		
		
	}
		
	

	@Override
	public void init(CamelProcessContext processContext, ConnectorConfig config)
			throws InitializationException {
		super.init(config, HttpBindingProperty.values());
		this.configure(config);

	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelFrom(RouteBuilder routeBuilder)
			throws ProcessModellingException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ProcessorDefinition modelTo(RouteBuilder routeBuilder,
			ProcessorDefinition processorType) throws ProcessModellingException {

		HttpComponent component = new HttpComponent();
		component.setCamelContext(routeBuilder.getContext());
		HttpConnectionManager connectionManager = new SimpleHttpConnectionManager();
		URI uri;
		FusionHttpEndpoint endpoint = null;
		try {
			uri = new URI(getUri());
			endpoint = new FusionHttpEndpoint("http", component, uri, connectionManager);
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			logger.error("Invalid URI " + e);
		}
		
		processorType = processorType.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				Object inputData = exchange.getIn().getBody();
				exchange.getIn().setBody(inputData);
				
			}
		}).to(endpoint);
		
		return processorType;
	}
	
	/**
	 * Properties Expected by HttpBindingEndPointModeler.
	 * 
	 */
	private static enum HttpBindingProperty implements BindingProperty {

		delay, uri {
			public boolean isMandatory() {
				return false;
			}
		};

		@Override
		public boolean isMandatory() {
			// TODO Auto-generated method stub
			return true;
		}
		
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}
	
	

}
