package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.OrderCancelRejectMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import com.headstrong.teevra_fixml_1_0.WorkingIndicatorEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class OrderCancelRejectMessageTBeanAccessor implements BeanAccessor<OrderCancelRejectMessageT> {
	
	private OrderCancelRejectMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			return this.bean.getID2();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("workingInd".equalsIgnoreCase(accessPath)){
			return this.bean.getWorkingInd();
		}
		else if("cxlRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getCxlRejRsn();
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigOrdModTm();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			return this.bean.getOrignDt();
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			return this.bean.getListID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("lnkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLnkID();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigID();
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctIDSrc();
		}
		else if("cxlRejRspTo".equalsIgnoreCase(accessPath)){
			return this.bean.getCxlRejRspTo();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("iD2".equalsIgnoreCase(accessPath)){
			 this.bean.setID2((String) obj);
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
		else if("workingInd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setWorkingInd(WorkingIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("cxlRejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setCxlRejRsn((String) obj);
			return;
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigOrdModTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			 this.bean.setStat((String) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			 this.bean.setAcct((String) obj);
			return;
		}
		else if("orignDt".equalsIgnoreCase(accessPath)){
			 this.bean.setOrignDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			 this.bean.setListID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("lnkID".equalsIgnoreCase(accessPath)){
			 this.bean.setLnkID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigID((String) obj);
			return;
		}
		else if("acctIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctIDSrc((String) obj);
			return;
		}
		else if("cxlRejRspTo".equalsIgnoreCase(accessPath)){
			 this.bean.setCxlRejRspTo((String) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			 this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(OrderCancelRejectMessageT obj) {
		this.bean = obj; 
	}

}
