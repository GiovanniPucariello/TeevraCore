package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SideCrossOrdCxlGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.OrderQtyDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:45 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:45 IST 2011")
public class SideCrossOrdCxlGrpBlockTBeanAccessor implements BeanAccessor<SideCrossOrdCxlGrpBlockT> {
	
	private SideCrossOrdCxlGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdLinkID();
		}
		else if("origClOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigClOrdID();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigOrdModTm();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignDt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("clOrdLinkID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdLinkID((String) obj);
			return;
		}
		else if("origClOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigClOrdID((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigOrdModTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			 this.bean.setComplianceID((String) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SideCrossOrdCxlGrpBlockT obj) {
		this.bean = obj; 
	}

}
