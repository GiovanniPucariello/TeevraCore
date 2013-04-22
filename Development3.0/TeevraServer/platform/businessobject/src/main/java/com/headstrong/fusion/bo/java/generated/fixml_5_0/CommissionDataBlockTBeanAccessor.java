package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.CommissionDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.FundRenewWaivEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class CommissionDataBlockTBeanAccessor implements BeanAccessor<CommissionDataBlockT> {
	
	private CommissionDataBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("commTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getCommTyp();
		}
		else if("fundRenewWaiv".equalsIgnoreCase(accessPath)){
			return this.bean.getFundRenewWaiv();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("comm".equalsIgnoreCase(accessPath)){
			this.bean.setComm((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("commTyp".equalsIgnoreCase(accessPath)){
			this.bean.setCommTyp((String) obj);
			return;
		}
		else if("fundRenewWaiv".equalsIgnoreCase(accessPath)){
			this.bean.setFundRenewWaiv(FundRenewWaivEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CommissionDataBlockT obj) {
		this.bean = obj; 
	}

}
