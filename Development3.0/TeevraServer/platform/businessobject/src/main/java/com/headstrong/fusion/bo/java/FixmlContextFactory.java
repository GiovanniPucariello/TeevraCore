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
 * $Id: FixmlMarshallerFactory.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 3, 2010 
 */

package com.headstrong.fusion.bo.java;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;

/**
 * Returns Fixml Marshaller.
 */
public class FixmlContextFactory {

	private static Map<FixmlNamespace, FixmlContext> contextFactory = new HashMap<FixmlNamespace, FixmlContext>();

	/**
	 * returns the fixml context.
	 * 
	 * @param fixmlNamespace
	 *            FixmlNam
	 * @return
	 */
	public static FixmlContext getFixmlContext(FixmlNamespace fixmlNamespace) {
		synchronized (FixmlContextFactory.class) {
			try {
				init(fixmlNamespace);
			} catch (JAXBException e) {
				throw new RuntimeException(
						"FixmlContext Factory not initialized properly.");
			}
		}
		return contextFactory.get(fixmlNamespace);
	}

	/**
	 * Initializes the fixml context factory.
	 * 
	 * @precondition
	 * @postcondition
	 * @throws JAXBException
	 */
	public static void init(FixmlNamespace fixmlNamespace) throws JAXBException {
		if (contextFactory.get(fixmlNamespace) == null) {
			contextFactory.put(fixmlNamespace, new FixmlContext(fixmlNamespace
					.getFixmlContext()));
		}
	}
}
