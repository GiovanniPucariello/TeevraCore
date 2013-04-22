package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.StrmAsgnRptInstrmtGrpBlockT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.InstrumentBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:39 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:39 IST 2011")
public class StrmAsgnRptInstrmtGrpBlockTBeanAccessor implements BeanAccessor<StrmAsgnRptInstrmtGrpBlockT> {
	
	private StrmAsgnRptInstrmtGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("mDStrmID".equalsIgnoreCase(accessPath)){
			return this.bean.getMDStrmID();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("asgnTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getAsgnTyp();
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			return this.bean.getInstrmt();
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsn();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("mDStrmID".equalsIgnoreCase(accessPath)){
			 this.bean.setMDStrmID((String) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("asgnTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setAsgnTyp((BigInteger) obj);
			return;
		}
		else if("instrmt".equalsIgnoreCase(accessPath)){
			 this.bean.setInstrmt((InstrumentBlockT) obj);
			return;
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			 this.bean.setRejRsn((String) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			 this.bean.setTxt((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(StrmAsgnRptInstrmtGrpBlockT obj) {
		this.bean = obj; 
	}

}
