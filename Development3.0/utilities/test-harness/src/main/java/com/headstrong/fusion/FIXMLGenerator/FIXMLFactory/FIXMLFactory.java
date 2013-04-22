/**
 * 
 */
package com.headstrong.fusion.FIXMLGenerator.FIXMLFactory;

import java.util.List;
import java.util.Map;

/**
 * @author mtiwari
 * 
 */
public abstract class FIXMLFactory {

	public static FIXMLFactory getFactory(String factoryName) {
		if (factoryName.equalsIgnoreCase("Liffe")) {
			return new FIXMLFactoryForLiffe();

		}
		return null;
	}

	public abstract String fixmlString(List<Map> bindingList, String rootElement);

}
