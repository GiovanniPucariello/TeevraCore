package com.headstrong.fusion.bo.java;

import javax.annotation.Generated;

//This file was generated on Fri Jan 29 16:44:12 IST 2010
@Generated(value = { "bo-accessor-generator" }, date = "Fri Jan 29 16:44:12 IST 2010")
public class BeanAccessorFactory {

	private BeanAccessorFactory() {
		// DefaultContstructor
	}

	public static BeanAccessor getBeanAccessor(Object obj) {
		// for each java class registered with this generator,
		// create a new Bean Accessor;
		BeanAccessor accessor = null;

		// Check FIXML_5_0
		accessor = com.headstrong.fusion.bo.java.generated.fixml_5_0.BeanAccessorFactory
				.getBeanAccessor(obj);
		if (accessor == null) {
			accessor = com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2.BeanAccessorFactory
					.getBeanAccessor(obj);
		}
		if (accessor == null) {
			accessor = com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0.BeanAccessorFactory
					.getBeanAccessor(obj);
		}
		// check if there was a match
		if (accessor != null) {
			accessor.setTarget(obj);
		}
		return accessor;
	}

}
