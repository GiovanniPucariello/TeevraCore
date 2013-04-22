package  com.headstrong.fusion.bo.java.generated.fixml_5_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import org.fixprotocol.fixml_5_0.UserResponseMessageT;
import org.fixprotocol.fixml_5_0.MessageHeaderT;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

//This file was generated on Wed Jan 20 15:18:38 IST 2010
@Generated(value = { "bo-accessor-generator" }, date="Wed Jan 20 15:18:38 IST 2010")
public class UserResponseMessageTBeanAccessor implements BeanAccessor<UserResponseMessageT> {
	
	private UserResponseMessageT bean;
	
	@Override
	public Object get(String accessPath) throws AttributeNotFoundException {
		 if("username".equalsIgnoreCase(accessPath)){
			return this.bean.getUsername();
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			return this.bean.getHdr();
		}
		else if("userStatText".equalsIgnoreCase(accessPath)){
			return this.bean.getUserStatText();
		}
		else if("userStat".equalsIgnoreCase(accessPath)){
			return this.bean.getUserStat();
		}
		else if("userReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getUserReqID();
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void set(String accessPath, Object obj)throws AttributeNotFoundException {
		 if("username".equalsIgnoreCase(accessPath)){
			this.bean.setUsername((String) obj);
			return;
		}
		else if("hdr".equalsIgnoreCase(accessPath)){
			this.bean.setHdr((MessageHeaderT) obj);
			return;
		}
		else if("userStatText".equalsIgnoreCase(accessPath)){
			this.bean.setUserStatText((String) obj);
			return;
		}
		else if("userStat".equalsIgnoreCase(accessPath)){
			this.bean.setUserStat((Integer) obj);
			return;
		}
		else if("userReqID".equalsIgnoreCase(accessPath)){
			this.bean.setUserReqID((String) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UserResponseMessageT obj) {
		this.bean = obj; 
	}

}
