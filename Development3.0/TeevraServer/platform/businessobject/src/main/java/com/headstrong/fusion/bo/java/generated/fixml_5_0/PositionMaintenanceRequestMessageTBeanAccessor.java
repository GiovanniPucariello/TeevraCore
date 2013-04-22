package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.PositionMaintenanceRequestMessageT;
import org.fixprotocol.fixml_5_0.SettlSessIDEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class PositionMaintenanceRequestMessageTBeanAccessor implements BeanAccessor<PositionMaintenanceRequestMessageT> {
	
	private PositionMaintenanceRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("adjTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAdjTyp();
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
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
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
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
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
		else if("setSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSubID();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("priorSpreadInd".equalsIgnoreCase(accessPath)){
			return this.bean.getPriorSpreadInd();
		}
		else if("thresholdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getThresholdAmt();
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
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("actn".equalsIgnoreCase(accessPath)){
			return this.bean.getActn();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("adjTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAdjTyp((Integer) obj);
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
		else if("setSubID".equalsIgnoreCase(accessPath)){
			this.bean.setSetSubID((String) obj);
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			this.bean.setRptRefID((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
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
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("origReqRefID".equalsIgnoreCase(accessPath)){
			this.bean.setOrigReqRefID((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("txnTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTyp((Integer) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("actn".equalsIgnoreCase(accessPath)){
			this.bean.setActn((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PositionMaintenanceRequestMessageT obj) {
		this.bean = obj; 
	}

}
