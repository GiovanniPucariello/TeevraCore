package com.headstrong.fusion.configGenerator.launcher;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.headstrong.fusion.configGenerator.core.ConfigGenerator;

public class ConfigGeneratorLauncher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String propFileName = args[0];
		Properties p = loadProperties(propFileName);
		ConfigGenerator gen = new ConfigGenerator(p);
		gen.process();
	}

	/**
	 * Takes the location of the properties File and returns property map.
	 * @param propFileName
	 * @return
	 */
	private static Properties loadProperties(String propFileName) {
		InputStream inStream =  ConfigGeneratorLauncher.class.getResourceAsStream("/"+propFileName);
		Properties props =  null;
		try {
			props = new Properties();
			props.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}

}
