package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UnderlyingLegSecurityAltIDGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class UnderlyingLegSecurityAltIDGrpBlockTBeanAccessor implements BeanAccessor<UnderlyingLegSecurityAltIDGrpBlockT> {
	
	private UnderlyingLegSecurityAltIDGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("altIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAltIDSrc();
		}
		else if("altID".equalsIgnoreCase(accessPath)){
			return this.bean.getAltID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("altIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAltIDSrc((String) obj);
			return;
		}
		else if("altID".equalsIgnoreCase(accessPath)){
			 this.bean.setAltID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UnderlyingLegSecurityAltIDGrpBlockT obj) {
		this.bean = obj; 
	}

}
