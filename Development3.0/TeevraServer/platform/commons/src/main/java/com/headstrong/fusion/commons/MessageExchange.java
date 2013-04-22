/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: Exchange.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import java.util.Map;

import org.apache.camel.Exchange;

/**
 * The base message exchange interface providing access to the request, response
 * and exceptions.
 */

public interface MessageExchange {

	/**
	 * Returns a property associated with this exchange by name
	 * 
	 * @precondition name != null
	 * @param name
	 *            The name of the property.
	 * @return the value of the given header or null if there is no property for
	 *         the given name
	 */
	Object getProperty(String name);

	/**
	 * Returns a property associated with this exchange by name and specifying
	 * the type required
	 * 
	 * @param name
	 *            the name of the property
	 * @param type
	 *            the type of the property
	 * @return the value of the given header or null if there is no property for
	 *         the given name or null if it cannot be converted to the given
	 *         type
	 */
	<T> T getProperty(String name, Class<T> type);

	/**
	 * Sets a property on the exchange
	 * 
	 * @precondition name != null
	 * @param name
	 *            of the property
	 * @param value
	 *            to associate with the name
	 */
	void setProperty(String name, Object value);

	/**
	 * sets properties.
	 * 
	 * @param properties
	 */
	void setProperties(Map<String, Object> properties);

	/**
	 * Removes the given property on the exchange
	 * 
	 * @param name
	 *            of the property
	 * @return the old value of the property
	 */
	Object removeProperty(String name);

	/**
	 * Returns all of the properties associated with the exchange
	 * 
	 * @return all the headers in a Map
	 */
	Map<String, Object> getProperties();

	/**
	 * Returns the inbound request message
	 * 
	 * @return the message
	 */
	NormalizedMessage getIn();

	/**
	 * Sets the inbound message instance
	 * 
	 * @param in
	 *            the inbound message
	 */
	void setIn(NormalizedMessage in);

	/**
	 * Returns the outbound message, lazily creating one if one has not already
	 * been associated with this exchange. If you want to inspect this property
	 * but not force lazy creation then invoke the {@link #getOut(boolean)}
	 * method passing in <tt>false</tt>
	 * 
	 * @return the response
	 */
	NormalizedMessage getOut();

	/**
	 * Sets the outbound message
	 * 
	 * @param out
	 *            the outbound message
	 */
	void setOut(NormalizedMessage out);

	/**
	 * Returns the exception associated with this exchange
	 * 
	 * @return the exception (or null if no exception occurred)
	 */
	Exception getException();

	/**
	 * Sets the exception associated with this exchange
	 * 
	 * @param e
	 *            the caused exception
	 */
	void setException(Throwable e);

	/**
	 * Returns true if this exchange failed due to either an exception
	 * 
	 * @return true if this exchange failed due to either an exception
	 * @see MessageExchange#getException()
	 */
	boolean isFailed();

	/**
	 * Creates a copy of the current message exchange so that it can be
	 * forwarded to another destination
	 */
	MessageExchange copy();

	// /**
	// * Returns the unit of work that this exchange belongs to; which may map
	// to
	// * zero, one or more physical transactions
	// */
	// UnitOfWork getUnitOfWork();

	// /**
	// * Sets the unit of work that this exchange belongs to; which may map to
	// * zero, one or more physical transactions
	// */
	// void setUnitOfWork(UnitOfWork unitOfWork);

	/**
	 * Returns the exchange id
	 * 
	 * @return the unique id of the exchange
	 */
	String getExchangeId();

	/**
	 * Set the exchange id
	 * 
	 * @param id
	 */
	void setExchangeId(String id);

	/**
	 * Returns {@link MessageExchangePattern}.
	 * 
	 * @return Message Exchange Pattern
	 */
	MessageExchangePattern getPattern();

	/**
	 * Sets {@link MessageExchangePattern}
	 */
	void setPattern(MessageExchangePattern pattern);
	
	public Exchange getExchange(); 

	public void setExchange(Exchange exchange); 

}