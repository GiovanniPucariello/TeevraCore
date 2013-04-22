package com.headstrong.fusion.messaging.model.endpoint.binding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.component.http.HttpEndpoint;
import org.apache.camel.component.http.HttpProducer;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.util.ObjectHelper;
import org.apache.camel.util.URISupport;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class FusionHttpProducer extends HttpProducer {
	
	private static final transient Logger LOG = LoggerFactory.getLogger(HttpProducer.class);
	
	 private boolean throwException;
	
	public FusionHttpProducer(HttpEndpoint endpoint) {
		super(endpoint);
		this.throwException = endpoint.isThrowExceptionOnFailure();
	}
   
    public void process(Exchange exchange) throws Exception {
        // if we bridge endpoint then we need to skip matching headers with the HTTP_QUERY to avoid sending
        // duplicated headers to the receiver, so use this skipRequestHeaders as the list of headers to skip
        Map<String, Object> skipRequestHeaders = null;

        if (getEndpoint().isBridgeEndpoint()) {
            exchange.setProperty(Exchange.SKIP_GZIP_ENCODING, Boolean.TRUE);
            String queryString = exchange.getIn().getHeader(Exchange.HTTP_QUERY, String.class);
            if (queryString != null) {
                skipRequestHeaders = URISupport.parseQuery(queryString);
            }
        }
        HttpMethod method = createMethod(exchange);
        Message in = exchange.getIn();
        String httpProtocolVersion = in.getHeader(Exchange.HTTP_PROTOCOL_VERSION, String.class);
        if (httpProtocolVersion != null) {
            // set the HTTP protocol version
            HttpMethodParams params = method.getParams();
            params.setVersion(HttpVersion.parse(httpProtocolVersion));
        }

        HeaderFilterStrategy strategy = getEndpoint().getHeaderFilterStrategy();

        // propagate headers as HTTP headers
        for (Map.Entry<String, Object> entry : in.getHeaders().entrySet()) {
            String key = entry.getKey();
            Object headerValue = in.getHeader(key);

            if (headerValue != null) {
                // use an iterator as there can be multiple values. (must not use a delimiter)
                final Iterator it = ObjectHelper.createIterator(headerValue, null);

                // the value to add as request header
                final List<String> values = new ArrayList<String>();

                // if its a multi value then check each value if we can add it and for multi values they
                // should be combined into a single value
                while (it.hasNext()) {
                    String value = exchange.getContext().getTypeConverter().convertTo(String.class, it.next());

                    // we should not add headers for the parameters in the uri if we bridge the endpoint
                    // as then we would duplicate headers on both the endpoint uri, and in HTTP headers as well
                    if (skipRequestHeaders != null && skipRequestHeaders.containsKey(key)) {
                        Object skipValue = skipRequestHeaders.get(key);
                        if (ObjectHelper.equal(skipValue, value)) {
                            continue;
                        }
                    }
                    if (value != null && strategy != null && !strategy.applyFilterToCamelHeaders(key, value, exchange)) {
                        values.add(value);
                    }
                }
                
                // add the value(s) as a http request header
                if (values.size() > 0) {
                    // use the default toString of a ArrayList to create in the form [xxx, yyy]
                    // if multi valued, for a single value, then just output the value as is
                    String s =  values.size() > 1 ? values.toString() : values.get(0);
                    method.addRequestHeader(key, s);
                }
            }
        }
        method.addRequestHeader("content-type", "text/html");
        
        // lets store the result in the output message.
        try {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Executing http {} method: {}", method.getName(), method.getURI().toString());
            }
            int responseCode = executeMethod(method);
            LOG.debug("Http responseCode: {}", responseCode);

            if (!throwException) {
                // if we do not use failed exception then populate response for all response codes
                populateResponse(exchange, method, in, strategy, responseCode);
            } else {
                if (responseCode >= 100 && responseCode < 300) {
                    // only populate response for OK response
                    populateResponse(exchange, method, in, strategy, responseCode);
                } else {
                    // operation failed so populate exception to throw
                    throw populateHttpOperationFailedException(exchange, method, responseCode);
                }
            }
        } finally {
            method.releaseConnection();
        }
    }

}
