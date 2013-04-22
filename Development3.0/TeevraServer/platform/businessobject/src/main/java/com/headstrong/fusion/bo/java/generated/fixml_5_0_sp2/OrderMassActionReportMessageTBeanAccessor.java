package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.OrderMassActionReportMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.UnderlyingInstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:41 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:41 IST 2011")
public class OrderMassActionReportMessageTBeanAccessor implements BeanAccessor<OrderMassActionReportMessageT> {
	
	private OrderMassActionReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("affectOrd".equalsIgnoreCase(accessPath)){
			return this.bean.getAffectOrd();
		}
		else if("massActionType".equalsIgnoreCase(accessPath)){
			return this.bean.getMassActionType();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("massActionResponse".equalsIgnoreCase(accessPath)){
			return this.bean.getMassActionResponse();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktSegID();
		}
		else if("massActionReportID".equalsIgnoreCase(accessPath)){
			return this.bean.getMassActionReportID();
		}
		else if("totAffctdOrds".equalsIgnoreCase(accessPath)){
			return this.bean.getTotAffctdOrds();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("mktID".equalsIgnoreCase(accessPath)){
			return this.bean.getMktID();
		}
		else if("tgtPty".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtPty();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
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
		else if("massActionRejectReason".equalsIgnoreCase(accessPath)){
			return this.bean.getMassActionRejectReason();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("massActionScope".equalsIgnoreCase(accessPath)){
			return this.bean.getMassActionScope();
		}
		else if("notAffectedOrdersGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getNotAffectedOrdersGrp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mktID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktID((String) obj);
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
		else if("massActionType".equalsIgnoreCase(accessPath)){
			 this.bean.setMassActionType((BigInteger) obj);
			return;
		}
		else if("massActionResponse".equalsIgnoreCase(accessPath)){
			 this.bean.setMassActionResponse((BigInteger) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("massActionRejectReason".equalsIgnoreCase(accessPath)){
			 this.bean.setMassActionRejectReason((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
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
		else if("mktSegID".equalsIgnoreCase(accessPath)){
			 this.bean.setMktSegID((String) obj);
			return;
		}
		else if("massActionReportID".equalsIgnoreCase(accessPath)){
			 this.bean.setMassActionReportID((String) obj);
			return;
		}
		else if("totAffctdOrds".equalsIgnoreCase(accessPath)){
			 this.bean.setTotAffctdOrds((BigInteger) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			 this.bean.setUndly((UnderlyingInstrumentBlockT) obj);
			return;
		}
		else if("massActionScope".equalsIgnoreCase(accessPath)){
			 this.bean.setMassActionScope((String) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(OrderMassActionReportMessageT obj) {
		this.bean = obj; 
	}

}
