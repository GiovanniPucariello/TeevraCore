package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.metadata.Xref;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:19:00 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:19:00 IST 2010")
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
		else if("name".equalsIgnoreCase(accessPath)){
			return this.bean.getName();
		}
		else if("categoryAbbrev".equalsIgnoreCase(accessPath)){
			return this.bean.getCategoryAbbrev();
		}
		else if("stdAbbrev".equalsIgnoreCase(accessPath)){
			return this.bean.getStdAbbrev();
		}
		else if("datatype".equalsIgnoreCase(accessPath)){
			return this.bean.getDatatype();
		}
		else if("componentType".equalsIgnoreCase(accessPath)){
			return this.bean.getComponentType();
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
		else if("tag".equalsIgnoreCase(accessPath)){
			this.bean.setTag((BigInteger) obj);
			return;
		}
		else if("name".equalsIgnoreCase(accessPath)){
			this.bean.setName((String) obj);
			return;
		}
		else if("categoryAbbrev".equalsIgnoreCase(accessPath)){
			this.bean.setCategoryAbbrev((String) obj);
			return;
		}
		else if("stdAbbrev".equalsIgnoreCase(accessPath)){
			this.bean.setStdAbbrev((String) obj);
			return;
		}
		else if("datatype".equalsIgnoreCase(accessPath)){
			this.bean.setDatatype((String) obj);
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
