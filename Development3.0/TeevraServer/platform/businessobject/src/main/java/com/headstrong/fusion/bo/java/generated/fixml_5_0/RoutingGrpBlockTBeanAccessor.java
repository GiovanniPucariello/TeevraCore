package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.RoutingGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:36 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:36 IST 2010")
public class RoutingGrpBlockTBeanAccessor implements BeanAccessor<RoutingGrpBlockT> {
	
	private RoutingGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rtgID".equalsIgnoreCase(accessPath)){
			return this.bean.getRtgID();
		}
		else if("rtgTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRtgTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rtgID".equalsIgnoreCase(accessPath)){
			this.bean.setRtgID((String) obj);
			return;
		}
		else if("rtgTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRtgTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RoutingGrpBlockT obj) {
		this.bean = obj; 
	}

}
