package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MarketSegmentGrpBlockT;
import com.headstrong.teevra_fixml_1_0.SecurityTradingRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
