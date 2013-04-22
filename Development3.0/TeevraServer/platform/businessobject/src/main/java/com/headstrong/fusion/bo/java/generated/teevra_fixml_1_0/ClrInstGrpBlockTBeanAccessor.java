package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ClrInstGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ClrInstGrpBlockTBeanAccessor implements BeanAccessor<ClrInstGrpBlockT> {
	
	private ClrInstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("clrngInstrctn".equalsIgnoreCase(accessPath)){
			return this.bean.getClrngInstrctn();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("clrngInstrctn".equalsIgnoreCase(accessPath)){
			 this.bean.setClrngInstrctn((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ClrInstGrpBlockT obj) {
		this.bean = obj; 
	}

}
