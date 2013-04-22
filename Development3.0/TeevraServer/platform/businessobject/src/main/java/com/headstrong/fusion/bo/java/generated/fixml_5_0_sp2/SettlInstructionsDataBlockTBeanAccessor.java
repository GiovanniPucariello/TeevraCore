package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SettlInstructionsDataBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
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
			 this.bean.setDlvryTyp((BigInteger) obj);
			return;
		}
		else if("standInstDbTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setStandInstDbTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlInstructionsDataBlockT obj) {
		this.bean = obj; 
	}

}
