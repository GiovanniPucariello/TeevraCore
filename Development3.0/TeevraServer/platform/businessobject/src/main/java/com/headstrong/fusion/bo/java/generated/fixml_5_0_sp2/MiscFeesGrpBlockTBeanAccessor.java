package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MiscFeesGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class MiscFeesGrpBlockTBeanAccessor implements BeanAccessor<MiscFeesGrpBlockT> {
	
	private MiscFeesGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("basis".equalsIgnoreCase(accessPath)){
			return this.bean.getBasis();
		}
		else if("curr".equalsIgnoreCase(accessPath)){
			return this.bean.getCurr();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			 this.bean.setAmt((BigDecimal) obj);
			return;
		}
		else if("basis".equalsIgnoreCase(accessPath)){
			 this.bean.setBasis((BigInteger) obj);
			return;
		}
		else if("curr".equalsIgnoreCase(accessPath)){
			 this.bean.setCurr((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MiscFeesGrpBlockT obj) {
		this.bean = obj; 
	}

}
