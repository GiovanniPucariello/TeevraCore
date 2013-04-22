package com.headstrong.fusion.configGenerator.commObjs;

import java.util.List;
import java.util.Map;

public class MessageDTO {


	DTOParser parser;
	
	public MessageDTO(List<Map> rows, String messageType) {
		//
		super();
		parser = new DTOParserForEurex(rows);
		//parsing Logic - convert many rows into headers/footers/body
	}
	

	public Map getHeader(){
		return parser.getHeader();
	} 
	
	public Map getBody(){
		return parser.getBody();
	}
	
	public Map getFooter(){
		return parser.getFooter();
	}
	
	public Map getSeqNo() {
		return parser.getSeqNo();
	}
	
	public Map getMetaData(){
		return parser.getMetaData();	
	}
	public Map getErrorStruct(){
		return parser.getErrorStruct();
	}
	
}
