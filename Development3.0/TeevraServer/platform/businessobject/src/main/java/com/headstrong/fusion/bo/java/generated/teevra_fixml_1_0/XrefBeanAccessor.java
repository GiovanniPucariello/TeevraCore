package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.Xref;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

public class XrefBeanAccessor implements BeanAccessor<Xref> {
	
	private Xref bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("protocol".equalsIgnoreCase(accessPath)){
			return this.bean.getProtocol();
		}
		else if("category".equalsIgnoreCase(accessPath)){
			return this.bean.getCategory();
		}
		else if("tag".equalsIgnoreCase(accessPath)){
			return this.bean.getTag();
		}
		else if("categoryAbbrName".equalsIgnoreCase(accessPath)){
			return this.bean.getCategoryAbbrName();
		}
		else if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
		}
		else if("abbrName".equalsIgnoreCase(accessPath)){
			return this.bean.getAbbrName();
		}
		else if("usesEnumsFromTag".equalsIgnoreCase(accessPath)){
			return this.bean.getUsesEnumsFromTag();
		}
		else if("msgID".equalsIgnoreCase(accessPath)){
			return this.bean.getMsgID();
		}
		else if("type".equalsIgnoreCase(accessPath)){
			return this.bean.getType();
		}
		else if("componentType".equalsIgnoreCase(accessPath)){
			return this.bean.getComponentType();
		}
		else if("section".equalsIgnoreCase(accessPath)){
			return this.bean.getSection();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("category".equalsIgnoreCase(accessPath)){
			 this.bean.setCategory((String) obj);
			return;
		}
		else if("protocol".equalsIgnoreCase(accessPath)){
			 this.bean.setProtocol((String) obj);
			return;
		}
		else if("categoryAbbrName".equalsIgnoreCase(accessPath)){
			 this.bean.setCategoryAbbrName((String) obj);
			return;
		}
		else if("tag".equalsIgnoreCase(accessPath)){
			 this.bean.setTag((BigInteger) obj);
			return;
		}
		else if("name".equalsIgnoreCase(accessPath)){
			 this.bean.setName((String) obj);
			return;
		}
		else if("abbrName".equalsIgnoreCase(accessPath)){
			 this.bean.setAbbrName((String) obj);
			return;
		}
		else if("usesEnumsFromTag".equalsIgnoreCase(accessPath)){
			 this.bean.setUsesEnumsFromTag((String) obj);
			return;
		}
		else if("msgID".equalsIgnoreCase(accessPath)){
			 this.bean.setMsgID((BigInteger) obj);
			return;
		}
		else if("type".equalsIgnoreCase(accessPath)){
			 this.bean.setType((String) obj);
			return;
		}
		else if("section".equalsIgnoreCase(accessPath)){
			 this.bean.setSection((String) obj);
			return;
		}
		else if("componentType".equalsIgnoreCase(accessPath)){
			 this.bean.setComponentType((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(Xref obj) {
		this.bean = obj; 
	}

}
