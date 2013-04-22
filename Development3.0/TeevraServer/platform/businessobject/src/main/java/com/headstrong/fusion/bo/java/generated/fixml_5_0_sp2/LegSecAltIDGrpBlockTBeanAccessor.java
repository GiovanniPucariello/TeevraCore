package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.LegSecAltIDGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:40 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:40 IST 2011")
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
