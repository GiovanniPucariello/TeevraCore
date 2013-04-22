package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.FinancingDetailsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class FinancingDetailsBlockTBeanAccessor implements BeanAccessor<FinancingDetailsBlockT> {
	
	private FinancingDetailsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("agmtID".equalsIgnoreCase(accessPath)){
			return this.bean.getAgmtID();
		}
		else if("agmtDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getAgmtDesc();
		}
		else if("endDt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndDt();
		}
		else if("startDt".equalsIgnoreCase(accessPath)){
			return this.bean.getStartDt();
		}
		else if("trmTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrmTyp();
		}
		else if("mgnRatio".equalsIgnoreCase(accessPath)){
			return this.bean.getMgnRatio();
		}
		else if("agmtDt".equalsIgnoreCase(accessPath)){
			return this.bean.getAgmtDt();
		}
		else if("dlvryTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getDlvryTyp();
		}
		else if("agmtCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getAgmtCcy();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("agmtID".equalsIgnoreCase(accessPath)){
			this.bean.setAgmtID((String) obj);
			return;
		}
		else if("agmtDesc".equalsIgnoreCase(accessPath)){
			this.bean.setAgmtDesc((String) obj);
			return;
		}
		else if("endDt".equalsIgnoreCase(accessPath)){
			this.bean.setEndDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("startDt".equalsIgnoreCase(accessPath)){
			this.bean.setStartDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("trmTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTrmTyp((Integer) obj);
			return;
		}
		else if("mgnRatio".equalsIgnoreCase(accessPath)){
			this.bean.setMgnRatio((BigDecimal) obj);
			return;
		}
		else if("agmtDt".equalsIgnoreCase(accessPath)){
			this.bean.setAgmtDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("dlvryTyp".equalsIgnoreCase(accessPath)){
			this.bean.setDlvryTyp((Integer) obj);
			return;
		}
		else if("agmtCcy".equalsIgnoreCase(accessPath)){
			this.bean.setAgmtCcy((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(FinancingDetailsBlockT obj) {
		this.bean = obj; 
	}

}
