package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.QuoteMessageT;
import com.headstrong.teevra_fixml_1_0.OrderQtyDataBlockT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import com.headstrong.teevra_fixml_1_0.OrderCapacityEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import com.headstrong.teevra_fixml_1_0.SettlCurrFxRateCalcEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.FinancingDetailsBlockT;
import com.headstrong.teevra_fixml_1_0.ExDestinationIDSourceEnumT;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class QuoteMessageTBeanAccessor implements BeanAccessor<QuoteMessageT> {
	
	private QuoteMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("settlCurrBidFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrBidFxRt();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("bidFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getBidFwdPnts();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("minOfrSz".equalsIgnoreCase(accessPath)){
			return this.bean.getMinOfrSz();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrPx();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("bidSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getBidSpotRt();
		}
		else if("settlCurrOfrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrOfrFxRt();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("qtMsgID".equalsIgnoreCase(accessPath)){
			return this.bean.getQtMsgID();
		}
		else if("midYld".equalsIgnoreCase(accessPath)){
			return this.bean.getMidYld();
		}
		else if("mktOfrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getMktOfrPx();
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			return this.bean.getValidUntilTm();
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			return this.bean.getQty2();
		}
		else if("quot".equalsIgnoreCase(accessPath)){
			return this.bean.getQuot();
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("rtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSrc();
		}
		else if("commTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCommTyp();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			return this.bean.getMinQty();
		}
		else if("ofrFwdPnts2".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrFwdPnts2();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("ofrYld".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrYld();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("rspLvl".equalsIgnoreCase(accessPath)){
			return this.bean.getRspLvl();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("prvtQt".equalsIgnoreCase(accessPath)){
			return this.bean.getPrvtQt();
		}
		else if("mktBidPx".equalsIgnoreCase(accessPath)){
			return this.bean.getMktBidPx();
		}
		else if("bidPx".equalsIgnoreCase(accessPath)){
			return this.bean.getBidPx();
		}
		else if("ofrSwapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrSwapPnts();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("bidSwapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getBidSwapPnts();
		}
		else if("ofrSz".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrSz();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("minBidSz".equalsIgnoreCase(accessPath)){
			return this.bean.getMinBidSz();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("quotQual".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotQual();
		}
		else if("bidYld".equalsIgnoreCase(accessPath)){
			return this.bean.getBidYld();
		}
		else if("ofrSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrSpotRt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getExDestIDSrc();
		}
		else if("ofrFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrFwdPnts();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt2();
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			return this.bean.getExDest();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("bidFwdPnts2".equalsIgnoreCase(accessPath)){
			return this.bean.getBidFwdPnts2();
		}
		else if("bidSz".equalsIgnoreCase(accessPath)){
			return this.bean.getBidSz();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("midPx".equalsIgnoreCase(accessPath)){
			return this.bean.getMidPx();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRtCalc();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlCurrBidFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrBidFxRt((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("bidFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setBidFwdPnts((BigDecimal) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("minOfrSz".equalsIgnoreCase(accessPath)){
			 this.bean.setMinOfrSz((BigDecimal) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrPx((BigDecimal) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("bidSpotRt".equalsIgnoreCase(accessPath)){
			 this.bean.setBidSpotRt((BigDecimal) obj);
			return;
		}
		else if("settlCurrOfrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrOfrFxRt((BigDecimal) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("qtMsgID".equalsIgnoreCase(accessPath)){
			 this.bean.setQtMsgID((String) obj);
			return;
		}
		else if("midYld".equalsIgnoreCase(accessPath)){
			 this.bean.setMidYld((BigDecimal) obj);
			return;
		}
		else if("mktOfrPx".equalsIgnoreCase(accessPath)){
			 this.bean.setMktOfrPx((BigDecimal) obj);
			return;
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			 this.bean.setValidUntilTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			 this.bean.setQty2((BigDecimal) obj);
			return;
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			 this.bean.setQID((String) obj);
			return;
		}
		else if("commTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCommTyp((String) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			 this.bean.setMinQty((BigDecimal) obj);
			return;
		}
		else if("ofrFwdPnts2".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrFwdPnts2((BigDecimal) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("ofrYld".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrYld((BigDecimal) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("rspLvl".equalsIgnoreCase(accessPath)){
			 this.bean.setRspLvl((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("prvtQt".equalsIgnoreCase(accessPath)){
			 this.bean.setPrvtQt((String) obj);
			return;
		}
		else if("bidPx".equalsIgnoreCase(accessPath)){
			 this.bean.setBidPx((BigDecimal) obj);
			return;
		}
		else if("mktBidPx".equalsIgnoreCase(accessPath)){
			 this.bean.setMktBidPx((BigDecimal) obj);
			return;
		}
		else if("ofrSwapPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrSwapPnts((BigDecimal) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("bidSwapPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setBidSwapPnts((BigDecimal) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((BigInteger) obj);
			return;
		}
		else if("ofrSz".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrSz((BigDecimal) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("minBidSz".equalsIgnoreCase(accessPath)){
			 this.bean.setMinBidSz((BigDecimal) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("bidYld".equalsIgnoreCase(accessPath)){
			 this.bean.setBidYld((BigDecimal) obj);
			return;
		}
		else if("ofrSpotRt".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrSpotRt((BigDecimal) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			 this.bean.setRspID((String) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setExDestIDSrc(ExDestinationIDSourceEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ofrFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrFwdPnts((BigDecimal) obj);
			return;
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt2((XMLGregorianCalendar) obj);
			return;
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			 this.bean.setExDest((String) obj);
			return;
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((BigDecimal) obj);
			return;
		}
		else if("bidFwdPnts2".equalsIgnoreCase(accessPath)){
			 this.bean.setBidFwdPnts2((BigDecimal) obj);
			return;
		}
		else if("bidSz".equalsIgnoreCase(accessPath)){
			 this.bean.setBidSz((BigDecimal) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("midPx".equalsIgnoreCase(accessPath)){
			 this.bean.setMidPx((BigDecimal) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			 this.bean.setRstctions((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngTyp((BigInteger) obj);
			return;
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT.valueOf(obj.toString()));
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuoteMessageT obj) {
		this.bean = obj; 
	}

}
