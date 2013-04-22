package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradeCaptureReportAckMessageT;
import org.fixprotocol.fixml_5_0_sp2.VenueTypeEnumT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import org.fixprotocol.fixml_5_0_sp2.PreviouslyReportedEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.PublishTrdIndicatorEnumT;
import org.fixprotocol.fixml_5_0_sp2.SettlSessIDEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:45 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:45 IST 2011")
public class TradeCaptureReportAckMessageTBeanAccessor implements BeanAccessor<TradeCaptureReportAckMessageT> {
	
	private TradeCaptureReportAckMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("origTrdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdHandlInst();
		}
		else if("shrtSaleRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getShrtSaleRsn();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("lastSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastSpotRt();
		}
		else if("undSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSesID();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID2();
		}
		else if("trdRepIndicatorsGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRepIndicatorsGrp();
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastParPx();
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsn();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdHandlInst();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("trdLeg".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLeg();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRstmtRsn();
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			return this.bean.getRspDest();
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevlyRpted();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesSub();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("orignTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignTrdID2();
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCopyMsgInd();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLegRefID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("trnsfrRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getTrnsfrRsn();
		}
		else if("undSesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSesSub();
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxInd();
		}
		else if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastMkt();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("asOfInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAsOfInd();
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExecTyp();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("feeMult".equalsIgnoreCase(accessPath)){
			return this.bean.getFeeMult();
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkID();
		}
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRptTyp();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp2();
		}
		else if("rptSys".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSys();
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID2();
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchID();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("tierCD".equalsIgnoreCase(accessPath)){
			return this.bean.getTierCD();
		}
		else if("origTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspTransportTyp();
		}
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPubTrdInd();
		}
		else if("trdPubInd".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdPubInd();
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID2();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCalcCcyLastQty();
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID2();
		}
		else if("rptSide".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSide();
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastSwapPnts();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRptStat();
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			return this.bean.getRndPx();
		}
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getVenuTyp();
		}
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFwdPnts();
		}
		else if("origTrdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdDt();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("origTrdHandlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdHandlInst((String) obj);
			return;
		}
		else if("shrtSaleRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setShrtSaleRsn((BigInteger) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("lastSpotRt".equalsIgnoreCase(accessPath)){
			 this.bean.setLastSpotRt((BigDecimal) obj);
			return;
		}
		else if("undSesID".equalsIgnoreCase(accessPath)){
			 this.bean.setUndSesID((String) obj);
			return;
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdSubTyp((String) obj);
			return;
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID2((String) obj);
			return;
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setRejRsn((String) obj);
			return;
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastParPx((BigDecimal) obj);
			return;
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setMsgEvtSrc((String) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdHandlInst((String) obj);
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
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setGrossTrdAmt((BigDecimal) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((BigInteger) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMLegRptTyp((String) obj);
			return;
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setExecRstmtRsn((String) obj);
			return;
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			 this.bean.setRspDest((String) obj);
			return;
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPrevlyRpted(PreviouslyReportedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchTyp((String) obj);
			return;
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSetSesSub((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("orignTrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignTrdID2((String) obj);
			return;
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCopyMsgInd((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdLegRefID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID2((String) obj);
			return;
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			 this.bean.setClrFeeInd((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("trnsfrRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setTrnsfrRsn((String) obj);
			return;
		}
		else if("undSesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setUndSesSub((String) obj);
			return;
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPxInd((BigInteger) obj);
			return;
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("firmTrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setFirmTrdID((String) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			 this.bean.setLastMkt((String) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdTyp((String) obj);
			return;
		}
		else if("asOfInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAsOfInd((String) obj);
			return;
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setExecTyp((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("feeMult".equalsIgnoreCase(accessPath)){
			 this.bean.setFeeMult((BigDecimal) obj);
			return;
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			 this.bean.setLinkID((String) obj);
			return;
		}
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRptTyp((BigInteger) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdTyp2((BigInteger) obj);
			return;
		}
		else if("rptSys".equalsIgnoreCase(accessPath)){
			 this.bean.setRptSys((String) obj);
			return;
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID2((String) obj);
			return;
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchID((String) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("tierCD".equalsIgnoreCase(accessPath)){
			 this.bean.setTierCD((String) obj);
			return;
		}
		else if("origTrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRspTransportTyp((BigInteger) obj);
			return;
		}
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPubTrdInd(PublishTrdIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trdPubInd".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdPubInd((BigInteger) obj);
			return;
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			 this.bean.setRptRefID2((String) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchStat((String) obj);
			return;
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptRefID((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCalcCcyLastQty((BigDecimal) obj);
			return;
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setFirmTrdID2((String) obj);
			return;
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLastSwapPnts((BigDecimal) obj);
			return;
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID((String) obj);
			return;
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdRptStat((BigInteger) obj);
			return;
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			 this.bean.setRndPx((BigDecimal) obj);
			return;
		}
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setVenuTyp(VenueTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLastFwdPnts((BigDecimal) obj);
			return;
		}
		else if("origTrdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradeCaptureReportAckMessageT obj) {
		this.bean = obj; 
	}

}
