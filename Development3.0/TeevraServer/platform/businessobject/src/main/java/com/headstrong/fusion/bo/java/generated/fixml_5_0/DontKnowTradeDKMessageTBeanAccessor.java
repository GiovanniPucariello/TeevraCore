package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.DontKnowTradeDKMessageT;
import org.fixprotocol.fixml_5_0.OrderQtyDataBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;
import org.fixprotocol.fixml_5_0.DKReasonEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class DontKnowTradeDKMessageTBeanAccessor implements BeanAccessor<DontKnowTradeDKMessageT> {
	
	private DontKnowTradeDKMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("dkRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getDkRsn();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("lastPx".equalsIgnoreCase(accessPath)){
			return this.bean.getLastPx();
		}
		else if("lastQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLastQty();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
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
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
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
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			this.bean.setSide((String) obj);
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
	public void setTarget(DontKnowTradeDKMessageT obj) {
		this.bean = obj; 
	}

}
