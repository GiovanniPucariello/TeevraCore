package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SideCrossOrdModGrpBlockT;
import org.fixprotocol.fixml_5_0.PositionEffectEnumT;
import org.fixprotocol.fixml_5_0.ForexReqEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.OrderCapacityEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SolicitedFlagEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:36 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:36 IST 2010")
public class SideCrossOrdModGrpBlockTBeanAccessor implements BeanAccessor<SideCrossOrdModGrpBlockT> {
	
	private SideCrossOrdModGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdLinkID();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSolFlag();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDayBkngInst();
		}
		else if("sideComplianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getSideComplianceID();
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			return this.bean.getPrTrdAnon();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("covered".equalsIgnoreCase(accessPath)){
			return this.bean.getCovered();
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPreallocMeth();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("preAll".equalsIgnoreCase(accessPath)){
			return this.bean.getPreAll();
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignDt();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			return this.bean.getCshMgn();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("sideTmFrc".equalsIgnoreCase(accessPath)){
			return this.bean.getSideTmFrc();
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			return this.bean.getForexReq();
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngUnit();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdLinkID((String) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
			return;
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			this.bean.setSolFlag(SolicitedFlagEnumT.valueOf(obj.toString()));
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			this.bean.setAllocID((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			this.bean.setSide((String) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			this.bean.setQtyTyp((Integer) obj);
			return;
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			this.bean.setDayBkngInst((String) obj);
			return;
		}
		else if("sideComplianceID".equalsIgnoreCase(accessPath)){
			this.bean.setSideComplianceID((String) obj);
			return;
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			this.bean.setPrTrdAnon((String) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("covered".equalsIgnoreCase(accessPath)){
			this.bean.setCovered((Integer) obj);
			return;
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			this.bean.setPreallocMeth((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			this.bean.setRstctions((String) obj);
			return;
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			this.bean.setOrignDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBkngTyp((Integer) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			this.bean.setClrFeeInd((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			this.bean.setCshMgn((String) obj);
			return;
		}
		else if("sideTmFrc".equalsIgnoreCase(accessPath)){
			this.bean.setSideTmFrc((XMLGregorianCalendar) obj);
			return;
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			this.bean.setForexReq(ForexReqEnumT.valueOf(obj.toString()));
			return;
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			this.bean.setBkngUnit((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCustCpcty((Integer) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SideCrossOrdModGrpBlockT obj) {
		this.bean = obj; 
	}

}
