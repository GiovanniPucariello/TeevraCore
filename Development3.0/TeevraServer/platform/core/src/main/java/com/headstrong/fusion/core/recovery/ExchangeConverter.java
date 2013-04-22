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
 * $Id: ExchangeConverter.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Oct 6, 2009 
 */

package com.headstrong.fusion.core.recovery;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.apache.camel.Exchange;
import org.hsqldb.lib.StringInputStream;

/**
 * serializes/de-serialzes the Exchange to/from output stream.
 * 
 */
public class ExchangeConverter {

	public static void write(Exchange exchange, OutputStream os)
			throws IOException {
		RecoverableExchange recoverableExchange = new RecoverableExchange();
		recoverableExchange.writeExchange(exchange);
		ObjectOutput out = new ObjectOutputStream(os);
		out.writeObject(recoverableExchange);
		out.flush();
		out.close();
	}

	public static void read(Exchange exchange, InputStream is)
			throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(is);
		RecoverableExchange recoverableExchange = (RecoverableExchange) in
				.readObject();
		in.close();
		recoverableExchange.readExchange(exchange);
	}
}
