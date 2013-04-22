package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TrdCapRptSideGrpBlockT;
import org.fixprotocol.fixml_5_0.PositionEffectEnumT;
import org.fixprotocol.fixml_5_0.OddLotEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.OrderCapacityEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SolicitedFlagEnumT;
import org.fixprotocol.fixml_5_0.SettlCurrFxRateCalcEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.AggressorIndicatorEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class TrdCapRptSideGrpBlockTBeanAccessor implements BeanAccessor<TrdCapRptSideGrpBlockT> {
	
	private TrdCapRptSideGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("fillStationCd".equalsIgnoreCase(accessPath)){
			return this.bean.getFillStationCd();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("execRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecRefID();
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
		else if("rsnCD".equalsIgnoreCase(accessPath)){
			return this.bean.getRsnCD();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("solFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSolFlag();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getInptDev();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
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
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
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
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("ordInptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdInptDev();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTransBkdTm();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("ltTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLtTyp();
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSeq();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("alloc".equalsIgnoreCase(accessPath)){
			return this.bean.getAlloc();
		}
		else if("contAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getContAmt();
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			return this.bean.getConcession();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
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
		else if("listID".equalsIgnoreCase(accessPath)){
			return this.bean.getListID();
		}
		else if("exDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExDt();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getEndCsh();
		}
		else if("clrInst".equalsIgnoreCase(accessPath)){
			return this.bean.getClrInst();
		}
		else if("exchSpeclInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getExchSpeclInstr();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPreallocMeth();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("oddLot".equalsIgnoreCase(accessPath)){
			return this.bean.getOddLot();
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
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("sideQty".equalsIgnoreCase(accessPath)){
			return this.bean.getSideQty();
		}
		else if("miscFees".equalsIgnoreCase(accessPath)){
			return this.bean.getMiscFees();
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
		 if("fillStationCd".equalsIgnoreCase(accessPath)){
			this.bean.setFillStationCd((String) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			this.bean.setOrdID2((String) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("execRefID".equalsIgnoreCase(accessPath)){
			this.bean.setExecRefID((String) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTrdSubTyp((Integer) obj);
			return;
		}
		else if("agrsrInd".equalsIgnoreCase(accessPath)){
			this.bean.setAgrsrInd(AggressorIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			this.bean.setAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("rsnCD".equalsIgnoreCase(accessPath)){
			this.bean.setRsnCD((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
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
			this.bean.setSolFlag(SolicitedFlagEnumT.valueOf(obj.toString()));
			return;
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			this.bean.setInptDev((String) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMLegRptTyp((Integer) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((String) obj);
			return;
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			this.bean.setTmBkt((String) obj);
			return;
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			this.bean.setNumDaysInt((Integer) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			this.bean.setComplianceID((String) obj);
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
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			this.bean.setSettlCurrFxRt((BigDecimal) obj);
			return;
		}
		else if("ordInptDev".equalsIgnoreCase(accessPath)){
			this.bean.setOrdInptDev((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			this.bean.setTransBkdTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("ltTyp".equalsIgnoreCase(accessPath)){
			this.bean.setLtTyp((String) obj);
			return;
		}
		else if("rptSeq".equalsIgnoreCase(accessPath)){
			this.bean.setRptSeq((Integer) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCustCpcty((Integer) obj);
			return;
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			this.bean.setConcession((BigDecimal) obj);
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
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			this.bean.setSettlCcy((String) obj);
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
		else if("exDt".equalsIgnoreCase(accessPath)){
			this.bean.setExDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			this.bean.setListID((String) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			this.bean.setSide((String) obj);
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
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("preallocMeth".equalsIgnoreCase(accessPath)){
			this.bean.setPreallocMeth((String) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			this.bean.setOrdID((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			this.bean.setExecInst((String) obj);
			return;
		}
		else if("oddLot".equalsIgnoreCase(accessPath)){
			this.bean.setOddLot(OddLotEnumT.valueOf(obj.toString()));
			return;
		}
		else if("allocInd".equalsIgnoreCase(accessPath)){
			this.bean.setAllocInd((Integer) obj);
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
		else if("rstctions".equalsIgnoreCase(accessPath)){
			this.bean.setRstctions((String) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("sideQty".equalsIgnoreCase(accessPath)){
			this.bean.setSideQty((Integer) obj);
			return;
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
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
	public void setTarget(TrdCapRptSideGrpBlockT obj) {
		this.bean = obj; 
	}

}
