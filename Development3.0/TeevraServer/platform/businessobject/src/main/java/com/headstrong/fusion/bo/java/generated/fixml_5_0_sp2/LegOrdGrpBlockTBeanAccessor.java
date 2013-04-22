package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.LegOrdGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.PositionEffectEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentLegBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class LegOrdGrpBlockTBeanAccessor implements BeanAccessor<LegOrdGrpBlockT> {
	
	private LegOrdGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("legAllocID".equalsIgnoreCase(accessPath)){
			return this.bean.getLegAllocID();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("legCurrencyRatio".equalsIgnoreCase(accessPath)){
			return this.bean.getLegCurrencyRatio();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("legExecInst".equalsIgnoreCase(accessPath)){
			return this.bean.getLegExecInst();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("preAll".equalsIgnoreCase(accessPath)){
			return this.bean.getPreAll();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("cover".equalsIgnoreCase(accessPath)){
			return this.bean.getCover();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			return this.bean.getPosEfct();
		}
		else if("legVolatility".equalsIgnoreCase(accessPath)){
			return this.bean.getLegVolatility();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSwapTyp();
		}
		else if("legDividendYield".equalsIgnoreCase(accessPath)){
			return this.bean.getLegDividendYield();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("legAllocID".equalsIgnoreCase(accessPath)){
			 this.bean.setLegAllocID((String) obj);
			return;
		}
		else if("legCurrencyRatio".equalsIgnoreCase(accessPath)){
			 this.bean.setLegCurrencyRatio((BigDecimal) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("legExecInst".equalsIgnoreCase(accessPath)){
			 this.bean.setLegExecInst((String) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			 this.bean.setLeg((InstrumentLegBlockT) obj);
			return;
		}
		else if("cover".equalsIgnoreCase(accessPath)){
			 this.bean.setCover((BigInteger) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("legVolatility".equalsIgnoreCase(accessPath)){
			 this.bean.setLegVolatility((BigDecimal) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((BigDecimal) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSwapTyp((BigInteger) obj);
			return;
		}
		else if("legDividendYield".equalsIgnoreCase(accessPath)){
			 this.bean.setLegDividendYield((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegOrdGrpBlockT obj) {
		this.bean = obj; 
	}

}
