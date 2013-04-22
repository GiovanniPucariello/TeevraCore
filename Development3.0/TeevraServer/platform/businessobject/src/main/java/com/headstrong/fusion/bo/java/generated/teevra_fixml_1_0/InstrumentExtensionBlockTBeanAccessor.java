package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.InstrumentExtensionBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class InstrumentExtensionBlockTBeanAccessor implements BeanAccessor<InstrumentExtensionBlockT> {
	
	private InstrumentExtensionBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dlvryForm".equalsIgnoreCase(accessPath)){
			return this.bean.getDlvryForm();
		}
		else if("attrb".equalsIgnoreCase(accessPath)){
			return this.bean.getAttrb();
		}
		else if("pctAtRisk".equalsIgnoreCase(accessPath)){
			return this.bean.getPctAtRisk();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("dlvryForm".equalsIgnoreCase(accessPath)){
			 this.bean.setDlvryForm((BigInteger) obj);
			return;
		}
		else if("pctAtRisk".equalsIgnoreCase(accessPath)){
			 this.bean.setPctAtRisk((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrumentExtensionBlockT obj) {
		this.bean = obj; 
	}

}
