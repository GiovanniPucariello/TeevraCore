package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PartyRelationshipsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
