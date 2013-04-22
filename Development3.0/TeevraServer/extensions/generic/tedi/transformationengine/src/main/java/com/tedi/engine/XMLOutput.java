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
 * $Id: XMLOutput.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;

import objTedi.MapFile;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NamedNodeMap;
import org.xml.sax.InputSource;

import tedi.util.Utils;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class XMLOutput extends AbstractOutput {

	/**
	 * The document instance.
	 */
	private Document doc = null;
	/**
	 * The DTD.
	 */
	private String dtd = "";
	/**
	 * Absolute DTD url.
	 */
	private URL absoluteDTD_URL;
	// private XMLUtils xmlUtils;
	/**
	 * Defines if the output is to be created in compact format.
	 */
	private boolean isCompact;
	/**
	 * Defines if the output should suppress doc type.
	 */
	private boolean isSuppressDocType;

	// Constants.
	private static final String TEXT_CDATA = "Text CDATA";
	private static final String NOT_MAPPABLE = "Not Mappable";
	private static final String CALC = "Calc";
	private static final String TEDI_SUPRESS = "@@@TEDI_SUPPRESS$$$";
	private static final String INPUT_SOURCE_ENCODING = "ISO-8859-1";

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(XMLOutput.class);

	/*
	 * Processing xml output. (non-Javadoc)
	 * 
	 * @see com.tedi.engine.AbstractOutput#process(java.util.Vector,
	 *      java.util.Vector)
	 */
	public String process(Vector structureV, Vector dataV) {
		doc = DocumentHelper.createDocument();
		Element root = null;
		String suppress = null;
		String result = "";

		if (logger.isDebugEnabled()) {
			logger.debug("Processing XML output.");
		}

		if (structureV != null && structureV.size() > 0 && structureV != null) {
			try {
				// main loop for creating the XML document
				for (int i = 0; i < structureV.size(); i++) {
					String value = (String) dataV.elementAt(i);
					Vector fieldV = (Vector) structureV.elementAt(i);
					String path = (String) fieldV.elementAt(0);
					String endpoint = (String) fieldV.elementAt(1);
					String datatype = (String) fieldV.elementAt(4);
					// deal with suppression criteria
					// --------------------------------------------------------------
					if (suppress != null) {
						if (path.indexOf(suppress) > -1)
							continue;
						else
							suppress = null;
					}
					// if printing of this part of the tree was supressed, skip
					// ahead
					if (value.equals(TEDI_SUPRESS)) {
						if (suppress == null)
							suppress = path;
						continue;
					}
					// ---------------------------------------------------------------------------------------------
					Vector currentRowVector = (Vector) structureV.elementAt(i);
					// Only non-calc fields make it to output
					if (!currentRowVector.elementAt(4).toString().equals(CALC)) {
						StringTokenizer st = new StringTokenizer(path, "/");
						int count = st.countTokens();
						// factor out the root
						String firstToken = st.nextToken();
						count--;
						// Set root if required
						if (root == null) {
							this.setSystemID(firstToken);
							root = DocumentHelper.createElement(firstToken);
							doc.setRootElement(root);
							if (count == 0 && endpoint.length() == 0)
								continue;
						} else if (endpoint.length() == 0)
							count--;
						// Handle error condition of no root
						if (root == null) {
							execResults
									.addMessage(ExecutionResults.M_ERROR,
											ExecutionResults.J2EE_TARGET_ERR,
											"Mapping defintion error locating root element declaration.");
							execResults
									.setReturnCode(ExecutionResults.RESULT_ERROR);
							break;
						}
						if (endpoint.length() > 0) {
							if (mapFile.isSuppressAttribIfEmpty()
									&& value.length() == 0)
								continue;
							else if (mapFile
									.isSuppressAttribIfHasOnlyWhitespace()
									&& value.trim().length() == 0)
								continue;
						}
						// this is the main loop for a path
						Element elem = root;
						for (int j = 0; j < count; j++) {
							String item = st.nextToken();
							List childList = elem.elements(item);
							if (childList.size() > 0) {
								elem = (Element) childList
										.get(childList.size() - 1);
							} else {
								elem = elem.addElement(item);
							}
						}
						if (endpoint.length() == 0) {
							elem = elem.addElement(st.nextToken());
							if (datatype.equals(TEXT_CDATA))
								elem.addCDATA(value);
							else if (!datatype.equals(NOT_MAPPABLE))
								elem.addText(value);
						} else {
							elem.addAttribute(endpoint, value);
						}
					}
				}// end for() main loop

				// "isSuppressDocType" indicator re-used to suppress NS prefixes
				if (!isSuppressDocType) {
					addNSPrefixesToDocument();
				}

				result = cleanDocument(doc);
			} catch (Exception e) {
				execResults.addMessage(ExecutionResults.M_ERROR,
						ExecutionResults.J2EE_TARGET_ERR,
						"Error creating XML document: " + e.getMessage());
				execResults.setReturnCode(ExecutionResults.RESULT_ERROR);
			}
		}
		if (logger.isDebugEnabled()) {
			logger.debug("Processing of XML output completed.");
		}
		return result;
	}

	/**
	 * Add name space prefixes to the document.
	 * 
	 * @throws Exception
	 */
	private void addNSPrefixesToDocument() throws Exception {

		if (logger.isDebugEnabled()) {
			logger.debug("Adding name space prefixes to the document object.");
		}

		// 1. Parse non "prefixed" w3c dom
		javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory
				.newInstance();
		dbf.setValidating(false);
		dbf.setNamespaceAware(true);
		javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();

		// Document dom = db.parse(new
		// ByteArrayInputStream(doc.asXML().getBytes()));
		InputStream stream = new ByteArrayInputStream(doc.asXML().getBytes());
		InputSource source = new InputSource(stream);
		source.setEncoding(INPUT_SOURCE_ENCODING);
		org.w3c.dom.Document dom = db.parse(source);

		// 2. Get namespaces declared in the document and build a map of
		// prefix-to-namespaceuri
		Map nsMap = new HashMap();
		NamedNodeMap nnm = dom.getDocumentElement().getAttributes();
		if (nnm != null) {
			String aName = "", aValue = "";
			for (int i = 0; i < nnm.getLength(); i++) {
				org.w3c.dom.Node n = nnm.item(i);
				aName = n.getNodeName();
				if (aName.startsWith("xmlns:")) {
					aValue = n.getNodeValue();
					int ndx = aName.indexOf(':');
					nsMap.put(aValue, aName.substring(ndx + 1));
				}
			}
		}
		if (!nsMap.isEmpty()) {
			// 3. "Fix" the namespaces prefixes
			addNSPrefixToElement(dom.getDocumentElement(), nsMap);
			// 4. Convert to dom4j document - prefixed
			doc = new org.dom4j.io.DOMReader().read(dom);
		}
	}

	/**
	 * Add name space prefixes to the element.
	 * 
	 * @param ele
	 *            The element.
	 * @param nsMap
	 *            The name space map.
	 */
	private void addNSPrefixToElement(org.w3c.dom.Element ele, Map nsMap) {

		if (logger.isDebugEnabled()) {
			logger.debug("Adding name space prefixes to the element object.");
		}

		String uri = ele.getNamespaceURI();
		if (uri != null && nsMap.get(uri) != null) {
			ele.setPrefix(nsMap.get(uri).toString());
		}
		org.w3c.dom.NodeList children = ele.getChildNodes();
		for (int i = 0, len = children.getLength(); i < len; i++) {
			if (children.item(i) instanceof org.w3c.dom.Element) {
				addNSPrefixToElement((org.w3c.dom.Element) children.item(i),
						nsMap);
			}
		}
	}

	/**
	 * Handles functionality of formatting and writing document.
	 * 
	 * @param doc
	 *            The document
	 * @return the cleaned document.
	 * @throws Exception
	 */
	private String cleanDocument(Document doc) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("Cleaning the document object.");
		}
		String docStr = "";
		// --COMMENTED OUT 10-10-2005
		// JBG----------------------------------------------------------------------------------
		// if (dtd != null && dtd.length()>0) {
		// xmlUtils.setDocument(doc);
		// try {
		// AbstractSchemaDescriptor schema =
		// AbstractSchemaDescriptor.createDescriptor(absoluteDTD_URL.toString());
		// schema.processSchema(doc.getRootElement().getName());
		// xmlUtils.setSchema(schema);
		// xmlUtils.cleanDocument();
		// }
		// catch (Exception e) {
		// execResults.addMessage(ExecutionResults.M_WARNING,
		// ExecutionResults.J2EE_TARGET_ERR,
		// "Error removing optional attributes/elements: " + e.getMessage());
		// }
		// }
		// ----------------------------------------------------------------------------------------------------------------
		cleanElement(doc.getRootElement());
		StringWriter sw = new StringWriter();
		OutputFormat format = isCompact ? OutputFormat.createCompactFormat()
				: OutputFormat.createPrettyPrint();
		format.setExpandEmptyElements(false);
		XMLWriter writer = new XMLWriter(sw, format);
		writer.setMaximumAllowedCharacter(127);
		writer.write(doc);
		writer.close();
		docStr = sw.toString();
		if (isSuppressDocType && doc.getDocType() != null) {
			int ndx = docStr.indexOf("<" + doc.getRootElement().getName());
			docStr = docStr.substring(ndx);
		}
		return docStr;
	}

	/**
	 * Clean the element.
	 * 
	 * @param ele
	 *            The element.
	 */
	private void cleanElement(Element ele) {

		if (logger.isDebugEnabled()) {
			logger.debug("Cleaning the element " + ele);
		}
		// Attribute check shouldn't be necessary since only trying to write
		// populated attributes
		// but leave for now just in case
		for (Iterator i = ele.attributes().iterator(); i.hasNext();) {
			Attribute a = (Attribute) i.next();
			if (!mapFile.isSuppressAttribIfEmpty() || a.getText().length() > 0)
				continue;
			if (!mapFile.isSuppressAttribIfHasOnlyWhitespace()
					|| a.getText().trim().length() > 0)
				continue;
			ele.remove(a);
		}
		for (Iterator i = ele.elements().iterator(); i.hasNext();) {
			cleanElement((Element) i.next());
		}
		if (!mapFile.isSuppressElementIfHasNoChildren()
				|| ele.elements().size() > 0)
			return;
		if (!mapFile.isSuppressElementIfHasOnlyEmptyAttribs()
				|| ele.attributes().size() > 0)
			return;
		if (!mapFile.isSuppressElementIfEmpty() || ele.getText().length() > 0)
			return;
		if (!mapFile.isSuppressElementIfHasOnlyWhitespace()
				|| ele.getTextTrim().length() > 0)
			return;
		ele.getParent().remove(ele);
	}

	/**
	 * Returns the document instance.
	 * 
	 * @return the document.
	 */
	public Document getDocument() {
		return doc;
	}

	/**
	 * Set the TEDI Map file instance.
	 * 
	 * @param map
	 *            The TEDI map.
	 */
	public void setMap(MapFile map) {
		super.setMap(map);
		dtd = map.getDtdLocation();
		isCompact = map.isGenerateCompactXML();
		isSuppressDocType = map.isSuppressDocType();
		// --COMMENTED OUT 10-10-2005
		// JBG----------------------------------------------------------------------------------
		// xmlUtils = new XMLUtils();
		// //attribs
		// xmlUtils.setRemoveOptionalAttributesIfNoText(map.isSuppressAttribIfEmpty());
		// xmlUtils.setRemoveOptionalAttributesIfOnlyWhitespace(map.isSuppressAttribIfHasOnlyWhitespace());
		// //elems
		// xmlUtils.setRemoveOptionalElementsIfNoText(map.isSuppressElementIfEmpty());
		// xmlUtils.setRemoveOptionalElementsIfOnlyWhitespace(map.isSuppressElementIfHasOnlyWhitespace());
		// xmlUtils.setRemoveOptionalElementsIfNoChild(map.isSuppressElementIfHasNoChildren());
		// xmlUtils.setRemoveOptionalElementsIfAttributesEmpty(map.isSuppressElementIfHasOnlyEmptyAttribs());
		// ----------------------------------------------------------------------------------------------------------------
	}

	/**
	 * Set the system id.
	 * 
	 * @param rootStr
	 *            Root string
	 */
	private void setSystemID(String rootStr) {

		if (logger.isDebugEnabled()) {
			logger.debug("Setting system ID to the element- " + rootStr);
		}

		// set systemID
		if (dtd == null || dtd.length() == 0)
			return;
		String systemId = "";
		// if system ID is a full URL, use it, else just use DTD name
		try {
			absoluteDTD_URL = new URL(dtd);
			systemId = absoluteDTD_URL.toString();
		} catch (MalformedURLException me) {
			systemId = Utils.getFileComponent(dtd);
			try {
				absoluteDTD_URL = new File("dtd", systemId).toURL();
			} catch (Exception e) {
				String errStr = e.getMessage();
				logger.error(errStr);
				throw new RuntimeException(e);
			}
		}
		if (dtd.toLowerCase().endsWith("dtd")) {
			doc.addDocType(null, null, null);
			DocumentType type = doc.getDocType();
			type.setSystemID(systemId);
			type.setElementName(rootStr);
		}
	}

}
