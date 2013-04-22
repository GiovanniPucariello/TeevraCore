package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ComplexEventDatesBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
