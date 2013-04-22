package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.PreAllocGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class PreAllocGrpBlockTBeanAccessor implements BeanAccessor<PreAllocGrpBlockT> {
	
	private PreAllocGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocSettlCcy();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setAllocSettlCcy((String) obj);
			return;
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setActIDSrc((BigInteger) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setIndAllocID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PreAllocGrpBlockT obj) {
		this.bean = obj; 
	}

}
