package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ErrorMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import org.fixprotocol.fixml_5_0_sp2.ErrorFieldsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class ErrorMessageTBeanAccessor implements BeanAccessor<ErrorMessageT> {
	
	private ErrorMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("errorMessage".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorMessage();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("errorType".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorType();
		}
		else if("errorDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorDesc();
		}
		else if("errorRecord".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorRecord();
		}
		else if("timestamp".equalsIgnoreCase(accessPath)){
			return this.bean.getTimestamp();
		}
		else if("source".equalsIgnoreCase(accessPath)){
			return this.bean.getSource();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("errorFields".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorFields();
		}
		else if("errorCode".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorCode();
		}
		else if("techErrorType".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorType();
		}
		else if("techErrorMessage".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorMessage();
		}
		else if("techErrorCode".equalsIgnoreCase(accessPath)){
			return this.bean.getTechErrorCode();
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
		else if("errorType".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorType((String) obj);
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
		else if("timestamp".equalsIgnoreCase(accessPath)){
			 this.bean.setTimestamp((XMLGregorianCalendar) obj);
			return;
		}
		else if("source".equalsIgnoreCase(accessPath)){
			 this.bean.setSource((String) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((String) obj);
			return;
		}
		else if("errorFields".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorFields((ErrorFieldsBlockT) obj);
			return;
		}
		else if("errorCode".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorCode((String) obj);
			return;
		}
		else if("techErrorType".equalsIgnoreCase(accessPath)){
			 this.bean.setTechErrorType((String) obj);
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
		else if("trnID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrnID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ErrorMessageT obj) {
		this.bean = obj; 
	}

}
