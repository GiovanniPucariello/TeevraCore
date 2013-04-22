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
 * $Id: ViewObjectsGenerator.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Dec 9, 2009 
 */

package com.headstrong.fusion.configGenerator.core.eurex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ObjectFactory;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Selector;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Selectors;

/**
 * @author VGarde
 * 
 */
public abstract class MappingsGenerator {

	public ObjectFactory objFactory = new ObjectFactory();
	protected Map<String, Map> mappingConfigData;
	protected List<Map> mappingsPair;
	protected String sheetName;
	public static final String CHECK_REQUEST = "REQUEST";
	public static final String CHECK_RESPONSE = "RESPONSE";
	public static final String STR_COUNTER_RESPONSE = "COUNTER RESPONSE";
	public static final String SET_SWITCH_CASE = "switch-case";
	public static final String SET_CONSTANT = "constant";
	public static final String SET_SIMPLE = "simple";
	protected static final String DOT = FixMLConfigurationElement.DOT;
	protected static final String ACCT_TYP_COD_FROM_GRP = "acctTypCodFromGrp";
	protected static final String ACCT_TYP_COD_TO_GRP = "acctTypCodToGrp";
	protected static final String ACCT_TYP_COD_GRP = "acctTypCodGrp";
	/**
	 * 
	 */
	public static final String STR_NA = "NA";
	protected List<FixMLConfigurationElement> selectors;
	protected Map<String, FixMLConfigurationElement> structToBOMappings;

	protected abstract void populateMappingConfigData();

	/**
	 * 
	 */
	public MappingsGenerator(String sheetName, List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
		this.mappingsPair = mappingsPair;
		this.selectors = selectors;
		this.sheetName = sheetName;
		populateMappingConfigData();
		structToBOMappings = createStructToBOMappings();
	}

	public abstract Mappings createMappings();

	/**
	 * Creates Struct TO BO Mappings.
	 * 
	 * @param fixToBO
	 * @return
	 */
	protected Map<String, FixMLConfigurationElement> createStructToBOMappings() {
		Map<String, FixMLConfigurationElement> cToBOMappings = new HashMap();
		for (Map value : mappingConfigData.values()) {
			for (Entry entry : (Set<Entry>) value.entrySet()) {
				String structureInfo = (String) ((entry.getKey() instanceof String) ? entry.getKey() : entry.getValue());
				FixMLConfigurationElement fixmlElement = (FixMLConfigurationElement) ((entry.getKey() instanceof String) ? entry
						.getValue()
						: entry.getKey());
				cToBOMappings.put(structureInfo, fixmlElement);
			}
		}
		return cToBOMappings;
	}

	/**
	 * Remove brackets and the stuff within it from a string.
	 * 
	 * @param key
	 * @return
	 */
	public static String removeBracketEnclosure(String key) {
		return removeBracketEnclosure(key,"(",")");
	}

	public static String removeBracketEnclosure(String key,String openingBracket, String closingBracket) {
		if (key.contains(openingBracket)) {
			String[] temp = key.split("\\"+openingBracket);
			String temp2 = temp[1].split("\\"+closingBracket)[1];
			key = temp[0] + temp2;
		}
		return key;
	}
	/**
	 * Creates the selectors object. Gets the column name and modifies it into
	 * requires format.
	 * 
	 * @return
	 */
	protected Selectors createSelectors(List<FixMLConfigurationElement> fixmlTagTypes) {
		Selectors selectors = objFactory.createSelectors();
		selectors.getSelector().addAll(createSelector(fixmlTagTypes));
		return selectors;
	}

	/**
	 * Creates selectors object under mappings. Contains the Metadata.
	 * 
	 * @param columnName
	 * @param length
	 * @return
	 */
	private List<Selector> createSelector(List<FixMLConfigurationElement> fixmlTagTypes) {
		List<Selector> selectors = new ArrayList();
		int selecterCounter = 0;
		for (FixMLConfigurationElement fixmlTag : fixmlTagTypes) {
			Selector selector = objFactory.createSelector();
			selector.setSrc(fixmlTag.getConstantFixmlStr());
			selector.setDataType(fixmlTag.getTargetDataType());
			if (selecterCounter++ > 0) {
				selector.setPreOperator("AND");
			}
			selectors.add(selector);
		}
		return selectors;
	}

	/**
	 * @param fixMLConfigurationElement
	 * @param preAppendString
	 * @return
	 */
	protected String getFixStr(FixMLConfigurationElement fixMLConfigurationElement, boolean preAppendString) {
		return (preAppendString) ? fixMLConfigurationElement.getPreAppendedFixmlStr() : fixMLConfigurationElement
				.getFixmlStr();
	}

	/**
	 * @param structNavPath
	 * @param bracketType TODO
	 * @return
	 */
	protected String partBeforeBracket(String structNavPath) {
		String str=structNavPath;
		if(structNavPath.contains("{")){
			str = structNavPath.substring(0, structNavPath.indexOf("{"));
		}if(structNavPath.contains("}[")){
			str= str+ structNavPath.substring(structNavPath.indexOf("["),structNavPath.indexOf("]")+1 );
		}
		return str;
	}
	
	/**
	 * @param structNavPath
	 * @param bracketType TODO
	 * @return
	 */
	protected String partAfterBracket(String structNavPath) {
		//by default we take { as the bracket in question.
		return partAfterBracket(structNavPath,"}");
	}
	
	protected String partAfterBracket(String structNavPath, String bracketType) {
		String str=structNavPath;
		if(structNavPath.contains(bracketType)){
			str = structNavPath.substring(structNavPath.indexOf(bracketType)+1);
		}
		return str;
	}
	
	
	protected String partAfterBracketAndDot(String structNavPath) {
		String partAfterBracketAndDot ="";
		if(structNavPath.contains("}[")){
			partAfterBracketAndDot = partAfterBracket(structNavPath,"]");
		}else{
			partAfterBracketAndDot = partAfterBracket(structNavPath);
		}
		partAfterBracketAndDot = trimStartingDot(partAfterBracketAndDot);
		return partAfterBracketAndDot ;
	}

	protected String trimStartingDot(String partAfterBracketAndDot) {
		if(null==partAfterBracketAndDot){
			return null;
		}
		if(partAfterBracketAndDot.startsWith(FixMLConfigurationElement.DOT)){
			partAfterBracketAndDot = partAfterBracketAndDot.substring(1);
		}
		return partAfterBracketAndDot;
	}
	
	/**
	 * @param structToBOMappings
	 * @param mappingsToRemoveLater
	 */
	protected void removeKeysFromMap(Map<String, FixMLConfigurationElement> structToBOMappings,
			Set<String> mappingsToRemoveLater) {
		for (String removeKey : mappingsToRemoveLater) {
			structToBOMappings.remove(removeKey);
		}
	}
}
