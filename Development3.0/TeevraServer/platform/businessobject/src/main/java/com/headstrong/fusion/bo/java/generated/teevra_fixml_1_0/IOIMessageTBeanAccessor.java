package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.IOIMessageT;
import com.headstrong.teevra_fixml_1_0.OrderQtyDataBlockT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import com.headstrong.teevra_fixml_1_0.IOIQltyIndEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.FinancingDetailsBlockT;
import com.headstrong.teevra_fixml_1_0.IOITransTypeEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;
import com.headstrong.teevra_fixml_1_0.IOINaturalFlagEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class IOIMessageTBeanAccessor implements BeanAccessor<IOIMessageT> {
	
	private IOIMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("qltyInd".equalsIgnoreCase(accessPath)){
			return this.bean.getQltyInd();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			return this.bean.getValidUntilTm();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			return this.bean.getURL();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("natFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getNatFlag();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("iOI".equalsIgnoreCase(accessPath)){
			return this.bean.getIOI();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("qual".equalsIgnoreCase(accessPath)){
			return this.bean.getQual();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("qltyInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setQltyInd(IOIQltyIndEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			 this.bean.setURL((String) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("natFlag".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setNatFlag(IOINaturalFlagEnumT.valueOf(obj.toString()));
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTransTyp(IOITransTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			 this.bean.setValidUntilTm((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(IOIMessageT obj) {
		this.bean = obj; 
	}

}
