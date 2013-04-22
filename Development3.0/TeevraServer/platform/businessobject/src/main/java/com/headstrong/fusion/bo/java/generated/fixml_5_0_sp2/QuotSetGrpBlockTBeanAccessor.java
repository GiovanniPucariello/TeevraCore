package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.QuotSetGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingInstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
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
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoQuotEntries".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoQuotEntries((BigInteger) obj);
			return;
		}
		else if("validTil".equalsIgnoreCase(accessPath)){
			 this.bean.setValidTil((XMLGregorianCalendar) obj);
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UnderlyingInstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuotSetGrpBlockT obj) {
		this.bean = obj; 
	}

}
