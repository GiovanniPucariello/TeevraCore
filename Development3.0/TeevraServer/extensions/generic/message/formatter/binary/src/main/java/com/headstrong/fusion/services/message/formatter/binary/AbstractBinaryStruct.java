/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: AbstractBinaryStruct.java
 * $Revision: 
 * $Author: akrishnamoorthy
 * $DateTime: May 21, 2009 
 */

package com.headstrong.fusion.services.message.formatter.binary;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javolution.io.Struct;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectSource;
import com.headstrong.fusion.bo.dyn.DynamicBusinessObject;
import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.impl.exception.InvalidAttributeExpressionException;
import com.headstrong.fusion.services.message.formatter.binary.exception.InvalidBinaryTypeException;
import com.headstrong.fusion.services.message.formatter.binary.exception.MemberNotFoundException;

/**
 * Dynamic struct based on Javolution with which you can add member, inner
 * struct, member array and inner struct array. This class can also be used to
 * load the details in BusinessObject to a Struct as well as fetch the details
 * in Business Object as Struct
 */
public abstract class AbstractBinaryStruct extends Struct {
	private static Logger logger = LoggerFactory
			.getLogger(AbstractBinaryStruct.class);

	private static final String STR_SPACE = " ";

	private static final String COUNTER_RESPONSE = "COUNTER_RESPONSE";
	public static final String REQUEST = "REQUEST";

	private static final String RESPONSE = "RESPONSE";

	private static final int START_ASCII = 32;
	private static final int END_ASCII = 126;

	public ByteOrder byteOrder() {
		return ByteOrder.LITTLE_ENDIAN;
	}

	/**
	 * Map containining the actual member objects.
	 */
	private final Map<String, Object> memberMap = new HashMap<String, Object>();

	private BusinessObjectSource boSource;
//	private static String responseType;

	public static final String BYTE = "BYTE";

	public static final String INT = "INT";
	public static final String UINT = "UINT";

	public static final String SHORT = "SHORT";
	public static final String USHORT = "USHORT";

	public static final String FLOAT = "FLOAT";
	public static final String DOUBLE = "DOUBLE";

	public static final String CHAR = "CHAR";
	public static final String UCHAR = "UCHAR";

	public static final String LONG = "LONG";

	public static final String UTFSTRING = "UTFSTRING";

	public static final int BIG_ENDIAN = 1;
	public static final int LITTLE_ENDIAN = 2;

	/**
	 * BIG / LITTLE ENDIAN for this struct. By default set to LITTLE ENDIAN
	 */
	private ByteOrder endian = ByteOrder.LITTLE_ENDIAN;

	/**
	 * Maps attribute name in business object to user defined datatype in BO
	 */
	private static Map<String, String> memberDatatypes;

	/**
	 * 
	 */
	public AbstractBinaryStruct() {
		super();
		this.boSource = new BusinessObjectSource() {
			@Override
			public BusinessObject getBusinessObject() {
				return new DynamicBusinessObject();
			}
		};
	}

	/**
	 * Maps user defined datatype to the corresponding default value
	 */
	private static Map<String, String> datatypeDefaults;

	@Override
	public boolean isUnion() {
		return true;
	}

	public Map<String, Object> getMemberMap() {
		return memberMap;
	}

	/**
	 * Adds a primitive member into the struct. As these member classes are
	 * inner classes , they automatically reserve their location in the parent
	 * struct's byte array. That is the way the Struct is able to include the
	 * members into it
	 * 
	 * @param name
	 * @param type
	 * @throws InvalidBinaryTypeException
	 */
	public void addMember(String name, String type)
			throws InvalidBinaryTypeException {
		Member member;
		if (BYTE.equalsIgnoreCase(type)) {
			member = new Signed8();
		} else if (INT.equalsIgnoreCase(type)) {
			member = new Signed32();
		} else if (UINT.equalsIgnoreCase(type)) {
			member = new Unsigned32();
		} else if (SHORT.equalsIgnoreCase(type)) {
			member = new Signed16();
		} else if (USHORT.equalsIgnoreCase(type)) {
			member = new Unsigned16();
		} else if (FLOAT.equalsIgnoreCase(type)) {
			member = new Float32();
		} else if (DOUBLE.equalsIgnoreCase(type)) {
			member = new Float64();
		} else if (CHAR.equalsIgnoreCase(type)) {
			member = new Signed8();
		} else if (UCHAR.equalsIgnoreCase(type)) {
			member = new Unsigned8();
		} else if (LONG.equalsIgnoreCase(type)) {
			member = new Signed64();
		} else {
			throw new InvalidBinaryTypeException(type
					+ " is not defined binary type");
		}
		memberMap.put(name, member);
	}

	/**
	 * Adds the given member. Can be used for setting both array and non-array
	 * member
	 * 
	 * @param name
	 * @param type
	 * @param size
	 * @throws Exception
	 */
	public void addMember(String name, String type, String size)
			throws Exception {
		if (size == null) {
			addMember(name, type);
		} else if (UTFSTRING.equals(type)) {
			memberMap.put(name, new UTF8String(Integer.parseInt(size)));
		} else {
			Member m[] = null;
			if (BYTE.equals(type)) {
				m = new Signed8[Integer.parseInt(size)];
			} else if (INT.equals(type)) {
				m = new Signed32[Integer.parseInt(size)];
			} else if (UINT.equals(type)) {
				m = new Unsigned32[Integer.parseInt(size)];
			} else if (SHORT.equals(type)) {
				m = new Signed16[Integer.parseInt(size)];
			} else if (USHORT.equals(type)) {
				m = new Unsigned16[Integer.parseInt(size)];
			} else if (FLOAT.equals(type)) {
				m = new Float32[Integer.parseInt(size)];
			} else if (DOUBLE.equals(type)) {
				m = new Float64[Integer.parseInt(size)];
			} else if (CHAR.equals(type)) {
				m = new Signed8[Integer.parseInt(size)];
			} else if (UCHAR.equals(type)) {
				m = new Unsigned8[Integer.parseInt(size)];
			} else if (LONG.equals(type)) {
				m = new Signed64[Integer.parseInt(size)];
			}
			if (m != null) {
				m = this.array(m);
				memberMap.put(name, m);
			} else {
				throw new Exception("Unsupported datatype " + type
						+ "passed to addMember");
			}
		}
	}

	/**
	 * Sets big endian or little endian to be used when byte array is set
	 * 
	 * @param e
	 */
	public void setEndian(int e) {
		switch (e) {
		case BIG_ENDIAN:
			endian = ByteOrder.BIG_ENDIAN;
			break;
		case LITTLE_ENDIAN:
			endian = ByteOrder.LITTLE_ENDIAN;
		}
	}

	/**
	 * Loads this structure with the given byte array
	 * 
	 * @param byteArray
	 */
	public void setByteArray(byte[] byteArray) {
		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
		byteBuffer.order(endian);
		this.setByteBuffer(byteBuffer, 0);
	}

	/**
	 * Sets the business object in this struct
	 * 
	 * @param namespace
	 *            Context in which BO is set in the struct. When it is called
	 *            directly for the first time at the root level it should be an
	 *            empty string. When called internally through setMember it
	 *            should have its trace from the root struct in dotted notation
	 * @param bo
	 * @param struct
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public void setBusinessObjectIntoStruct(String namespace, BusinessObject bo)
			throws MemberNotFoundException, InvalidAttributeExpressionException {
		setBusinessObjectIntoStruct(namespace, bo, null, null, null);
	}

	/**
	 * Sets the business object in this struct. If values are not present in
	 * business object for some of the struct, then they are initialized with
	 * the default values specified in the given map based on the datatype of
	 * the attribute in business object
	 * 
	 * @param namespace
	 *            Refer the overloaded function for description
	 * @param bo
	 * @param struct
	 * @param memberDatatypes
	 * @param datatypeDefaults
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public void setBusinessObjectIntoStruct(String namespace,
			BusinessObject bo, Map<String, String> memberDatatypes,
			Map<String, String> datatypeDefaults, String responseType)
			throws MemberNotFoundException, InvalidAttributeExpressionException {
		this.memberDatatypes = memberDatatypes;
		this.datatypeDefaults = datatypeDefaults;
//		this.responseType = responseType;

		for (String memberName : memberMap.keySet()) {
			Object val = null;
			if (bo != null) {
				try {
					val = bo.getValue(memberName);
				} catch (AttributeNotFoundException e) {
					// ignore this exception as it can happen that optional
					// fields
					// are not populated in BO
					continue;
				}
			}
			setMember(namespace, memberName, val, responseType);
		}
	}

	/**
	 * Sets the given data in the current struct's member identified by the name
	 * 
	 * @param namespace
	 *            prefix for member name (dotted notation with a dot at the end)
	 * @param name
	 *            Member name
	 * @param data
	 *            Value to be set, obtained from Business Object
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public void setMember(String namespace, String name, Object data, String responseType)
			throws MemberNotFoundException, InvalidAttributeExpressionException {
		// dont set the value in the member if no value is present in BO as well
		// as no default value is present for that datatype
		if ((data == null) && (datatypeDefaults == null)) {
			return;
		}

		Object member = memberMap.get(name);
		setMember(namespace, name, data, member, responseType);
	}

	/**
	 * Sets the value <code>data</code> in the given <code>member</code>
	 * object
	 * 
	 * @param namespace
	 *            Prefix (dotted notation ennding with a dot) that needs to be
	 *            used along with the name to lookup member's datatype
	 * @param name
	 *            identifies the name of the member in the parent struct
	 * @param data
	 *            value to be set in the member
	 * @param member
	 *            instance of a specific member inside which value has to be set
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	protected void setMember(String namespace, String name, Object data,
			Object member,String responseType) throws MemberNotFoundException, InvalidAttributeExpressionException {
		if (member instanceof Member) {
			setPrimitiveMember(namespace, name, data, (Member) member, responseType);
		} else if (member instanceof Member[]) {// array of primitive members
			setPrimitiveMemberArray(namespace, name, (Member[]) member, data, responseType);
		} else if (member instanceof AbstractBinaryStruct) {// inner struct
			AbstractBinaryStruct memberStruct = (AbstractBinaryStruct) member;
			if (data == null) {
				// if no BO is passed, initialize inner struct with default
				// values
				memberStruct.setBusinessObjectIntoStruct(
						namespace + name + ".", null, memberDatatypes,
						datatypeDefaults, responseType);
			}
			// populate the inner structure only when there is a value in
			// the business Object
			if ((data != null) && (data instanceof BusinessObject)) {
				memberStruct.setBusinessObjectIntoStruct(
						namespace + name + ".", (BusinessObject) data,
						memberDatatypes, datatypeDefaults, responseType);
			}
		} else if (member instanceof AbstractBinaryStruct[]) {// inner struct
			// array
			setInnerStructArray(namespace + name + ".", name,
					(AbstractBinaryStruct[]) member, data, responseType);
		} else {
			throw new MemberNotFoundException(name + " not a valid member");
		}
	}

	/**
	 * Sets the given data in the primitive member. If data is not present, uses
	 * the default value based on its datatype
	 * 
	 * @param namespace
	 * @param name
	 * @param data
	 * @param member
	 */
	protected void setPrimitiveMember(String namespace, String name,
			Object data, Member member, String responseType) {
		if (data == null) {
			data = getDefaultValue(namespace, name, responseType);
			if (data == null) {// if no default value is obtained still
				return;
			}

			if (data instanceof String) {
				data = data.toString().charAt(0);
			}
		}

		if (member instanceof Signed8) {
			if (data instanceof String) {
				logger
						.debug("Data coming as String instead of Character for field"
								+ namespace
								+ ":"
								+ name
								+ " with a value -->"
								+ data + "<-- ");
				data = data.toString().charAt(0);
			}
			byte b = (byte) ((Character) data).charValue();
			((Signed8) member).set(b);
		} else if (member instanceof Signed32) {
			((Signed32) member).set(Integer.parseInt(data.toString()));
		} else if (member instanceof Unsigned32) {
			((Unsigned32) member).set(Long.parseLong(data.toString()));
		} else if (member instanceof Signed16) {
			((Signed16) member).set(Short.parseShort(data.toString()));
		} else if (member instanceof Unsigned16) {
			((Unsigned16) member).set(Integer.parseInt(data.toString()));
		} else if (member instanceof Float32) {
			((Float32) member).set(Float.parseFloat(data.toString()));
		} else if (member instanceof Float64) {
			((Float64) member).set(Double.parseDouble(data.toString()));
		} else if (member instanceof Unsigned8) {
			((Unsigned8) member).set(Short.parseShort(data.toString()));
		} else if (member instanceof UTF8String) {
			((UTF8String) member).set(data.toString());
		} else if (member instanceof Signed64) {
			((Signed64) member).set(Long.parseLong(data.toString()));
		}
	}

	/**
	 * Sets the value in the primitive member array. If the corresponding value
	 * in business object is an array of lesser size, remaining elements will be
	 * initialized with the default value present in the defaultValues map based
	 * on the type of member. If no defaultValues map is present, the remaining
	 * elements in the array are left as it is without initialization.
	 * 
	 * @param namespace
	 * @param name
	 * @param memberArray
	 * @param data
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	protected void setPrimitiveMemberArray(String namespace, String name,
			Member[] memberArray, Object data, String responseType) throws MemberNotFoundException, InvalidAttributeExpressionException {
		if (memberArray.length == 0) {
			return;
		}
		int memberArrayLen = memberArray.length;
		boolean usingDefault = false;

		// get the default value, if the given value is missing
		if (data == null) {
			data = getDefaultValue(namespace, name, responseType);
			if (data == null) {// if no default value is obtained still
				return;
			}
			usingDefault = true;
		}

		if (data instanceof String) {
			// for string, whatever value is passed, it has to be set in.
			// Remaining elements will be set with the last character passed
			// with the data if default value needs to be used
			char[] charArray = ((String) data).toCharArray();
			int srcLen = charArray.length;
			if (srcLen > memberArrayLen) {
				throw new MemberNotFoundException(
						"ArrayIndexOutOfBoundsException for member " + name
								+ " where expected size is " + memberArrayLen
								+ " but the received length in BO is " + srcLen);
			}
			Character lastChar = '\0';
			for (int i = 0; i < srcLen; i++) {
				lastChar = Character.valueOf(charArray[i]);
				setMember(namespace, name, lastChar, memberArray[i], responseType);
			}

			if (usingDefault) {
				// initialize the remaining elements with the last obtained char
				for (int i = srcLen; i < memberArrayLen; i++) {
					setMember(namespace, name, lastChar, memberArray[i],responseType);
				}
			}
		} else if (usingDefault) {
			// set the default value in all the member elements
			for (int i = 0; i < memberArrayLen; i++) {
				setMember(namespace, name, data, memberArray[i],responseType);
			}
		} else if (data instanceof Object[]) {
			// we have received an object[] and the member is not a string
			Object[] boValueArray = (Object[]) data;
			if (boValueArray.length > memberArrayLen) {
				throw new MemberNotFoundException(
						"ArrayIndexOutOfBoundsException for member " + name
								+ " where expected size is " + memberArrayLen
								+ " but the received length in BO is "
								+ boValueArray.length);
			}

			// populate all the elements that are present in BO
			for (int i = 0; i < boValueArray.length; i++) {
				setMember(namespace, name, boValueArray[i], memberArray[i],responseType);
			}

			// for the remaining positions in the array for which BO didn't
			// carry a
			// value, set the default value if it is found or else ignore it
			Object defaultValue = getDefaultValue(namespace, name, responseType);
			if (defaultValue != null) {
				for (int i = boValueArray.length; i < memberArrayLen; i++) {
					setMember(namespace, name, defaultValue, memberArray[i],responseType);
				}
			}
		}
	}

	/**
	 * Sets the given BusinessObject list data as values inside the
	 * innerStructArray. Names in the struct map the attribute names in the
	 * business object. If the given data is not a list but a single
	 * BusinessObject, it will be converted to a list with single element and
	 * processed.
	 * 
	 * @param namespace
	 *            Prefix for memberName with reference to root structure
	 * @param memberName
	 * @param innerStructArray
	 * @param data
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	@SuppressWarnings("unchecked")
	protected void setInnerStructArray(String namespace, String memberName,
			AbstractBinaryStruct[] innerStructArray, Object data, String responseType)
			throws MemberNotFoundException, InvalidAttributeExpressionException {
		if (data == null) {
			// fill the innerStructArray with default contents recursively
			for (int i = 0; i < innerStructArray.length; i++) {
				AbstractBinaryStruct currentStruct = innerStructArray[i];
				currentStruct.setBusinessObjectIntoStruct(namespace, null,
						memberDatatypes, datatypeDefaults, responseType);
			}
			return;
		}

		List boList = null;
		// if the input data is not a list, but as a short cut directly given
		// convert it into a list
		if (!(data instanceof List) && (data instanceof BusinessObject)) {
			boList = new ArrayList();
			boList.add(data);
		} else {
			boList = (List) data;
		}

		// in case more elements are passed throw an exception
		if (boList.size() > innerStructArray.length) {
			throw new MemberNotFoundException(
					"ArrayIndexOutOfBoundsException: Expecting a list instance of length less "
							+ "than or equal to " + innerStructArray.length
							+ " for member " + memberName);
		}

		// copy contents in BO list to struct Array
		for (int i = 0; i < boList.size(); i++) {
			AbstractBinaryStruct currentStruct = innerStructArray[i];
			BusinessObject currentBO = (BusinessObject) boList.get(i);
			currentStruct.setBusinessObjectIntoStruct(namespace, currentBO,
					memberDatatypes, datatypeDefaults, responseType);
		}

		// for the remaining elements in struct Array for which there are no
		// values in BO, set the default value
		if (boList.size() < innerStructArray.length) {
			for (int i = boList.size(); i < innerStructArray.length; i++) {
				AbstractBinaryStruct currentStruct = innerStructArray[i];
				currentStruct.setBusinessObjectIntoStruct(namespace, null,
						memberDatatypes, datatypeDefaults, responseType);
			}
		}
	}

	/**
	 * Gets the datatype of the given member and based on that returns the
	 * default value
	 * 
	 * @param namespace
	 * @param memberName
	 * @return
	 */
	private Object getDefaultValue(String namespace, String memberName, String responseType) {
		if ((memberDatatypes == null) || (datatypeDefaults == null)) {
			return null;
		}
		logger.debug("responseType default type-->"+ responseType );
		Object defaultValue = new Object();
		String memberDatatype = memberDatatypes.get(namespace + memberName);
		if (responseType.equals(COUNTER_RESPONSE)
				|| responseType.equals(REQUEST)) {
			defaultValue = (memberDatatype != null) ? datatypeDefaults
					.get(memberDatatype) : null;
		} else if (responseType.equals(RESPONSE)) {
			defaultValue = STR_SPACE;
		}
		return defaultValue;
	}

	/**
	 * Creates a new DynamicBusinessObject from the struct. Individual fields
	 * from the struct map to corresponding attributes in the business Object.
	 * 
	 * @param namespace
	 * @param struct
	 * @param bo
	 * @return
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public BusinessObject getBusinessObjectFromStruct(String namespace,
			BusinessObject bo, String responseType) throws MemberNotFoundException, InvalidAttributeExpressionException {
		return getBusinessObjectFromStruct(namespace, bo, null, null,
				 responseType);
	}

	/**
	 * In addition to the above method's responsibilities, this will take care
	 * of not setting the inner Business Object and innerBusinessObject array
	 * when they are initialized with all default values.
	 * 
	 * @param namespace
	 * @param struct
	 * @param bo
	 * @param memberDatatypes
	 * @param datatypeDefaults
	 * @return
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	public BusinessObject getBusinessObjectFromStruct(String namespace,
			BusinessObject bo, Map<String, String> memberDatatypes,
			Map<String, String> datatypeDefaults, String responseType)
			throws MemberNotFoundException, InvalidAttributeExpressionException {
		this.datatypeDefaults = datatypeDefaults;
		this.memberDatatypes = memberDatatypes;
//		this.responseType = responseType;
		for (String memberName : memberMap.keySet()) {
			Object val = getMember(namespace, memberName, responseType);
			try {
				if (val != null) {
					bo.setValue(memberName, val);
				}
			} catch (AttributeNotFoundException e) {
				throw new MemberNotFoundException("Member: " + memberName
						+ " not found in BusinessObject");
			}
		}
		if (null == bo.getAttributeValues()) {
			return null;
		}
		return bo;

	}

	/**
	 * Returns the value of the member identified by the given name
	 * 
	 * @param namespace
	 *            Should not be null. Pass empty string if it is not needed
	 *            (condition for root)
	 * @param name
	 * @return
	 * @throws MemberNotFoundException
	 */
	public Object getMember(String namespace, String name, String responseType)
			throws MemberNotFoundException {
		try {
			Object data = null;
			Object member = memberMap.get(name);
			if (member instanceof Member) {
				data = getPrimitiveMember(namespace, name, (Member) member);
			} else if (member instanceof Member[]) {
				data = getPrimitiveMemberArray(namespace, name,
						(Member[]) member, responseType);
			} else if (member instanceof AbstractBinaryStruct) {
				// if the inner object is set to default values in all members,
				// then don't place the fild in BO
				if ((datatypeDefaults != null)
						&& (((AbstractBinaryStruct) member)
								.compareWithDefault(namespace + name + ".", responseType) == 0)) {
					return null;
				}
				data = ((AbstractBinaryStruct) member)
						.getBusinessObjectFromStruct(namespace + name + ".",
								boSource.getBusinessObject(), memberDatatypes,
								datatypeDefaults, responseType);
			} else if (member instanceof AbstractBinaryStruct[]) {
				data = getInnerStructArray(namespace + name + ".",
						(AbstractBinaryStruct[]) member, responseType);
			} else {
				throw new MemberNotFoundException(name + " not a valid member");
			}
			return data;
		} catch (Exception e) {
			throw new MemberNotFoundException("Invalid content in the member "
					+ name);
		}
	}

	/**
	 * Gets the value in the given primitive member
	 * 
	 * @param namespace
	 * @param name
	 * @param member
	 * @return
	 */
	protected Object getPrimitiveMember(String namespace, String name,
			Member member) {
		Object data = null;
		if (member instanceof Signed8) {
			byte b = ((Signed8) member).get();
			data = new Character((char) b);
			if (b < START_ASCII || b > END_ASCII) {
				data = null;
			}
		} else if (member instanceof Signed32) {
			data = ((Signed32) member).get();
		} else if (member instanceof Unsigned32) {
			data = ((Unsigned32) member).get();
		} else if (member instanceof Signed16) {
			data = ((Signed16) member).get();
		} else if (member instanceof Unsigned16) {
			data = ((Unsigned16) member).get();
		} else if (member instanceof Float32) {
			data = ((Float32) member).get();
		} else if (member instanceof Float64) {
			data = ((Float64) member).get();
		} else if (member instanceof Unsigned8) {
			data = ((Unsigned8) member).get();
		} else if (member instanceof UTF8String) {
			data = ((UTF8String) member).get();
		} else if (member instanceof Signed64) {
			data = ((Signed64) member).get();
		}
		return data;
	}

	/**
	 * Gets the value in the given primitive member array. Especially if it is a
	 * char array and if it is matching the default value, then the return value
	 * is null.
	 * 
	 * @param namespace
	 * @param name
	 * @param memberArray
	 * @return If all elements within the array are set to default, returns
	 *         null, else the value present in the member
	 */
	private Object getPrimitiveMemberArray(String namespace, String name,
			Member[] memberArray, String responseType) {
		if (memberArray.length == 0) {
			return null;
		}
		int memberArrayLen = memberArray.length;
		Member memberSample = memberArray[0];
		if (memberSample instanceof Signed8) {
			if (compareWithDefault((Signed8[]) memberArray, namespace, name, responseType) == 0) {
				// string in struct is matching with default value
				return null;
			}
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < memberArrayLen; i++) {
				Object val = getPrimitiveMember(namespace, name, memberArray[i]);
				if (val != null) {
					buff.append(((Character) val).charValue());
				}
			}
			return buff.toString();
		}

		Object[] arrayObject = getArrayObject(memberArray[0], memberArrayLen);
		for (int i = 0; i < memberArrayLen; i++) {
			arrayObject[i] = getPrimitiveMember(namespace, name, memberArray[i]);
		}
		return arrayObject;
	}

	/**
	 * Returns an array object to be set in the business object based on the
	 * datatype of the member
	 * 
	 * @param member
	 *            Member within this struct
	 * @param length
	 *            Length of the member array
	 * @return
	 */
	private Object[] getArrayObject(Member member, int length) {
		if (member instanceof Signed8) {
			return new Character[length];
		} else if (member instanceof Signed32) {
			return new Integer[length];
		} else if (member instanceof Unsigned32) {
			return new Long[length];
		} else if (member instanceof Signed16) {
			return new Short[length];
		} else if (member instanceof Unsigned16) {
			return new Integer[length];
		} else if (member instanceof Float32) {
			return new Float[length];
		} else if (member instanceof Float64) {
			return new Double[length];
		} else if (member instanceof Unsigned8) {
			return new Short[length];
		} else if (member instanceof UTF8String) {
			return new String[length];
		} else if (member instanceof Signed64) {
			return new Long[length];
		}
		return null;
	}

	/**
	 * Compares primitive member array with default value
	 * 
	 * @param memberArray
	 * @param namespace
	 * @param name
	 * @return 0 if same as default, -1 if different
	 */
	protected int compareWithDefault(Member[] memberArray, String namespace,
			String name, String responseType) {
		if (memberArray.length == 0) {
			return 0;// just there
		}

		if (memberArray[0] instanceof Signed8) {
			return compareWithDefault((Signed8[]) memberArray, namespace, name, responseType);
		}

		Object defaultValue = getDefaultValue(namespace, name, responseType);
		// Eurex gives space as default value evn though its initialized values
		// are different
		if (defaultValue == null) {
			return -1; // no default should be considered, so whatever value is
			// there is valid
		}
		for (Member member : memberArray) {
			Object primitiveVal = getPrimitiveMember(namespace, name, member);
			if (!defaultValue.equals(primitiveVal)) {
				return -1;
			}
		}
		return 0;
	}

	/**
	 * Compares the contents of given memberArray with the default value set for
	 * the corresponding member type (determined based on the given namespace,
	 * name)
	 * 
	 * @param memberArray
	 * @param namespace
	 * @param name
	 * @return 0 - if contents of memberArray matches with the default, -1 if it
	 *         doesn't match
	 */
	protected int compareWithDefault(Signed8[] memberArray, String namespace,
			String name, String responseType) {
		assert (memberArray.length > 0);
		assert (memberArray[0] instanceof Signed8);

		Object defaultValue = getDefaultValue(namespace, name,responseType);
		// Eurex gives space as default value evn though its initialized values
		// are different
		char otherDefaultValue = ' ';
		if (defaultValue instanceof String) {
			// for string, whatever value is in default if it is present in
			// structure contents then both vlaues are considered same else
			// considered different
			char[] charArray = ((String) defaultValue).toCharArray();
			int srcLen = charArray.length;
			if (srcLen > memberArray.length) {
				return -1;
			}
			Character lastChar = '\0';
			for (int i = 0; i < srcLen; i++) {
				lastChar = Character.valueOf(charArray[i]);
				if ((((char) memberArray[i].get()) != charArray[i])
						&& (((char) memberArray[i].get()) != otherDefaultValue)) {
					return -1;
				}
			}
			// /remaining elements should match the last char that is repeated
			// till end
			for (int i = srcLen; i < memberArray.length; i++) {
				if ((((char) memberArray[i].get()) != lastChar.charValue())
						&& (((char) memberArray[i].get()) != otherDefaultValue)) {
					return -1;
				}
			}
			return 0;
		}
		return -1;
	}

	/**
	 * Compares members present in this struct with their corresponding default
	 * values. Returns 0 if all the members are set to their defaults else -1.
	 * 
	 * @param member
	 * @param namespace
	 * @return
	 */
	protected int compareWithDefault(String namespace, String responseType) {
		int compareResult = 0;
		for (String memberName : memberMap.keySet()) {
			Object member = memberMap.get(memberName);
			if (member instanceof Member) {
				// get default value for the primitive member
				Object defaultValue = getDefaultValue(namespace, memberName,responseType);
				// Eurex gives space as default value evn though its initialized
				// values are different
				if (defaultValue == null) {
					return -1;
				}
				// if a default value exists compare against that
				Object primitiveVal = getPrimitiveMember(namespace, memberName,
						(Member) member);
				if ((primitiveVal instanceof Character)
						&& (primitiveVal != null)) {
					primitiveVal = primitiveVal.toString();
				}

				if (!defaultValue.equals(primitiveVal)) {
					compareResult = -1;
				}
			} else if (member instanceof Member[]) {
				compareResult = compareWithDefault((Member[]) member,
						namespace, memberName,responseType);
			} else if (member instanceof AbstractBinaryStruct) {
				compareResult = ((AbstractBinaryStruct) member)
						.compareWithDefault(namespace + memberName + ".",responseType);
			} else if (member instanceof AbstractBinaryStruct[]) {
				AbstractBinaryStruct[] innerStructArray = (AbstractBinaryStruct[]) member;
				for (AbstractBinaryStruct s : innerStructArray) {
					compareResult = ((AbstractBinaryStruct) s)
							.compareWithDefault(namespace + memberName + ".",responseType);
					if (compareResult == -1) {
						break;
					}
				}
			}
			if (compareResult == -1) {
				// the given innerStruct is not matching the default, so there
				// is a valid value in the struct
				break;
			}
		}
		return compareResult;
	}

	/**
	 * Creates a corresponding list of businessObject instance for the given
	 * struct array. Each attribute in the business object matches the
	 * corresponding field in the struct i.e. both of them shares the same name.
	 * 
	 * @param namespace
	 * 
	 * @param memberArray
	 * @return null if all the elements in the inner Struct array are having
	 *         default values else the list containing only those inner struct
	 *         elements that have valid values
	 * @throws MemberNotFoundException
	 * @throws InvalidAttributeExpressionException 
	 */
	@SuppressWarnings("unchecked")
	protected Object getInnerStructArray(String namespace,
			AbstractBinaryStruct[] memberArray, String responseType) throws MemberNotFoundException, InvalidAttributeExpressionException {
		List boList = new ArrayList(memberArray.length);
		for (int i = 0; i < memberArray.length; i++) {
			AbstractBinaryStruct currentStruct = memberArray[i];
			if (currentStruct.compareWithDefault(namespace,responseType) == 0) {
				// inner struct is matching the default value, dont add to BO
				// list
				continue;
			}
			boList.add(currentStruct.getBusinessObjectFromStruct(namespace,
					boSource.getBusinessObject(), memberDatatypes,
					datatypeDefaults, responseType));
			boList.remove(null);
		}
		return (boList.size() > 0) ? boList : null;
	}

	public void addInner(String name, Struct struct) {
		memberMap.put(name, struct);
		this.inner(struct);
	}

	public void addInner(String name, Struct[] structArray) {
		memberMap.put(name, structArray);
		this.array(structArray);
	}

	public byte[] getByteArray() {
		ByteBuffer buffer = getByteBuffer();
		if (buffer.hasArray()) {
			return buffer.array();
		} else {
			byte[] _bytes = new byte[this.size()];
			buffer.position(this.getByteBufferPosition());
			buffer.order(endian);
			buffer.get(_bytes);
			return _bytes;
		}
	}

	/**
	 * @param boSource
	 *            the boSource to set
	 */
	public void setBoSource(BusinessObjectSource boSource) {
		this.boSource = boSource;
	}
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(((Character)s.charAt(0)).charValue());
		byte b = (byte)((Character)s.charAt(0)).charValue();
		System.out.println(b);
	}
}
