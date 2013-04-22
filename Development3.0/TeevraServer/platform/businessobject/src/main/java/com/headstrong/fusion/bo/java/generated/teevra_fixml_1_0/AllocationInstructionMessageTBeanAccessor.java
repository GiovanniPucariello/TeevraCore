package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AllocationInstructionMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import com.headstrong.teevra_fixml_1_0.PositionEffectEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.FinancingDetailsBlockT;
import com.headstrong.teevra_fixml_1_0.VenueTypeEnumT;
import com.headstrong.teevra_fixml_1_0.LegalConfirmEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.LastFragmentEnumT;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;
import com.headstrong.teevra_fixml_1_0.PreviouslyReportedEnumT;
import com.headstrong.teevra_fixml_1_0.InstrumentExtensionBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AllocationInstructionMessageTBeanAccessor implements BeanAccessor<AllocationInstructionMessageT> {
	
	private AllocationInstructionMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("avgPxPrcsn".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxPrcsn();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("allExc".equalsIgnoreCase(accessPath)){
			return this.bean.getAllExc();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("ordAlloc".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdAlloc();
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevlyRpted();
		}
		else if("totAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getTotAcrdIntAmt();
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
		else if("multiLegReportingType".equalsIgnoreCase(accessPath)){
			return this.bean.getMultiLegReportingType();
		}
		else if("orignTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignTrdID2();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
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
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("crossTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCrossTyp();
		}
		else if("tradingStrategyCode".equalsIgnoreCase(accessPath)){
			return this.bean.getTradingStrategyCode();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("noOrdsTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getNoOrdsTyp();
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
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkID();
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntRt();
		}
		else if("postingCode".equalsIgnoreCase(accessPath)){
			return this.bean.getPostingCode();
		}
		else if("linkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkTyp();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("totNoAllocs".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoAllocs();
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getImReqTyp();
		}
		else if("multiLegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMultiLegID();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("avgParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgParPx();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("abdnInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAbdnInd();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("rptSide".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSide();
		}
		else if("txtTo".equalsIgnoreCase(accessPath)){
			return this.bean.getTxtTo();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("autoAcceptInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAutoAcceptInd();
		}
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getVenuTyp();
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			return this.bean.getID2();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("carryInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCarryInd();
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplID();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			return this.bean.getNumDaysInt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("fourWay".equalsIgnoreCase(accessPath)){
			return this.bean.getFourWay();
		}
		else if("noOfSplits".equalsIgnoreCase(accessPath)){
			return this.bean.getNoOfSplits();
		}
		else if("alloc".equalsIgnoreCase(accessPath)){
			return this.bean.getAlloc();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxInd();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("cxlRplcRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getCxlRplcRsn();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			return this.bean.getLegalCnfm();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("histInd".equalsIgnoreCase(accessPath)){
			return this.bean.getHistInd();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			return this.bean.getVol();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("bkngRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngRefID();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getEndCsh();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("reversalInd".equalsIgnoreCase(accessPath)){
			return this.bean.getReversalInd();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("reference".equalsIgnoreCase(accessPath)){
			return this.bean.getReference();
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
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndAcrdIntAmt();
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
		else if("iD2".equalsIgnoreCase(accessPath)){
			 this.bean.setID2((String) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdSubTyp((String) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("avgPxPrcsn".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPxPrcsn((BigInteger) obj);
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
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
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			 this.bean.setTotTakedown((BigDecimal) obj);
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
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("carryInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCarryInd((String) obj);
			return;
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((String) obj);
			return;
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setGrossTrdAmt((BigDecimal) obj);
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
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			 this.bean.setNumDaysInt((BigInteger) obj);
			return;
		}
		else if("totAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setTotAcrdIntAmt((BigDecimal) obj);
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
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("multiLegReportingType".equalsIgnoreCase(accessPath)){
			 this.bean.setMultiLegReportingType((String) obj);
			return;
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
			return;
		}
		else if("orignTrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignTrdID2((String) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
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
		else if("orignDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignDt((XMLGregorianCalendar) obj);
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
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("fourWay".equalsIgnoreCase(accessPath)){
			 this.bean.setFourWay((String) obj);
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
		else if("tradingStrategyCode".equalsIgnoreCase(accessPath)){
			 this.bean.setTradingStrategyCode((String) obj);
			return;
		}
		else if("noOfSplits".equalsIgnoreCase(accessPath)){
			 this.bean.setNoOfSplits((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((BigInteger) obj);
			return;
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPxInd((BigInteger) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("noOrdsTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setNoOrdsTyp((BigInteger) obj);
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
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setInptSrc((String) obj);
			return;
		}
		else if("cxlRplcRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setCxlRplcRsn((String) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdTyp((String) obj);
			return;
		}
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLegalCnfm(LegalConfirmEnumT.valueOf(obj.toString()));
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
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
		else if("avgPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			 this.bean.setLinkID((String) obj);
			return;
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntRt((BigDecimal) obj);
			return;
		}
		else if("vol".equalsIgnoreCase(accessPath)){
			 this.bean.setVol((BigDecimal) obj);
			return;
		}
		else if("postingCode".equalsIgnoreCase(accessPath)){
			 this.bean.setPostingCode((String) obj);
			return;
		}
		else if("linkTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLinkTyp((BigInteger) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("totNoAllocs".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoAllocs((BigInteger) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("multiLegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMultiLegID((String) obj);
			return;
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setImReqTyp((BigInteger) obj);
			return;
		}
		else if("bkngRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngRefID((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setEndCsh((BigDecimal) obj);
			return;
		}
		else if("avgParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgParPx((BigDecimal) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("abdnInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAbdnInd((String) obj);
			return;
		}
		else if("reversalInd".equalsIgnoreCase(accessPath)){
			 this.bean.setReversalInd((String) obj);
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			 this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("txtTo".equalsIgnoreCase(accessPath)){
			 this.bean.setTxtTo((String) obj);
			return;
		}
		else if("trdEnv".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdEnv((String) obj);
			return;
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID((String) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngTyp((BigInteger) obj);
			return;
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdRptStat((String) obj);
			return;
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			 this.bean.setRndPx((BigDecimal) obj);
			return;
		}
		else if("autoAcceptInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAutoAcceptInd((String) obj);
			return;
		}
		else if("venuTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setVenuTyp(VenueTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AllocationInstructionMessageT obj) {
		this.bean = obj; 
	}

}
