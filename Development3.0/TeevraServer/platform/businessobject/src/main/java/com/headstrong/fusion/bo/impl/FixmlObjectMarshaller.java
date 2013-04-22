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
 * $Id: FixmlObjectMarshaller.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Jul 1, 2009 
 */

package com.headstrong.fusion.bo.impl;

import java.io.Writer;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectMarshaller;
import com.headstrong.fusion.bo.java.FixmlContext;
import com.headstrong.fusion.bo.java.FixmlContextFactory;
import com.headstrong.fusion.bo.java.FixmlNamespace;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

/**
 * Converts the java business object into
 */
@Deprecated
public class FixmlObjectMarshaller implements BusinessObjectMarshaller {

	/**
	 * Singleton instance
	 */
	private static FixmlObjectMarshaller instance = null;

	/**
	 * JAXB marshaller.
	 */
	private Marshaller marshaller;
	private Unmarshaller unmarshaller;

	private FixmlObjectMarshaller() throws JAXBException {
		FixmlContext context = FixmlContextFactory
				.getFixmlContext(FixmlNamespace.DEFAULT);
		this.marshaller = context.getMarshaller();
		this.unmarshaller = context.getUnmarshaller();
	}

	/**
	 * Return singleton instance
	 * 
	 * @return
	 * @throws JAXBException
	 */
	public static FixmlObjectMarshaller getInstance() throws JAXBException {
		synchronized (FixmlObjectMarshaller.class) {
			if (instance == null) {
				instance = new FixmlObjectMarshaller();
			}
		}
		return instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.bo.BusinessObjectMarshaller#marshal(java.io.Reader)
	 */
	@Override
	public void marshal(BusinessObject businessObject, Writer writer)
			throws Exception {
		if (businessObject instanceof JavaBusinessObject) {
			synchronized (this.marshaller) {
				this.marshaller.marshal(((JavaBusinessObject) businessObject)
						.getObject(), writer);
			}
		} else {
			throw new Exception("Business object type "
					+ businessObject.getClass().getSimpleName()
					+ " not supported");
		}
	}

	/**
	 * @return the marshaller
	 */
	public Marshaller getMarshaller() {
		return marshaller;
	}

	/**
	 * 
	 * @return the unmarshaller
	 */
	public Unmarshaller getUnmarshaller() {
		return unmarshaller;
	}
}
