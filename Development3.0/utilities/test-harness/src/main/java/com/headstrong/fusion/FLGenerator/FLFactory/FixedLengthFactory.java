/**
 * 
 */
package com.headstrong.fusion.FLGenerator.FLFactory;

import java.util.List;
import java.util.Map;

/**
 * @author paakash
 * 
 */
public abstract class FixedLengthFactory {

	public static FixedLengthFactory getFactor(String factoryName) {
		if (factoryName.equalsIgnoreCase("Liffe")) {
			return new FixedLengthFactoryForLiffe();

		}
		return null;
	}

	public abstract String fixedLenghtString(List<Map> bindingMap);
		
}
