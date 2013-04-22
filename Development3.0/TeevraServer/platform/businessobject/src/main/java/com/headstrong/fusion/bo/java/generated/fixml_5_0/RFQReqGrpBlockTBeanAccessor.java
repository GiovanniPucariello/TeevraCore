package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.RFQReqGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class RFQReqGrpBlockTBeanAccessor implements BeanAccessor<RFQReqGrpBlockT> {
	
	private RFQReqGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTyp();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevClsPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("reqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setReqTyp((Integer) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			this.bean.setSesSub((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((Integer) obj);
			return;
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			this.bean.setPrevClsPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RFQReqGrpBlockT obj) {
		this.bean = obj; 
	}

}
