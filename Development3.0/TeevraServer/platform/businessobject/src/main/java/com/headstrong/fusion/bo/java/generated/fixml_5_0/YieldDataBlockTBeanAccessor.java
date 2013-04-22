package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.YieldDataBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.YieldTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class YieldDataBlockTBeanAccessor implements BeanAccessor<YieldDataBlockT> {
	
	private YieldDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("yld".equalsIgnoreCase(accessPath)){
			return this.bean.getYld();
		}
		else if("calcDt".equalsIgnoreCase(accessPath)){
			return this.bean.getCalcDt();
		}
		else if("redDt".equalsIgnoreCase(accessPath)){
			return this.bean.getRedDt();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("redPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRedPxTyp();
		}
		else if("redPx".equalsIgnoreCase(accessPath)){
			return this.bean.getRedPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("yld".equalsIgnoreCase(accessPath)){
			this.bean.setYld((BigDecimal) obj);
			return;
		}
		else if("calcDt".equalsIgnoreCase(accessPath)){
			this.bean.setCalcDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("redDt".equalsIgnoreCase(accessPath)){
			this.bean.setRedDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp(YieldTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("redPxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRedPxTyp((Integer) obj);
			return;
		}
		else if("redPx".equalsIgnoreCase(accessPath)){
			this.bean.setRedPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(YieldDataBlockT obj) {
		this.bean = obj; 
	}

}
