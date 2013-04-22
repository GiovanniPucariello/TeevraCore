package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ReferenceBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ReferenceBlockTBeanAccessor implements BeanAccessor<ReferenceBlockT> {
	
	private ReferenceBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ref".equalsIgnoreCase(accessPath)){
			return this.bean.getRef();
		}
		else if("refTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRefTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ref".equalsIgnoreCase(accessPath)){
			 this.bean.setRef((String) obj);
			return;
		}
		else if("refTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRefTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ReferenceBlockT obj) {
		this.bean = obj; 
	}

}
