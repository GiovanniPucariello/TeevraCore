package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.UndInstrmtCollGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:47 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:47 IST 2011")
public class UndInstrmtCollGrpBlockTBeanAccessor implements BeanAccessor<UndInstrmtCollGrpBlockT> {
	
	private UndInstrmtCollGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("actn".equalsIgnoreCase(accessPath)){
			return this.bean.getActn();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("actn".equalsIgnoreCase(accessPath)){
			 this.bean.setActn((BigInteger) obj);
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UnderlyingInstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UndInstrmtCollGrpBlockT obj) {
		this.bean = obj; 
	}

}
