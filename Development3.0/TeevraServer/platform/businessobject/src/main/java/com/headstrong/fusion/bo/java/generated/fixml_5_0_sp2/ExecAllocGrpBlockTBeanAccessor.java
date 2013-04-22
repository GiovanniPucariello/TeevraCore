package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ExecAllocGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:38 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:38 IST 2011")
public class ExecAllocGrpBlockTBeanAccessor implements BeanAccessor<ExecAllocGrpBlockT> {
	
	private ExecAllocGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("lastCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastCpcty();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastParPx();
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID2();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("firmTrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setFirmTrdID((String) obj);
			return;
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdID((String) obj);
			return;
		}
		else if("lastCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastCpcty((String) obj);
			return;
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastParPx((BigDecimal) obj);
			return;
		}
		else if("execID2".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID2((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExecAllocGrpBlockT obj) {
		this.bean = obj; 
	}

}
