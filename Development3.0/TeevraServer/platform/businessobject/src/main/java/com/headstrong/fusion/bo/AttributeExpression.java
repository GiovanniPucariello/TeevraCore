/**
 * 
 */
package com.headstrong.fusion.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

/**
 * Parses the Attribute and creates a heirarchical Attribute Expression.
 * 
 */
public class AttributeExpression {

	private static final String NESTED_DELIMITER = ".";

	private static final String INDEX_START_DELIMITER = "[";

	private static final String INDEX_END_DELIMITER = "]";

	private static final String EXPRESSION_DELIMITER = ",";

	private static Map<String, AttributeExpression> attribExpressionCache = new HashMap<String, AttributeExpression>();

	/**
	 * Attribute Name
	 */
	private String attribute;
	/**
	 * if it contains any child attribute FIXME :: Rename
	 */
	private boolean isPrimitive;
	/**
	 * Filter Expression for array / ArrayList filtering TODO :: Make it more
	 * generic.
	 */
	private FilterExpression filterExpression;
	/**
	 * Next level attribute in case its not primitive.
	 */
	private AttributeExpression nextAttribute;

	private AttributeExpression() {
		// TODO Auto-generated constructor stub
	}

	public static AttributeExpression parseAttributeExpression(
			String attributeExpressionStr)
			throws InvalidAttributeExpressionException {
		if (attribExpressionCache.containsKey(attributeExpressionStr)) {
			return attribExpressionCache.get(attributeExpressionStr);
		}
		// Performing Null Check
		if (attributeExpressionStr == null) {

			throw new InvalidAttributeExpressionException(
					attributeExpressionStr, null);
		}
		/**
		 * Checking for existence of any Special Characters in
		 * attributeExpressionStr
		 */
		for (int j = 0; j < attributeExpressionStr.length(); j++) {
			if ((attributeExpressionStr.charAt(j) < 48
					&& attributeExpressionStr.charAt(j) != 43
					&& attributeExpressionStr.charAt(j) != 46 && attributeExpressionStr
					.charAt(j) != 32) // Excluding the check for plus and dot
					// characters.
					// Check for Space excluded after Bug #615 (Enter Exercise
					// for option is not working) was raised.
					|| (attributeExpressionStr.charAt(j) > 57
							&& attributeExpressionStr.charAt(j) < 65 && attributeExpressionStr
							.charAt(j) != 61) // Excluding the check for equal
					// to character
					|| (attributeExpressionStr.charAt(j) > 93 && attributeExpressionStr
							.charAt(j) < 97)
					|| (attributeExpressionStr.charAt(j) > 122 && attributeExpressionStr
							.charAt(j) != 127))// Special characters ASCII range

			{
				throw new InvalidAttributeExpressionException(
						attributeExpressionStr, null);
			}
		}
		String[] splitString = attributeExpressionStr.split("[.]");
		for (int i = 0; i < splitString.length; i++) {

			// Checking for multiple spaces and consecutively dotted expression
			if ((splitString[i].trim().length() == 0 || (""
					.equals(splitString[i]))))

				throw new InvalidAttributeExpressionException(
						attributeExpressionStr, null);
		}
		AttributeExpression parentExpression = null;
		AttributeExpression rootExpression = null;
		for (int i = 0; i < (splitString.length); i++) {
			AttributeExpression currentExpression = new AttributeExpression();

			// Start processing the current Attribute.
			if (i == (splitString.length - 1)) {
				currentExpression.setPrimitive(true);
			}
			String currentAttribute = splitString[i];
			int startFilterIndex = currentAttribute
					.indexOf(INDEX_START_DELIMITER);
			int endFilterIndex = currentAttribute.indexOf(INDEX_END_DELIMITER);

			String filterExpression = null;
			if ((startFilterIndex != -1) && (endFilterIndex != -1)) {
				filterExpression = currentAttribute.substring(
						startFilterIndex + 1, endFilterIndex);
				currentExpression.filterExpression = new FilterExpression(
						filterExpression);
			}

			if (filterExpression != null) {
				currentExpression.setAttribute(currentAttribute.substring(0,
						currentAttribute.indexOf(INDEX_START_DELIMITER)));
			} else {
				currentExpression.setAttribute(currentAttribute);
			}
			// Start processing the current Attribute.

			if (i == 0) {
				parentExpression = currentExpression;
				rootExpression = currentExpression;
			} else {
				parentExpression.nextAttribute = currentExpression;
				parentExpression = currentExpression;
			}
		}
		// parse rest of the expression
		attribExpressionCache.put(attributeExpressionStr, rootExpression);
		return rootExpression;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public boolean isPrimitive() {
		return isPrimitive;
	}

	public void setPrimitive(boolean isPrimitive) {
		this.isPrimitive = isPrimitive;
	}

	public FilterExpression getFilterExpression() {
		return filterExpression;
	}

	public boolean hasChild() {
		return (nextAttribute == null) ? false : true;
	}

	public AttributeExpression nextAttribute() {
		return nextAttribute;
	}

	public static class FilterExpression {
		int index;
		String filterKey;
		String[] filterValues;
		filterTypeEnum filter;

		private enum filterTypeEnum {
			INDEX, KEYVALUE;
		}

		public FilterExpression(String filterExpression) {
			if (filterExpression.indexOf("=") > -1) {
				filter = filterTypeEnum.KEYVALUE;
				String[] str = filterExpression.split("[=]");
				filterKey = str[0].trim();
				filterValues = parseDelimitedValue(str[1].trim());
			} else {
				filter = filterTypeEnum.INDEX;
				index = Integer.parseInt(filterExpression);
			}
		}

		/**
		 * Parse the filter data by getting an array from delimiter and
		 * trimming.
		 * 
		 * @param trim
		 * @return
		 */
		private String[] parseDelimitedValue(String trim) {
			String[] returnValue = null;
			if (trim.contains(EXPRESSION_DELIMITER)) {
				returnValue = trim.split(EXPRESSION_DELIMITER);
			} else {
				returnValue = new String[] { trim };
			}
			for (int i = 0; i < returnValue.length; i++) {
				returnValue[i] = returnValue[i].trim();
			}
			return returnValue;
		}

		/**
		 * If a list is passed to this method, then depending on the filter
		 * attributes, either a new sublist with all matching elements or just
		 * the matching element in case there is a single match. In case of
		 * indexed expression this results in just a single element being
		 * returned.
		 * 
		 * @param filterList
		 * @return
		 * @throws AttributeNotFoundException
		 * @throws InvalidAttributeExpressionException
		 */
		public Object getObjectFromList(List filterList)
				throws AttributeNotFoundException,
				InvalidAttributeExpressionException {
			Object obj = null;
			switch (filter) {
			case INDEX:
				if (filterList != null && filterList.size() > index) {
					obj = filterList.get(index);
				}
				break;
			case KEYVALUE:
				List returnList = matchListItems(filterList);
				if (returnList.size() == 1) {
					obj = returnList.get(0);
				} else {
					obj = returnList;
				}
				break;

			default:
				break;
			}
			return obj;
		}

		/**
		 * @param filterList
		 * @return
		 * @throws AttributeNotFoundException
		 * @throws InvalidAttributeExpressionException
		 */
		private List matchListItems(List filterList)
				throws AttributeNotFoundException,
				InvalidAttributeExpressionException {
			List returnList = new ArrayList();
			for (String value : filterValues) {
				for (Object o : filterList) {
					BusinessObject jo = (BusinessObject) ((o instanceof BusinessObject) ? o
							: new JavaBusinessObject(o));
					Object objectValue = jo.getValue(filterKey);
					if (objectValue != null) {
						if ((value).equals(objectValue.toString())) {
							returnList.add(o);
						}
					}
				}
			}
			return returnList;
		}

		/**
		 * @return the filterValues
		 */
		public String[] getFilterValues() {
			return filterValues.clone();
		}

		/**
		 * @return the filterKey
		 */
		public String getFilterKey() {
			return filterKey;
		}

	}

}
