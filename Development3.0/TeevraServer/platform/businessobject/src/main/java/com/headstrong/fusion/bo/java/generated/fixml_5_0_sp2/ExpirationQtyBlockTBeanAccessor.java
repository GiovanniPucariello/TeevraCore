package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ExpirationQtyBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
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
