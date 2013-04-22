package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RequestForPositionsMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import com.headstrong.teevra_fixml_1_0.SettlSessIDEnumT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RequestForPositionsMessageTBeanAccessor implements BeanAccessor<RequestForPositionsMessageT> {
	
	private RequestForPositionsMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cntrctInd".equalsIgnoreCase(accessPath)){
			return this.bean.getCntrctInd();
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTyp();
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
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("asgnInd".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnInd();
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
		else if("rspDest".equalsIgnoreCase(accessPath)){
			return this.bean.getRspDest();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("exerInd".equalsIgnoreCase(accessPath)){
			return this.bean.getExerInd();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
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
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspTransportTyp();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
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
		else if("cntrctInd".equalsIgnoreCase(accessPath)){
			 this.bean.setCntrctInd((BigInteger) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setReqTyp((BigInteger) obj);
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
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("asgnInd".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnInd((BigInteger) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplID((String) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((String) obj);
			return;
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			 this.bean.setRspDest((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("exerInd".equalsIgnoreCase(accessPath)){
			 this.bean.setExerInd((BigInteger) obj);
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
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRspTransportTyp((BigInteger) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchStat((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RequestForPositionsMessageT obj) {
		this.bean = obj; 
	}

}
