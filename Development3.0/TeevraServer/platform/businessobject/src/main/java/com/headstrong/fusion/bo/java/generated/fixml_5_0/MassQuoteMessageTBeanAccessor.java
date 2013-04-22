package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.MassQuoteMessageT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:35 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:35 IST 2010")
public class MassQuoteMessageTBeanAccessor implements BeanAccessor<MassQuoteMessageT> {
	
	private MassQuoteMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("quotSet".equalsIgnoreCase(accessPath)){
			return this.bean.getQuotSet();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("defBidSz".equalsIgnoreCase(accessPath)){
			return this.bean.getDefBidSz();
		}
		else if("rspLvl".equalsIgnoreCase(accessPath)){
			return this.bean.getRspLvl();
		}
		else if("defOfrSz".equalsIgnoreCase(accessPath)){
			return this.bean.getDefOfrSz();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("qID".equalsIgnoreCase(accessPath)){
			this.bean.setQID((String) obj);
			return;
		}
		else if("defBidSz".equalsIgnoreCase(accessPath)){
			this.bean.setDefBidSz((BigDecimal) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("rspLvl".equalsIgnoreCase(accessPath)){
			this.bean.setRspLvl((Integer) obj);
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
		else if("defOfrSz".equalsIgnoreCase(accessPath)){
			this.bean.setDefOfrSz((BigDecimal) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((Integer) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MassQuoteMessageT obj) {
		this.bean = obj; 
	}

}
