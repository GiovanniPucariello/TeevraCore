package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.PegInstructionsBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:41 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:41 IST 2010")
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
			this.bean.setPegPxTyp((Integer) obj);
			return;
		}
		else if("scope".equalsIgnoreCase(accessPath)){
			this.bean.setScope((Integer) obj);
			return;
		}
		else if("pegSecurityIDSource".equalsIgnoreCase(accessPath)){
			this.bean.setPegSecurityIDSource((String) obj);
			return;
		}
		else if("moveTyp".equalsIgnoreCase(accessPath)){
			this.bean.setMoveTyp((Integer) obj);
			return;
		}
		else if("pegSecID".equalsIgnoreCase(accessPath)){
			this.bean.setPegSecID((String) obj);
			return;
		}
		else if("rndDir".equalsIgnoreCase(accessPath)){
			this.bean.setRndDir((Integer) obj);
			return;
		}
		else if("ofstTyp".equalsIgnoreCase(accessPath)){
			this.bean.setOfstTyp((Integer) obj);
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
			this.bean.setLmtTyp((Integer) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(PegInstructionsBlockT obj) {
		this.bean = obj; 
	}

}
