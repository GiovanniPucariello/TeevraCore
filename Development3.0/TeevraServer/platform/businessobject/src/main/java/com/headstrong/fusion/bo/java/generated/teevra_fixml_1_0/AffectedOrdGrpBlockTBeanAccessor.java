package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AffectedOrdGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AffectedOrdGrpBlockTBeanAccessor implements BeanAccessor<AffectedOrdGrpBlockT> {
	
	private AffectedOrdGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("origID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigID();
		}
		else if("affctdScndOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getAffctdScndOrdID();
		}
		else if("affctdOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getAffctdOrdID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("origID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigID((String) obj);
			return;
		}
		else if("affctdScndOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setAffctdScndOrdID((String) obj);
			return;
		}
		else if("affctdOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setAffctdOrdID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AffectedOrdGrpBlockT obj) {
		this.bean = obj; 
	}

}
