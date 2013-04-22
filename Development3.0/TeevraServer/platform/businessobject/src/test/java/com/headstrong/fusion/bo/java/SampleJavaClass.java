/**
 * 
 */
package com.headstrong.fusion.bo.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author som krishan
 * 
 */
public class SampleJavaClass {

	private String attribute1;

	private SampleJavaClass1 sampleJavaClass1;

	private List<SampleJavaClass2> sampleJavaClass2List;

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public SampleJavaClass1 getSampleJavaClass1() {
		return sampleJavaClass1;
	}

	public void setSampleJavaClass1(SampleJavaClass1 sampleJavaClass1) {
		this.sampleJavaClass1 = sampleJavaClass1;
	}

	public List<SampleJavaClass2> getSampleJavaClass2List() {
		if (sampleJavaClass2List == null) {
			sampleJavaClass2List = new ArrayList<SampleJavaClass2>();
		}
		return sampleJavaClass2List;
	}
}
