package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.QuotEntryGrpBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:39 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:39 IST 2010")
public class QuotEntryGrpBlockTBeanAccessor implements BeanAccessor<QuotEntryGrpBlockT> {
	
	private QuotEntryGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("bidFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getBidFwdPnts();
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrPx();
		}
		else if("ofrSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrSpotRt();
		}
		else if("bidYld".equalsIgnoreCase(accessPath)){
			return this.bean.getBidYld();
		}
		else if("bidSpotRt".equalsIgnoreCase(accessPath)){
			return this.bean.getBidSpotRt();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("midYld".equalsIgnoreCase(accessPath)){
			return this.bean.getMidYld();
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			return this.bean.getValidUntilTm();
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt2();
		}
		else if("ofrFwdPnts".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrFwdPnts();
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			return this.bean.getQty2();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("bidSz".equalsIgnoreCase(accessPath)){
			return this.bean.getBidSz();
		}
		else if("bidFwdPnts2".equalsIgnoreCase(accessPath)){
			return this.bean.getBidFwdPnts2();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("midPx".equalsIgnoreCase(accessPath)){
			return this.bean.getMidPx();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("entryID".equalsIgnoreCase(accessPath)){
			return this.bean.getEntryID();
		}
		else if("ofrFwdPnts2".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrFwdPnts2();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("ofrYld".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrYld();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("bidPx".equalsIgnoreCase(accessPath)){
			return this.bean.getBidPx();
		}
		else if("ofrSz".equalsIgnoreCase(accessPath)){
			return this.bean.getOfrSz();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
			return;
		}
		else if("bidFwdPnts2".equalsIgnoreCase(accessPath)){
			this.bean.setBidFwdPnts2((BigDecimal) obj);
			return;
		}
		else if("bidFwdPnts".equalsIgnoreCase(accessPath)){
			this.bean.setBidFwdPnts((BigDecimal) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("bidSz".equalsIgnoreCase(accessPath)){
			this.bean.setBidSz((BigDecimal) obj);
			return;
		}
		else if("ofrPx".equalsIgnoreCase(accessPath)){
			this.bean.setOfrPx((BigDecimal) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			this.bean.setSesSub((String) obj);
			return;
		}
		else if("midPx".equalsIgnoreCase(accessPath)){
			this.bean.setMidPx((BigDecimal) obj);
			return;
		}
		else if("bidYld".equalsIgnoreCase(accessPath)){
			this.bean.setBidYld((BigDecimal) obj);
			return;
		}
		else if("ofrSpotRt".equalsIgnoreCase(accessPath)){
			this.bean.setOfrSpotRt((BigDecimal) obj);
			return;
		}
		else if("entryID".equalsIgnoreCase(accessPath)){
			this.bean.setEntryID((String) obj);
			return;
		}
		else if("ofrFwdPnts2".equalsIgnoreCase(accessPath)){
			this.bean.setOfrFwdPnts2((BigDecimal) obj);
			return;
		}
		else if("bidSpotRt".equalsIgnoreCase(accessPath)){
			this.bean.setBidSpotRt((BigDecimal) obj);
			return;
		}
		else if("ofrYld".equalsIgnoreCase(accessPath)){
			this.bean.setOfrYld((BigDecimal) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			this.bean.setSettlDt((XMLGregorianCalendar) obj);
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
		else if("bidPx".equalsIgnoreCase(accessPath)){
			this.bean.setBidPx((BigDecimal) obj);
			return;
		}
		else if("midYld".equalsIgnoreCase(accessPath)){
			this.bean.setMidYld((BigDecimal) obj);
			return;
		}
		else if("ofrFwdPnts".equalsIgnoreCase(accessPath)){
			this.bean.setOfrFwdPnts((BigDecimal) obj);
			return;
		}
		else if("settlDt2".equalsIgnoreCase(accessPath)){
			this.bean.setSettlDt2((XMLGregorianCalendar) obj);
			return;
		}
		else if("validUntilTm".equalsIgnoreCase(accessPath)){
			this.bean.setValidUntilTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("qty2".equalsIgnoreCase(accessPath)){
			this.bean.setQty2((BigDecimal) obj);
			return;
		}
		else if("ofrSz".equalsIgnoreCase(accessPath)){
			this.bean.setOfrSz((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(QuotEntryGrpBlockT obj) {
		this.bean = obj; 
	}

}
