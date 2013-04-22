package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PriceLimitsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
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
