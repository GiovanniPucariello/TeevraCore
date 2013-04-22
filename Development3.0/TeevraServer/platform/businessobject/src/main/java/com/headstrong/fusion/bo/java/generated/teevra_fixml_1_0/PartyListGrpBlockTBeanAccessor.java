package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PartyListGrpBlockT;
import com.headstrong.teevra_fixml_1_0.PartyDetailBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
