/**
 * 
 */
package com.headstrong.fusion.bo.java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.teevra_fixml_1_0.AllocationInstructionMessageT;
import com.headstrong.teevra_fixml_1_0.AllocationReportMessageT;
import com.headstrong.teevra_fixml_1_0.FIXML;
import com.headstrong.teevra_fixml_1_0.NestedPartiesBlockT;
import com.headstrong.teevra_fixml_1_0.ObjectFactory;
import com.headstrong.teevra_fixml_1_0.TradeCaptureReportMessageT;

/**
 * @author som krishan
 * 
 */
public class JavaBusinessObjectTest extends TestCase {

	public void testLevel1() throws Exception {
		JavaBusinessObject javaBo = new JavaBusinessObject(
				SampleJavaClass.class);
		javaBo.setValue("attribute1", "attribute1");
		assertEquals("attribute1", javaBo.getValue("attribute1"));
	}

	public void testLevel2() throws Exception {
		JavaBusinessObject javaBo = new JavaBusinessObject(
				SampleJavaClass.class);
		javaBo.setValue("sampleJavaClass1.attribute1", 1);
		assertEquals(1, javaBo.getValue("sampleJavaClass1.attribute1"));
	}

	public void testLevel2ArrFilter() throws Exception {
		JavaBusinessObject javaBo = new JavaBusinessObject(
				SampleJavaClass.class);
		Map<String, String> attr1 = new HashMap<String, String>();
		attr1.put("attr1", "attr1");

		javaBo.setValue("sampleJavaClass2List.attribute1", attr1);
		javaBo.setValue("sampleJavaClass2List.attribute1", attr1);
		assertEquals(attr1, javaBo
				.getValue("sampleJavaClass2List[0].attribute1"));
		assertEquals(attr1, javaBo
				.getValue("sampleJavaClass2List[1].attribute1"));
	}

	public void testLevel3ArrFilter() throws Exception {
		JavaBusinessObject javaBo = new JavaBusinessObject(
				SampleJavaClass.class);
		javaBo.setValue("sampleJavaClass2List.sampleJavaClass3.attribute3",
				"attribute3");
		assertEquals(
				"attribute3",
				javaBo
						.getValue("sampleJavaClass2List[0].sampleJavaClass3.attribute3[0]"));
	}

	public void testLevel3KeyValueArrFilter() throws Exception {
		JavaBusinessObject javaBo = new JavaBusinessObject(
				SampleJavaClass.class);
		javaBo.setValue("sampleJavaClass2List.stringAttribute", "attribute2");
		javaBo.setValue("sampleJavaClass2List.stringAttribute", "attribute3");
		assertEquals(
				"attribute3",
				javaBo
						.getValue("sampleJavaClass2List[stringAttribute=attribute3].stringAttribute"));

		assertNotSame(
				"attribute3",
				javaBo
						.getValue("sampleJavaClass2List[stringAttribute=attribute2].stringAttribute"));
	}

	/*
	 * public void testLevel3MultiKeyValueArrFilter() throws Exception {
	 * JavaBusinessObject javaBo = new JavaBusinessObject(
	 * SampleJavaClass.class);
	 * javaBo.setValue("sampleJavaClass2List.stringAttribute", "attribute2");
	 * javaBo.setValue("sampleJavaClass2List.stringAttribute", "attribute3");
	 * javaBo.setValue("sampleJavaClass2List.stringAttribute", "attribute4");
	 * 
	 * List<SampleJavaClass2> lst = new ArrayList(); SampleJavaClass2 sample1 =
	 * new SampleJavaClass2(); sample1.setStringAttribute("attribute2");
	 * SampleJavaClass2 sample2 = new SampleJavaClass2();
	 * sample2.setStringAttribute("attribute2"); lst.add(sample1);
	 * lst.add(sample2); assertEquals( lst, javaBo
	 * .getValue("sampleJavaClass2List[stringAttribute=attribute3, attribute2]"
	 * )); }
	 */

	public void testComplexAllocationSetter() throws Exception {
		AllocationInstructionMessageT alloc = new AllocationInstructionMessageT();
		JavaBusinessObject allocBo = new JavaBusinessObject(alloc);
		allocBo.setValue("Alloc.Pty.R", new BigInteger("1"));
		allocBo.setValue("Alloc[0].Pty[R=1].ID", "12312");
		assertEquals("12312", allocBo.getValue("Alloc[0].Pty[R=1].ID"));
	}

	public void testCreateAndSetValue() throws Exception {
		ObjectFactory objFactory = new ObjectFactory();
		AllocationInstructionMessageT alloc = objFactory
				.createAllocationInstructionMessageT();
		// FIXML fixml = objFactory.createFIXML();
		// fixml.setMessage(objFactory.createMessage(alloc));
		JavaBusinessObject allocBo = new JavaBusinessObject(alloc);
		allocBo.setValue("Alloc[acct=123].txt", "12312");
		allocBo.setValue("Alloc[acct=124].txt", "12412");
		assertEquals("123", allocBo.getValue("Alloc[txt=12312].acct"));
		assertEquals("124", allocBo.getValue("Alloc[txt=12412].acct"));
	}

	public void testCreateAndGetValue() throws Exception {
		ObjectFactory objFactory = new ObjectFactory();
		TradeCaptureReportMessageT trd = objFactory
				.createTradeCaptureReportMessageT();
		FIXML fixml = objFactory.createFIXML();
		fixml.setMessage(objFactory.createMessage(trd));
		JavaBusinessObject trdBo = new JavaBusinessObject(fixml);
		trdBo.setValue("message.value.RptSide.Side", "2");
		try {
			System.out.println(trdBo.getValue("message.value.testAttrib"));
		} catch (AttributeNotFoundException e) {
			System.out.println("Attribute does not exist - testAttrib");
		}

		assertNotSame("2", trdBo.getValue("message.value.RptSide[Side=1].Side"));
		assertEquals("2", trdBo.getValue("message.value.RptSide[Side=2].Side"));
		assertNull(trdBo.getValue("message.value.RptSide[Side=1].Side"));
	}

	public void testSingleListElement() throws Exception {
		ObjectFactory objFactory = new ObjectFactory();
		NestedPartiesBlockT pty = objFactory.createNestedPartiesBlockT();

		JavaBusinessObject trdBo = new JavaBusinessObject(pty);
		trdBo.setValue("ID[R=4]", "abc");
		System.out.println(pty.getR());
	}

	// public void testAllocReptDefaults(){
	// ObjectFactory factory = new ObjectFactory();
	// AllocationReportMessageT allocRpt =
	// factory.createAllocationReportMessageT();
	// assertEquals(0,allocRpt.getRptTyp());
	// assertEquals(0,allocRpt.getStat());
	//		
	// }

	public void testEnumInFilter() throws Exception {
		ObjectFactory objFactory = new ObjectFactory();
		TradeCaptureReportMessageT trd = objFactory
				.createTradeCaptureReportMessageT();
		FIXML fixml = objFactory.createFIXML();
		fixml.setMessage(objFactory.createMessage(trd));
		JavaBusinessObject trdBo = new JavaBusinessObject(fixml);
		String x = "abcd";


		// trdBo.setValue("message.value.RtPrtys[RtPrtyID=ABCD].RtPtyRl", 14);
		trdBo.setValue("message.value.Amt[Typ=PREM].Amt", new BigDecimal("12345"));
        assertEquals(new BigDecimal("12345"),trdBo.getValue("message.value.Amt[Typ=PREM].Amt"));
        //assertEquals(14, trdBo.getValue("message.value.RtPrtys[RtPrtyID=ABCD].RtPtyRl"));
		// trdBo.setValue("message.value.RtPrtys[RtPrtyID=ABCD].RtPtyRl", 14);
		trdBo.setValue("message.value.Amt[Typ=PREM].Amt", new BigDecimal(
				"12345"));
		String namespace = trdBo.getValue(
				"message.name.namespaceuri").toString();
		String fixmlVersion = namespace.substring(namespace.lastIndexOf("/") + 1)
				.trim();
		System.out.println(fixmlVersion);
		assertEquals(new BigDecimal("12345"), trdBo
				.getValue("message.value.Amt[Typ=PREM].Amt"));
		// assertEquals(14,
		// trdBo.getValue("message.value.RtPrtys[RtPrtyID=ABCD].RtPtyRl"));

	}
}
