package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.SettlInstGrpBlockT;
import org.fixprotocol.fixml_5_0.SettlInstTransTypeEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SecurityTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:36 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:36 IST 2010")
public class SettlInstGrpBlockTBeanAccessor implements BeanAccessor<SettlInstGrpBlockT> {
	
	private SettlInstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cardStartDt".equalsIgnoreCase(accessPath)){
			return this.bean.getCardStartDt();
		}
		else if("cardHolderName".equalsIgnoreCase(accessPath)){
			return this.bean.getCardHolderName();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("cardIssNum".equalsIgnoreCase(accessPath)){
			return this.bean.getCardIssNum();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("settlCcy".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlCcy();
		}
		else if("pmtMethod".equalsIgnoreCase(accessPath)){
			return this.bean.getPmtMethod();
		}
		else if("cardExpDt".equalsIgnoreCase(accessPath)){
			return this.bean.getCardExpDt();
		}
		else if("settlInstTransTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstTransTyp();
		}
		else if("pmtRef".equalsIgnoreCase(accessPath)){
			return this.bean.getPmtRef();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("setInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getSetInstr();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("settlInstRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstRefID();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("pmtRemtrID".equalsIgnoreCase(accessPath)){
			return this.bean.getPmtRemtrID();
		}
		else if("pmtDt".equalsIgnoreCase(accessPath)){
			return this.bean.getPmtDt();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("settlInstID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstID();
		}
		else if("cardNum".equalsIgnoreCase(accessPath)){
			return this.bean.getCardNum();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cardStartDt".equalsIgnoreCase(accessPath)){
			this.bean.setCardStartDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("cardHolderName".equalsIgnoreCase(accessPath)){
			this.bean.setCardHolderName((String) obj);
			return;
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			this.bean.setEfctvTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("cardIssNum".equalsIgnoreCase(accessPath)){
			this.bean.setCardIssNum((String) obj);
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
		else if("pmtMethod".equalsIgnoreCase(accessPath)){
			this.bean.setPmtMethod((String) obj);
			return;
		}
		else if("cardExpDt".equalsIgnoreCase(accessPath)){
			this.bean.setCardExpDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("settlInstTransTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSettlInstTransTyp(SettlInstTransTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			this.bean.setLastUpdateTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("pmtRef".equalsIgnoreCase(accessPath)){
			this.bean.setPmtRef((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			this.bean.setCFI((String) obj);
			return;
		}
		else if("settlInstRefID".equalsIgnoreCase(accessPath)){
			this.bean.setSettlInstRefID((String) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			this.bean.setSide((String) obj);
			return;
		}
		else if("pmtRemtrID".equalsIgnoreCase(accessPath)){
			this.bean.setPmtRemtrID((String) obj);
			return;
		}
		else if("pmtDt".equalsIgnoreCase(accessPath)){
			this.bean.setPmtDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSecTyp(SecurityTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("settlInstID".equalsIgnoreCase(accessPath)){
			this.bean.setSettlInstID((String) obj);
			return;
		}
		else if("cardNum".equalsIgnoreCase(accessPath)){
			this.bean.setCardNum((String) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			this.bean.setProd((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlInstGrpBlockT obj) {
		this.bean = obj; 
	}

}
