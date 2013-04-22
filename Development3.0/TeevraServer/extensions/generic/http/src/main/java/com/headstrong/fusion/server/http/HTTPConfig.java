package com.headstrong.fusion.server.http;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author mali
 *
 */
@SuppressWarnings("unchecked")
public class HTTPConfig {

	private static final String USER_DIR = "user.dir";
	private static final String LIB_DIR = "lib.dir";
	public static int threadPoolSize = 20;
	public static int securePort = -1;
	public static int standardPort = -1;
	private static ConcurrentHashMap webObjHash = new ConcurrentHashMap();
	
	
	/**
	 * @param urlSuffix
	 * @return
	 * @throws Exception
	 */
	public static AbstractWebObject getWebObjectClass(String urlSuffix)throws Exception {
//		if (webObjHash.containsKey(urlSuffix)) {
//			return (AbstractWebObject)webObjHash.get(urlSuffix);
//		}
		String className = null;
		if(urlSuffix=="*"){
			className = WebObjectEnum.FILE_WEB_OBJECT_CLASS.getValue();
		}else{
			className = WebObjectEnum.WEB_OBJECTIMPL_CLASS.getValue();
		}

		AbstractWebObject awo = (AbstractWebObject)Class.forName(className).newInstance();
		awo.init();
//		webObjHash.put(urlSuffix, awo);
		return awo;
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public static HashMap getVirtualHash() throws Exception {
		HashMap resultHash = new HashMap();
		String name = "/";
		String value = null;
		if(System.getProperty(LIB_DIR)== null ||System.getProperty(LIB_DIR).equals("")){
			value = System.getProperty(USER_DIR);
		}else{
			value = System.getProperty(LIB_DIR);
		}
		resultHash.put(name, value);
		return resultHash;
	}
	
	private enum WebObjectEnum {
		
		FILE_WEB_OBJECT_CLASS("com.headstrong.fusion.server.http.FileWebObject"),
		WEB_OBJECTIMPL_CLASS("com.headstrong.fusion.server.http.WebObjectImpl");
		
		private String value;
		
		private WebObjectEnum(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	    		
	}	

}
