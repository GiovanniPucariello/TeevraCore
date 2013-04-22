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
 * $Id: ExecutionResults.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.io.Serializable;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tedi.common.LogOutputInterface;
import tedi.util.Base64;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class ExecutionResults implements LogOutputInterface, Serializable {

	public static final int M_INFORMATIONAL = 0;
	public static final int M_WARNING = 1;
	public static final int M_ERROR = 2;

	// engine messages
	public static final int J2EE_ENG_SYS_ERR = 9501;
	public static final int J2EE_ENG_UNPARSEABLE_DATA = 9502;
	public static final int J2EE_IO_BAD_XML = 9508;
	public static final int J2EE_TARGET_ERR = 9509;
	public static final int J2EE_INTERPRETER_OUTPUT = 9510;
	public static final int J2EE_USR_EDIT = 9511;

	public static final int RESULT_ERROR = 1;
	public static final int RESULT_SUCCESS = 0;

	private int returnCode;
	private String payload;
	private Vector<ExecutionMessage> messageVector = new Vector<ExecutionMessage>();

	// Ivan 08/16/2006 - added these variables (and related functionality) to
	// support processing for EBCDIC output
	private boolean isPayloadBase64 = false;
	private String payloadEncoding = "";

	/**
	 * Logger
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(ExecutionResults.class);

	/**
	 * Constructor
	 */
	public ExecutionResults() {
	}

	/**
	 * Returns the pay load.
	 * 
	 * @return Returns the pay load.
	 */
	public String getPayload() {
		return payload;
	}

	/**
	 * Set the pay load.
	 * 
	 * @param text
	 *            Set the pay load.
	 */
	public void setPayload(String text) {
		payload = text;
	}

	/**
	 * Returns the bytes of the pay load.
	 * 
	 * @return Returns the bytes of the pay load.
	 */
	public byte[] getPayloadBytes() {
		byte[] payloadBytes = null;

		if (isPayloadBase64 && !payloadEncoding.equals("System Default")) {
			try {
				payloadBytes = Base64.decode(payload);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return payloadBytes;
	}

	/**
	 * Returns whether pay load is base 64.
	 * 
	 * @return Returns the isPayloadBase64 value.
	 */
	public boolean getIsPayloadBase64() {
		return isPayloadBase64;
	}

	/**
	 * Set the pay load base encoding of 64.
	 * 
	 * @param pValue
	 *            Set the message.
	 */
	protected void setIsPayloadBase64(boolean pValue) {
		isPayloadBase64 = pValue;
	}

	/**
	 * Returns the pay load encoding.
	 * 
	 * @return Returns the pay load encoding.
	 */
	public String getPayloadEncoding() {
		return payloadEncoding;
	}

	/**
	 * Set the pay load encoding.
	 * 
	 * @param pValue
	 *            Set the pay load encoding.
	 */
	protected void setPayloadEncoding(String pValue) {
		payloadEncoding = pValue;
	}

	/**
	 * Add message to the message vector with the passed details.
	 * 
	 * @param level
	 *            Level of the message
	 * @param code
	 *            Message Code
	 * @param msg
	 *            Message
	 */
	public void addMessage(int level, int code, String msg) {
		ExecutionMessage execMsg = new ExecutionMessage();
		execMsg.setLevel(level);
		execMsg.setMessageID(code);
		execMsg.setMessage(msg);
		messageVector.add(execMsg);
	}

	/**
	 * Returns the execution messages in an array.
	 * 
	 * @return Returns the array of execution messages.
	 */
	public ExecutionMessage[] getMessage() {
		ExecutionMessage[] msgs = new ExecutionMessage[messageVector.size()];
		for (int i = 0; i < messageVector.size(); i++) {
			msgs[i] = (ExecutionMessage) messageVector.elementAt(i);
		}
		return msgs;
	}

	/**
	 * Sean-Tuan IITS-VN add this function on Jan, 20, 2006 to expose the
	 * TransformationEngine EJB to Web Services successfully in WebLogic.
	 */
	public void setMessage(ExecutionMessage[] msgs) {
		for (int i = 0; i < msgs.length; i++) {
			messageVector.addElement(msgs[i]);
		}
	}

	/**
	 * Set the code.
	 * 
	 * @param code
	 *            Set the code.
	 */
	public void setReturnCode(int code) {
		returnCode = code;
	}

	/**
	 * Returns the return code.
	 * 
	 * @return Returns the return code.
	 */
	public int getReturnCode() {
		return returnCode;
	}

	// INTERFACE METHODS
	/**
	 * Post the message.
	 * 
	 * @param message
	 *            The message to post.
	 */
	public void post(String message) {
		this.addMessage(M_INFORMATIONAL, J2EE_INTERPRETER_OUTPUT, message);
	}

	/**
	 * Log exception.
	 * 
	 * @param ex
	 *            Exception to log.
	 */
	public void post(Exception ex) {
		logger.error(ex.getMessage(), ex);
	}

	/**
	 * Post message and exception.
	 * 
	 * @param message
	 *            The message to post.
	 * @param exception
	 *            Exception to log.
	 */
	public void post(String message, Exception exception) {
		post(message);
		post(exception);
	}
}
