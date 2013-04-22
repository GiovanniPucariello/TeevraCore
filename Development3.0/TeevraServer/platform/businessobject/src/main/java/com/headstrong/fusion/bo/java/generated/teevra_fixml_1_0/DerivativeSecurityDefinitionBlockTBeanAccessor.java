package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DerivativeSecurityDefinitionBlockT;
import com.headstrong.teevra_fixml_1_0.DerivativeInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class DerivativeSecurityDefinitionBlockTBeanAccessor implements BeanAccessor<DerivativeSecurityDefinitionBlockT> {
	
	private DerivativeSecurityDefinitionBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("derivInstrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getDerivInstrmt();
		}
		else if("attrb".equalsIgnoreCase(accessPath)){
			return this.bean.getAttrb();
		}
		else if("mktSegGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegGrp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("derivInstrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setDerivInstrmt((DerivativeInstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeSecurityDefinitionBlockT obj) {
		this.bean = obj; 
	}

}
