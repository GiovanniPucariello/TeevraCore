package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MDReqGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MDReqGrpBlockTBeanAccessor implements BeanAccessor<MDReqGrpBlockT> {
	
	private MDReqGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MDReqGrpBlockT obj) {
		this.bean = obj; 
	}

}
