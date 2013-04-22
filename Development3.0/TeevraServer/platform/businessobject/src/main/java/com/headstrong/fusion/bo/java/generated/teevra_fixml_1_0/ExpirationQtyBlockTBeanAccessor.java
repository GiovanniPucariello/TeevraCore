package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ExpirationQtyBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ExpirationQtyBlockTBeanAccessor implements BeanAccessor<ExpirationQtyBlockT> {
	
	private ExpirationQtyBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("expTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExpTyp();
		}
		else if("expQty".equalsIgnoreCase(accessPath)){
			return this.bean.getExpQty();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("expTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setExpTyp((BigInteger) obj);
			return;
		}
		else if("expQty".equalsIgnoreCase(accessPath)){
			 this.bean.setExpQty((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExpirationQtyBlockT obj) {
		this.bean = obj; 
	}

}
