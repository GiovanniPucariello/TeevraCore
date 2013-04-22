package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecurityStatusMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import org.fixprotocol.fixml_5_0_sp2.UnsolicitedIndicatorEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentExtensionBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import org.fixprotocol.fixml_5_0_sp2.DueToRelatedEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.CorporateActionEnumT;
import org.fixprotocol.fixml_5_0_sp2.InViewOfCommonEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class SecurityStatusMessageTBeanAccessor implements BeanAccessor<SecurityStatusMessageT> {
	
	private SecurityStatusMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("adjmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAdjmt();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDBkTyp();
		}
		else if("inViewOfCmn".equalsIgnoreCase(accessPath)){
			return this.bean.getInViewOfCmn();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("lowPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLowPx();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("buyVol".equalsIgnoreCase(accessPath)){
			return this.bean.getBuyVol();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getStatReqID();
		}
		else if("dueToReltd".equalsIgnoreCase(accessPath)){
			return this.bean.getDueToReltd();
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			return this.bean.getCorpActn();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("trdgStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgStat();
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
		else if("sellVol".equalsIgnoreCase(accessPath)){
			return this.bean.getSellVol();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("secTrdEvnt".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTrdEvnt();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			return this.bean.getUnsol();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("firstPx".equalsIgnoreCase(accessPath)){
			return this.bean.getFirstPx();
		}
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getMktDepth();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("highPx".equalsIgnoreCase(accessPath)){
			return this.bean.getHighPx();
		}
		else if("haltRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getHaltRsn();
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			return this.bean.getFinclStat();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("adjmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAdjmt((BigInteger) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDBkTyp((BigInteger) obj);
			return;
		}
		else if("inViewOfCmn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setInViewOfCmn(InViewOfCommonEnumT.valueOf(obj.toString()));
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("lowPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLowPx((BigDecimal) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("buyVol".equalsIgnoreCase(accessPath)){
			 this.bean.setBuyVol((BigDecimal) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setStatReqID((String) obj);
			return;
		}
		else if("dueToReltd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setDueToReltd(DueToRelatedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCorpActn(CorporateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("trdgStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdgStat((String) obj);
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
		else if("sellVol".equalsIgnoreCase(accessPath)){
			 this.bean.setSellVol((BigDecimal) obj);
			return;
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
			return;
		}
		else if("secTrdEvnt".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTrdEvnt((String) obj);
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
		else if("firstPx".equalsIgnoreCase(accessPath)){
			 this.bean.setFirstPx((BigDecimal) obj);
			return;
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUnsol(UnsolicitedIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			 this.bean.setMktDepth((BigInteger) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("highPx".equalsIgnoreCase(accessPath)){
			 this.bean.setHighPx((BigDecimal) obj);
			return;
		}
		else if("haltRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setHaltRsn((String) obj);
			return;
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			 this.bean.setFinclStat((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityStatusMessageT obj) {
		this.bean = obj; 
	}

}
