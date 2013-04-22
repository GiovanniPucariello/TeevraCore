package com.headstrong.fusion.bo.generator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.headstrong.fusion.bo.generator.components.AccessorFactoryGenerator;
import com.headstrong.fusion.bo.generator.components.AccessorGenerator;
import com.headstrong.fusion.bo.generator.components.ClassFileCreator;
import com.headstrong.fusion.bo.generator.components.TemplateGenerator;

public class GenerateAccessors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> inputs = parseInput(args);
		Properties p = loadProperties(inputs);
		TemplateGenerator.setAppProperties(p);
		ClassFileCreator fct = AccessorFactoryGenerator.getInstance();
		ClassFileCreator act = AccessorGenerator.getSoleInstance();
		act.createClass();
		fct.createClass();
	}

	private static Properties loadProperties(Map<String, String> inputs) {
		String propFilePath = (inputs.containsKey("props"))?inputs.get("props"):"tool.properties";
		inputs.remove("props");
		Properties pr = new Properties();
		pr.putAll(inputs);
		try {
			pr.load(AccessorFactoryGenerator.class.getResourceAsStream("/"+propFilePath));
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return pr;
	}

	/**
	 * Returns a map of values marked by a unix style argument in a key-value
	 * map. example "-class com.abc.x    -msg  Hello" will return a key value
	 * map with "-class" <-> "com.abc.x" and "-msg"<->"Hello" as entries.
	 * 
	 * @param str
	 *            - input string
	 * @return
	 */
	private static Map<String, String> parseInput(String[] str) {
		Map<String, String> map = new HashMap();
		for (int i = 0; i < str.length; i++) {
			String arg = str[i];
			if (arg.startsWith("-")) {
				String keyword = arg.substring(1);
				while (true) {
					int c = ++i;
					if ("".equals(str[c]) || " ".equals(str[c])) {
						continue;
					}
					map.put(keyword, str[c]);
					break;
				}
			}
		}
		return map;
	}

}
