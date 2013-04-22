package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.NewsMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class NewsMessageTBeanAccessor implements BeanAccessor<NewsMessageT> {
	
	private NewsMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("headline".equalsIgnoreCase(accessPath)){
			return this.bean.getHeadline();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("newsCatgy".equalsIgnoreCase(accessPath)){
			return this.bean.getNewsCatgy();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			return this.bean.getURL();
		}
		else if("rawData".equalsIgnoreCase(accessPath)){
			return this.bean.getRawData();
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigTm();
		}
		else if("langCd".equalsIgnoreCase(accessPath)){
			return this.bean.getLangCd();
		}
		else if("inst".equalsIgnoreCase(accessPath)){
			return this.bean.getInst();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("rtg".equalsIgnoreCase(accessPath)){
			return this.bean.getRtg();
		}
		else if("urgency".equalsIgnoreCase(accessPath)){
			return this.bean.getUrgency();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("refs".equalsIgnoreCase(accessPath)){
			return this.bean.getRefs();
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
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("newsCatgy".equalsIgnoreCase(accessPath)){
			 this.bean.setNewsCatgy((String) obj);
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
		else if("rawData".equalsIgnoreCase(accessPath)){
			 this.bean.setRawData((String) obj);
			return;
		}
		else if("uRL".equalsIgnoreCase(accessPath)){
			 this.bean.setURL((String) obj);
			return;
		}
		else if("origTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("langCd".equalsIgnoreCase(accessPath)){
			 this.bean.setLangCd((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("urgency".equalsIgnoreCase(accessPath)){
			 this.bean.setUrgency((String) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("rawDataLength".equalsIgnoreCase(accessPath)){
			 this.bean.setRawDataLength((BigInteger) obj);
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
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NewsMessageT obj) {
		this.bean = obj; 
	}

}
