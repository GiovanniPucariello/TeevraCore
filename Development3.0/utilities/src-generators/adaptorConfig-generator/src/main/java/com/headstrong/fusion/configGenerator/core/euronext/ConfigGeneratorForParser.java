package com.headstrong.fusion.configGenerator.core.euronext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

import com.headstrong.fusion.configGenerator.core.DTOTransformer;
import com.headstrong.fusion.configGenerator.core.DTOTransformerForEuronext;
import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Binding;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Case;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Configuration;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Field;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.ParserConfig;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Switch;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;

public class ConfigGeneratorForParser implements XmlConfigGenerator {

	/**
	 * This method is used to generate the mapping for PTY or QTY type Excel
	 * Column value eg :: "\PosMntRpt\Pty\@ID \PosMntRpt\Pty\@R=21" or
	 * "\PosMntRpt\Qty\@Long \PosMntRpt\Qty\@Short \PosMntRpt\Qty\@Stat=1
	 * \PosMntRpt\Qty\@Typ=TOT"
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
			String strFieldName, String strFixml, String strType) {
		Maps map;
		String[] typeSplit;
		String[] dataType = null;
		strType = strType.replace("\\", "/");
		typeSplit = strType.split(Constants.HASH);
		strFixml = strFixml.replace("\\", "/");
		String[] fixmlSplit = strFixml.split(Constants.HASH);

		for (int m = 0; m < fixmlSplit.length; m++) {
			fixmlSplit[m] = fixmlSplit[m].substring(1);
			fixmlSplit[m] = fixmlSplit[m]
					.substring(fixmlSplit[m].indexOf("/") + 1);
		}
		// for 3 # value(columnn have 4 pty value)
		int mpKeyCntr = 0;
		if (fixmlSplit.length == 4 || (fixmlSplit.length==3 && (fixmlSplit[0].contains("Short")|| fixmlSplit[0].contains("Long")))) {
			// for setting first qty
			dataType = typeSplit[0].split("/");
			String firstType = dataType[1];
			String[] fixml = fixmlSplit[0].split("/");
			String finalStr = Constants.MESSAGE_VALUE_DOT;
			String s = fixml[0] + "." + fixml[1].substring(1);
			finalStr = finalStr + s;
			map = new Maps();
			map.setType(Constants.SIMPLE);
			map.setSrc(strFieldName);
			map.setTarget(finalStr);
			if (!firstType.equalsIgnoreCase("String")) {
				map.setParseType(firstType);
			}
			mapping.getMap().add(map);
			String mpKey = "";
			for (int m = 1; m < fixmlSplit.length; m++) {
				map = new Maps();
				dataType = typeSplit[m].split("/");
				String nextType = dataType[1];
				String[] fxml = fixmlSplit[m].split("/");
				mpKey = Constants.IS + fixml[0] + Constants.ENCOUNTERED;
				String fStr = Constants.MESSAGE_VALUE_DOT;
				for (int n = 0; n < fxml.length; n++) {
					if (n == 0 && !mp.containsKey(mpKey)) {
						fStr = fStr + fxml[n] + Constants.ZERO_DOT;
					} else if (n != 0 && !mp.containsKey(mpKey)) {
						fStr = fStr + fxml[n].substring(1);
					} else if (n == 0 && mp.containsKey(mpKey)) {
						mpKeyCntr = mp.get(mpKey);
						fStr = fStr + fxml[n] + "["
								+ Integer.toString(mpKeyCntr) + "].";
					} else if (n != 0 && mp.containsKey(mpKey)) {
						fStr = fStr + fxml[n].substring(1);
					}
				}
				if (!fStr.contains("=")) {
					map.setSrc("0");
					map.setTarget(fStr);
					map.setType(Constants.CNST);
					if (!nextType.equalsIgnoreCase("String")) {
						map.setParseType(nextType);
					}
				} else {
					String val = fStr.substring(fStr.indexOf("=") + 1);
					fStr = fStr.substring(0, fStr.indexOf("="));
					map.setSrc(val);
					map.setTarget(fStr);
					map.setType(Constants.CNST);
					if (!nextType.equalsIgnoreCase("String")) {
						map.setParseType(nextType);
					}
				}
				mapping.getMap().add(map);
			}
			mp.put(mpKey, mpKeyCntr + 1);
		} else {
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
								int mpKeyCount = mp.get(mpKey);
								finalStr = finalStr + fixml[n] + "["
										+ Integer.toString(mpKeyCount) + "].";
								mp.put(mpKey, mpKeyCount + 1);
							} else {
								finalStr = finalStr + fixml[n]
										+ Constants.ZERO_DOT;
								mp.put(mpKey, 1);
							}
						}

					} else if(dataType[n].equalsIgnoreCase("ErrorFields")){
						finalStr = finalStr + fixml[n]+".";
					}else {				
						finalStr = finalStr + fixml[n].substring(1);
					}
				}
				if(strFixml.contains("{") && strFixml.contains("}")) {
					String indexValue = strFixml.substring(strFixml.indexOf("{")+1, strFixml.indexOf("}"));
					String str1 = finalStr.split("\\[")[0];
					str1 = str1.split("\\{")[0];
					String str2=finalStr.substring(finalStr.indexOf("]")+1,finalStr.length());
					if(str2.equals(finalStr)) {
						str2 = finalStr.substring(finalStr.indexOf("}")+1,finalStr.length());
					}
					if("".equals(indexValue)){						
						finalStr = str1+str2;
					}else {							
						finalStr=str1+"["+indexValue+"]"+str2;
					}
				}
				
				if (finalStr.contains("=")) {
					int pos = finalStr.indexOf("=");
					String val = finalStr.substring(pos + 1);
					finalStr = (String) finalStr.substring(0, finalStr
							.indexOf("="));
					map.setType(Constants.CNST);
					map.setSrc(val);
					map.setTarget(finalStr);
					if (!dataType[dataType.length - 1]
							.equalsIgnoreCase(Constants.STR)) {
						map.setParseType(dataType[dataType.length - 1]);
					}
					mapping.getMap().add(map);

				} else {
					map.setType(Constants.SIMPLE);
					map.setSrc(strFieldName);
					map.setTarget(finalStr);
					if (!dataType[dataType.length - 1]
							.equalsIgnoreCase(Constants.STR)) {
						map.setParseType(dataType[dataType.length - 1]);
					}
					mapping.getMap().add(map);
				}
			}
		}
	}

	/**
	 * This method id used to generate the mapping for List Excel value will be
	 * like this "/AllocRpt/Alloc/@Meth List(A=1,M=3)"
	 * 
	 * @param mp
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForFixmlListParser(Map<String, Integer> mp,
			Mappings mapping, String strFieldName, String strFixml,
			String strType) {
		Maps map;
		Switch strSwitch = new Switch();
		strFixml = strFixml.replace("\\", "/");
		String[] elements = strFixml.split(Constants.HASH);
		String expression = "$" + strFieldName;
		String strTarget = elements[0].trim();
		strSwitch.setExpr(expression);
		for (int m = 0; m < elements.length - 1; m++) {
			elements[m] = elements[m].substring(1);
			elements[m] = elements[m].substring(elements[m].indexOf("/") + 1);
			strTarget = elements[m].replace(Constants.BACK_SLASH_SPACE,
					Constants.DOT).trim();
			strTarget = elements[m]
					.replace(Constants.BACK_SLASH, Constants.DOT);
			strTarget = strTarget.replace(Constants.AT_RATE, "").trim();
		}
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
			if("".equals(caseValue.trim())) {
				caseValue=" ";
			}
			if("".equals(mapSource.trim())) {
				mapSource=" ";
			}
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
				finalStr = finalStr + targetFirst[0] + Constants.ZERO_DOT
						+ targetFirst[1];
				if(targetFirst.length>2){
					for(int i=2;i<targetFirst.length;i++){
						finalStr = finalStr+Constants.DOT+targetFirst[i];
					}
				}
/*				if (mp.containsKey(mpKey)) {
					finalStr = finalStr + targetFirst[0] + Constants.ZERO_DOT
							+ targetFirst[1];
				} else {
					finalStr = finalStr + targetFirst[0] + Constants.DOT
							+ targetFirst[1];
					mp.put(mpKey, 1);
				}
*/				map.setTarget(finalStr);
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
	 * This method is used parse more than two variable with "/@" Excel value eg
	 * like this "/AllocRpt/AllExc/@TrdID"
	 * 
	 * @param mp
	 * @param q
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForSimpleParser(Map<String, Integer> mp,
			Mappings mapping, String strFieldName, String strFixml,
			String strType) {
		Maps map;
		map = new Maps();
		strFixml = strFixml.replace(Constants.BACK_SLASH_SPACE, Constants.DOT)
				.trim();
		strFixml = strFixml.replace(Constants.BACK_SLASH, Constants.DOT);
		strFixml = strFixml.replace(Constants.AT_RATE, "").trim();
		if (strFixml.contains(Constants.DOT) && !strFixml.contains("=")) {
			String[] targetFirst = strFixml.split("\\.");
			String finalStr = Constants.MESSAGE_VALUE_DOT;
			for (int a = 2; a < (targetFirst.length) - 1; a++) {
				String mpKey = Constants.IS + targetFirst[a]
						+ Constants.ENCOUNTERED;
				if (!targetFirst[a].contains("Instrmt")) {
					if (mp.containsKey(mpKey)) {
						finalStr = finalStr + targetFirst[a]
								+ Constants.ZERO_DOT;
					} else {
						finalStr = finalStr + targetFirst[a] + Constants.DOT;
						mp.put(mpKey, 1);
					}
				} else {
					finalStr = finalStr + targetFirst[a] + Constants.DOT;
				}
			}
			finalStr = finalStr + targetFirst[targetFirst.length - 1];
			if(finalStr.contains("{}[")){
				String str1 = finalStr.split("\\{")[0];
				String str2 = finalStr.substring(finalStr.indexOf("]")+1,finalStr.length());
				finalStr = str1+str2;
			}else if(finalStr.contains("{}")){
				String str1 = finalStr.split("\\{")[0];
				String str2 = finalStr.substring(finalStr.indexOf("}")+1,finalStr.length());
				finalStr = str1+str2;
			}
			
			map.setTarget(finalStr);
			map.setSrc(strFieldName);
			map.setType(Constants.SIMPLE);
		} else {
			String[] targetFirst = strFixml.split("\\.");
			String finalStr = Constants.MESSAGE_VALUE_DOT;
			String val = targetFirst[2]
					.substring(targetFirst[2].indexOf("=") + 1);
			finalStr = finalStr
					+ targetFirst[2].substring(0, targetFirst[2].indexOf("="));
			map.setType(Constants.CNST);
			map.setSrc(val);
			map.setTarget(finalStr);
		}

		if (!strType.equalsIgnoreCase(Constants.STR)) {
			map.setParseType(strType);
		}
		mapping.getMap().add(map);
	}

	/**
	 * This method is used to parse simple one variable. Excel sheet cloumn
	 * value will be like "/PosMntRpt/@TxnTyp =2#/PosMntRpt/@Actn
	 * =3#/PosMntRpt/@Stat =0"
	 * 
	 * @param mapping
	 * @param strFieldName
	 * @param strFixml
	 * @param strType
	 */
	public void mappingForOneVarParser(Mappings mapping, String strFieldName,
			String strFixml, String strType) {
		Maps map;
		strFixml = strFixml.replace("\\", "/");
		String[] fixmlSplit = strFixml.split(Constants.HASH);
		String[] fixmlType = strType.split(Constants.HASH);
		for (int m = 0; m < fixmlSplit.length; m++) {
			map = new Maps();
			fixmlSplit[m] = fixmlSplit[m].substring(1);
			String val = fixmlSplit[m]
					.substring(fixmlSplit[m].indexOf("=") + 1);
			if(fixmlSplit[m].indexOf("=")>0){
				fixmlSplit[m] = fixmlSplit[m].substring(
						fixmlSplit[m].indexOf("/") + 2, fixmlSplit[m].indexOf("="));
			}else {
				fixmlSplit[m] = fixmlSplit[m].substring(
						fixmlSplit[m].indexOf("/") + 2);
			}

			fixmlSplit[m] = Constants.MESSAGE_VALUE_DOT + fixmlSplit[m];
			if (val.contains("or") && val.length() > 2) {
				val = val.substring(0, 2);
			} 
			map.setSrc(val.trim());
			map.setTarget(fixmlSplit[m].trim());
			if (!fixmlType[m].equalsIgnoreCase(Constants.STR)) {
				map.setParseType(fixmlType[m]);
			}
			map.setType(Constants.CNST);
			mapping.getMap().add(map);
		}

	}

	/**
	 * This method is used to generate the configuration file with the help of
	 * JAXB.
	 * 
	 * @param sName
	 * @param q
	 * @param configuration
	 * @param binding
	 * @param mapping
	 * @param keyList
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	public static void generateConfig(String sName,
			Configuration configuration, Binding binding, Mappings mapping,
			ParserConfig parConfig) throws Exception {
		String xmlName;
		JAXBContext context = null;
		try {
			context = JAXBContext.newInstance(Configuration.class);
		} catch (JAXBException e) {
			throw e;
		}
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		parConfig.setSchema(sName);
		configuration.setParserConfig(parConfig);
		configuration.setBinding(binding);
		configuration.setMappings(mapping);
		xmlName = PropertyManager.getInstance().getProperty(
				Constants.OUTPUT_LOCATION)
				+ sName + Constants.DOT_XML;
		File xmlFile = new File(xmlName);
		File dir = xmlFile.getParentFile();
		if (false == xmlFile.exists()) {
			dir.mkdir();
		}
		try {
			xmlFile.createNewFile();
			marshaller.marshal(configuration, new FileWriter(xmlFile));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void generateXmlConfig(String sheetName,
			TableDataFactory sheetDataFactory) throws Exception {

		// For the output xml file name, to get sheetName without the '$'
		String sName = sheetName.substring(0, sheetName.length() - 1);
		Map requestID = sheetDataFactory.getRequestID();
		String fixmlName = (String) requestID.get(sheetName);
		String className = fixmlName.substring(0, fixmlName.indexOf("<"));
		String localPart = fixmlName.substring((fixmlName.indexOf("<") + 1),
				fixmlName.indexOf(">"));
		Field field;
		Maps map;
		Map<String, Integer> mp = new HashMap<String, Integer>();
		Configuration configuration = new Configuration();
		Binding binding = new Binding();
		Mappings mapping = new Mappings();
		ParserConfig parConfig = new ParserConfig();
		parConfig.setSchema(sName);
		parConfig.setClassname("com.headstrong.teevra_fixml_1_0." + className);
		parConfig.setLocalPart(localPart);
		parConfig.setNamespaceUri("http://www.headstrong.com/TEEVRA-FIXML-1-0");
		if(localPart.equals("Error")){
			parConfig.setError("true");
		}
		List<Map> mapList = sheetDataFactory.getQueryData("totalData");
		if (mapList != null) {
			DTOTransformer transformer = new DTOTransformerForEuronext(mapList);
			List<Map> sample = transformer.getObjects("totalData");
			for (int i = 0; i < sample.size(); i++) {
				field = new Field();
				field.setStart((sample.get(i)).get(Constants.FROM).toString());
				field.setEnd((sample.get(i)).get(Constants.TO).toString());
				field.setName((sample.get(i)).get(Constants.FIELD).toString()
						.trim());
				binding.getField().add(field);
				String strFieldName = sample.get(i).get(Constants.FIELD)
						.toString();
				strFieldName = strFieldName.trim();
				String strFormat = sample.get(i).get(Constants.FORMAT)
						.toString();
				strFormat = strFormat.toLowerCase();
				if (sample.get(i).containsKey(Constants.FIXML)
						&& sample.get(i).containsKey(Constants.FORMAT)) {
					String strFixml = sample.get(i).get(Constants.FIXML)
							.toString();
					strFixml = strFixml.replace("\\", "/");
					String strType = sample.get(i).get(Constants.FORMAT)
							.toString();
					if (strFieldName.equalsIgnoreCase("messageCode")
							&& !strFixml.equals(null)) {
						mappingForOneVarParser(mapping, strFieldName, strFixml,
								strType);

					} else if (strFixml.contains(Constants.LIST)
							&& strFixml.contains(Constants.HASH)) {
						mappingForFixmlListParser(mp, mapping, strFieldName,
								strFixml, strType);
					} else if (strType.contains(Constants.HASH)
							&& strFixml.contains(Constants.HASH)
							&& !(strFixml.contains(Constants.LIST))) {
						mappingForPtyParser(mp, mapping, strFieldName,
								strFixml, strType);
					} else if (strFixml.contains("/@")) {
						mappingForSimpleParser(mp, mapping, strFieldName,
								strFixml, strType);
					}
				}
			}
			generateConfig(sName, configuration, binding, mapping, parConfig);
		}
	}
}
