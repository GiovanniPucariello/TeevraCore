package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.NetworkCounterpartySystemStatusResponseMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:39 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:39 IST 2011")
public class NetworkCounterpartySystemStatusResponseMessageTBeanAccessor implements BeanAccessor<NetworkCounterpartySystemStatusResponseMessageT> {
	
	private NetworkCounterpartySystemStatusResponseMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("cIDStat".equalsIgnoreCase(accessPath)){
			return this.bean.getCIDStat();
		}
		else if("ntwkRspID".equalsIgnoreCase(accessPath)){
			return this.bean.getNtwkRspID();
		}
		else if("ntwkStatRspTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getNtwkStatRspTyp();
		}
		else if("ntwkReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getNtwkReqID();
		}
		else if("lastNtwkRspID".equalsIgnoreCase(accessPath)){
			return this.bean.getLastNtwkRspID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("ntwkRspID".equalsIgnoreCase(accessPath)){
			 this.bean.setNtwkRspID((String) obj);
			return;
		}
		else if("ntwkStatRspTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setNtwkStatRspTyp((BigInteger) obj);
			return;
		}
		else if("ntwkReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setNtwkReqID((String) obj);
			return;
		}
		else if("lastNtwkRspID".equalsIgnoreCase(accessPath)){
			 this.bean.setLastNtwkRspID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NetworkCounterpartySystemStatusResponseMessageT obj) {
		this.bean = obj; 
	}

}
