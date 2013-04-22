package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MarketDefinitionRequestMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MarketDefinitionRequestMessageTBeanAccessor implements BeanAccessor<MarketDefinitionRequestMessageT> {
	
	private MarketDefinitionRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("mktReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktReqID();
		}
		else if("parentMktSegmID".equalsIgnoreCase(accessPath)){
			return this.bean.getParentMktSegmID();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("mktReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktReqID((String) obj);
			return;
		}
		else if("parentMktSegmID".equalsIgnoreCase(accessPath)){
			 this.bean.setParentMktSegmID((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MarketDefinitionRequestMessageT obj) {
		this.bean = obj; 
	}

}
