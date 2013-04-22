package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.LegQuotGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.LegBenchmarkCurveDataBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.InstrumentLegBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:38 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:38 IST 2011")
public class LegQuotGrpBlockTBeanAccessor implements BeanAccessor<LegQuotGrpBlockT> {
	
	private LegQuotGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrPx();
		}
		else if("legBidFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLegBidFwdPnts();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("bnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getBnchmkCurve();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("legOfrFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getLegOfrFwdPnts();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("bidPx".equalsIgnoreCase(accessPath)){
			return this.bean.getBidPx();
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSwapTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			 this.bean.setOfrPx((BigDecimal) obj);
			return;
		}
		else if("legBidFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLegBidFwdPnts((BigDecimal) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
			return;
		}
		else if("bnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setBnchmkCurve((LegBenchmarkCurveDataBlockT) obj);
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
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		else if("legOfrFwdPnts".equalsIgnoreCase(accessPath)){
			 this.bean.setLegOfrFwdPnts((BigDecimal) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((BigDecimal) obj);
			return;
		}
		else if("bidPx".equalsIgnoreCase(accessPath)){
			 this.bean.setBidPx((BigDecimal) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSwapTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegQuotGrpBlockT obj) {
		this.bean = obj; 
	}

}
