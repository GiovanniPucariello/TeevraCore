package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TrdRepIndicatorsGrpBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
