package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.CollateralResponseMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;
import com.headstrong.teevra_fixml_1_0.InstrumentBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import com.headstrong.teevra_fixml_1_0.SpreadOrBenchmarkCurveDataBlockT;
import com.headstrong.teevra_fixml_1_0.FinancingDetailsBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class CollateralResponseMessageTBeanAccessor implements BeanAccessor<CollateralResponseMessageT> {
	
	private CollateralResponseMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("asgnRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnRsn();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID2();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getAcrdIntAmt();
		}
		else if("trdColl".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdColl();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			return this.bean.getSprdBnchmkCurve();
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsn();
		}
		else if("respID".equalsIgnoreCase(accessPath)){
			return this.bean.getRespID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("cshOutstanding".equalsIgnoreCase(accessPath)){
			return this.bean.getCshOutstanding();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("undColl".equalsIgnoreCase(accessPath)){
			return this.bean.getUndColl();
		}
		else if("transTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTransTyp();
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getQtyTyp();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getEndCsh();
		}
		else if("mgnExcess".equalsIgnoreCase(accessPath)){
			return this.bean.getMgnExcess();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("stip".equalsIgnoreCase(accessPath)){
			return this.bean.getStip();
		}
		else if("trdRegTS".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdRegTS();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("totNetValu".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNetValu();
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			return this.bean.getStartCsh();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("applTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getApplTyp();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("miscFees".equalsIgnoreCase(accessPath)){
			return this.bean.getMiscFees();
		}
		else if("collExc".equalsIgnoreCase(accessPath)){
			return this.bean.getCollExc();
		}
		else if("respTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRespTyp();
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getEndAcrdIntAmt();
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			return this.bean.getFinclStat();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("asgnRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnRsn((BigInteger) obj);
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			 this.bean.setCcy((String) obj);
			return;
		}
		else if("ordID2".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID2((String) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID((String) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			 this.bean.setReqID((String) obj);
			return;
		}
		else if("acrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAcctTyp((BigInteger) obj);
			return;
		}
		else if("sprdBnchmkCurve".equalsIgnoreCase(accessPath)){
			 this.bean.setSprdBnchmkCurve((SpreadOrBenchmarkCurveDataBlockT) obj);
			return;
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setRejRsn((String) obj);
			return;
		}
		else if("respID".equalsIgnoreCase(accessPath)){
			 this.bean.setRespID((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		else if("cshOutstanding".equalsIgnoreCase(accessPath)){
			 this.bean.setCshOutstanding((BigDecimal) obj);
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
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
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
		else if("transTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setTransTyp((BigInteger) obj);
			return;
		}
		else if("qtyTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setQtyTyp((BigInteger) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			 this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("endCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setEndCsh((BigDecimal) obj);
			return;
		}
		else if("mgnExcess".equalsIgnoreCase(accessPath)){
			 this.bean.setMgnExcess((BigDecimal) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			 this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			 this.bean.setOrdID((String) obj);
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
		else if("totNetValu".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNetValu((BigDecimal) obj);
			return;
		}
		else if("startCsh".equalsIgnoreCase(accessPath)){
			 this.bean.setStartCsh((BigDecimal) obj);
			return;
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			 this.bean.setQty((BigDecimal) obj);
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
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("applTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setApplTyp((BigInteger) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("respTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRespTyp((BigInteger) obj);
			return;
		}
		else if("endAcrdIntAmt".equalsIgnoreCase(accessPath)){
			 this.bean.setEndAcrdIntAmt((BigDecimal) obj);
			return;
		}
		else if("finclStat".equalsIgnoreCase(accessPath)){
			 this.bean.setFinclStat((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(CollateralResponseMessageT obj) {
		this.bean = obj; 
	}

}
