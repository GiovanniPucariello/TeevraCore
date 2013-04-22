package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingInstrumentBlockT;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingCashTypeEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.SeniorityEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.TimeUnitEnumT;
import org.fixprotocol.fixml_5_0_sp2.UnitOfMeasureEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.RestructuringTypeEnumT;
import org.fixprotocol.fixml_5_0_sp2.SymbolSfxEnumT;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingFXRateCalcEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class UnderlyingInstrumentBlockTBeanAccessor implements BeanAccessor<UnderlyingInstrumentBlockT> {
	
	private UnderlyingInstrumentBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("mult".equalsIgnoreCase(accessPath)){
			return this.bean.getMult();
		}
		else if("allocPct".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocPct();
		}
		else if("endVal".equalsIgnoreCase(accessPath)){
			return this.bean.getEndVal();
		}
		else if("redeem".equalsIgnoreCase(accessPath)){
			return this.bean.getRedeem();
		}
		else if("attchPnt".equalsIgnoreCase(accessPath)){
			return this.bean.getAttchPnt();
		}
		else if("encUndSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndSecDesc();
		}
		else if("notlPctOut".equalsIgnoreCase(accessPath)){
			return this.bean.getNotlPctOut();
		}
		else if("repoTrm".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoTrm();
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			return this.bean.getLcl();
		}
		else if("setMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getSetMeth();
		}
		else if("fxRate".equalsIgnoreCase(accessPath)){
			return this.bean.getFxRate();
		}
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnPmt();
		}
		else if("restrctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRestrctTyp();
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			return this.bean.getRgstry();
		}
		else if("encUndIssrLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndIssrLen();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("capValu".equalsIgnoreCase(accessPath)){
			return this.bean.getCapValu();
		}
		else if("origNotlPctOut".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigNotlPctOut();
		}
		else if("detchPnt".equalsIgnoreCase(accessPath)){
			return this.bean.getDetchPnt();
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			return this.bean.getUOM();
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			return this.bean.getCtry();
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			return this.bean.getExerStyle();
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getTmUnit();
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoCollSecTyp();
		}
		else if("cPRegTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCPRegTyp();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("stOrProvnc".equalsIgnoreCase(accessPath)){
			return this.bean.getStOrProvnc();
		}
		else if("issued".equalsIgnoreCase(accessPath)){
			return this.bean.getIssued();
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			return this.bean.getMMY();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("optA".equalsIgnoreCase(accessPath)){
			return this.bean.getOptA();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("strkPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkPx();
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("cPPgm".equalsIgnoreCase(accessPath)){
			return this.bean.getCPPgm();
		}
		else if("repoRt".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoRt();
		}
		else if("snrty".equalsIgnoreCase(accessPath)){
			return this.bean.getSnrty();
		}
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkCcy();
		}
		else if("curVal".equalsIgnoreCase(accessPath)){
			return this.bean.getCurVal();
		}
		else if("adjQty".equalsIgnoreCase(accessPath)){
			return this.bean.getAdjQty();
		}
		else if("cashTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCashTyp();
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			return this.bean.getDesc();
		}
		else if("cpnRt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnRt();
		}
		else if("pxInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPxInd();
		}
		else if("issr".equalsIgnoreCase(accessPath)){
			return this.bean.getIssr();
		}
		else if("flowSchedTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getFlowSchedTyp();
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			return this.bean.getSym();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("pxUOMQty".equalsIgnoreCase(accessPath)){
			return this.bean.getPxUOMQty();
		}
		else if("dirtPx".equalsIgnoreCase(accessPath)){
			return this.bean.getDirtPx();
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			return this.bean.getUOMQty();
		}
		else if("endPx".equalsIgnoreCase(accessPath)){
			return this.bean.getEndPx();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("startVal".equalsIgnoreCase(accessPath)){
			return this.bean.getStartVal();
		}
		else if("cashAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCashAmt();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		else if("undAID".equalsIgnoreCase(accessPath)){
			return this.bean.getUndAID();
		}
		else if("pxUOM".equalsIgnoreCase(accessPath)){
			return this.bean.getPxUOM();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubTyp();
		}
		else if("mat".equalsIgnoreCase(accessPath)){
			return this.bean.getMat();
		}
		else if("encUndIssr".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndIssr();
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			return this.bean.getPutCall();
		}
		else if("fctr".equalsIgnoreCase(accessPath)){
			return this.bean.getFctr();
		}
		else if("encUndSecDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndSecDescLen();
		}
		else if("multTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMultTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("fxRateCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getFxRateCalc();
		}
		else if("crdRtg".equalsIgnoreCase(accessPath)){
			return this.bean.getCrdRtg();
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			return this.bean.getMatTm();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("mult".equalsIgnoreCase(accessPath)){
			 this.bean.setMult((BigDecimal) obj);
			return;
		}
		else if("allocPct".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocPct((BigDecimal) obj);
			return;
		}
		else if("endVal".equalsIgnoreCase(accessPath)){
			 this.bean.setEndVal((BigDecimal) obj);
			return;
		}
		else if("redeem".equalsIgnoreCase(accessPath)){
			 this.bean.setRedeem((XMLGregorianCalendar) obj);
			return;
		}
		else if("attchPnt".equalsIgnoreCase(accessPath)){
			 this.bean.setAttchPnt((BigDecimal) obj);
			return;
		}
		else if("encUndSecDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setEncUndSecDesc((String) obj);
			return;
		}
		else if("notlPctOut".equalsIgnoreCase(accessPath)){
			 this.bean.setNotlPctOut((BigDecimal) obj);
			return;
		}
		else if("repoTrm".equalsIgnoreCase(accessPath)){
			 this.bean.setRepoTrm((BigInteger) obj);
			return;
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			 this.bean.setLcl((String) obj);
			return;
		}
		else if("setMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setSetMeth((String) obj);
			return;
		}
		else if("fxRate".equalsIgnoreCase(accessPath)){
			 this.bean.setFxRate((BigDecimal) obj);
			return;
		}
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			 this.bean.setCpnPmt((XMLGregorianCalendar) obj);
			return;
		}
		else if("restrctTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setRestrctTyp(RestructuringTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			 this.bean.setRgstry((String) obj);
			return;
		}
		else if("encUndIssrLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncUndIssrLen((BigInteger) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTyp((String) obj);
			return;
		}
		else if("capValu".equalsIgnoreCase(accessPath)){
			 this.bean.setCapValu((BigDecimal) obj);
			return;
		}
		else if("origNotlPctOut".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigNotlPctOut((BigDecimal) obj);
			return;
		}
		else if("detchPnt".equalsIgnoreCase(accessPath)){
			 this.bean.setDetchPnt((BigDecimal) obj);
			return;
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUOM(UnitOfMeasureEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			 this.bean.setCtry((String) obj);
			return;
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			 this.bean.setExerStyle((BigInteger) obj);
			return;
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTmUnit(TimeUnitEnumT.valueOf(obj.toString()));
			return;
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRepoCollSecTyp((BigInteger) obj);
			return;
		}
		else if("cPRegTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCPRegTyp((String) obj);
			return;
		}
		else if("stOrProvnc".equalsIgnoreCase(accessPath)){
			 this.bean.setStOrProvnc((String) obj);
			return;
		}
		else if("issued".equalsIgnoreCase(accessPath)){
			 this.bean.setIssued((XMLGregorianCalendar) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			 this.bean.setMMY((String) obj);
			return;
		}
		else if("optA".equalsIgnoreCase(accessPath)){
			 this.bean.setOptA((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("strkPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkPx((BigDecimal) obj);
			return;
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSfx(SymbolSfxEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((BigInteger) obj);
			return;
		}
		else if("cPPgm".equalsIgnoreCase(accessPath)){
			 this.bean.setCPPgm((String) obj);
			return;
		}
		else if("repoRt".equalsIgnoreCase(accessPath)){
			 this.bean.setRepoRt((BigDecimal) obj);
			return;
		}
		else if("snrty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSnrty(SeniorityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkCcy((String) obj);
			return;
		}
		else if("curVal".equalsIgnoreCase(accessPath)){
			 this.bean.setCurVal((BigDecimal) obj);
			return;
		}
		else if("adjQty".equalsIgnoreCase(accessPath)){
			 this.bean.setAdjQty((BigDecimal) obj);
			return;
		}
		else if("cashTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCashTyp(UnderlyingCashTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			 this.bean.setDesc((String) obj);
			return;
		}
		else if("cpnRt".equalsIgnoreCase(accessPath)){
			 this.bean.setCpnRt((BigDecimal) obj);
			return;
		}
		else if("pxInd".equalsIgnoreCase(accessPath)){
			 this.bean.setPxInd((BigInteger) obj);
			return;
		}
		else if("issr".equalsIgnoreCase(accessPath)){
			 this.bean.setIssr((String) obj);
			return;
		}
		else if("flowSchedTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setFlowSchedTyp((String) obj);
			return;
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			 this.bean.setSym((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("pxUOMQty".equalsIgnoreCase(accessPath)){
			 this.bean.setPxUOMQty((BigDecimal) obj);
			return;
		}
		else if("dirtPx".equalsIgnoreCase(accessPath)){
			 this.bean.setDirtPx((BigDecimal) obj);
			return;
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			 this.bean.setUOMQty((BigDecimal) obj);
			return;
		}
		else if("endPx".equalsIgnoreCase(accessPath)){
			 this.bean.setEndPx((BigDecimal) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
			return;
		}
		else if("startVal".equalsIgnoreCase(accessPath)){
			 this.bean.setStartVal((BigDecimal) obj);
			return;
		}
		else if("cashAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setCashAmt((BigDecimal) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			 this.bean.setProd((BigInteger) obj);
			return;
		}
		else if("pxUOM".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPxUOM(UnitOfMeasureEnumT.valueOf(obj.toString()));
			return;
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubTyp((String) obj);
			return;
		}
		else if("mat".equalsIgnoreCase(accessPath)){
			 this.bean.setMat((XMLGregorianCalendar) obj);
			return;
		}
		else if("encUndIssr".equalsIgnoreCase(accessPath)){
			 this.bean.setEncUndIssr((String) obj);
			return;
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			 this.bean.setPutCall((BigInteger) obj);
			return;
		}
		else if("fctr".equalsIgnoreCase(accessPath)){
			 this.bean.setFctr((BigDecimal) obj);
			return;
		}
		else if("encUndSecDescLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncUndSecDescLen((BigInteger) obj);
			return;
		}
		else if("multTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMultTyp((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("fxRateCalc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setFxRateCalc(UnderlyingFXRateCalcEnumT.valueOf(obj.toString()));
			return;
		}
		else if("crdRtg".equalsIgnoreCase(accessPath)){
			 this.bean.setCrdRtg((String) obj);
			return;
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			 this.bean.setMatTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UnderlyingInstrumentBlockT obj) {
		this.bean = obj; 
	}

}
