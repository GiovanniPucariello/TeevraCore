package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.LotTypeRulesBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class LotTypeRulesBlockTBeanAccessor implements BeanAccessor<LotTypeRulesBlockT> {
	
	private LotTypeRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("lotTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLotTyp();
		}
		else if("minLotSz".equalsIgnoreCase(accessPath)){
			return this.bean.getMinLotSz();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("lotTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLotTyp((String) obj);
			return;
		}
		else if("minLotSz".equalsIgnoreCase(accessPath)){
			 this.bean.setMinLotSz((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LotTypeRulesBlockT obj) {
		this.bean = obj; 
	}

}
