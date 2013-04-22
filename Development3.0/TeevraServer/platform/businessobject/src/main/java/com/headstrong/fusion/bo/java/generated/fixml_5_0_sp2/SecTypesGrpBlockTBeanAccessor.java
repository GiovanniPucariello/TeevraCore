package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecTypesGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class SecTypesGrpBlockTBeanAccessor implements BeanAccessor<SecTypesGrpBlockT> {
	
	private SecTypesGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("subTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubTyp();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("subTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubTyp((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTyp((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			 this.bean.setProd((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecTypesGrpBlockT obj) {
		this.bean = obj; 
	}

}
