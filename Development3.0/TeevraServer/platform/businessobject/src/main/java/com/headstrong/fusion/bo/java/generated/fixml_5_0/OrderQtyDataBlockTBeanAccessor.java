package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.OrderQtyDataBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class OrderQtyDataBlockTBeanAccessor implements BeanAccessor<OrderQtyDataBlockT> {
	
	private OrderQtyDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rndMod".equalsIgnoreCase(accessPath)){
			return this.bean.getRndMod();
		}
		else if("pct".equalsIgnoreCase(accessPath)){
			return this.bean.getPct();
		}
		else if("cash".equalsIgnoreCase(accessPath)){
			return this.bean.getCash();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			return this.bean.getRndDir();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rndMod".equalsIgnoreCase(accessPath)){
			this.bean.setRndMod((BigDecimal) obj);
			return;
		}
		else if("pct".equalsIgnoreCase(accessPath)){
			this.bean.setPct((BigDecimal) obj);
			return;
		}
		else if("cash".equalsIgnoreCase(accessPath)){
			this.bean.setCash((BigDecimal) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			this.bean.setRndDir((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(OrderQtyDataBlockT obj) {
		this.bean = obj; 
	}

}
