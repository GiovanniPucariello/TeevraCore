package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradingSessionRulesGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.TradingSessionRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class TradingSessionRulesGrpBlockTBeanAccessor implements BeanAccessor<TradingSessionRulesGrpBlockT> {
	
	private TradingSessionRulesGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("trdgSesRules".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdgSesRules();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("trdgSesRules".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdgSesRules((TradingSessionRulesBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradingSessionRulesGrpBlockT obj) {
		this.bean = obj; 
	}

}
