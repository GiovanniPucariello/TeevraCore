package com.headstrong.fusion.configGenerator.core;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.headstrong.fusion.configGenerator.commObjs.MessageDTO;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactory;
import com.headstrong.fusion.configGenerator.dataFactory.TableDataFactoryForEurex;
import com.headstrong.fusion.configGenerator.core.eurex.GeneratorProcessorForEurex;
import com.headstrong.fusion.configGenerator.core.eurex.DTOTransformerForEurex;

public class TestDTOTransformerForEurex extends TestCase {
	String DRIVER_NAME = "sun.jdbc.odbc.JdbcOdbcDriver";
	String DATABASE_URL = "jdbc:odbc:teevra";
	private final static String QUERY_TYPE_OPT_REQ = "OPTIONS-REQUEST";
	private final static String QUERY_TYPE_OPT_RES = "OPTIONS-RESPONSE";

	public void setUp() {

		Properties props = new Properties();
		props.put("DRIVER_NAME", DRIVER_NAME);
		props.put("DATABASE_URL", DATABASE_URL);
		// init connection
		new GeneratorProcessorForEurex();

	}

	@Test
	public void testcreateRequestMaps() {
		TableDataFactory sheetDataFactory = TableDataFactory
				.getFactory("Test Case$",DATABASE_URL);
		List<Map> mapList = sheetDataFactory.getQueryData(QUERY_TYPE_OPT_REQ);
		MessageDTO dto = new MessageDTO(mapList, QUERY_TYPE_OPT_REQ);

		DTOTransformer transformer = new DTOTransformerForEurex(dto);
		List<Map<String, Map>> outputMap = transformer
				.getObjects(QUERY_TYPE_OPT_REQ);

		Map<String, Map> outputFixToBO = outputMap.get(0);
		Map outputMappingFixtoBO = new LinkedHashMap();

		Iterator it = outputFixToBO.keySet().iterator();

		while (it.hasNext()) {
			String bodyType = it.next().toString();
			outputMappingFixtoBO.putAll(outputFixToBO.get(bodyType));
		}

		int fixToBOSize = outputMappingFixtoBO.size();

		Map<String, Map> outputBOtoC = outputMap.get(1);
		Map outputMappingBOtoFix = new LinkedHashMap();

		Iterator ite = outputBOtoC.keySet().iterator();

		while (ite.hasNext()) {
			String bodyType = ite.next().toString();
			outputMappingBOtoFix.putAll(outputBOtoC.get(bodyType));
		}

		int bOtoCSize = outputMappingBOtoFix.size();

		// To test if # of mapping in fixtoBO is equal to # of bindings in bOtoC
		assertEquals(bOtoCSize, fixToBOSize);

		List<Map<String, Map>> expectedRequest = new LinkedList<Map<String, Map>>();
		Map expectedSeqNoMap = new LinkedHashMap();

		Map expectedHeaderMap = new LinkedHashMap();
		expectedHeaderMap.put("PosMntReq.Pty[R=21].ID",
				"dataHeaderT.exchApplId");
		expectedHeaderMap.put("PosMntReq.Instmt.SecTyp=OPT",
				"dataHeaderT.prodLine");

		Map expectedBaseMap = new LinkedHashMap();
		expectedBaseMap.put("PosMntReq.Pty[R=4].ID",
				"optBscEntAutExerAbdnRequestT.membClgIdCod");
		expectedBaseMap.put("PosMntReq.Pty[R=1].ID",
				"optBscEntAutExerAbdnRequestT.membExchIdCod");
		expectedBaseMap.put("PosMntReq.Pty.R|30!A|14! |66! M|4! P)",
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.acctTypCod");
		expectedBaseMap.put("AllocInstrctn[TransTyp=0].Typ|2!G|15!T)",
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.givUpTakUpInd");

		Map expectedFooterMap = new LinkedHashMap();

		Map<String, Map> expectedFixToBO = new LinkedHashMap<String, Map>();
		expectedFixToBO.put("SeqNo", expectedSeqNoMap);
		expectedFixToBO.put("Header", expectedHeaderMap);
		expectedFixToBO.put("Base", expectedBaseMap);
		expectedFixToBO.put("Footer", expectedFooterMap);

		expectedRequest.add(expectedFixToBO);

		expectedSeqNoMap = new LinkedHashMap();

		expectedBaseMap = new LinkedHashMap();
		expectedBaseMap.put("optBscEntAutExerAbdnRequestT.membClgIdCod",
				"optBscEntAutExerAbdnRequestT.membClgIdCod");
		expectedBaseMap.put("optBscEntAutExerAbdnRequestT.membExchIdCod",
				"optBscEntAutExerAbdnRequestT.membExchIdCod");
		expectedBaseMap.put(
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.acctTypCod",
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.acctTypCod");
		expectedBaseMap.put(
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.givUpTakUpInd",
				"optBscEntAutExerAbdnRequestT.acctTypCodGrp.givUpTakUpInd");

		expectedHeaderMap = new LinkedHashMap();
		expectedHeaderMap.put("dataHeaderT.exchApplId",
				"dataHeaderT.exchApplId");
		expectedHeaderMap.put("dataHeaderT.prodLine", "dataHeaderT.prodLine");
		expectedFooterMap = new LinkedHashMap();

		Map<String, Map> expectedBOToC = new LinkedHashMap<String, Map>();
		expectedBOToC.put("SeqNo", expectedSeqNoMap);
		expectedBOToC.put("Header", expectedHeaderMap);
		expectedBOToC.put("Base", expectedBaseMap);
		expectedBOToC.put("Footer", expectedFooterMap);

		expectedRequest.add(expectedBOToC);

		// To test whether outputMap from exccel after DTOTransform is same as expected
		assertEquals(expectedRequest, outputMap);

	}

	@Test
	public void testcreateResponseMaps() {
		TableDataFactory sheetDataFactory = TableDataFactory
				.getFactory("Test Case$",DATABASE_URL);
		List<Map> mapList = sheetDataFactory.getQueryData(QUERY_TYPE_OPT_RES);
		MessageDTO dto = new MessageDTO(mapList, QUERY_TYPE_OPT_RES);
		// System.out.println(dto.getMetaData());
		DTOTransformer transformer = new DTOTransformerForEurex(dto);
		List<Map<String, Map>> outputMap = transformer
				.getObjects(QUERY_TYPE_OPT_RES);

		assertEquals("1", "1");
		Map<String, Map> outputCToBO = outputMap.get(0);
		Map outputMappingCtoBO = new LinkedHashMap();

		Iterator it = outputCToBO.keySet().iterator();

		while (it.hasNext()) {
			String bodyType = it.next().toString();
			outputMappingCtoBO.putAll(outputCToBO.get(bodyType));
		}

		int cToBOSize = outputMappingCtoBO.size();

		Map<String, Map> outputBOtoFix = outputMap.get(1);
		Map outputMappingBOtoFix = new LinkedHashMap();

		Iterator ite = outputBOtoFix.keySet().iterator();

		while (ite.hasNext()) {
			String bodyType = ite.next().toString();
			outputMappingBOtoFix.putAll(outputBOtoFix.get(bodyType));
		}

		int bOtoFixSize = outputMappingBOtoFix.size();

		// To test if # of mapping in bOtofix is equal to # of bindings in ctoBO
		assertEquals(bOtoFixSize, cToBOSize);

		List<Map<String, Map>> expectedResponse = new LinkedList<Map<String, Map>>();
		Map expectedSeqNoMap = new LinkedHashMap();
		expectedSeqNoMap
				.put("futBscSeqNoT.prodSeqNo", "futBscSeqNoT.prodSeqNo");
		expectedSeqNoMap
				.put("futBscSeqNoT.cntrSeqNo", "futBscSeqNoT.cntrSeqNo");

		Map expectedHeaderMap = new LinkedHashMap();
		expectedHeaderMap.put("dataHeaderT.exchApplId",
				"dataHeaderT.exchApplId");
		expectedHeaderMap.put("dataHeaderT.prodLine", "dataHeaderT.prodLine");

		Map expectedBaseMap = new LinkedHashMap();

		Map expectedFooterMap = new LinkedHashMap();
		expectedFooterMap.put("optExtEntAutExerAbdnResponseT.abdnQtyAdj",
				"optExtEntAutExerAbdnResponseT.abdnQtyAdj");

		Map<String, Map> expectedCToBO = new LinkedHashMap<String, Map>();
		expectedCToBO.put("SeqNo", expectedSeqNoMap);
		expectedCToBO.put("Header", expectedHeaderMap);
		expectedCToBO.put("Base", expectedBaseMap);
		expectedCToBO.put("Footer", expectedFooterMap);

		expectedResponse.add(expectedCToBO);

		expectedSeqNoMap = new LinkedHashMap();
		expectedSeqNoMap.put("futBscSeqNoT.prodSeqNo",
				"TrdCaptRpt.TotNumTrdRpts");
		expectedSeqNoMap.put("futBscSeqNoT.cntrSeqNo",
				"TrdCaptRpt.TotNumTrdRpts");

		expectedBaseMap = new LinkedHashMap();
		expectedHeaderMap = new LinkedHashMap();

		expectedHeaderMap.put("dataHeaderT.exchApplId",
				"PosMntRpt.Pty[R=21].ID");
		expectedHeaderMap.put("dataHeaderT.prodLine",
				"PosMntRpt.Instmt.SecTyp=OPT");
		expectedFooterMap = new LinkedHashMap();
		expectedFooterMap.put("optExtEntAutExerAbdnResponseT.abdnQtyAdj",
				"PosMntReq.Qty[Typ=TQ].Long");

		Map<String, Map> expectedBOToFix = new LinkedHashMap<String, Map>();
		expectedBOToFix.put("SeqNo", expectedSeqNoMap);
		expectedBOToFix.put("Header", expectedHeaderMap);
		expectedBOToFix.put("Base", expectedBaseMap);
		expectedBOToFix.put("Footer", expectedFooterMap);

		expectedResponse.add(expectedBOToFix);

		// To test whether outputMap from exccel after DTOTransform is same as expected
		assertEquals(expectedResponse, outputMap);

	}
}
