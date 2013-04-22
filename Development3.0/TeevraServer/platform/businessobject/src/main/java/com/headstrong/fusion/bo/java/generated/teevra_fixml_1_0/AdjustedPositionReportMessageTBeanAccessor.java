package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.AdjustedPositionReportMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.SettlSessIDEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class AdjustedPositionReportMessageTBeanAccessor implements BeanAccessor<AdjustedPositionReportMessageT> {
	
	private AdjustedPositionReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("priSetPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPriSetPx();
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptRefID();
		}
		else if("inst".equalsIgnoreCase(accessPath)){
			return this.bean.getInst();
		}
		else if("setPx".equalsIgnoreCase(accessPath)){
			return this.bean.getSetPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setReqTyp((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("priSetPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPriSetPx((BigDecimal) obj);
			return;
		}
		else if("rptRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptRefID((String) obj);
			return;
		}
		else if("setPx".equalsIgnoreCase(accessPath)){
			 this.bean.setSetPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AdjustedPositionReportMessageT obj) {
		this.bean = obj; 
	}

}
