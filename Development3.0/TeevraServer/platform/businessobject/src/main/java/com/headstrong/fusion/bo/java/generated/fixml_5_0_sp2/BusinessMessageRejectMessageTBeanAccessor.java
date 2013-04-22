package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.BusinessMessageRejectMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class BusinessMessageRejectMessageTBeanAccessor implements BeanAccessor<BusinessMessageRejectMessageT> {
	
	private BusinessMessageRejectMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getRefSeqNum();
		}
		else if("refApplExtID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplExtID();
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
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefCstmApplVerID();
		}
		else if("bizRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getBizRejRsn();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("refApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplVerID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setRefSeqNum((BigInteger) obj);
			return;
		}
		else if("refApplExtID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplExtID((BigInteger) obj);
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
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefCstmApplVerID((String) obj);
			return;
		}
		else if("bizRejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setBizRejRsn((BigInteger) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("refApplVerID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplVerID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BusinessMessageRejectMessageT obj) {
		this.bean = obj; 
	}

}
