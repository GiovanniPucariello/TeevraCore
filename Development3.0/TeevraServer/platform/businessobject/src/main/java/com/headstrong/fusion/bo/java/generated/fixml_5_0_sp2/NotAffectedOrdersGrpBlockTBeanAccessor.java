package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.NotAffectedOrdersGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class NotAffectedOrdersGrpBlockTBeanAccessor implements BeanAccessor<NotAffectedOrdersGrpBlockT> {
	
	private NotAffectedOrdersGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("notAffectedOrderID".equalsIgnoreCase(accessPath)){
			return this.bean.getNotAffectedOrderID();
		}
		else if("notAffOrigClOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getNotAffOrigClOrdID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("notAffectedOrderID".equalsIgnoreCase(accessPath)){
			 this.bean.setNotAffectedOrderID((String) obj);
			return;
		}
		else if("notAffOrigClOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setNotAffOrigClOrdID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NotAffectedOrdersGrpBlockT obj) {
		this.bean = obj; 
	}

}
