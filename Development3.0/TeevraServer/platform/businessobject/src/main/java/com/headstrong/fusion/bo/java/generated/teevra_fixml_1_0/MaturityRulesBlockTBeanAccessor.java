package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MaturityRulesBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MaturityRulesBlockTBeanAccessor implements BeanAccessor<MaturityRulesBlockT> {
	
	private MaturityRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("startMMY".equalsIgnoreCase(accessPath)){
			return this.bean.getStartMMY();
		}
		else if("endMMY".equalsIgnoreCase(accessPath)){
			return this.bean.getEndMMY();
		}
		else if("mMYIncr".equalsIgnoreCase(accessPath)){
			return this.bean.getMMYIncr();
		}
		else if("matRuleID".equalsIgnoreCase(accessPath)){
			return this.bean.getMatRuleID();
		}
		else if("mMYFmt".equalsIgnoreCase(accessPath)){
			return this.bean.getMMYFmt();
		}
		else if("mMYIncrUnits".equalsIgnoreCase(accessPath)){
			return this.bean.getMMYIncrUnits();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("startMMY".equalsIgnoreCase(accessPath)){
			 this.bean.setStartMMY((String) obj);
			return;
		}
		else if("endMMY".equalsIgnoreCase(accessPath)){
			 this.bean.setEndMMY((String) obj);
			return;
		}
		else if("mMYIncr".equalsIgnoreCase(accessPath)){
			 this.bean.setMMYIncr((BigInteger) obj);
			return;
		}
		else if("matRuleID".equalsIgnoreCase(accessPath)){
			 this.bean.setMatRuleID((String) obj);
			return;
		}
		else if("mMYFmt".equalsIgnoreCase(accessPath)){
			 this.bean.setMMYFmt((BigInteger) obj);
			return;
		}
		else if("mMYIncrUnits".equalsIgnoreCase(accessPath)){
			 this.bean.setMMYIncrUnits((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MaturityRulesBlockT obj) {
		this.bean = obj; 
	}

}
