package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RgstDtlsGrpBlockT;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:48 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:48 IST 2011")
public class RgstDtlsGrpBlockTBeanAccessor implements BeanAccessor<RgstDtlsGrpBlockT> {
	
	private RgstDtlsGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("mailingDtls".equalsIgnoreCase(accessPath)){
			return this.bean.getMailingDtls();
		}
		else if("dtOfBirth".equalsIgnoreCase(accessPath)){
			return this.bean.getDtOfBirth();
		}
		else if("email".equalsIgnoreCase(accessPath)){
			return this.bean.getEmail();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("ownerTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOwnerTyp();
		}
		else if("rejRsnTxt".equalsIgnoreCase(accessPath)){
			return this.bean.getRejRsnTxt();
		}
		else if("mailingInst".equalsIgnoreCase(accessPath)){
			return this.bean.getMailingInst();
		}
		else if("investorCtryOfResidence".equalsIgnoreCase(accessPath)){
			return this.bean.getInvestorCtryOfResidence();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("mailingDtls".equalsIgnoreCase(accessPath)){
			 this.bean.setMailingDtls((String) obj);
			return;
		}
		else if("dtOfBirth".equalsIgnoreCase(accessPath)){
			 this.bean.setDtOfBirth((XMLGregorianCalendar) obj);
			return;
		}
		else if("email".equalsIgnoreCase(accessPath)){
			 this.bean.setEmail((String) obj);
			return;
		}
		else if("ownerTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOwnerTyp((BigInteger) obj);
			return;
		}
		else if("rejRsnTxt".equalsIgnoreCase(accessPath)){
			 this.bean.setRejRsnTxt((String) obj);
			return;
		}
		else if("mailingInst".equalsIgnoreCase(accessPath)){
			 this.bean.setMailingInst((String) obj);
			return;
		}
		else if("investorCtryOfResidence".equalsIgnoreCase(accessPath)){
			 this.bean.setInvestorCtryOfResidence((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RgstDtlsGrpBlockT obj) {
		this.bean = obj; 
	}

}
