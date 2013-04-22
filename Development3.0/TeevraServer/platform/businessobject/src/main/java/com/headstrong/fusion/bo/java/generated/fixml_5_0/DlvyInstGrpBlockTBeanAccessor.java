package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.DlvyInstGrpBlockT;
import org.fixprotocol.fixml_5_0.DlvyInstTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:40 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:40 IST 2010")
public class DlvyInstGrpBlockTBeanAccessor implements BeanAccessor<DlvyInstGrpBlockT> {
	
	private DlvyInstGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("instSrc".equalsIgnoreCase(accessPath)){
			return this.bean.getInstSrc();
		}
		else if("pty".equalsIgnoreCase(accessPath)){
			return this.bean.getPty();
		}
		else if("instTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getInstTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("instSrc".equalsIgnoreCase(accessPath)){
			this.bean.setInstSrc((String) obj);
			return;
		}
		else if("instTyp".equalsIgnoreCase(accessPath)){
			this.bean.setInstTyp(DlvyInstTypeEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(DlvyInstGrpBlockT obj) {
		this.bean = obj; 
	}

}
