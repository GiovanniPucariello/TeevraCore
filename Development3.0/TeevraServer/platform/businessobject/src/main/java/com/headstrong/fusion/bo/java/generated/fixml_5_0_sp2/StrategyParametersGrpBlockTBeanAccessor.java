package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.StrategyParametersGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class StrategyParametersGrpBlockTBeanAccessor implements BeanAccessor<StrategyParametersGrpBlockT> {
	
	private StrategyParametersGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("strtPrmTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmTyp();
		}
		else if("strtPrmNme".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmNme();
		}
		else if("strtPrmVal".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmVal();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("strtPrmTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setStrtPrmTyp((BigInteger) obj);
			return;
		}
		else if("strtPrmNme".equalsIgnoreCase(accessPath)){
			 this.bean.setStrtPrmNme((String) obj);
			return;
		}
		else if("strtPrmVal".equalsIgnoreCase(accessPath)){
			 this.bean.setStrtPrmVal((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(StrategyParametersGrpBlockT obj) {
		this.bean = obj; 
	}

}
