package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.LegSecAltIDGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class LegSecAltIDGrpBlockTBeanAccessor implements BeanAccessor<LegSecAltIDGrpBlockT> {
	
	private LegSecAltIDGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("secAltID".equalsIgnoreCase(accessPath)){
			return this.bean.getSecAltID();
		}
		else if("secAltIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getSecAltIDSrc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("secAltID".equalsIgnoreCase(accessPath)){
			 this.bean.setSecAltID((String) obj);
			return;
		}
		else if("secAltIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setSecAltIDSrc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegSecAltIDGrpBlockT obj) {
		this.bean = obj; 
	}

}
