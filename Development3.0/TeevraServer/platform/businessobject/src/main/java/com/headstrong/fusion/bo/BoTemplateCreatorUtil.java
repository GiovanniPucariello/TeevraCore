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
 * $Id:BusinessObjectCreator.java
 * $Revision: 
 * $Author: Sumit
 * $DateTime: Sep 8, 2010 
 */
package com.headstrong.fusion.bo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import com.headstrong.fusion.bo.java.FixmlContext;
import com.headstrong.fusion.bo.java.FixmlContextFactory;
import com.headstrong.fusion.bo.java.FixmlMarshaller;
import com.headstrong.fusion.bo.java.FixmlNamespace;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

/** Depending on the namespace, create and return BusinessObjects */

public enum BoTemplateCreatorUtil {
	FIXML_5_0 {
		@SuppressWarnings( { "unchecked", "deprecation" })
		public BusinessObject createBoFromClassShortName(String namespace,
				String className, String localPart)
				throws InstantiationException, IllegalAccessException,
				 ClassNotFoundException {
			org.fixprotocol.fixml_5_0.FIXML fixml = new org.fixprotocol.fixml_5_0.FIXML();
			org.fixprotocol.fixml_5_0.AbstractMessageT abstractBody = null;
			String qualifiedName = (FixmlNamespace.valueOf(namespace)
					.getFixmlContext()
					+ "." + className);
			Class bodyClass = Class.forName(qualifiedName);
			FixmlContext context = FixmlContextFactory
			.getFixmlContext(FixmlNamespace.valueOf(namespace));

			abstractBody = (org.fixprotocol.fixml_5_0.AbstractMessageT) bodyClass
					.newInstance();

			QName qName = new QName(FixmlNamespace.valueOf(namespace)
					.getFixmlNamespace(), localPart);
			JAXBElement element = new JAXBElement(qName, bodyClass, null,
					abstractBody);
			fixml.setMessage(element);
			BusinessObject targetBusinessObject;
			targetBusinessObject = new JavaBusinessObject(fixml);//

			targetBusinessObject
					.setBusinessObjectMarshaller(new FixmlMarshaller(
							context.getMarshaller()));

			return targetBusinessObject;

		}

	},
	
	FIXML_5_0_SP2 {
		@SuppressWarnings( { "unchecked", "deprecation" })
		public BusinessObject createBoFromClassShortName(String namespace,
				String className, String localPart) throws 
				InstantiationException, IllegalAccessException,
				ClassNotFoundException,JAXBException {
			org.fixprotocol.fixml_5_0_sp2.FIXML fixml = new org.fixprotocol.fixml_5_0_sp2.FIXML();

			org.fixprotocol.fixml_5_0_sp2.AbstractMessageT abstractBody = null;
			String qualifiedName = (FixmlNamespace.valueOf(namespace)
					.getFixmlContext()
					+ "." + className);
			Class bodyClass = Class.forName(qualifiedName);
			FixmlContext context = FixmlContextFactory
			.getFixmlContext(FixmlNamespace.valueOf(namespace));
			abstractBody = (org.fixprotocol.fixml_5_0_sp2.AbstractMessageT) bodyClass
					.newInstance();

			QName qName = new QName(FixmlNamespace.valueOf(namespace)
					.getFixmlNamespace(), localPart);
			JAXBElement element = new JAXBElement(qName, bodyClass, null,
					abstractBody);
			fixml.setMessage(element);
			BusinessObject targetBusinessObject;
			targetBusinessObject = new JavaBusinessObject(fixml);
			targetBusinessObject
					.setBusinessObjectMarshaller(new FixmlMarshaller(
							context.getMarshaller()));

			return targetBusinessObject;

		}
	},
	TEEVRA_FIXML_1_0 {
		@SuppressWarnings( { "unchecked", "deprecation" })
		public BusinessObject createBoFromClassShortName(String namespace,
				String className, String localPart) throws 
				InstantiationException, IllegalAccessException,
				ClassNotFoundException,JAXBException {
			com.headstrong.teevra_fixml_1_0.FIXML fixml = new com.headstrong.teevra_fixml_1_0.FIXML();

			com.headstrong.teevra_fixml_1_0.AbstractMessageT abstractBody = null;
			String qualifiedName = (FixmlNamespace.valueOf(namespace)
					.getFixmlContext()
					+ "." + className);
			Class bodyClass = Class.forName(qualifiedName);
			FixmlContext context = FixmlContextFactory
			.getFixmlContext(FixmlNamespace.valueOf(namespace));
			abstractBody = (com.headstrong.teevra_fixml_1_0.AbstractMessageT) bodyClass
					.newInstance();

			QName qName = new QName(FixmlNamespace.valueOf(namespace)
					.getFixmlNamespace(), localPart);
			JAXBElement element = new JAXBElement(qName, bodyClass, null,
					abstractBody);
			fixml.setMessage(element);
			BusinessObject targetBusinessObject;
			targetBusinessObject = new JavaBusinessObject(fixml);

			targetBusinessObject
					.setBusinessObjectMarshaller(new FixmlMarshaller(
							context.getMarshaller()));

			return targetBusinessObject;

		}
	},
	sp1{
		@SuppressWarnings( { "unchecked", "deprecation" })
		public BusinessObject createBoFromClassShortName(String namespace,
				String className, String localPart) throws 
				InstantiationException, IllegalAccessException,
				ClassNotFoundException,JAXBException {
			com.headstrong.teevra_fixml_1_0.FIXML fixml = new com.headstrong.teevra_fixml_1_0.FIXML();

			com.headstrong.teevra_fixml_1_0.AbstractMessageT abstractBody = null;
			String qualifiedName = (FixmlNamespace.valueOf(namespace)
					.getFixmlContext()
					+ "." + className);
			Class bodyClass = Class.forName(qualifiedName);
			FixmlContext context = FixmlContextFactory
			.getFixmlContext(FixmlNamespace.valueOf(namespace));
			abstractBody = (com.headstrong.teevra_fixml_1_0.AbstractMessageT) bodyClass
					.newInstance();

			QName qName = new QName(FixmlNamespace.valueOf(namespace)
					.getFixmlNamespace(), localPart);
			JAXBElement element = new JAXBElement(qName, bodyClass, null,
					abstractBody);
			fixml.setMessage(element);
			BusinessObject targetBusinessObject;
			targetBusinessObject = new JavaBusinessObject(fixml);

			targetBusinessObject
					.setBusinessObjectMarshaller(new FixmlMarshaller(
							context.getMarshaller()));

			return targetBusinessObject;
		}
		
		
		
	},
	
	
	DEFAULT {
		@SuppressWarnings( { "unchecked", "deprecation" })
		public BusinessObject createBoFromClassShortName(String namespace,
				String className, String localPart) throws 
				InstantiationException, IllegalAccessException,
				ClassNotFoundException,JAXBException {
			com.headstrong.teevra_fixml_1_0.FIXML fixml = new com.headstrong.teevra_fixml_1_0.FIXML();
			com.headstrong.teevra_fixml_1_0.AbstractMessageT abstractBody = null;
			String qualifiedName = (FixmlNamespace.valueOf(namespace)
					.getFixmlContext()
					+ "." + className);
			Class bodyClass = Class.forName(qualifiedName);
			FixmlContext context = FixmlContextFactory
			.getFixmlContext(FixmlNamespace.valueOf(namespace));
			abstractBody = (com.headstrong.teevra_fixml_1_0.AbstractMessageT) bodyClass
					.newInstance();

			QName qName = new QName(FixmlNamespace.valueOf(namespace)
					.getFixmlNamespace(), localPart);
			JAXBElement element = new JAXBElement(qName, bodyClass, null,
					abstractBody);
			fixml.setMessage(element);
			BusinessObject targetBusinessObject;
			targetBusinessObject = new JavaBusinessObject(fixml);

			targetBusinessObject.
					setBusinessObjectMarshaller(new FixmlMarshaller(
							context.getMarshaller()));

			return targetBusinessObject;

		}
	};

	public BusinessObject createBoFromClassShortName(String namespace,
			String className, String localPart) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,JAXBException {
		return null;

	}

}
