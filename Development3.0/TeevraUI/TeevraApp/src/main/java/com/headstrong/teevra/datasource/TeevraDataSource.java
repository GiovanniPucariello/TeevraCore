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
 * $Id: TeevraDataSource.java
 * $Revision: 
 * $Author: ViswanathP
 * $DateTime: Feb 11, 2010 
 */

package com.headstrong.teevra.datasource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * Customized DataSource which reads and sets the password from the given path
 * file. If password is specified read the value else get the password from the
 * file
 */
public class TeevraDataSource extends BasicDataSource {

	/**
	 * Location of the file where database password is stored
	 */
	private String passwordLocation;

	/**
	 * database password
	 */
	private String password;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
	 */
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.sql.Wrapper#unwrap(java.lang.Class)
	 */
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the passwordLocation
	 */
	public String getPasswordLocation() {
		return passwordLocation;
	}

	/**
	 * @param passwordLocation
	 *            the passwordLocation to set
	 */
	public void setPasswordLocation(String passwordLocation) {
		this.passwordLocation = passwordLocation;
		if (getPassword() == null
				&& (passwordLocation != null && passwordLocation.trim()
						.length() != 0)) {
			setPassword(getDbPassword(passwordLocation));
		}

	}

	/**
	 * Returns the password stored in the file(Assuming other than password
	 * nothing is stored in the given file)
	 * 
	 * @param filePath
	 * @return
	 */
	private String getDbPassword(String filePath) {

		String strLine = null;
		try {
			String line = null;

			FileReader input = new FileReader(filePath);
			BufferedReader bufRead = new BufferedReader(input);

			while ((line = bufRead.readLine()) != null) {
				if (line.trim().length() != 0) {
					strLine = line.trim();
				}
			}
			bufRead.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strLine;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
		if (password != null && password.trim().length() != 0) {
			super.setPassword(password);
		}
	}
}
