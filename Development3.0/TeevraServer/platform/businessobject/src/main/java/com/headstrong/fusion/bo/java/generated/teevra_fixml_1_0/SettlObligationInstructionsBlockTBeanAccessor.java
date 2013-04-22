package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.SettlObligationInstructionsBlockT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.SettlObligTransTypeEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class SettlObligationInstructionsBlockTBeanAccessor implements BeanAccessor<SettlObligationInstructionsBlockT> {
	
	private SettlObligationInstructionsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("settlTransTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTransTyp();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("settlDetails".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDetails();
		}
		else if("ccyAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getCcyAmt();
		}
		else if("settlRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlRefID();
		}
		else if("settlID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlID();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrFxRt();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			return this.bean.getNetGrossInd();
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCurrAmt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("settlTransTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setSettlTransTyp(SettlObligTransTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEfctvTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCcy((String) obj);
			return;
		}
		else if("ccyAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setCcyAmt((BigDecimal) obj);
			return;
		}
		else if("settlID".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlID((String) obj);
			return;
		}
		else if("settlRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlRefID((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("settlCurrFxRt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrFxRt((BigDecimal) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			 this.bean.setNetGrossInd((BigInteger) obj);
			return;
		}
		else if("settlCurrAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlCurrAmt((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlObligationInstructionsBlockT obj) {
		this.bean = obj; 
	}

}
