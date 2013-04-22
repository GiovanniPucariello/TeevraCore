package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.QuoteRequestRejectMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class QuoteRequestRejectMessageTBeanAccessor implements BeanAccessor<QuoteRequestRejectMessageT> {
	
	private QuoteRequestRejectMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getRFQReqID();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("prvtQt".equalsIgnoreCase(accessPath)){
			return this.bean.getPrvtQt();
		}
		else if("quotReqRej".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotReqRej();
		}
		else if("reqRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRejRsn();
		}
		else if("rspdntTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspdntTyp();
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			return this.bean.getPrTrdAnon();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setRFQReqID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("prvtQt".equalsIgnoreCase(accessPath)){
			 this.bean.setPrvtQt((String) obj);
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
		else if("reqRejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setReqRejRsn((String) obj);
			return;
		}
		else if("rspdntTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRspdntTyp((BigInteger) obj);
			return;
		}
		else if("prTrdAnon".equalsIgnoreCase(accessPath)){
			 this.bean.setPrTrdAnon((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuoteRequestRejectMessageT obj) {
		this.bean = obj; 
	}

}
