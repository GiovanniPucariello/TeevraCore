package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.NewsRefGrpBlockT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
