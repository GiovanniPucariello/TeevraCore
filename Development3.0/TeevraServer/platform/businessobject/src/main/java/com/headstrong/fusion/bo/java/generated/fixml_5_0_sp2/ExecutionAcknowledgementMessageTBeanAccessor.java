package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.ExecutionAcknowledgementMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.OrderQtyDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.DKReasonEnumT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
public class ExecutionAcknowledgementMessageTBeanAccessor implements BeanAccessor<ExecutionAcknowledgementMessageT> {
	
	private ExecutionAcknowledgementMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("dkRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getDkRsn();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("execAckStat".equalsIgnoreCase(accessPath)){
			return this.bean.getExecAckStat();
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastParPx();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCumQty();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("dkRsn".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setDkRsn(DKReasonEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLastQty((BigDecimal) obj);
			return;
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastPx((BigDecimal) obj);
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
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("execAckStat".equalsIgnoreCase(accessPath)){
			 this.bean.setExecAckStat((String) obj);
			return;
		}
		else if("lastParPx".equalsIgnoreCase(accessPath)){
			 this.bean.setLastParPx((BigDecimal) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			 this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCumQty((BigDecimal) obj);
			return;
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			 this.bean.setExecID((String) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(ExecutionAcknowledgementMessageT obj) {
		this.bean = obj; 
	}

}
