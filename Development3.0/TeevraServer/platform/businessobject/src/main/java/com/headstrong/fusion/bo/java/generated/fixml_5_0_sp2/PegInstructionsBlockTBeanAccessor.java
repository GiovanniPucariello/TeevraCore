package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.PegInstructionsBlockT;
import java.math.BigInteger;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class PegInstructionsBlockTBeanAccessor implements BeanAccessor<PegInstructionsBlockT> {
	
	private PegInstructionsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("pegSecDesc".equalsIgnoreCase(accessPath)){
			return this.bean.getPegSecDesc();
		}
		else if("pegPxTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getPegPxTyp();
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			return this.bean.getScope();
		}
		else if("pegSecurityIDSource".equalsIgnoreCase(accessPath)){
			return this.bean.getPegSecurityIDSource();
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getMoveTyp();
		}
		else if("pegSecID".equalsIgnoreCase(accessPath)){
			return this.bean.getPegSecID();
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			return this.bean.getRndDir();
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getOfstTyp();
		}
		else if("pgSymbl".equalsIgnoreCase(accessPath)){
			return this.bean.getPgSymbl();
		}
		else if("ofstVal".equalsIgnoreCase(accessPath)){
			return this.bean.getOfstVal();
		}
		else if("lmtTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getLmtTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("pegSecDesc".equalsIgnoreCase(accessPath)){
			 this.bean.setPegSecDesc((String) obj);
			return;
		}
		else if("pegPxTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setPegPxTyp((BigInteger) obj);
			return;
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			 this.bean.setScope((BigInteger) obj);
			return;
		}
		else if("pegSecurityIDSource".equalsIgnoreCase(accessPath)){
			 this.bean.setPegSecurityIDSource((String) obj);
			return;
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setMoveTyp((BigInteger) obj);
			return;
		}
		else if("pegSecID".equalsIgnoreCase(accessPath)){
			 this.bean.setPegSecID((String) obj);
			return;
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			 this.bean.setRndDir((BigInteger) obj);
			return;
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setOfstTyp((BigInteger) obj);
			return;
		}
		else if("pgSymbl".equalsIgnoreCase(accessPath)){
			 this.bean.setPgSymbl((String) obj);
			return;
		}
		else if("ofstVal".equalsIgnoreCase(accessPath)){
			 this.bean.setOfstVal((BigDecimal) obj);
			return;
		}
		else if("lmtTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setLmtTyp((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PegInstructionsBlockT obj) {
		this.bean = obj; 
	}

}
