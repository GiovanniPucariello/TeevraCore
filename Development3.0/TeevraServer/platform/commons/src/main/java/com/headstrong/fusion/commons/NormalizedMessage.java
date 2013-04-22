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
 * $Id: Message.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Sep 11, 2008 
 */

package com.headstrong.fusion.commons;

import java.util.Map;

/**
 * Represents an inbound or outbound message as part of an {@link MessageExchange}
 * 
 */
public interface NormalizedMessage {


    /**
     * Returns the id of the message
     *
     * @return the id of the message
     */
    String getMessageId();

    /**
     * Sets the id of the message
     *
     * @param messageId
     */
    void setMessageId(String messageId);

    /**
     * Accesses a specific header
     *
     * @param name  name of header
     * @return object header associated with the name
     */
    Object getHeader(String name);

    /**
     * Returns a header associated with this message by name and specifying the
     * type required
     *
     * @param name the name of the header
     * @param type the type of the header
     * @return the value of the given header or null if there is no property for
     *         the given name or it cannot be converted to the given type
     */
    <T> T getHeader(String name, Class<T> type);

    /**
     * Sets a header on the message
     *
     * @param name of the header
     * @param value to associate with the name
     */
    void setHeader(String name, Object value);

    /**
     * Removes the named header from this message
     *
     * @param name
     * @return the old value of the header
     */
    Object removeHeader(String name);

    /**
     * Returns all of the headers associated with the message
     *
     * @return all the headers in a Map
     */
    Map<String, Object> getHeaders();

    /**
     * Set all the headers associated with this message
     *
     * @param headers
     */
    void setHeaders(Map<String, Object> headers);

    /**
     * Returns the body of the message as a POJO
     *
     * @return the body of the message
     */
    Object getBody();

    /**
     * Returns the body as the specified type
     *
     * @param type the type that the body
     * @return the body of the message as the specified type
     */
    <T> T getBody(Class<T> type);

    /**
     * Sets the body of the message
     */
    void setBody(Object body);

    /**
     * Sets the body of the message as a specific type
     */
    <T> void setBody(Object body, Class<T> type);

    /**
     * Creates a copy of this message so that it can be used and possibly
     * modified further in another exchange
     *
     * @return a new message instance copied from this message
     */
    NormalizedMessage copy();

}
