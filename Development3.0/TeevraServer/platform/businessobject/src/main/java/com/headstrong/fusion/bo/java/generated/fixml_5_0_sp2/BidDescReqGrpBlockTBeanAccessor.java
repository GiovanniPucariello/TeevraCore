package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.BidDescReqGrpBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:43 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:43 IST 2011")
public class BidDescReqGrpBlockTBeanAccessor implements BeanAccessor<BidDescReqGrpBlockT> {
	
	private BidDescReqGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("valuOfFuts".equalsIgnoreCase(accessPath)){
			return this.bean.getValuOfFuts();
		}
		else if("eFPTrkngErr".equalsIgnoreCase(accessPath)){
			return this.bean.getEFPTrkngErr();
		}
		else if("lqdtyNumSecurities".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyNumSecurities();
		}
		else if("lqdtyPctHigh".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyPctHigh();
		}
		else if("outsideNdxPct".equalsIgnoreCase(accessPath)){
			return this.bean.getOutsideNdxPct();
		}
		else if("lqdtyValu".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyValu();
		}
		else if("sideValuInd".equalsIgnoreCase(accessPath)){
			return this.bean.getSideValuInd();
		}
		else if("bidDescptrTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBidDescptrTyp();
		}
		else if("lqdtyPctLow".equalsIgnoreCase(accessPath)){
			return this.bean.getLqdtyPctLow();
		}
		else if("bidDescptr".equalsIgnoreCase(accessPath)){
			return this.bean.getBidDescptr();
		}
		else if("fairValu".equalsIgnoreCase(accessPath)){
			return this.bean.getFairValu();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("valuOfFuts".equalsIgnoreCase(accessPath)){
			 this.bean.setValuOfFuts((BigDecimal) obj);
			return;
		}
		else if("eFPTrkngErr".equalsIgnoreCase(accessPath)){
			 this.bean.setEFPTrkngErr((BigDecimal) obj);
			return;
		}
		else if("lqdtyNumSecurities".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyNumSecurities((BigInteger) obj);
			return;
		}
		else if("lqdtyPctHigh".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyPctHigh((BigDecimal) obj);
			return;
		}
		else if("outsideNdxPct".equalsIgnoreCase(accessPath)){
			 this.bean.setOutsideNdxPct((BigDecimal) obj);
			return;
		}
		else if("lqdtyValu".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyValu((BigDecimal) obj);
			return;
		}
		else if("sideValuInd".equalsIgnoreCase(accessPath)){
			 this.bean.setSideValuInd((BigInteger) obj);
			return;
		}
		else if("bidDescptrTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBidDescptrTyp((BigInteger) obj);
			return;
		}
		else if("lqdtyPctLow".equalsIgnoreCase(accessPath)){
			 this.bean.setLqdtyPctLow((BigDecimal) obj);
			return;
		}
		else if("bidDescptr".equalsIgnoreCase(accessPath)){
			 this.bean.setBidDescptr((String) obj);
			return;
		}
		else if("fairValu".equalsIgnoreCase(accessPath)){
			 this.bean.setFairValu((BigDecimal) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BidDescReqGrpBlockT obj) {
		this.bean = obj; 
	}

}
