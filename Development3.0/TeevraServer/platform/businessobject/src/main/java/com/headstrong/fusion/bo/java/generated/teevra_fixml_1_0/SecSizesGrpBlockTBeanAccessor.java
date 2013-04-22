package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.SecSizesGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
