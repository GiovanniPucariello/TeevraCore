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
 * $Id: SCXMLStateMachineSerializer.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Mar 19, 2009 
 */

package com.headstrong.fusion.statemachine;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.headstrong.fusion.statemachine.exception.StateMachineSerializationException;

/**
 * Serializes and De-Serializes SCXML state machine.
 * 
 */
public class SCXMLStateMachineSerializer {

	/**
	 * Reads the Input stream and creates the {@link SCXMLStateMachine}
	 * 
	 * @param inputStream
	 * @return State Machine.
	 * @throws StateMachineSerializationException
	 */
	public static SCXMLStateMachine read(InputStream inputStream)
			throws StateMachineSerializationException {
		SCXMLStateMachine stateMachine = null;
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(
					inputStream);
			stateMachine = (SCXMLStateMachine) objectInputStream.readObject();
		} catch (IOException e) {
			throw new StateMachineSerializationException(
					"Error serializing the scxml executor.", e);
		} catch (ClassNotFoundException e) {
			throw new StateMachineSerializationException(
					"Error serializing the scxml executor.", e);
		}
		return stateMachine;
	}

	/**
	 * Writes the state machine object to output stream.
	 * 
	 * @param outStream
	 * @param stateMachine
	 * @throws StateMachineSerializationException
	 */
	public static void write(OutputStream outStream, StateMachine stateMachine)
			throws StateMachineSerializationException {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(outStream);
			oos.writeObject(stateMachine);
		} catch (IOException e) {
			throw new StateMachineSerializationException(
					"Error serializing the scxml executor.", e);
		}
	}
}
