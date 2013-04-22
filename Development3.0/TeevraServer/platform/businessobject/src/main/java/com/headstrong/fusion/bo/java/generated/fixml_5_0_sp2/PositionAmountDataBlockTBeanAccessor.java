package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PositionAmountDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.PosAmtTypeEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class PositionAmountDataBlockTBeanAccessor implements BeanAccessor<PositionAmountDataBlockT> {
	
	private PositionAmountDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("cashTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCashTyp();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("amt".equalsIgnoreCase(accessPath)){
			 this.bean.setAmt((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("cashTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setCashTyp((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTyp(PosAmtTypeEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PositionAmountDataBlockT obj) {
		this.bean = obj; 
	}

}
