package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.ConfirmationRequestMessageT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class ConfirmationRequestMessageTBeanAccessor implements BeanAccessor<ConfirmationRequestMessageT> {
	
	private ConfirmationRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("allocID2".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID2();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocID();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("cnfmTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmTyp();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("ordAlloc".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdAlloc();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		else if("cnfmReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getCnfmReqID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
			return;
		}
		else if("allocID2".equalsIgnoreCase(accessPath)){
			this.bean.setAllocID2((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("allocID".equalsIgnoreCase(accessPath)){
			this.bean.setAllocID((String) obj);
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
		else if("cnfmTyp".equalsIgnoreCase(accessPath)){
			this.bean.setCnfmTyp((Integer) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setActIDSrc((Integer) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("cnfmReqID".equalsIgnoreCase(accessPath)){
			this.bean.setCnfmReqID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ConfirmationRequestMessageT obj) {
		this.bean = obj; 
	}

}
