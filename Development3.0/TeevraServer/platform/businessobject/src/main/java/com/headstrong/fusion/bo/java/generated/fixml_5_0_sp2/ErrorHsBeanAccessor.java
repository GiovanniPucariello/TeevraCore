package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ErrorHs;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:45 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:45 IST 2011")
public class ErrorHsBeanAccessor implements BeanAccessor<ErrorHs> {
	
	private ErrorHs bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("errorMessage".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorMessage();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("errorDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorDesc();
		}
		else if("errorCode".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorCode();
		}
		else if("techErrorMessage".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorMessage();
		}
		else if("techErrorCode".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorCode();
		}
		else if("techErrorDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorDesc();
		}
		else if("trnID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrnID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("errorMessage".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorMessage((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("errorDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorDesc((String) obj);
			return;
		}
		else if("errorCode".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorCode((String) obj);
			return;
		}
		else if("techErrorMessage".equalsIgnoreCase(accessPath)){
			 this.bean.setTechErrorMessage((String) obj);
			return;
		}
		else if("techErrorCode".equalsIgnoreCase(accessPath)){
			 this.bean.setTechErrorCode((String) obj);
			return;
		}
		else if("techErrorDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setTechErrorDesc((String) obj);
			return;
		}
		else if("trnID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrnID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ErrorHs obj) {
		this.bean = obj; 
	}

}
