package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.RFQRequestMessageT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
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
