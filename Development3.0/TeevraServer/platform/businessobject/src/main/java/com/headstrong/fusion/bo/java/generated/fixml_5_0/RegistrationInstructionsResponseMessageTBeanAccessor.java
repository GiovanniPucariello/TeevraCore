package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.RegistrationInstructionsResponseMessageT;
import org.fixprotocol.fixml_5_0.RegistStatusEnumT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class RegistrationInstructionsResponseMessageTBeanAccessor implements BeanAccessor<RegistrationInstructionsResponseMessageT> {
	
	private RegistrationInstructionsResponseMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dtls".equalsIgnoreCase(accessPath)){
			return this.bean.getDtls();
		}
		else if("regStat".equalsIgnoreCase(accessPath)){
			return this.bean.getRegStat();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("rejRsnCd".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsnCd();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("dtls".equalsIgnoreCase(accessPath)){
			this.bean.setDtls((String) obj);
			return;
		}
		else if("regStat".equalsIgnoreCase(accessPath)){
			this.bean.setRegStat(RegistStatusEnumT.valueOf(obj.toString()));
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("rejRsnCd".equalsIgnoreCase(accessPath)){
			this.bean.setRejRsnCd((String) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			this.bean.setRefID((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID((String) obj);
			return;
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTransTyp((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			this.bean.setID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RegistrationInstructionsResponseMessageT obj) {
		this.bean = obj; 
	}

}
