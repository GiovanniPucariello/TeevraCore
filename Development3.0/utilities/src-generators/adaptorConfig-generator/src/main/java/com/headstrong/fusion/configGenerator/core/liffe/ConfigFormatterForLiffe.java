package com.headstrong.fusion.configGenerator.core.liffe;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;

import com.headstrong.fusion.configGenerator.core.DTOTransformer;
import com.headstrong.fusion.configGenerator.core.DTOTransformerForLiffe;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForLiffe.QUERY_TYPES_LIFFE;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Binding;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Case;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Configuration;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Field;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Switch;

public class ConfigFormatterForLiffe {

	public ConfigFormatterForLiffe(Properties p) {
		GeneratorProcessorForLiffe.props = p;
	}

	/**
	 * This method is used to generate the configuration file for formatter.
	 * 
	 * @param sheetName
	 * @param sheetDataFactory
	 * @param rootTag
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	public void generateConfigForFormatter(String sheetName,
			TableDataFactory sheetDataFactory) throws JAXBException,
			PropertyException {
		Field field;
		Maps map;
		// For the output xml file name, to get sheetName without the '$'
		String sName = sheetName.substring(0, sheetName.length() - 1);
		for (QUERY_TYPES_LIFFE q : QUERY_TYPES_LIFFE.values()) {
			Configuration configuration = new Configuration();
			Binding binding = new Binding();
			Mappings mapping = new Mappings();
			List<Map> mapList = sheetDataFactory.getQueryData(q.getStr());
			if (mapList != null) {
				DTOTransformer transformer = new DTOTransformerForLiffe(mapList);
				List<Map> sample = transformer.getObjects(q.getStr());
				String subTableName = q.getVal();
				
				map = new Maps();
				map.setSrc(q.getVal());
				map.setTarget(Constants.RECORD_TYPE);
				map.setType(Constants.CNST);
				mapping.getMap().add(map);
				// setting some map properties for 0000 and 0004 message type
				if (subTableName.equals("0000")) {
					map = new Maps();
					map.setSrc("83");
					map.setTarget(Constants.TRAMP_VERSION);
					map.setType(Constants.CNST);
					mapping.getMap().add(map);
					map = new Maps();
					map.setSrc(sName);
					map.setTarget(Constants.MESSAGE_TYPE);
					map.setType(Constants.CNST);
					mapping.getMap().add(map);
				}
				if (subTableName.equals("0004")) {
					map = new Maps();
					map.setSrc("L");
					map.setTarget(Constants.EXCHANGE_CODE);
					map.setType(Constants.CNST);
					mapping.getMap().add(map);
				}
				for (int i = 0; i < sample.size(); i++) {

					field = new Field();
					field.setStart((sample.get(i)).get(Constants.FROM)
							.toString());
					field.setEnd((sample.get(i)).get(Constants.TO).toString());
					field.setName((sample.get(i)).get(Constants.FIELD)
							.toString().trim());
					String strType = "";
					if (sample.get(i).get(Constants.DATA_TYPE) != null) {
						strType = sample.get(i).get(Constants.DATA_TYPE)
								.toString();
					}

					if (!((strType.equals("")) || (strType.trim()
							.equalsIgnoreCase(Constants.STR)))) {
						field.setPrintType(strType.trim());
					}
					binding.getField().add(field);
					String strFieldName = sample.get(i).get(Constants.FIELD)
							.toString();
					strFieldName = strFieldName.trim();
					map = new Maps();
					String strFormat = sample.get(i).get(Constants.FORMAT)
							.toString();
					strFormat = strFormat.toLowerCase();
					if (sample.get(i).containsKey(Constants.FIXML)) {
						if (strFormat.contains(Constants.DATE)) {
							map.setPrintType(Constants.CALENDAR_DATE);
						}
						if (strFormat.contains(Constants.TIME)) {
							map.setPrintType(Constants.CALENDAR_TIME);
						}

						map.setType(Constants.SIMPLE);
						map.setTarget((sample.get(i)).get(Constants.FIELD)
								.toString());

						String strFixml = sample.get(i).get(Constants.FIXML)
								.toString();
						if (strFixml.contains(Constants.MULTI_LIST)) {
							mappingForFixmlMultiList(mapping, strFieldName,
									strFixml, strType);
						} else if (strFixml.contains(Constants.LIST)
								&& strFixml.contains(Constants.HASH)) {
							Switch strswitch = mappingForFixmlList(strFixml,
									strFieldName, sName, q);
							mapping.getSwitch().add(strswitch);
						} else if (strFixml
								.contains(Constants.BACK_SLASH_AT_RATE)
								&& (strFixml.contains(Constants.HASH))) {
							mappingForFixmlPty(map, sName, mapping, strFixml, q);
						} else if (strFixml
								.contains(Constants.BACK_SLASH_AT_RATE)) {
							formatFixmlForTag(map, sName, mapping, strFixml, q);
						} else {
							if (q
									.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)) {
								strFixml = strFixml.substring(strFixml
										.indexOf(Constants.AT_RATE) + 1);
								map.setSrc(strFixml);

							} else {
								strFixml = strFixml.replace(Constants.AT_RATE,
										Constants.DOT);
								map.setSrc(Constants.MESSAGE_VALUE + strFixml);
							}
							mapping.getMap().add(map);
						}
					}

				}
				GeneratorProcessorForLiffe.generateConfig(sName, q, configuration, binding, mapping);
			}
		}
	}

	/**
	 * This method is used to generate the mapping for Multi List for formatter
	 * 
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForFixmlMultiList(Mappings mapping, String strFieldName,
			String strFixml, String strType) {
		Maps map;
		Maps map1;
		Maps map2;
		Switch strSwitch = new Switch();
		String[] elements = strFixml.split(Constants.HASH);
		String strTarget = elements[0].trim();
		strTarget = strTarget
				.replace(Constants.BACK_SLASH_SPACE, Constants.DOT).trim();
		strTarget = strTarget.replace(Constants.BACK_SLASH, Constants.DOT);
		strTarget = strTarget.replace(Constants.AT_RATE, "");
		strSwitch.setExpr("$" + Constants.MESSAGE_VALUE_DOT + strTarget);
		Case strCase = null;
		Case OPTCase = new Case();

		boolean OPTVisited = false;
		Case strCase1 = null;
		Case strCase2 = null;
		// setting case value as OPT for opt type
		OPTCase.setValue("OPT");
		String str = elements[1].trim();
		str = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
		String[] strDouble = str.split(",");
		Switch strSwitch1 = new Switch();

		Switch strSwitch2 = new Switch();
		Case strCase3 = new Case();
		// setting case value as default if case is opt and value is not 5 nor 7
		strCase3.setValue("default");

		for (int b = 0; b < strDouble.length; b++) {
			String caseValue = strDouble[b].substring(0,
					strDouble[b].indexOf("=")).trim();

			String mapSource = "";
			String listValue = strDouble[b].substring(
					strDouble[b].indexOf("=") + 1).trim();
			if (listValue.contains("[")) {
				mapSource = listValue.substring(0, listValue.indexOf("["));
			} else {
				mapSource = listValue;
			}
			// setting all value apart from case value OPT
			if (!caseValue.equalsIgnoreCase("OPT")) {
				if (OPTVisited) {
					if (strCase3 != null) {
						strCase3.getSwitch().add(strSwitch2);
						strSwitch1.getCase().add(strCase3);
					}
					OPTCase.getSwitch().add(strSwitch1);
					strSwitch.getCase().add(OPTCase);

					OPTVisited = false;

				}
				strCase = new Case();
				map = new Maps();
				strCase.setValue(caseValue);
				map.setType(Constants.CNST);
				map.setSrc(mapSource);
				map.setTarget(strFieldName);
				if (!strType.equalsIgnoreCase(Constants.STR)) {
					map.setParseType(strType);
				}
				strCase.getMap().add(map);
			}
			if (listValue.contains("[")) {
				OPTVisited = true;
				String tempString = listValue.substring(
						listValue.indexOf("[") + 1, listValue.indexOf("]"))
						.trim();
				String targetString = tempString.substring(0,
						tempString.indexOf("=")).trim();
				targetString = targetString.replace(Constants.BACK_SLASH,
						Constants.DOT);
				targetString = targetString.replace(Constants.AT_RATE, "");
				String value = tempString.substring(
						tempString.indexOf(Constants.EQUALS) + 1).trim();
				String[] split = value.split("/\\$");
				String val = split[0];
				if ((caseValue.equalsIgnoreCase("OPT"))) {
					strSwitch1.setExpr("$" + "message.value.Instrmt.Prod");
					if (val.equals("5") || val.equals("7")) {
						strCase1 = new Case();
						strCase1.setValue(val);
						map1 = new Maps();
						map1.setType(Constants.CNST);
						map1.setSrc(mapSource);
						map1.setTarget(strFieldName);
						strCase1.getMap().add(map1);
						strSwitch1.getCase().add(strCase1);

					} else {
						strCase2 = new Case();
						if (strSwitch2.getExpr() == null) {
							strSwitch2.setExpr("$"
									+ Constants.MESSAGE_VALUE_DOT
									+ targetString);
						}
						strCase2.setValue(val);
						map2 = new Maps();
						map2.setType(Constants.CNST);
						map2.setSrc(mapSource);
						map2.setTarget(strFieldName);
						strCase2.getMap().add(map2);
						strSwitch2.getCase().add(strCase2);
					}
				}
			}
			if (strCase != null) {
				strSwitch.getCase().add(strCase);
				strCase = null;
			}
		}

		mapping.getSwitch().add(strSwitch);
	}

	/**
	 * This method is used to format FIXML string if it contains List of values.
	 * 
	 * @param strFixml
	 * @param fieldName
	 * @param reqId
	 * @return JAXB Switch
	 */
	private Switch mappingForFixmlList(String strFixml, String fieldName,
			String sName, QUERY_TYPES_LIFFE q) {
		Switch strSwitch = new Switch();

		String[] elements = strFixml.split(Constants.HASH);
		if (elements == null || elements.length < 1) {
			return null;
		}
		String expression = "$" + fieldName;
		String strTarget = elements[0].trim();
		if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)) {
			strTarget = strTarget.substring(strTarget
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			if (sName.startsWith(Constants.P)) {
				strSwitch.setExpr("$" + strTarget);
			} else {
				strSwitch.setExpr(expression);
			}
		} else if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_INFORMATION)
				|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
			String[] ele = elements[0].split("/@");
			if (elements[0].contains("RptSide")) {
				strSwitch.setExpr("$" + ele[ele.length - 1]);
			} else {
				strTarget = ele[0].substring(strTarget
						.indexOf(Constants.AT_RATE) + 1);
				strSwitch
						.setExpr("$" + Constants.MESSAGE_VALUE_DOT + strTarget);
			}

		} else {
			strTarget = strTarget.replace(Constants.BACK_SLASH_SPACE,
					Constants.DOT).trim();
			strTarget = strTarget.replace(Constants.BACK_SLASH, Constants.DOT);
			strTarget = strTarget.replace(Constants.AT_RATE, "").trim();
			strSwitch.setExpr("$" + Constants.MESSAGE_VALUE_DOT + strTarget);
		}

		// 
		Case strCase = null;
		Maps map = null;
		String str = elements[1].trim();
		str = str.substring(5, str.indexOf(")"));
		String[] strDouble = str.split(",");
		for (int i = 0; i < strDouble.length; i++) {
			String caseValue = strDouble[i].substring(0,
					strDouble[i].indexOf(Constants.EQUALS)).trim();
			String mapSource = strDouble[i].substring(
					strDouble[i].indexOf(Constants.EQUALS) + 1).trim();
			strCase = new Case();
			map = new Maps();
			strCase.setValue(caseValue);
			map.setType(Constants.CNST);
			map.setSrc(mapSource);
			map.setTarget(fieldName);
			strCase.getMap().add(map);
			strSwitch.getCase().add(strCase);
		}

		return strSwitch;
	}

	/**
	 * This method is used to format Fixml String with "/@" and "\n" and set it
	 * as a JAXB Maps based on the condition.
	 * 
	 * @param map
	 * @param sName
	 * @param reqId
	 * @param mapping
	 * @param strFixml
	 */
	private void mappingForFixmlPty(Maps map, String sName, Mappings mapping,
			String strFixml, QUERY_TYPES_LIFFE q) {
		String split[] = strFixml.split(Constants.HASH);
		if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)) {
			String[] split2 = split[0].split("/");
			String temp = split2[split2.length - 2];
			String afterDot = split[0].substring(split[0]
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			String befDot = split[1].substring(
					split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
					split[1].indexOf("(=")).trim();
			String val = split[1].substring(split[1].indexOf("(=") + 2,
					split[1].indexOf(")")).trim();
			String finalStr = temp + "[" + befDot + Constants.EQUALS + val
					+ "]." + afterDot;
			finalStr = finalStr.trim();
			map.setSrc(finalStr);

		} else if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_INFORMATION)
				|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
			if (strFixml.contains("RptSide")) {
				String[] sp = split[0].split("/");
				String temp = sp[sp.length - 2];
				String afterDot = split[0].substring(split[0]
						.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
				String befDot = split[1].substring(
						split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
						split[1].indexOf("(=")).trim();
				String val = split[1].substring(split[1].indexOf("(=") + 2,
						split[1].indexOf(")")).trim();
				String finalStr = temp + "[" + befDot + Constants.EQUALS + val
						+ "]." + afterDot;
				finalStr = finalStr.trim();
				map.setSrc(finalStr);
			} else {
				String afterDot = split[0].substring(split[0]
						.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
				String befDot = split[1].substring(
						split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
						split[1].indexOf("(=")).trim();
				String val = split[1].substring(split[1].indexOf("(=") + 2,
						split[1].indexOf(")")).trim();
				String addVal = split[0].substring(0, split[0]
						.indexOf(Constants.BACK_SLASH_AT_RATE));
				addVal = addVal.replace(Constants.BACK_SLASH, Constants.DOT);
				String finalStr = addVal + "[" + befDot + Constants.EQUALS
						+ val + "]." + afterDot;
				finalStr = finalStr.trim();
				map.setSrc(Constants.MESSAGE_VALUE_DOT + finalStr);
			}

		} else {
			String afterDot = split[0].substring(split[0]
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			String befDot = split[1].substring(
					split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
					split[1].indexOf("(=")).trim();
			String val = split[1].substring(split[1].indexOf("(=") + 2,
					split[1].indexOf(")")).trim();
			String addVal = split[0].substring(0, split[0]
					.indexOf(Constants.BACK_SLASH_AT_RATE));
			addVal = addVal.replace(Constants.BACK_SLASH, Constants.DOT);
			String finalStr = addVal + "[" + befDot + Constants.EQUALS + val
					+ "]." + afterDot;
			finalStr = finalStr.trim();
			map.setSrc(Constants.MESSAGE_VALUE_DOT + finalStr);
		}
		mapping.getMap().add(map);
	}

	/**
	 * This method is used to format Fixml String with "/@" and set it as a JAXB
	 * Maps based on the condition.
	 * 
	 * @param map
	 * @param sName
	 * @param reqId
	 * @param mapping
	 * @param strFixml
	 */
	private void formatFixmlForTag(Maps map, String sName, Mappings mapping,
			String strFixml, QUERY_TYPES_LIFFE q) {
		if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)) {
			strFixml = strFixml.substring(strFixml
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			map.setSrc(strFixml);
		} else if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_INFORMATION)
				|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
			if (strFixml.contains(Constants.RPT_SIDE)) {
				strFixml = strFixml.substring(strFixml
						.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
				map.setSrc(strFixml);
			} else {
				strFixml = strFixml
						.replace(Constants.BACK_SLASH, Constants.DOT);
				strFixml = strFixml.replace(Constants.AT_RATE, "");
				if (strFixml.contains(Constants.HASH)) {
					int posOfHash = strFixml.indexOf(Constants.HASH);
					strFixml = strFixml.substring(0, posOfHash);
				}
				map.setSrc(Constants.MESSAGE_VALUE_DOT + strFixml);
			}
		} else {
			strFixml = strFixml.replace(Constants.BACK_SLASH, Constants.DOT);
			strFixml = strFixml.replace(Constants.AT_RATE, "");
			if (strFixml.contains(Constants.HASH)) {
				int posOfHash = strFixml.indexOf(Constants.HASH);
				strFixml = strFixml.substring(0, posOfHash);
			}
			map.setSrc(Constants.MESSAGE_VALUE_DOT + strFixml);
		}
		mapping.getMap().add(map);
	}
}
