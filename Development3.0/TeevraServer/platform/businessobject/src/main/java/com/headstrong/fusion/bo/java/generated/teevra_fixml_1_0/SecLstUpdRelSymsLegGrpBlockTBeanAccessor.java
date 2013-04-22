package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.SecLstUpdRelSymsLegGrpBlockT;
import com.headstrong.teevra_fixml_1_0.InstrumentLegBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.LegBenchmarkCurveDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class SecLstUpdRelSymsLegGrpBlockTBeanAccessor implements BeanAccessor<SecLstUpdRelSymsLegGrpBlockT> {
	
	private SecLstUpdRelSymsLegGrpBlockT bean;
	
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
		else if("leg".equalsIgnoreCase(accessPath)){
			 this.bean.setLeg((InstrumentLegBlockT) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSwapTyp((BigInteger) obj);
			return;
		}
		else if("bnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setBnchmkCurve((LegBenchmarkCurveDataBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecLstUpdRelSymsLegGrpBlockT obj) {
		this.bean = obj; 
	}

}
