package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.RgstDistInstGrpBlockT;
import java.math.BigDecimal;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:38 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:38 IST 2011")
public class RgstDistInstGrpBlockTBeanAccessor implements BeanAccessor<RgstDistInstGrpBlockT> {
	
	private RgstDistInstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("cshDistribAgentName".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribAgentName();
		}
		else if("cshDistribAgentCode".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribAgentCode();
		}
		else if("cshDistribPayRef".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribPayRef();
		}
		else if("cshDistribAgentAcctName".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribAgentAcctName();
		}
		else if("cshDistribCurr".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribCurr();
		}
		else if("distribPctage".equalsIgnoreCase(accessPath)){
			return this.bean.getDistribPctage();
		}
		else if("cshDistribAgentAcctNum".equalsIgnoreCase(accessPath)){
			return this.bean.getCshDistribAgentAcctNum();
		}
		else if("distribPmtMethod".equalsIgnoreCase(accessPath)){
			return this.bean.getDistribPmtMethod();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("cshDistribAgentName".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribAgentName((String) obj);
			return;
		}
		else if("cshDistribAgentCode".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribAgentCode((String) obj);
			return;
		}
		else if("cshDistribPayRef".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribPayRef((String) obj);
			return;
		}
		else if("cshDistribAgentAcctName".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribAgentAcctName((String) obj);
			return;
		}
		else if("cshDistribCurr".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribCurr((String) obj);
			return;
		}
		else if("distribPctage".equalsIgnoreCase(accessPath)){
			 this.bean.setDistribPctage((BigDecimal) obj);
			return;
		}
		else if("cshDistribAgentAcctNum".equalsIgnoreCase(accessPath)){
			 this.bean.setCshDistribAgentAcctNum((String) obj);
			return;
		}
		else if("distribPmtMethod".equalsIgnoreCase(accessPath)){
			 this.bean.setDistribPmtMethod((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(RgstDistInstGrpBlockT obj) {
		this.bean = obj; 
	}

}
