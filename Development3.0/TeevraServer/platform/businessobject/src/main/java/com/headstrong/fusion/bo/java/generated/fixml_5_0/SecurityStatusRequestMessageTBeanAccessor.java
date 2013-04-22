package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SecurityStatusRequestMessageT;
import org.fixprotocol.fixml_5_0.InstrumentExtensionBlockT;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class SecurityStatusRequestMessageTBeanAccessor implements BeanAccessor<SecurityStatusRequestMessageT> {
	
	private SecurityStatusRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getStatReqID();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
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
		else if("statReqID".equalsIgnoreCase(accessPath)){
			this.bean.setStatReqID((String) obj);
			return;
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityStatusRequestMessageT obj) {
		this.bean = obj; 
	}

}
