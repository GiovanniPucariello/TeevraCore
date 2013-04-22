package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PartyAltIDsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class PartyAltIDsBlockTBeanAccessor implements BeanAccessor<PartyAltIDsBlockT> {
	
	private PartyAltIDsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("sub".equalsIgnoreCase(accessPath)){
			return this.bean.getSub();
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
		 if("src".equalsIgnoreCase(accessPath)){
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
	public void setTarget(PartyAltIDsBlockT obj) {
		this.bean = obj; 
	}

}
