package com.headstrong.fusion.configGenerator.launcher;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.headstrong.fusion.configGenerator.core.GeneratorProcessor;
import com.headstrong.fusion.configGenerator.core.GeneratorProcessorFactory;
import com.headstrong.fusion.configGenerator.core.PropertyManager;
import com.headstrong.fusion.configGenerator.core.GeneratorProcessorFactory.Module;

/**
 * Configuration generation Launcher Class.
 * 
 */
public class ConfigGeneratorLauncher {

	/**
	 * 
	 * @param args
	 *            {@link SystemType}
	 */
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println(usage());
			return;
		}
		Module module = getModule(args[0]);
		loadProperties(args[1]);
		GeneratorProcessor gen = GeneratorProcessorFactory.getProcessor(module);
		gen.process();
	}

	private static String usage() {
		return ConfigGeneratorLauncher.class.getSimpleName()
				+ " Liffe/Euronext/Eurex";
	}

	/**
	 * Returns the module enum.
	 * 
	 * @param moduleName
	 * @return
	 * @throws Exception
	 */
	private static Module getModule(String moduleName) throws Exception {
		Module module = null;
		try {
			module = Module.valueOf(moduleName);
		} catch (Exception e) {
			throw new Exception(
					"Invalid system type specified supported systems"
							+ Module.values());
		}
		return module;
	}

	/**
	 * Takes the location of the properties File and returns property map.
	 * 
	 * @param propFileName
	 * @return
	 */
	private static Properties loadProperties(String propFileName)
			throws Exception {
		InputStream inStream = ConfigGeneratorLauncher.class.getResourceAsStream("/"+propFileName);
		Properties props = null;
		props = new Properties();
		props.load(inStream);
		// Initialize PropertyManager
		PropertyManager.getInstance(props);
		return props;
	}

}
