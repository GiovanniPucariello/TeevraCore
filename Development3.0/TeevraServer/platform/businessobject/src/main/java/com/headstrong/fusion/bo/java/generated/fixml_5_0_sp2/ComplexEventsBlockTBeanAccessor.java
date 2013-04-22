package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ComplexEventsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:44 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:44 IST 2011")
public class ComplexEventsBlockTBeanAccessor implements BeanAccessor<ComplexEventsBlockT> {
	
	private ComplexEventsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("evntDts".equalsIgnoreCase(accessPath)){
			return this.bean.getEvntDts();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("pxTmTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTmTyp();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("optPayAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getOptPayAmt();
		}
		else if("cond".equalsIgnoreCase(accessPath)){
			return this.bean.getCond();
		}
		else if("pxBndryMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getPxBndryMeth();
		}
		else if("pxBndryPrcsn".equalsIgnoreCase(accessPath)){
			return this.bean.getPxBndryPrcsn();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("pxTmTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTmTyp((BigInteger) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("optPayAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setOptPayAmt((BigDecimal) obj);
			return;
		}
		else if("cond".equalsIgnoreCase(accessPath)){
			 this.bean.setCond((BigInteger) obj);
			return;
		}
		else if("pxBndryMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setPxBndryMeth((BigInteger) obj);
			return;
		}
		else if("pxBndryPrcsn".equalsIgnoreCase(accessPath)){
			 this.bean.setPxBndryPrcsn((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ComplexEventsBlockT obj) {
		this.bean = obj; 
	}

}
