package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.DerivativeInstrumentPartySubIDsGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:39 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:39 IST 2011")
public class DerivativeInstrumentPartySubIDsGrpBlockTBeanAccessor implements BeanAccessor<DerivativeInstrumentPartySubIDsGrpBlockT> {
	
	private DerivativeInstrumentPartySubIDsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeInstrumentPartySubIDsGrpBlockT obj) {
		this.bean = obj; 
	}

}
