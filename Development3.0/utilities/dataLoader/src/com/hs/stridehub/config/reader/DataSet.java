/**
 * 
 */
package com.hs.stridehub.config.reader;

import java.util.List;

import com.hs.stridehub.config.vo.Table;

/**
 * @author Ssoni
 *
 */
public class DataSet<T extends SinkConfiguration> {
	private List<Table> tables;
	private T sinkConfiguration;
	public List<Table> getTables() {
		return tables;
	}
	public void setTables(List<Table> tables) {
		this.tables = tables;
	}
	public T getSinkConfiguration() {
		return sinkConfiguration;
	}
	public void setSinkConfiguration(T sinkConfiguration) {
		this.sinkConfiguration = sinkConfiguration;
	}
	
}
