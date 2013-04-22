package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.AssignmentReportMessageT;
import org.fixprotocol.fixml_5_0.ExerciseMethodEnumT;
import org.fixprotocol.fixml_5_0.SettlSessIDEnumT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.InstrumentBlockT;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.MessageHeaderT;
import org.fixprotocol.fixml_5_0.AssignmentMethodEnumT;
import org.fixprotocol.fixml_5_0.LastRptRequestedEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class AssignmentReportMessageTBeanAccessor implements BeanAccessor<AssignmentReportMessageT> {
	
	private AssignmentReportMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("setSesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSesID();
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			return this.bean.getCcy();
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAcctTyp();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("totNumAsgnRpts".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNumAsgnRpts();
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			return this.bean.getAcct();
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			return this.bean.getRptID();
		}
		else if("undSetPx".equalsIgnoreCase(accessPath)){
			return this.bean.getUndSetPx();
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			return this.bean.getBizDt();
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			return this.bean.getLastRptReqed();
		}
		else if("priSetPx".equalsIgnoreCase(accessPath)){
			return this.bean.getPriSetPx();
		}
		else if("undly".equalsIgnoreCase(accessPath)){
			return this.bean.getUndly();
		}
		else if("exrMethod".equalsIgnoreCase(accessPath)){
			return this.bean.getExrMethod();
		}
		else if("setPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSetPxTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("setSubID".equalsIgnoreCase(accessPath)){
			return this.bean.getSetSubID();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnMeth();
		}
		else if("qty".equalsIgnoreCase(accessPath)){
			return this.bean.getQty();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("openInt".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenInt();
		}
		else if("thresholdAmt".equalsIgnoreCase(accessPath)){
			return this.bean.getThresholdAmt();
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			return this.bean.getExpireDt();
		}
		else if("leg".equalsIgnoreCase(accessPath)){
			return this.bean.getLeg();
		}
		else if("amt".equalsIgnoreCase(accessPath)){
			return this.bean.getAmt();
		}
		else if("unit".equalsIgnoreCase(accessPath)){
			return this.bean.getUnit();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("setPx".equalsIgnoreCase(accessPath)){
			return this.bean.getSetPx();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("setPxTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSetPxTyp((Integer) obj);
			return;
		}
		else if("setSesID".equalsIgnoreCase(accessPath)){
			this.bean.setSetSesID(SettlSessIDEnumT.valueOf(obj.toString()));
			return;
		}
		else if("ccy".equalsIgnoreCase(accessPath)){
			this.bean.setCcy((String) obj);
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
		else if("setSubID".equalsIgnoreCase(accessPath)){
			this.bean.setSetSubID((String) obj);
			return;
		}
		else if("asgnMeth".equalsIgnoreCase(accessPath)){
			this.bean.setAsgnMeth(AssignmentMethodEnumT.valueOf(obj.toString()));
			return;
		}
		else if("acctTyp".equalsIgnoreCase(accessPath)){
			this.bean.setAcctTyp((Integer) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("openInt".equalsIgnoreCase(accessPath)){
			this.bean.setOpenInt((BigDecimal) obj);
			return;
		}
		else if("expireDt".equalsIgnoreCase(accessPath)){
			this.bean.setExpireDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("thresholdAmt".equalsIgnoreCase(accessPath)){
			this.bean.setThresholdAmt((BigDecimal) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("totNumAsgnRpts".equalsIgnoreCase(accessPath)){
			this.bean.setTotNumAsgnRpts((Integer) obj);
			return;
		}
		else if("unit".equalsIgnoreCase(accessPath)){
			this.bean.setUnit((BigDecimal) obj);
			return;
		}
		else if("acct".equalsIgnoreCase(accessPath)){
			this.bean.setAcct((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("rptID".equalsIgnoreCase(accessPath)){
			this.bean.setRptID((String) obj);
			return;
		}
		else if("undSetPx".equalsIgnoreCase(accessPath)){
			this.bean.setUndSetPx((BigDecimal) obj);
			return;
		}
		else if("bizDt".equalsIgnoreCase(accessPath)){
			this.bean.setBizDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("lastRptReqed".equalsIgnoreCase(accessPath)){
			this.bean.setLastRptReqed(LastRptRequestedEnumT.valueOf(obj.toString()));
			return;
		}
		else if("priSetPx".equalsIgnoreCase(accessPath)){
			this.bean.setPriSetPx((BigDecimal) obj);
			return;
		}
		else if("exrMethod".equalsIgnoreCase(accessPath)){
			this.bean.setExrMethod(ExerciseMethodEnumT.valueOf(obj.toString()));
			return;
		}
		else if("setPx".equalsIgnoreCase(accessPath)){
			this.bean.setSetPx((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AssignmentReportMessageT obj) {
		this.bean = obj; 
	}

}
