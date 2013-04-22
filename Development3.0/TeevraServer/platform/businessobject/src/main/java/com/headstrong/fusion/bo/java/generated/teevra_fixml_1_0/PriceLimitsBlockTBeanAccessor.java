package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PriceLimitsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class PriceLimitsBlockTBeanAccessor implements BeanAccessor<PriceLimitsBlockT> {
	
	private PriceLimitsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("trdgRefPx".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgRefPx();
		}
		else if("lowLmtPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLowLmtPx();
		}
		else if("pxLmtTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxLmtTyp();
		}
		else if("hiLmtPx".equalsIgnoreCase(accessPath)){
			return this.bean.getHiLmtPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("trdgRefPx".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdgRefPx((BigDecimal) obj);
			return;
		}
		else if("lowLmtPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLowLmtPx((BigDecimal) obj);
			return;
		}
		else if("pxLmtTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxLmtTyp((BigInteger) obj);
			return;
		}
		else if("hiLmtPx".equalsIgnoreCase(accessPath)){
			 this.bean.setHiLmtPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PriceLimitsBlockT obj) {
		this.bean = obj; 
	}

}
