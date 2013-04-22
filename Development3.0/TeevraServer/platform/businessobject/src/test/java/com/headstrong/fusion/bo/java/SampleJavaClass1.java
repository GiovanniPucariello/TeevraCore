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
public class SampleJavaClass1 {

	private int attribute1;

	private List<String> attribute2;

	public int getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(int attribute1) {
		this.attribute1 = attribute1;
	}

	public List<String> getAttribute2() {
		if (attribute2 == null) {
			return new ArrayList<String>();
		}
		return attribute2;
	}

	public void setAttribute2(List<String> attribute2) {
		this.attribute2 = attribute2;
	}
}
