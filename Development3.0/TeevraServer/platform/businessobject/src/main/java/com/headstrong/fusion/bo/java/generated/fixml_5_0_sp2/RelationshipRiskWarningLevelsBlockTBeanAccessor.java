package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RelationshipRiskWarningLevelsBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
public class RelationshipRiskWarningLevelsBlockTBeanAccessor implements BeanAccessor<RelationshipRiskWarningLevelsBlockT> {
	
	private RelationshipRiskWarningLevelsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("nme".equalsIgnoreCase(accessPath)){
			return this.bean.getNme();
		}
		else if("pct".equalsIgnoreCase(accessPath)){
			return this.bean.getPct();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("nme".equalsIgnoreCase(accessPath)){
			 this.bean.setNme((String) obj);
			return;
		}
		else if("pct".equalsIgnoreCase(accessPath)){
			 this.bean.setPct((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RelationshipRiskWarningLevelsBlockT obj) {
		this.bean = obj; 
	}

}
