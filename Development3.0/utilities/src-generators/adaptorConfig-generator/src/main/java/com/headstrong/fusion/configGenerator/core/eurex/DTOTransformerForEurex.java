package com.headstrong.fusion.configGenerator.core.eurex;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.commObjs.MessageDTO;
import com.headstrong.fusion.configGenerator.core.DTOTransformer;

/**
 * Works on Eurex specific data.
 * @see com.headstrong.fusion.configGenerator.Core.DTOTransformer
 * @author satyaukv
 */

public class DTOTransformerForEurex implements DTOTransformer {
	MessageDTO dto;

	Map<String, Map> fixToBO = new LinkedHashMap<String, Map>();

	Map<String, Map> boToC = new LinkedHashMap<String, Map>();

	Map<String, Map> cToBO = new LinkedHashMap<String, Map>();

	Map<String, Map> boToFIX = new LinkedHashMap<String, Map>();

	List<Map<String, Map>> response = new LinkedList<Map<String, Map>>();

	List<Map<String, Map>> request = new LinkedList<Map<String, Map>>();

	List<Map<String, Map>> finalOutput = new LinkedList<Map<String, Map>>();

	Map<String, Map> rawMessageData = new LinkedHashMap();

	/* (non-Javadoc)
	 * @see com.headstrong.fusion.configGenerator.Core.DTOTransformer#getObjects()
	 */
	public List<Map<String, Map>> getObjects(String objType) {
		finalOutput = null;
		if (objType.contains("REQUEST")) {
			finalOutput = createRequestMaps();
		} else if (objType.contains("RESPONSE")) {
			finalOutput = createResponseMaps();
		}
		return finalOutput;

	}

	/**
	 * constructs this Object with an MessageDto type object
	 * Constructor assigns the value of the instance variable dto with input parameter value.
	 * @param dto
	 */
	public DTOTransformerForEurex(MessageDTO dto) {
		super();
		this.dto = dto;
	}

	/**
	 * returns a list of Maps for Request
	 * @return List of FIXMLtoBO and BOtoC Maps. Each Map is a key value pair of 
	 * "Header" and a Map of key  value pair of Field Name and FIXMLTags
	 */
	private List<Map<String, Map>> createRequestMaps() {

		rawMessageData.put("SeqNo", dto.getSeqNo());
		rawMessageData.put("Header", dto.getHeader());
		rawMessageData.put("Base", dto.getBody());
		rawMessageData.put("Footer",  dto.getFooter());
		

		
		// Looping through each section of table i.e header, footer, base, SeqNo
		for(Entry<String, Map> beforeTransformationMapEntry: rawMessageData.entrySet()) {
			String strutType = beforeTransformationMapEntry.getKey();
			Map rawData = beforeTransformationMapEntry.getValue();
			Map tempFIXBO = new LinkedHashMap<String, String>();
			Map tempBOC = new LinkedHashMap<String, String>();

			//Looping through each row inside the section for a table
			for(Entry<String, List<FixMLConfigurationElement>> rawDataEntry: ((Set<Entry>)rawData.entrySet())) {
				String keyFieldName = rawDataEntry.getKey();
				List<FixMLConfigurationElement> valueFixmlTags = rawDataEntry.getValue();
				// single FixML tag column
				FixMLConfigurationElement baselinedTagType =valueFixmlTags.get(0);
				if(valueFixmlTags.size()>1){
					baselinedTagType.changeToConditionalString(valueFixmlTags);
				}
				tempFIXBO.put(baselinedTagType, keyFieldName);
				tempBOC.put(keyFieldName, keyFieldName);

			}
			fixToBO.put(strutType, tempFIXBO);
			boToC.put(strutType, tempBOC);

		}

		request.add(fixToBO);
		request.add(boToC);

		return request;
	}

	/**
	 * returns a list of Maps for Response
	 * @return List of CtoBO and BOtoFIXML Maps. Each Map is a key value pair of 
	 * "Header" and a Map of key  value pair of Field Name and FIXMLTags
	 */

	private List<Map<String, Map>> createResponseMaps() {

		Map tempHeader = dto.getHeader();
		Map tempBody = dto.getBody();
		Map tempFooter = dto.getFooter();
		Map tempSeqNo = dto.getSeqNo();
		Map tempErrorStruct = dto.getErrorStruct();

		rawMessageData.put("SeqNo", tempSeqNo);
		rawMessageData.put("Header", tempHeader);
		rawMessageData.put("Base", tempBody);
		rawMessageData.put("Footer", tempFooter);
		rawMessageData.put("Error", tempErrorStruct);
		

		Iterator<String> iterator = rawMessageData.keySet().iterator();
		// Looping through each section of table i.e header, footer, base, SeqNo
		while (iterator.hasNext()) {

			Map tempBOFIX = new LinkedHashMap<String, String>();
			Map tempCBO = new LinkedHashMap<String, String>();

			String strutType = iterator.next();
			Map<String, FixMLConfigurationElement> temp = (Map) rawMessageData.get(strutType);
			Iterator typeIterator = temp.keySet().iterator();
			//Looping through each row inside the section for a table
			for(Entry<String, FixMLConfigurationElement> e: temp.entrySet() ){
				String keyFieldName = e.getKey();
				List<FixMLConfigurationElement> valueFixmlTags = (List<FixMLConfigurationElement>)e.getValue();
				
				// "!" mark is used instead of "/n" i.e whenever there are two or more conditions(lines) in a
				// single FixML tag column
				FixMLConfigurationElement baselinedTagType =valueFixmlTags.get(0);
				if(valueFixmlTags.size()>1){
					baselinedTagType.changeToConditionalString(valueFixmlTags);
				}
				tempCBO.put(keyFieldName, keyFieldName);
				tempBOFIX.put(keyFieldName, baselinedTagType);
			}
			cToBO.put(strutType, tempCBO);
			boToFIX.put(strutType, tempBOFIX);

		}
		response.add(cToBO);
		response.add(boToFIX);
		return response;
	}

}
