package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.NewOrderListMessageT;
import org.fixprotocol.fixml_5_0_sp2.CancellationRightsEnumT;
import org.fixprotocol.fixml_5_0_sp2.MessageHeaderT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0_sp2.LastFragmentEnumT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:46 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:46 IST 2011")
public class NewOrderListMessageTBeanAccessor implements BeanAccessor<NewOrderListMessageT> {
	
	private NewOrderListMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cxllationRights".equalsIgnoreCase(accessPath)){
			return this.bean.getCxllationRights();
		}
		else if("encListExecInstLen".equalsIgnoreCase(accessPath)){
			return this.bean.getEncListExecInstLen();
		}
		else if("clBidID".equalsIgnoreCase(accessPath)){
			return this.bean.getClBidID();
		}
		else if("listExecInstTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getListExecInstTyp();
		}
		else if("bidTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getBidTyp();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("listExecInst".equalsIgnoreCase(accessPath)){
			return this.bean.getListExecInst();
		}
		else if("progRptReqs".equalsIgnoreCase(accessPath)){
			return this.bean.getProgRptReqs();
		}
		else if("ord".equalsIgnoreCase(accessPath)){
			return this.bean.getOrd();
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			return this.bean.getLastFragment();
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			return this.bean.getMnyLaunderingStat();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		else if("aOSValu".equalsIgnoreCase(accessPath)){
			return this.bean.getAOSValu();
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			return this.bean.getRegistID();
		}
		else if("contingencyType".equalsIgnoreCase(accessPath)){
			return this.bean.getContingencyType();
		}
		else if("aOSCurr".equalsIgnoreCase(accessPath)){
			return this.bean.getAOSCurr();
		}
		else if("aOSPct".equalsIgnoreCase(accessPath)){
			return this.bean.getAOSPct();
		}
		else if("encListExecInst".equalsIgnoreCase(accessPath)){
			return this.bean.getEncListExecInst();
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			return this.bean.getBidID();
		}
		else if("totNoOrds".equalsIgnoreCase(accessPath)){
			return this.bean.getTotNoOrds();
		}
		else if("progPeriodIntvl".equalsIgnoreCase(accessPath)){
			return this.bean.getProgPeriodIntvl();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cxllationRights".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setCxllationRights(CancellationRightsEnumT.valueOf(obj.toString()));
			return;
		}
		else if("encListExecInstLen".equalsIgnoreCase(accessPath)){
			 this.bean.setEncListExecInstLen((BigInteger) obj);
			return;
		}
		else if("clBidID".equalsIgnoreCase(accessPath)){
			 this.bean.setClBidID((String) obj);
			return;
		}
		else if("bidTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setBidTyp((BigInteger) obj);
			return;
		}
		else if("listExecInstTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setListExecInstTyp((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			 this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("listExecInst".equalsIgnoreCase(accessPath)){
			 this.bean.setListExecInst((String) obj);
			return;
		}
		else if("progRptReqs".equalsIgnoreCase(accessPath)){
			 this.bean.setProgRptReqs((BigInteger) obj);
			return;
		}
		else if("lastFragment".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setLastFragment(LastFragmentEnumT.valueOf(obj.toString()));
			return;
		}
		else if("mnyLaunderingStat".equalsIgnoreCase(accessPath)){
			 this.bean.setMnyLaunderingStat((String) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			 this.bean.setID((String) obj);
			return;
		}
		else if("aOSValu".equalsIgnoreCase(accessPath)){
			 this.bean.setAOSValu((BigDecimal) obj);
			return;
		}
		else if("registID".equalsIgnoreCase(accessPath)){
			 this.bean.setRegistID((String) obj);
			return;
		}
		else if("contingencyType".equalsIgnoreCase(accessPath)){
			 this.bean.setContingencyType((String) obj);
			return;
		}
		else if("aOSCurr".equalsIgnoreCase(accessPath)){
			 this.bean.setAOSCurr((String) obj);
			return;
		}
		else if("aOSPct".equalsIgnoreCase(accessPath)){
			 this.bean.setAOSPct((BigDecimal) obj);
			return;
		}
		else if("encListExecInst".equalsIgnoreCase(accessPath)){
			 this.bean.setEncListExecInst((String) obj);
			return;
		}
		else if("bidID".equalsIgnoreCase(accessPath)){
			 this.bean.setBidID((String) obj);
			return;
		}
		else if("totNoOrds".equalsIgnoreCase(accessPath)){
			 this.bean.setTotNoOrds((BigInteger) obj);
			return;
		}
		else if("progPeriodIntvl".equalsIgnoreCase(accessPath)){
			 this.bean.setProgPeriodIntvl((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NewOrderListMessageT obj) {
		this.bean = obj; 
	}

}
