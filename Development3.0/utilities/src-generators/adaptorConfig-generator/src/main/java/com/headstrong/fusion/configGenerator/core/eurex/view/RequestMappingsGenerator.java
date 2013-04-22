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
 * $Id: RequestViewGenerator.java
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
public class RequestMappingsGenerator extends MappingsGenerator {

	/**
	 * @param mappingsPair
	 */
	public RequestMappingsGenerator(String sheetName, List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
		super(sheetName, mappingsPair, selectors);
		structToBOMappings = createStructToBOMappings();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator#
	 * createMappings(java.util.Map)
	 */
	@Override
	public Mappings createMappings() {
		Mappings mappings = objFactory.createMappings();
		mappings.setSelectors(createSelectors(this.selectors));
		mappings.setArrayMappings(populateArrayMappings());
		mappings.setFixmlClassName(queryFixShortName());
		mappings.getMap().addAll(populateRequestMaps());
		return mappings;
	}

	/**
	 * @return
	 */
	private ArrayMappings populateArrayMappings() {
		Map<String, FixMLConfigurationElement> structToBOMappings = this.structToBOMappings;
		Set<String> mappingsToRemoveLater = new HashSet();
		ArrayMappings arrayMappings = objFactory.createArrayMappings();
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			if (null!=entry.getValue().getFixmlStr() && entry.getValue().getFixmlStr().contains("{=")) {
				mappingsToRemoveLater.add(entry.getKey());
				String repeatingElementName = partBeforeBracket(entry.getValue().getPreAppendedFixmlStr());
				ArrayMapping arrayMapping = objFactory.findOrCreateArrayMappings(arrayMappings, null, repeatingElementName);
				TargetObj targetObj = objFactory.findOrCreateTargetObj(arrayMapping, null, partBeforeBracket(entry.getKey()));
				String structPath = partAfterBracketAndDot(entry.getKey());
				FixMLConfigurationElement fixmMLConfigurationElement = entry.getValue();
				Maps maps = createRequestMaps(structPath, fixmMLConfigurationElement,partAfterBracketAndDot(entry.getValue().getFixmlStr()));
				targetObj.getMap().add(maps);
			}
		}
		removeKeysFromMap(structToBOMappings, mappingsToRemoveLater);
		return (mappingsToRemoveLater.isEmpty())?null:arrayMappings;
	}

	/**
	 * @param fixShortName
	 * @return
	 */
	private String queryFixShortName() {
		String fixShortName = null;
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			if ((null != entry.getKey() && null != entry.getValue().getFixmlStr())
					&& !entry.getValue().getFixmlStr().equals(STR_NA)) {
				fixShortName = entry.getValue().getFixmlShortName().split("\\[")[0];
				break;
			}
		}
		return fixShortName;
	}

	/**
	 * @param mappingList
	 */
	private List populateRequestMaps() {
		List mappingList = new ArrayList();
		for (Entry<String, FixMLConfigurationElement> entry : structToBOMappings.entrySet()) {
			mappingList.add(createRequestMaps(entry.getKey(), entry.getValue(), true));
		}
		return mappingList;
	}

	/**
	 * Creates the Map object under mappings(similar to Field under binding)
	 * 
	 * @param key
	 * @param fixMLConfig
	 * @return
	 */
	private Maps createRequestMaps(String key, FixMLConfigurationElement fixMLConfig, boolean shouldPreAppend) {
		String preAppendedFixStr =super.trimStartingDot(getFixStr(fixMLConfig, shouldPreAppend));
		return createRequestMaps(key, fixMLConfig, preAppendedFixStr);
	}

	private Maps createRequestMaps(String key,
			FixMLConfigurationElement fixMLConfig, String preAppendedFixStr) {
		Maps map = objFactory.createMaps();
		key = removeBracketEnclosure(key,"{","}");
		map.setTarget(key);
		map.setValidationType(fixMLConfig.getValidationType());
		map.setTargetDataSize(fixMLConfig.getTargetDataSize());
		if (null != fixMLConfig.getCaseClause()) {
			map.setType(SET_SWITCH_CASE);
			map.setSwitch(objFactory.createSwitch(fixMLConfig.getCaseClause(), preAppendedFixStr, CHECK_REQUEST));
		} else if (null == fixMLConfig.getConstantValue()) {
			map.setType(SET_SIMPLE);
			map.setSrc(preAppendedFixStr);
		} else if (null != fixMLConfig.getConstantValue()) {
			map.setType(SET_CONSTANT);
			map.setTargetValue(fixMLConfig.getConstantValue());
		}
		return map;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seecom.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator#
	 * setMappingConfigurationData()
	 */
	@Override
	protected void populateMappingConfigData() {
		super.mappingConfigData = mappingsPair.get(0);
	}

}
