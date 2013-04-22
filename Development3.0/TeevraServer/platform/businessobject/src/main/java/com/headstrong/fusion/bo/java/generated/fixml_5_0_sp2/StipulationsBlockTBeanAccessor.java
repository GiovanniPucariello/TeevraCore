package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.StipulationsBlockT;
import org.fixprotocol.fixml_5_0_sp2.StipulationTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:49 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:49 IST 2011")
public class StipulationsBlockTBeanAccessor implements BeanAccessor<StipulationsBlockT> {
	
	private StipulationsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			return this.bean.getVal();
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			return this.bean.getTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("val".equalsIgnoreCase(accessPath)){
			 this.bean.setVal((String) obj);
			return;
		}
		else if("typ".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setTyp(StipulationTypeEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(StipulationsBlockT obj) {
		this.bean = obj; 
	}

}
