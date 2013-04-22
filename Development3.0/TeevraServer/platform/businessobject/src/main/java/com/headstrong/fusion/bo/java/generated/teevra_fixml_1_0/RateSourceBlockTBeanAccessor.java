package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.RateSourceBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class RateSourceBlockTBeanAccessor implements BeanAccessor<RateSourceBlockT> {
	
	private RateSourceBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refPg".equalsIgnoreCase(accessPath)){
			return this.bean.getRefPg();
		}
		else if("rtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSrc();
		}
		else if("rtSrcTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRtSrcTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refPg".equalsIgnoreCase(accessPath)){
			 this.bean.setRefPg((String) obj);
			return;
		}
		else if("rtSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setRtSrc((BigInteger) obj);
			return;
		}
		else if("rtSrcTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRtSrcTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RateSourceBlockT obj) {
		this.bean = obj; 
	}

}
