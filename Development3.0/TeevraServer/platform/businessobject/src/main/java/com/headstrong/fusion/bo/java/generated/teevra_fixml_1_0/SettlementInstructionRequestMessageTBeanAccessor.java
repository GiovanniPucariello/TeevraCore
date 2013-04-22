package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.SettlementInstructionRequestMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class SettlementInstructionRequestMessageTBeanAccessor implements BeanAccessor<SettlementInstructionRequestMessageT> {
	
	private SettlementInstructionRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
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
		else if("settlInstReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstReqID();
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			return this.bean.getLastUpdateTm();
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			return this.bean.getCFI();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getActIDSrc();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("standInstDbName".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbName();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("standInstDbID".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbID();
		}
		else if("standInstDbTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getStandInstDbTyp();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
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
		else if("settlInstReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstReqID((String) obj);
			return;
		}
		else if("lastUpdateTm".equalsIgnoreCase(accessPath)){
			 this.bean.setLastUpdateTm((String) obj);
			return;
		}
		else if("cFI".equalsIgnoreCase(accessPath)){
			 this.bean.setCFI((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("actIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setActIDSrc((BigInteger) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("standInstDbName".equalsIgnoreCase(accessPath)){
			 this.bean.setStandInstDbName((String) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSecTyp((String) obj);
			return;
		}
		else if("standInstDbID".equalsIgnoreCase(accessPath)){
			 this.bean.setStandInstDbID((String) obj);
			return;
		}
		else if("standInstDbTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setStandInstDbTyp((BigInteger) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			 this.bean.setProd((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlementInstructionRequestMessageT obj) {
		this.bean = obj; 
	}

}
