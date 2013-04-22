package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.FIXML;
import javax.xml.bind.JAXBElement;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class FIXMLBeanAccessor implements BeanAccessor<FIXML> {
	
	private FIXML bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("message".equalsIgnoreCase(accessPath)){
			return this.bean.getMessage();
		}
		else if("v".equalsIgnoreCase(accessPath)){
			return this.bean.getV();
		}
		else if("s".equalsIgnoreCase(accessPath)){
			return this.bean.getS();
		}
		else if("r".equalsIgnoreCase(accessPath)){
			return this.bean.getR();
		}
		else if("batch".equalsIgnoreCase(accessPath)){
			return this.bean.getBatch();
		}
		else if("xr".equalsIgnoreCase(accessPath)){
			return this.bean.getXr();
		}
		else if("xv".equalsIgnoreCase(accessPath)){
			return this.bean.getXv();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("message".equalsIgnoreCase(accessPath)){
			this.bean.setMessage((JAXBElement) obj);
			return;
		}
		else if("v".equalsIgnoreCase(accessPath)){
			this.bean.setV((String) obj);
			return;
		}
		else if("s".equalsIgnoreCase(accessPath)){
			this.bean.setS((String) obj);
			return;
		}
		else if("r".equalsIgnoreCase(accessPath)){
			this.bean.setR((String) obj);
			return;
		}
		else if("xr".equalsIgnoreCase(accessPath)){
			this.bean.setXr((String) obj);
			return;
		}
		else if("xv".equalsIgnoreCase(accessPath)){
			this.bean.setXv((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(FIXML obj) {
		this.bean = obj; 
	}

}
