package com.headstrong.fusion.configGenerator.commObjs;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.headstrong.fusion.configGenerator.core.eurex.MappingsGenerator;

/**
 * Works on Eurex specific data.
 * 
 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser
 * @author satyaukv
 */
public class DTOParserForEurex implements DTOParser {
	List<Map> typeRawData;

	Map headerMap = new LinkedHashMap();

	Map bodyMap = new LinkedHashMap();

	Map footerMap = new LinkedHashMap();

	Map seqNoMap = new LinkedHashMap();
	
	Map errorMap = new LinkedHashMap();

	public static final String FIXML_STR = "FIXML";
	private static final String COL_FIELD_NAME = "Field";
	private static final String COL_STRUCTURE = "Structure";
	private static final String COL_SUB_STRUCTURE = "sub";
	private static final String DATA_TYPE = "FIXML Data Type";
	private static final String USAGE = "Usage";
	private static final String FORMAT = "Format";
	/**
	 * Construct this object with raw data. Constructor parses the input data
	 * list.
	 * 
	 * @param typeRawData
	 */
	public DTOParserForEurex(List<Map> typeRawData) {
		super();
		this.typeRawData = typeRawData;
		if (typeRawData.size() > 0)
			parseList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser#getHeader()
	 */
	public Map getHeader() {
		return headerMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser#getBody()
	 */
	public Map getBody() {
		// TODO Auto-generated method stub
		return bodyMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser#getFooter()
	 */
	public Map getFooter() {
		// TODO Auto-generated method stub
		return footerMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser#getSeqNo()
	 */
	public Map getSeqNo() {
		return seqNoMap;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.configGenerator.commObjs.DTOParser#getSeqNo()
	 */
	public Map getErrorStruct() {
		return errorMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.headstrong.fusion.configGenerator.commObjs.DTOParser#getMetaData()
	 */
	public Map getMetaData() {
		return map;
	}

	Map map = null;

	/**
	 * Method parses the raw data list and creates sub maps.
	 */
	private void parseList() {
		Map rowData ;

		for (int rowNumber = 0; rowNumber < typeRawData.size(); rowNumber++) {
			rowData = typeRawData.get(rowNumber);
			rowData.put(COL_SUB_STRUCTURE, null);
			// Introduce an artificial column to hold the substructure to which
			// the current field belongs.
			String subStruct = null;
			if (rowData.get(COL_STRUCTURE) == null) {
				if (rowNumber > 0) {
					subStruct = (String) (typeRawData.get(rowNumber - 1))
							.get(COL_SUB_STRUCTURE);
					rowData.put(COL_SUB_STRUCTURE, subStruct);
					String previousRowStructure = (String) (typeRawData
							.get(rowNumber - 1)).get(COL_STRUCTURE);
					rowData.put(COL_STRUCTURE, previousRowStructure);
				}
			}

			if (rowData.get("Data") == null) {
				// If Data Type is null then set the substructure
				subStruct = (String) rowData.get(COL_FIELD_NAME);
				rowData.put(COL_SUB_STRUCTURE, subStruct);
			}
			String dataTypeString = (String) rowData.get(DATA_TYPE);
			String validationString = (String) rowData.get(USAGE);
			String targetDataSize = (String) rowData.get(FORMAT);
			List<FixMLConfigurationElement> fixMLTagtypes = null;
			if (rowData.get(FIXML_STR) != null) {
				String fixMLTags = ((String) rowData.get(FIXML_STR));
				fixMLTagtypes = FixMLConfigurationElement.getFixMLTagTypes(fixMLTags,
						dataTypeString, validationString, targetDataSize);
			}else if(null!=targetDataSize && null==rowData.get(FIXML_STR)) {
				String fixMLTags = MappingsGenerator.STR_NA;
				fixMLTagtypes = FixMLConfigurationElement.getFixMLTagTypes(fixMLTags,
						dataTypeString, validationString, targetDataSize);
			}
			rowData.put(FIXML_STR, fixMLTagtypes);
			String strutName = rowData.get(COL_STRUCTURE).toString();
			String key = null;
			if (rowData.get(COL_SUB_STRUCTURE) == null) {
				key = extractStructName(strutName) + "."
						+ rowData.get(COL_FIELD_NAME);
			} else {
				key = extractStructName(strutName) + "."
						+ rowData.get(COL_SUB_STRUCTURE) + "."
						+ rowData.get(COL_FIELD_NAME);
			}

			key = key.trim();
			if (key.startsWith(".")) {
				key = key.substring(1, key.length());
			} 
			/*if(key.contains("(")) {
				String[] temp = key.split("\\(");
				String temp2 = temp[1].split("\\)")[1];
				key = temp[0]+temp2;
			}*/

			if (strutName.contains("seqNo")) {
				map = seqNoMap;
			} else if (strutName.contains("header")) {
				map = headerMap;
			} else if (strutName.contains("basic")) {
				map = bodyMap;
			} else if (strutName.contains("extension")) {
				map = footerMap;
			}
			else {
				map=errorMap;
			}

			if (rowData.get("Data") != null && fixMLTagtypes != null && !fixMLTagtypes.isEmpty()) {
				// Raw data is put in as the metadata.
				map.put(key, rowData.get(FIXML_STR));
			}

		}
	}

	/**
	 * Extract the structName from stuff like "header (dataHeaderT)" --> will
	 * return "header"
	 * 
	 * @param strutName
	 * @return
	 */
	private String extractStructName(String strutName) {
		return strutName.substring(0,strutName.indexOf("(") ).trim();
	}

	
}
