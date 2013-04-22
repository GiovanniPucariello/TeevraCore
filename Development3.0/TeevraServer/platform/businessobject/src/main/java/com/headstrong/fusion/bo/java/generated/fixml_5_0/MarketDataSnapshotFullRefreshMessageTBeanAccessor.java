package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.MarketDataSnapshotFullRefreshMessageT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;
import org.fixprotocol.fixml_5_0.CorporateActionEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class MarketDataSnapshotFullRefreshMessageTBeanAccessor implements BeanAccessor<MarketDataSnapshotFullRefreshMessageT> {
	
	private MarketDataSnapshotFullRefreshMessageT bean;
	
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
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("applQuResolution".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuResolution();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDFeedTyp();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("netChgPrevDay".equalsIgnoreCase(accessPath)){
			return this.bean.getNetChgPrevDay();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("full".equalsIgnoreCase(accessPath)){
			return this.bean.getFull();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			return this.bean.getCorpActn();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			return this.bean.getFinclStat();
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
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("mDFeedTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMDFeedTyp((String) obj);
			return;
		}
		else if("netChgPrevDay".equalsIgnoreCase(accessPath)){
			this.bean.setNetChgPrevDay((BigDecimal) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((Integer) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			this.bean.setCorpActn(CorporateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			this.bean.setFinclStat((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDataSnapshotFullRefreshMessageT obj) {
		this.bean = obj; 
	}

}
