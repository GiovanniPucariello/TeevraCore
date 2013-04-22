package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.DerivativeSecurityListUpdateReportMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.LastFragmentEnumT;
import com.headstrong.teevra_fixml_1_0.SecurityUpdateActionEnumT;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.DerivativeSecurityDefinitionBlockT;
import com.headstrong.teevra_fixml_1_0.UnderlyingInstrumentBlockT;
import com.headstrong.teevra_fixml_1_0.ApplicationSequenceControlBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class DerivativeSecurityListUpdateReportMessageTBeanAccessor implements BeanAccessor<DerivativeSecurityListUpdateReportMessageT> {
	
	private DerivativeSecurityListUpdateReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			return this.bean.getApplSeqCtrl();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoReltdSym();
		}
		else if("derivSecDef".equalsIgnoreCase(accessPath)){
			return this.bean.getDerivSecDef();
		}
		else if("updActn".equalsIgnoreCase(accessPath)){
			return this.bean.getUpdActn();
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			return this.bean.getRspID();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRslt();
		}
		else if("relSym".equalsIgnoreCase(accessPath)){
			return this.bean.getRelSym();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("updActn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setUpdActn(SecurityUpdateActionEnumT.valueOf(obj.toString()));
			return;
		}
		else if("derivSecDef".equalsIgnoreCase(accessPath)){
			 this.bean.setDerivSecDef((DerivativeSecurityDefinitionBlockT) obj);
			return;
		}
		else if("applSeqCtrl".equalsIgnoreCase(accessPath)){
			 this.bean.setApplSeqCtrl((ApplicationSequenceControlBlockT) obj);
			return;
		}
		else if("rspID".equalsIgnoreCase(accessPath)){
			 this.bean.setRspID((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			 this.bean.setReqRslt((BigInteger) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UnderlyingInstrumentBlockT) obj);
			return;
		}
		else if("totNoReltdSym".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoReltdSym((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DerivativeSecurityListUpdateReportMessageT obj) {
		this.bean = obj; 
	}

}
