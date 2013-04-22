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
 * $Id: CamelExchangeAdapter.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Aug 31, 2009 
 */

package com.headstrong.fusion.core.commons.adapter.camel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.spi.Synchronization;
import org.apache.camel.spi.UnitOfWork;
import org.apache.camel.util.ExchangeHelper;
import org.apache.camel.util.ObjectHelper;

import com.headstrong.fusion.commons.FusionNormalizedMessage;
import com.headstrong.fusion.commons.MessageExchange;
import com.headstrong.fusion.commons.MessageExchangePattern;
import com.headstrong.fusion.commons.component.FusionConsumer;
import com.headstrong.fusion.core.commons.CamelNormalizedMessage;

/**
 * This class represents a Camel Exchange {@link Exchange}. This is an adapter
 * which wraps a Fusion Message Exchange {@link MessageExchange}.
 * {@link FusionConsumer} creates {@link MessageExchange} and passes it to the
 * processor which delegates the message routing to Apache camel routing engine.
 * Apache Camel routing engine requires The Exchange to implement
 * {@link Exchange} interface. This is taken care of by creating a new
 * {@link CamelExchangeAdapter} which delegates all the calls to underlying
 * {@link MessageExchange}.
 * 
 * 
 */
public class CamelExchangeAdapter implements ExchangeAdapter {

	/**
	 * Underlying Fusion Message Exchange.
	 */
	private MessageExchange messageExchange;
	/**
	 * Camel Context.
	 */
	private CamelContext context;
	
	/**
	 * These are required as the MessageAdapter is also a wrapper around
	 * {@link Message}
	 * 
	 */
	private Message in;
	private Message out;

	private UnitOfWork unitOfWork;
	private List<Synchronization> onCompletions;

	public CamelExchangeAdapter(MessageExchange messageExchange,
			CamelContext camelContext) {
		this.messageExchange = messageExchange;
		this.context = camelContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#copy()
	 */
	@Override
	public Exchange copy() {
		CamelExchangeAdapter exchange = new CamelExchangeAdapter(
				messageExchange.copy(), this.getContext());
		exchange.setPattern(this.getPattern());
		exchange.setUnitOfWork(this.getUnitOfWork());
		return exchange;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getContext()
	 */
	@Override
	public CamelContext getContext() {
		return this.context;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getException()
	 */
	@Override
	public Exception getException() {
		return this.messageExchange.getException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getExchangeId()
	 */
	@Override
	public String getExchangeId() {
		return this.messageExchange.getExchangeId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getIn()
	 */
	@Override
	public Message getIn() {
		if (this.in == null) {
			if (this.messageExchange.getIn() == null) {
				this.messageExchange.setIn(new FusionNormalizedMessage());
			}
			this.in = new CamelMessageAdapter(this.messageExchange.getIn());
			((CamelMessageAdapter) this.in).setExchange(this);
		}
		return this.in;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getOut()
	 */
	@Override
	public Message getOut() {
		if (out == null) {
			if (this.messageExchange.getOut() == null) {
				// create a new Out message and set in the message exchange
				this.messageExchange.setOut(new FusionNormalizedMessage());
			}
			out = new CamelMessageAdapter(this.messageExchange.getOut());
			((CamelMessageAdapter) this.out).setExchange(this);
		}
		return out;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getPattern()
	 */
	@Override
	public ExchangePattern getPattern() {
		if (messageExchange.getPattern() == null) {
			// set the pattern to In only in case the null.
			this.messageExchange.setPattern(MessageExchangePattern.InOnly);
		}
		return PatternMap.getExchangePattern(this.messageExchange.getPattern());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getProperties()
	 */
	@Override
	public Map<String, Object> getProperties() {
		return this.messageExchange.getProperties();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getProperty(java.lang.String)
	 */
	@Override
	public Object getProperty(String name) {
		return this.messageExchange.getProperty(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getProperty(java.lang.String,
	 *      java.lang.Class)
	 */
	@Override
	public <T> T getProperty(String name, Class<T> type) {
		Object value = this.getProperty(name);
		return this.getContext().getTypeConverter()
				.convertTo(type, this, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#getUnitOfWork()
	 */
	@Override
	public UnitOfWork getUnitOfWork() {
		return this.unitOfWork;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#isFailed()
	 */
	@Override
	public boolean isFailed() {
		return this.messageExchange.isFailed();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#isTransacted()
	 */
	@Override
	public boolean isTransacted() {
		Object property = this.getProperty("transacted");
		return property != null && property == Boolean.TRUE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#removeProperty(java.lang.String)
	 */
	@Override
	public Object removeProperty(String name) {
		return this.messageExchange.removeProperty(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setException(java.lang.Throwable)
	 */
	@Override
	public void setException(Throwable t) {
		if (t == null) {
			this.messageExchange.setException(null);
		} else if (t instanceof Exception) {
			this.messageExchange.setException((Exception) t);
		} else {
			// wrap throwable into an exception
			this.messageExchange.setException(ObjectHelper
					.wrapCamelExecutionException(this, t));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setExchangeId(java.lang.String)
	 */
	@Override
	public void setExchangeId(String id) {
		this.messageExchange.setExchangeId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setIn(org.apache.camel.Message)
	 */
	@Override
	public void setIn(Message in) {
		if (in != null) {
			this.messageExchange.setIn(new CamelNormalizedMessage(in));
		} else {
			this.messageExchange.setIn(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setOut(org.apache.camel.Message)
	 */
	@Override
	public void setOut(Message out) {
		if (out != null) {
			this.messageExchange.setOut(new CamelNormalizedMessage(out));
		} else {
			this.messageExchange.setOut(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setPattern(org.apache.camel.ExchangePattern)
	 */
	@Override
	public void setPattern(ExchangePattern pattern) {
		this.messageExchange.setPattern(PatternMap
				.getMessageExchangePattern(pattern));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setProperty(java.lang.String,
	 *      java.lang.Object)
	 */
	@Override
	public void setProperty(String name, Object value) {
		this.messageExchange.setProperty(name, value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.camel.Exchange#setUnitOfWork(org.apache.camel.spi.UnitOfWork)
	 */
	@Override
	public void setUnitOfWork(UnitOfWork unitOfWork) {
		this.unitOfWork = unitOfWork;
	}

	/**
	 * @return the messageExchange
	 */
	public MessageExchange getMessageExchange() {
		return messageExchange;
	}

	/**
	 * @param messageExchange
	 *            the messageExchange to set
	 */
	public void setMessageExchange(MessageExchange messageExchange) {
		this.messageExchange = messageExchange;
	}

	/**
	 * @param context
	 *            the context to set
	 */
	public void setContext(CamelContext context) {
		this.context = context;
	}

	@Override
	public void addOnCompletion(Synchronization onCompletion) {
		if (unitOfWork == null) {
			// unit of work not yet registered so we store the on completion temporary
			// until the unit of work is assigned to this exchange by the UnitOfWorkProcessor
			if (onCompletions == null) {
				onCompletions = new ArrayList<Synchronization>();
			}
			onCompletions.add(onCompletion);
		} else {
			getUnitOfWork().addSynchronization(onCompletion);
		}
	}

	@Override
	public <T> T getException(Class<T> type) {
		return ObjectHelper.getException(type, this.messageExchange
				.getException());
	}

	@Override
	public Endpoint getFromEndpoint() {
		return null;
	}

	@Override
	public String getFromRouteId() {
		return null;
	}

	@Override
	public <T> T getIn(Class<T> type) {
		Message in = getIn();

		// eager same instance type test to avoid the overhead of invoking the type converter
		// if already same type
		if (type.isInstance(in)) {
			return type.cast(in);
		}

		// fallback to use type converter
		return context.getTypeConverter().convertTo(type, in);
	}

	@Override
	public <T> T getOut(Class<T> type) {
		if (!hasOut()) {
			return null;
		}

		Message out = getOut();

		// eager same instance type test to avoid the overhead of invoking the type converter
		// if already same type
		if (type.isInstance(out)) {
			return type.cast(out);
		}

		// fallback to use type converter
		return context.getTypeConverter().convertTo(type, out);
	}

	@Override
	public Object getProperty(String name, Object defaultValue) {
		Object answer = getProperty(name);
		return answer != null ? answer : defaultValue;
	}

	@Override
	public <T> T getProperty(String name, Object defaultValue, Class<T> type) {
		Object value = getProperty(name, defaultValue);
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

		return ExchangeHelper.convertToType(this, type, value);
	}

	@Override
	public List<Synchronization> handoverCompletions() {
		List<Synchronization> answer = null;
		if (onCompletions != null) {
			answer = new ArrayList<Synchronization>(onCompletions);
			onCompletions.clear();
			onCompletions = null;
		}
		return answer;
	}

	@Override
	public void handoverCompletions(Exchange target) {
		if (onCompletions != null) {
			for (Synchronization onCompletion : onCompletions) {
				target.addOnCompletion(onCompletion);
			}
			// cleanup the temporary on completion list as they have been handed over
			onCompletions.clear();
			onCompletions = null;
		} else if (unitOfWork != null) {
			// let unit of work handover
			unitOfWork.handoverSynchronization(target);
		}
	}

	@Override
	public boolean hasOut() {
		return out != null;
	}

	@Override
	public boolean hasProperties() {
		return (this.getProperties() != null && this.getProperties().size() > 0) ? true
				: false ;
	}

	@Override
	public boolean isRollbackOnly() {
		return Boolean.TRUE.equals(getProperty(Exchange.ROLLBACK_ONLY))
				|| Boolean.TRUE
						.equals(getProperty(Exchange.ROLLBACK_ONLY_LAST));
	}

	@Override
	public void setFromEndpoint(Endpoint fromEndpoint) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setFromRouteId(String fromRouteId) {
		// TODO Auto-generated method stub

	}

}
