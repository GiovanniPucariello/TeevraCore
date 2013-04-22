package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.HopT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class HopTBeanAccessor implements BeanAccessor<HopT> {
	
	private HopT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ref".equalsIgnoreCase(accessPath)){
			return this.bean.getRef();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("snt".equalsIgnoreCase(accessPath)){
			return this.bean.getSnt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ref".equalsIgnoreCase(accessPath)){
			this.bean.setRef((BigInteger) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			this.bean.setID((String) obj);
			return;
		}
		else if("snt".equalsIgnoreCase(accessPath)){
			this.bean.setSnt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(HopT obj) {
		this.bean = obj; 
	}

}
