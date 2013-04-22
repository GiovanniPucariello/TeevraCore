package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TradeCapLegUnderlyingsGrpBlockT;
import com.headstrong.teevra_fixml_1_0.UnderlyingLegInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TradeCapLegUnderlyingsGrpBlockTBeanAccessor implements BeanAccessor<TradeCapLegUnderlyingsGrpBlockT> {
	
	private TradeCapLegUnderlyingsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((UnderlyingLegInstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradeCapLegUnderlyingsGrpBlockT obj) {
		this.bean = obj; 
	}

}
