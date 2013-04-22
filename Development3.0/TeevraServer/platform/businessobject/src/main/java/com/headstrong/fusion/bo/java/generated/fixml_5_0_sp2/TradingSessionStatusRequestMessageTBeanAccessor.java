package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradingSessionStatusRequestMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class TradingSessionStatusRequestMessageTBeanAccessor implements BeanAccessor<TradingSessionStatusRequestMessageT> {
	
	private TradingSessionStatusRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("method".equalsIgnoreCase(accessPath)){
			return this.bean.getMethod();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			return this.bean.getMode();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("method".equalsIgnoreCase(accessPath)){
			 this.bean.setMethod((BigInteger) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			 this.bean.setMode((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradingSessionStatusRequestMessageT obj) {
		this.bean = obj; 
	}

}