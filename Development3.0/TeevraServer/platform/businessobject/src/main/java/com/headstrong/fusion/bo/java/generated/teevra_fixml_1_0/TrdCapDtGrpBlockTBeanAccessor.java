package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.TrdCapDtGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class TrdCapDtGrpBlockTBeanAccessor implements BeanAccessor<TrdCapDtGrpBlockT> {
	
	private TrdCapDtGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdCapDtGrpBlockT obj) {
		this.bean = obj; 
	}

}
