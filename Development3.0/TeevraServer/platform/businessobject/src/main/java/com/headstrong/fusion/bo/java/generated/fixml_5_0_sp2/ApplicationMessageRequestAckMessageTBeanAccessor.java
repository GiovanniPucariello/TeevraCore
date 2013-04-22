package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ApplicationMessageRequestAckMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:39 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:39 IST 2011")
public class ApplicationMessageRequestAckMessageTBeanAccessor implements BeanAccessor<ApplicationMessageRequestAckMessageT> {
	
	private ApplicationMessageRequestAckMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applRespTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplRespTyp();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("applReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplReqTyp();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("applTotMsgCnt".equalsIgnoreCase(accessPath)){
			return this.bean.getApplTotMsgCnt();
		}
		else if("applIDReqAckGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplIDReqAckGrp();
		}
		else if("applRespID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplRespID();
		}
		else if("applReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplReqID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applRespTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setApplRespTyp((BigInteger) obj);
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
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("applReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setApplReqTyp((BigInteger) obj);
			return;
		}
		else if("applTotMsgCnt".equalsIgnoreCase(accessPath)){
			 this.bean.setApplTotMsgCnt((BigInteger) obj);
			return;
		}
		else if("applRespID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplRespID((String) obj);
			return;
		}
		else if("applReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplReqID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplicationMessageRequestAckMessageT obj) {
		this.bean = obj; 
	}

}
