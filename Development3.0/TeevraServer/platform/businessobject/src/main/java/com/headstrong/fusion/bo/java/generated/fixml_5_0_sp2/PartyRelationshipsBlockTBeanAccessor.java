package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PartyRelationshipsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:38 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:38 IST 2011")
public class PartyRelationshipsBlockTBeanAccessor implements BeanAccessor<PartyRelationshipsBlockT> {
	
	private PartyRelationshipsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("rltnshp".equalsIgnoreCase(accessPath)){
			return this.bean.getRltnshp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("rltnshp".equalsIgnoreCase(accessPath)){
			 this.bean.setRltnshp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PartyRelationshipsBlockT obj) {
		this.bean = obj; 
	}

}
