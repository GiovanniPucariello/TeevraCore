package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.DerivativeSecurityDefinitionBlockT;
import org.fixprotocol.fixml_5_0_sp2.DerivativeInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
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
