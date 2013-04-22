package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RateSourceBlockT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
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
