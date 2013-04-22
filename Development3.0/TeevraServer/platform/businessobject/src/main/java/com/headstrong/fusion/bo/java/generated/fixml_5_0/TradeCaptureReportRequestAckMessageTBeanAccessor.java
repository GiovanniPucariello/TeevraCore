package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TradeCaptureReportRequestAckMessageT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:36 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:36 IST 2010")
public class TradeCaptureReportRequestAckMessageTBeanAccessor implements BeanAccessor<TradeCaptureReportRequestAckMessageT> {
	
	private TradeCaptureReportRequestAckMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("firmTrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID();
		}
		else if("reqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getReqTyp();
		}
		else if("reqStat".equalsIgnoreCase(accessPath)){
			return this.bean.getReqStat();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumTrdRpts();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("rspTransportTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRspTransportTyp();
		}
		else if("reqID".equalsIgnoreCase(accessPath)){
			return this.bean.getReqID();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getFirmTrdID2();
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgEvtSrc();
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
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMLegRptTyp();
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			return this.bean.getReqRslt();
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			return this.bean.getRspDest();
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSubReqTyp();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
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
		else if("reqStat".equalsIgnoreCase(accessPath)){
			this.bean.setReqStat((Integer) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("totNumTrdRpts".equalsIgnoreCase(accessPath)){
			this.bean.setTotNumTrdRpts((Integer) obj);
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
		else if("reqID".equalsIgnoreCase(accessPath)){
			this.bean.setReqID((String) obj);
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
		else if("firmTrdID2".equalsIgnoreCase(accessPath)){
			this.bean.setFirmTrdID2((String) obj);
			return;
		}
		else if("msgEvtSrc".equalsIgnoreCase(accessPath)){
			this.bean.setMsgEvtSrc((String) obj);
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
		else if("mLegRptTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMLegRptTyp((String) obj);
			return;
		}
		else if("rspDest".equalsIgnoreCase(accessPath)){
			this.bean.setRspDest((String) obj);
			return;
		}
		else if("reqRslt".equalsIgnoreCase(accessPath)){
			this.bean.setReqRslt((String) obj);
			return;
		}
		else if("subReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSubReqTyp((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TradeCaptureReportRequestAckMessageT obj) {
		this.bean = obj; 
	}

}
