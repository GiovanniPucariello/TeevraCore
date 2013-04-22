package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AttrbGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AttrbGrpBlockTBeanAccessor implements BeanAccessor<AttrbGrpBlockT> {
	
	private AttrbGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			return this.bean.getVal();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			 this.bean.setVal((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AttrbGrpBlockT obj) {
		this.bean = obj; 
	}

}
