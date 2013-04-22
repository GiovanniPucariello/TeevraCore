package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ComplexEventDatesBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class ComplexEventDatesBlockTBeanAccessor implements BeanAccessor<ComplexEventDatesBlockT> {
	
	private ComplexEventDatesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endDt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndDt();
		}
		else if("startDt".equalsIgnoreCase(accessPath)){
			return this.bean.getStartDt();
		}
		else if("evntTms".equalsIgnoreCase(accessPath)){
			return this.bean.getEvntTms();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("endDt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("startDt".equalsIgnoreCase(accessPath)){
			 this.bean.setStartDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ComplexEventDatesBlockT obj) {
		this.bean = obj; 
	}

}
