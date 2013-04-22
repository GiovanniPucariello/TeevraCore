/**
 * 
 */
package com.hs.stridehub.config.vo;

import java.util.List;
import java.util.Map;

public class Table {

	/**
	 * TABLE NAME
	 */
	private String name;
	/**
	 * COLUMN NAME (index is used while adding the data)
	 */
	private List<Column> columns;

	/**
	 * List of records.
	 * 
	 * Map represents a single row of record. single cell is stored 
	 * against the column in the map.
	 * 
	 */
	private List<Map<Column, Object>> data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<Map<Column, Object>> getData() {
		return data;
	}

	public void setData(List<Map<Column, Object>> data) {
		this.data = data;
	}

}
