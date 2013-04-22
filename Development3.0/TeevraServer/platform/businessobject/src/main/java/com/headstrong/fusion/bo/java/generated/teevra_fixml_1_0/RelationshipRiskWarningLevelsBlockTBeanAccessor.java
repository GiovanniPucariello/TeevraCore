package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RelationshipRiskWarningLevelsBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
