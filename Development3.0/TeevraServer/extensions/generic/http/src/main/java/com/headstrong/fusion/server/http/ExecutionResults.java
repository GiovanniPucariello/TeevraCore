package com.headstrong.fusion.server.http;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author mali
 *
 */
@SuppressWarnings("unchecked")
public class ExecutionResults {

	private static Logger logger = LoggerFactory.getLogger(ExecutionResults.class);
	
	protected Document doc;
	protected Element elemMessages;
	protected HashMap varHash = new HashMap();
	public static final int M_INFORMATIONAL = 0;
	public static final int M_WARNING = 1;
	public static final int M_ERROR = 2;

	//web messages
	public static final int E_WEB_SYS_ERR = 8001;
	public static final int E_WEB_UNAUTHORIZED = 8002;
	public static final int E_WEB_BAD_REQ = 8003;
	public static final int E_WEB_NO_RESPONSE = 8004;
	//engine messages
	public static final int E_ENG_SYS_ERR = 8501;
	public static final int E_ENG_UNPARSEABLE_DATA = 8502;
	public static final int E_ENG_CLIENT_CANCEL = 8503;
	public static final int E_ENG_MAP_EXIT = 8504;
	public static final int E_ENG_FATAL_EDIT = 8505;
	public static final int E_ENG_FATAL_EDIT_ALL = 8506;
	public static final int E_IO_START_PH = 8507;
	public static final int E_IO_BAD_XML = 8508;

	public static final int RESULT_ERROR = 1;
	public static final int RESULT_SUCCESS = 0;
	
	private static final String RESPONSE = "Response";
	private static final String HEADER = "Header";
	private static final String RETURN_CODE = "returnCode";
	private static final String MESSAGES = "Messages";
	private static final String MESSAGE = "Message";
	private static final String DIRECTIVE = "Directive";
	private static final String PAYLOAD = "payload";
	
	
	public ExecutionResults() {
		doc = DocumentHelper.createDocument();
		Element root = DocumentHelper.createElement(RESPONSE).addAttribute("version", "1.0");
		doc.setRootElement(root);
		Element header = root.addElement(HEADER);
		header.addElement(RETURN_CODE).setText("0");
		elemMessages = DocumentHelper.createElement(MESSAGES);
		header.add(elemMessages);
		header.addElement(DIRECTIVE);
	}

	void addPayload(String payload) {
		doc.getRootElement().addElement(PAYLOAD).addCDATA(payload);
	}

	/**
	 * @param msgV
	 */
	void addMessages(ArrayList msgV) {
		for (int i=0; i<msgV.size(); i++) {
			String msg = (String)msgV.get(i);
			addMessage(0, 0, msg);
		}
	}

	/**
	 * @param level
	 * @param code
	 * @param msg
	 */
	public void addMessage(int level, int code, String msg) {
		Element elemMsg = elemMessages.addElement(MESSAGE);
		elemMsg.addElement("messageText").setText(msg);
		elemMsg.addElement("messageID").setText(""+code);
		elemMsg.addElement("messageLevel").setText(""+level);
	}

	public void setReturnCode(int cde) {
		doc.selectSingleNode("//returnCode").setText(""+cde);
	}

	/**
	 * @return
	 */
	public String asString() {
		String result = "<Error/>";
		try {
			StringWriter sw = new StringWriter();
			OutputFormat format = OutputFormat.createPrettyPrint();
			XMLWriter writer = new XMLWriter(sw, format);
			writer.setMaximumAllowedCharacter(127);
			writer.write(doc);
			result = sw.toString();
		}
		catch (IOException e) {
			logger.error("Error generating XML response for client.", e);
		}
		return result;
	}

	public Document getDocument() {
		return doc;
	}

	public int getReturnCode() {
		return Integer.parseInt(doc.valueOf("//returnCode"));
	}

	public void setReturnVar(String name, Object value) {
		varHash.put(name, value);
	}



}
