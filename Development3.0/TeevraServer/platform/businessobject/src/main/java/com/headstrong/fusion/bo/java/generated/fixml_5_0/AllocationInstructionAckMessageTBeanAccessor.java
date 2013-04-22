package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.AllocationInstructionAckMessageT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import org.fixprotocol.fixml_5_0.SecurityTypeEnumT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:37 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:37 IST 2010")
public class AllocationInstructionAckMessageTBeanAccessor implements BeanAccessor<AllocationInstructionAckMessageT> {
	
	private AllocationInstructionAckMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("iD2".equalsIgnoreCase(accessPath)){
			return this.bean.getID2();
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
		else if("rejCode".equalsIgnoreCase(accessPath)){
			return this.bean.getRejCode();
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMtchStat();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("allocAck".equalsIgnoreCase(accessPath)){
			return this.bean.getAllocAck();
		}
		else if("stat".equalsIgnoreCase(accessPath)){
			return this.bean.getStat();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			return this.bean.getTxnTm();
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getImReqTyp();
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSecTyp();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			return this.bean.getProd();
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			return this.bean.getTrdDt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("iD2".equalsIgnoreCase(accessPath)){
			this.bean.setID2((String) obj);
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
		else if("rejCode".equalsIgnoreCase(accessPath)){
			this.bean.setRejCode((Integer) obj);
			return;
		}
		else if("mtchStat".equalsIgnoreCase(accessPath)){
			this.bean.setMtchStat((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			this.bean.setID((String) obj);
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
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("txnTm".equalsIgnoreCase(accessPath)){
			this.bean.setTxnTm((XMLGregorianCalendar) obj);
			return;
		}
		else if("imReqTyp".equalsIgnoreCase(accessPath)){
			this.bean.setImReqTyp((Integer) obj);
			return;
		}
		else if("secTyp".equalsIgnoreCase(accessPath)){
			this.bean.setSecTyp(SecurityTypeEnumT.valueOf(obj.toString()));
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			this.bean.setTyp((Integer) obj);
			return;
		}
		else if("trdDt".equalsIgnoreCase(accessPath)){
			this.bean.setTrdDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("prod".equalsIgnoreCase(accessPath)){
			this.bean.setProd((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(AllocationInstructionAckMessageT obj) {
		this.bean = obj; 
	}

}
