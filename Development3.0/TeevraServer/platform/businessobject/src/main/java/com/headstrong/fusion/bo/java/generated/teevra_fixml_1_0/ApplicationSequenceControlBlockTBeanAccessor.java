package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ApplicationSequenceControlBlockTBeanAccessor implements BeanAccessor<ApplicationSequenceControlBlockT> {
	
	private ApplicationSequenceControlBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applLastSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getApplLastSeqNum();
		}
		else if("seqNoRef2".equalsIgnoreCase(accessPath)){
			return this.bean.getSeqNoRef2();
		}
		else if("seqNoRef1".equalsIgnoreCase(accessPath)){
			return this.bean.getSeqNoRef1();
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			return this.bean.getApplID();
		}
		else if("applSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqNum();
		}
		else if("applResendFlag".equalsIgnoreCase(accessPath)){
			return this.bean.getApplResendFlag();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applLastSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setApplLastSeqNum((BigInteger) obj);
			return;
		}
		else if("seqNoRef2".equalsIgnoreCase(accessPath)){
			 this.bean.setSeqNoRef2((String) obj);
			return;
		}
		else if("seqNoRef1".equalsIgnoreCase(accessPath)){
			 this.bean.setSeqNoRef1((String) obj);
			return;
		}
		else if("applID".equalsIgnoreCase(accessPath)){
			 this.bean.setApplID((String) obj);
			return;
		}
		else if("applSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqNum((BigInteger) obj);
			return;
		}
		else if("applResendFlag".equalsIgnoreCase(accessPath)){
			 this.bean.setApplResendFlag((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplicationSequenceControlBlockT obj) {
		this.bean = obj; 
	}

}
