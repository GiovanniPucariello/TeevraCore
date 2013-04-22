package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TradingSessionStatusMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.UnsolicitedIndicatorEnumT;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TradingSessionStatusMessageTBeanAccessor implements BeanAccessor<TradingSessionStatusMessageT> {
	
	private TradingSessionStatusMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEndTm();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("openTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenTm();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
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
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getStatRejRsn();
		}
		else if("method".equalsIgnoreCase(accessPath)){
			return this.bean.getMethod();
		}
		else if("tradSesEvent".equalsIgnoreCase(accessPath)){
			return this.bean.getTradSesEvent();
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
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
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
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setStatRejRsn((String) obj);
			return;
		}
		else if("method".equalsIgnoreCase(accessPath)){
			 this.bean.setMethod((BigInteger) obj);
			return;
		}
		else if("tradSesEvent".equalsIgnoreCase(accessPath)){
			 this.bean.setTradSesEvent((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradingSessionStatusMessageT obj) {
		this.bean = obj; 
	}

}
