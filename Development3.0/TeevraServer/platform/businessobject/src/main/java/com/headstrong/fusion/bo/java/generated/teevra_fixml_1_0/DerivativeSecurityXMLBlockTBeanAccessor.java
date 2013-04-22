package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DerivativeSecurityXMLBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
