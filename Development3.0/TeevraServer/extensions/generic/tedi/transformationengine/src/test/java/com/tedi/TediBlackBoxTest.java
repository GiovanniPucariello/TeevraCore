package com.tedi;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;

import junit.framework.TestCase;
import objTedi.objTedi_srcfile;

import org.junit.Test;

import com.tedi.beans.TransformResult;
import com.tedi.engine.TediBlackBox;

public class TediBlackBoxTest extends TestCase {

	@Test
	public void testdoTransformToBean() throws Exception {

		String mapConfig = "M_Teevra_C21_FixedToFIXML";
		String srcName = "S_Teevra_C21_MultiFixed";

		File file = new File(System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\tedi\\sources\\" + srcName + ".dat");

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		objTedi_srcfile theSrc = (objTedi_srcfile) ois.readObject();
		Hashtable<String, objTedi_srcfile> srcHash = new Hashtable<String, objTedi_srcfile>();
		srcHash.put(srcName, theSrc);
		TediBlackBox.setCachedSourceMap(mapConfig, srcHash);

		String inputMsg = "2031EUR31          JPMC1     JPMCEx1   OCXXXX      JPR856745                 JPMCTRD00120081204GVPMC002  2008120520090512000101JPMCIBX   CLRHSXX   000000000450000                  AOJPMC123                                                                                                ";
		TransformResult result = TediBlackBox.doTransformToBean(mapConfig,
				inputMsg);
		String payload = result.getPayload();
		assertNotNull(payload);
	}

}