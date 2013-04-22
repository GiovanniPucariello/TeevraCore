package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.MsgTypeGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class MsgTypeGrpBlockTBeanAccessor implements BeanAccessor<MsgTypeGrpBlockT> {
	
	private MsgTypeGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refMsgTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRefMsgTyp();
		}
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefCstmApplVerID();
		}
		else if("refApplVerID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefApplVerID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refMsgTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRefMsgTyp((String) obj);
			return;
		}
		else if("refCstmApplVerID".equalsIgnoreCase(accessPath)){
			this.bean.setRefCstmApplVerID((String) obj);
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
