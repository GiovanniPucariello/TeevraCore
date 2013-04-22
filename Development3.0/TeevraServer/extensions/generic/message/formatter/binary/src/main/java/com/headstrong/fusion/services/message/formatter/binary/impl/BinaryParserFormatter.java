package com.headstrong.fusion.services.message.formatter.binary.impl;

import java.util.Map;

import com.headstrong.fusion.bo.BusinessObject;
import com.headstrong.fusion.bo.BusinessObjectSource;
import com.headstrong.fusion.services.message.formatter.binary.AbstractBinaryStruct;
import com.headstrong.fusion.services.message.formatter.binary.GenericBinaryStruct;
import com.headstrong.fusion.services.message.formatter.binary.GenericBinaryUnion;
import com.headstrong.fusion.services.message.formatter.binary.config.BinaryElement;
import com.headstrong.fusion.services.message.formatter.binary.config.StructsConfigBean;

/**
 * Formats BusinessObject into byte array conforming to C-struct definition.
 * Singleton class
 * 
 * @author akrishnamoorthy
 * 
 */
public class BinaryParserFormatter {

	private BusinessObjectSource boSource;

	// TODO Think of a Cache to hold the binary struct definition and map it to
	// message struct name so that we don't have to go through the exercise of
	// parsing the struct config repeatedly and creating a binary struct for
	// every message. See, if cloneable Struct is available

	/**
	 * Returns singleton instance
	 * 
	 * @return
	 */
	public static BinaryParserFormatter getInstance() {
		return new BinaryParserFormatter();
	}

	/**
	 * Parses the given byte array to populate the structure contents present in
	 * it into the given business object
	 * 
	 * @param structContents
	 *            binary contents of structure
	 * @param outBO
	 *            BusinessObject which needs to be populated
	 * @param structMap
	 *            Map containing all the structure definition
	 * @param msgStructName
	 *            Name of the structure that corresponds to the message / BO
	 * @param fieldMapping
	 *            configuration mapping field in schema descriptor to field in
	 *            struct
	 * @param endianStr
	 *            identifies if big endian (BIG) or little endian (LITTLE) needs
	 *            to be used to convert byte array into struct
	 * @throws Exception
	 */
	public void parse(byte[] structContents, BusinessObject outBO,
			Map<String, StructsConfigBean> structMap, String msgStructName,
			String endianStr) throws Exception {
		parse(structContents, outBO, structMap, msgStructName, endianStr, null,
				null, null);
	}

	/**
	 * In addition to the above parse method, this also checks for a member's
	 * datatypes and initializes it with the datatype specific default value.
	 * 
	 * @param structContents
	 * @param outBO
	 * @param structMap
	 * @param msgStructName
	 * @param endianStr
	 * @param memberDatatypes
	 * @param datatypeDefaults
	 * @throws Exception
	 */
	public void parse(byte[] structContents, BusinessObject outBO,
			Map<String, StructsConfigBean> structMap, String msgStructName,
			String endianStr, Map<String, String> memberDatatypes,
			Map<String, String> datatypeDefaults, String responseType)
			throws Exception {
		// do nothing if given byte array is null
		if (structContents == null) {
			return;
		}
		// create the struct that needs to be generated based on defn in
		// structConfig
		AbstractBinaryStruct mainStruct = createStruct(structMap,
				msgStructName, boSource);

		// set the binary contents in the structure
		int endian = ((endianStr != null) && (endianStr.equals("BIG"))) ? AbstractBinaryStruct.BIG_ENDIAN
				: AbstractBinaryStruct.LITTLE_ENDIAN;
		mainStruct.setEndian(endian);
		setByteArray(structContents, mainStruct);

		// get values from the struct for individual struct fields in
		// mapping and set it in business object
		mainStruct.getBusinessObjectFromStruct("", outBO, memberDatatypes,
				datatypeDefaults, responseType);
	}

	/**
	 * @param structContents
	 * @param mainStruct
	 */
	protected void setByteArray(byte[] structContents,
			AbstractBinaryStruct mainStruct) {
		mainStruct.setByteArray(structContents);
	}

	/**
	 * Formats given business object with the configurations given
	 * 
	 * @param bo
	 *            BusinessObject to be formatted
	 * @param structMap
	 *            Map containing all the structure definition
	 * @param msgStructName
	 *            Name of the structure that corresponds to the message / BO
	 * @param fieldMapping
	 *            configuration mapping field in schema to field in structure
	 * @return C-Structure serialized into byte array
	 * @throws Exception
	 */
	public byte[] format(BusinessObject bo,
			Map<String, StructsConfigBean> structMap, String msgStructName,
			String endianStr) throws Exception {
		return format(bo, structMap, msgStructName, endianStr, null, null, null);
	}

	/**
	 * In addition to the above format method, this will also initialize those
	 * values that are not set with the default values passed in the
	 * datatypeDefaults map corresponding to the data type of the member as
	 * present in memberDatatypes map
	 * 
	 * @param bo
	 * @param structMap
	 * @param msgStructName
	 * @param endianStr
	 * @param memberDatatypes
	 * @param datatypeDefaults
	 * @return
	 * @throws Exception
	 */
	public byte[] format(BusinessObject bo,
			Map<String, StructsConfigBean> structMap, String msgStructName,
			String endianStr, Map<String, String> memberDatatypes,
			Map<String, String> datatypeDefaults, String responseType)
			throws Exception {
		// create the struct that needs to be generated based on defn in
		// structConfig
		AbstractBinaryStruct mainStruct = null;
		mainStruct = createStruct(structMap, msgStructName, boSource);

		int endian = ((endianStr != null) && (endianStr.equals("BIG"))) ? AbstractBinaryStruct.BIG_ENDIAN
				: AbstractBinaryStruct.LITTLE_ENDIAN;
		mainStruct.setEndian(endian);

		// get values from the BO for individual fields in mapping and set
		// it in struct
		mainStruct.setBusinessObjectIntoStruct("", bo, memberDatatypes,
				datatypeDefaults, responseType);

		return mainStruct.getByteArray();
	}

	/**
	 * This method will create {@link AbstractBinaryStruct} using the
	 * {@link StructsConfigBean} given.
	 * 
	 * @param config
	 * @return
	 * @throws Exception
	 */
	protected synchronized static AbstractBinaryStruct createStruct(
			Map<String, StructsConfigBean> structMap, String msgStructName,
			BusinessObjectSource boSource) throws Exception {
		return createInnerStruct(structMap.get(msgStructName), structMap,
				boSource);
	}

	/**
	 * This method will create the structs using the {@link StructsConfigBean}
	 * given and for the structure specified by the name structName. It will
	 * recursively call the method to create inner structures.
	 * 
	 * @param config
	 * @param structName
	 * @return
	 * @throws Exception
	 */
	protected static AbstractBinaryStruct createInnerStruct(
			StructsConfigBean config, Map<String, StructsConfigBean> structMap,
			BusinessObjectSource boSource) throws Exception {
		assert (config != null);

		AbstractBinaryStruct struct;

		// Check if Union or not. If union, create genericbinaryUnion else
		// create genericbinarystruct.
		if (config.isUnion()) {
			struct = new GenericBinaryUnion();
		} else {
			struct = new GenericBinaryStruct();

		}
		struct.setBoSource(boSource);
		// Go thru each element in the structure.
		for (BinaryElement element : config.getElements()) {
			// If element is a structure, then make a recursive call. else,
			// addmember element.
			if (structMap.get(element.getType()) == null) {
				// the current element is of primitive type as no corresponding
				// struct is present in the given structMap
				struct.addMember(element.getName(), element.getType(), element
						.getSize());
			} else if (element.getSize() == null) {
				// current element is an inner struct
				struct.addInner(element.getName(), createInnerStruct(structMap
						.get(element.getType()), structMap, boSource));
			} else {
				// current element is an inner struct array
				int size = Integer.parseInt(element.getSize());
				AbstractBinaryStruct[] innerArray = new GenericBinaryStruct[size];
				for (int i = 0; i < size; i++) {
					innerArray[i] = createInnerStruct(structMap.get(element
							.getType()), structMap, boSource);
				}
				struct.addInner(element.getName(), innerArray);
			}
		}
		return struct;
	}

	/**
	 * @param boSource
	 *            the boSource to set
	 */
	public void setBoSource(BusinessObjectSource boSource) {
		this.boSource = boSource;
	}
}
