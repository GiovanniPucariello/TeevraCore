package com.headstrong.fusion.services.message.parser.td.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.td.ColumnIndexBinding;

public class TdHeaderParser extends AbstractRecordParser {
	private static TdHeaderParser instance = new TdHeaderParser();

	public static TdHeaderParser getInstance() {
		return instance;
	}

	/**
	 * 
	 * @precondition schemaDescriptor is flat ( Hierarchy of data not supported )
	 * @postcondition header != null
	 * @param record
	 *            Header record.
	 * @param schemaDescriptor
	 *            Header Message schema descriptor.
	 * @return Header {Map<String, Object>}
	 */
	public Map<String, Object> parse(String delimiter,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor, String record) {
		Map<String, Object> header = new HashMap<String, Object>();
		String[] columns = super.split(record, delimiter, true);
		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDescriptor
				.getChildren()) {
			/**
			 * ASSUMPTION : childSchema.isBind() is always true as the data is
			 * flat.
			 */
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			header.put(childSchema.getFieldName(), columns[childSchema
					.getBinding().getColumnIndex() - 1]);
		}
		return header;
	}

	/**
	 * 
	 * @precondition schemaDescriptor is flat ( Hierarchy of data not supported )
	 * @postcondition header != null
	 * @param record
	 *            Header record.
	 * @param schemaDescriptor
	 *            Header Message schema descriptor.
	 * @return Header {Map<String, Object>}
	 */
	public Map<String, Object> parse(String delimiter,
			SchemaDescriptor<ColumnIndexBinding> schemaDescriptor,
			String record, Boolean considerQuote) {
		Map<String, Object> header = new HashMap<String, Object>();
		String[] columns = super.split(record, delimiter, considerQuote);
		for (SchemaDescriptor<ColumnIndexBinding> childSchema : schemaDescriptor
				.getChildren()) {
			/**
			 * ASSUMPTION : childSchema.isBind() is always true as the data is
			 * flat.
			 */
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			header.put(childSchema.getFieldName(), columns[childSchema
					.getBinding().getColumnIndex() - 1]);
		}
		return header;
	}
}
