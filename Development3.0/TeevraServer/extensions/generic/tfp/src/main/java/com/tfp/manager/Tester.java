/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: Tester.java
 * $Revision: 
 * $Author: ssoni
 * $DateTime: Apr 9, 2010 
 */
package com.tfp.manager;

import com.tfp.interfaces.*;
import com.tfp.impl.*;

/**
 * This class is to test the TFP module independently.
 *
 */
public class Tester {

	/**
	 * Invoking the doTest, which delegates the call to the black box.
	 * @param args
	 */
	public static void main(String[] args) {
		doTest();
	}

	/**
	 * DoTest to set the process object and invoke the batch manager.
	 */
	public static void doTest() {
		ProcessObject po = new ProcessObjectImpl();
		po.setBatchType(PropertyConstants.SDM_BATCH_TYPE);
		po.setFileName("data/los_sample_10.dat");
		try {
			BatchManagerBlackBox.invokeBatchManager(po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
