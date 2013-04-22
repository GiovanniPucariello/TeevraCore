package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.LegStipulationsBlockT;
import com.headstrong.teevra_fixml_1_0.StipulationTypeEnumT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class LegStipulationsBlockTBeanAccessor implements BeanAccessor<LegStipulationsBlockT> {
	
	private LegStipulationsBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("stipVal".equalsIgnoreCase(accessPath)){
			return this.bean.getStipVal();
		}
		else if("stipTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getStipTyp();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("stipVal".equalsIgnoreCase(accessPath)){
			 this.bean.setStipVal((String) obj);
			return;
		}
		else if("stipTyp".equalsIgnoreCase(accessPath)){
			if(obj.toString().trim().equals("")){
				return;
			}
		    this.bean.setStipTyp(StipulationTypeEnumT.valueOf(obj.toString()));
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(LegStipulationsBlockT obj) {
		this.bean = obj; 
	}

}
