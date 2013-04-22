package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MarketSegmentGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.SecurityTradingRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:45 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:45 IST 2011")
public class MarketSegmentGrpBlockTBeanAccessor implements BeanAccessor<MarketSegmentGrpBlockT> {
	
	private MarketSegmentGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("secTrdgRules".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTrdgRules();
		}
		else if("strkRules".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkRules();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("secTrdgRules".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTrdgRules((SecurityTradingRulesBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketSegmentGrpBlockT obj) {
		this.bean = obj; 
	}

}
