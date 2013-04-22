package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DiscretionInstructionsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
			 this.bean.setScope((BigInteger) obj);
			return;
		}
		else if("limitTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLimitTyp((BigInteger) obj);
			return;
		}
		else if("dsctnInst".equalsIgnoreCase(accessPath)){
			 this.bean.setDsctnInst((String) obj);
			return;
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMoveTyp((BigInteger) obj);
			return;
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			 this.bean.setRndDir((BigInteger) obj);
			return;
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOfstTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DiscretionInstructionsBlockT obj) {
		this.bean = obj; 
	}

}
