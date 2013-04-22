package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ApplIDRequestGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ApplIDRequestGrpBlockTBeanAccessor implements BeanAccessor<ApplIDRequestGrpBlockT> {
	
	private ApplIDRequestGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applBegSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getApplBegSeqNum();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("applEndSeq".equalsIgnoreCase(accessPath)){
			return this.bean.getApplEndSeq();
		}
		else if("refApplID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applBegSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setApplBegSeqNum((BigInteger) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("applEndSeq".equalsIgnoreCase(accessPath)){
			 this.bean.setApplEndSeq((BigInteger) obj);
			return;
		}
		else if("refApplID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplIDRequestGrpBlockT obj) {
		this.bean = obj; 
	}

}
