package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.metadata.ObjectFactory;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:19:01 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:19:01 IST 2010")
public class ObjectFactoryBeanAccessor implements BeanAccessor<ObjectFactory> {
	
	private ObjectFactory bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ObjectFactory obj) {
		this.bean = obj; 
	}

}
