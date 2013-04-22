package com.headstrong.fusion.bo.java;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.AttributeExpression;
import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectMarshaller;
import com.headstrong.fusion.bo.AttributeExpression.FilterExpression;
import com.headstrong.fusion.bo.impl.ObjectDescriptor;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;

/**
 * Provides features of business object by wrapping a Java object within it
 * 
 * @author Akrishnamoorthy
 */
public class JavaBusinessObject implements BusinessObject {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1790969882398062226L;

	/**
	 * Marshals the current business object.
	 * 
	 */
	private BusinessObjectMarshaller businessObjectMarshaller;
	/**
	 * Java object that is wrapped inside this business object
	 */
	protected Object javaObject = null;

	/**
	 * Metadata of underlying class. ( class , getter setter methods ) stored
	 * for improving reflection calls.
	 */
	private ClassMetadata classMetadata;

	/**
	 * Creates an instance of this class with the given <code>javaObject</code>
	 * to start with. Initializes <code>javaClass</code> based on the type of
	 * the object passed
	 * 
	 * @param javaObject
	 */
	public JavaBusinessObject(Object javaObject) {
		assert javaObject != null;
		this.javaObject = javaObject;
	}

	/**
	 * Creates an instance of this class with the given <code>javaClass</code>.
	 * Creates an instance of this class and initializes <code>javaObject</code>
	 * with that. To be used when the class can be loaded only by the calling
	 * bundle.
	 * 
	 * @param javaClass
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public JavaBusinessObject(Class javaClass) throws InstantiationException,
			IllegalAccessException {
		assert javaClass != null;
		this.setClassMetadata(ClassMetadataFactory.getClasMetadata(javaClass
				.getName()));
		this.javaObject = javaClass.newInstance();
	}

	/**
	 * Creates an instance of this class with the given
	 * <code>javaClassName</code>. To be used when the class to be loaded is
	 * present in this bundle. Creates an instance of this class and initializes
	 * <code>javaObject</code> with the members present in it.
	 * 
	 * @param javaClass
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public JavaBusinessObject(String javaClassName)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		assert javaClassName != null;
		this.setClassMetadata(ClassMetadataFactory
				.getClasMetadata(javaClassName));
		this.javaObject = this.getClassMetadata().getJavaClass().newInstance();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.bo.BusinessObject#getValue(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public Object getValue(String attributeName)
			throws AttributeNotFoundException,
			InvalidAttributeExpressionException {
		assert (attributeName != null);
		// If there is a vallid bean accessor then use that.

		// Parsed attribute expression.
		AttributeExpression attributeExpression = AttributeExpression
				.parseAttributeExpression(attributeName);
		Object returnVal = null;
		try {
			// returnVal = BeanUtils.getNestedProperty(this.javaObject,
			// attributeName);
			returnVal = getValue(attributeExpression);
		} catch (IllegalArgumentException e) {
			throw new AttributeNotFoundException(attributeName, this);
		} catch (IllegalAccessException e) {
			throw new AttributeNotFoundException(attributeName, this);
		} catch (InvocationTargetException e) {
			throw new AttributeNotFoundException(attributeName, this);
		}
		/*
		 * if (returnVal instanceof List) {
		 *//**
		 * in case the return type is list convert the list to appropriate
		 * list as expected by the caller.
		 */
		/*
		 * return getValue((List<Object>) returnVal); } else
		 */if (returnVal instanceof JavaBusinessObject
				&& isPrimitive(((JavaBusinessObject) returnVal).getObject())) {
			return ((JavaBusinessObject) returnVal).getObject();
		} else {
			return returnVal;
		}
	}

	protected Object getObjectRootValue(AttributeExpression expression,
			Object obj) throws AttributeNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		Object returnVal = null;
		BeanAccessor accessor = (obj instanceof JavaBusinessObject) ? BeanAccessorFactory
				.getBeanAccessor(((JavaBusinessObject) obj).getObject())
				: BeanAccessorFactory.getBeanAccessor(obj);
		if (accessor != null) {
			returnVal = accessor.get(expression.getAttribute());
		} else {
			JavaBusinessObject javaBo = (obj instanceof JavaBusinessObject) ? (JavaBusinessObject) obj
					: new JavaBusinessObject(obj);
			if (javaBo.getClassMetadata() == null) {
				javaBo.setClassMetadata(ClassMetadataFactory
						.getClasMetadata(javaBo.getObject().getClass()
								.getName()));
			}
			if (!javaBo.getClassMetadata().hasGetterMethod(
					expression.getAttribute())) {
				// If the attribute is not accessible (i.e no gettermethod) in
				// the class then throw AttributeNotFoundException.
				throw new AttributeNotFoundException(expression.getAttribute(),
						this);
			}
			// access the value from the getter method
			Method getterMethod = javaBo.getClassMetadata().getGetterMethod(
					expression.getAttribute());
			returnVal = getterMethod.invoke(javaBo.getObject());
		}

		return returnVal;
	}

	private Object getFilteredObj(AttributeExpression expression,
			Object returnVal) throws AttributeNotFoundException,
			InvalidAttributeExpressionException {
		// Now check if its a list and there is a filter specified, return only
		// the specific element.
		if (expression.getFilterExpression() != null
				&& (returnVal instanceof List)) {
			List originalList = (List) returnVal;
			returnVal = expression.getFilterExpression().getObjectFromList(
					originalList);
		}
		return returnVal;

	}

	protected Object getObjectRootValueForSet(AttributeExpression expression,
			Object obj) throws AttributeNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, InvalidAttributeExpressionException {
		Object returnVal = getObjectRootValue(expression, obj);
		if (returnVal instanceof List) {
			List orgList = (List) returnVal;
			returnVal = getFilteredObj(expression, returnVal);
			if (returnVal instanceof List) {
				if (returnVal != orgList) {
					returnVal = orgList;
				}
			}
		}

		return returnVal;
	}

	protected Object getObjectRootValueForGet(AttributeExpression expression,
			Object obj) throws AttributeNotFoundException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException, InvalidAttributeExpressionException {
		Object returnVal = getObjectRootValue(expression, obj);
		returnVal = getFilteredObj(expression, returnVal);
		if (expression.getFilterExpression() == null
				&& !expression.isPrimitive() && (returnVal instanceof List)
				&& !((List) returnVal).isEmpty()) {
			returnVal = ((List) returnVal).get(0);
		}
		if (expression.getFilterExpression() != null
				&& (returnVal instanceof List) && ((List) returnVal).isEmpty()) {
			returnVal = null;
		}
		return returnVal;
	}

	/**
	 * Gets the value of given member variable from the internal java object
	 * 
	 * @param attrExpression
	 *            Compiled Attribute Expression.
	 * @return Attribute Expression Value.
	 * @throws AttributeNotFoundException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvalidAttributeExpressionException
	 */
	@SuppressWarnings("unchecked")
	private Object getValue(AttributeExpression attrExpression)
			throws AttributeNotFoundException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException,
			InvalidAttributeExpressionException {
		Object returnVal = null;
		Object currentObject = javaObject;
		boolean more = true;
		AttributeExpression currentExpression = attrExpression;
		while (more) {
			currentObject = getObjectRootValueForGet(currentExpression,
					currentObject);
			if (currentObject == null) {
				break;
			}
			if (!currentExpression.hasChild()) {
				returnVal = currentObject;
			}
			more = currentExpression.hasChild();
			currentExpression = currentExpression.nextAttribute();
		}
		return returnVal;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.headstrong.fusion.bo.BusinessObject#setValue(java.lang.String,
	 * java.lang.Object)
	 */
	public void setValue(String attributeName, Object attributeValue)
			throws AttributeNotFoundException,
			InvalidAttributeExpressionException {
		assert attributeName != null;
		AttributeExpression attributeExpression = AttributeExpression
				.parseAttributeExpression(attributeName);
		try {
			setValue(attributeExpression, attributeValue);
		} catch (IllegalArgumentException e) {
			throw new AttributeNotFoundException(attributeName, this);
		} catch (InstantiationException e) {
			throw new AttributeNotFoundException(attributeName, this);
		} catch (IllegalAccessException e) {
			throw new AttributeNotFoundException(attributeName, this);
		} catch (InvocationTargetException e) {
			throw new AttributeNotFoundException(attributeName, this);
		}
	}

	/**
	 * Set the value of the attribute.
	 * 
	 * @precondition attributeValues != null
	 * @param attributeName
	 * @param attributeName
	 * @param targetValue
	 * @throws AttributeNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws InvalidAttributeExpressionException
	 */
	@SuppressWarnings("unchecked")
	private void setValue(AttributeExpression attributeExpression,
			Object targetValue) throws AttributeNotFoundException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			InvalidAttributeExpressionException {
		boolean more = (null != attributeExpression);
		JavaBusinessObject targetBo = this;
		Object targetObject = javaObject;
		AttributeExpression currentExpression = attributeExpression;
		while (more) {
			// find the java Object, creating objects along the path if they
			// dont exist.
			more = currentExpression.hasChild();
			Object tempTargetObject = getObjectRootValueForSet(
					currentExpression, (new JavaBusinessObject(targetObject)));

			if (more && (tempTargetObject == null)) {
				// The path does not exist. Create it.
				// If there are more children in the hierarchy below the current
				// element but the current element is null.
				tempTargetObject = createNewObjectByReturnType(targetObject
						.getClass().getName(), currentExpression.getAttribute());
				(new JavaBusinessObject(targetObject)).setValue(
						currentExpression.getAttribute(), tempTargetObject);
			}
			if (more && (tempTargetObject instanceof List)) {
				// the path does not exist - create the path.
				// returned object should be an actual object, not a collection
				// if this element is a parametrized list, create an element in
				// this list.
				Object listObject;
				listObject = createListObject(targetBo.getObject(),
						currentExpression);
				((List) tempTargetObject).add(listObject);
				tempTargetObject = listObject;
			}

			if (!more) {// This is the last element.
				BeanAccessor accessor = BeanAccessorFactory
						.getBeanAccessor(targetObject);
				if (tempTargetObject instanceof List) {
					// the target Value itself is a list
					// so nothing can be set on it.
					// Add this object to the list.
					((List) tempTargetObject).add(targetValue);
				} else if (accessor != null) {
					accessor.set(currentExpression.getAttribute(), targetValue);
				} else {
					// set by reflection.
					Method setterMethod = ClassMetadataFactory.getClasMetadata(
							targetObject.getClass().getName()).getSetterMethod(
							currentExpression.getAttribute());
					setterMethod.invoke(targetObject, targetValue);
				}
			}

			// Checks for the next iteration.
			targetObject = tempTargetObject;
			currentExpression = (more) ? currentExpression.nextAttribute()
					: currentExpression;
			targetBo = (more) ? new JavaBusinessObject(tempTargetObject)
					: targetBo;
		}
	}

	/**
	 * Given a class name and a getter method in that class, this method returns
	 * a new instance of the return type of the getter.
	 * 
	 * @param className
	 * @param getterMethod
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	protected Object createNewObjectByReturnType(String className,
			String getterMethod) throws InstantiationException,
			IllegalAccessException {
		Object tempTargetObject = null;
		ClassMetadata mdata = ClassMetadataFactory.getClasMetadata(className);

		Method m = mdata.getGetterMethod(getterMethod);
		try {
			tempTargetObject = (new JavaBusinessObject(m.getReturnType()
					.getName())).getObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return tempTargetObject;
	}

	/**
	 * Passing an Object which has a parametrized List as an attribute, and
	 * specifying the name of this parameter will return a new object of the
	 * generic type.
	 * 
	 * @param parentObj
	 *            - Object that has a list attribute.
	 * @param listRefNameInParent
	 *            - ref name of the list attribute. Should be accessible by a
	 *            getter.
	 * @throws AttributeNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvalidAttributeExpressionException
	 */
	protected Object createListObject(Object parentObj,
			AttributeExpression expression) throws AttributeNotFoundException,
			InstantiationException, IllegalAccessException,
			InvalidAttributeExpressionException {
		Method getterMethod = ClassMetadataFactory.getClasMetadata(
				parentObj.getClass().getName()).getGetterMethod(
				expression.getAttribute());
		// add new element of type same as parameterized type and
		// add it
		// to the list
		Type genericType = getterMethod.getGenericReturnType();
		Object returnValue = null;
		if (genericType instanceof ParameterizedType) {
			ParameterizedType paramType = (ParameterizedType) genericType;
			Type[] paramArray = paramType.getActualTypeArguments();
			JavaBusinessObject item = new JavaBusinessObject(
					(Class) paramArray[0]);
			returnValue = item.getObject();
		} else {
			throw new AttributeNotFoundException(expression.getAttribute(),
					this);
		}
		if (expression.getFilterExpression() != null) {
			FilterExpression filterEx = expression.getFilterExpression();
			String key = filterEx.getFilterKey();
			String[] values = filterEx.getFilterValues();
			if (values.length == 1) {
				JavaBusinessObject o = (returnValue instanceof JavaBusinessObject) ? (JavaBusinessObject) returnValue
						: new JavaBusinessObject(returnValue.getClass());
				Method getter = o.classMetadata.getGetterMethod(key);
				if (getter == null) {
					throw new AttributeNotFoundException(key, o);
				}
				Class returnTypeClass = getter.getReturnType();
				Object valueToSet = castObject(returnTypeClass, values[0]);
				BeanAccessor accessor = BeanAccessorFactory
						.getBeanAccessor(o.javaObject);
				if (valueToSet == null && accessor != null) {
					valueToSet = values[0];
				}

				o.setValue(key, valueToSet);
				returnValue = o.getObject();
			}
		}
		return returnValue;
	}

	/**
	 * Given a class type, and a string (target) , the target is attempted to be
	 * cast into the class type. If the cast is not successful, null is
	 * returned.
	 * 
	 * @param valueToSet
	 * @param target
	 */
	protected static Object castObject(Class returnTypeClass, String target) {
		Object valueToSet = null;
		if (isPrimitive(target)) {
			if (returnTypeClass.equals(Integer.class)) {
				valueToSet = Integer.parseInt(target);
			} else if (returnTypeClass.equals(Float.class)) {
				valueToSet = Float.parseFloat(target);
			} else if (returnTypeClass.equals(Double.class)) {
				valueToSet = Double.parseDouble(target);
			} else if (returnTypeClass.equals(Boolean.class)) {
				valueToSet = Boolean.parseBoolean(target);
			} else if (returnTypeClass.equals(Short.class)) {
				valueToSet = Short.parseShort(target);
			} else if (returnTypeClass.equals(String.class)) {
				valueToSet = target;
			} else if (returnTypeClass.equals(BigInteger.class)) {
				valueToSet = new BigInteger(target);
			}
		}
		return valueToSet;
	}

	public String getSchemaName() {
		return (this.getClassMetadata() != null) ? (this.getClassMetadata()
				.getJavaClass().getName()) : null;
	}

	/**
	 * Checks if the businessObject satisfies the given filter expression. If
	 * yes, returns true, false otherwise
	 * 
	 * @return
	 * @throws InvalidAttributeExpressionException
	 */
	protected boolean filterObject(BusinessObject bo, String filterExpr,
			int index) throws InvalidAttributeExpressionException {

		if (filterExpr.indexOf("=") != -1) {
			// Equality expression
			int oprIndex = filterExpr.indexOf("=");
			String attrKey = filterExpr.substring(0, oprIndex).trim();
			String attrVal = filterExpr.substring(oprIndex + 1).trim();

			Object valueInBO = null;
			try {
				valueInBO = bo.getValue(attrKey);
			} catch (AttributeNotFoundException e) {
				return false;
			}

			// check is done on the basis of toString
			if ((valueInBO != null) && (valueInBO.toString().equals(attrVal))) {
				return true;
			} else if ((valueInBO == null) && ("null".equals(attrVal))) {
				return true;
			} else {
				return false;
			}
		} else {
			// based on subscripted variable -> index of the business object in
			// the parent list
			try {
				int requiredIndex = Integer.parseInt(filterExpr.trim());
				return (requiredIndex == index);
			} catch (NumberFormatException e) {
				return false;
			}
		}
	}

	/**
	 * Serializes this object to XML. Only the not-null attributes will be
	 * serialized.
	 * 
	 * @precondition objectDescriptor != null
	 * @postcondition
	 * @return XML string representing the business object
	 */
	public String toXml() {
		if (javaObject != null) {
			StringWriter writer = new StringWriter();
			try {
				if (this.getBusinessObjectMarshaller() != null) {
					synchronized (this.getBusinessObjectMarshaller()) {
						this.getBusinessObjectMarshaller()
								.marshal(this, writer);
					}
				} else {
					// TODO
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					XMLEncoder e = new XMLEncoder(baos);
					e.writeObject(this.getObject());
					e.close();
					return baos.toString();
				}
			} catch (Exception e) {
				return null;
			}
			return writer.toString();
		}
		return null;
	}

	/**
	 * Returns the Java object held inside this business object
	 * 
	 * @return <code>javaObject</code>
	 */
	public Object getObject() {
		return javaObject;
	}

	/**
	 * 
	 * @precondition
	 * @postcondition
	 * @param object
	 * @return
	 */
	protected static boolean isPrimitive(Object object) {
		if (object == null) {
			return false;
		}
		if (object instanceof String || object instanceof Integer
				|| object instanceof Float || object instanceof Double
				|| object instanceof Short || object instanceof Character
				|| object instanceof Boolean
				|| object instanceof XMLGregorianCalendar
				|| object instanceof BigDecimal || object instanceof Map) {
			return true;
		}
		return false;
	}

	@Override
	public Map<String, Object> getAttributeValues() {
		return null;
	}

	@Override
	public ObjectDescriptor getObjectDescriptor() {
		return null;
	}

	@Override
	public void setAttributeValues(Map<String, Object> attributeValues) {
	}

	@Override
	public void setObjectDescriptor(ObjectDescriptor objectDescriptor) {
		// TODO Auto-generated method stub

	}

	@Override
	public BusinessObjectMarshaller getBusinessObjectMarshaller() {
		return this.businessObjectMarshaller;
	}

	@Override
	public void setBusinessObjectMarshaller(
			BusinessObjectMarshaller businessObjectMarshaller) {
		this.businessObjectMarshaller = businessObjectMarshaller;
	}

	public ClassMetadata getClassMetadata() {
		return classMetadata;
	}

	public void setClassMetadata(ClassMetadata classMetadata) {
		this.classMetadata = classMetadata;
	}
}
