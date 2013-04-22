package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.DiscretionInstructionsBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class DiscretionInstructionsBlockTBeanAccessor implements BeanAccessor<DiscretionInstructionsBlockT> {
	
	private DiscretionInstructionsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ofstValu".equalsIgnoreCase(accessPath)){
			return this.bean.getOfstValu();
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			return this.bean.getScope();
		}
		else if("limitTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLimitTyp();
		}
		else if("dsctnInst".equalsIgnoreCase(accessPath)){
			return this.bean.getDsctnInst();
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMoveTyp();
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			return this.bean.getRndDir();
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOfstTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ofstValu".equalsIgnoreCase(accessPath)){
			this.bean.setOfstValu((BigDecimal) obj);
			return;
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			this.bean.setScope((Integer) obj);
			return;
		}
		else if("limitTyp".equalsIgnoreCase(accessPath)){
			this.bean.setLimitTyp((Integer) obj);
			return;
		}
		else if("dsctnInst".equalsIgnoreCase(accessPath)){
			this.bean.setDsctnInst((String) obj);
			return;
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMoveTyp((Integer) obj);
			return;
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			this.bean.setRndDir((Integer) obj);
			return;
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			this.bean.setOfstTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DiscretionInstructionsBlockT obj) {
		this.bean = obj; 
	}

}
