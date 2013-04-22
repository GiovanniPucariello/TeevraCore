package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.EvntGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class EvntGrpBlockTBeanAccessor implements BeanAccessor<EvntGrpBlockT> {
	
	private EvntGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dt".equalsIgnoreCase(accessPath)){
			return this.bean.getDt();
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
		else if("px".equalsIgnoreCase(accessPath)){
			this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("eventTyp".equalsIgnoreCase(accessPath)){
			this.bean.setEventTyp((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(EvntGrpBlockT obj) {
		this.bean = obj; 
	}

}
