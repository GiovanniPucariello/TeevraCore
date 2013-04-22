package com.headstrong.fusion.services.message.parser.fl.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;
import com.headstrong.fusion.services.message.commons.config.parser.fl.FlBinding;

public class FlHeaderParser extends AbstractRecordParser {

	private static FlHeaderParser instance = new FlHeaderParser();
	
	public static FlHeaderParser getInstance() {
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
	public Map<String, Object> parse(String record,
			SchemaDescriptor<FlBinding> schemaDescriptor, int offset) {
		Map<String, Object> header = new HashMap<String, Object>();

		for (SchemaDescriptor<FlBinding> childSchema : schemaDescriptor
				.getChildren()) {
			/**
			 * ASSUMPTION : childSchema.isBind() is always true as 
			 * the data is flat. 
			 */
			// retrieve the actual value and set the data.
			// check if the schema has any binding or not.
			Object value = super.getValue(record, childSchema, offset);
			header.put(childSchema.getFieldName(), value);
		}
		return header;
	}
}
