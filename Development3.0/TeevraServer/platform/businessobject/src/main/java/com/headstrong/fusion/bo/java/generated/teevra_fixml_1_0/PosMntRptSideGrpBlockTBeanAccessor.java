package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PosMntRptSideGrpBlockT;
import com.headstrong.teevra_fixml_1_0.PositionEffectEnumT;
import com.headstrong.teevra_fixml_1_0.OddLotEnumT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.SettlCurrFxRateCalcEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.AggressorIndicatorEnumT;
import com.headstrong.teevra_fixml_1_0.SolicitedFlagEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class PosMntRptSideGrpBlockTBeanAccessor implements BeanAccessor<PosMntRptSideGrpBlockT> {
	
	private PosMntRptSideGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("fillStationCd".equalsIgnoreCase(accessPath)){
			return this.bean.getFillStationCd();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("trdStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdStat();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("agrsrInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAgrsrInd();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("sideExecID".equalsIgnoreCase(accessPath)){
			return this.bean.getSideExecID();
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			return this.bean.getClAcctRef();
		}
		else if("rsnCD".equalsIgnoreCase(accessPath)){
			return this.bean.getRsnCD();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSolFlag();
		}
		else if("rctfDt".equalsIgnoreCase(accessPath)){
			return this.bean.getRctfDt();
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getInptDev();
		}
		else if("opInd".equalsIgnoreCase(accessPath)){
			return this.bean.getOpInd();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("reqTm".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTm();
		}
		else if("clAcctRefTo".equalsIgnoreCase(accessPath)){
			return this.bean.getClAcctRefTo();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			return this.bean.getTmBkt();
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			return this.bean.getNumDaysInt();
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("trdActn".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdActn();
		}
		else if("subTrdRefNo".equalsIgnoreCase(accessPath)){
			return this.bean.getSubTrdRefNo();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("ordDelayUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdDelayUnit();
		}
		else if("lqdtyInd".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyInd();
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSeq();
		}
		else if("acctCodeTo".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctCodeTo();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			return this.bean.getConcession();
		}
		else if("acctCode".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctCode();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("abbrvPrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAbbrvPrc();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("ordCat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdCat();
		}
		else if("reqQty".equalsIgnoreCase(accessPath)){
			return this.bean.getReqQty();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("acctTypTo".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTypTo();
		}
		else if("exchRule".equalsIgnoreCase(accessPath)){
			return this.bean.getExchRule();
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntRt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("exDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExDt();
		}
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			return this.bean.getNetGrossInd();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("exerQty".equalsIgnoreCase(accessPath)){
			return this.bean.getExerQty();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getEndCsh();
		}
		else if("exchSpeclInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getExchSpeclInstr();
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPreallocMeth();
		}
		else if("legTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLegTyp();
		}
		else if("oddLot".equalsIgnoreCase(accessPath)){
			return this.bean.getOddLot();
		}
		else if("ordDelay".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdDelay();
		}
		else if("allocInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocInd();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("sideGrossTradeAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSideGrossTradeAmt();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("sideQty".equalsIgnoreCase(accessPath)){
			return this.bean.getSideQty();
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRtCalc();
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			return this.bean.getProcCode();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndAcrdIntAmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("fillStationCd".equalsIgnoreCase(accessPath)){
			 this.bean.setFillStationCd((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("trdStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdStat((String) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdSubTyp((BigInteger) obj);
			return;
		}
		else if("agrsrInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAgrsrInd(AggressorIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("sideExecID".equalsIgnoreCase(accessPath)){
			 this.bean.setSideExecID((String) obj);
			return;
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			 this.bean.setClAcctRef((String) obj);
			return;
		}
		else if("rsnCD".equalsIgnoreCase(accessPath)){
			 this.bean.setRsnCD((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			 this.bean.setIntAtMat((BigDecimal) obj);
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
		else if("rctfDt".equalsIgnoreCase(accessPath)){
			 this.bean.setRctfDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			 this.bean.setInptDev((String) obj);
			return;
		}
		else if("opInd".equalsIgnoreCase(accessPath)){
			 this.bean.setOpInd((String) obj);
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
			 this.bean.setSettlDt((String) obj);
			return;
		}
		else if("reqTm".equalsIgnoreCase(accessPath)){
			 this.bean.setReqTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("clAcctRefTo".equalsIgnoreCase(accessPath)){
			 this.bean.setClAcctRefTo((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMLegRptTyp((BigInteger) obj);
			return;
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			 this.bean.setTmBkt((String) obj);
			return;
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			 this.bean.setNumDaysInt((BigInteger) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			 this.bean.setComplianceID((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("trdActn".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdActn((String) obj);
			return;
		}
		else if("subTrdRefNo".equalsIgnoreCase(accessPath)){
			 this.bean.setSubTrdRefNo((String) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigInteger) obj);
			return;
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrFxRt((BigDecimal) obj);
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
		else if("ordDelayUnit".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdDelayUnit((String) obj);
			return;
		}
		else if("lqdtyInd".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyInd((BigInteger) obj);
			return;
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			 this.bean.setRptSeq((BigInteger) obj);
			return;
		}
		else if("acctCodeTo".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctCodeTo((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((BigInteger) obj);
			return;
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			 this.bean.setConcession((BigDecimal) obj);
			return;
		}
		else if("acctCode".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctCode((String) obj);
			return;
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setInptSrc((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("abbrvPrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAbbrvPrc((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("ordCat".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdCat((String) obj);
			return;
		}
		else if("reqQty".equalsIgnoreCase(accessPath)){
			 this.bean.setReqQty((BigInteger) obj);
			return;
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("acctTypTo".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTypTo((String) obj);
			return;
		}
		else if("exchRule".equalsIgnoreCase(accessPath)){
			 this.bean.setExchRule((String) obj);
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
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			 this.bean.setNetGrossInd((BigInteger) obj);
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
		else if("exerQty".equalsIgnoreCase(accessPath)){
			 this.bean.setExerQty((BigInteger) obj);
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
		else if("exchSpeclInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setExchSpeclInstr((String) obj);
			return;
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setPreallocMeth((String) obj);
			return;
		}
		else if("legTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLegTyp((String) obj);
			return;
		}
		else if("oddLot".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setOddLot(OddLotEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ordDelay".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdDelay((BigInteger) obj);
			return;
		}
		else if("allocInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocInd((BigInteger) obj);
			return;
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setStartCsh((BigDecimal) obj);
			return;
		}
		else if("sideGrossTradeAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setSideGrossTradeAmt((BigDecimal) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			 this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("sideQty".equalsIgnoreCase(accessPath)){
			 this.bean.setSideQty((BigInteger) obj);
			return;
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT.valueOf(obj.toString()));
			return;
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			 this.bean.setProcCode((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndAcrdIntAmt((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PosMntRptSideGrpBlockT obj) {
		this.bean = obj; 
	}

}
