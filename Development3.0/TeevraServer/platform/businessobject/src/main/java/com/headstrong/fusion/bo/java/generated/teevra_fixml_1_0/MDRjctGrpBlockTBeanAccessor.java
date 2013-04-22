package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.MDRjctGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class MDRjctGrpBlockTBeanAccessor implements BeanAccessor<MDRjctGrpBlockT> {
	
	private MDRjctGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("altMDSrcID".equalsIgnoreCase(accessPath)){
			return this.bean.getAltMDSrcID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("altMDSrcID".equalsIgnoreCase(accessPath)){
			 this.bean.setAltMDSrcID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(MDRjctGrpBlockT obj) {
		this.bean = obj; 
	}

}
