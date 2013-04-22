package com.headstrong.fusion.configGenerator.commObjs;

import java.util.Map;

/**
 * This converts Raw Data from excel and separates into Header, Body and Footer
 * Maps.
 * 
 * @author satyaukv
 * 
 */
public interface DTOParser {

	/**
	 * Returns the header data in the form of a Map
	 * 
	 * @return
	 */
	public Map getHeader();

	/**
	 * Returns the payload in the form of a Map
	 * 
	 * @return
	 */
	public Map getBody();

	/**
	 * Returns the Footer in the form of a Map
	 * 
	 * @return
	 */
	public Map getFooter();

	/**
	 * Returns the Metadata of this type.
	 * 
	 * @return
	 */
	public Map getMetaData();

	/**
	 * Gets the sequence number in case of broadcast messages.
	 */
	public Map getSeqNo();
	/**
	 * Gets the sequence number in case of broadcast messages.
	 */
	public Map getErrorStruct();

}
