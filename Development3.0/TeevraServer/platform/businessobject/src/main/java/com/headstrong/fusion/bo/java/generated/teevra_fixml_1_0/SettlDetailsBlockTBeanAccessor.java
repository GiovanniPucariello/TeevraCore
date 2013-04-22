package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.SettlDetailsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class SettlDetailsBlockTBeanAccessor implements BeanAccessor<SettlDetailsBlockT> {
	
	private SettlDetailsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("settlSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlSrc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlSrc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlDetailsBlockT obj) {
		this.bean = obj; 
	}

}
