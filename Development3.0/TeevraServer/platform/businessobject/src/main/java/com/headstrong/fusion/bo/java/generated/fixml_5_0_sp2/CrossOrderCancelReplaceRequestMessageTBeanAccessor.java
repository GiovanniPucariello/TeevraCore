package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.CrossOrderCancelReplaceRequestMessageT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import org.fixprotocol.fixml_5_0_sp2.DiscretionInstructionsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0_sp2.DisplayInstructionBlockT;
import org.fixprotocol.fixml_5_0_sp2.ExDestinationIDSourceEnumT;
import org.fixprotocol.fixml_5_0_sp2.LocateReqdEnumT;
import org.fixprotocol.fixml_5_0_sp2.CancellationRightsEnumT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.YieldDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0_sp2.PegInstructionsBlockT;
import org.fixprotocol.fixml_5_0_sp2.SpreadOrBenchmarkCurveDataBlockT;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;
import org.fixprotocol.fixml_5_0_sp2.TriggeringInstructionBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class CrossOrderCancelReplaceRequestMessageTBeanAccessor implements BeanAccessor<CrossOrderCancelReplaceRequestMessageT> {
	
	private CrossOrderCancelReplaceRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxShow();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDiscInstr();
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			return this.bean.getYield();
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			return this.bean.getDesignation();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getTrgrInstr();
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			return this.bean.getRegistID();
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchInc();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			return this.bean.getTmInForce();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("priorty".equalsIgnoreCase(accessPath)){
			return this.bean.getPriorty();
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrigID();
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			return this.bean.getMxPxLvls();
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("hstCxID".equalsIgnoreCase(accessPath)){
			return this.bean.getHstCxID();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			return this.bean.getMinQty();
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxPrtScp();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategyParameters();
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			return this.bean.getStopPx();
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			return this.bean.getGTBkngInst();
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTransBkdTm();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPrevClsPx();
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			return this.bean.getCxllationRights();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getDsplyInstr();
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireTm();
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMnyLaunderingStat();
		}
		else if("iOIID".equalsIgnoreCase(accessPath)){
			return this.bean.getIOIID();
		}
		else if("locReqd".equalsIgnoreCase(accessPath)){
			return this.bean.getLocReqd();
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getExDestIDSrc();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategy();
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			return this.bean.getExDest();
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			return this.bean.getParticipationRt();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			return this.bean.getExecInst();
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getHandlInst();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("sideCrossMod".equalsIgnoreCase(accessPath)){
			return this.bean.getSideCrossMod();
		}
		else if("trdSes".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSes();
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			return this.bean.getPegInstr();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			return this.bean.getProcCode();
		}
		else if("strtPrmGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getStrtPrmGrp();
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxFloor();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("maxShow".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxShow((BigDecimal) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("discInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setDiscInstr((DiscretionInstructionsBlockT) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			 this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			 this.bean.setDesignation((String) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("trgrInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setTrgrInstr((TriggeringInstructionBlockT) obj);
			return;
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			 this.bean.setMtchInc((BigDecimal) obj);
			return;
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			 this.bean.setRegistID((String) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			 this.bean.setTmInForce((String) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("priorty".equalsIgnoreCase(accessPath)){
			 this.bean.setPriorty((BigInteger) obj);
			return;
		}
		else if("origID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrigID((String) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			 this.bean.setComplianceID((String) obj);
			return;
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			 this.bean.setMxPxLvls((BigInteger) obj);
			return;
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			 this.bean.setQID((String) obj);
			return;
		}
		else if("hstCxID".equalsIgnoreCase(accessPath)){
			 this.bean.setHstCxID((String) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			 this.bean.setEfctvTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("minQty".equalsIgnoreCase(accessPath)){
			 this.bean.setMinQty((BigDecimal) obj);
			return;
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxPrtScp((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			 this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategyParameters((String) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("stopPx".equalsIgnoreCase(accessPath)){
			 this.bean.setStopPx((BigDecimal) obj);
			return;
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			 this.bean.setGTBkngInst((BigInteger) obj);
			return;
		}
		else if("transBkdTm".equalsIgnoreCase(accessPath)){
			 this.bean.setTransBkdTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			 this.bean.setTyp((BigInteger) obj);
			return;
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			 this.bean.setPrevClsPx((BigDecimal) obj);
			return;
		}
		else if("cxllationRights".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCxllationRights(CancellationRightsEnumT.valueOf(obj.toString()));
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
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
		else if("iOIID".equalsIgnoreCase(accessPath)){
			 this.bean.setIOIID((String) obj);
			return;
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMnyLaunderingStat((String) obj);
			return;
		}
		else if("locReqd".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLocReqd(LocateReqdEnumT.valueOf(obj.toString()));
			return;
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setExDestIDSrc(ExDestinationIDSourceEnumT.valueOf(obj.toString()));
			return;
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			 this.bean.setExDest((String) obj);
			return;
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			 this.bean.setTgtStrategy((String) obj);
			return;
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			 this.bean.setParticipationRt((BigDecimal) obj);
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
		else if("handlInst".equalsIgnoreCase(accessPath)){
			 this.bean.setHandlInst((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			 this.bean.setPegInstr((PegInstructionsBlockT) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("procCode".equalsIgnoreCase(accessPath)){
			 this.bean.setProcCode((String) obj);
			return;
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			 this.bean.setMaxFloor((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CrossOrderCancelReplaceRequestMessageT obj) {
		this.bean = obj; 
	}

}
