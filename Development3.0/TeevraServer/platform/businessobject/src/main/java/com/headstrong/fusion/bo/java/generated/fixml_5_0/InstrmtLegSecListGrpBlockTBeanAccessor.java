package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.InstrmtLegSecListGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class InstrmtLegSecListGrpBlockTBeanAccessor implements BeanAccessor<InstrmtLegSecListGrpBlockT> {
	
	private InstrmtLegSecListGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSwapTyp();
		}
		else if("bnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getBnchmkCurve();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSwapTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrmtLegSecListGrpBlockT obj) {
		this.bean = obj; 
	}

}
