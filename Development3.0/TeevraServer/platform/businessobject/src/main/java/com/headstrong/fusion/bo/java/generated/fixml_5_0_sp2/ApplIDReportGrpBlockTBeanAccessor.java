package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ApplIDReportGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:47 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:47 IST 2011")
public class ApplIDReportGrpBlockTBeanAccessor implements BeanAccessor<ApplIDReportGrpBlockT> {
	
	private ApplIDReportGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applNewSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getApplNewSeqNum();
		}
		else if("refApplID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplID();
		}
		else if("refApplLastSeqNum".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplLastSeqNum();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applNewSeqNum".equalsIgnoreCase(accessPath)){
			 this.bean.setApplNewSeqNum((BigInteger) obj);
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
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ApplIDReportGrpBlockT obj) {
		this.bean = obj; 
	}

}
