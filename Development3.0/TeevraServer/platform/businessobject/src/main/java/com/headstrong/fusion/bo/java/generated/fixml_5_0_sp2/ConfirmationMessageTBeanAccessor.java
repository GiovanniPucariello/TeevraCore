package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ConfirmationMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0_sp2.SettlInstructionsDataBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.InstrumentExtensionBlockT;
import org.fixprotocol.fixml_5_0_sp2.YieldDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.CommissionDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.SpreadOrBenchmarkCurveDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.LegalConfirmEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;
import org.fixprotocol.fixml_5_0_sp2.SettlCurrFxRateCalcEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class ConfirmationMessageTBeanAccessor implements BeanAccessor<ConfirmationMessageT> {
	
	private ConfirmationMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("cnfmRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmRefID();
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
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			return this.bean.getTotTakedown();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("setInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getSetInstr();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("cnfmTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmTyp();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("matNetMny".equalsIgnoreCase(accessPath)){
			return this.bean.getMatNetMny();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("grossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getGrossTrdAmt();
		}
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			return this.bean.getNumDaysInt();
		}
		else if("ordAlloc".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdAlloc();
		}
		else if("cnfmReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmReqID();
		}
		else if("cnfmID".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmID();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
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
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCopyMsgInd();
		}
		else if("allocID2".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID2();
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
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
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			return this.bean.getLegalCnfm();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("rptedPx".equalsIgnoreCase(accessPath)){
			return this.bean.getRptedPx();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("cnfmTransTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmTransTyp();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntRt();
		}
		else if("exDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExDt();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
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
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("miscFees".equalsIgnoreCase(accessPath)){
			return this.bean.getMiscFees();
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRtCalc();
		}
		else if("sharedComm".equalsIgnoreCase(accessPath)){
			return this.bean.getSharedComm();
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			return this.bean.getProcCode();
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndAcrdIntAmt();
		}
		else if("cnfmStat".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmStat();
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
		else if("avgPxPrcsn".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPxPrcsn((BigInteger) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("cnfmRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmRefID((String) obj);
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
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
		else if("totTakedown".equalsIgnoreCase(accessPath)){
			 this.bean.setTotTakedown((BigDecimal) obj);
			return;
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			 this.bean.setIntAtMat((BigDecimal) obj);
			return;
		}
		else if("setInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setSetInstr((SettlInstructionsDataBlockT) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			 this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("cnfmTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmTyp((BigInteger) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("matNetMny".equalsIgnoreCase(accessPath)){
			 this.bean.setMatNetMny((BigDecimal) obj);
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
		else if("numDaysInt".equalsIgnoreCase(accessPath)){
			 this.bean.setNumDaysInt((BigInteger) obj);
			return;
		}
		else if("cnfmReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmReqID((String) obj);
			return;
		}
		else if("cnfmID".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmID((String) obj);
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
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("copyMsgInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCopyMsgInd((String) obj);
			return;
		}
		else if("allocID2".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocID2((String) obj);
			return;
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrFxRt((BigDecimal) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("concession".equalsIgnoreCase(accessPath)){
			 this.bean.setConcession((BigDecimal) obj);
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
		else if("legalCnfm".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLegalCnfm(LegalConfirmEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("rptedPx".equalsIgnoreCase(accessPath)){
			 this.bean.setRptedPx((BigDecimal) obj);
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
		else if("allocID".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocID((String) obj);
			return;
		}
		else if("cnfmTransTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmTransTyp((BigInteger) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("acrdIntRt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntRt((BigDecimal) obj);
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
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
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
		else if("avgParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgParPx((BigDecimal) obj);
			return;
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((CommissionDataBlockT) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setStartCsh((BigDecimal) obj);
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
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setActIDSrc((BigInteger) obj);
			return;
		}
		else if("settlCurrFxRtCalc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSettlCurrFxRtCalc(SettlCurrFxRateCalcEnumT.valueOf(obj.toString()));
			return;
		}
		else if("sharedComm".equalsIgnoreCase(accessPath)){
			 this.bean.setSharedComm((BigDecimal) obj);
			return;
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			 this.bean.setProcCode((String) obj);
			return;
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("cnfmStat".equalsIgnoreCase(accessPath)){
			 this.bean.setCnfmStat((BigInteger) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ConfirmationMessageT obj) {
		this.bean = obj; 
	}

}
