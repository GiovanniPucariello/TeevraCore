package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.QuotSetGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.LastFragmentEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class QuotSetGrpBlockTBeanAccessor implements BeanAccessor<QuotSetGrpBlockT> {
	
	private QuotSetGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("quotEntry".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotEntry();
		}
		else if("setID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetID();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoQuotEntries".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoQuotEntries();
		}
		else if("validTil".equalsIgnoreCase(accessPath)){
			return this.bean.getValidTil();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("setID".equalsIgnoreCase(accessPath)){
			this.bean.setSetID((String) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoQuotEntries".equalsIgnoreCase(accessPath)){
			this.bean.setTotNoQuotEntries((Integer) obj);
			return;
		}
		else if("validTil".equalsIgnoreCase(accessPath)){
			this.bean.setValidTil((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuotSetGrpBlockT obj) {
		this.bean = obj; 
	}

}
