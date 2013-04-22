package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.NewsMessageT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class NewsMessageTBeanAccessor implements BeanAccessor<NewsMessageT> {
	
	private NewsMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("headline".equalsIgnoreCase(accessPath)){
			return this.bean.getHeadline();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			return this.bean.getRawData();
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			return this.bean.getURL();
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTm();
		}
		else if("inst".equalsIgnoreCase(accessPath)){
			return this.bean.getInst();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("urgency".equalsIgnoreCase(accessPath)){
			return this.bean.getUrgency();
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
		else if("encHeadlineLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncHeadlineLen();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("encHeadline".equalsIgnoreCase(accessPath)){
			return this.bean.getEncHeadline();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("headline".equalsIgnoreCase(accessPath)){
			this.bean.setHeadline((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			this.bean.setURL((String) obj);
			return;
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			this.bean.setRawData((String) obj);
			return;
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			this.bean.setRawDataLength((BigInteger) obj);
			return;
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			this.bean.setOrigTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("encHeadlineLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncHeadlineLen((BigInteger) obj);
			return;
		}
		else if("encHeadline".equalsIgnoreCase(accessPath)){
			this.bean.setEncHeadline((String) obj);
			return;
		}
		else if("urgency".equalsIgnoreCase(accessPath)){
			this.bean.setUrgency((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NewsMessageT obj) {
		this.bean = obj; 
	}

}
