package com.headstrong.fusion.configGenerator.core;

import java.util.Properties;

/**
 * take properties file as an input and passes on the details to DataFactory
 * 
 * @author satyaukv
 */
public class ConfigGenerator {

	GeneratorProcessor processor;

	/**
	 * Constructs this object with properties details constructor invokes
	 * GeneratorProcessor which converts sheet Data in Maps into an XML
	 * 
	 * @param p
	 */
	public ConfigGenerator(Properties p) {
		super();
		String configFile_reader = p.getProperty("DATABASE_URL");
		if (configFile_reader.contains("Test")) {
			processor = new GeneratorProcessorForTestAutomation(p);
		}
	}

	/**
	 * method calls the process method which defines the process of creating the
	 * XMLs
	 */
	public void process() {
		processor.process();

	}

	/**
	 * sets the processor variable in this method
	 * 
	 * @param processor
	 */
	public void setProcessor(GeneratorProcessor processor) {
		this.processor = processor;
	}

}
