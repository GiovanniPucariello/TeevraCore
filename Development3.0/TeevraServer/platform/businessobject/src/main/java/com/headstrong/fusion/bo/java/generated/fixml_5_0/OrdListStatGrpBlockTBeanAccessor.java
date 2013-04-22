package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.OrdListStatGrpBlockT;
import org.fixprotocol.fixml_5_0.WorkingIndicatorEnumT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class OrdListStatGrpBlockTBeanAccessor implements BeanAccessor<OrdListStatGrpBlockT> {
	
	private OrdListStatGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("workingInd".equalsIgnoreCase(accessPath)){
			return this.bean.getWorkingInd();
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			return this.bean.getAvgPx();
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsn();
		}
		else if("cxlQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCxlQty();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			return this.bean.getCumQty();
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			return this.bean.getLeavesQty();
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			return this.bean.getClOrdID2();
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			return this.bean.getOrdStat();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("encTxtLen".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			this.bean.setEncTxt((String) obj);
			return;
		}
		else if("workingInd".equalsIgnoreCase(accessPath)){
			this.bean.setWorkingInd(WorkingIndicatorEnumT.valueOf(obj.toString()));
			return;
		}
		else if("cumQty".equalsIgnoreCase(accessPath)){
			this.bean.setCumQty((BigDecimal) obj);
			return;
		}
		else if("clOrdID".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID((String) obj);
			return;
		}
		else if("leavesQty".equalsIgnoreCase(accessPath)){
			this.bean.setLeavesQty((BigDecimal) obj);
			return;
		}
		else if("cxlQty".equalsIgnoreCase(accessPath)){
			this.bean.setCxlQty((BigDecimal) obj);
			return;
		}
		else if("rejRsn".equalsIgnoreCase(accessPath)){
			this.bean.setRejRsn((String) obj);
			return;
		}
		else if("clOrdID2".equalsIgnoreCase(accessPath)){
			this.bean.setClOrdID2((String) obj);
			return;
		}
		else if("avgPx".equalsIgnoreCase(accessPath)){
			this.bean.setAvgPx((BigDecimal) obj);
			return;
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			this.bean.setTxt((String) obj);
			return;
		}
		else if("ordStat".equalsIgnoreCase(accessPath)){
			this.bean.setOrdStat((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(OrdListStatGrpBlockT obj) {
		this.bean = obj; 
	}

}
