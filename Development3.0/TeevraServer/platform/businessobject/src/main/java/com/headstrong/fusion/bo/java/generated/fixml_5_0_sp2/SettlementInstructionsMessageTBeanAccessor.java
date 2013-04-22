package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SettlementInstructionsMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class SettlementInstructionsMessageTBeanAccessor implements BeanAccessor<SettlementInstructionsMessageT> {
	
	private SettlementInstructionsMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("settlInstMsgID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstMsgID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("settlInstMode".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstMode();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("settlInstReqRejCode".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstReqRejCode();
		}
		else if("setInst".equalsIgnoreCase(accessPath)){
			return this.bean.getSetInst();
		}
		else if("settlInstReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlInstReqID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlInstMsgID".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstMsgID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("settlInstMode".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstMode((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("settlInstReqRejCode".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstReqRejCode((String) obj);
			return;
		}
		else if("settlInstReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlInstReqID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SettlementInstructionsMessageT obj) {
		this.bean = obj; 
	}

}
