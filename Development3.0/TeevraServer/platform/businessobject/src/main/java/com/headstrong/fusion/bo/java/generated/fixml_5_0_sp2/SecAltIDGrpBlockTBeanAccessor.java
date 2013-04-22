package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecAltIDGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class SecAltIDGrpBlockTBeanAccessor implements BeanAccessor<SecAltIDGrpBlockT> {
	
	private SecAltIDGrpBlockT bean;
	
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
	public void setTarget(SecAltIDGrpBlockT obj) {
		this.bean = obj; 
	}

}
