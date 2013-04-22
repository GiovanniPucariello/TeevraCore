package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.BatchT;
import java.math.BigInteger;
import org.fixprotocol.fixml_5_0.BatchHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:38 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:38 IST 2010")
public class BatchTBeanAccessor implements BeanAccessor<BatchT> {
	
	private BatchT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("message".equalsIgnoreCase(accessPath)){
			return this.bean.getMessage();
		}
		else if("totMsg".equalsIgnoreCase(accessPath)){
			return this.bean.getTotMsg();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			return this.bean.getID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("totMsg".equalsIgnoreCase(accessPath)){
			this.bean.setTotMsg((BigInteger) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((BatchHeaderT) obj);
			return;
		}
		else if("iD".equalsIgnoreCase(accessPath)){
			this.bean.setID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(BatchT obj) {
		this.bean = obj; 
	}

}
