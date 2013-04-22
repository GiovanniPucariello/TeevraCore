package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ExecInstRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class ExecInstRulesBlockTBeanAccessor implements BeanAccessor<ExecInstRulesBlockT> {
	
	private ExecInstRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("execInstValu".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInstValu();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("execInstValu".equalsIgnoreCase(accessPath)){
			 this.bean.setExecInstValu((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExecInstRulesBlockT obj) {
		this.bean = obj; 
	}

}
