package com.headstrong.fusion.configGenerator.core.liffe;

import java.util.HashMap;
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

public class ConfigParserForLiffe  {

	public ConfigParserForLiffe(Properties p) {
		GeneratorProcessorForLiffe.props = p;
	}

	/**
	 * This method is used to generate the configuration files for parser.
	 * 
	 * @param sheetName
	 * @param sheetDataFactory
	 * @param rootTag
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	@SuppressWarnings("unchecked")
	public void generateConfigForParser(String sheetName,
			TableDataFactory sheetDataFactory) throws JAXBException,
			PropertyException {
		// For the output xml file name, to get sheetName without the '$'

		String sName = sheetName.substring(0, sheetName.length() - 1);
		Field field;
		Maps map;
		for (QUERY_TYPES_LIFFE q : QUERY_TYPES_LIFFE.values()) {
			Map<String, Integer> mp = new HashMap<String, Integer>();
			Configuration configuration = new Configuration();
			Binding binding = new Binding();
			Mappings mapping = new Mappings();
			List<Map> mapList = sheetDataFactory.getQueryData(q.getStr());
			// Null check for V120 if the sub table doesn't have the data
			if (mapList != null) {
				DTOTransformer transformer = new DTOTransformerForLiffe(mapList);
				List<Map> sample = transformer.getObjects(q.getStr());
				String subTableName = q.getVal();
				if (subTableName.equals("0007")) {
					map = new Maps();
					map.setSrc("Aloc");
					map.setTarget(Constants.SPLIT_MSG_IDENTIFIER);
					map.setType(Constants.CNST);
					mapping.getMap().add(map);
				} else if (subTableName.equals("0008")) {
					map = new Maps();
					map.setSrc("Asgn");
					map.setTarget(Constants.SPLIT_MSG_IDENTIFIER);
					map.setType(Constants.CNST);
					mapping.getMap().add(map);
				} 
//				else if (subTableName.equals("0003")) {
//					map = new Maps();
//					map.setSrc("IN");
//					map.setTarget("message.value.RptSide.ExecRefID");
//					map.setType(Constants.CNST);
//					mapping.getMap().add(map);
//					String mapKey = Constants.IS + "RptSide"
//							+ Constants.ENCOUNTERED;
//					mp.put(mapKey, 1);
//				}
				for (int i = 0; i < sample.size(); i++) {

					field = new Field();
					field.setStart((sample.get(i)).get(Constants.FROM)
							.toString());
					field.setEnd((sample.get(i)).get(Constants.TO).toString());
					field.setName((sample.get(i)).get(Constants.FIELD)
							.toString().trim());
					binding.getField().add(field);
					String strFieldName = sample.get(i).get(Constants.FIELD)
							.toString();
					strFieldName = strFieldName.trim();
					String strFormat = sample.get(i).get(Constants.FORMAT)
							.toString();
					strFormat = strFormat.toLowerCase();
					if (sample.get(i).containsKey(Constants.FIXML)
							&& sample.get(i).containsKey(Constants.DATA_TYPE)) {
						String strFixml = sample.get(i).get(Constants.FIXML)
								.toString();
						String strType = sample.get(i).get(Constants.DATA_TYPE)
								.toString();
						if (strFixml.contains(Constants.CONDITIONAL_EXPRESSION)) {
							Switch strswitch = parseConditionalExpression(
									strFieldName, Constants.GREATE_THEN_ZERO,
									strFixml, q);
							mapping.getSwitch().add(strswitch);

						} else if (strType.contains(Constants.HASH)
								&& strFixml.contains(Constants.HASH)
								&& !(strFixml.contains(Constants.LIST))) {
							mappingForPtyParser(mp, mapping, strFieldName,
									strFixml, strType, q);
						} else if (!(strType.contains(Constants.LIST) || strType
								.contains(Constants.R_LIST))) {
							if (strFixml.contains(Constants.MULTI_LIST)) {
								mappingForFixmlMultiParser(mapping,
										strFieldName, strFixml, strType);

							} else if (strFixml.contains(Constants.LIST)
									&& strFixml.contains(Constants.HASH)) {
								mappingForFixmlListParser(mp, mapping,
										strFieldName, strFixml, strType, q);

							} else if (!(strFixml.contains(Constants.LIST) || strFixml
									.contains(Constants.MULTI_LIST))) {
								if (strFixml
										.contains(Constants.BACK_SLASH_AT_RATE)) {
									mappingForSimpleParser(mp, q, mapping,
											strFieldName, strFixml, strType);

								} else {
									mappingForOneVarParser(mapping,
											strFieldName, strFixml, strType);
								}

							} else {
								mappingForSimpleParser(mp, q, mapping,
										strFieldName, strFixml, strType);
							}
						}
					}
				}
				GeneratorProcessorForLiffe.generateConfig(sName, q, configuration, binding, mapping);
			}
		}

	}

	/**
	 * This method is used to format the FIXML which contains the String called
	 * "conditional Expression"
	 * 
	 * @param fieldName
	 * @param condition
	 * @param element1
	 * @param element2
	 * @return switch
	 */
	public Switch parseConditionalExpression(String strFieldName,
			String condition, String strFixml, QUERY_TYPES_LIFFE q) {

		String[] splitFixml = strFixml.split(Constants.HASH);
		String fixml = splitFixml[1];
		fixml = fixml.replace(Constants.BACK_SLASH_SPACE, Constants.DOT);
		fixml = fixml.replace(Constants.BACK_SLASH, Constants.DOT);
		fixml = fixml.replace(Constants.AT_RATE, "");
		String nextFixml = splitFixml[2];
		nextFixml = nextFixml
				.replace(Constants.BACK_SLASH_SPACE, Constants.DOT);
		nextFixml = nextFixml.replace(Constants.BACK_SLASH, Constants.DOT);
		nextFixml = nextFixml.replace(Constants.AT_RATE, "");
		Switch strSwitch = new Switch();

		strSwitch.setExpr("$" + strFieldName + " " + condition);

		Case strCase = null;
		strCase = new Case();
		strCase.setValue(Constants.TRUE);
		Maps map = null;
		map = new Maps();
		map.setType(Constants.CNST);
		map.setSrc(strFieldName);
		if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)) {
			map.setTarget(fixml);
		} else {
			map.setTarget(Constants.MESSAGE_VALUE_DOT + fixml);
		}
		strCase.getMap().add(map);
		strSwitch.getCase().add(strCase);

		strCase = new Case();
		strCase.setValue(Constants.FALSE);
		Maps maps = null;
		maps = new Maps();
		maps.setType(Constants.CNST);
		maps.setSrc(strFieldName);
		maps.setTarget(Constants.MESSAGE_VALUE_DOT + nextFixml);
		strCase.getMap().add(maps);
		strSwitch.getCase().add(strCase);

		return strSwitch;

	}

	/**
	 * This method id used to generate the mapping for PTY or QTY type
	 * 
	 * @param mp
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 * @param dataType
	 * @param q
	 */
	public void mappingForPtyParser(Map<String, Integer> mp, Mappings mapping,
			String strFieldName, String strFixml, String strType,
			QUERY_TYPES_LIFFE q) {
		Maps map;
		String[] typeSplit;
		String[] dataType = null;
		typeSplit = strType.split(Constants.HASH);
		String[] fixmlSplit = strFixml.split(Constants.HASH);
		for (int m = 0; m < fixmlSplit.length; m++) {
			map = new Maps();
			String[] fixml = fixmlSplit[m].split("/");
			String finalStr = Constants.MESSAGE_VALUE_DOT;
			for (int n = 0; n < fixml.length; n++) {
				dataType = typeSplit[m].split("/");
				if (dataType[n].equalsIgnoreCase(Constants.LIST)) {
					String mpKey = Constants.IS + fixml[n]
							+ Constants.ENCOUNTERED;
					if (mp.containsKey(mpKey)) {
						finalStr = finalStr + fixml[n] + Constants.ZERO_DOT;
					} else {
						finalStr = finalStr + fixml[n] + Constants.DOT;
						mp.put(mpKey, 1);
					}
				} else if (dataType[n].equalsIgnoreCase(Constants.R_LIST)) {
					String mpKey = "";
					if (m == 0) {
						finalStr = finalStr + fixml[n] + Constants.DOT;
					} else {
						for (int l = 0; l <= n; l++) {
							mpKey = mpKey + Constants.DOT + fixml[l];
						}
						if (mp.containsKey(mpKey)) {
							int mpKeyCntr = mp.get(mpKey);
							finalStr = finalStr + fixml[n] + "["
									+ Integer.toString(mpKeyCntr) + "].";
							mp.put(mpKey, mpKeyCntr + 1);
						} else {
							finalStr = finalStr + fixml[n] + Constants.ZERO_DOT;
							mp.put(mpKey, 1);
						}
					}

				}

				else {
					finalStr = finalStr + fixml[n].substring(1);

				}

			}
			if (finalStr.contains("(=")) {
				int pos = finalStr.indexOf("(");
				int endPos = finalStr.indexOf(")");
				String val = finalStr.substring(pos + 2, endPos);
				finalStr = (String) finalStr.substring(0,
						finalStr.indexOf("(") - 1);
				map.setType(Constants.CNST);
				map.setSrc(val);
				if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)
						|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
					if (!finalStr.contains(Constants.RPT_SIDE_ZERO)) {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE) + 8);
					} else {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE_ZERO) + 11);
					}
					map.setTarget(finalStr);
				} else {
					map.setTarget(finalStr);
				}
				if (!dataType[dataType.length - 1]
						.equalsIgnoreCase(Constants.STR)) {
					map.setParseType(dataType[dataType.length - 1]);
				}
				mapping.getMap().add(map);

			} else {
				map.setType(Constants.SIMPLE);
				map.setSrc(strFieldName);
				if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)
						|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
					if (!finalStr.contains(Constants.RPT_SIDE_ZERO)) {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE) + 8);
					} else {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE_ZERO) + 11);
					}
					map.setTarget(finalStr);
				} else {
					map.setTarget(finalStr);
				}
				if (!dataType[dataType.length - 1]
						.equalsIgnoreCase(Constants.STR)) {
					map.setParseType(dataType[dataType.length - 1]);
				}
				mapping.getMap().add(map);
			}
		}
	}

	/**
	 * This method is used to generate the mapping for Multi List
	 * 
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForFixmlMultiParser(Mappings mapping,
			String strFieldName, String strFixml, String strType) {
		Maps map;
		Switch strSwitch = new Switch();
		String[] elements = strFixml.split(Constants.HASH);
		String expression = "$" + strFieldName;
		String strTarget = elements[0].trim();
		strTarget = strTarget
				.replace(Constants.BACK_SLASH_SPACE, Constants.DOT).trim();
		strTarget = strTarget.replace(Constants.BACK_SLASH, Constants.DOT);
		strTarget = strTarget.replace(Constants.AT_RATE, "");
		strSwitch.setExpr(expression);
		// strSwitch.setExpr("message.value." + expression);
		Case strCase = null;
		String str = elements[1].trim();
		str = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
		String[] strDouble = str.split(",");

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

			strCase = new Case();
			map = new Maps();
			strCase.setValue(caseValue);
			map.setType(Constants.CNST);
			map.setSrc(mapSource);
			map.setTarget(Constants.MESSAGE_VALUE_DOT + strTarget);
			if (!strType.equalsIgnoreCase(Constants.STR)) {
				map.setParseType(strType);
			}
			strCase.getMap().add(map);
			if (listValue.contains("[")) {
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
				String type = split[1];
				map = new Maps();
				map.setTarget(Constants.MESSAGE_VALUE_DOT + targetString);
				map.setType(Constants.CNST);
				if (!type.equalsIgnoreCase(Constants.STR)) {
					map.setParseType(type);
				}
				map.setSrc(val);
				strCase.getMap().add(map);
			}
			strSwitch.getCase().add(strCase);
		}
		mapping.getSwitch().add(strSwitch);
	}

	/**
	 * This method id used to generate the mapping for List
	 * 
	 * @param mp
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForFixmlListParser(Map<String, Integer> mp,
			Mappings mapping, String strFieldName, String strFixml,
			String strType, QUERY_TYPES_LIFFE q) {
		Maps map;
		Switch strSwitch = new Switch();
		String[] elements = strFixml.split(Constants.HASH);
		String expression = "$" + strFieldName;
		String strTarget = elements[0].trim();
		strSwitch.setExpr(expression);
		strTarget = strTarget
				.replace(Constants.BACK_SLASH_SPACE, Constants.DOT).trim();
		strTarget = strTarget.replace(Constants.BACK_SLASH, Constants.DOT);
		strTarget = strTarget.replace(Constants.AT_RATE, "").trim();
		strSwitch.setExpr(expression);
		Case strCase = null;
		String str = elements[1].trim();
		str = str.substring(5, str.indexOf(")"));

		String[] strDouble = str.split(",");
		for (int m = 0; m < strDouble.length; m++) {
			String caseValue = strDouble[m].substring(0,
					strDouble[m].indexOf(Constants.EQUALS)).trim();
			String mapSource = strDouble[m].substring(
					strDouble[m].indexOf(Constants.EQUALS) + 1).trim();
			strCase = new Case();
			map = new Maps();
			strCase.setValue(caseValue);
			map.setType(Constants.CNST);
			map.setSrc(mapSource);
			if (strTarget.contains(Constants.DOT)) {
				String[] targetFirst = strTarget.split("\\.");
				String mpKey = Constants.IS + targetFirst[0]
						+ Constants.ENCOUNTERED;
				String finalStr = Constants.MESSAGE_VALUE_DOT;
				if (mp.containsKey(mpKey)) {
					finalStr = finalStr + targetFirst[0] + Constants.ZERO_DOT
							+ targetFirst[1];
				} else {
					finalStr = finalStr + targetFirst[0] + Constants.DOT
							+ targetFirst[1];
					mp.put(mpKey, 1);
				}
				if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)
						|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
					if (!finalStr.contains(Constants.RPT_SIDE_ZERO)) {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE) + 8);
					} else {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE_ZERO) + 11);
					}
					map.setTarget(finalStr);
				} else {
					map.setTarget(finalStr);
				}
			} else {
				map.setTarget(Constants.MESSAGE_VALUE_DOT + strTarget);
			}
			if (!strType.equalsIgnoreCase(Constants.STR)) {
				map.setParseType(strType);
			}
			strCase.getMap().add(map);
			strSwitch.getCase().add(strCase);
		}

		mapping.getSwitch().add(strSwitch);
	}

	/**
	 * This method is used parse more than two variable with "/@"
	 * 
	 * @param mp
	 * @param q
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForSimpleParser(Map<String, Integer> mp,
			QUERY_TYPES_LIFFE q, Mappings mapping, String strFieldName,
			String strFixml, String strType) {
		Maps map;
		map = new Maps();
		strFixml = strFixml.replace(Constants.BACK_SLASH_SPACE, Constants.DOT)
				.trim();
		strFixml = strFixml.replace(Constants.BACK_SLASH, Constants.DOT);
		strFixml = strFixml.replace(Constants.AT_RATE, "").trim();
		if (strFixml.contains(Constants.INSTRMT)) {
			String finalStr = Constants.MESSAGE_VALUE_DOT + strFixml;
			map.setTarget(finalStr);
		} else {
			if (strFixml.contains(Constants.DOT)) {
				String[] targetFirst = strFixml.split("\\.");
				String finalStr = Constants.MESSAGE_VALUE_DOT;
				for (int a = 0; a < (targetFirst.length) - 1; a++) {
					String mpKey = Constants.IS + targetFirst[a]
							+ Constants.ENCOUNTERED;
					if (mp.containsKey(mpKey)) {
						finalStr = finalStr + targetFirst[a]
								+ Constants.ZERO_DOT;
					} else {
						finalStr = finalStr + targetFirst[a] + Constants.DOT;
						mp.put(mpKey, 1);
					}
				}
				finalStr = finalStr + targetFirst[targetFirst.length - 1];
				if (q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ALLOCATION)
						|| q.equals(QUERY_TYPES_LIFFE.HALF_TRADE_ASSIGNMENT)) {
					if (!finalStr.contains(Constants.RPT_SIDE_ZERO)) {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE) + 8);
					} else {
						finalStr = finalStr.substring(finalStr
								.indexOf(Constants.RPT_SIDE_ZERO) + 11);
					}
					map.setTarget(finalStr);
				} else {
					map.setTarget(finalStr);
				}
			}
		}
		map.setSrc(strFieldName);

		if (!strType.equalsIgnoreCase(Constants.STR)) {
			map.setParseType(strType);
		}
		map.setType(Constants.SIMPLE);
		mapping.getMap().add(map);
	}

	/**
	 * This method is used to parse simple one variable.
	 * 
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForOneVarParser(Mappings mapping, String strFieldName,
			String strFixml, String strType) {
		Maps map;
		map = new Maps();
		String finalStr = strFixml.substring(1);
		finalStr = Constants.MESSAGE_VALUE_DOT + finalStr;
		map.setSrc(strFieldName);
		map.setTarget(finalStr);
		if (!strType.equalsIgnoreCase(Constants.STR)) {
			map.setParseType(strType);
		}
		map.setType(Constants.SIMPLE);
		mapping.getMap().add(map);
	}

}
