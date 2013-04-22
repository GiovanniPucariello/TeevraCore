/**
 *
 */
package com.hs.stridehub.config.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.io.IOUtils;

import com.hs.stridehub.config.reader.DataReader;
import com.hs.stridehub.config.reader.DataSet;
import com.hs.stridehub.config.reader.excel.DbSinkConfiguration;
import com.hs.stridehub.config.reader.excel.ExcelDataReader;

/**
 * @author Ssoni
 * 
 */
public class DataLoader {

	public static void main(String[] args) {
		// Read the configuration from the excel file.

		try {
			String fileName = "D:/Projects/Teevra/ReEngineering/Application/source/utilities/dataLoader/resources/tables.xlsx";
			String dbType = "";
			String dbURL = "";
			String dbUserName = "";
			String dbPasswordLocation = "";
			String dbPassword = "";
			String jdbcDriver = "";
			String password = "";
			String passwordKeyLocation = "";

			if (args.length > 0) {
				fileName = args[0];
				dbType = args[1];
				dbURL = args[2];
				dbUserName = args[3];
				dbPasswordLocation = args[4];
				passwordKeyLocation = args[5];

				String key = IOUtils.toString(new FileReader(new File(passwordKeyLocation)));
				if (password != null && password.trim().length() != 0) {
					dbPassword = password;
				} else if (dbPasswordLocation != null
						&& dbPasswordLocation.trim().length() != 0) {
					dbPassword = getPassword(dbPasswordLocation);
					dbPassword = decrypt(dbPassword,key);
				} else {
					dbPassword = "";
				}

			}
			File file = new File(fileName);

			DataReader reader = new ExcelDataReader();
			DataSet<DbSinkConfiguration> dataSet = reader.readDataSet(file);

			DbSinkConfiguration dbSinkConfiguration = new DbSinkConfiguration();
			if (dbType.equalsIgnoreCase("ORACLE")) {
				jdbcDriver = "oracle.jdbc.OracleDriver";
			} else if (dbType.equalsIgnoreCase("POSTGRES")) {
				jdbcDriver = "org.postgresql.Driver";
			} else if (dbType.equalsIgnoreCase("SYBASE")) {
				jdbcDriver = "com.sybase.jdbc3.jdbc.SybDriver";
			}

			dbSinkConfiguration.setDriver(jdbcDriver);
			dbSinkConfiguration.setUrl(dbURL);
			dbSinkConfiguration.setUserName(dbUserName);
			dbSinkConfiguration.setPassword(dbPassword);
			dataSet.setSinkConfiguration(dbSinkConfiguration);
			DbLoader loader = new DbLoader();
			loader.loadData(dataSet);

		} catch (SQLException ex) {
			ex.printStackTrace();
			Exception nextEx = ex.getNextException();
			while (nextEx != null) {
				nextEx.printStackTrace();
				nextEx = ex.getNextException();
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	/**
	 * Returns the password stored in the file(Assuming other than password
	 * nothing is stored in the given file)
	 * 
	 * @param filePath
	 * @return
	 */
	private static String getPassword(String filePath) {

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
	
	
	public static String decrypt(String encryptedText, String key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		SecretKeySpec skey = new SecretKeySpec(Base64.hexToByte(key), "AES");
		Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, skey);
	      byte[] decrypted = cipher.doFinal(Base64.hexToByte(encryptedText));
		return new String(decrypted); 
	}
}
