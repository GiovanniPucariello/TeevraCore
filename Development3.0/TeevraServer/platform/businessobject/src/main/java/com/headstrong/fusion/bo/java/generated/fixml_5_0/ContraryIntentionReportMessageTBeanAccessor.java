package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.ContraryIntentionReportMessageT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class ContraryIntentionReportMessageTBeanAccessor implements BeanAccessor<ContraryIntentionReportMessageT> {
	
	private ContraryIntentionReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("lateInd".equalsIgnoreCase(accessPath)){
			return this.bean.getLateInd();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
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
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			this.bean.setInptSrc((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((String) obj);
			return;
		}
		else if("lateInd".equalsIgnoreCase(accessPath)){
			this.bean.setLateInd((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ContraryIntentionReportMessageT obj) {
		this.bean = obj; 
	}

}
