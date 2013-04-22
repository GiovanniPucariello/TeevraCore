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
 * $Id: DelimitedOutput.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class DelimitedOutput extends AbstractOutput {

	/**
	 * Logger.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(DelimitedOutput.class);

	/*
	 * Processing fixed length output.
	 * 
	 * @see com.tedi.engine.AbstractOutput#process(java.util.Vector,
	 *      java.util.Vector)
	 */
	public String process(Vector recordStructureV, Vector writeFieldsV) {

		logger.info("Processing delimited output.");

		StringBuffer sb = new StringBuffer("");

		if (recordStructureV != null && recordStructureV.size() > 0
				&& mapFile != null) {
			String delimiter = mapFile.get_delimiter();
			String textQualifier = mapFile.get_text_qualifier().trim();

			try {
				for (int i = 0; i < recordStructureV.size(); i++) {
					Vector currentRowV = (Vector) recordStructureV.elementAt(i);
					// check to see if there is a '1' in the start column which
					// indicates
					// that we should put out a record separator
					if ((currentRowV.elementAt(2).toString().trim().equals("1"))
							&& (sb.length() > 0)) {
						sb.append("\n");
					}
					// if text field write text qualifiers
					if (currentRowV.elementAt(4).toString().equals("Text")) {
						sb.append(textQualifier);
						sb.append(writeFieldsV.elementAt(i).toString());
						sb.append(textQualifier);
					} else {
						sb.append(writeFieldsV.elementAt(i).toString());
					}
					// see if field delimiter should be written
					boolean checking = true;
					int i_next = i;
					Vector nextRowVector;
					while (checking) {
						i_next++;
						if (i_next == recordStructureV.size()) {
							checking = false;
						} else {
							nextRowVector = (Vector) recordStructureV
									.elementAt(i_next);
							if (nextRowVector.elementAt(2).toString().trim()
									.equals("1")) {
								checking = false;
							} else if (!nextRowVector.elementAt(4).toString()
									.equals("Calc")) {
								sb.append(delimiter);
								checking = false;
							}
						}
					}
				}

			} catch (Exception ex) {
				execResults.post("Error writing record to output file.", ex);
			}
		}
		logger.info("Processing of delimited output completed.");
		return sb.toString();
	}
}
