package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.CollInqQualGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class CollInqQualGrpBlockTBeanAccessor implements BeanAccessor<CollInqQualGrpBlockT> {
	
	private CollInqQualGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("qual".equalsIgnoreCase(accessPath)){
			return this.bean.getQual();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("qual".equalsIgnoreCase(accessPath)){
			 this.bean.setQual((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CollInqQualGrpBlockT obj) {
		this.bean = obj; 
	}

}
