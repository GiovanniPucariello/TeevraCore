package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.BidRequestMessageT;
import org.fixprotocol.fixml_5_0.ForexReqEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.BidRequestTransTypeEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.BidTradeTypeEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;
import org.fixprotocol.fixml_5_0.ExchangeForPhysicalEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class BidRequestMessageTBeanAccessor implements BeanAccessor<BidRequestMessageT> {
	
	private BidRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("listName".equalsIgnoreCase(accessPath)){
			return this.bean.getListName();
		}
		else if("numBidders".equalsIgnoreCase(accessPath)){
			return this.bean.getNumBidders();
		}
		else if("bidTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBidTyp();
		}
		else if("basisPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBasisPxTyp();
		}
		else if("bidTrdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBidTrdTyp();
		}
		else if("progRptReqs".equalsIgnoreCase(accessPath)){
			return this.bean.getProgRptReqs();
		}
		else if("sideValu2".equalsIgnoreCase(accessPath)){
			return this.bean.getSideValu2();
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoReltdSym();
		}
		else if("sideValu1".equalsIgnoreCase(accessPath)){
			return this.bean.getSideValu1();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("compReq".equalsIgnoreCase(accessPath)){
			return this.bean.getCompReq();
		}
		else if("eFP".equalsIgnoreCase(accessPath)){
			return this.bean.getEFP();
		}
		else if("crssPct".equalsIgnoreCase(accessPath)){
			return this.bean.getCrssPct();
		}
		else if("wtAvgLqdty".equalsIgnoreCase(accessPath)){
			return this.bean.getWtAvgLqdty();
		}
		else if("numTkts".equalsIgnoreCase(accessPath)){
			return this.bean.getNumTkts();
		}
		else if("outMainCntryUNdx".equalsIgnoreCase(accessPath)){
			return this.bean.getOutMainCntryUNdx();
		}
		else if("incTaxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getIncTaxInd();
		}
		else if("strkTm".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkTm();
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			return this.bean.getBidID();
		}
		else if("progPeriodIntvl".equalsIgnoreCase(accessPath)){
			return this.bean.getProgPeriodIntvl();
		}
		else if("clBidID".equalsIgnoreCase(accessPath)){
			return this.bean.getClBidID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("lqdtyIndTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyIndTyp();
		}
		else if("descReq".equalsIgnoreCase(accessPath)){
			return this.bean.getDescReq();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("bidReqTransTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBidReqTransTyp();
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			return this.bean.getForexReq();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("listName".equalsIgnoreCase(accessPath)){
			this.bean.setListName((String) obj);
			return;
		}
		else if("bidTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBidTyp((Integer) obj);
			return;
		}
		else if("numBidders".equalsIgnoreCase(accessPath)){
			this.bean.setNumBidders((Integer) obj);
			return;
		}
		else if("basisPxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBasisPxTyp((String) obj);
			return;
		}
		else if("bidTrdTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBidTrdTyp(BidTradeTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("progRptReqs".equalsIgnoreCase(accessPath)){
			this.bean.setProgRptReqs((Integer) obj);
			return;
		}
		else if("sideValu2".equalsIgnoreCase(accessPath)){
			this.bean.setSideValu2((BigDecimal) obj);
			return;
		}
		else if("sideValu1".equalsIgnoreCase(accessPath)){
			this.bean.setSideValu1((BigDecimal) obj);
			return;
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			this.bean.setTotNoReltdSym((Integer) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("eFP".equalsIgnoreCase(accessPath)){
			this.bean.setEFP(ExchangeForPhysicalEnumT.valueOf(obj.toString()));
			return;
		}
		else if("crssPct".equalsIgnoreCase(accessPath)){
			this.bean.setCrssPct((BigDecimal) obj);
			return;
		}
		else if("wtAvgLqdty".equalsIgnoreCase(accessPath)){
			this.bean.setWtAvgLqdty((BigDecimal) obj);
			return;
		}
		else if("numTkts".equalsIgnoreCase(accessPath)){
			this.bean.setNumTkts((Integer) obj);
			return;
		}
		else if("outMainCntryUNdx".equalsIgnoreCase(accessPath)){
			this.bean.setOutMainCntryUNdx((BigDecimal) obj);
			return;
		}
		else if("incTaxInd".equalsIgnoreCase(accessPath)){
			this.bean.setIncTaxInd((Integer) obj);
			return;
		}
		else if("strkTm".equalsIgnoreCase(accessPath)){
			this.bean.setStrkTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			this.bean.setBidID((String) obj);
			return;
		}
		else if("progPeriodIntvl".equalsIgnoreCase(accessPath)){
			this.bean.setProgPeriodIntvl((Integer) obj);
			return;
		}
		else if("clBidID".equalsIgnoreCase(accessPath)){
			this.bean.setClBidID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("lqdtyIndTyp".equalsIgnoreCase(accessPath)){
			this.bean.setLqdtyIndTyp((Integer) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("bidReqTransTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBidReqTransTyp(BidRequestTransTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("forexReq".equalsIgnoreCase(accessPath)){
			this.bean.setForexReq(ForexReqEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BidRequestMessageT obj) {
		this.bean = obj; 
	}

}
