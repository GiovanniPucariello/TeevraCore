package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.YieldDataBlockT;
import com.headstrong.teevra_fixml_1_0.YieldTypeEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTyp(YieldTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("redPxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRedPxTyp((BigInteger) obj);
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
