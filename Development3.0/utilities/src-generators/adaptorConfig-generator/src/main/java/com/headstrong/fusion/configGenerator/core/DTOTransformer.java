package com.headstrong.fusion.configGenerator.core;

import java.util.List;
/**
 * Gets the header, body and footer data from DTOParser and transforms and segregates into Response 
 * and Request Data Maps.
 * @author satyaukv
 */
public interface DTOTransformer {
/**
 * returna a list of Maps each for Response and Request
 * @param objType
 * @return
 */
	 public List getObjects(String objType);
}
