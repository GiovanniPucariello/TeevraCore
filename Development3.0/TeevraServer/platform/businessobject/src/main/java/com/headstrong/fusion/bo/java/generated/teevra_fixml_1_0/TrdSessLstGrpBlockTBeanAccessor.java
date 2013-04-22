package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TrdSessLstGrpBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.SecurityUpdateActionEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.UnsolicitedIndicatorEnumT;
import com.headstrong.teevra_fixml_1_0.TradingSessionRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TrdSessLstGrpBlockTBeanAccessor implements BeanAccessor<TrdSessLstGrpBlockT> {
	
	private TrdSessLstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEndTm();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("openTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenTm();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			return this.bean.getMode();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("totVolTrdd".equalsIgnoreCase(accessPath)){
			return this.bean.getTotVolTrdd();
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			return this.bean.getUnsol();
		}
		else if("tradSesUpdtActn".equalsIgnoreCase(accessPath)){
			return this.bean.getTradSesUpdtActn();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("preClsTm".equalsIgnoreCase(accessPath)){
			return this.bean.getPreClsTm();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			return this.bean.getStartTm();
		}
		else if("clsTm".equalsIgnoreCase(accessPath)){
			return this.bean.getClsTm();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getStatRejRsn();
		}
		else if("method".equalsIgnoreCase(accessPath)){
			return this.bean.getMethod();
		}
		else if("tradingSessionDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getTradingSessionDesc();
		}
		else if("trdgSesRules".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgSesRules();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEndTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("openTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOpenTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			 this.bean.setStat((String) obj);
			return;
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			 this.bean.setMode((BigInteger) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("totVolTrdd".equalsIgnoreCase(accessPath)){
			 this.bean.setTotVolTrdd((BigDecimal) obj);
			return;
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUnsol(UnsolicitedIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("tradSesUpdtActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTradSesUpdtActn(SecurityUpdateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("preClsTm".equalsIgnoreCase(accessPath)){
			 this.bean.setPreClsTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			 this.bean.setStartTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("clsTm".equalsIgnoreCase(accessPath)){
			 this.bean.setClsTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setStatRejRsn((String) obj);
			return;
		}
		else if("method".equalsIgnoreCase(accessPath)){
			 this.bean.setMethod((BigInteger) obj);
			return;
		}
		else if("tradingSessionDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setTradingSessionDesc((String) obj);
			return;
		}
		else if("trdgSesRules".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdgSesRules((TradingSessionRulesBlockT) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdSessLstGrpBlockT obj) {
		this.bean = obj; 
	}

}
