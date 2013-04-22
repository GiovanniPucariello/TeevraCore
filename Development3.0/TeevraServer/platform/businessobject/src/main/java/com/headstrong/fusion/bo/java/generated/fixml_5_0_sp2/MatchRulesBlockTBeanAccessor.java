package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MatchRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:38 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:38 IST 2011")
public class MatchRulesBlockTBeanAccessor implements BeanAccessor<MatchRulesBlockT> {
	
	private MatchRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mtchAlgo".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchAlgo();
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mtchAlgo".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchAlgo((String) obj);
			return;
		}
		else if("mtchTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MatchRulesBlockT obj) {
		this.bean = obj; 
	}

}
