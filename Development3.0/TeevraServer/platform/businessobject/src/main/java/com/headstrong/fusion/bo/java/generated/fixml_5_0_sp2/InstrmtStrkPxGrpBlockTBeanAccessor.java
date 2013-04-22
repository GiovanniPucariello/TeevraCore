package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.InstrmtStrkPxGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.UndInstrmtGrpBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:42 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:42 IST 2011")
public class InstrmtStrkPxGrpBlockTBeanAccessor implements BeanAccessor<InstrmtStrkPxGrpBlockT> {
	
	private InstrmtStrkPxGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevClsPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
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
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPrevClsPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(InstrmtStrkPxGrpBlockT obj) {
		this.bean = obj; 
	}

}
