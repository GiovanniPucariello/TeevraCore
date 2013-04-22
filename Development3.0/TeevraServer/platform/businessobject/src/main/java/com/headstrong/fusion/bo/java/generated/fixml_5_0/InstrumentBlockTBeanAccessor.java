package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.InstrumentPartiesBlockT;
import org.fixprotocol.fixml_5_0.SymbolSfxEnumT;
import org.fixprotocol.fixml_5_0.TimeUnitEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.EvntGrpBlockT;
import org.fixprotocol.fixml_5_0.UnitofMeasureEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SecurityTypeEnumT;
import org.fixprotocol.fixml_5_0.SecAltIDGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class InstrumentBlockTBeanAccessor implements BeanAccessor<InstrumentBlockT> {
	
	private InstrumentBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mult".equalsIgnoreCase(accessPath)){
			return this.bean.getMult();
		}
		else if("redeem".equalsIgnoreCase(accessPath)){
			return this.bean.getRedeem();
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
		else if("repoTrm".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoTrm();
		}
		else if("lcl".equalsIgnoreCase(accessPath)){
			return this.bean.getLcl();
		}
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCpnPmt();
		}
		else if("aID".equalsIgnoreCase(accessPath)){
			return this.bean.getAID();
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
		else if("uOM".equalsIgnoreCase(accessPath)){
			return this.bean.getUOM();
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			return this.bean.getTmUnit();
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRepoCollSecTyp();
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
		else if("issued".equalsIgnoreCase(accessPath)){
			return this.bean.getIssued();
		}
		else if("dated".equalsIgnoreCase(accessPath)){
			return this.bean.getDated();
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
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("encIssrLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncIssrLen();
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
		else if("settlOnOpenFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlOnOpenFlag();
		}
		else if("nTPosLmt".equalsIgnoreCase(accessPath)){
			return this.bean.getNTPosLmt();
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
		else if("strkValu".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkValu();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("stPrv".equalsIgnoreCase(accessPath)){
			return this.bean.getStPrv();
		}
		else if("cSetMo".equalsIgnoreCase(accessPath)){
			return this.bean.getCSetMo();
		}
		else if("cPRegT".equalsIgnoreCase(accessPath)){
			return this.bean.getCPRegT();
		}
		else if("pool".equalsIgnoreCase(accessPath)){
			return this.bean.getPool();
		}
		else if("encSecDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSecDescLen();
		}
		else if("issuCtry".equalsIgnoreCase(accessPath)){
			return this.bean.getIssuCtry();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubTyp();
		}
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnMeth();
		}
		else if("fctr".equalsIgnoreCase(accessPath)){
			return this.bean.getFctr();
		}
		else if("intAcrl".equalsIgnoreCase(accessPath)){
			return this.bean.getIntAcrl();
		}
		else if("encIssr".equalsIgnoreCase(accessPath)){
			return this.bean.getEncIssr();
		}
		else if("encSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSecDesc();
		}
		else if("crdRtg".equalsIgnoreCase(accessPath)){
			return this.bean.getCrdRtg();
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			return this.bean.getMatTm();
		}
		else if("optAt".equalsIgnoreCase(accessPath)){
			return this.bean.getOptAt();
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
		else if("redeem".equalsIgnoreCase(accessPath)){
			this.bean.setRedeem((XMLGregorianCalendar) obj);
			return;
		}
		else if("minPxIncr".equalsIgnoreCase(accessPath)){
			this.bean.setMinPxIncr((BigDecimal) obj);
			return;
		}
		else if("matDt".equalsIgnoreCase(accessPath)){
			this.bean.setMatDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("strkMult".equalsIgnoreCase(accessPath)){
			this.bean.setStrkMult((BigDecimal) obj);
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
		else if("cpnPmt".equalsIgnoreCase(accessPath)){
			this.bean.setCpnPmt((XMLGregorianCalendar) obj);
			return;
		}
		else if("aID".equalsIgnoreCase(accessPath)){
			this.bean.setAID((SecAltIDGrpBlockT) obj);
			return;
		}
		else if("rgstry".equalsIgnoreCase(accessPath)){
			this.bean.setRgstry((String) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSecTyp(SecurityTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("posLmt".equalsIgnoreCase(accessPath)){
			this.bean.setPosLmt((Integer) obj);
			return;
		}
		else if("uOM".equalsIgnoreCase(accessPath)){
			this.bean.setUOM(UnitofMeasureEnumT.valueOf(obj.toString()));
			return;
		}
		else if("tmUnit".equalsIgnoreCase(accessPath)){
			this.bean.setTmUnit(TimeUnitEnumT.valueOf(obj.toString()));
			return;
		}
		else if("repoCollSecTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRepoCollSecTyp((Integer) obj);
			return;
		}
		else if("evnt".equalsIgnoreCase(accessPath)){
			this.bean.setEvnt((EvntGrpBlockT) obj);
			return;
		}
		else if("status".equalsIgnoreCase(accessPath)){
			this.bean.setStatus((String) obj);
			return;
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			this.bean.setPty((InstrumentPartiesBlockT) obj);
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
		else if("encIssrLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncIssrLen((BigInteger) obj);
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
		else if("settlOnOpenFlag".equalsIgnoreCase(accessPath)){
			this.bean.setSettlOnOpenFlag((String) obj);
			return;
		}
		else if("nTPosLmt".equalsIgnoreCase(accessPath)){
			this.bean.setNTPosLmt((Integer) obj);
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
		else if("strkValu".equalsIgnoreCase(accessPath)){
			this.bean.setStrkValu((BigDecimal) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			this.bean.setCFI((String) obj);
			return;
		}
		else if("stPrv".equalsIgnoreCase(accessPath)){
			this.bean.setStPrv((String) obj);
			return;
		}
		else if("cSetMo".equalsIgnoreCase(accessPath)){
			this.bean.setCSetMo((String) obj);
			return;
		}
		else if("cPRegT".equalsIgnoreCase(accessPath)){
			this.bean.setCPRegT((String) obj);
			return;
		}
		else if("pool".equalsIgnoreCase(accessPath)){
			this.bean.setPool((String) obj);
			return;
		}
		else if("encSecDescLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncSecDescLen((BigInteger) obj);
			return;
		}
		else if("issuCtry".equalsIgnoreCase(accessPath)){
			this.bean.setIssuCtry((String) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			this.bean.setSrc((String) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			this.bean.setProd((Integer) obj);
			return;
		}
		else if("subTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSubTyp((String) obj);
			return;
		}
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			this.bean.setAsgnMeth((String) obj);
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
		else if("encIssr".equalsIgnoreCase(accessPath)){
			this.bean.setEncIssr((String) obj);
			return;
		}
		else if("encSecDesc".equalsIgnoreCase(accessPath)){
			this.bean.setEncSecDesc((String) obj);
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
		else if("optAt".equalsIgnoreCase(accessPath)){
			this.bean.setOptAt((String) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrumentBlockT obj) {
		this.bean = obj; 
	}

}
