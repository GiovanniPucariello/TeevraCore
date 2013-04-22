package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.UnderlyingInstrumentBlockT;
import org.fixprotocol.fixml_5_0.SymbolSfxEnumT;
import org.fixprotocol.fixml_5_0.UnderlyingStipulationsBlockT;
import org.fixprotocol.fixml_5_0.UnderlyingCashTypeEnumT;
import org.fixprotocol.fixml_5_0.TimeUnitEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.UndlyInstrumentPartiesBlockT;
import org.fixprotocol.fixml_5_0.UnitofMeasureEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SecurityTypeEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.UndSecAltIDGrpBlockT;
import org.fixprotocol.fixml_5_0.UnderlyingFXRateCalcEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:42 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:42 IST 2010")
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
		else if("encUndSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndSecDesc();
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
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnPmt();
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			return this.bean.getRgstry();
		}
		else if("encUndIssrLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndIssrLen();
		}
		else if("capValu".equalsIgnoreCase(accessPath)){
			return this.bean.getCapValu();
		}
		else if("fXRate".equalsIgnoreCase(accessPath)){
			return this.bean.getFXRate();
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			return this.bean.getUOM();
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			return this.bean.getCtry();
		}
		else if("fXRateCalc".equalsIgnoreCase(accessPath)){
			return this.bean.getFXRateCalc();
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoCollSecTyp();
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getTmUnit();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("cPRegTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCPRegTyp();
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
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkCcy();
		}
		else if("curVal".equalsIgnoreCase(accessPath)){
			return this.bean.getCurVal();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
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
		else if("issr".equalsIgnoreCase(accessPath)){
			return this.bean.getIssr();
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			return this.bean.getSym();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("dirtPx".equalsIgnoreCase(accessPath)){
			return this.bean.getDirtPx();
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
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		else if("cashAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCashAmt();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubTyp();
		}
		else if("undAID".equalsIgnoreCase(accessPath)){
			return this.bean.getUndAID();
		}
		else if("mat".equalsIgnoreCase(accessPath)){
			return this.bean.getMat();
		}
		else if("encUndIssr".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndIssr();
		}
		else if("fctr".equalsIgnoreCase(accessPath)){
			return this.bean.getFctr();
		}
		else if("encUndSecDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncUndSecDescLen();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("crdRtg".equalsIgnoreCase(accessPath)){
			return this.bean.getCrdRtg();
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
		else if("encUndSecDesc".equalsIgnoreCase(accessPath)){
			this.bean.setEncUndSecDesc((String) obj);
			return;
		}
		else if("repoTrm".equalsIgnoreCase(accessPath)){
			this.bean.setRepoTrm((Integer) obj);
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
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			this.bean.setCpnPmt((XMLGregorianCalendar) obj);
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
		else if("capValu".equalsIgnoreCase(accessPath)){
			this.bean.setCapValu((BigDecimal) obj);
			return;
		}
		else if("fXRate".equalsIgnoreCase(accessPath)){
			this.bean.setFXRate((BigDecimal) obj);
			return;
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			this.bean.setUOM(UnitofMeasureEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			this.bean.setCtry((String) obj);
			return;
		}
		else if("fXRateCalc".equalsIgnoreCase(accessPath)){
			this.bean.setFXRateCalc(UnderlyingFXRateCalcEnumT.valueOf(obj.toString()));
			return;
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRepoCollSecTyp((Integer) obj);
			return;
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			this.bean.setTmUnit(TimeUnitEnumT.valueOf(obj.toString()));
			return;
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			this.bean.setPty((UndlyInstrumentPartiesBlockT) obj);
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
			this.bean.setSfx(SymbolSfxEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSettlTyp((Integer) obj);
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
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			this.bean.setStrkCcy((String) obj);
			return;
		}
		else if("curVal".equalsIgnoreCase(accessPath)){
			this.bean.setCurVal((BigDecimal) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp(SecurityTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("adjQty".equalsIgnoreCase(accessPath)){
			this.bean.setAdjQty((BigDecimal) obj);
			return;
		}
		else if("cashTyp".equalsIgnoreCase(accessPath)){
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
		else if("issr".equalsIgnoreCase(accessPath)){
			this.bean.setIssr((String) obj);
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
		else if("dirtPx".equalsIgnoreCase(accessPath)){
			this.bean.setDirtPx((BigDecimal) obj);
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
		else if("prod".equalsIgnoreCase(accessPath)){
			this.bean.setProd((Integer) obj);
			return;
		}
		else if("cashAmt".equalsIgnoreCase(accessPath)){
			this.bean.setCashAmt((BigDecimal) obj);
			return;
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSubTyp((String) obj);
			return;
		}
		else if("undAID".equalsIgnoreCase(accessPath)){
			this.bean.setUndAID((UndSecAltIDGrpBlockT) obj);
			return;
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			this.bean.setStip((UnderlyingStipulationsBlockT) obj);
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
		else if("fctr".equalsIgnoreCase(accessPath)){
			this.bean.setFctr((BigDecimal) obj);
			return;
		}
		else if("encUndSecDescLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncUndSecDescLen((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("crdRtg".equalsIgnoreCase(accessPath)){
			this.bean.setCrdRtg((String) obj);
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
