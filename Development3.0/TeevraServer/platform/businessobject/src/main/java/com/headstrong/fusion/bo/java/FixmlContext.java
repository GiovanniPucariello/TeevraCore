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
 * $Id: FixmlMarshaller.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Feb 3, 2010 
 */

package com.headstrong.fusion.bo.java;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Context stores marshaller/unmarshller.
 */
public class FixmlContext {

	/**
	 * JAXB marshaller.
	 */
	// private Marshaller marshaller;
	// private Unmarshaller unmarshaller;
	private JAXBContext jaxbContext;

	public FixmlContext(String fixmlContext) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(fixmlContext);
	}

	public Marshaller getMarshaller() {
		try {
			return jaxbContext.createMarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}

	public Unmarshaller getUnmarshaller() {
		try {
			return jaxbContext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
	}
}
