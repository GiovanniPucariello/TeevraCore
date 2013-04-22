package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.QuoteStatusRequestMessageT;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class QuoteStatusRequestMessageTBeanAccessor implements BeanAccessor<QuoteStatusRequestMessageT> {
	
	private QuoteStatusRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getStatReqID();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("qID".equalsIgnoreCase(accessPath)){
			this.bean.setQID((String) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			this.bean.setFinDetls((FinancingDetailsBlockT) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("statReqID".equalsIgnoreCase(accessPath)){
			this.bean.setStatReqID((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			this.bean.setSesSub((String) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuoteStatusRequestMessageT obj) {
		this.bean = obj; 
	}

}
