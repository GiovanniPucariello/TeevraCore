package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.BusinessMessageRejectMessageT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class BusinessMessageRejectMessageTBeanAccessor implements BeanAccessor<BusinessMessageRejectMessageT> {
	
	private BusinessMessageRejectMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getRefSeqNum();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("refMsgTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRefMsgTyp();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("bizRejRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getBizRejRefID();
		}
		else if("bizRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getBizRejRsn();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refSeqNum".equalsIgnoreCase(accessPath)){
			this.bean.setRefSeqNum((BigInteger) obj);
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
		else if("refMsgTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRefMsgTyp((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("bizRejRefID".equalsIgnoreCase(accessPath)){
			this.bean.setBizRejRefID((String) obj);
			return;
		}
		else if("bizRejRsn".equalsIgnoreCase(accessPath)){
			this.bean.setBizRejRsn((Integer) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BusinessMessageRejectMessageT obj) {
		this.bean = obj; 
	}

}
