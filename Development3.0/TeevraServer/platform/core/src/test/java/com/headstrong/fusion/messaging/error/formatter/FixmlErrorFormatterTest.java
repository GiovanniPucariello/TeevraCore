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
 * $Id: XmlErrorFormatterTest.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Jun 1, 2009 
 */

package com.headstrong.fusion.messaging.error.formatter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import junit.framework.TestCase;

import org.fixprotocol.fixml_5_0.AbstractMessageT;
import org.fixprotocol.fixml_5_0.FIXML;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.PartiesBlockT;
import org.fixprotocol.fixml_5_0.PosTypeEnumT;
import org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT;
import org.fixprotocol.fixml_5_0.PositionQtyBlockT;
import org.fixprotocol.fixml_5_0.PtysSubGrpBlockT;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.impl.FixmlObjectMarshaller;
import com.headstrong.fusion.bo.java.JavaBusinessObject;
import com.headstrong.fusion.commons.ErrorFormatter;
import com.headstrong.fusion.commons.exception.ErrorContext;
import com.headstrong.fusion.commons.exception.FusionException;

/**
 * 
 */
public class FixmlErrorFormatterTest extends TestCase {
	private Unmarshaller unmarshaller;
	private Marshaller marshaller;

	public FixmlErrorFormatterTest() throws Exception {
		JAXBContext jaxbContext = JAXBContext
				.newInstance("org.fixprotocol.fixml_5_0");
		unmarshaller = jaxbContext.createUnmarshaller();
		marshaller = jaxbContext.createMarshaller();
	}

	public PositionMaintenanceRequestMessageT createPositionMaintenanceRequestMessageT()
			throws Exception {
		PositionMaintenanceRequestMessageT positionMaintenanceRequestMessageT = new PositionMaintenanceRequestMessageT();
		positionMaintenanceRequestMessageT.setReqID("reqId");
		positionMaintenanceRequestMessageT.setTxnTyp(1);
		positionMaintenanceRequestMessageT.setActn(1);
		positionMaintenanceRequestMessageT
				.setBizDt(DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(new GregorianCalendar()));
		positionMaintenanceRequestMessageT
				.setTxnTm(DatatypeFactory.newInstance()
						.newXMLGregorianCalendar(new GregorianCalendar()));

		PartiesBlockT partiesBlockT1 = new PartiesBlockT();
		partiesBlockT1.setID("id");
		partiesBlockT1.setR(1);

		PtysSubGrpBlockT ptysSubGrpBlockT1 = new PtysSubGrpBlockT();
		ptysSubGrpBlockT1.setID("id");
		ptysSubGrpBlockT1.setTyp("typ");

		PartiesBlockT partiesBlockT2 = new PartiesBlockT();
		partiesBlockT2.setID("id");
		partiesBlockT2.setR(1);

		PtysSubGrpBlockT ptysSubGrpBlockT2 = new PtysSubGrpBlockT();
		ptysSubGrpBlockT2.setID("id");
		ptysSubGrpBlockT2.setTyp("typ");

		partiesBlockT2.getSub().add(ptysSubGrpBlockT1);
		partiesBlockT2.getSub().add(ptysSubGrpBlockT2);

		positionMaintenanceRequestMessageT.getPty().add(partiesBlockT2);
		InstrumentBlockT instrumentBlockT = new InstrumentBlockT();
		instrumentBlockT.setID("id");
		instrumentBlockT.setCFI("cfi");
		instrumentBlockT.setMMY("mmy");
		instrumentBlockT.setStrkPx(BigDecimal.ONE);
		instrumentBlockT.setExch("exch");

		positionMaintenanceRequestMessageT.setInstrmt(instrumentBlockT);

		PositionQtyBlockT positionQtyBlockT = new PositionQtyBlockT();
		positionQtyBlockT.setTyp(PosTypeEnumT.ALC);
		positionQtyBlockT.setLong(BigDecimal.ONE);
		positionQtyBlockT.setStat(1);
		positionMaintenanceRequestMessageT.getQty().add(positionQtyBlockT);
		positionMaintenanceRequestMessageT.setAdjTyp(1);
		return positionMaintenanceRequestMessageT;
	}

	public void testFormatResourceAsBusinessObject() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("fixml");
		ErrorContext errCtx = new ErrorContext();
		errCtx.setComponentType("validator");
		QName qName = new QName("http://www.headstrong.com/TEEVRA-FIXML-1-0",
				"posMntReq");

		FIXML fixml = new FIXML();
		AbstractMessageT abstractBody = this
				.createPositionMaintenanceRequestMessageT();
		JAXBElement element = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody);
		fixml.setMessage(element);
		JavaBusinessObject javaBusinessObject = new JavaBusinessObject(fixml);

		javaBusinessObject
				.setBusinessObjectMarshaller(FixmlObjectMarshaller.getInstance());

		errCtx.setResource(javaBusinessObject);
		errCtx.setTimestamp(new Date(2009, 01, 01));
		errCtx.setType("Business");
		errCtx.setCause(new FusionException("Instrument.mmy can not be null."));
		errCtx.setFixmlVersion("TEEVRA_FIXML_1_0");
		String errorXml = (String) errorFormatter.format(errCtx);
		System.out.println(errorXml);
	}

	public void testFormatResourceAsListOfBusinessObject() throws Exception {
		ErrorFormatter errorFormatter = ErrorFormatterFactory
				.getErrorFormatter("fixml");
		ErrorContext errCtx = new ErrorContext();
		errCtx.setComponentType("validator");
		QName qName = new QName("http://www.headstrong.com/TEEVRA-FIXML-1-0",
				"posMntReq");

		FIXML fixml1 = new FIXML();
		AbstractMessageT abstractBody1 = this
				.createPositionMaintenanceRequestMessageT();
		JAXBElement element1 = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody1);
		fixml1.setMessage(element1);
		JavaBusinessObject javaBusinessObject1 = new JavaBusinessObject(fixml1);

		javaBusinessObject1
				.setBusinessObjectMarshaller(FixmlObjectMarshaller.getInstance());

		FIXML fixml2 = new FIXML();
		AbstractMessageT abstractBody2 = this
				.createPositionMaintenanceRequestMessageT();
		JAXBElement element2 = new JAXBElement(qName,
				PositionMaintenanceRequestMessageT.class, null, abstractBody2);
		fixml2.setMessage(element2);
		JavaBusinessObject javaBusinessObject2 = new JavaBusinessObject(fixml2);

		javaBusinessObject2
				.setBusinessObjectMarshaller(FixmlObjectMarshaller.getInstance());

		List<BusinessObject> resource = new ArrayList<BusinessObject>();
		resource.add(javaBusinessObject1);
		resource.add(javaBusinessObject2);
		errCtx.setResource(resource);
		errCtx.setTimestamp(new Date(2009, 01, 01));
		errCtx.setType("Business");
		errCtx.setFixmlVersion("TEEVRA_FIXML_1_0");
		errCtx.setCause(new FusionException("Validation Failed."));
		String errorXml = (String) errorFormatter.format(errCtx);
		System.out.println(errorXml);
	}
}
