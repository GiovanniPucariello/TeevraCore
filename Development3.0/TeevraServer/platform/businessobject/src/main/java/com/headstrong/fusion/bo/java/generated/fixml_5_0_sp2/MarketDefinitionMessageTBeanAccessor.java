package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.MarketDefinitionMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.BaseTradingRulesBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:44 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:44 IST 2011")
public class MarketDefinitionMessageTBeanAccessor implements BeanAccessor<MarketDefinitionMessageT> {
	
	private MarketDefinitionMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("baseTrdgRules".equalsIgnoreCase(accessPath)){
			return this.bean.getBaseTrdgRules();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("execInstRules".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInstRules();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("marketSegmentDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getMarketSegmentDesc();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("mktReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktReqID();
		}
		else if("mktRptID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktRptID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("ordTypRules".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTypRules();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("tmInForceRules".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForceRules();
		}
		else if("encodedMktSegmDescLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncodedMktSegmDescLen();
		}
		else if("parentMktSegmID".equalsIgnoreCase(accessPath)){
			return this.bean.getParentMktSegmID();
		}
		else if("encodedMktSegmDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getEncodedMktSegmDesc();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("baseTrdgRules".equalsIgnoreCase(accessPath)){
			 this.bean.setBaseTrdgRules((BaseTradingRulesBlockT) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
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
		else if("marketSegmentDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setMarketSegmentDesc((String) obj);
			return;
		}
		else if("mktReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktReqID((String) obj);
			return;
		}
		else if("mktRptID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktRptID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("encodedMktSegmDescLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncodedMktSegmDescLen((BigInteger) obj);
			return;
		}
		else if("parentMktSegmID".equalsIgnoreCase(accessPath)){
			 this.bean.setParentMktSegmID((String) obj);
			return;
		}
		else if("encodedMktSegmDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setEncodedMktSegmDesc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDefinitionMessageT obj) {
		this.bean = obj; 
	}

}
