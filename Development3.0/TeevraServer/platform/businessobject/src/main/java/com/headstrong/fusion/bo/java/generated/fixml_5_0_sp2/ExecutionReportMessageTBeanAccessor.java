package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ExecutionReportMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import org.fixprotocol.fixml_5_0_sp2.TradedFlatSwitchEnumT;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;
import org.fixprotocol.fixml_5_0_sp2.DisplayInstructionBlockT;
import org.fixprotocol.fixml_5_0_sp2.ReportToExchEnumT;
import org.fixprotocol.fixml_5_0_sp2.LastRptRequestedEnumT;
import org.fixprotocol.fixml_5_0_sp2.CancellationRightsEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.OrderCapacityEnumT;
import org.fixprotocol.fixml_5_0_sp2.CustOrderHandlingInstEnumT;
import org.fixprotocol.fixml_5_0_sp2.ExecPriceTypeEnumT;
import org.fixprotocol.fixml_5_0_sp2.AggressorIndicatorEnumT;
import org.fixprotocol.fixml_5_0_sp2.DiscretionInstructionsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0_sp2.SolicitedFlagEnumT;
import org.fixprotocol.fixml_5_0_sp2.YieldDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.CommissionDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.OrderQtyDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.PegInstructionsBlockT;
import org.fixprotocol.fixml_5_0_sp2.SpreadOrBenchmarkCurveDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.PositionEffectEnumT;
import org.fixprotocol.fixml_5_0_sp2.SettlCurrFxRateCalcEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;
import org.fixprotocol.fixml_5_0_sp2.TriggeringInstructionBlockT;
import org.fixprotocol.fixml_5_0_sp2.WorkingIndicatorEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
public class ExecutionReportMessageTBeanAccessor implements BeanAccessor<ExecutionReportMessageT> {
	
	private ExecutionReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxShow();
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
		else if("workingInd".equalsIgnoreCase(accessPath)){
			return this.bean.getWorkingInd();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("agrsrInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAgrsrInd();
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLotTyp();
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			return this.bean.getDesignation();
		}
		else if("manOrdInd".equalsIgnoreCase(accessPath)){
			return this.bean.getManOrdInd();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("trddFlatSwitch".equalsIgnoreCase(accessPath)){
			return this.bean.getTrddFlatSwitch();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSolFlag();
		}
		else if("pxImprvmnt".equalsIgnoreCase(accessPath)){
			return this.bean.getPxImprvmnt();
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsn();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("dayOrdQty".equalsIgnoreCase(accessPath)){
			return this.bean.getDayOrdQty();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCumQty();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("dayAvgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getDayAvgPx();
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRstmtRsn();
		}
		else if("rptToExch".equalsIgnoreCase(accessPath)){
			return this.bean.getRptToExch();
		}
		else if("undLastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getUndLastQty();
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			return this.bean.getQty2();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
		}
		else if("rtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSrc();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
		}
		else if("totNoFills".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoFills();
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			return this.bean.getMinQty();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCopyMsgInd();
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxPrtScp();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("priInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPriInd();
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategyParameters();
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("preAll".equalsIgnoreCase(accessPath)){
			return this.bean.getPreAll();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignDt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("execPxAdjment".equalsIgnoreCase(accessPath)){
			return this.bean.getExecPxAdjment();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLeavesQty();
		}
		else if("massStatReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getMassStatReqID();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			return this.bean.getCxllationRights();
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			return this.bean.getConcession();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastMkt();
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDsplyInstr();
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExecTyp();
		}
		else if("ordCat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdCat();
		}
		else if("crssTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCrssTyp();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("dividendYield".equalsIgnoreCase(accessPath)){
			return this.bean.getDividendYield();
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntRt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("tmToExp".equalsIgnoreCase(accessPath)){
			return this.bean.getTmToExp();
		}
		else if("exDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExDt();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("origCrssID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigCrssID();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategy();
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			return this.bean.getPrTrdAnon();
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID2();
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			return this.bean.getParticipationRt();
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPreallocMeth();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("dsctnPx".equalsIgnoreCase(accessPath)){
			return this.bean.getDsctnPx();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCalcCcyLastQty();
		}
		else if("lastLqdtyInd".equalsIgnoreCase(accessPath)){
			return this.bean.getLastLqdtyInd();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastSwapPnts();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("contra".equalsIgnoreCase(accessPath)){
			return this.bean.getContra();
		}
		else if("fillsGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getFillsGrp();
		}
		else if("miscFees".equalsIgnoreCase(accessPath)){
			return this.bean.getMiscFees();
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			return this.bean.getCshMgn();
		}
		else if("strtPrmGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmGrp();
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngUnit();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			return this.bean.getID2();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDiscInstr();
		}
		else if("execRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRefID();
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			return this.bean.getRFR();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("execPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExecPxTyp();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("totNumRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumRpts();
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastParPx();
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrInstr();
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			return this.bean.getRegistID();
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchInc();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForce();
		}
		else if("pxDelta".equalsIgnoreCase(accessPath)){
			return this.bean.getPxDelta();
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getStatReqID();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDayBkngInst();
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			return this.bean.getTmBkt();
		}
		else if("peggedPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPeggedPx();
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			return this.bean.getNumDaysInt();
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigID();
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			return this.bean.getLastRptReqed();
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			return this.bean.getMxPxLvls();
		}
		else if("hstCxID".equalsIgnoreCase(accessPath)){
			return this.bean.getHstCxID();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("pggdRefPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPggdRefPx();
		}
		else if("tgtStrategyPerformance".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategyPerformance();
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStopPx();
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getGTBkngInst();
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTransBkdTm();
		}
		else if("execValuationPoint".equalsIgnoreCase(accessPath)){
			return this.bean.getExecValuationPoint();
		}
		else if("lnkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLnkID();
		}
		else if("basisFeaturePx".equalsIgnoreCase(accessPath)){
			return this.bean.getBasisFeaturePx();
		}
		else if("rcvdDptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRcvdDptID();
		}
		else if("exec".equalsIgnoreCase(accessPath)){
			return this.bean.getExec();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("contAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getContAmt();
		}
		else if("lastCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastCpcty();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("custDrctdOrd".equalsIgnoreCase(accessPath)){
			return this.bean.getCustDrctdOrd();
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMnyLaunderingStat();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			return this.bean.getVol();
		}
		else if("ordHndlInstSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdHndlInstSrc();
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			return this.bean.getListID();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("crssID".equalsIgnoreCase(accessPath)){
			return this.bean.getCrssID();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getEndCsh();
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt2();
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchID();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getHandlInst();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("undLastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getUndLastPx();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("basisFeatureDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBasisFeatureDt();
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getPegInstr();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("custOrdHdlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getCustOrdHdlInst();
		}
		else if("dayCumQty".equalsIgnoreCase(accessPath)){
			return this.bean.getDayCumQty();
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRtCalc();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("lastFwdPnts2".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFwdPnts2();
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndAcrdIntAmt();
		}
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFwdPnts();
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxFloor();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxShow((BigDecimal) obj);
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
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
			return;
		}
		else if("workingInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setWorkingInd(WorkingIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("agrsrInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAgrsrInd(AggressorIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLotTyp((String) obj);
			return;
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			 this.bean.setDesignation((String) obj);
			return;
		}
		else if("manOrdInd".equalsIgnoreCase(accessPath)){
			 this.bean.setManOrdInd((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("trddFlatSwitch".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTrddFlatSwitch(TradedFlatSwitchEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			 this.bean.setTotTakedown((BigDecimal) obj);
			return;
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSolFlag(SolicitedFlagEnumT.valueOf(obj.toString()));
			return;
		}
		else if("pxImprvmnt".equalsIgnoreCase(accessPath)){
			 this.bean.setPxImprvmnt((BigDecimal) obj);
			return;
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setRejRsn((String) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("dayOrdQty".equalsIgnoreCase(accessPath)){
			 this.bean.setDayOrdQty((BigDecimal) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCumQty((BigDecimal) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMLegRptTyp((String) obj);
			return;
		}
		else if("dayAvgPx".equalsIgnoreCase(accessPath)){
			 this.bean.setDayAvgPx((BigDecimal) obj);
			return;
		}
		else if("execRstmtRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setExecRstmtRsn((String) obj);
			return;
		}
		else if("rptToExch".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setRptToExch(ReportToExchEnumT.valueOf(obj.toString()));
			return;
		}
		else if("undLastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setUndLastQty((BigDecimal) obj);
			return;
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			 this.bean.setQty2((BigDecimal) obj);
			return;
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchTyp((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEfctvTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("totNoFills".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoFills((BigInteger) obj);
			return;
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			 this.bean.setMinQty((BigDecimal) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCopyMsgInd((String) obj);
			return;
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxPrtScp((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("priInd".equalsIgnoreCase(accessPath)){
			 this.bean.setPriInd((BigInteger) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategyParameters((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("execPxAdjment".equalsIgnoreCase(accessPath)){
			 this.bean.setExecPxAdjment((BigDecimal) obj);
			return;
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			 this.bean.setClrFeeInd((String) obj);
			return;
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLeavesQty((BigDecimal) obj);
			return;
		}
		else if("massStatReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setMassStatReqID((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCxllationRights(CancellationRightsEnumT.valueOf(obj.toString()));
			return;
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			 this.bean.setConcession((BigDecimal) obj);
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
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDsplyInstr((DisplayInstructionBlockT) obj);
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
		else if("crssTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCrssTyp((BigInteger) obj);
			return;
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocID((String) obj);
			return;
		}
		else if("dividendYield".equalsIgnoreCase(accessPath)){
			 this.bean.setDividendYield((BigDecimal) obj);
			return;
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntRt((BigDecimal) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("tmToExp".equalsIgnoreCase(accessPath)){
			 this.bean.setTmToExp((BigDecimal) obj);
			return;
		}
		else if("exDt".equalsIgnoreCase(accessPath)){
			 this.bean.setExDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("origCrssID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigCrssID((String) obj);
			return;
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategy((String) obj);
			return;
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			 this.bean.setPrTrdAnon((String) obj);
			return;
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID2((String) obj);
			return;
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setPreallocMeth((String) obj);
			return;
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			 this.bean.setParticipationRt((BigDecimal) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("dsctnPx".equalsIgnoreCase(accessPath)){
			 this.bean.setDsctnPx((BigDecimal) obj);
			return;
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((CommissionDataBlockT) obj);
			return;
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setStartCsh((BigDecimal) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			 this.bean.setRstctions((String) obj);
			return;
		}
		else if("calcCcyLastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCalcCcyLastQty((BigDecimal) obj);
			return;
		}
		else if("lastLqdtyInd".equalsIgnoreCase(accessPath)){
			 this.bean.setLastLqdtyInd((BigInteger) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			 this.bean.setStat((String) obj);
			return;
		}
		else if("lastSwapPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLastSwapPnts((BigDecimal) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngTyp((BigInteger) obj);
			return;
		}
		else if("cshMgn".equalsIgnoreCase(accessPath)){
			 this.bean.setCshMgn((String) obj);
			return;
		}
		else if("bkngUnit".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngUnit((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			 this.bean.setID2((String) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDiscInstr((DiscretionInstructionsBlockT) obj);
			return;
		}
		else if("execRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecRefID((String) obj);
			return;
		}
		else if("rFR".equalsIgnoreCase(accessPath)){
			 this.bean.setRFR((BigDecimal) obj);
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("execPxTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setExecPxTyp(ExecPriceTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			 this.bean.setIntAtMat((BigDecimal) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("totNumRpts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNumRpts((BigInteger) obj);
			return;
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastParPx((BigDecimal) obj);
			return;
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrInstr((TriggeringInstructionBlockT) obj);
			return;
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchInc((BigDecimal) obj);
			return;
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			 this.bean.setRegistID((String) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			 this.bean.setTmInForce((String) obj);
			return;
		}
		else if("pxDelta".equalsIgnoreCase(accessPath)){
			 this.bean.setPxDelta((BigDecimal) obj);
			return;
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setStatReqID((String) obj);
			return;
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setGrossTrdAmt((BigDecimal) obj);
			return;
		}
		else if("dayBkngInst".equalsIgnoreCase(accessPath)){
			 this.bean.setDayBkngInst((String) obj);
			return;
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			 this.bean.setTmBkt((String) obj);
			return;
		}
		else if("peggedPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPeggedPx((BigDecimal) obj);
			return;
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			 this.bean.setNumDaysInt((BigInteger) obj);
			return;
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigID((String) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			 this.bean.setComplianceID((String) obj);
			return;
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastRptReqed(LastRptRequestedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			 this.bean.setMxPxLvls((BigInteger) obj);
			return;
		}
		else if("hstCxID".equalsIgnoreCase(accessPath)){
			 this.bean.setHstCxID((String) obj);
			return;
		}
		else if("pggdRefPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPggdRefPx((BigDecimal) obj);
			return;
		}
		else if("tgtStrategyPerformance".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategyPerformance((BigDecimal) obj);
			return;
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrFxRt((BigDecimal) obj);
			return;
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStopPx((BigDecimal) obj);
			return;
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			 this.bean.setGTBkngInst((BigInteger) obj);
			return;
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTransBkdTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("execValuationPoint".equalsIgnoreCase(accessPath)){
			 this.bean.setExecValuationPoint((XMLGregorianCalendar) obj);
			return;
		}
		else if("lnkID".equalsIgnoreCase(accessPath)){
			 this.bean.setLnkID((String) obj);
			return;
		}
		else if("basisFeaturePx".equalsIgnoreCase(accessPath)){
			 this.bean.setBasisFeaturePx((BigDecimal) obj);
			return;
		}
		else if("rcvdDptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRcvdDptID((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((BigInteger) obj);
			return;
		}
		else if("lastCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastCpcty((String) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("custDrctdOrd".equalsIgnoreCase(accessPath)){
			 this.bean.setCustDrctdOrd((String) obj);
			return;
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMnyLaunderingStat((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			 this.bean.setVol((BigDecimal) obj);
			return;
		}
		else if("ordHndlInstSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdHndlInstSrc((BigInteger) obj);
			return;
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			 this.bean.setListID((String) obj);
			return;
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			 this.bean.setRspID((String) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("crssID".equalsIgnoreCase(accessPath)){
			 this.bean.setCrssID((String) obj);
			return;
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrAmt((BigDecimal) obj);
			return;
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setEndCsh((BigDecimal) obj);
			return;
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt2((XMLGregorianCalendar) obj);
			return;
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchID((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			 this.bean.setExecInst((String) obj);
			return;
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setHandlInst((String) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("undLastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setUndLastPx((BigDecimal) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("basisFeatureDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBasisFeatureDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setPegInstr((PegInstructionsBlockT) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			 this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("custOrdHdlInst".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCustOrdHdlInst(CustOrderHandlingInstEnumT.valueOf(obj.toString()));
			return;
		}
		else if("dayCumQty".equalsIgnoreCase(accessPath)){
			 this.bean.setDayCumQty((BigDecimal) obj);
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
		else if("lastFwdPnts2".equalsIgnoreCase(accessPath)){
			 this.bean.setLastFwdPnts2((BigDecimal) obj);
			return;
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("lastFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLastFwdPnts((BigDecimal) obj);
			return;
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxFloor((BigDecimal) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExecutionReportMessageT obj) {
		this.bean = obj; 
	}

}
