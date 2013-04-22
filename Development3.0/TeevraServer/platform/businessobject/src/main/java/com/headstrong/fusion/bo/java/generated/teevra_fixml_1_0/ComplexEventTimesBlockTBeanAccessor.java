package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ComplexEventTimesBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ComplexEventTimesBlockTBeanAccessor implements BeanAccessor<ComplexEventTimesBlockT> {
	
	private ComplexEventTimesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEndTm();
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			return this.bean.getStartTm();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEndTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			 this.bean.setStartTm((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ComplexEventTimesBlockT obj) {
		this.bean = obj; 
	}

}
