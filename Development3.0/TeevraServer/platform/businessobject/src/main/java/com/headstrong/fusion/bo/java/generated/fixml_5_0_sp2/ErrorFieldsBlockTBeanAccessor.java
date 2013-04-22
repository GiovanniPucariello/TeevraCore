package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ErrorFieldsBlockT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class ErrorFieldsBlockTBeanAccessor implements BeanAccessor<ErrorFieldsBlockT> {
	
	private ErrorFieldsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("field".equalsIgnoreCase(accessPath)){
			return this.bean.getField();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ErrorFieldsBlockT obj) {
		this.bean = obj; 
	}

}
