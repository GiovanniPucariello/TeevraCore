package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PositionMaintenanceRequestMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import com.headstrong.teevra_fixml_1_0.SettlSessIDEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class PositionMaintenanceRequestMessageTBeanAccessor implements BeanAccessor<PositionMaintenanceRequestMessageT> {
	
	private PositionMaintenanceRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("passwd".equalsIgnoreCase(accessPath)){
			return this.bean.getPasswd();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("adjTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAdjTyp();
		}
		else if("acctCode".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctCode();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("cntraryInstrctnInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCntraryInstrctnInd();
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			return this.bean.getClAcctRef();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("txnTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTyp();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplID();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("otmWrnInd".equalsIgnoreCase(accessPath)){
			return this.bean.getOtmWrnInd();
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesSub();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("priorSpreadInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPriorSpreadInd();
		}
		else if("thresholdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getThresholdAmt();
		}
		else if("reference".equalsIgnoreCase(accessPath)){
			return this.bean.getReference();
		}
		else if("rptSide".equalsIgnoreCase(accessPath)){
			return this.bean.getRptSide();
		}
		else if("origReqRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigReqRefID();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("actn".equalsIgnoreCase(accessPath)){
			return this.bean.getActn();
		}
		else if("exerTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExerTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("passwd".equalsIgnoreCase(accessPath)){
			 this.bean.setPasswd((String) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("adjTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAdjTyp((BigInteger) obj);
			return;
		}
		else if("acctCode".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctCode((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("cntraryInstrctnInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCntraryInstrctnInd((String) obj);
			return;
		}
		else if("clAcctRef".equalsIgnoreCase(accessPath)){
			 this.bean.setClAcctRef((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("txnTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTyp((BigInteger) obj);
			return;
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("otmWrnInd".equalsIgnoreCase(accessPath)){
			 this.bean.setOtmWrnInd((BigInteger) obj);
			return;
		}
		else if("setSesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSetSesSub((String) obj);
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptRefID((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("priorSpreadInd".equalsIgnoreCase(accessPath)){
			 this.bean.setPriorSpreadInd((String) obj);
			return;
		}
		else if("thresholdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setThresholdAmt((BigDecimal) obj);
			return;
		}
		else if("origReqRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigReqRefID((String) obj);
			return;
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID2((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("actn".equalsIgnoreCase(accessPath)){
			 this.bean.setActn((BigInteger) obj);
			return;
		}
		else if("exerTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setExerTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PositionMaintenanceRequestMessageT obj) {
		this.bean = obj; 
	}

}
