package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AllocGrpBlockT;
import com.headstrong.teevra_fixml_1_0.PositionEffectEnumT;
import com.headstrong.teevra_fixml_1_0.CommissionDataBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.SettlCurrFxRateCalcEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.AllocPositionEffectEnumT;
import com.headstrong.teevra_fixml_1_0.NotifyBrokerOfCreditEnumT;
import com.headstrong.teevra_fixml_1_0.SettlInstructionsDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AllocGrpBlockTBeanAccessor implements BeanAccessor<AllocGrpBlockT> {
	
	private AllocGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordId".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdId();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			return this.bean.getClAcctRef();
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAtMat();
		}
		else if("setInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getSetInstr();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("reqTm".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTm();
		}
		else if("settlCcyAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcyAmt();
		}
		else if("brokFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getBrokFeeInd();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID2();
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("notifyBrkrOfCredit".equalsIgnoreCase(accessPath)){
			return this.bean.getNotifyBrkrOfCredit();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("allocPosEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocPosEfct();
		}
		else if("acctTypFrm".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTypFrm();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
		}
		else if("encAllocTextLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncAllocTextLen();
		}
		else if("meth".equalsIgnoreCase(accessPath)){
			return this.bean.getMeth();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("encAllocText".equalsIgnoreCase(accessPath)){
			return this.bean.getEncAllocText();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("histInd".equalsIgnoreCase(accessPath)){
			return this.bean.getHistInd();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("varMgnAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getVarMgnAmt();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
		}
		else if("clrInst".equalsIgnoreCase(accessPath)){
			return this.bean.getClrInst();
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getHandlInst();
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocSettlCcy();
		}
		else if("settlInstTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstTyp();
		}
		else if("prmAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getPrmAmt();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			return this.bean.getNetMny();
		}
		else if("reference".equalsIgnoreCase(accessPath)){
			return this.bean.getReference();
		}
		else if("feeDistribution".equalsIgnoreCase(accessPath)){
			return this.bean.getFeeDistribution();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
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
		else if("procCode".equalsIgnoreCase(accessPath)){
			return this.bean.getProcCode();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encAllocTextLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncAllocTextLen((BigInteger) obj);
			return;
		}
		else if("ordId".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdId((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("meth".equalsIgnoreCase(accessPath)){
			 this.bean.setMeth((BigInteger) obj);
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			 this.bean.setClAcctRef((String) obj);
			return;
		}
		else if("encAllocText".equalsIgnoreCase(accessPath)){
			 this.bean.setEncAllocText((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("intAtMat".equalsIgnoreCase(accessPath)){
			 this.bean.setIntAtMat((BigDecimal) obj);
			return;
		}
		else if("histInd".equalsIgnoreCase(accessPath)){
			 this.bean.setHistInd((String) obj);
			return;
		}
		else if("setInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setSetInstr((SettlInstructionsDataBlockT) obj);
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
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("reqTm".equalsIgnoreCase(accessPath)){
			 this.bean.setReqTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("settlCcyAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcyAmt((BigDecimal) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("varMgnAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setVarMgnAmt((BigDecimal) obj);
			return;
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrAmt((BigDecimal) obj);
			return;
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setHandlInst((BigInteger) obj);
			return;
		}
		else if("brokFeeInd".equalsIgnoreCase(accessPath)){
			 this.bean.setBrokFeeInd((BigInteger) obj);
			return;
		}
		else if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((CommissionDataBlockT) obj);
			return;
		}
		else if("settlInstTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstTyp((BigInteger) obj);
			return;
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocSettlCcy((String) obj);
			return;
		}
		else if("prmAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setPrmAmt((BigDecimal) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID2((String) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchStat((String) obj);
			return;
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrFxRt((BigDecimal) obj);
			return;
		}
		else if("netMny".equalsIgnoreCase(accessPath)){
			 this.bean.setNetMny((BigDecimal) obj);
			return;
		}
		else if("feeDistribution".equalsIgnoreCase(accessPath)){
			 this.bean.setFeeDistribution((BigInteger) obj);
			return;
		}
		else if("notifyBrkrOfCredit".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setNotifyBrkrOfCredit(NotifyBrokerOfCreditEnumT.valueOf(obj.toString()));
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			 this.bean.setClrFeeInd((String) obj);
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
		else if("procCode".equalsIgnoreCase(accessPath)){
			 this.bean.setProcCode((String) obj);
			return;
		}
		else if("acctTypFrm".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTypFrm((BigInteger) obj);
			return;
		}
		else if("allocPosEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setAllocPosEfct(AllocPositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setCustCpcty((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AllocGrpBlockT obj) {
		this.bean = obj; 
	}

}
