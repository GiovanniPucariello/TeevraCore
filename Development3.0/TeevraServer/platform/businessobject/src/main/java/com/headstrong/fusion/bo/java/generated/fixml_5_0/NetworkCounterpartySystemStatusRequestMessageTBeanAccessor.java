package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.NetworkCounterpartySystemStatusRequestMessageT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:38 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:38 IST 2010")
public class NetworkCounterpartySystemStatusRequestMessageTBeanAccessor implements BeanAccessor<NetworkCounterpartySystemStatusRequestMessageT> {
	
	private NetworkCounterpartySystemStatusRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cIDReq".equalsIgnoreCase(accessPath)){
			return this.bean.getCIDReq();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("ntwkReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getNtwkReqTyp();
		}
		else if("ntwkReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getNtwkReqID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("ntwkReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setNtwkReqTyp((Integer) obj);
			return;
		}
		else if("ntwkReqID".equalsIgnoreCase(accessPath)){
			this.bean.setNtwkReqID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NetworkCounterpartySystemStatusRequestMessageT obj) {
		this.bean = obj; 
	}

}
