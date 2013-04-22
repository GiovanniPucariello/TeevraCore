package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MsgTypeGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class MsgTypeGrpBlockTBeanAccessor implements BeanAccessor<MsgTypeGrpBlockT> {
	
	private MsgTypeGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refApplExtID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplExtID();
		}
		else if("refMsgTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRefMsgTyp();
		}
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefCstmApplVerID();
		}
		else if("dfltVerInd".equalsIgnoreCase(accessPath)){
			return this.bean.getDfltVerInd();
		}
		else if("refApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplVerID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refApplExtID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplExtID((BigInteger) obj);
			return;
		}
		else if("refMsgTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRefMsgTyp((String) obj);
			return;
		}
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefCstmApplVerID((String) obj);
			return;
		}
		else if("dfltVerInd".equalsIgnoreCase(accessPath)){
			 this.bean.setDfltVerInd((String) obj);
			return;
		}
		else if("refApplVerID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefApplVerID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MsgTypeGrpBlockT obj) {
		this.bean = obj; 
	}

}
