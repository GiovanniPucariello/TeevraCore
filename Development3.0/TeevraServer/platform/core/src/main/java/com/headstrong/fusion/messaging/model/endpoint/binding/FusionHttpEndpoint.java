package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.camel.Producer;
import org.apache.camel.component.http.HttpComponent;
import org.apache.camel.component.http.HttpEndpoint;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.commons.httpclient.HttpConnectionManager;
import org.apache.commons.httpclient.params.HttpClientParams;

public class FusionHttpEndpoint extends HttpEndpoint {
	
	private HeaderFilterStrategy headerFilterStrategy = new FusionHttpHeaderFilterStrategy();
	
	public void setHeaderFilterStrategy(HeaderFilterStrategy headerFilterStrategy) {
		this.headerFilterStrategy = headerFilterStrategy;
		super.setHeaderFilterStrategy(headerFilterStrategy);
	}

	public FusionHttpEndpoint(String endPointURI, HttpComponent component,
			URI httpURI, HttpConnectionManager httpConnectionManager)
			throws URISyntaxException {
		super(endPointURI, component, httpURI, new HttpClientParams(),
				httpConnectionManager, null);
	}

	public Producer createProducer() throws Exception {
		return new FusionHttpProducer(this);
	}

	public HeaderFilterStrategy getHeaderFilterStrategy() {
		return  headerFilterStrategy;
	}
}
