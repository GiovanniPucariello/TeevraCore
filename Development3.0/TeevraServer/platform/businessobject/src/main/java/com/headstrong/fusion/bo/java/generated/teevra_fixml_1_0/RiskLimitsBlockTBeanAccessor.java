package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RiskLimitsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RiskLimitsBlockTBeanAccessor implements BeanAccessor<RiskLimitsBlockT> {
	
	private RiskLimitsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("pltfm".equalsIgnoreCase(accessPath)){
			return this.bean.getPltfm();
		}
		else if("instrmtScope".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtScope();
		}
		else if("warnLvl".equalsIgnoreCase(accessPath)){
			return this.bean.getWarnLvl();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			 this.bean.setAmt((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("pltfm".equalsIgnoreCase(accessPath)){
			 this.bean.setPltfm((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RiskLimitsBlockT obj) {
		this.bean = obj; 
	}

}
