package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.CpctyConfGrpBlockT;
import com.headstrong.teevra_fixml_1_0.OrderCapacityEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class CpctyConfGrpBlockTBeanAccessor implements BeanAccessor<CpctyConfGrpBlockT> {
	
	private CpctyConfGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("cpctyQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpctyQty();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("cpctyQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCpctyQty((BigDecimal) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			 this.bean.setRstctions((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CpctyConfGrpBlockT obj) {
		this.bean = obj; 
	}

}
