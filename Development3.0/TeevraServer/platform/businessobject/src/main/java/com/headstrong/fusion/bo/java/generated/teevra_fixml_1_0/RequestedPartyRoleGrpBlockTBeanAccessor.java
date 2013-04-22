package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RequestedPartyRoleGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RequestedPartyRoleGrpBlockTBeanAccessor implements BeanAccessor<RequestedPartyRoleGrpBlockT> {
	
	private RequestedPartyRoleGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("r".equalsIgnoreCase(accessPath)){
			return this.bean.getR();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("r".equalsIgnoreCase(accessPath)){
			 this.bean.setR((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RequestedPartyRoleGrpBlockT obj) {
		this.bean = obj; 
	}

}
