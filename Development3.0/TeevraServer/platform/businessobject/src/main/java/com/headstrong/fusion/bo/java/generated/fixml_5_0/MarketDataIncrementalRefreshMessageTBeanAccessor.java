package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.MarketDataIncrementalRefreshMessageT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class MarketDataIncrementalRefreshMessageTBeanAccessor implements BeanAccessor<MarketDataIncrementalRefreshMessageT> {
	
	private MarketDataIncrementalRefreshMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applQuDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuDepth();
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDBkTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("inc".equalsIgnoreCase(accessPath)){
			return this.bean.getInc();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("applQuResolution".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuResolution();
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDFeedTyp();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("applQuDepth".equalsIgnoreCase(accessPath)){
			this.bean.setApplQuDepth((Integer) obj);
			return;
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMDBkTyp((Integer) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
			return;
		}
		else if("applQuResolution".equalsIgnoreCase(accessPath)){
			this.bean.setApplQuResolution((Integer) obj);
			return;
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMDFeedTyp((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDataIncrementalRefreshMessageT obj) {
		this.bean = obj; 
	}

}
