package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingLegInstrumentBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class UnderlyingLegInstrumentBlockTBeanAccessor implements BeanAccessor<UnderlyingLegInstrumentBlockT> {
	
	private UnderlyingLegInstrumentBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("desc".equalsIgnoreCase(accessPath)){
			return this.bean.getDesc();
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			return this.bean.getMMY();
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			return this.bean.getSym();
		}
		else if("matDt".equalsIgnoreCase(accessPath)){
			return this.bean.getMatDt();
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			return this.bean.getPutCall();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("strkPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStrkPx();
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			return this.bean.getSfx();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("aID".equalsIgnoreCase(accessPath)){
			return this.bean.getAID();
		}
		else if("secType".equalsIgnoreCase(accessPath)){
			return this.bean.getSecType();
		}
		else if("subType".equalsIgnoreCase(accessPath)){
			return this.bean.getSubType();
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			return this.bean.getMatTm();
		}
		else if("optAt".equalsIgnoreCase(accessPath)){
			return this.bean.getOptAt();
		}
		else if("src".equalsIgnoreCase(accessPath)){
			return this.bean.getSrc();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("desc".equalsIgnoreCase(accessPath)){
			 this.bean.setDesc((String) obj);
			return;
		}
		else if("mMY".equalsIgnoreCase(accessPath)){
			 this.bean.setMMY((String) obj);
			return;
		}
		else if("sym".equalsIgnoreCase(accessPath)){
			 this.bean.setSym((String) obj);
			return;
		}
		else if("matDt".equalsIgnoreCase(accessPath)){
			 this.bean.setMatDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("putCall".equalsIgnoreCase(accessPath)){
			 this.bean.setPutCall((BigInteger) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("strkPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStrkPx((BigDecimal) obj);
			return;
		}
		else if("sfx".equalsIgnoreCase(accessPath)){
			 this.bean.setSfx((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("secType".equalsIgnoreCase(accessPath)){
			 this.bean.setSecType((String) obj);
			return;
		}
		else if("subType".equalsIgnoreCase(accessPath)){
			 this.bean.setSubType((String) obj);
			return;
		}
		else if("matTm".equalsIgnoreCase(accessPath)){
			 this.bean.setMatTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("optAt".equalsIgnoreCase(accessPath)){
			 this.bean.setOptAt((String) obj);
			return;
		}
		else if("src".equalsIgnoreCase(accessPath)){
			 this.bean.setSrc((String) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			 this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UnderlyingLegInstrumentBlockT obj) {
		this.bean = obj; 
	}

}
