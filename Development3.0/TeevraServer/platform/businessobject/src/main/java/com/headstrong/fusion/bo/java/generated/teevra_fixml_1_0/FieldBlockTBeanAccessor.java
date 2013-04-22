package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.FieldBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class FieldBlockTBeanAccessor implements BeanAccessor<FieldBlockT> {
	
	private FieldBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
		}
		else if("value".equalsIgnoreCase(accessPath)){
			return this.bean.getValue();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("name".equalsIgnoreCase(accessPath)){
			 this.bean.setName((String) obj);
			return;
		}
		else if("value".equalsIgnoreCase(accessPath)){
			 this.bean.setValue((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(FieldBlockT obj) {
		this.bean = obj; 
	}

}
