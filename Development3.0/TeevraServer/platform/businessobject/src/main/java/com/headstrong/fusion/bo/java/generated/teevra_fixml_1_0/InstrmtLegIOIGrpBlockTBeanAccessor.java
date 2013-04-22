package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.InstrmtLegIOIGrpBlockT;
import com.headstrong.teevra_fixml_1_0.InstrumentLegBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class InstrmtLegIOIGrpBlockTBeanAccessor implements BeanAccessor<InstrmtLegIOIGrpBlockT> {
	
	private InstrmtLegIOIGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("iOIQty".equalsIgnoreCase(accessPath)){
			return this.bean.getIOIQty();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("leg".equalsIgnoreCase(accessPath)){
			 this.bean.setLeg((InstrumentLegBlockT) obj);
			return;
		}
		else if("iOIQty".equalsIgnoreCase(accessPath)){
			 this.bean.setIOIQty((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrmtLegIOIGrpBlockT obj) {
		this.bean = obj; 
	}

}
