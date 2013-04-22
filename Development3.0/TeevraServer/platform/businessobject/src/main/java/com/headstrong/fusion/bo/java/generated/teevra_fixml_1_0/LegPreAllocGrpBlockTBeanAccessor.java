package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.LegPreAllocGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class LegPreAllocGrpBlockTBeanAccessor implements BeanAccessor<LegPreAllocGrpBlockT> {
	
	private LegPreAllocGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("allocAcct".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocAcct();
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocSettlCcy();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("allocQty".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocQty();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		else if("allocAcctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocAcctIDSrc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("allocAcct".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocAcct((String) obj);
			return;
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocSettlCcy((String) obj);
			return;
		}
		else if("allocQty".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocQty((BigDecimal) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("allocAcctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocAcctIDSrc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegPreAllocGrpBlockT obj) {
		this.bean = obj; 
	}

}
