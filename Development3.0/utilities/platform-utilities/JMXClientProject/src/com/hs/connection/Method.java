package com.hs.connection;

/**
 * Method class to configure the method.
 * @author NBagchi
 */
public class Method {

	private String remoteAPI;
	private Object[] params;
	private String[] signature;

	public Method(String remoteAPI, Object[] params, String[] signature) {
		this.remoteAPI = remoteAPI;
		this.params = params;
		this.signature = signature;
	}

	public String getRemoteAPIName() {
		return remoteAPI;
	}

	public Object[] getParams() {
		return params;
	}

	public String[] getSignature() {
		return signature;
	}

	public void setRemoteAPIName(String remoteAPI) {
		this.remoteAPI = remoteAPI;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public void setSignature(String[] signature) {
		this.signature = signature;
	}
}
