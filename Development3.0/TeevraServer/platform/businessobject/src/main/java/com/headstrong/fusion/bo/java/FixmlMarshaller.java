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

import java.io.Writer;

import javax.xml.bind.Marshaller;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectMarshaller;

/**
 * Marshalls the fixml object
 */
public class FixmlMarshaller implements BusinessObjectMarshaller {
	private Marshaller marshaller;

	public FixmlMarshaller(Marshaller marshaller) {
		this.marshaller = marshaller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.bo.BusinessObjectMarshaller#marshal(com.headstrong.fusion.bo.BusinessObject,
	 *      java.io.Writer)
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

}
