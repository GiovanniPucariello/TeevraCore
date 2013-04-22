package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.ContAmtGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:42 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:42 IST 2010")
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
			this.bean.setContAmtTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ContAmtGrpBlockT obj) {
		this.bean = obj; 
	}

}
