package  com.headstrong.fusion.bo.java.generated.fixml_5_0_sp2;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0_sp2.NewsRefGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Fri Feb 25 20:32:44 IST 2011
@Generated(value = { "bo-accessor-generator" }, date="Fri Feb 25 20:32:44 IST 2011")
public class NewsRefGrpBlockTBeanAccessor implements BeanAccessor<NewsRefGrpBlockT> {
	
	private NewsRefGrpBlockT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("refTyp".equalsIgnoreCase(accessPath)){
			return this.bean.getRefTyp();
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			return this.bean.getRefID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("refTyp".equalsIgnoreCase(accessPath)){
			 this.bean.setRefTyp((String) obj);
			return;
		}
		else if("refID".equalsIgnoreCase(accessPath)){
			 this.bean.setRefID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(NewsRefGrpBlockT obj) {
		this.bean = obj; 
	}

}
