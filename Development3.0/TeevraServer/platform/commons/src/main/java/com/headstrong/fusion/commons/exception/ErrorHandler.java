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
 * $Id: ErrorHandler.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: May 20, 2009 
 */

package com.headstrong.fusion.commons.exception;

import com.headstrong.fusion.commons.MessageExchange;

/**
 * provides interface to manage errors based on the Error handling strategies.
 * 
 */
public interface ErrorHandler {

	/**
	 * Sets the current message exchange to the error context.
	 * 
	 * @param exchange
	 */
	public void initContext(MessageExchange exchange);

	/**
	 * Reports the Error to the Error handler which in-turn checks the Error
	 * contexts and decides based on the error strategy if to continue
	 * processing or not.
	 * 
	 * @param ErrorContext
	 *            Error Context to be reported.
	 * @throws Exception
	 *             throws the reported exception so that the default exception
	 *             server route can catch and report the same. Required for the
	 *             recovery route too.
	 */
	public void reportError(ErrorContext errorContext) throws FusionException;

	/**
	 * Reports the Error to the Error handler which in-turn checks the Error
	 * contexts and decides based on the error strategy if to continue
	 * processing or not.
	 * 
	 * @param ErrorContext
	 *            Error Context to be reported.
	 * @param handle
	 *            this boolean param specifies if this Error should be handled
	 *            or not. if False the error will only be reported to the error
	 *            reporters. No Error handling will take place.
	 * @throws Exception
	 *             throws the reported exception so that the default exception
	 *             server route can catch and report the same. Required for the
	 *             recovery route too.
	 */
	public void reportError(ErrorContext errorContext, boolean handle)
			throws FusionException;

	/**
	 * Reports the Error to the Error handler which in-turn checks the Error
	 * contexts and decides based on the error strategy if to continue
	 * processing or not.
	 * 
	 * @param ErrorContext
	 *            Error Context to be reported.
	 * @param reportToRecovery
	 *            boolean flag identifies if the error has to reported to
	 *            recovery queue or not.
	 * @param handle
	 *            this boolean param specifies if this Error should be handled
	 *            or not. if False the error will only be reported to the error
	 *            reporters. No Error handling will take place.
	 * @throws Exception
	 *             throws the reported exception so that the default exception
	 *             server route can catch and report the same. Required for the
	 *             recovery route too.
	 */
	public void reportError(ErrorContext errorContext,
			boolean reportToRecovery, boolean handle) throws FusionException;

	/**
	 * Returns true if processing can be continued or else false.
	 * 
	 * @return true if processing can be continued or else false.
	 */
	public boolean isToContinue();

	/**
	 * Clears the previous Error Context.
	 */
	public void resetContext();
}
