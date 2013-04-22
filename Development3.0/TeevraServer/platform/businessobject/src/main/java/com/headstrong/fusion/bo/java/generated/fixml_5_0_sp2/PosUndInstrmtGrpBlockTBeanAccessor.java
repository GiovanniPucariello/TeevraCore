package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PosUndInstrmtGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingInstrumentBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
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
			 this.bean.setUndSetPxTyp((BigInteger) obj);
			return;
		}
		else if("undSetPx".equalsIgnoreCase(accessPath)){
			 this.bean.setUndSetPx((BigDecimal) obj);
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UnderlyingInstrumentBlockT) obj);
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
