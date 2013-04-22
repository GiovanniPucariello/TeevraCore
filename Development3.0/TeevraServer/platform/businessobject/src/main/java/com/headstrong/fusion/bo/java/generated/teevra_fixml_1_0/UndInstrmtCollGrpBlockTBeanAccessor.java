package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UndInstrmtCollGrpBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.UnderlyingInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
