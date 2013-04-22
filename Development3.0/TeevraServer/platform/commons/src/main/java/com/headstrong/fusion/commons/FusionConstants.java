package com.headstrong.fusion.commons;

import java.util.Collections;
import java.util.List;

@SuppressWarnings("unchecked")
public interface FusionConstants {
	public static final String ERROR_QUEUE = "ERROR";
	public static final String EVENT_QUEUE = "EVENT";
	/**
	 * Savepoint constants
	 */
	public static final String PROCESS_ID = "FusionProcessId";
	public static final String MESSAGE_ID = "FusionMessageId";
	public static final String SESSION_ID = "FusionSessionId";
	public static final String SAVEPOINT_NAME = "savePointName";
	public static final String SAVEPOINT_TIME = "savepointTime";
	public static final String SEQUENCE_ID = "FusionSequenceId";
	public static final String TOTAL_SEQUENCE = "totalSequence";
	public static final String LOG_MESSAGE = "FusionLogMessage";
	public static final String LOG_DATA = "FusionLogData";

	public static final String FILENAME = "fileName";

	public static final String DEFAULT_START_SP_NAME = "STARTED";
	public static final String DEFAULT_END_SP_NAME = "FINISHED";
	public static final String DEFAULT_RECEIVED_SP_NAME = "RECEIVED";
	public static final String DEFAULT_ERROR_SP_NAME = "ERROR";

	public static final String DEFAULT_SPLITTER = "SPLITTER";

	public static final String SAVEPOINT_JMS_URL = "fusion.savepoint.jms.url";
	public static final String SAVEPOINT_JMS_QUEUE = "fusion.savepoint.jms.queue";
	public static final String SAVEPOINT_AUTO_START = "fusion.savepoint.autostart";

	/**
	 * DBPool constants
	 */
	public static final String DATABASE_CLASSNAME = "database.driver.classname";
	public static final String DATABASE_URL = "database.url";
	public static final String DATABASE_USERNAME = "database.username";
	public static final String DATABASE_PASSWORD = "database.password";
	public static final String DATABASE_PASSWORD_LOCATION = "database.passwordLocation";
	public static final String JDBCINITIALSIZE = "database.initialSize";
	public static final String JDBCMAXACTIVE = "database.maxActive";
	public static final String JDBCMAXOPENACTIVEPREP = "database.maxOpenActivePrep";
	public static final String MINEVICTABLEIDLETIMEMILLIS = "database.minEvictableIdleTimemillis";
	public static final String TIMEBETWEENEVICTIONRUNSMILLIS = "database.timeBetweenEvictionRunsMillis";

	public static final String VENDOR_NAME = "Headstrong";

	/**
	 * Process constants
	 */

	public static final String PROCESS_STATUS = "processStatus";
	public static final String PROCESS_STARTED = "RUNNING";
	public static final String PROCESS_STOPPED = "STOPPED";
	public static final String PROCESS_ERROR = "ERROR";

	public static final String FUSIONDB = "FusionDB";

	/**
	 * DbEndpoint constants
	 */

	public static final String DBENDPOINT_CLASSNAME = "classname";
	public static final String DBENDPOINT_URL = "url";
	public static final String DBENDPOINT_USERNAME = "username";
	public static final String DBENDPOINT_PASSWORD = "password";
	public static final String DBENDPOINT_QUERY = "query";
	public static final String DBENDPOINT_INTERVAL = "interval";

	/**
	 * FileEndpoint Constants
	 */

	public static final String FILEEENDPOINT_DIRECTORY = "directory";
	public static final String FILEENDPOINT_BINARY = "binary";

	/**
	 * 
	 */
	public static final String FUSION_SCHEDULER_ACTIVE = "fusion.scheduler.active";
	public static final String FUSION_PRCS_DEF_READER_ACTIVE = "fusion.process.def.reader.active";

	/**
	 * These variables will be used by CBR processor need relook.
	 * 
	 */

	public static List<Object> EMPTY_LIST = Collections.EMPTY_LIST;
	public static final String EMPTY_STRING = new String();

	/**
	 * General variables
	 * 
	 */

	public static final String SPACE = " ";
	public static final String EMPTY = "";
	public static final String NEW_LINE = "\n";

	public static final String ERROR_TYPE_BUSINESS = "Business";
	public static final String ERROR_TYPE_SYSTEM = "System";

	/**
	 * These variables will be used as the keys' names for input fields for the
	 * transformer rules
	 * 
	 */
	public static final String INPUT_BO = "inputBO";
	public static final String TEMP_FIELDS = "tempFields";
	public static final String HEADERS = "headers";

	public static final String ARITHMETIC_EXPRESSION = "arithmeticexpression";

	public static final String RECOVERY_QUEUE = "fusion.savepoint.recovery";
	
	
	/**
	 *  HTTP Server constants
	 */
	
	public static final String MISMOWRAPPER = "MISMO Wrapper";
	public static final String TEEVRAWRAPPER = "TEEVRA Standard Wrapper";
	public static final String ASYNCHRONOUS = "asynchronous";
	public static final String CONTENT_TYPE = "content-type";
	public static final String CONTENT_LENGTH = "content-length";
	public static final String CUSTOMWRAPPER = "CUSTOM Wrapper";
	public static final String isPostEncoded = "isPostEncoded";
	public static final String RES_CONTENT_TYPE = "resContentType";
	public static final String TRANSMISSION_TYPE = "transmissionType";
	public static final String isXMLPayload = "isXMLPayload";
	public static final String payloadXPath = "payloadXPath";
	public static final String isWritePayloadOnly ="isWritePayloadOnly";
	
}
