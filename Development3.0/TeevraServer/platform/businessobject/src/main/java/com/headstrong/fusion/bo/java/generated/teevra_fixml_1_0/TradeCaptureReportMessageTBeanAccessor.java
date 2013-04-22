package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TradeCaptureReportMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.UnsolicitedIndicatorEnumT;
import com.headstrong.teevra_fixml_1_0.FinancingDetailsBlockT;
import com.headstrong.teevra_fixml_1_0.VenueTypeEnumT;
import com.headstrong.teevra_fixml_1_0.PublishTrdIndicatorEnumT;
import com.headstrong.teevra_fixml_1_0.LastRptRequestedEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.SettlSessIDEnumT;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;
import com.headstrong.teevra_fixml_1_0.PreviouslyReportedEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TradeCaptureReportMessageTBeanAccessor implements BeanAccessor<TradeCaptureReportMessageT> {
	
	private TradeCaptureReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("shrtSaleRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getShrtSaleRsn();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("lastSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastSpotRt();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
		}
		else if("undSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSesID();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("noAsgnMsgs".equalsIgnoreCase(accessPath)){
			return this.bean.getNoAsgnMsgs();
		}
		else if("currencyRatio".equalsIgnoreCase(accessPath)){
			return this.bean.getCurrencyRatio();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRstmtRsn();
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevlyRpted();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			return this.bean.getExerStyle();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
		}
		else if("multiLegReportingType".equalsIgnoreCase(accessPath)){
			return this.bean.getMultiLegReportingType();
		}
		else if("origTxnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTxnTm();
		}
		else if("orignTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignTrdID2();
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCopyMsgInd();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			return this.bean.getUnsol();
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("crossTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCrossTyp();
		}
		else if("txtFrom".equalsIgnoreCase(accessPath)){
			return this.bean.getTxtFrom();
		}
		else if("tradingStrategyCode".equalsIgnoreCase(accessPath)){
			return this.bean.getTradingStrategyCode();
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("origTrdDtCET".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdDtCET();
		}
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumTrdRpts();
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastMkt();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("asOfInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAsOfInd();
		}
		else if("abbrvPrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAbbrvPrc();
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExecTyp();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("giveUpHistInd".equalsIgnoreCase(accessPath)){
			return this.bean.getGiveUpHistInd();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("tZTransactTime".equalsIgnoreCase(accessPath)){
			return this.bean.getTZTransactTime();
		}
		else if("dividendYield".equalsIgnoreCase(accessPath)){
			return this.bean.getDividendYield();
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
		else if("postingCode".equalsIgnoreCase(accessPath)){
			return this.bean.getPostingCode();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("multiLegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMultiLegID();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID2();
		}
		else if("reportedPxDiff".equalsIgnoreCase(accessPath)){
			return this.bean.getReportedPxDiff();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("abdnInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAbdnInd();
		}
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPubTrdInd();
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID2();
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCalcCcyLastQty();
		}
		else if("allocTrnStat".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocTrnStat();
		}
		else if("rptSide".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSide();
		}
		else if("asgnStat".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnStat();
		}
		else if("txtTo".equalsIgnoreCase(accessPath)){
			return this.bean.getTxtTo();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastSwapPnts();
		}
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getVenuTyp();
		}
		else if("origTrdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdDt();
		}
		else if("origTrdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdHandlInst();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			return this.bean.getRFR();
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID2();
		}
		else if("trdRepIndicatorsGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRepIndicatorsGrp();
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
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdHandlInst();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("carryInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCarryInd();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("trdLeg".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLeg();
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			return this.bean.getLastRptReqed();
		}
		else if("clsPx".equalsIgnoreCase(accessPath)){
			return this.bean.getClsPx();
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesSub();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdLegRefID();
		}
		else if("fourWay".equalsIgnoreCase(accessPath)){
			return this.bean.getFourWay();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("noOfSplits".equalsIgnoreCase(accessPath)){
			return this.bean.getNoOfSplits();
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
		else if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("origTxnTmCET".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTxnTmCET();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("histInd".equalsIgnoreCase(accessPath)){
			return this.bean.getHistInd();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("stlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getStlDt();
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			return this.bean.getVol();
		}
		else if("rejTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getRejTxt();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp2();
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchID();
		}
		else if("tierCD".equalsIgnoreCase(accessPath)){
			return this.bean.getTierCD();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("origTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("trdPubInd".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdPubInd();
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
		else if("reference".equalsIgnoreCase(accessPath)){
			return this.bean.getReference();
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID2();
		}
		else if("trdEnv".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdEnv();
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRptStat();
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			return this.bean.getRndPx();
		}
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFwdPnts();
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
		else if("shrtSaleRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setShrtSaleRsn((BigInteger) obj);
			return;
		}
		else if("lastSpotRt".equalsIgnoreCase(accessPath)){
			 this.bean.setLastSpotRt((BigDecimal) obj);
			return;
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
			return;
		}
		else if("undSesID".equalsIgnoreCase(accessPath)){
			 this.bean.setUndSesID((String) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("noAsgnMsgs".equalsIgnoreCase(accessPath)){
			 this.bean.setNoAsgnMsgs((BigInteger) obj);
			return;
		}
		else if("currencyRatio".equalsIgnoreCase(accessPath)){
			 this.bean.setCurrencyRatio((BigDecimal) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMLegRptTyp((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setExecRstmtRsn((String) obj);
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
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			 this.bean.setExerStyle((BigInteger) obj);
			return;
		}
		else if("multiLegReportingType".equalsIgnoreCase(accessPath)){
			 this.bean.setMultiLegReportingType((String) obj);
			return;
		}
		else if("origTxnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTxnTm((XMLGregorianCalendar) obj);
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
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUnsol(UnsolicitedIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID2((String) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("crossTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCrossTyp((String) obj);
			return;
		}
		else if("txtFrom".equalsIgnoreCase(accessPath)){
			 this.bean.setTxtFrom((String) obj);
			return;
		}
		else if("tradingStrategyCode".equalsIgnoreCase(accessPath)){
			 this.bean.setTradingStrategyCode((String) obj);
			return;
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("origTrdDtCET".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdDtCET((XMLGregorianCalendar) obj);
			return;
		}
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNumTrdRpts((BigInteger) obj);
			return;
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			 this.bean.setLastMkt((String) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("abbrvPrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAbbrvPrc((String) obj);
			return;
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setExecTyp((String) obj);
			return;
		}
		else if("asOfInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAsOfInd((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("giveUpHistInd".equalsIgnoreCase(accessPath)){
			 this.bean.setGiveUpHistInd((String) obj);
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
		else if("dividendYield".equalsIgnoreCase(accessPath)){
			 this.bean.setDividendYield((BigDecimal) obj);
			return;
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			 this.bean.setLinkID((String) obj);
			return;
		}
		else if("feeMult".equalsIgnoreCase(accessPath)){
			 this.bean.setFeeMult((BigDecimal) obj);
			return;
		}
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRptTyp((BigInteger) obj);
			return;
		}
		else if("postingCode".equalsIgnoreCase(accessPath)){
			 this.bean.setPostingCode((String) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("multiLegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMultiLegID((String) obj);
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
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("abdnInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAbdnInd((String) obj);
			return;
		}
		else if("pubTrdInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPubTrdInd(PublishTrdIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("rptRefID2".equalsIgnoreCase(accessPath)){
			 this.bean.setRptRefID2((String) obj);
			return;
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCalcCcyLastQty((BigDecimal) obj);
			return;
		}
		else if("allocTrnStat".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocTrnStat((String) obj);
			return;
		}
		else if("asgnStat".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnStat((BigInteger) obj);
			return;
		}
		else if("txtTo".equalsIgnoreCase(accessPath)){
			 this.bean.setTxtTo((String) obj);
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
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setVenuTyp(VenueTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("origTrdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("origTrdHandlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdHandlInst((String) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdSubTyp((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			 this.bean.setRFR((BigDecimal) obj);
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
		else if("carryInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCarryInd((String) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((BigInteger) obj);
			return;
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setGrossTrdAmt((BigDecimal) obj);
			return;
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastRptReqed(LastRptRequestedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("clsPx".equalsIgnoreCase(accessPath)){
			 this.bean.setClsPx((BigDecimal) obj);
			return;
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSetSesSub((String) obj);
			return;
		}
		else if("trdLegRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdLegRefID((String) obj);
			return;
		}
		else if("fourWay".equalsIgnoreCase(accessPath)){
			 this.bean.setFourWay((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("noOfSplits".equalsIgnoreCase(accessPath)){
			 this.bean.setNoOfSplits((String) obj);
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
		else if("firmTrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setFirmTrdID((String) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("origTxnTmCET".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTxnTmCET((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdTyp((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("histInd".equalsIgnoreCase(accessPath)){
			 this.bean.setHistInd((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("stlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setStlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			 this.bean.setVol((BigDecimal) obj);
			return;
		}
		else if("rejTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setRejTxt((String) obj);
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
		else if("mtchID".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchID((String) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("origTrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdID((String) obj);
			return;
		}
		else if("tierCD".equalsIgnoreCase(accessPath)){
			 this.bean.setTierCD((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("trdPubInd".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdPubInd((BigInteger) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchStat((String) obj);
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
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setFirmTrdID2((String) obj);
			return;
		}
		else if("trdEnv".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdEnv((String) obj);
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
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLastFwdPnts((BigDecimal) obj);
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
