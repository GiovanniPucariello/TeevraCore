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
public class FixedLengthFactoryForLiffe extends FixedLengthFactory {

	private final String ZERO = "0";
	private final String SPACE = " ";

	@Override
	public String fixedLenghtString(List<Map> bindingMap) {

		StringBuffer sb = new StringBuffer();
		String s1 = null;
		StringBuffer flString = new StringBuffer();
	
		for (Map inputList : bindingMap) {

			if (inputList.get("Set1") != null
					&& (!inputList.get("Set1").toString().equalsIgnoreCase(
							"NOMAPPING"))) {
				sb.append(FLStr(Integer.parseInt((String) inputList
						.get("Length")), (String) inputList.get("DataType"),
						(String) inputList.get("Set1")));

			} else if (inputList.get("Set1").toString().equalsIgnoreCase(
					"NOMAPPING")) {
				sb
						.append(FLStr(Integer.parseInt((String) inputList
								.get("Length")), (String) inputList
								.get("DataType"), ""));
			}
			if (inputList.get("Set2") != null) {

			}
			if (inputList.get("Set3") != null) {

			}
		}

		System.out.println(sb);
		return sb.toString();

	}

	public String FLStr(int len, String dataType, String data) {

		StringBuffer flString = new StringBuffer();
		if (dataType.equalsIgnoreCase("int")) {
			if (data.length() <= len) {
				for (int i = 0; i < len - data.length(); i++) {
					flString.append(ZERO);
				}
				flString.append(data);
			} else if (data.length() > len) {
				flString.append(data.subSequence(0, len));
			}
		} else if (dataType.equalsIgnoreCase("String")) {
			if (data.length() <= len) {
				flString.append(data);
				for (int i = 0; i < len - data.length(); i++) {
					flString.append(SPACE);
				}
			} else if (data.length() > len) {
				flString.append(data.subSequence(0, len));
			}
		}

		return flString.toString();
	}
}
