package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.CutOffT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class CutOffTBeanAccessor implements BeanAccessor<CutOffT> {
	
	private CutOffT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("time".equalsIgnoreCase(accessPath)){
			return this.bean.getTime();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("indctr".equalsIgnoreCase(accessPath)){
			return this.bean.getIndctr();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("time".equalsIgnoreCase(accessPath)){
			 this.bean.setTime((XMLGregorianCalendar) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		else if("indctr".equalsIgnoreCase(accessPath)){
			 this.bean.setIndctr((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CutOffT obj) {
		this.bean = obj; 
	}

}
