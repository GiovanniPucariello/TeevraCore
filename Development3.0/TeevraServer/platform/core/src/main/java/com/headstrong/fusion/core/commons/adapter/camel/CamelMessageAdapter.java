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
 * $Id: MessageAdapter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;
import org.apache.camel.InvalidPayloadException;
import org.apache.camel.Message;
import org.apache.camel.TypeConverter;
import org.apache.camel.util.EndpointHelper;

import com.headstrong.fusion.commons.NormalizedMessage;

/**
 * This class represents a Camel Message {@link Message}. This is an adapter
 * which wraps a Fusion Message {@link NormalizedMessage}.
 * 
 */
public class CamelMessageAdapter implements Message {

	private static final String CAMEL_JMS_DESTINATION_NAME = "CamelJmsDestinationName";
	private static final String CAMEL_BREADCRUMBID = "breadcrumbId";
	
	private Exchange exchange;

	private NormalizedMessage normalizedMessage;
	private Map<String, DataHandler> attachments;

	public CamelMessageAdapter(NormalizedMessage normalizedMessage) {
		this.normalizedMessage = normalizedMessage;
	}

	@Override
	public void addAttachment(String id, DataHandler content) {
		this.getAttachments().put(id, content);
	}

	@Override
	public Message copy() {
		Message answer = new CamelMessageAdapter(this.normalizedMessage.copy());
		answer.setAttachments(this.getAttachments());
		((CamelMessageAdapter)answer).setExchange(this.exchange);
		return answer;
	}

	@Override
	public void copyFrom(Message that) {
		this.setMessageId(that.getMessageId());
		this.setBody(that.getBody());
		this.getHeaders().putAll(that.getHeaders());
	}

	@Override
	public DataHandler getAttachment(String id) {
		return this.getAttachments().get(id);
	}

	@Override
	public Set<String> getAttachmentNames() {
		return this.getAttachments().keySet();
	}

	@Override
	public Map<String, DataHandler> getAttachments() {
		if (this.attachments == null) {
			attachments = new HashMap<String, DataHandler>();
		}
		return attachments;
	}

	@Override
	public Object getBody() {
		return this.normalizedMessage.getBody();
	}

	@Override
	public <T> T getBody(Class<T> type) {
	 return this.exchange.getContext().getTypeConverter().convertTo(type,
				this.exchange, this.getBody());
	}

	@Override
	public Exchange getExchange() {
		return this.exchange;
	}

	@Override
	public Object getHeader(String name) {
		return this.normalizedMessage.getHeader(name);
	}

	@Override
	public <T> T getHeader(String name, Class<T> type) {
		Object value = this.getHeader(name);
		// temporary fix done to handle liffe data. 
		//By default camel 1.6.4 is adding CamelJmsDestinationName key in header object and throwing null pointer exception.
		/*if (value == null && !( (CAMEL_JMS_DESTINATION_NAME.equals(name)) || (CAMEL_BREADCRUMBID.equals(name)) || 
				("CamelRedeliveryCounter".equals(name)) ) ) {
			throw new NullPointerException("No header with " + name
					+ " present in Exchange with id " + getMessageId());
		}*/
		
		if (value == null) {
            // lets avoid NullPointerException when converting to boolean for null values
            if (boolean.class.isAssignableFrom(type)) {
                return (T) Boolean.FALSE;
            }
            return null;
        }

		
		// Added
		if (type.isInstance(value)) {
            return type.cast(value);
        }
		
		/*Exchange e = this.getExchange();
		return e.getContext().getTypeConverter().convertTo(type, e, value);*/
		
		Exchange e = getExchange();
        if (e != null) {
            return e.getContext().getTypeConverter().convertTo(type, e, value);
        } else {
            return type.cast(value);
        }
	}

	@Override
	public Map<String, Object> getHeaders() {
		return this.normalizedMessage.getHeaders();
	}

	@Override
	public String getMessageId() {
		return this.normalizedMessage.getMessageId();
	}

	@Override
	public boolean hasAttachments() {
		return !this.getAttachments().isEmpty();
	}

	@Override
	public void removeAttachment(String id) {
		this.getAttachments().remove(id);
	}

	@Override
	public Object removeHeader(String name) {
		return this.normalizedMessage.removeHeader(name);
	}

	@Override
	public void setAttachments(Map<String, DataHandler> attachments) {
		this.attachments = attachments;
	}

	@Override
	public void setBody(Object body) {
		this.normalizedMessage.setBody(body);
	}

	@Override
	public <T> void setBody(Object body, Class<T> type) {
		this.setBody(this.exchange.getContext().getTypeConverter().convertTo(
				type, this.exchange, body));
	}

	@Override
	public void setHeader(String name, Object value) {
		this.normalizedMessage.setHeader(name, value);
	}

	@Override
	public void setHeaders(Map<String, Object> headers) {
		this.normalizedMessage.setHeaders(headers);
	}

	@Override
	public void setMessageId(String messageId) {
		this.normalizedMessage.setMessageId(messageId);
	}

	/**
	 * @param exchange
	 *            the exchange to set
	 */
	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	@Override
	public String createExchangeId() {
		return null;
	}

	@Override
	public Object getHeader(String name, Object defaultValue) {
		Object answer = getHeaders().get(name);
		return answer != null ? answer : defaultValue;
	}

	@Override
	public <T> T getHeader(String name, Object defaultValue, Class<T> type) {
		Object value = getHeader(name, defaultValue);
        if (value == null) {
            // lets avoid NullPointerException when converting to boolean for null values
            if (boolean.class.isAssignableFrom(type)) {
                return (T) Boolean.FALSE;
            }
            return null;
        }

        // eager same instance type test to avoid the overhead of invoking the type converter
        // if already same type
        if (type.isInstance(value)) {
            return type.cast(value);
        }

        Exchange e = getExchange();
        if (e != null) {
            return e.getContext().getTypeConverter().convertTo(type, e, value);
        } else {
            return type.cast(value);
        }
	}

	@Override
	public Object getMandatoryBody() throws InvalidPayloadException {
		Object answer = getBody();
		if (answer == null) {
			throw new InvalidPayloadException(getExchange(), Object.class, this);
		}
		return answer;
	}

	@Override
	public <T> T getMandatoryBody(Class<T> type) throws InvalidPayloadException {
		// eager same instance type test to avoid the overhead of invoking the type converter
        // if already same type
        if (type.isInstance(getBody())) {
            return type.cast(getBody());
        }

        Exchange e = getExchange();
        if (e != null) {
            TypeConverter converter = e.getContext().getTypeConverter();
            try {
                return converter.mandatoryConvertTo(type, e, getBody());
            } catch (Exception cause) {
                throw new InvalidPayloadException(e, type, this, cause);
            }
        }
        throw new InvalidPayloadException(e, type, this);
	}

	@Override
	public boolean hasHeaders() {
        return getHeaders() != null && !getHeaders().isEmpty();
	}

	@Override
	public boolean isFault() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeHeaders(String pattern) {
		return removeHeaders(pattern, (String[]) null);
	}

	@Override
	public boolean removeHeaders(String pattern, String... excludePatterns) {
        if (!hasHeaders()) {
            return false;
        }

        boolean matches = false;
        for (Map.Entry<String, Object> entry : getHeaders().entrySet()) {
            String key = entry.getKey();
            if (EndpointHelper.matchPattern(key, pattern)) {
                if (excludePatterns != null && isExcludePatternMatch(key, excludePatterns)) {
                    continue;
                }
                matches = true;
                getHeaders().remove(entry.getKey());
            }

        }
        return matches;
	}

	@Override
	public void setFault(boolean fault) {
		// TODO Auto-generated method stub
		
	}
	
    private static boolean isExcludePatternMatch(String key, String... excludePatterns) {
        for (String pattern : excludePatterns) {
            if (EndpointHelper.matchPattern(key, pattern)) {
                return true;
            }
        }
        return false;
    }
}
