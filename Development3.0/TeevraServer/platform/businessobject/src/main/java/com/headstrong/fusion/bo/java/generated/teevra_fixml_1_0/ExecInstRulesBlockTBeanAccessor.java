package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ExecInstRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
