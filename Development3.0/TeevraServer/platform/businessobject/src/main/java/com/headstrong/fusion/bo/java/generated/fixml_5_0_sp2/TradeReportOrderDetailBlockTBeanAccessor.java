package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.TradeReportOrderDetailBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.DisplayInstructionBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.OrderCapacityEnumT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.OrderQtyDataBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class TradeReportOrderDetailBlockTBeanAccessor implements BeanAccessor<TradeReportOrderDetailBlockT> {
	
	private TradeReportOrderDetailBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getCpcty();
		}
		else if("refOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefOrdID();
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDsplyInstr();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLotTyp();
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigOrdModTm();
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForce();
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			return this.bean.getListID();
		}
		else if("refOrdIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getRefOrdIDSrc();
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCumQty();
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdQty();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdStat();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("origCustOrdCpcty".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigCustOrdCpcty();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			return this.bean.getRstctions();
		}
		else if("ordInptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdInptDev();
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBkngTyp();
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStopPx();
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTransBkdTm();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLeavesQty();
		}
		else if("refOrdIDRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRefOrdIDRsn();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("cpcty".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCpcty(OrderCapacityEnumT.valueOf(obj.toString()));
			return;
		}
		else if("refOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefOrdID((String) obj);
			return;
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDsplyInstr((DisplayInstructionBlockT) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("lotTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLotTyp((String) obj);
			return;
		}
		else if("origOrdModTm".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigOrdModTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			 this.bean.setTmInForce((String) obj);
			return;
		}
		else if("listID".equalsIgnoreCase(accessPath)){
			 this.bean.setListID((String) obj);
			return;
		}
		else if("refOrdIDSrc".equalsIgnoreCase(accessPath)){
			 this.bean.setRefOrdIDSrc((String) obj);
			return;
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			 this.bean.setCumQty((BigDecimal) obj);
			return;
		}
		else if("ordQty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdQty((OrderQtyDataBlockT) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdStat((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			 this.bean.setExecInst((String) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
			return;
		}
		else if("origCustOrdCpcty".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigCustOrdCpcty((BigInteger) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("rstctions".equalsIgnoreCase(accessPath)){
			 this.bean.setRstctions((String) obj);
			return;
		}
		else if("ordInptDev".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdInptDev((String) obj);
			return;
		}
		else if("bkngTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBkngTyp((BigInteger) obj);
			return;
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStopPx((BigDecimal) obj);
			return;
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTransBkdTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			 this.bean.setLeavesQty((BigDecimal) obj);
			return;
		}
		else if("refOrdIDRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setRefOrdIDRsn((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradeReportOrderDetailBlockT obj) {
		this.bean = obj; 
	}

}
