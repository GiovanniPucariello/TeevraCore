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
 * $Id: ResponseViewObjectGenerator.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Dec 9, 2009 
 */

package com.headstrong.fusion.configGenerator.core.eurex.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ArrayMapping;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ArrayMappings;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.TargetObj;

/**
 * @author VGarde
 * 
 */
public class ResponseMappingsGenerator extends MappingsGenerator {

	
	/**
	 * @param mappingsPair
	 */
	public ResponseMappingsGenerator(String sheetName, List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
		super(sheetName, mappingsPair, selectors);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator#
	 * createMappings()
	 */
	@Override
	public Mappings createMappings() {
		Mappings mappings = objFactory.createMappings();
		mappings.setArrayMappings(createArrayMappings());
		ArrayMappings accTypCdGrpArrayMappings = createAccTypCdGrpArrayMappings();
		if(null!=accTypCdGrpArrayMappings && null!=accTypCdGrpArrayMappings.getArrayMapping() ){
			if( null!=mappings.getArrayMappings()) {
				mappings.getArrayMappings().getArrayMapping().addAll(accTypCdGrpArrayMappings.getArrayMapping());
			} else {
				mappings.setArrayMappings(accTypCdGrpArrayMappings);
			}
			
		}
		mappings.setFixmlClassName(extractFixmlShortName());
		mappings.getMap().addAll(createMappingsList());
		return mappings;
	}


	/**
	 * @param structToBOMappings
	 * @return
	 */
	protected String extractFixmlShortName() {
		String fixShortName = null;
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			// constMapsList.add(constantMapping);
			if ((null != entry.getValue() && null != entry.getValue().getFixmlStr())
					&& !entry.getValue().getFixmlStr().equals(STR_NA)) {
				fixShortName = entry.getValue().getFixmlShortName().split("\\{")[0];
				break;
			}
		}
		return fixShortName;
	}

	/**
	 * @param structToBOMappings
	 * @return
	 */
	private List createMappingsList() {
		List mappingList = new ArrayList();
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			// check for list structures
			Maps mapping = createResponseMaps(entry.getKey(), entry.getValue(), true);
			if(SET_CONSTANT.equals(mapping.getType())){
				mapping.setSrc(entry.getKey());
				if(STR_NA.equals(mapping.getTarget())){
					mapping.setSrc(super.removeBracketEnclosure(mapping.getSrc(), "{", "}"));
				}
			}
			mappingList.add(mapping);
		}
		return mappingList;
	}

	
	
	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator#
	 * setMappingConfigurationData()
	 */
	@Override
	protected void populateMappingConfigData() {
		super.mappingConfigData = mappingsPair.get(1);

	}

	/**
	 * @param cToBOMappings
	 * @return
	 */
	protected ArrayMappings createAccTypCdGrpArrayMappings() {
		ArrayMappings arrayMappings = objFactory.createArrayMappings();
	
		Set<String> mapsToRemove = new HashSet();
	
		boolean handlingReqd = false;
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			String src = entry.getKey();
			if (null == src) {
				continue;
			}
			Integer indexOfSrc = -1;
			if (src.indexOf(ACCT_TYP_COD_GRP) != -1) {
				indexOfSrc = src.indexOf(ACCT_TYP_COD_GRP) + ACCT_TYP_COD_GRP.length();
			} else if (src.indexOf(ACCT_TYP_COD_TO_GRP) != -1) {
				indexOfSrc = src.indexOf(ACCT_TYP_COD_TO_GRP) + ACCT_TYP_COD_TO_GRP.length();
			} else if (src.indexOf(ACCT_TYP_COD_FROM_GRP) != -1) {
				indexOfSrc = src.indexOf(ACCT_TYP_COD_FROM_GRP) + ACCT_TYP_COD_FROM_GRP.length();
			} else {
				continue;
			}
			handlingReqd = true;
			mapsToRemove.add(src);
			FixMLConfigurationElement fixElement = entry.getValue();
			String target = fixElement.getPreAppendedFixmlStr();
			int lastDot = target.lastIndexOf(DOT);
			String arrayMappingTarget = target.substring(0, lastDot);
			String arrayMappingSource = src.substring(0, indexOfSrc);
			ArrayMapping arrayMapping = objFactory.findOrCreateArrayMappings(arrayMappings, null, arrayMappingSource);
			TargetObj targetObj = objFactory.findOrCreateTargetObj(arrayMapping, fixElement.getFixmlClassname(), arrayMappingTarget);
			String arrayMapTargetAttribute = target.substring(lastDot + 1);
			String arrayMapSrcAttribute = src.substring(indexOfSrc + 1);
			Maps newMaps= objFactory.createMaps();
			newMaps.populateResponseMap(arrayMapSrcAttribute, arrayMapTargetAttribute, fixElement, this, false);//(arrayMapSrcAttribute, fixElement, false);
			targetObj.getMap().add(newMaps);
		}
		removeKeysFromMap(structToBOMappings, mapsToRemove);
		return (handlingReqd) ? arrayMappings : null;
	}

	/**
	 * Creates the configuration for List to List mappings.
	 * 
	 * @param structToBOMappings
	 *            - will be modified.
	 * @return
	 */
	protected ArrayMappings createArrayMappings() {
		// Create an XML arrayMappings object from factory.
		ArrayMappings arrayMappings = objFactory.createArrayMappings();
		Set<String> mappingsToRemoveLater = new HashSet();
		for (Entry<String, FixMLConfigurationElement> structToBOEntry : structToBOMappings.entrySet()) {
			String structNavPath = structToBOEntry.getKey();
			FixMLConfigurationElement fixmlConfig = structToBOEntry.getValue();
			if (structNavPath.contains("{=") && !STR_NA.equals(fixmlConfig.getFixmlStr())
					&& null != fixmlConfig.getFixmlStr()) {
				ArrayMapping arrayMapping = objFactory.findOrCreateArrayMappings(arrayMappings, structNavPath, partBeforeBracket(structNavPath));
	            String fixmlRepeatObjPath = partBeforeBracket(fixmlConfig.getPreAppendedFixmlStr());
	        	TargetObj targetObj = objFactory.findOrCreateTargetObj(arrayMapping, fixmlConfig.getFixmlClassname(), fixmlRepeatObjPath);
				String source = partAfterBracketAndDot(structNavPath);
				Maps map = objFactory.createMaps();
				map.populateResponseMap(source, partAfterBracketAndDot(fixmlConfig.getFixmlStr()), fixmlConfig, this, false);
				targetObj.getMap().add(map);
				mappingsToRemoveLater.add(structNavPath);
			}
		}
		removeKeysFromMap(structToBOMappings, mappingsToRemoveLater);
		return (mappingsToRemoveLater.isEmpty())?null:arrayMappings;
	}

	/**
	 * Creates the Map object under mappings(similar to Field under binding)
	 * 
	 * @param src
	 * @param shouldPreappend
	 *            TODO
	 * @return
	 */
	protected Maps createResponseMaps(String src, FixMLConfigurationElement fixMLConfigurationElement, boolean shouldPreappend) {
		String fixStr = getFixStr(fixMLConfigurationElement, shouldPreappend);
		if (null == fixStr) {
			fixStr = STR_NA;
		}
		Maps map = objFactory.createMaps();
		map.populateResponseMap(src, fixStr, fixMLConfigurationElement,
				this, shouldPreappend);
		return map;
	}
}
