package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.BidCompRspGrpBlockT;
import com.headstrong.teevra_fixml_1_0.CommissionDataBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class BidCompRspGrpBlockTBeanAccessor implements BeanAccessor<BidCompRspGrpBlockT> {
	
	private BidCompRspGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("comm".equalsIgnoreCase(accessPath)){
			return this.bean.getComm();
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxt();
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPxTyp();
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			return this.bean.getSesSub();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("txt".equalsIgnoreCase(accessPath)){
			return this.bean.getTxt();
		}
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlTyp();
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncTxtLen();
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			return this.bean.getSettlDt();
		}
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			return this.bean.getNetGrossInd();
		}
		else if("px".equalsIgnoreCase(accessPath)){
			return this.bean.getPx();
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			return this.bean.getSesID();
		}
		else if("side".equalsIgnoreCase(accessPath)){
			return this.bean.getSide();
		}
		else if("fairValu".equalsIgnoreCase(accessPath)){
			return this.bean.getFairValu();
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			return this.bean.getCtry();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("comm".equalsIgnoreCase(accessPath)){
			 this.bean.setComm((CommissionDataBlockT) obj);
			return;
		}
		else if("encTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxt((String) obj);
			return;
		}
		else if("pxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPxTyp((BigInteger) obj);
			return;
		}
		else if("sesSub".equalsIgnoreCase(accessPath)){
			 this.bean.setSesSub((String) obj);
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
		else if("settlTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlTyp((String) obj);
			return;
		}
		else if("encTxtLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncTxtLen((BigInteger) obj);
			return;
		}
		else if("settlDt".equalsIgnoreCase(accessPath)){
			 this.bean.setSettlDt((XMLGregorianCalendar) obj);
			return;
		}
		else if("netGrossInd".equalsIgnoreCase(accessPath)){
			 this.bean.setNetGrossInd((BigInteger) obj);
			return;
		}
		else if("sesID".equalsIgnoreCase(accessPath)){
			 this.bean.setSesID((String) obj);
			return;
		}
		else if("px".equalsIgnoreCase(accessPath)){
			 this.bean.setPx((BigDecimal) obj);
			return;
		}
		else if("side".equalsIgnoreCase(accessPath)){
			 this.bean.setSide((String) obj);
			return;
		}
		else if("fairValu".equalsIgnoreCase(accessPath)){
			 this.bean.setFairValu((BigDecimal) obj);
			return;
		}
		else if("ctry".equalsIgnoreCase(accessPath)){
			 this.bean.setCtry((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BidCompRspGrpBlockT obj) {
		this.bean = obj; 
	}

}
