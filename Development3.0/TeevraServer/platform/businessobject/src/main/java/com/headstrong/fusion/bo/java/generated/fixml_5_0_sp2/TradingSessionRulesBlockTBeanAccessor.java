package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradingSessionRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class TradingSessionRulesBlockTBeanAccessor implements BeanAccessor<TradingSessionRulesBlockT> {
	
	private TradingSessionRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("execInstRules".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInstRules();
		}
		else if("tmInForceRules".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForceRules();
		}
		else if("mtchRules".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchRules();
		}
		else if("mDFeedTyps".equalsIgnoreCase(accessPath)){
			return this.bean.getMDFeedTyps();
		}
		else if("ordTypRules".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTypRules();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradingSessionRulesBlockT obj) {
		this.bean = obj; 
	}

}
