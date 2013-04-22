package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.InstrumentLegBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.TimeUnitEnumT;
import org.fixprotocol.fixml_5_0_sp2.UnitOfMeasureEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.SymbolSfxEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class InstrumentLegBlockTBeanAccessor implements BeanAccessor<InstrumentLegBlockT> {
	
	private InstrumentLegBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("legOptionRatio".equalsIgnoreCase(accessPath)){
			return this.bean.getLegOptionRatio();
		}
		else if("redeem".equalsIgnoreCase(accessPath)){
			return this.bean.getRedeem();
		}
		else if("repoTrm".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoTrm();
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			return this.bean.getLcl();
		}
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnPmt();
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			return this.bean.getRgstry();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("strk".equalsIgnoreCase(accessPath)){
			return this.bean.getStrk();
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			return this.bean.getUOM();
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			return this.bean.getCtry();
		}
		else if("legAID".equalsIgnoreCase(accessPath)){
			return this.bean.getLegAID();
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getTmUnit();
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			return this.bean.getExerStyle();
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoCollSecTyp();
		}
		else if("stOrProvnc".equalsIgnoreCase(accessPath)){
			return this.bean.getStOrProvnc();
		}
		else if("issued".equalsIgnoreCase(accessPath)){
			return this.bean.getIssued();
		}
		else if("dated".equalsIgnoreCase(accessPath)){
			return this.bean.getDated();
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			return this.bean.getMMY();
		}
		else if("encLegSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncLegSecDesc();
		}
		else if("optA".equalsIgnoreCase(accessPath)){
			return this.bean.getOptA();
		}
		else if("ratioQty".equalsIgnoreCase(accessPath)){
			return this.bean.getRatioQty();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("encLegSecDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncLegSecDescLen();
		}
		else if("encLegIssr".equalsIgnoreCase(accessPath)){
			return this.bean.getEncLegIssr();
		}
		else if("repoRt".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoRt();
		}
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkCcy();
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			return this.bean.getDesc();
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecSubTyp();
		}
		else if("cpnRt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnRt();
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
		else if("cSetMo".equalsIgnoreCase(accessPath)){
			return this.bean.getCSetMo();
		}
		else if("pool".equalsIgnoreCase(accessPath)){
			return this.bean.getPool();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			return this.bean.getUOMQty();
		}
		else if("encLegIssrLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncLegIssrLen();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		else if("pxUOM".equalsIgnoreCase(accessPath)){
			return this.bean.getPxUOM();
		}
		else if("mat".equalsIgnoreCase(accessPath)){
			return this.bean.getMat();
		}
		else if("cmult".equalsIgnoreCase(accessPath)){
			return this.bean.getCmult();
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			return this.bean.getPutCall();
		}
		else if("fctr".equalsIgnoreCase(accessPath)){
			return this.bean.getFctr();
		}
		else if("intAcrl".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAcrl();
		}
		else if("multTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMultTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
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
		else if("legOptionRatio".equalsIgnoreCase(accessPath)){
			 this.bean.setLegOptionRatio((BigDecimal) obj);
			return;
		}
		else if("redeem".equalsIgnoreCase(accessPath)){
			 this.bean.setRedeem((XMLGregorianCalendar) obj);
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
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			 this.bean.setCpnPmt((XMLGregorianCalendar) obj);
			return;
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			 this.bean.setRgstry((String) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTyp((String) obj);
			return;
		}
		else if("strk".equalsIgnoreCase(accessPath)){
			 this.bean.setStrk((BigDecimal) obj);
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
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTmUnit(TimeUnitEnumT.valueOf(obj.toString()));
			return;
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			 this.bean.setExerStyle((BigInteger) obj);
			return;
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRepoCollSecTyp((BigInteger) obj);
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
		else if("dated".equalsIgnoreCase(accessPath)){
			 this.bean.setDated((XMLGregorianCalendar) obj);
			return;
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			 this.bean.setMMY((String) obj);
			return;
		}
		else if("encLegSecDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setEncLegSecDesc((String) obj);
			return;
		}
		else if("optA".equalsIgnoreCase(accessPath)){
			 this.bean.setOptA((String) obj);
			return;
		}
		else if("ratioQty".equalsIgnoreCase(accessPath)){
			 this.bean.setRatioQty((BigDecimal) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSfx(SymbolSfxEnumT.valueOf(obj.toString()));
			return;
		}
		else if("encLegSecDescLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncLegSecDescLen((BigInteger) obj);
			return;
		}
		else if("encLegIssr".equalsIgnoreCase(accessPath)){
			 this.bean.setEncLegIssr((String) obj);
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
		else if("desc".equalsIgnoreCase(accessPath)){
			 this.bean.setDesc((String) obj);
			return;
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecSubTyp((String) obj);
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
		else if("cSetMo".equalsIgnoreCase(accessPath)){
			 this.bean.setCSetMo((String) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("pool".equalsIgnoreCase(accessPath)){
			 this.bean.setPool((String) obj);
			return;
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			 this.bean.setUOMQty((BigDecimal) obj);
			return;
		}
		else if("encLegIssrLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncLegIssrLen((BigInteger) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
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
		else if("mat".equalsIgnoreCase(accessPath)){
			 this.bean.setMat((XMLGregorianCalendar) obj);
			return;
		}
		else if("cmult".equalsIgnoreCase(accessPath)){
			 this.bean.setCmult((BigDecimal) obj);
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
		else if("intAcrl".equalsIgnoreCase(accessPath)){
			 this.bean.setIntAcrl((XMLGregorianCalendar) obj);
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
	public void setTarget(InstrumentLegBlockT obj) {
		this.bean = obj; 
	}

}
