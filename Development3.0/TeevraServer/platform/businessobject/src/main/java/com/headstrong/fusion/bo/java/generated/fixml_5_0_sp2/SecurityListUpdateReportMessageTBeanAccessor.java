package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.SecurityListUpdateReportMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.ApplicationSequenceControlBlockT;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.SecurityUpdateActionEnumT;
import org.fixprotocol.fixml_5_0_sp2.CorporateActionEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:50 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:50 IST 2011")
public class SecurityListUpdateReportMessageTBeanAccessor implements BeanAccessor<SecurityListUpdateReportMessageT> {
	
	private SecurityListUpdateReportMessageT bean;
	
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
		else if("listTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getListTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("listDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getListDesc();
		}
		else if("secL".equalsIgnoreCase(accessPath)){
			return this.bean.getSecL();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoReltdSym();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("updActn".equalsIgnoreCase(accessPath)){
			return this.bean.getUpdActn();
		}
		else if("listRefID".equalsIgnoreCase(accessPath)){
			return this.bean.getListRefID();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			return this.bean.getListID();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRslt();
		}
		else if("corpActn".equalsIgnoreCase(accessPath)){
			return this.bean.getCorpActn();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("lstTypSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getLstTypSrc();
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
		else if("listTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setListTyp((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("listDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setListDesc((String) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoReltdSym((BigInteger) obj);
			return;
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("updActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUpdActn(SecurityUpdateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("listRefID".equalsIgnoreCase(accessPath)){
			 this.bean.setListRefID((String) obj);
			return;
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			 this.bean.setRspID((String) obj);
			return;
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			 this.bean.setListID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			 this.bean.setRptID((BigInteger) obj);
			return;
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			 this.bean.setReqRslt((BigInteger) obj);
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
		else if("lstTypSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setLstTypSrc((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(SecurityListUpdateReportMessageT obj) {
		this.bean = obj; 
	}

}
