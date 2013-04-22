package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.FillsGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class FillsGrpBlockTBeanAccessor implements BeanAccessor<FillsGrpBlockT> {
	
	private FillsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("fillPx".equalsIgnoreCase(accessPath)){
			return this.bean.getFillPx();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("lqdtyInd".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyInd();
		}
		else if("fillQty".equalsIgnoreCase(accessPath)){
			return this.bean.getFillQty();
		}
		else if("fillExecID".equalsIgnoreCase(accessPath)){
			return this.bean.getFillExecID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("fillPx".equalsIgnoreCase(accessPath)){
			 this.bean.setFillPx((BigDecimal) obj);
			return;
		}
		else if("lqdtyInd".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyInd((BigInteger) obj);
			return;
		}
		else if("fillQty".equalsIgnoreCase(accessPath)){
			 this.bean.setFillQty((BigDecimal) obj);
			return;
		}
		else if("fillExecID".equalsIgnoreCase(accessPath)){
			 this.bean.setFillExecID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(FillsGrpBlockT obj) {
		this.bean = obj; 
	}

}
