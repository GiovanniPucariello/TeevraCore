package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.EmailMessageT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class EmailMessageTBeanAccessor implements BeanAccessor<EmailMessageT> {
	
	private EmailMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("emailTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getEmailTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			return this.bean.getRawData();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("subject".equalsIgnoreCase(accessPath)){
			return this.bean.getSubject();
		}
		else if("encSubject".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSubject();
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTm();
		}
		else if("encSubjectLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncSubjectLen();
		}
		else if("emailThreadID".equalsIgnoreCase(accessPath)){
			return this.bean.getEmailThreadID();
		}
		else if("inst".equalsIgnoreCase(accessPath)){
			return this.bean.getInst();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			return this.bean.getRawDataLength();
		}
		else if("txtLn".equalsIgnoreCase(accessPath)){
			return this.bean.getTxtLn();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			this.bean.setOrdID((String) obj);
			return;
		}
		else if("emailTyp".equalsIgnoreCase(accessPath)){
			this.bean.setEmailTyp((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			this.bean.setRawData((String) obj);
			return;
		}
		else if("subject".equalsIgnoreCase(accessPath)){
			this.bean.setSubject((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID((String) obj);
			return;
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			this.bean.setRawDataLength((BigInteger) obj);
			return;
		}
		else if("encSubject".equalsIgnoreCase(accessPath)){
			this.bean.setEncSubject((String) obj);
			return;
		}
		else if("encSubjectLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncSubjectLen((BigInteger) obj);
			return;
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			this.bean.setOrigTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("emailThreadID".equalsIgnoreCase(accessPath)){
			this.bean.setEmailThreadID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(EmailMessageT obj) {
		this.bean = obj; 
	}

}
