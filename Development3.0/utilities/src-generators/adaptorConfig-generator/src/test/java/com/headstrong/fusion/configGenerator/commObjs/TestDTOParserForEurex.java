package com.headstrong.fusion.configGenerator.commObjs;

import java.util.*;

import javax.activation.DataHandler;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class TestDTOParserForEurex extends TestCase {

		public static void main(String[] args){
			TestDTOParserForEurex t = new TestDTOParserForEurex();
			t.testDTOParserForEurexFooter();
			
		}
	List<Map> listOfMaps = new LinkedList<Map>();

	@Before
	public void setUp() throws Exception {
		super.setUp();

	}

	@Test
	public void testDTOParserForEurexHeader() {

		Map mapFirstRowHeader = new LinkedHashMap();
		Map mapSecondRowHeader = new LinkedHashMap();
		Map mapThirdRowHeader = new LinkedHashMap();

		mapFirstRowHeader.put("Structure", "header (dataHeaderT)");
		mapFirstRowHeader.put("Field", "exchApplId");
		mapFirstRowHeader.put("Data", "char[]");
		mapFirstRowHeader.put("FIXML",
				"/AllocInstrctn/Pty/@ID\n/AllocInstrctn/Pty/@R=21");

		mapSecondRowHeader.put("Structure", null);
		mapSecondRowHeader.put("Field", "prodLine");
		mapSecondRowHeader.put("Data", "char[]");
		mapSecondRowHeader.put("FIXML", "/AllocInstrctn/Instmt/@SecTyp=FUT");

		mapThirdRowHeader.put("Structure", null);
		mapThirdRowHeader.put("Field", "membExchIdCodOboMs");
		mapThirdRowHeader.put("Data", "char[]");
		mapThirdRowHeader.put("FIXML", "NA");

		listOfMaps.add(mapFirstRowHeader);
		listOfMaps.add(mapSecondRowHeader);
		listOfMaps.add(mapThirdRowHeader);

		Map headerAfterParser = new LinkedHashMap();

		headerAfterParser.put("dataHeaderT.exchApplId",
				"AllocInstrctn.Pty.ID!AllocInstrctn.Pty.R=21");
		headerAfterParser.put("dataHeaderT.prodLine",
				"AllocInstrctn.Instmt.SecTyp=FUT");

		DTOParserForEurex dto = new DTOParserForEurex(listOfMaps);

		assertEquals(headerAfterParser, dto.getHeader());
	}

	@Test
	public void testDTOParserForEurexBody() {
		Map mapFirstRowBasic = new LinkedHashMap();
		Map mapSecondRowBasic = new LinkedHashMap();
		Map mapThirdRowBasic = new LinkedHashMap();

		mapFirstRowBasic.put("Structure", "basic (futBscAcptGivUpTrnRequestT)");
		mapFirstRowBasic.put("Field", "membClgIdCodFrom");
		mapFirstRowBasic.put("Data", "char[]");
		mapFirstRowBasic.put("FIXML",
				"/AllocInstrctn/Pty/@ID\n/AllocInstrctn/Pty/@R=4");

		mapSecondRowBasic.put("Structure", null);
		mapSecondRowBasic.put("Field", "futCntrIdGrp");
		mapSecondRowBasic.put("Data", null);
		mapSecondRowBasic.put("FIXML", null);

		mapThirdRowBasic.put("Structure", null);
		mapThirdRowBasic.put("Field", "prodId");
		mapThirdRowBasic.put("Data", "char[]");
		mapThirdRowBasic.put("FIXML", "/AllocInstrctn/Instmt/@CFI");

		listOfMaps.add(mapFirstRowBasic);
		listOfMaps.add(mapSecondRowBasic);
		listOfMaps.add(mapThirdRowBasic);

		Map bodyAfterParser = new LinkedHashMap();

		bodyAfterParser.put("futBscAcptGivUpTrnRequestT.membClgIdCodFrom",
				"AllocInstrctn.Pty.ID!AllocInstrctn.Pty.R=4");
		bodyAfterParser.put("futBscAcptGivUpTrnRequestT.futCntrIdGrp.prodId",
				"AllocInstrctn.Instmt.CFI");

		DTOParserForEurex dto = new DTOParserForEurex(listOfMaps);

		assertEquals(bodyAfterParser, dto.getBody());
	}

	@Test
	public void testDTOParserForEurexFooter() {
		Map mapFirstRowFooter = new LinkedHashMap();
		Map mapSecondRowFooter = new LinkedHashMap();
		
		mapFirstRowFooter.put("Structure", "extension (optExtModGivUpTrnRequestT)");
		mapFirstRowFooter.put("Field", "txtGrpTo");
		mapFirstRowFooter.put("Data", null);
		mapFirstRowFooter.put("FIXML", null);

		mapSecondRowFooter.put("Structure", null);
		mapSecondRowFooter.put("Field", "cust");
		mapSecondRowFooter.put("Data", "char[]");
		mapSecondRowFooter.put("FIXML", "/AllocInstrctn/Instmt/@ext");
		
		listOfMaps.add(mapFirstRowFooter);
		listOfMaps.add(mapSecondRowFooter);

		Map footerAfterParser = new LinkedHashMap();

		footerAfterParser.put("optExtModGivUpTrnRequestT.txtGrpTo.cust",
		"AllocInstrctn.Instmt.ext");

		DTOParserForEurex dto = new DTOParserForEurex(listOfMaps);

		//System.out.println(dto.getFooter());
		assertEquals(footerAfterParser, dto.getFooter());
	}
	
	@Test
	public void testDTOParserForEurexSeqNo() {
		Map mapFirstRowSeq = new LinkedHashMap();
		Map mapSecondRowSeq = new LinkedHashMap();
		
		mapFirstRowSeq.put("Structure", "seqNo (optBscSeqNoT)");
		mapFirstRowSeq.put("Field", "stmSeqNo");
		mapFirstRowSeq.put("Data", "char[]");
		mapFirstRowSeq.put("FIXML", "/TrdCaptRpt/@RptID");

		mapSecondRowSeq.put("Structure", null);
		mapSecondRowSeq.put("Field", "prodSeqNo");
		mapSecondRowSeq.put("Data", "char[]");
		mapSecondRowSeq.put("FIXML", "/TrdCaptRpt/@TotNumTrdRpts");
		
		listOfMaps.add(mapFirstRowSeq);
		listOfMaps.add(mapSecondRowSeq);

		Map seqAfterParser = new LinkedHashMap();

		seqAfterParser.put("optBscSeqNoT.stmSeqNo",
				"TrdCaptRpt.RptID");
		seqAfterParser.put("optBscSeqNoT.prodSeqNo",
		"TrdCaptRpt.TotNumTrdRpts");

		DTOParserForEurex dto = new DTOParserForEurex(listOfMaps);

		//System.out.println(dto.getFooter());
		assertEquals(seqAfterParser, dto.getSeqNo());
	}
	
	@Test
	public void testDTOParserForEurexMetaData(){
		Map mapFirstRowHeader = new LinkedHashMap();
		Map mapSecondRowHeader = new LinkedHashMap();
		Map mapThirdRowHeader = new LinkedHashMap();
		Map mapFirstRowBasic = new LinkedHashMap();
		Map mapSecondRowBasic = new LinkedHashMap();
		Map mapThirdRowBasic = new LinkedHashMap();
		Map mapFirstRowFooter = new LinkedHashMap();
		Map mapSecondRowFooter = new LinkedHashMap();
		Map mapFirstRowSeq = new LinkedHashMap();
		Map mapSecondRowSeq = new LinkedHashMap();
		
		mapFirstRowHeader.put("Structure", "header (dataHeaderT)");
		mapFirstRowHeader.put("Field", "exchApplId");
		mapFirstRowHeader.put("Data", "char[]");
		mapFirstRowHeader.put("FIXML",
				"/AllocInstrctn/Pty/@ID\n/AllocInstrctn/Pty/@R=21");

		mapSecondRowHeader.put("Structure", null);
		mapSecondRowHeader.put("Field", "prodLine");
		mapSecondRowHeader.put("Data", "char[]");
		mapSecondRowHeader.put("FIXML", "/AllocInstrctn/Instmt/@SecTyp=FUT");

		mapThirdRowHeader.put("Structure", null);
		mapThirdRowHeader.put("Field", "membExchIdCodOboMs");
		mapThirdRowHeader.put("Data", "char[]");
		mapThirdRowHeader.put("FIXML", "NA");
		
		mapFirstRowBasic.put("Structure", "basic (futBscAcptGivUpTrnRequestT)");
		mapFirstRowBasic.put("Field", "membClgIdCodFrom");
		mapFirstRowBasic.put("Data", "char[]");
		mapFirstRowBasic.put("FIXML",
				"/AllocInstrctn/Pty/@ID\n/AllocInstrctn/Pty/@R=4");

		mapSecondRowBasic.put("Structure", null);
		mapSecondRowBasic.put("Field", "futCntrIdGrp");
		mapSecondRowBasic.put("Data", null);
		mapSecondRowBasic.put("FIXML", null);

		mapThirdRowBasic.put("Structure", null);
		mapThirdRowBasic.put("Field", "prodId");
		mapThirdRowBasic.put("Data", "char[]");
		mapThirdRowBasic.put("FIXML", "/AllocInstrctn/Instmt/@CFI");
		
		mapFirstRowFooter.put("Structure", "extension (optExtModGivUpTrnRequestT)");
		mapFirstRowFooter.put("Field", "txtGrpTo");
		mapFirstRowFooter.put("Data", null);
		mapFirstRowFooter.put("FIXML", null);

		mapSecondRowFooter.put("Structure", null);
		mapSecondRowFooter.put("Field", "cust");
		mapSecondRowFooter.put("Data", "char[]");
		mapSecondRowFooter.put("FIXML", "/AllocInstrctn/Instmt/@ext");
		
		mapFirstRowSeq.put("Structure", "seqNo (optBscSeqNoT)");
		mapFirstRowSeq.put("Field", "stmSeqNo");
		mapFirstRowSeq.put("Data", "char[]");
		mapFirstRowSeq.put("FIXML", "/TrdCaptRpt/@RptID");

		mapSecondRowSeq.put("Structure", null);
		mapSecondRowSeq.put("Field", "prodSeqNo");
		mapSecondRowSeq.put("Data", "char[]");
		mapSecondRowSeq.put("FIXML", "/TrdCaptRpt/@TotNumTrdRpts");
		
		listOfMaps.add(mapFirstRowSeq);
		listOfMaps.add(mapSecondRowSeq);
		listOfMaps.add(mapFirstRowHeader);
		listOfMaps.add(mapSecondRowHeader);
		listOfMaps.add(mapThirdRowHeader);
		listOfMaps.add(mapFirstRowBasic);
		listOfMaps.add(mapSecondRowBasic);
		listOfMaps.add(mapThirdRowBasic);
		listOfMaps.add(mapFirstRowFooter);
		listOfMaps.add(mapSecondRowFooter);
		
		
		Map metaDataAfterParser = new LinkedHashMap();

		
		metaDataAfterParser.put("optExtModGivUpTrnRequestT.txtGrpTo.cust",
				"AllocInstrctn.Instmt.ext");
		
		
		DTOParserForEurex dto = new DTOParserForEurex(listOfMaps);
		assertEquals(metaDataAfterParser, dto.getMetaData());
	}
}
