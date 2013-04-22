package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.DerivativeSecurityXMLBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class DerivativeSecurityXMLBlockTBeanAccessor implements BeanAccessor<DerivativeSecurityXMLBlockT> {
	
	private DerivativeSecurityXMLBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("schema".equalsIgnoreCase(accessPath)){
			return this.bean.getSchema();
		}
		else if("any".equalsIgnoreCase(accessPath)){
			return this.bean.getAny();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("schema".equalsIgnoreCase(accessPath)){
			 this.bean.setSchema((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeSecurityXMLBlockT obj) {
		this.bean = obj; 
	}

}
