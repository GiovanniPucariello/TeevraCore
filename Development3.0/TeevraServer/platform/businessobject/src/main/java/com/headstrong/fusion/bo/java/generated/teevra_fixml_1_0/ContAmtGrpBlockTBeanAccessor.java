package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.ContAmtGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class ContAmtGrpBlockTBeanAccessor implements BeanAccessor<ContAmtGrpBlockT> {
	
	private ContAmtGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("contAmtValu".equalsIgnoreCase(accessPath)){
			return this.bean.getContAmtValu();
		}
		else if("contAmtCurr".equalsIgnoreCase(accessPath)){
			return this.bean.getContAmtCurr();
		}
		else if("contAmtTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getContAmtTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("contAmtValu".equalsIgnoreCase(accessPath)){
			 this.bean.setContAmtValu((BigDecimal) obj);
			return;
		}
		else if("contAmtCurr".equalsIgnoreCase(accessPath)){
			 this.bean.setContAmtCurr((String) obj);
			return;
		}
		else if("contAmtTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setContAmtTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ContAmtGrpBlockT obj) {
		this.bean = obj; 
	}

}
