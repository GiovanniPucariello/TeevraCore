package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.NetworkCounterpartySystemStatusRequestMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
			 this.bean.setNtwkReqTyp((BigInteger) obj);
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
