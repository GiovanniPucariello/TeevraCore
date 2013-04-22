package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.LegOrdGrpBlockT;
import org.fixprotocol.fixml_5_0.PositionEffectEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class LegOrdGrpBlockTBeanAccessor implements BeanAccessor<LegOrdGrpBlockT> {
	
	private LegOrdGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("legOptionRatio".equalsIgnoreCase(accessPath)){
			return this.bean.getLegOptionRatio();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
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
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
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
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("legOptionRatio".equalsIgnoreCase(accessPath)){
			this.bean.setLegOptionRatio((BigDecimal) obj);
			return;
		}
		else if("cover".equalsIgnoreCase(accessPath)){
			this.bean.setCover((Integer) obj);
			return;
		}
		else if("posEfct".equalsIgnoreCase(accessPath)){
			this.bean.setPosEfct(PositionEffectEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			this.bean.setRefID((String) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			this.bean.setOrdQty((BigDecimal) obj);
			return;
		}
		else if("swapTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSwapTyp((Integer) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			this.bean.setQty((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegOrdGrpBlockT obj) {
		this.bean = obj; 
	}

}
