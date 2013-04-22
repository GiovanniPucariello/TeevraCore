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
 * $Id: FixedOutput.java
 * $Revision: 
 * $Author: byoung
 * $DateTime: Mar 8, 2010 
 */
package com.tedi.engine;

import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tedi.util.Utils;
import tedi.util.Base64;

/**
 * This file is provided by MCH team for TEDI engine integration.
 */
public class FixedOutput extends AbstractOutput {

	private static final String DEFAULT_ENCODING = "System Default";
	private static final String PACKED_TYPE = "Packed";
	private static final String PACKED_DATE = "Packed Date";
	private static final String ISO8859 = "ISO8859_1";
	private static final String CP_ENCODING = "Cp037";
	/**
	 * Logger for this class.
	 */
	private static final Logger logger = LoggerFactory
			.getLogger(FixedOutput.class);

	/*
	 * Processing fixed length output. (non-Javadoc)
	 * 
	 * @see com.tedi.engine.AbstractOutput#process(java.util.Vector,
	 *      java.util.Vector)
	 */
	public String process(Vector recordStructureV, Vector writeFieldsV) {

		logger.info("Processing Fixed length output.");

		Vector currentRowV = new Vector();
		StringBuffer outputSB = new StringBuffer();

		if (recordStructureV != null && recordStructureV.size() > 0
				&& mapFile != null) {
			String mapFileCharEncoding = mapFile.getCharEncoding();
			String mapFileHexLineSeparator = mapFile.getHexLineSeparator();

			try {
				// set the payloadEncoding variable to the target encoding value
				// from the map
				if (this.execResults != null)
					this.execResults.setPayloadEncoding(mapFileCharEncoding);

				for (int i = 0; i < recordStructureV.size(); i++) {
					currentRowV = (Vector) recordStructureV.elementAt(i);
					String fieldStart = currentRowV.elementAt(2).toString()
							.trim();
					// check to see if there is a '1' in the start column which
					// indicates
					// record break
					if (fieldStart.equals("1") && (i > 0)) {
						// if there is no encoding involved, append a new line
						// character
						// otherwise append the encoded line separator char
						// value
						if (mapFileCharEncoding.length() == 0
								|| mapFileCharEncoding.equals(DEFAULT_ENCODING)) {
							outputSB.append("\n");
						} else if (mapFileHexLineSeparator.length() > 0) {
							outputSB.append(new String(Utils.getStringFromHex(
									mapFileHexLineSeparator).getBytes()));
						}
					}
					// build record stringbuffer -
					// the string buffer is used to test record suppressions
					if (mapFileCharEncoding.equalsIgnoreCase(DEFAULT_ENCODING)) {
						outputSB.append(writeFieldsV.elementAt(i).toString());
					} else {
						String type = ((String) currentRowV.get(4)).trim();
						if (type.equalsIgnoreCase(PACKED_TYPE)
								|| type.equalsIgnoreCase(PACKED_DATE)) {
							outputSB.append(writeFieldsV.elementAt(i)
									.toString());
						} else {
							outputSB.append(new String(writeFieldsV
									.elementAt(i).toString().getBytes(
											mapFileCharEncoding), ISO8859));
						}
					}// end if encoding is System Default
				}// end for loop

				// if target encoding is EBCDIC, set isPayloadBase64 to true and
				// Base64 encode the payload
				if (mapFileCharEncoding.equalsIgnoreCase(CP_ENCODING)) {

					this.execResults.setIsPayloadBase64(true);

					if (outputSB != null && outputSB.length() > 0) {
						String strEncoded = "";
						try {
							// encode the payload and set the return string
							// buffer
							// to the encoded value
							// strEncoded = Base64.encode(outputSB.toString());
							strEncoded = Base64.encode(outputSB.toString()
									.getBytes(ISO8859));
							outputSB.setLength(0);
							outputSB.append(strEncoded);
						} catch (Exception e) {
							logger.error(e.getMessage());
						}
					}
				} // end if character encoding is EBCDIC
			}// end try block
			catch (Exception ex) {
				execResults.post("Error writing record to output file.", ex);
			}
		}
		logger.info(" Processing of fixed length output completed. ");
		return outputSB.toString();
	}

}
