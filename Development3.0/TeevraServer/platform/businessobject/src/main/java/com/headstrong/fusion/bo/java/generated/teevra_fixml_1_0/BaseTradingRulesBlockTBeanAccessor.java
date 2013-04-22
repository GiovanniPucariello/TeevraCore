package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.BaseTradingRulesBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.PriceLimitsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class BaseTradingRulesBlockTBeanAccessor implements BeanAccessor<BaseTradingRulesBlockT> {
	
	private BaseTradingRulesBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("expirationCycle".equalsIgnoreCase(accessPath)){
			return this.bean.getExpirationCycle();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("mxPxVar".equalsIgnoreCase(accessPath)){
			return this.bean.getMxPxVar();
		}
		else if("impldMktInd".equalsIgnoreCase(accessPath)){
			return this.bean.getImpldMktInd();
		}
		else if("lotTypeRules".equalsIgnoreCase(accessPath)){
			return this.bean.getLotTypeRules();
		}
		else if("mlegModel".equalsIgnoreCase(accessPath)){
			return this.bean.getMlegModel();
		}
		else if("trdCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdCcy();
		}
		else if("mlegPxMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getMlegPxMeth();
		}
		else if("maxTrdVol".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxTrdVol();
		}
		else if("rndLot".equalsIgnoreCase(accessPath)){
			return this.bean.getRndLot();
		}
		else if("pxLmts".equalsIgnoreCase(accessPath)){
			return this.bean.getPxLmts();
		}
		else if("tickRules".equalsIgnoreCase(accessPath)){
			return this.bean.getTickRules();
		}
		else if("minTrdVol".equalsIgnoreCase(accessPath)){
			return this.bean.getMinTrdVol();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("maxTrdVol".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxTrdVol((BigDecimal) obj);
			return;
		}
		else if("expirationCycle".equalsIgnoreCase(accessPath)){
			 this.bean.setExpirationCycle((BigInteger) obj);
			return;
		}
		else if("rndLot".equalsIgnoreCase(accessPath)){
			 this.bean.setRndLot((BigDecimal) obj);
			return;
		}
		else if("pxLmts".equalsIgnoreCase(accessPath)){
			 this.bean.setPxLmts((PriceLimitsBlockT) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("impldMktInd".equalsIgnoreCase(accessPath)){
			 this.bean.setImpldMktInd((BigInteger) obj);
			return;
		}
		else if("mxPxVar".equalsIgnoreCase(accessPath)){
			 this.bean.setMxPxVar((BigDecimal) obj);
			return;
		}
		else if("mlegModel".equalsIgnoreCase(accessPath)){
			 this.bean.setMlegModel((BigInteger) obj);
			return;
		}
		else if("mlegPxMeth".equalsIgnoreCase(accessPath)){
			 this.bean.setMlegPxMeth((BigInteger) obj);
			return;
		}
		else if("trdCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdCcy((String) obj);
			return;
		}
		else if("minTrdVol".equalsIgnoreCase(accessPath)){
			 this.bean.setMinTrdVol((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BaseTradingRulesBlockT obj) {
		this.bean = obj; 
	}

}
