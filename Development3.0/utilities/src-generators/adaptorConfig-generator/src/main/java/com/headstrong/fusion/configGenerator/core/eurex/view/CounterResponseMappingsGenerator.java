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
 * $Id: CounterResponseViewObjectGenerator.java
 * $Revision: 
 * $Author: VGarde
 * $DateTime: Dec 9, 2009 
 */

package com.headstrong.fusion.configGenerator.core.eurex.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Maps;

/**
 * @author VGarde
 * 
 */
public class CounterResponseMappingsGenerator extends ResponseMappingsGenerator {

	private static final String DOT = FixMLConfigurationElement.DOT;
	/**
	 * @param mappingsPair
	 */
	public CounterResponseMappingsGenerator(String sheetName, List<Map> mappingsPair,
			List<FixMLConfigurationElement> selectors) {
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
		
		mappings.getMap().addAll(populateSelectorData());
		Mappings subMappings = super.createMappings();
		mappings.setArrayMappings(subMappings.getArrayMappings());
		mappings.getMap().addAll(subMappings.getMap());
        mappings.setFixmlClassName(subMappings.getFixmlClassName());
		return mappings;
	}

	/**
	 */
	private List<? extends Maps> populateSelectorData() {
		List constMapsList = new ArrayList();
		for (FixMLConfigurationElement fixmlTag : this.selectors) {
			Maps counterResponseconstantMapping = createCounterResponseConstantMaps(fixmlTag);
			constMapsList.add(counterResponseconstantMapping);
		}
		return constMapsList;
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

	private Maps createCounterResponseConstantMaps(FixMLConfigurationElement fixmlTag) {
		String[] fixmlval = extractConstTargetValue(fixmlTag);
		Maps map = objFactory.createMaps();
		map.setType(SET_CONSTANT);
		map.setTargetDataType(fixmlTag.getTargetDataType());
		map.setTarget(fixmlval[0]);
		map.setTargetValue(fixmlval[1].trim());
		return map;
	}

	/**
	 * @param fixmlTag
	 * @return
	 */
	private String[] extractConstTargetValue(FixMLConfigurationElement fixmlTag) {
		String fixmlTagStr = fixmlTag.getFixmlStr();
		if (null != fixmlTag.getConstantFixmlStr()) {
			fixmlTagStr = fixmlTag.getConstantFixmlStr();
		}
		fixmlTagStr = fixmlTagStr.split("\\,")[0];
		String[] fixmlval = fixmlTagStr.split("\\=");
		return fixmlval;
	}

}
