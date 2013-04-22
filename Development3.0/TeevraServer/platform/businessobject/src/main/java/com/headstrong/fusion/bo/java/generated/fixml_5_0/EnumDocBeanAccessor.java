package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.metadata.EnumDoc;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:19:01 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:19:01 IST 2010")
public class EnumDocBeanAccessor implements BeanAccessor<EnumDoc> {
	
	private EnumDoc bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("text".equalsIgnoreCase(accessPath)){
			return this.bean.getText();
		}
		else if("value".equalsIgnoreCase(accessPath)){
			return this.bean.getValue();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("text".equalsIgnoreCase(accessPath)){
			this.bean.setText((String) obj);
			return;
		}
		else if("value".equalsIgnoreCase(accessPath)){
			this.bean.setValue((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(EnumDoc obj) {
		this.bean = obj; 
	}

}
