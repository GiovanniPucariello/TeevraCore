package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.NewOrderCrossMessageT;
import org.fixprotocol.fixml_5_0.PegInstructionsBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.TriggeringInstructionBlockT;
import org.fixprotocol.fixml_5_0.YieldDataBlockT;
import org.fixprotocol.fixml_5_0.DisplayInstructionBlockT;
import org.fixprotocol.fixml_5_0.LocateReqdEnumT;
import org.fixprotocol.fixml_5_0.DiscretionInstructionsBlockT;
import org.fixprotocol.fixml_5_0.CancellationRightsEnumT;
import org.fixprotocol.fixml_5_0.ExDestinationIDSourceEnumT;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.SpreadOrBenchmarkCurveDataBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class NewOrderCrossMessageTBeanAccessor implements BeanAccessor<NewOrderCrossMessageT> {
	
	private NewOrderCrossMessageT bean;
	
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
		else if("strpPrmGrp".equalsIgnoreCase(accessPath)){
			return this.bean.getStrpPrmGrp();
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
		else if("complianceID".equalsIgnoreCase(accessPath)){
			return this.bean.getComplianceID();
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			return this.bean.getMxPxLvls();
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			return this.bean.getQID();
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdTyp();
		}
		else if("efctvTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEfctvTm();
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
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategyParameters();
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
		else if("exDest".equalsIgnoreCase(accessPath)){
			return this.bean.getExDest();
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			return this.bean.getTgtStrategy();
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			return this.bean.getParticipationRt();
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
		else if("rtPrtys".equalsIgnoreCase(accessPath)){
			return this.bean.getRtPrtys();
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			return this.bean.getMaxFloor();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cxllationRights".equalsIgnoreCase(accessPath)){
			this.bean.setCxllationRights(CancellationRightsEnumT.valueOf(obj.toString()));
			return;
		}
		else if("maxShow".equalsIgnoreCase(accessPath)){
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
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setPxTyp((Integer) obj);
			return;
		}
		else if("yield".equalsIgnoreCase(accessPath)){
			this.bean.setYield((YieldDataBlockT) obj);
			return;
		}
		else if("expireTm".equalsIgnoreCase(accessPath)){
			this.bean.setExpireTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("dsplyInstr".equalsIgnoreCase(accessPath)){
			this.bean.setDsplyInstr((DisplayInstructionBlockT) obj);
			return;
		}
		else if("designation".equalsIgnoreCase(accessPath)){
			this.bean.setDesignation((String) obj);
			return;
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			this.bean.setMnyLaunderingStat((String) obj);
			return;
		}
		else if("iOIID".equalsIgnoreCase(accessPath)){
			this.bean.setIOIID((String) obj);
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
		else if("registID".equalsIgnoreCase(accessPath)){
			this.bean.setRegistID((String) obj);
			return;
		}
		else if("mtchInc".equalsIgnoreCase(accessPath)){
			this.bean.setMtchInc((BigDecimal) obj);
			return;
		}
		else if("tmInForce".equalsIgnoreCase(accessPath)){
			this.bean.setTmInForce((String) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("locReqd".equalsIgnoreCase(accessPath)){
			this.bean.setLocReqd(LocateReqdEnumT.valueOf(obj.toString()));
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("exDestIDSrc".equalsIgnoreCase(accessPath)){
			this.bean.setExDestIDSrc(ExDestinationIDSourceEnumT.valueOf(obj.toString()));
			return;
		}
		else if("priorty".equalsIgnoreCase(accessPath)){
			this.bean.setPriorty((Integer) obj);
			return;
		}
		else if("complianceID".equalsIgnoreCase(accessPath)){
			this.bean.setComplianceID((String) obj);
			return;
		}
		else if("tgtStrategy".equalsIgnoreCase(accessPath)){
			this.bean.setTgtStrategy((String) obj);
			return;
		}
		else if("mxPxLvls".equalsIgnoreCase(accessPath)){
			this.bean.setMxPxLvls((Integer) obj);
			return;
		}
		else if("exDest".equalsIgnoreCase(accessPath)){
			this.bean.setExDest((String) obj);
			return;
		}
		else if("participationRt".equalsIgnoreCase(accessPath)){
			this.bean.setParticipationRt((BigDecimal) obj);
			return;
		}
		else if("qID".equalsIgnoreCase(accessPath)){
			this.bean.setQID((String) obj);
			return;
		}
		else if("execInst".equalsIgnoreCase(accessPath)){
			this.bean.setExecInst((String) obj);
			return;
		}
		else if("handlInst".equalsIgnoreCase(accessPath)){
			this.bean.setHandlInst((String) obj);
			return;
		}
		else if("ordTyp".equalsIgnoreCase(accessPath)){
			this.bean.setOrdTyp((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
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
		else if("pegInstr".equalsIgnoreCase(accessPath)){
			this.bean.setPegInstr((PegInstructionsBlockT) obj);
			return;
		}
		else if("pxPrtScp".equalsIgnoreCase(accessPath)){
			this.bean.setPxPrtScp((String) obj);
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
		else if("tgtStrategyParameters".equalsIgnoreCase(accessPath)){
			this.bean.setTgtStrategyParameters((String) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("gTBkngInst".equalsIgnoreCase(accessPath)){
			this.bean.setGTBkngInst((Integer) obj);
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
		else if("procCode".equalsIgnoreCase(accessPath)){
			this.bean.setProcCode((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((Integer) obj);
			return;
		}
		else if("maxFloor".equalsIgnoreCase(accessPath)){
			this.bean.setMaxFloor((BigDecimal) obj);
			return;
		}
		else if("prevClsPx".equalsIgnoreCase(accessPath)){
			this.bean.setPrevClsPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NewOrderCrossMessageT obj) {
		this.bean = obj; 
	}

}
