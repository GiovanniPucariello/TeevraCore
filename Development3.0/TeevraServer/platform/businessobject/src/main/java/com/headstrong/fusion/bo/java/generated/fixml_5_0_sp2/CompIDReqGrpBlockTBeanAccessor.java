package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.CompIDReqGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class CompIDReqGrpBlockTBeanAccessor implements BeanAccessor<CompIDReqGrpBlockT> {
	
	private CompIDReqGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("deskID".equalsIgnoreCase(accessPath)){
			return this.bean.getDeskID();
		}
		else if("refSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefSubID();
		}
		else if("refCompID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefCompID();
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			return this.bean.getLctnID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("deskID".equalsIgnoreCase(accessPath)){
			 this.bean.setDeskID((String) obj);
			return;
		}
		else if("refSubID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefSubID((String) obj);
			return;
		}
		else if("refCompID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefCompID((String) obj);
			return;
		}
		else if("lctnID".equalsIgnoreCase(accessPath)){
			 this.bean.setLctnID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CompIDReqGrpBlockT obj) {
		this.bean = obj; 
	}

}
