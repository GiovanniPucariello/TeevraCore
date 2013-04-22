package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RelatedPartyGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.RelatedPartyDetailBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
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
