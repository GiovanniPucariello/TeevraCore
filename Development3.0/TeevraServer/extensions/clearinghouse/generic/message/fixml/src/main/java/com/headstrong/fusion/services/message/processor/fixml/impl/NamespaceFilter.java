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
 * $Id: NameSpaceFilter.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Jun 8, 2010 
 */

package com.headstrong.fusion.services.message.processor.fixml.impl;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import org.xml.sax.helpers.XMLFilterImpl;

/**
 * Filters namespace in XML. While parsing it can add namespace to the XML if
 * needed. While formatting, it can remove/modify namespace if required
 */
public class NamespaceFilter extends XMLFilterImpl {

	private String usedNamespaceUri;
	private boolean addNamespace;

	// State variable
	private boolean addedNamespace = false;

	public NamespaceFilter(String namespaceUri, boolean addNamespace) {
		super();

		if (addNamespace)
			this.usedNamespaceUri = namespaceUri;
		else
			this.usedNamespaceUri = "";
		this.addNamespace = addNamespace;
	}

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		if (addNamespace) {
			startControlledPrefixMapping();
		}
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2,
			Attributes arg3) throws SAXException {

		super.startElement(this.usedNamespaceUri, arg1, arg2, arg3);
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2)
			throws SAXException {

		super.endElement(this.usedNamespaceUri, arg1, arg2);
	}

	@Override
	public void startPrefixMapping(String prefix, String url)
			throws SAXException {

		if (addNamespace) {
			this.startControlledPrefixMapping();
		} else {
			// Remove the namespace, i.e. don´t call startPrefixMapping for
			// parent!
		}

	}

	private void startControlledPrefixMapping() throws SAXException {

		if (this.addNamespace && !this.addedNamespace) {
			// We should add namespace since it is set and has not yet been
			// done.
			super.startPrefixMapping("", this.usedNamespaceUri);

			// Make sure we dont do it twice
			this.addedNamespace = true;
		}
	}

}
