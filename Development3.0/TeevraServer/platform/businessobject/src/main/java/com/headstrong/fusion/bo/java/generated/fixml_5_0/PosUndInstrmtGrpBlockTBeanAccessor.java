package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.PosUndInstrmtGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:38 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:38 IST 2010")
public class PosUndInstrmtGrpBlockTBeanAccessor implements BeanAccessor<PosUndInstrmtGrpBlockT> {
	
	private PosUndInstrmtGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("undSetPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSetPxTyp();
		}
		else if("undSetPx".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSetPx();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("undlyDlvAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getUndlyDlvAmt();
		}
		else if("undDlvAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getUndDlvAmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("undSetPxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setUndSetPxTyp((Integer) obj);
			return;
		}
		else if("undSetPx".equalsIgnoreCase(accessPath)){
			this.bean.setUndSetPx((BigDecimal) obj);
			return;
		}
		else if("undlyDlvAmt".equalsIgnoreCase(accessPath)){
			this.bean.setUndlyDlvAmt((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PosUndInstrmtGrpBlockT obj) {
		this.bean = obj; 
	}

}
