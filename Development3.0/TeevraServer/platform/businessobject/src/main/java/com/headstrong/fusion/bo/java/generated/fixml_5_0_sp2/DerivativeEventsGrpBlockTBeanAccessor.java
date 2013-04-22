package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.DerivativeEventsGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class DerivativeEventsGrpBlockTBeanAccessor implements BeanAccessor<DerivativeEventsGrpBlockT> {
	
	private DerivativeEventsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dt".equalsIgnoreCase(accessPath)){
			return this.bean.getDt();
		}
		else if("tm".equalsIgnoreCase(accessPath)){
			return this.bean.getTm();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("eventTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getEventTyp();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("dt".equalsIgnoreCase(accessPath)){
			 this.bean.setDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tm".equalsIgnoreCase(accessPath)){
			 this.bean.setTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("eventTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setEventTyp((BigInteger) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeEventsGrpBlockT obj) {
		this.bean = obj; 
	}

}
