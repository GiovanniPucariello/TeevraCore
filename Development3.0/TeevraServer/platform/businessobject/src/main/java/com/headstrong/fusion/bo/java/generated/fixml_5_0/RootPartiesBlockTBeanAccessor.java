package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.RootPartiesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class RootPartiesBlockTBeanAccessor implements BeanAccessor<RootPartiesBlockT> {
	
	private RootPartiesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rtPtyIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRtPtyIDSrc();
		}
		else if("rtPrtyID".equalsIgnoreCase(accessPath)){
			return this.bean.getRtPrtyID();
		}
		else if("rtSubPrtys".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSubPrtys();
		}
		else if("rtPtyRl".equalsIgnoreCase(accessPath)){
			return this.bean.getRtPtyRl();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rtPtyIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setRtPtyIDSrc((String) obj);
			return;
		}
		else if("rtPrtyID".equalsIgnoreCase(accessPath)){
			this.bean.setRtPrtyID((String) obj);
			return;
		}
		else if("rtPtyRl".equalsIgnoreCase(accessPath)){
			this.bean.setRtPtyRl((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RootPartiesBlockT obj) {
		this.bean = obj; 
	}

}
