package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.DerivativeInstrumentBlockT;
import org.fixprotocol.fixml_5_0_sp2.PriceQuoteMethodEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.DerivativeSecurityXMLBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.ValuationMethodEnumT;
import org.fixprotocol.fixml_5_0_sp2.TimeUnitEnumT;
import org.fixprotocol.fixml_5_0_sp2.UnitOfMeasureEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.SymbolSfxEnumT;
import org.fixprotocol.fixml_5_0_sp2.SettlMethodEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class DerivativeInstrumentBlockTBeanAccessor implements BeanAccessor<DerivativeInstrumentBlockT> {
	
	private DerivativeInstrumentBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mult".equalsIgnoreCase(accessPath)){
			return this.bean.getMult();
		}
		else if("minPxIncr".equalsIgnoreCase(accessPath)){
			return this.bean.getMinPxIncr();
		}
		else if("matDt".equalsIgnoreCase(accessPath)){
			return this.bean.getMatDt();
		}
		else if("strkMult".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkMult();
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			return this.bean.getLcl();
		}
		else if("aID".equalsIgnoreCase(accessPath)){
			return this.bean.getAID();
		}
		else if("valMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getValMeth();
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			return this.bean.getRgstry();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("posLmt".equalsIgnoreCase(accessPath)){
			return this.bean.getPosLmt();
		}
		else if("optPayAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getOptPayAmt();
		}
		else if("prodCmplx".equalsIgnoreCase(accessPath)){
			return this.bean.getProdCmplx();
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			return this.bean.getUOM();
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			return this.bean.getCtry();
		}
		else if("settlMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlMeth();
		}
		else if("pxQteMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPxQteMeth();
		}
		else if("exerStyle".equalsIgnoreCase(accessPath)){
			return this.bean.getExerStyle();
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getTmUnit();
		}
		else if("evnt".equalsIgnoreCase(accessPath)){
			return this.bean.getEvnt();
		}
		else if("status".equalsIgnoreCase(accessPath)){
			return this.bean.getStatus();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			return this.bean.getMMY();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("strkPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkPx();
		}
		else if("encIssrLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncIssrLen();
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkCcy();
		}
		else if("minPxIncrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getMinPxIncrAmt();
		}
		else if("nTPosLmt".equalsIgnoreCase(accessPath)){
			return this.bean.getNTPosLmt();
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			return this.bean.getDesc();
		}
		else if("secGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecGrp();
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecSubTyp();
		}
		else if("issr".equalsIgnoreCase(accessPath)){
			return this.bean.getIssr();
		}
		else if("flrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getFlrPx();
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			return this.bean.getSym();
		}
		else if("flowSchedTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getFlowSchedTyp();
		}
		else if("strkValu".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkValu();
		}
		else if("stPrv".equalsIgnoreCase(accessPath)){
			return this.bean.getStPrv();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("issDt".equalsIgnoreCase(accessPath)){
			return this.bean.getIssDt();
		}
		else if("capPx".equalsIgnoreCase(accessPath)){
			return this.bean.getCapPx();
		}
		else if("pxUOMQty".equalsIgnoreCase(accessPath)){
			return this.bean.getPxUOMQty();
		}
		else if("cSetMo".equalsIgnoreCase(accessPath)){
			return this.bean.getCSetMo();
		}
		else if("secXML".equalsIgnoreCase(accessPath)){
			return this.bean.getSecXML();
		}
		else if("encSecDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSecDescLen();
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			return this.bean.getUOMQty();
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
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnMeth();
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			return this.bean.getPutCall();
		}
		else if("flexProdElig".equalsIgnoreCase(accessPath)){
			return this.bean.getFlexProdElig();
		}
		else if("encIssr".equalsIgnoreCase(accessPath)){
			return this.bean.getEncIssr();
		}
		else if("multTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMultTyp();
		}
		else if("listMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getListMeth();
		}
		else if("encSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSecDesc();
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			return this.bean.getMatTm();
		}
		else if("optAt".equalsIgnoreCase(accessPath)){
			return this.bean.getOptAt();
		}
		else if("openCloseSettlFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenCloseSettlFlag();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mult".equalsIgnoreCase(accessPath)){
			 this.bean.setMult((BigDecimal) obj);
			return;
		}
		else if("minPxIncr".equalsIgnoreCase(accessPath)){
			 this.bean.setMinPxIncr((BigDecimal) obj);
			return;
		}
		else if("strkMult".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkMult((BigDecimal) obj);
			return;
		}
		else if("matDt".equalsIgnoreCase(accessPath)){
			 this.bean.setMatDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			 this.bean.setLcl((String) obj);
			return;
		}
		else if("valMeth".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setValMeth(ValuationMethodEnumT.valueOf(obj.toString()));
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
		else if("optPayAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setOptPayAmt((BigDecimal) obj);
			return;
		}
		else if("prodCmplx".equalsIgnoreCase(accessPath)){
			 this.bean.setProdCmplx((String) obj);
			return;
		}
		else if("posLmt".equalsIgnoreCase(accessPath)){
			 this.bean.setPosLmt((BigInteger) obj);
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
		else if("settlMeth".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSettlMeth(SettlMethodEnumT.valueOf(obj.toString()));
			return;
		}
		else if("pxQteMeth".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPxQteMeth(PriceQuoteMethodEnumT.valueOf(obj.toString()));
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
		else if("status".equalsIgnoreCase(accessPath)){
			 this.bean.setStatus((String) obj);
			return;
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			 this.bean.setMMY((String) obj);
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
		else if("encIssrLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncIssrLen((BigInteger) obj);
			return;
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSfx(SymbolSfxEnumT.valueOf(obj.toString()));
			return;
		}
		else if("strkCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkCcy((String) obj);
			return;
		}
		else if("minPxIncrAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setMinPxIncrAmt((BigDecimal) obj);
			return;
		}
		else if("nTPosLmt".equalsIgnoreCase(accessPath)){
			 this.bean.setNTPosLmt((BigInteger) obj);
			return;
		}
		else if("desc".equalsIgnoreCase(accessPath)){
			 this.bean.setDesc((String) obj);
			return;
		}
		else if("secGrp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecGrp((String) obj);
			return;
		}
		else if("secSubTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecSubTyp((String) obj);
			return;
		}
		else if("issr".equalsIgnoreCase(accessPath)){
			 this.bean.setIssr((String) obj);
			return;
		}
		else if("flrPx".equalsIgnoreCase(accessPath)){
			 this.bean.setFlrPx((BigDecimal) obj);
			return;
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			 this.bean.setSym((String) obj);
			return;
		}
		else if("flowSchedTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setFlowSchedTyp((String) obj);
			return;
		}
		else if("strkValu".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkValu((BigDecimal) obj);
			return;
		}
		else if("stPrv".equalsIgnoreCase(accessPath)){
			 this.bean.setStPrv((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("issDt".equalsIgnoreCase(accessPath)){
			 this.bean.setIssDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("capPx".equalsIgnoreCase(accessPath)){
			 this.bean.setCapPx((BigDecimal) obj);
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
		else if("secXML".equalsIgnoreCase(accessPath)){
			 this.bean.setSecXML((DerivativeSecurityXMLBlockT) obj);
			return;
		}
		else if("encSecDescLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncSecDescLen((BigInteger) obj);
			return;
		}
		else if("uOMQty".equalsIgnoreCase(accessPath)){
			 this.bean.setUOMQty((BigDecimal) obj);
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
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnMeth((String) obj);
			return;
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			 this.bean.setPutCall((BigInteger) obj);
			return;
		}
		else if("flexProdElig".equalsIgnoreCase(accessPath)){
			 this.bean.setFlexProdElig((String) obj);
			return;
		}
		else if("encIssr".equalsIgnoreCase(accessPath)){
			 this.bean.setEncIssr((String) obj);
			return;
		}
		else if("multTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMultTyp((BigInteger) obj);
			return;
		}
		else if("listMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setListMeth((BigInteger) obj);
			return;
		}
		else if("encSecDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setEncSecDesc((String) obj);
			return;
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			 this.bean.setMatTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("optAt".equalsIgnoreCase(accessPath)){
			 this.bean.setOptAt((String) obj);
			return;
		}
		else if("openCloseSettlFlag".equalsIgnoreCase(accessPath)){
			 this.bean.setOpenCloseSettlFlag((String) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeInstrumentBlockT obj) {
		this.bean = obj; 
	}

}
