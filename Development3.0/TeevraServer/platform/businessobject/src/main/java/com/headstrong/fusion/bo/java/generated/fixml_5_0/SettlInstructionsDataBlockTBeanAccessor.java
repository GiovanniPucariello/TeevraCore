package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SettlInstructionsDataBlockT;
import org.fixprotocol.fixml_5_0.DlvyInstGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class SettlInstructionsDataBlockTBeanAccessor implements BeanAccessor<SettlInstructionsDataBlockT> {
	
	private SettlInstructionsDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("standInstDbName".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbName();
		}
		else if("standInstDbID".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbID();
		}
		else if("dlvryTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getDlvryTyp();
		}
		else if("dlvInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDlvInst();
		}
		else if("standInstDbTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("standInstDbName".equalsIgnoreCase(accessPath)){
			this.bean.setStandInstDbName((String) obj);
			return;
		}
		else if("standInstDbID".equalsIgnoreCase(accessPath)){
			this.bean.setStandInstDbID((String) obj);
			return;
		}
		else if("dlvryTyp".equalsIgnoreCase(accessPath)){
			this.bean.setDlvryTyp((Integer) obj);
			return;
		}
		else if("dlvInst".equalsIgnoreCase(accessPath)){
			this.bean.setDlvInst((DlvyInstGrpBlockT) obj);
			return;
		}
		else if("standInstDbTyp".equalsIgnoreCase(accessPath)){
			this.bean.setStandInstDbTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlInstructionsDataBlockT obj) {
		this.bean = obj; 
	}

}
