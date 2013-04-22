package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RFQRequestMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:47 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:47 IST 2011")
public class RFQRequestMessageTBeanAccessor implements BeanAccessor<RFQRequestMessageT> {
	
	private RFQRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getRFQReqID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("prvtQt".equalsIgnoreCase(accessPath)){
			return this.bean.getPrvtQt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("rFQReq".equalsIgnoreCase(accessPath)){
			return this.bean.getRFQReq();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rFQReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setRFQReqID((String) obj);
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
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RFQRequestMessageT obj) {
		this.bean = obj; 
	}

}
