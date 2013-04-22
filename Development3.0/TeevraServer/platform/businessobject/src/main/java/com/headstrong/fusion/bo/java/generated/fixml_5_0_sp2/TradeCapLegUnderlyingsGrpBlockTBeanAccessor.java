package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradeCapLegUnderlyingsGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingLegInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
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
