package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecSizesGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:40 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:40 IST 2011")
public class SecSizesGrpBlockTBeanAccessor implements BeanAccessor<SecSizesGrpBlockT> {
	
	private SecSizesGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mDSecSizeType".equalsIgnoreCase(accessPath)){
			return this.bean.getMDSecSizeType();
		}
		else if("mDSecSize".equalsIgnoreCase(accessPath)){
			return this.bean.getMDSecSize();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mDSecSizeType".equalsIgnoreCase(accessPath)){
			 this.bean.setMDSecSizeType((String) obj);
			return;
		}
		else if("mDSecSize".equalsIgnoreCase(accessPath)){
			 this.bean.setMDSecSize((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecSizesGrpBlockT obj) {
		this.bean = obj; 
	}

}
