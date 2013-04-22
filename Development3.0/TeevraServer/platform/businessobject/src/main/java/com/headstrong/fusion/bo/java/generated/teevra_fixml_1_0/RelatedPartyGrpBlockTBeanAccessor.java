package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RelatedPartyGrpBlockT;
import com.headstrong.teevra_fixml_1_0.RelatedPartyDetailBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RelatedPartyGrpBlockTBeanAccessor implements BeanAccessor<RelatedPartyGrpBlockT> {
	
	private RelatedPartyGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ptyDetl".equalsIgnoreCase(accessPath)){
			return this.bean.getPtyDetl();
		}
		else if("rltnshp".equalsIgnoreCase(accessPath)){
			return this.bean.getRltnshp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ptyDetl".equalsIgnoreCase(accessPath)){
			 this.bean.setPtyDetl((RelatedPartyDetailBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RelatedPartyGrpBlockT obj) {
		this.bean = obj; 
	}

}
