package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TrdRepIndicatorsGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class TrdRepIndicatorsGrpBlockTBeanAccessor implements BeanAccessor<TrdRepIndicatorsGrpBlockT> {
	
	private TrdRepIndicatorsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("trdRepInd".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRepInd();
		}
		else if("ptyRole".equalsIgnoreCase(accessPath)){
			return this.bean.getPtyRole();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("trdRepInd".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdRepInd((String) obj);
			return;
		}
		else if("ptyRole".equalsIgnoreCase(accessPath)){
			 this.bean.setPtyRole((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdRepIndicatorsGrpBlockT obj) {
		this.bean = obj; 
	}

}
