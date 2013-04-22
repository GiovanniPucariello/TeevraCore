package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.InstrumentExtensionBlockT;
import org.fixprotocol.fixml_5_0.AttrbGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
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
			this.bean.setDlvryForm((Integer) obj);
			return;
		}
		else if("attrb".equalsIgnoreCase(accessPath)){
			this.bean.setAttrb((AttrbGrpBlockT) obj);
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
