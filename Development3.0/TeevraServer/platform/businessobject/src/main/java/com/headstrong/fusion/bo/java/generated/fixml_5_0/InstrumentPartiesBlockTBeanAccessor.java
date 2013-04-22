package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.InstrumentPartiesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class InstrumentPartiesBlockTBeanAccessor implements BeanAccessor<InstrumentPartiesBlockT> {
	
	private InstrumentPartiesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("sub".equalsIgnoreCase(accessPath)){
			return this.bean.getSub();
		}
		else if("r".equalsIgnoreCase(accessPath)){
			return this.bean.getR();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("r".equalsIgnoreCase(accessPath)){
			this.bean.setR((Integer) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			this.bean.setSrc((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			this.bean.setID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrumentPartiesBlockT obj) {
		this.bean = obj; 
	}

}
