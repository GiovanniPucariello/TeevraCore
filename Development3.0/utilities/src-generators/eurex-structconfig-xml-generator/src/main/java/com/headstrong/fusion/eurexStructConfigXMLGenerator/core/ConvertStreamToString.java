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
 * $Id: ConvertStreamToString.java
 * $Revision: 
 * $Author: vijayBR
 * $DateTime: Sep 15, 2009
 */

package com.headstrong.fusion.eurexStructConfigXMLGenerator.core;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertStreamToString {

	public String convertStreamToString(FileInputStream is) {
		DataInputStream in = new DataInputStream(is);
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		StringBuilder sb = new StringBuilder();
		String line = null;

		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
}
