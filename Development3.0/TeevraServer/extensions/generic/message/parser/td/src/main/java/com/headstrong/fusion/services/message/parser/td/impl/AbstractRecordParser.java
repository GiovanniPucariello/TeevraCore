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
 * $Id: AbstractRecordParser.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Dec 24, 2008 
 */

package com.headstrong.fusion.services.message.parser.td.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * This class currently defines a single method which would be used by both
 * header and body parser to get the value of the schema.
 * 
 */
public class AbstractRecordParser {

	private static char DEFAULT_QUOTE_CHARACTER = '"';
	private static char quotechar = DEFAULT_QUOTE_CHARACTER;

	/**
	 * Splits the record in the array of tokens using delimiter.
	 * 
	 * @param record Record line.
	 * @param delimiter Delimiter.
	 * @return array of tokens.
	 */
	public String[] split(String record, String delimiter , Boolean considerQuote) {
		if (record == null) {
			return null;
		}
		
		// List of tokens
		List<String> tokensOnThisLine = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		char[] delimiterChars = delimiter.toCharArray();
		List<Character> delimiterList = new ArrayList<Character>();
		for (int i=0;i<delimiterChars.length;i++) {
			char c = delimiterChars[i];
			if ((c == '\\') && (i < (delimiterChars.length - 1))) {
				//the input string is an escape character, so read the next char
				char c2 = delimiterChars[i+1];
				char newChar = '\0';
				
				if (c2 == 't') {
					newChar = '\t';
				} else if (c2 == 'r') {
					newChar = '\r';
				} else if (c2 == 'n') {
					newChar = '\n';
				} else if (c2 == '\\') {
					newChar = '\\';
				}
				if (newChar != '\0') {
					delimiterList.add(newChar);
					i++;
				}
			} else {
				delimiterList.add(c);
			}
		}
		
		boolean inQuotes = false;
		boolean delimStarted = false;
		do {
			int delimPointer = 0;
			int delimiterLength = delimiterList.size();
			StringBuilder tempDelim = new StringBuilder();

			for (int i = 0; i < record.length(); i++) {
				char c = record.charAt(i);
				if (c == quotechar && considerQuote) {
					// this gets complex... the quote may end a quoted block, or escape another quote.
					// do a 1-char lookahead:
					if (inQuotes // we are in quotes, therefore there can be escaped quotes in here.
							&& record.length() > (i + 1) // there is indeed another character to check.
							&& record.charAt(i + 1) == quotechar) { // ..and that char. is a quote also.
						// we have two quote chars in a row == one quote char, so consume them both and
						// put one on the token. we do *not* exit the quoted text.
						sb.append(record.charAt(i + 1));
						i++;
					} else {
						inQuotes = !inQuotes;
						// the tricky case of an embedded quote in the middle: a,bc"d"ef,g
						if (i > 2 //not on the begining of the line
								&& record.charAt(i - 1) != delimiterList.get(delimPointer) //not at the begining of an escape sequence 
								&& record.length() > (i + 1)
								&& record.charAt(i + 1) != delimiterList.get(delimPointer) //not at the	end of an escape sequence
						) {
							sb.append(c);
						}
					}
				} else if (c == delimiterList.get(delimPointer) && !inQuotes) {
					delimStarted = true;
					if (delimPointer == delimiterLength -1 ) { // if quotes is not started and this is the last delimiter character.
						// reset the delimiter.
						delimPointer = 0;
						tempDelim.setLength(0); // reset the delimiter string
						delimStarted = false;
						//
						tokensOnThisLine.add(sb.toString().trim()); // add the previous token to the list.
						sb = new StringBuffer(); // start work on next token
					} else { // append this char to the temp delim string. 
						tempDelim.append(c);
						delimPointer++;
					}
				} else {
					if (delimStarted) {
						sb.append(tempDelim);
						// reset the delimiter.
						delimPointer = 0;
						tempDelim.setLength(0);
						delimStarted = false;
					}
					sb.append(c);
				}
			}
		} while (inQuotes);
		tokensOnThisLine.add(sb.toString().trim());
		return (String[]) tokensOnThisLine.toArray(new String[0]);
	}

}
