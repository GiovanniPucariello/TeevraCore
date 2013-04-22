package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ErrorMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import com.headstrong.teevra_fixml_1_0.ErrorFieldsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ErrorMessageTBeanAccessor implements BeanAccessor<ErrorMessageT> {
	
	private ErrorMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("errorMessage".equalsIgnoreCase(accessPath)){
			return this.bean.getErrorMessage();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("origTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTrdID2();
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
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRptStat();
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
		 if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("errorMessage".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorMessage((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("origTrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTrdID2((String) obj);
			return;
		}
		else if("errorType".equalsIgnoreCase(accessPath)){
			 this.bean.setErrorType((String) obj);
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
		else if("trdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID2((String) obj);
			return;
		}
		else if("trdRptStat".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdRptStat((String) obj);
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
