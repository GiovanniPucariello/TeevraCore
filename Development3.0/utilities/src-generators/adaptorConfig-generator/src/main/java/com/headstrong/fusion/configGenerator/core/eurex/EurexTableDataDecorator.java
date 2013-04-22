/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright '\u00a9' 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: EurexTableDataDecorator.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Dec 9, 2009 
 */

package com.headstrong.fusion.configGenerator.core.eurex;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.commObjs.MessageDTO;
import com.headstrong.fusion.configGenerator.core.DTOTransformer;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ConfigHeader;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ObjectFactory;

/**
 * @author VGarde
 *
 */
public class EurexTableDataDecorator extends TableDataFactory{

	private String sheetName;
	private TableDataFactory workSheetDataFactory;
	private ObjectFactory objFactory = new ObjectFactory();
	private Properties props;
	/**
	 * @param sheetName
	 * @param dbUrl 
	 */
	public EurexTableDataDecorator(String sheetName,Properties props) {
		this.sheetName = sheetName;
		workSheetDataFactory = TableDataFactory.getFactory(sheetName, props.getProperty("DATABASE_URL"));
		this.props = props;
	}

	
	public ConfigHeader createConfigHeader() {
		ConfigHeader configheader = objFactory.createConfigHeader();
		configheader.setNamespaceUri(props.getProperty("SCHEMA_LOCATION", "http://www.fixprotocol.org/FIXML-5-0"));
		configheader.setSchema((String) workSheetDataFactory.getRequestID().get(sheetName));
		return configheader;
	}
	
	
	/**
	 * @param workSheetDataFactory 
	 * @param queryType 
	 * @return
	 */
	public List<FixMLConfigurationElement> getSelectorData(String queryType) {
		// Get the FIXML Tag column Name for each QUERY_TYPE
		String selectorData = workSheetDataFactory.getColumnName("FIXML").get(queryType).toString();
		String selectorType = workSheetDataFactory.getColumnName("FIXMLTAGTYPE").get(queryType).toString();
		List<FixMLConfigurationElement>  selectorFixTags = FixMLConfigurationElement.getFixMLTagTypes(
				cleanSelectorName(selectorData), cleanSelectorType(selectorType), null, null);
		
		return selectorFixTags;
	}
	
	
	/* (non-Javadoc)
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getColumnName(java.lang.String)
	 */
	@Override
	public Map getColumnName(String messageType) {
		return workSheetDataFactory.getColumnName(messageType);
	}


	/* (non-Javadoc)
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getParentStrutName()
	 */
	@Override
	public Map getParentStrutName() {
		return workSheetDataFactory.getParentStrutName();
	}

	public String getParentStrutName(String queryType) {
		return getParentStrutName().get(queryType).toString();
	}


	/* (non-Javadoc)
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getQueryData(java.lang.String)
	 */
	@Override
	public List<Map> getQueryData(String selectionString) {
		return workSheetDataFactory.getQueryData(selectionString);
	}


	/* (non-Javadoc)
	 * @see com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory#getRequestID()
	 */
	@Override
	public Map getRequestID() {
		return workSheetDataFactory.getRequestID();
	}
	
	
	/**
	 * Clean FIXML Selector string by stripping it of superfluous data.
	 * @param selector
	 * @param selectorType 
	 * @return
	 */
	private String cleanSelectorName(String selector) {
		if (selector.startsWith(GeneratorProcessorForEurex.FIXML_TAGS_COL_HEADER)) {
			selector = selector.substring(GeneratorProcessorForEurex.FIXML_TAGS_COL_HEADER.length());
		} else if (selector.startsWith(GeneratorProcessorForEurex.RULES_COL_HEADER)) {
			selector = selector.substring(GeneratorProcessorForEurex.RULES_COL_HEADER.length());
		}
		
		return selector;
	}

	/**
	 * Clean Selector Type string by stripping it of superfluous data.
	 * @param type
	 * @return
	 */
	private String cleanSelectorType(String type){
		if (type.startsWith(GeneratorProcessorForEurex.FIXML_DATA_TYPE)) {
			type = type.substring(GeneratorProcessorForEurex.FIXML_DATA_TYPE.length()).trim();
			type = ("".equals(type)) ? null : type;
		}
		return type;
	}


	/**
	 * Returns a Map containing fixml to C Mappings.
	 * @return
	 */
	public List<Map> getMappingPair(String queryType) {
		List<Map> mapList = getQueryData(queryType);
		if(mapList==null){
			return null;
		}
		MessageDTO dto = new MessageDTO(mapList, queryType);
		DTOTransformer transformer = new DTOTransformerForEurex(dto);
		return transformer.getObjects(queryType);
	}
	
}
