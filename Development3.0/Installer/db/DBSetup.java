import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.IOUtils;

public class DBSetup {

	public DBSetup() {
	}

	public static void main(String[] argv) throws Exception {

		final String dbType = argv[0];
		final String dbURL = argv[1];
		final String dbUserName = argv[2];
		final String dbPwdFilePath = argv[3];

		final String folderpath = argv[4];
		final String euroNextSelected = argv[5];
		final String authType = argv[6];
//		final String password = argv[7];
		final String encryptionKeyLocation= argv[7];

		DBSetup dbSetup = new DBSetup();
		String key = IOUtils.toString(new FileReader(new File(encryptionKeyLocation)));
//		System.out.println("============key============= "+key);
		// get password from the file
		String dbPassword = "";
//		if (password != null && password.trim().length() != 0) {
//			dbPassword = password;
//		} else
		if (dbPwdFilePath != null && dbPwdFilePath.trim().length() != 0) {
			dbPassword = dbSetup.getPassword(dbPwdFilePath);
		}
//		System.out.println("=============DB Password======== "+ dbPassword);
		dbPassword =  decrypt(dbPassword,key);
//				System.out.println("=======DBPassword========== "+ dbPassword);
		Connection conn = dbSetup.getConnection(dbType, dbURL, dbUserName,
				dbPassword);

		String tPropertySqlQuery = "INSERT INTO t_property(property_id, property_name, property_value,"
				+ " property_desc, property_status , comments )"
				+ " values (1, 'AUTH_TYPE','"
				+ authType.trim()
				+ "','Authentication Provider','ACTIVE',"
				+ "'Type should be either DB or LDAP. user/admin needs to choose the type based on their provider.')";

		List<String> fileNames = new ArrayList<String>();
		if (dbType.equalsIgnoreCase("ORACLE")) {
			fileNames.add(folderpath
					+ "/scripts/db/OracleScripts/teevra_drop.sql");
			fileNames.add(folderpath
					+ "/scripts/db/OracleScripts/teevra_ddl.sql");

		} else if (dbType.equalsIgnoreCase("POSTGRES")) {
			fileNames.add(folderpath
					+ "/scripts/db/PostgresScripts/teevra_drop.sql");
			fileNames.add(folderpath
					+ "/scripts/db/PostgresScripts/teevra_ddl.sql");
	
		} else if (dbType.equalsIgnoreCase("SYBASE")) {
			fileNames.add(folderpath
					+ "/scripts/db/SybaseScripts/teevra_drop.sql");
			fileNames.add(folderpath
					+ "/scripts/db/SybaseScripts/teevra_ddl.sql");
		}

		dbSetup.executeStatements(conn, fileNames);

		if (conn.isClosed()) {
			conn = dbSetup.getConnection(dbType, dbURL, dbUserName, dbPassword);
		}
		// to insert the authentication type property in database
		dbSetup.executeStatement(conn, tPropertySqlQuery);

		// delete the db rleated code and files from the installer path as it is
		// not required

		// deleteFolder(new File(folderpath+"\\src"));

	}

	private Connection getConnection(String dbType, String url,
			String userName, String password) throws ClassNotFoundException,
			SQLException {
		Connection connection = null;
		String driver = getDatabaseDriver(dbType);
		Class.forName(driver);
		connection = DriverManager.getConnection(url, userName, password);

		return connection;
	}

	public String getDatabaseDriver(String dbType) {
		String driverName = null;
		// load the driver
		if (dbType.equalsIgnoreCase("ORACLE")) {
			driverName = "oracle.jdbc.OracleDriver";
		} else if (dbType.equalsIgnoreCase("POSTGRES")) {
			driverName = "org.postgresql.Driver";
		} else if (dbType.equalsIgnoreCase("SYBASE")) {
			driverName = "com.sybase.jdbc3.jdbc.SybDriver";
		}
		return driverName;

	}

	public void executeStatements(Connection connection, List<String> fileNames)
			throws ClassNotFoundException, SQLException {

		// Connection connection = this.getConnection(sinkConfiguration);
		List<String> statements = null;
		for (String fileName : fileNames) {
			if (fileName.contains("ddl")) {
				System.out
						.println("Executing create table statements from file:"
								+ fileName);
			}

			if (fileName.contains("drop")) {
				System.out.println("Executing drop table statements from file:"
						+ fileName);
			}

			try {

				statements = getStatements(fileName);
			} catch (Exception e) {

				System.out.println("Error while reading statements from file "
						+ fileName + "-->" + e.getMessage());
				return;

			}

			Statement stmt = null;
			for (String str : statements) {
				// stmt.addBatch(str);

				try {
					stmt = connection.createStatement();
					System.out.println("Executing statement -->");
					System.out.println(str);
					stmt.execute(str);
					System.out.println("Statement executed successfully");

				} catch (Exception e) {
					System.out
							.println("Error while execution sql scripts from file "
									+ fileName + "-->" + e.getMessage());
				} finally {
					stmt.close();
				}
			}

		}
		System.out
				.println("Database schema creation and intialization completed successfull");
		connection.commit();
		connection.close();
	}

	public void executeStatement(Connection connection, String str)
			throws ClassNotFoundException, SQLException {
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			System.out.println("Executing statement -->");
			System.out.println(str);
			stmt.execute(str);
			System.out.println("Statement executed successfully");

		} catch (Exception e) {
			System.out.println("Error while executinn sql statement " + str
					+ "-->" + e.getMessage());
		} finally {
			stmt.close();
		}

		connection.commit();
		connection.close();
	}

	public List<String> getStatements(String fileName) throws Exception {
		String line = "";
		StringBuffer statement = new StringBuffer();
		List<String> statements = new ArrayList<String>();

		RandomAccessFile raf = null;
		try {

			raf = new RandomAccessFile(fileName, "rw");

			while ((line = raf.readLine()) != null) {

				if (line.trim().equals("/")) {
					statements.add(statement.toString());
					statement = new StringBuffer();
				} else {
					statement.append(line);
				}
			}
		} catch (Exception e) {

			System.out.println("Error while reading the file -->" + fileName);
			throw e;
		} finally {
			if (raf != null) {
				try {
					raf.close();
				} catch (Exception e) {
					System.out
							.println("Error while closing Random Access File");
				}
			}

		}

		return statements;

	}

	private static void deleteFolder(File dir) {

		if (dir.exists()) {
			if (dir.isDirectory()) {
				String[] children = dir.list();
				for (int i = 0; i < children.length; i++) {
					deleteFolder(new File(dir, children[i]));
				}
			}
			boolean success = dir.delete();
		}
	}

	/**
	 * Returns the password stored in the file
	 * 
	 * @param filePath
	 * @return
	 */
	private String getPassword(String filePath) {

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