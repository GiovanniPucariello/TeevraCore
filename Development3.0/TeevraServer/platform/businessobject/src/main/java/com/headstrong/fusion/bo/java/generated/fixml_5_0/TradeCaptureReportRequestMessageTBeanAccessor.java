package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TradeCaptureReportRequestMessageT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.InstrumentExtensionBlockT;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.FinancingDetailsBlockT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class TradeCaptureReportRequestMessageTBeanAccessor implements BeanAccessor<TradeCaptureReportRequestMessageT> {
	
	private TradeCaptureReportRequestMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTyp();
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdSubTyp();
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInptSrc();
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID2();
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getExecTyp();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			return this.bean.getInptDev();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			return this.bean.getLinkID();
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdHandlInst();
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			return this.bean.getFinDetls();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("execID".equalsIgnoreCase(accessPath)){
			return this.bean.getExecID();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			return this.bean.getTmBkt();
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			return this.bean.getRspDest();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdTyp2();
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchID();
		}
		else if("ordID".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdID();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspTransportTyp();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmtExt();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID2();
		}
		else if("trdCapDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdCapDt();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdID2();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("trnsfrRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getTrnsfrRsn();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("firmTrdID".equalsIgnoreCase(accessPath)){
			this.bean.setFirmTrdID((String) obj);
			return;
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setReqTyp((Integer) obj);
			return;
		}
		else if("trdSubTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTrdSubTyp((Integer) obj);
			return;
		}
		else if("inptSrc".equalsIgnoreCase(accessPath)){
			this.bean.setInptSrc((String) obj);
			return;
		}
		else if("trdTyp".equalsIgnoreCase(accessPath)){
			this.bean.setTrdTyp((Integer) obj);
			return;
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID((String) obj);
			return;
		}
		else if("rptID2".equalsIgnoreCase(accessPath)){
			this.bean.setRptID2((String) obj);
			return;
		}
		else if("execTyp".equalsIgnoreCase(accessPath)){
			this.bean.setExecTyp((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("inptDev".equalsIgnoreCase(accessPath)){
			this.bean.setInptDev((String) obj);
			return;
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			this.bean.setMsgEvtSrc((String) obj);
			return;
		}
		else if("linkID".equalsIgnoreCase(accessPath)){
			this.bean.setLinkID((String) obj);
			return;
		}
		else if("trdHandlInst".equalsIgnoreCase(accessPath)){
			this.bean.setTrdHandlInst((String) obj);
			return;
		}
		else if("finDetls".equalsIgnoreCase(accessPath)){
			this.bean.setFinDetls((FinancingDetailsBlockT) obj);
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
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((String) obj);
			return;
		}
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMLegRptTyp((String) obj);
			return;
		}
		else if("tmBkt".equalsIgnoreCase(accessPath)){
			this.bean.setTmBkt((String) obj);
			return;
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			this.bean.setRspDest((String) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("trdTyp2".equalsIgnoreCase(accessPath)){
			this.bean.setTrdTyp2((Integer) obj);
			return;
		}
		else if("mtchID".equalsIgnoreCase(accessPath)){
			this.bean.setMtchID((String) obj);
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
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			this.bean.setRspTransportTyp((Integer) obj);
			return;
		}
		else if("instrmtExt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmtExt((InstrumentExtensionBlockT) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			this.bean.setSesSub((String) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			this.bean.setMtchStat((String) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			this.bean.setFirmTrdID2((String) obj);
			return;
		}
		else if("trdID".equalsIgnoreCase(accessPath)){
			this.bean.setTrdID((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("trdID2".equalsIgnoreCase(accessPath)){
			this.bean.setTrdID2((String) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSubReqTyp((String) obj);
			return;
		}
		else if("trnsfrRsn".equalsIgnoreCase(accessPath)){
			this.bean.setTrnsfrRsn((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradeCaptureReportRequestMessageT obj) {
		this.bean = obj; 
	}

}
