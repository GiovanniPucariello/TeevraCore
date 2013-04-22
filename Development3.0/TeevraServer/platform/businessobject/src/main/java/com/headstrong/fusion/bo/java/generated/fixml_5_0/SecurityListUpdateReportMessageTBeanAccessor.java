package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SecurityListUpdateReportMessageT;
import org.fixprotocol.fixml_5_0.SecurityUpdateActionEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.MessageHeaderT;
import org.fixprotocol.fixml_5_0.CorporateActionEnumT;
import org.fixprotocol.fixml_5_0.LastFragmentEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class SecurityListUpdateReportMessageTBeanAccessor implements BeanAccessor<SecurityListUpdateReportMessageT> {
	
	private SecurityListUpdateReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("updActn".equalsIgnoreCase(accessPath)){
			return this.bean.getUpdActn();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRslt();
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			return this.bean.getCorpActn();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("secL".equalsIgnoreCase(accessPath)){
			return this.bean.getSecL();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoReltdSym();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("updActn".equalsIgnoreCase(accessPath)){
			this.bean.setUpdActn(SecurityUpdateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			this.bean.setRspID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((Integer) obj);
			return;
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			this.bean.setReqRslt((Integer) obj);
			return;
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			this.bean.setCorpActn(CorporateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			this.bean.setTotNoReltdSym((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityListUpdateReportMessageT obj) {
		this.bean = obj; 
	}

}
