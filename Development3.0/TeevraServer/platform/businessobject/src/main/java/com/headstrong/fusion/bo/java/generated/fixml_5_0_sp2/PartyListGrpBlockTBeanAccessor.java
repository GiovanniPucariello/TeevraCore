package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PartyListGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.PartyDetailBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class PartyListGrpBlockTBeanAccessor implements BeanAccessor<PartyListGrpBlockT> {
	
	private PartyListGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ptyDetl".equalsIgnoreCase(accessPath)){
			return this.bean.getPtyDetl();
		}
		else if("reltdPty".equalsIgnoreCase(accessPath)){
			return this.bean.getReltdPty();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ptyDetl".equalsIgnoreCase(accessPath)){
			 this.bean.setPtyDetl((PartyDetailBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PartyListGrpBlockT obj) {
		this.bean = obj; 
	}

}
