package com.headstrong.fusion.configGenerator.core.euronext;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
import com.headstrong.fusion.configGenerator.viewObjects.euronext.FormatterConfig;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.FormatterKey;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Key;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Mappings;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Maps;
import com.headstrong.fusion.configGenerator.viewObjects.euronext.Switch;
import com.headstrong.fusion.configGenerator.viewObjects.liffe.Constants;

/**
 * Generates XML configuration for formatter adapter.
 * 
 */
public class ConfigGeneratorForFormatter implements XmlConfigGenerator {

	/**
	 * This method is used to format FIXML string if it contains List of values.
	 * Excel sheet column value will be like "/AllocRpt/Alloc/@Meth
	 * List(A=1,M=3)"
	 * 
	 * @param strFixml
	 * @param fieldName
	 * @param reqId
	 * @return JAXB Switch
	 */
	private Switch mappingForFixmlList(String strFixml, String fieldName,
			String sName, String req) {
		Switch strSwitch = new Switch();
		String[] elements = strFixml.split(Constants.HASH);
		if (elements == null || elements.length < 1) {
			return null;
		}
		String strTarget = elements[0].trim();
		String[] sp = strTarget.split("/");
		String finalStr = "";
		for (int m = 2; m < sp.length; m++) {
			finalStr = finalStr + sp[m];
			if (finalStr.equalsIgnoreCase("RptSide")) {
				finalStr = finalStr + "[0].";
			}

		}
		finalStr = finalStr.replace(Constants.BACK_SLASH_SPACE, Constants.DOT)
				.trim();
		finalStr = finalStr.replace(Constants.BACK_SLASH, Constants.DOT);
		finalStr = finalStr.replace(Constants.AT_RATE, "");
		strSwitch.setExpr("$" + Constants.MESSAGE_VALUE_DOT + finalStr);
		strSwitch.setType("Mandatory");
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
			if (req.equalsIgnoreCase("Y")) {
				map.setRequired("true");
			}
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
	 * as a JAXB Maps based on the condition. Excel sheet column value will be
	 * like "/AllocRpt/Pty/@ID /AllocRpt/Pty/@R =24"
	 * 
	 * @param map
	 * @param sName
	 * @param reqId
	 * @param mapping
	 * @param strFixml
	 */
	private void mappingForFixmlPty(Maps map, String sName, Mappings mapping,
			String strFixml, String req,String strFormat) {
		String split[] = strFixml.split(Constants.HASH);
		for (int m = 0; m < split.length; m++) {
			split[m] = split[m].substring(1);
			split[m] = split[m].substring(split[m].indexOf("/") + 1);
		}
		String[] sp = split[0].split("/");
		if (sp.length > 2) {
			String temp = sp[sp.length - 2];
			String afterDot = split[0].substring(split[0]
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			String befDot = split[1].substring(
					split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
					split[1].indexOf("=")).trim();
			String val = split[1].substring(split[1].indexOf("=") + 1).trim();
			String finalStr = temp + "[" + befDot + Constants.EQUALS + val
					+ "]." + afterDot;
			finalStr = finalStr.trim();
			map.setSrc(Constants.MESSAGE_VALUE_DOT + sp[0] + "[0]." + finalStr);
		} else {
			String temp = sp[sp.length - 2];
			String afterDot = split[0].substring(split[0]
					.indexOf(Constants.BACK_SLASH_AT_RATE) + 2);
			String befDot = split[1].substring(
					split[1].indexOf(Constants.BACK_SLASH_AT_RATE) + 2,
					split[1].indexOf("=")).trim();
			String val = split[1].substring(split[1].indexOf("=") + 1).trim();
			String finalStr = temp + "[" + befDot + Constants.EQUALS + val
					+ "]." + afterDot;
			finalStr = finalStr.trim();
			map.setSrc(Constants.MESSAGE_VALUE_DOT + finalStr);
		}
		if (req.equalsIgnoreCase("Y")) {
			map.setRequired("true");
		}
		if(strFormat.startsWith(Constants.SIGNED_NUMERIC)) {
			map.setPrintType(Constants.SIGNED_NUMERIC);
		}
		mapping.getMap().add(map);
	}

	/**
	 * This method is used parse more than two variable with "/@" Excel sheet
	 * column value will be like "/AllocRpt/@BizDt"
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
			String strType, String req) {
		Maps map;
		map = new Maps();
		strFixml = strFixml.replace("\\", "/");
		if (req.equalsIgnoreCase("Y")) {
			map.setRequired("true");
		}
		strFixml = strFixml.replace(Constants.BACK_SLASH_SPACE, Constants.DOT)
				.trim();
		strFixml = strFixml.replace(Constants.BACK_SLASH, Constants.DOT);
		strFixml = strFixml.replace(Constants.AT_RATE, "").trim();
		strFixml = strFixml.substring(1);
		strFixml = strFixml.substring(strFixml.indexOf(".") + 1);
		String finalStr = "";
		String[] spFixml = strFixml.split("\\.");
		if (spFixml.length > 1 && !strFixml.contains("Instrmt")) {
			for (int m = 0; m < spFixml.length - 1; m++) {
				finalStr = finalStr + spFixml[m];
				finalStr = finalStr + "[0].";

			}
			finalStr = finalStr + spFixml[spFixml.length - 1];
			finalStr = Constants.MESSAGE_VALUE_DOT + finalStr;
		} else {
			finalStr = Constants.MESSAGE_VALUE_DOT + strFixml;
		}
		map.setTarget(strFieldName);
		map.setSrc(finalStr);
		if (strType.toLowerCase().startsWith(Constants.XML_GREG_CALENDER)) {
			map.setPrintType(strType);
		} else if(strType.startsWith(Constants.SIGNED_NUMERIC)) {
			map.setPrintType(Constants.SIGNED_NUMERIC);
		}
		map.setType(Constants.SIMPLE);
		mapping.getMap().add(map);
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
	public void generateConfigurationFile(String sName,
			Configuration configuration) throws Exception {
		String xmlName;
		JAXBContext context = null;
		context = JAXBContext.newInstance(Configuration.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		FormatterConfig formatterConfig = new FormatterConfig();
		formatterConfig.setSchema(sName);
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

	public FormatterConfig setFormatterConfigElement(String strFixml,
			String strFormat, String sName, String className) {

		strFixml = strFixml.replace("\\", "/");
		String[] fixmlSplit = strFixml.split("#");
		FormatterConfig fConfig = new FormatterConfig();
		fConfig.setSchema(sName);
		fConfig.setClassname(className);
		String[] formats = strFormat.split("#");
		List<List<Key>> keys = new ArrayList<List<Key>>();

		int i = 0;
		for (String record : fixmlSplit) {
			Key key = new Key();
			String NameValuePair = record.substring(record.indexOf("/", 1) + 2);
			String value = NameValuePair.substring(
					NameValuePair.indexOf("=") + 1).trim();
			String name = NameValuePair
					.substring(0, NameValuePair.indexOf("="));
			if (value.contains("or") && strFixml.contains("or")) {
				String value1 = value.substring(value.indexOf("=") + 1).trim();
				List<Key> keysOr = new ArrayList<Key>();
				String[] value1List = value1.split("or");
				for (int m = 0; m < value1List.length; m++) {
					Key key1 = new Key();
					value1List[m] = value1List[m].trim();
					key1.setName(name);
					key1.setValue(value1List[m]);
					key1.setParseType(this.getFormat(strFormat, formats, i));
					keysOr.add(key1);
				}
				keys.add(keysOr);
			} else {
				List<Key> keysSingle = new ArrayList<Key>();
				key = new Key();
				key.setName(name);
				key.setValue(value);
				key.setParseType(this.getFormat(strFormat, formats, i));
				keysSingle.add(key);
				keys.add(keysSingle);
			}
			i++;
		}
		fConfig.getFormatterKey().addAll(createFormatterKeys(keys));
		return fConfig;
	}

	private String getFormat(String defaultFormat, String[] formats, int i) {
		String format = null;
		if (formats.length > i) {
			format = formats[i];
		} else {
			format = defaultFormat;
		}
		if (!Constants.STR.equalsIgnoreCase(format)) {
			return format;
		}

		return null;
	}

	private List<FormatterKey> createFormatterKeys(List<List<Key>> keys) {

		List<List<Key>> combo = new ArrayList<List<Key>>();
		for (List<Key> keyx : keys) {
			List<List<Key>> tCombo = new ArrayList<List<Key>>();
			if (combo.isEmpty()) {
				// for each key create a new combo and add
				for (Key key : keyx) {
					List<Key> cKeys = new ArrayList<Key>();
					cKeys.add(key);
					tCombo.add(cKeys);
				}
			} else {
				for (Key key : keyx) {
					for (List<Key> comboKeys : combo) {
						List<Key> cKeys = new ArrayList<Key>();
						cKeys.add(key);
						cKeys.addAll(comboKeys);
						tCombo.add(cKeys);
					}
				}
			}
			combo = tCombo;
		}

		List<FormatterKey> formatterKeys = new ArrayList<FormatterKey>();
		for (List<Key> commboKey : combo) {
			FormatterKey fKey = new FormatterKey();
			fKey.setKey(commboKey);
			formatterKeys.add(fKey);
		}
		return formatterKeys;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void generateXmlConfig(String sheetName,
			TableDataFactory sheetDataFactory) throws Exception {
		// sheet name.
		String sName = sheetName.substring(0, sheetName.length() - 1);
		Map<String, Integer> mp = new HashMap<String, Integer>();
		List<Map> mapList = sheetDataFactory.getQueryData("totalData");
		String className = getClassName(sheetName, sheetDataFactory);
		if (mapList != null) {
			generateConfiguration(sName, mp, mapList, className);
		}
	}

	/**
	 * For the configuration sheet generates the xml configuration file in the
	 * output directory.
	 * 
	 * @param sName
	 * @param configuration
	 * @param binding
	 * @param mapping
	 * @param fConfig
	 * @param mp
	 * @param mapList
	 * @param className
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	private void generateConfiguration(String sName, Map<String, Integer> mp,
			List<Map> mapList, String className) throws Exception {
		// parent configuration element.
		Configuration configuration = new Configuration();
		// Binding element.
		Binding binding = new Binding();
		// Mappings element
		Mappings mapping = new Mappings();
		// Primary Key details.
		FormatterConfig fConfig = new FormatterConfig();
		DTOTransformer transformer = new DTOTransformerForEuronext(mapList);
		List<Map> samples = transformer.getObjects("totalData");

		for (Map sample : samples) {
			Field field = getField(sample);
			binding.getField().add(field);
			String strFieldName = sample.get(Constants.FIELD).toString().trim();
			String strFormat = sample.get(Constants.FORMAT).toString();
			String req = sample.get("Mandatory").toString().trim();

			Maps map = new Maps();
			if (strFieldName.equalsIgnoreCase("defaultBrokerageFee")) {
				setMapValue(map, Constants.Y, strFieldName, Constants.CNST,
						Constants.TRUE);
				mapping.getMap().add(map);
			}
			if (sample.containsKey(Constants.FIXML)) {
				String strFixml = sample.get(Constants.FIXML).toString();
				if (strFieldName.equalsIgnoreCase("messageCode")) {
					setMapValue(map, sName, sample.get(Constants.FIELD)
							.toString(), Constants.CNST, Constants.TRUE);
					mapping.getMap().add(map);
					fConfig = setFormatterConfigElement(strFixml, strFormat,
							sName, className);
				} else if (strFieldName.equalsIgnoreCase("typeOfTransfer")) {
					setMapValue(map, "P", strFieldName, Constants.CNST,
							Constants.TRUE);
					mapping.getMap().add(map);
				} else {
					map.setType(Constants.SIMPLE);
					map.setTarget(sample.get(Constants.FIELD).toString());
					strFixml = strFixml.replace("\\", "/");
					if (strFixml.contains(Constants.LIST)
							&& strFixml.contains(Constants.HASH)) {
						Switch strSwitch = mappingForFixmlList(strFixml,
								strFieldName, sName, req);
						mapping.getSwitch().add(strSwitch);
					} else if (strFixml.contains(Constants.BACK_SLASH_AT_RATE)
							&& (strFixml.contains(Constants.HASH))) {
						mappingForFixmlPty(map, sName, mapping, strFixml, req,strFormat);
					} else if (strFixml.contains("/@")
							&& !strFixml.contains("#")) {
						mappingForSimpleParser(mp, mapping, strFieldName,
								strFixml, strFormat, req);
					}
				}
			}
		}
		configuration.setMappings(mapping);
		configuration.setBinding(binding);
		if (!(fConfig.equals(null) && fConfig.equals(""))) {
			configuration.setFormatterConfig(fConfig);
		}
		generateConfigurationFile(sName, configuration);
	}

	/**
	 * @param sample
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private Field getField(Map sample) {
		Field field = new Field();
		field.setStart(sample.get(Constants.FROM).toString());
		field.setEnd(sample.get(Constants.TO).toString());
		field.setName(sample.get(Constants.FIELD).toString().trim());
		return field;
	}

	/**
	 * 
	 * @param map
	 * @param src
	 * @param target
	 * @param type
	 * @param required
	 */
	private void setMapValue(Maps map, String src, String target, String type,
			String required) {
		map.setSrc(src);
		map.setTarget(target);
		map.setType(type);
		map.setRequired(required);
	}

	/**
	 * @param sheetName
	 * @param sheetDataFactory
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private String getClassName(String sheetName,
			TableDataFactory sheetDataFactory) {
		Map requestID = sheetDataFactory.getRequestID();
		String fixmlName = (String) requestID.get(sheetName);
		String className = fixmlName.substring(0, fixmlName.indexOf("<"));
		return className;
	}
}
