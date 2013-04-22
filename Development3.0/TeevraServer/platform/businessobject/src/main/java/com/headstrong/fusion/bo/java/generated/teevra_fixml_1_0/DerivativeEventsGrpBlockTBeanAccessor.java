package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DerivativeEventsGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
