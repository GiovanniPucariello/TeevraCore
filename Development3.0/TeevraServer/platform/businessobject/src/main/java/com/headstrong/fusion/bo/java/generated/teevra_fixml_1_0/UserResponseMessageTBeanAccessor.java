package  com.headstrong.fusion.bo.java.generated.teevra_fixml_1_0;

import javax.annotation.Generated;

import com.headstrong.fusion.bo.java.BeanAccessor;
import com.headstrong.teevra_fixml_1_0.UserResponseMessageT;
import com.headstrong.teevra_fixml_1_0.MessageHeaderT;
import java.math.BigInteger;

import com.headstrong.fusion.bo.impl.exception.AttributeNotFoundException;
import com.headstrong.fusion.bo.java.JavaBusinessObject;

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
		else if("userReqID".equalsIgnoreCase(accessPath)){
			return this.bean.getUserReqID();
		}
		else if("userStat".equalsIgnoreCase(accessPath)){
			return this.bean.getUserStat();
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
		else if("userReqID".equalsIgnoreCase(accessPath)){
			 this.bean.setUserReqID((String) obj);
			return;
		}
		else if("userStat".equalsIgnoreCase(accessPath)){
			 this.bean.setUserStat((BigInteger) obj);
			return;
		}
		throw new AttributeNotFoundException(accessPath, new JavaBusinessObject(bean));
	}

	@Override
	public void setTarget(UserResponseMessageT obj) {
		this.bean = obj; 
	}

}
