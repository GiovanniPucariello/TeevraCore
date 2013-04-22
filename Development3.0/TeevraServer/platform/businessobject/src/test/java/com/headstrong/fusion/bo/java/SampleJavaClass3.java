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
public class SampleJavaClass3 {

	private String attribute1;
	private String attribute2;
	private List<String> attribute3;
	private Sample sample;

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public List<String> getAttribute3() {
		if (attribute3 == null) {
			attribute3 = new ArrayList<String>();
		}
		return attribute3;
	}

	public void setAttribute3(List<String> attribute3) {
		this.attribute3 = attribute3;
	}

	public Sample getSample() {
		return sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
	}

}
