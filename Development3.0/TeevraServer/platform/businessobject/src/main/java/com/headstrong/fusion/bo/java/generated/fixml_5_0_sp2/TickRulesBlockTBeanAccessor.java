package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TickRulesBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class TickRulesBlockTBeanAccessor implements BeanAccessor<TickRulesBlockT> {
	
	private TickRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("startTickPxRng".equalsIgnoreCase(accessPath)){
			return this.bean.getStartTickPxRng();
		}
		else if("tickIncr".equalsIgnoreCase(accessPath)){
			return this.bean.getTickIncr();
		}
		else if("tickRuleTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTickRuleTyp();
		}
		else if("endTickPxRng".equalsIgnoreCase(accessPath)){
			return this.bean.getEndTickPxRng();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("startTickPxRng".equalsIgnoreCase(accessPath)){
			 this.bean.setStartTickPxRng((BigDecimal) obj);
			return;
		}
		else if("tickIncr".equalsIgnoreCase(accessPath)){
			 this.bean.setTickIncr((BigDecimal) obj);
			return;
		}
		else if("tickRuleTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTickRuleTyp((BigInteger) obj);
			return;
		}
		else if("endTickPxRng".equalsIgnoreCase(accessPath)){
			 this.bean.setEndTickPxRng((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TickRulesBlockT obj) {
		this.bean = obj; 
	}

}
