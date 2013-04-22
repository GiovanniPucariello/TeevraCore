package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TrdInstrmtLegGrpBlockT;
import com.headstrong.teevra_fixml_1_0.InstrumentLegBlockT;
import com.headstrong.teevra_fixml_1_0.PositionEffectEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TrdInstrmtLegGrpBlockTBeanAccessor implements BeanAccessor<TrdInstrmtLegGrpBlockT> {
	
	private TrdInstrmtLegGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("legGrossTrdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getLegGrossTrdAmt();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("tradeCapLegUndlyGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getTradeCapLegUndlyGrp();
		}
		else if("legCalcCcyLastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLegCalcCcyLastQty();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
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
		else if("legLastFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLegLastFwdPnts();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
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
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSwapTyp();
		}
		else if("legNo".equalsIgnoreCase(accessPath)){
			return this.bean.getLegNo();
		}
		else if("legDividendYield".equalsIgnoreCase(accessPath)){
			return this.bean.getLegDividendYield();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("legGrossTrdAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setLegGrossTrdAmt((BigDecimal) obj);
			return;
		}
		else if("legCalcCcyLastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLegCalcCcyLastQty((BigDecimal) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
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
		else if("legLastFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLegLastFwdPnts((BigDecimal) obj);
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
		else if("legVolatility".equalsIgnoreCase(accessPath)){
			 this.bean.setLegVolatility((BigDecimal) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSwapTyp((BigInteger) obj);
			return;
		}
		else if("legNo".equalsIgnoreCase(accessPath)){
			 this.bean.setLegNo((BigInteger) obj);
			return;
		}
		else if("legDividendYield".equalsIgnoreCase(accessPath)){
			 this.bean.setLegDividendYield((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdInstrmtLegGrpBlockT obj) {
		this.bean = obj; 
	}

}
