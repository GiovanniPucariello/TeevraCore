package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecurityTradingRulesBlockT;
import org.fixprotocol.fixml_5_0_sp2.BaseTradingRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class SecurityTradingRulesBlockTBeanAccessor implements BeanAccessor<SecurityTradingRulesBlockT> {
	
	private SecurityTradingRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("baseTrdgRules".equalsIgnoreCase(accessPath)){
			return this.bean.getBaseTrdgRules();
		}
		else if("attrb".equalsIgnoreCase(accessPath)){
			return this.bean.getAttrb();
		}
		else if("trdgSesRulesGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgSesRulesGrp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("baseTrdgRules".equalsIgnoreCase(accessPath)){
			 this.bean.setBaseTrdgRules((BaseTradingRulesBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityTradingRulesBlockT obj) {
		this.bean = obj; 
	}

}
