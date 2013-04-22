package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.BidResponseMessageT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class BidResponseMessageTBeanAccessor implements BeanAccessor<BidResponseMessageT> {
	
	private BidResponseMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("clBidID".equalsIgnoreCase(accessPath)){
			return this.bean.getClBidID();
		}
		else if("compRsp".equalsIgnoreCase(accessPath)){
			return this.bean.getCompRsp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			return this.bean.getBidID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("clBidID".equalsIgnoreCase(accessPath)){
			this.bean.setClBidID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			this.bean.setBidID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BidResponseMessageT obj) {
		this.bean = obj; 
	}

}
