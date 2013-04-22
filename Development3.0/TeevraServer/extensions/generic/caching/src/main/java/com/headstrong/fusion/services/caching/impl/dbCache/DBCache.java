package com.headstrong.fusion.services.caching.impl.dbCache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DBCache {

	private String dataSource;
	private String sqlStmnt;
	private Map<String, Object> data = new ConcurrentHashMap<String, Object>();
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public String getSqlStmnt() {
		return sqlStmnt;
	}
	public void setSqlStmnt(String sqlStmnt) {
		this.sqlStmnt = sqlStmnt;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
