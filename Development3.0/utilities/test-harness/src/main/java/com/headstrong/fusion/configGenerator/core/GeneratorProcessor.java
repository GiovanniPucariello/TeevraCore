package com.headstrong.fusion.configGenerator.core;

/**
 * Interface that gets implemented to convert the Data from  DTOTransformer and Parser into an XML
 * @author satyaukv
 *
 */
public interface GeneratorProcessor {
	

	/**
	 * Method used to define the process of converting into and XML
	 */
	public abstract void process();

}