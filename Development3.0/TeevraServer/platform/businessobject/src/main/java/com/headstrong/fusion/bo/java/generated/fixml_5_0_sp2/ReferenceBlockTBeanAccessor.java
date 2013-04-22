package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ReferenceBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
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
