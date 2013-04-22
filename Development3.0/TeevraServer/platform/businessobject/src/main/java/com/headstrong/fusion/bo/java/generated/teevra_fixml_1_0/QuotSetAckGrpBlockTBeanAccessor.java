package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.QuotSetAckGrpBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.LastFragmentEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.UnderlyingInstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class QuotSetAckGrpBlockTBeanAccessor implements BeanAccessor<QuotSetAckGrpBlockT> {
	
	private QuotSetAckGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("totNoAccQts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoAccQts();
		}
		else if("setID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetID();
		}
		else if("quotEntryAck".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotEntryAck();
		}
		else if("totNoCxldQts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoCxldQts();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoRejQts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoRejQts();
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
		 if("totNoAccQts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoAccQts((BigInteger) obj);
			return;
		}
		else if("setID".equalsIgnoreCase(accessPath)){
			 this.bean.setSetID((String) obj);
			return;
		}
		else if("totNoCxldQts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoCxldQts((BigInteger) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoRejQts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoRejQts((BigInteger) obj);
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
	public void setTarget(QuotSetAckGrpBlockT obj) {
		this.bean = obj; 
	}

}
