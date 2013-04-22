package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.UndSecAltIDGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:42 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:42 IST 2010")
public class UndSecAltIDGrpBlockTBeanAccessor implements BeanAccessor<UndSecAltIDGrpBlockT> {
	
	private UndSecAltIDGrpBlockT bean;
	
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
	public void setTarget(UndSecAltIDGrpBlockT obj) {
		this.bean = obj; 
	}

}
