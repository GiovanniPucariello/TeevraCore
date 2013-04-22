package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.AllocationReportMessageT;
import org.fixprotocol.fixml_5_0.PositionEffectEnumT;
import org.fixprotocol.fixml_5_0.InstrumentExtensionBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0.YieldDataBlockT;
import org.fixprotocol.fixml_5_0.PreviouslyReportedEnumT;
import org.fixprotocol.fixml_5_0.LastFragmentEnumT;
import org.fixprotocol.fixml_5_0.LegalConfirmEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.SpreadOrBenchmarkCurveDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class AllocationReportMessageTBeanAccessor implements BeanAccessor<AllocationReportMessageT> {
	
	private AllocationReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			return this.bean.getID2();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("avgPxPrcsn".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxPrcsn();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("allExc".equalsIgnoreCase(accessPath)){
			return this.bean.getAllExc();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getInptDev();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			return this.bean.getNumDaysInt();
		}
		else if("ordAlloc".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdAlloc();
		}
		else if("totAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getTotAcrdIntAmt();
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevlyRpted();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
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
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("alloc".equalsIgnoreCase(accessPath)){
			return this.bean.getAlloc();
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPxInd();
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			return this.bean.getConcession();
		}
		else if("noOrdsTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getNoOrdsTyp();
		}
		else if("lastMkt".equalsIgnoreCase(accessPath)){
			return this.bean.getLastMkt();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("cxlRplcRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getCxlRplcRsn();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			return this.bean.getLegalCnfm();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkID();
		}
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRptTyp();
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntRt();
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
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getImReqTyp();
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
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("avgParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgParPx();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("reversalInd".equalsIgnoreCase(accessPath)){
			return this.bean.getReversalInd();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("rejCode".equalsIgnoreCase(accessPath)){
			return this.bean.getRejCode();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("rndPx".equalsIgnoreCase(accessPath)){
			return this.bean.getRndPx();
		}
		else if("autoAcceptInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAutoAcceptInd();
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
			this.bean.setTrdSubTyp((Integer) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("avgPxPrcsn".equalsIgnoreCase(accessPath)){
			this.bean.setAvgPxPrcsn((Integer) obj);
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
		else if("inptDev".equalsIgnoreCase(accessPath)){
			this.bean.setInptDev((String) obj);
			return;
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			this.bean.setMsgEvtSrc((String) obj);
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
			this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
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
			this.bean.setNumDaysInt((Integer) obj);
			return;
		}
		else if("totAcrdIntAmt".equalsIgnoreCase(accessPath)){
			this.bean.setTotAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("prevlyRpted".equalsIgnoreCase(accessPath)){
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
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
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
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			this.bean.setRefID((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCustCpcty((Integer) obj);
			return;
		}
		else if("avgPxInd".equalsIgnoreCase(accessPath)){
			this.bean.setAvgPxInd((Integer) obj);
			return;
		}
		else if("noOrdsTyp".equalsIgnoreCase(accessPath)){
			this.bean.setNoOrdsTyp((Integer) obj);
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
			this.bean.setPxTyp((Integer) obj);
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
			this.bean.setTrdTyp((Integer) obj);
			return;
		}
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			this.bean.setLegalCnfm(LegalConfirmEnumT.valueOf(obj.toString()));
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
		else if("rptTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRptTyp((Integer) obj);
			return;
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			this.bean.setAcrdIntRt((BigDecimal) obj);
			return;
		}
		else if("linkTyp".equalsIgnoreCase(accessPath)){
			this.bean.setLinkTyp((Integer) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			this.bean.setSide((String) obj);
			return;
		}
		else if("totNoAllocs".equalsIgnoreCase(accessPath)){
			this.bean.setTotNoAllocs((Integer) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			this.bean.setQtyTyp((Integer) obj);
			return;
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setImReqTyp((Integer) obj);
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
		else if("reversalInd".equalsIgnoreCase(accessPath)){
			this.bean.setReversalInd((String) obj);
			return;
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			this.bean.setStartCsh((BigDecimal) obj);
			return;
		}
		else if("rejCode".equalsIgnoreCase(accessPath)){
			this.bean.setRejCode((Integer) obj);
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
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			this.bean.setRptRefID((String) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			this.bean.setStat((Integer) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			this.bean.setBkngTyp((Integer) obj);
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
	public void setTarget(AllocationReportMessageT obj) {
		this.bean = obj; 
	}

}
