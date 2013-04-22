package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.StreamAssignmentRequestMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class StreamAssignmentRequestMessageTBeanAccessor implements BeanAccessor<StreamAssignmentRequestMessageT> {
	
	private StreamAssignmentRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("asgnReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnReqTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("reqs".equalsIgnoreCase(accessPath)){
			return this.bean.getReqs();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("asgnReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnReqTyp((BigInteger) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(StreamAssignmentRequestMessageT obj) {
		this.bean = obj; 
	}

}
