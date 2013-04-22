package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.TrdSessLstGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import org.fixprotocol.fixml_5_0.UnsolicitedIndicatorEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
public class TrdSessLstGrpBlockTBeanAccessor implements BeanAccessor<TrdSessLstGrpBlockT> {
	
	private TrdSessLstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			return this.bean.getEndTm();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("openTm".equalsIgnoreCase(accessPath)){
			return this.bean.getOpenTm();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			return this.bean.getMode();
		}
		else if("totVolTrdd".equalsIgnoreCase(accessPath)){
			return this.bean.getTotVolTrdd();
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			return this.bean.getUnsol();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			return this.bean.getStartTm();
		}
		else if("preClsTm".equalsIgnoreCase(accessPath)){
			return this.bean.getPreClsTm();
		}
		else if("clsTm".equalsIgnoreCase(accessPath)){
			return this.bean.getClsTm();
		}
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getStatRejRsn();
		}
		else if("method".equalsIgnoreCase(accessPath)){
			return this.bean.getMethod();
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			return this.bean.getExch();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("endTm".equalsIgnoreCase(accessPath)){
			this.bean.setEndTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			this.bean.setSesSub((String) obj);
			return;
		}
		else if("openTm".equalsIgnoreCase(accessPath)){
			this.bean.setOpenTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			this.bean.setStat((Integer) obj);
			return;
		}
		else if("mode".equalsIgnoreCase(accessPath)){
			this.bean.setMode((Integer) obj);
			return;
		}
		else if("totVolTrdd".equalsIgnoreCase(accessPath)){
			this.bean.setTotVolTrdd((BigDecimal) obj);
			return;
		}
		else if("unsol".equalsIgnoreCase(accessPath)){
			this.bean.setUnsol(UnsolicitedIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			this.bean.setSesID((String) obj);
			return;
		}
		else if("startTm".equalsIgnoreCase(accessPath)){
			this.bean.setStartTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("preClsTm".equalsIgnoreCase(accessPath)){
			this.bean.setPreClsTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("clsTm".equalsIgnoreCase(accessPath)){
			this.bean.setClsTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("statRejRsn".equalsIgnoreCase(accessPath)){
			this.bean.setStatRejRsn((String) obj);
			return;
		}
		else if("method".equalsIgnoreCase(accessPath)){
			this.bean.setMethod((Integer) obj);
			return;
		}
		else if("exch".equalsIgnoreCase(accessPath)){
			this.bean.setExch((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(TrdSessLstGrpBlockT obj) {
		this.bean = obj; 
	}

}
