package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TickRulesBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
