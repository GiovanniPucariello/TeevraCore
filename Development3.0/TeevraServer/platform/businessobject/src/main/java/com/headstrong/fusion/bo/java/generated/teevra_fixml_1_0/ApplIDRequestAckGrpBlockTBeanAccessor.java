package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ApplIDRequestAckGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ApplIDRequestAckGrpBlockTBeanAccessor implements BeanAccessor<ApplIDRequestAckGrpBlockT> {
	
	private ApplIDRequestAckGrpBlockT bean;
	
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
		else if("refApplLastSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplLastSeqNum();
		}
		else if("applRespErr".equalsIgnoreCase(accessPath)){
			return this.bean.getApplRespErr();
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
		else if("refApplLastSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplLastSeqNum((BigInteger) obj);
			return;
		}
		else if("applRespErr".equalsIgnoreCase(accessPath)){
			 this.bean.setApplRespErr((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplIDRequestAckGrpBlockT obj) {
		this.bean = obj; 
	}

}
