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
 * $Id: StateMachineErrorReporter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 13, 2009 
 */

package com.headstrong.fusion.statemachine;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.scxml.ErrorReporter;
import org.apache.commons.scxml.env.LogUtils;
import org.apache.commons.scxml.model.SCXML;
import org.apache.commons.scxml.model.State;
import org.apache.commons.scxml.model.TransitionTarget;
import org.apache.commons.scxml.semantics.ErrorConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Custom error reporter that logger execution errors.
 */
public class StateMachineErrorReporter implements ErrorReporter, Serializable {

	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	/** Log. */
	private static final Logger logger = LoggerFactory
			.getLogger(StateMachineErrorReporter.class);

	/**
	 * @see ErrorReporter#onError(String, String, Object)
	 */
	public void onError(final String errorCode, final String errDetail,
			final Object errCtx) {
		// Note: the if-then-else below is based on the actual usage
		// (codebase search), it has to be kept up-to-date as the code changes
		String errCode = errorCode.intern();
		StringBuffer msg = new StringBuffer();
		msg.append(errCode).append(" (");
		msg.append(errDetail).append("): ");
		if (errCode == ErrorConstants.NO_INITIAL) {
			if (errCtx instanceof SCXML) {
				// determineInitialStates
				msg.append("<SCXML>");
			} else if (errCtx instanceof State) {
				// determineInitialStates
				// determineTargetStates
				msg.append("State ").append(LogUtils.getTTPath((State) errCtx));
			}
		} else if (errCode == ErrorConstants.UNKNOWN_ACTION) {
			// executeActionList
			msg.append("Action: ").append(errCtx.getClass().getName());
		} else if (errCode == ErrorConstants.ILLEGAL_CONFIG) {
			// isLegalConfig
			if (errCtx instanceof Map.Entry) {
				TransitionTarget tt = (TransitionTarget) (((Map.Entry) errCtx)
						.getKey());
				Set vals = (Set) (((Map.Entry) errCtx).getValue());
				msg.append(LogUtils.getTTPath(tt)).append(" : [");
				for (Iterator i = vals.iterator(); i.hasNext();) {
					TransitionTarget tx = (TransitionTarget) i.next();
					msg.append(LogUtils.getTTPath(tx));
					if (i.hasNext()) {
						msg.append(", ");
					}
				}
				msg.append(']');
			} else if (errCtx instanceof Set) {
				Set vals = (Set) errCtx;
				msg.append("<SCXML> : [");
				for (Iterator i = vals.iterator(); i.hasNext();) {
					TransitionTarget tx = (TransitionTarget) i.next();
					msg.append(LogUtils.getTTPath(tx));
					if (i.hasNext()) {
						msg.append(", ");
					}
				}
				msg.append(']');
			}
		}
		if (logger.isWarnEnabled()) {
			logger.warn(msg.toString());
		}
	}

}
