package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import javax.xml.bind.JAXBElement;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class JAXBElementBeanAccessor implements BeanAccessor<JAXBElement> {
	
	private JAXBElement bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("scope".equalsIgnoreCase(accessPath)){
			return this.bean.getScope();
		}
		else if("declaredType".equalsIgnoreCase(accessPath)){
			return this.bean.getDeclaredType();
		}
		else if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
		}
		else if("value".equalsIgnoreCase(accessPath)){
			return this.bean.getValue();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("value".equalsIgnoreCase(accessPath)){
			 this.bean.setValue((Object) obj);
			return;
		}
		else if("nil".equalsIgnoreCase(accessPath)){
			 this.bean.setNil((Boolean) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(JAXBElement obj) {
		this.bean = obj; 
	}

}
