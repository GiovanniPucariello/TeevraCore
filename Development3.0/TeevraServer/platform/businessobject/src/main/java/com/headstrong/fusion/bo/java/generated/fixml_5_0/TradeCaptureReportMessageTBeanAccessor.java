package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TradeCaptureReportMessageT;
import org.fixprotocol.fixml_5_0.SettlSessIDEnumT;
import org.fixprotocol.fixml_5_0.OrderQtyDataBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.PublishTrdIndicatorEnumT;
import org.fixprotocol.fixml_5_0.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0.YieldDataBlockT;
import org.fixprotocol.fixml_5_0.PreviouslyReportedEnumT;
import org.fixprotocol.fixml_5_0.UnsolicitedIndicatorEnumT;
import org.fixprotocol.fixml_5_0.LastRptRequestedEnumT;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.SpreadOrBenchmarkCurveDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class TradeCaptureReportMessageTBeanAccessor implements BeanAccessor<TradeCaptureReportMessageT> {
	
	private TradeCaptureReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("origTrdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdHandlInst();
		}
		else if("shrtSaleRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getShrtSaleRsn();
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
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID2();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastParPx();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdHandlInst();
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
		else if("trdLeg".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLeg();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRstmtRsn();
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			return this.bean.getLastRptReqed();
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevlyRpted();
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdStat();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
		}
		else if("setSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSubID();
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
		else if("unsol".equalsIgnoreCase(accessPath)){
			return this.bean.getUnsol();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLegRefID();
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
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
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxInd();
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumTrdRpts();
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
		else if("ordCat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdCat();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("tZTransactTime".equalsIgnoreCase(accessPath)){
			return this.bean.getTZTransactTime();
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkID();
		}
		else if("stlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getStlDt();
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
		else if("execID2".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID2();
		}
		else if("reportedPxDiff".equalsIgnoreCase(accessPath)){
			return this.bean.getReportedPxDiff();
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchID();
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
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPubTrdInd();
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID2();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
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
		else if("rtPrtys".equalsIgnoreCase(accessPath)){
			return this.bean.getRtPrtys();
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
			this.bean.setShrtSaleRsn((Integer) obj);
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
			this.bean.setTrdSubTyp((Integer) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
			return;
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			this.bean.setRptID2((String) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
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
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			this.bean.setTrdHandlInst((String) obj);
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
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			this.bean.setGrossTrdAmt((BigDecimal) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTransTyp((Integer) obj);
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
		else if("ordQty".equalsIgnoreCase(accessPath)){
			this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			this.bean.setExecRstmtRsn((String) obj);
			return;
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			this.bean.setLastRptReqed(LastRptRequestedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			this.bean.setPrevlyRpted(PreviouslyReportedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			this.bean.setOrdStat((String) obj);
			return;
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMtchTyp((String) obj);
			return;
		}
		else if("setSubID".equalsIgnoreCase(accessPath)){
			this.bean.setSetSubID((String) obj);
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
		else if("unsol".equalsIgnoreCase(accessPath)){
			this.bean.setUnsol(UnsolicitedIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			this.bean.setTrdLegRefID((String) obj);
			return;
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			this.bean.setTrdID2((String) obj);
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
			this.bean.setAvgPxInd((Integer) obj);
			return;
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
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
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			this.bean.setTotNumTrdRpts((Integer) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setPxTyp((Integer) obj);
			return;
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			this.bean.setLastMkt((String) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTrdTyp((Integer) obj);
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
		else if("ordCat".equalsIgnoreCase(accessPath)){
			this.bean.setOrdCat((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			this.bean.setLastUpdateTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("tZTransactTime".equalsIgnoreCase(accessPath)){
			this.bean.setTZTransactTime((XMLGregorianCalendar) obj);
			return;
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			this.bean.setLinkID((String) obj);
			return;
		}
		else if("stlDt".equalsIgnoreCase(accessPath)){
			this.bean.setStlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRptTyp((Integer) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			this.bean.setExecID((String) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			this.bean.setQtyTyp((Integer) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			this.bean.setTrdTyp2((Integer) obj);
			return;
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			this.bean.setExecID2((String) obj);
			return;
		}
		else if("reportedPxDiff".equalsIgnoreCase(accessPath)){
			this.bean.setReportedPxDiff((String) obj);
			return;
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			this.bean.setMtchID((String) obj);
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
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			this.bean.setPubTrdInd(PublishTrdIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			this.bean.setRptRefID2((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			this.bean.setRptRefID((String) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			this.bean.setMtchStat((String) obj);
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
		else if("trdID".equalsIgnoreCase(accessPath)){
			this.bean.setTrdID((String) obj);
			return;
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			this.bean.setLastSwapPnts((BigDecimal) obj);
			return;
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			this.bean.setTrdRptStat((Integer) obj);
			return;
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			this.bean.setRndPx((BigDecimal) obj);
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
	public void setTarget(TradeCaptureReportMessageT obj) {
		this.bean = obj; 
	}

}
