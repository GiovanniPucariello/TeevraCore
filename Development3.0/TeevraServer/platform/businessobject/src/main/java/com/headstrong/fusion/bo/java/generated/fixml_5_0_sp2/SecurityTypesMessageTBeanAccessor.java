package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecurityTypesMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class SecurityTypesMessageTBeanAccessor implements BeanAccessor<SecurityTypesMessageT> {
	
	private SecurityTypesMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoSecTyps".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoSecTyps();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("secT".equalsIgnoreCase(accessPath)){
			return this.bean.getSecT();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("rspTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspTyp();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktID".equalsIgnoreCase(accessPath)){
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
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoSecTyps".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoSecTyps((BigInteger) obj);
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
		else if("rspID".equalsIgnoreCase(accessPath)){
			 this.bean.setRspID((String) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("rspTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRspTyp((BigInteger) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSubReqTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityTypesMessageT obj) {
		this.bean = obj; 
	}

}
