package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RFQReqGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.InstrmtLegGrpBlockT;
import org.fixprotocol.fixml_5_0_sp2.UndInstrmtGrpBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
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
		 if("leg".equalsIgnoreCase(accessPath)){
			 this.bean.setLeg((InstrmtLegGrpBlockT) obj);
			return;
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setReqTyp((BigInteger) obj);
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
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UndInstrmtGrpBlockT) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
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
