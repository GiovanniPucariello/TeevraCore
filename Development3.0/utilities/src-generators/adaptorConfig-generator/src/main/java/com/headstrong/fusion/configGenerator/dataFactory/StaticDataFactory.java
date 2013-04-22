package com.headstrong.fusion.configGenerator.dataFactory;

import java.util.List;
import java.util.Properties;

public abstract class StaticDataFactory {
	
	
	public static StaticDataFactory getFactory(Properties props){
		   return new DefaultStaticDataFactory(props);
		}
	
	/**
	 * Get the table name or sheet name or name of the granular entity which 
	 * owns data for a unique message type. 
	 * @return
	 */
	public abstract List<String> getMessageName();
	
	public abstract void closeConection();
}
