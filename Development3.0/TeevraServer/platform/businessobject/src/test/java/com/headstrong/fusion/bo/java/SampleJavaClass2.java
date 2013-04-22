/**
 * 
 */
package com.headstrong.fusion.bo.java;

import java.util.Map;

/**
 * @author som krishan
 * 
 */
public class SampleJavaClass2 {

	private Map<String, String> attribute1;

	private SampleJavaClass3 sampleJavaClass3;

	private String stringAttribute;
	
	public Map<String, String> getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(Map<String, String> attribute1) {
		this.attribute1 = attribute1;
	}

	public SampleJavaClass3 getSampleJavaClass3() {
		return sampleJavaClass3;
	}

	public void setSampleJavaClass3(SampleJavaClass3 sampleJavaClass3) {
		this.sampleJavaClass3 = sampleJavaClass3;
	}

	/**
	 * @return the stringAttribute
	 */
	public String getStringAttribute() {
		return stringAttribute;
	}

	/**
	 * @param stringAttribute the stringAttribute to set
	 */
	public void setStringAttribute(String stringAttribute) {
		this.stringAttribute = stringAttribute;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attribute1 == null) ? 0 : attribute1.hashCode());
		result = prime * result + ((sampleJavaClass3 == null) ? 0 : sampleJavaClass3.hashCode());
		result = prime * result + ((stringAttribute == null) ? 0 : stringAttribute.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SampleJavaClass2 other = (SampleJavaClass2) obj;
		if (attribute1 == null) {
			if (other.attribute1 != null)
				return false;
		} else if (!attribute1.equals(other.attribute1))
			return false;
		if (sampleJavaClass3 == null) {
			if (other.sampleJavaClass3 != null)
				return false;
		} else if (!sampleJavaClass3.equals(other.sampleJavaClass3))
			return false;
		if (stringAttribute == null) {
			if (other.stringAttribute != null)
				return false;
		} else if (!stringAttribute.equals(other.stringAttribute))
			return false;
		return true;
	}

}
