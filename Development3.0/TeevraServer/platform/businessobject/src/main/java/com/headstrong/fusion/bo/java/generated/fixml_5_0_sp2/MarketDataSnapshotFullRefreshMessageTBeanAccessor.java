package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MarketDataSnapshotFullRefreshMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.CorporateActionEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:40 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:40 IST 2011")
public class MarketDataSnapshotFullRefreshMessageTBeanAccessor implements BeanAccessor<MarketDataSnapshotFullRefreshMessageT> {
	
	private MarketDataSnapshotFullRefreshMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applQuDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getApplQuDepth();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDBkTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("mDSubBkTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMDSubBkTyp();
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
		else if("totNumRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumRpts();
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
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			return this.bean.getMktDepth();
		}
		else if("mDStrmID".equalsIgnoreCase(accessPath)){
			return this.bean.getMDStrmID();
		}
		else if("refInd".equalsIgnoreCase(accessPath)){
			return this.bean.getRefInd();
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
			 this.bean.setApplQuDepth((BigInteger) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("mDBkTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDBkTyp((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("mDSubBkTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMDSubBkTyp((BigInteger) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("applQuResolution".equalsIgnoreCase(accessPath)){
			 this.bean.setApplQuResolution((BigInteger) obj);
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
		else if("totNumRpts".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNumRpts((BigInteger) obj);
			return;
		}
		else if("netChgPrevDay".equalsIgnoreCase(accessPath)){
			 this.bean.setNetChgPrevDay((BigDecimal) obj);
			return;
		}
		else if("mktDepth".equalsIgnoreCase(accessPath)){
			 this.bean.setMktDepth((BigInteger) obj);
			return;
		}
		else if("mDStrmID".equalsIgnoreCase(accessPath)){
			 this.bean.setMDStrmID((String) obj);
			return;
		}
		else if("refInd".equalsIgnoreCase(accessPath)){
			 this.bean.setRefInd((String) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((BigInteger) obj);
			return;
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCorpActn(CorporateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
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
