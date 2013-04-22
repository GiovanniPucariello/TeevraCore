package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ListExecuteMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class ListExecuteMessageTBeanAccessor implements BeanAccessor<ListExecuteMessageT> {
	
	private ListExecuteMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("clBidID".equalsIgnoreCase(accessPath)){
			return this.bean.getClBidID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			return this.bean.getBidID();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("clBidID".equalsIgnoreCase(accessPath)){
			 this.bean.setClBidID((String) obj);
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
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			 this.bean.setBidID((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ListExecuteMessageT obj) {
		this.bean = obj; 
	}

}
