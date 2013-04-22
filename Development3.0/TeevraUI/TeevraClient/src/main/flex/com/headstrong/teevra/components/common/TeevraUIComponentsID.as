package com.headstrong.teevra.components.common
{
	/**
	 * Defines Teevra UI Components ID properties values.  
	 * 
	 */	
	
	public class TeevraUIComponentsID
	
	{
		/* Used in  xmlparser, validator,genericformater, transformer ,splitter,fixedlengthparser,delimitedparser,dbparser,dbformatter,cbr
		cstructparser,multisectionparser */
		public static const SERVICE_ID_ID:String="serviceId";
		public static const SCHEMA_NAME_ID:String="schemaName";
		
		//transformer
		public static const INPUT_SCHEMA_NAME_ID:String="inputSchemaName";
		public static const OUTPUT_SCHEMA_NAME_ID:String="outputSchemaName";
		//splitter
		public static const SPLITTING_STRATEGY_ID:String="splittingStrategy";
		public static const OUT_BATCH_SIZE:String="outBatchSize";
				
		//fixedlengthparser,delimetedparser,dbparser,dbformatter 
		public static const PARSER_TYPE_ID:String="parseType";
		public static const SCHEMA_TYPE_ID:String="schemaType";
		public static const OFFSET_ID:String="offSet"; 
		public static const MESSAGE_START_LINE_ID:String="messageStartLine"; 
		public static const FOOTER_PATTERN_ID:String="footerPattern"; 
		
		//delimitedparser
		public static const DELIMITER_ID:String="delimiter";
		public static const CONSIDER_QUOTE_ID:String="considerQuote";
		
		//dbformatter
		public static const ROOT_ID:String="root";
		
		//cstructparser
		public static const ROOT_STRUCTURE_ID:String="rootStructure";
		public static const STRUCTURE_GRID_ID:String="structGrid";
		public static const STRUCTURE_NAME_ID:String="structureName";
		public static const ADD_NEW_ID:String ="addNew";		
		public static const UPDATE_ID:String ="update";
		public static const DELETE_ID:String ="delete";
		public static const IS_UNION_ID:String="isUnion";
		public static const IS_ROOT_ID:String ="isRoot";
		
		// contentbaserouter
		public static const OPEREND_TYPE_ID:String ="operandType";
		public static const DEFAULT_TARGET_NODE_ID:String="defaultTargetNode"; 	
			
		//login screen
		public static const USER_ID:String="userIdTextInput";
		public static const PASSWORD_ID:String="passwordTextInput"; 
			
		// ProcessMonitoringConsole Popup for Feature# 611 [ProcessMonitoringConsole]
		public static const PROCESS_RATE_ID:String="OverallProcessRate";
		public static const REFRESH_ID:String="Refresh";
		public static const DATAGRID_ID:String="ProcessMonitorDetails";
			 
		

	}
}