package com.headstrong.fusion.configGenerator.dataFactory;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class StaticDataFactoryForTestAutomation extends StaticDataFactory {
	

	static Connection con = null;
	static List<String> listOfSheets =new ArrayList<String>();
	
	public StaticDataFactoryForTestAutomation(Properties p) {
		initConnection(p);
	}
	
	@Override
	public List<String> getMessageName() {
//		FIXME - get the sheet names
		
		try {
			
			DatabaseMetaData dbMetaData  = con.getMetaData();
			ResultSet dbTypes = dbMetaData.getTables(null, null, null, null);	        
	        String typeName;
	         while (dbTypes.next()){
	 			typeName = dbTypes.getString("TABLE_NAME");
	 			//System.out.println(typeName);
	 			if(typeName.contains("'")) {
	 				typeName = typeName.substring(1, typeName.length()-1);
	 			}
	 			
	 			if(typeName.contains("$")){
					listOfSheets.add(typeName);	
					
				}
			}
		} catch (SQLException e) {
			throw new DataException("Could not obtain a connection.. terminating.", e);
		}
		
        
		return listOfSheets;
	}
	
	public static Connection getCon() {
		return con;
	}

	private void initConnection(Properties props) {
		String DRIVER_NAME = props.getProperty("DRIVER_NAME");
		String DATABASE_URL = props.getProperty("DATABASE_URL");
		
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e1) {
			throw new RuntimeException("Could not obtain a driver.. terminating.", e1);
		}
		try {
			con = DriverManager.getConnection(DATABASE_URL);
		} catch (SQLException e) {
			throw new RuntimeException("Could not obtain a connection.. terminating.", e);
		}
		//We have a valid connection at this point.
	}

	public void closeConection() {
		try {
			if(con!=null)
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
