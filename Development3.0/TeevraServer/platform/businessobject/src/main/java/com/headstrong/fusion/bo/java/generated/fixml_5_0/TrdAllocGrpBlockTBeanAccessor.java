package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TrdAllocGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class TrdAllocGrpBlockTBeanAccessor implements BeanAccessor<TrdAllocGrpBlockT> {
	
	private TrdAllocGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("allocSettlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocSettlCcy();
		}
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			return this.bean.getClrFeeInd();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("meth".equalsIgnoreCase(accessPath)){
			return this.bean.getMeth();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID2();
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getIndAllocID();
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCustCpcty();
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
		else if("clrFeeInd".equalsIgnoreCase(accessPath)){
			this.bean.setClrFeeInd((String) obj);
			return;
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setActIDSrc((Integer) obj);
			return;
		}
		else if("meth".equalsIgnoreCase(accessPath)){
			this.bean.setMeth((Integer) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("indAllocID2".equalsIgnoreCase(accessPath)){
			this.bean.setIndAllocID2((String) obj);
			return;
		}
		else if("indAllocID".equalsIgnoreCase(accessPath)){
			this.bean.setIndAllocID((String) obj);
			return;
		}
		else if("custCpcty".equalsIgnoreCase(accessPath)){
			this.bean.setCustCpcty((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdAllocGrpBlockT obj) {
		this.bean = obj; 
	}

}
